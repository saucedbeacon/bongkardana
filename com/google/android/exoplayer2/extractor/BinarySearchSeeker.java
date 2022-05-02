package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class BinarySearchSeeker {
    private static final long MAX_SKIP_BYTES = 262144;
    private final int minimumSearchRange;
    protected final BinarySearchSeekMap seekMap;
    @Nullable
    protected SeekOperationParams seekOperationParams;
    protected final TimestampSeeker timestampSeeker;

    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        public final long timeUsToTargetTime(long j) {
            return j;
        }
    }

    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j);
    }

    public interface TimestampSeeker {
        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j, OutputFrameHolder outputFrameHolder) throws IOException, InterruptedException;
    }

    /* access modifiers changed from: protected */
    public void onSeekOperationFinished(boolean z, long j) {
    }

    public static final class OutputFrameHolder {
        public ByteBuffer byteBuffer;
        public long timeUs = 0;

        public OutputFrameHolder(ByteBuffer byteBuffer2) {
            this.byteBuffer = byteBuffer2;
        }
    }

    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker2, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.timestampSeeker = timestampSeeker2;
        this.minimumSearchRange = i;
        this.seekMap = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5, j6);
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public final void setSeekTargetUs(long j) {
        SeekOperationParams seekOperationParams2 = this.seekOperationParams;
        if (seekOperationParams2 == null || seekOperationParams2.getSeekTimeUs() != j) {
            this.seekOperationParams = createSeekParamsForTargetTimeUs(j);
        }
    }

    public final boolean isSeeking() {
        return this.seekOperationParams != null;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder, OutputFrameHolder outputFrameHolder) throws InterruptedException, IOException {
        TimestampSeeker timestampSeeker2 = (TimestampSeeker) Assertions.checkNotNull(this.timestampSeeker);
        while (true) {
            SeekOperationParams seekOperationParams2 = (SeekOperationParams) Assertions.checkNotNull(this.seekOperationParams);
            long access$100 = seekOperationParams2.getFloorBytePosition();
            long access$200 = seekOperationParams2.getCeilingBytePosition();
            long access$300 = seekOperationParams2.getNextSearchBytePosition();
            if (access$200 - access$100 <= ((long) this.minimumSearchRange)) {
                markSeekOperationFinished(false, access$100);
                return seekToPosition(extractorInput, access$100, positionHolder);
            } else if (!skipInputUntilPosition(extractorInput, access$300)) {
                return seekToPosition(extractorInput, access$300, positionHolder);
            } else {
                extractorInput.resetPeekPosition();
                TimestampSearchResult searchForTimestamp = timestampSeeker2.searchForTimestamp(extractorInput, seekOperationParams2.getTargetTimePosition(), outputFrameHolder);
                int access$500 = searchForTimestamp.result;
                if (access$500 == -3) {
                    markSeekOperationFinished(false, access$300);
                    return seekToPosition(extractorInput, access$300, positionHolder);
                } else if (access$500 == -2) {
                    seekOperationParams2.updateSeekFloor(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
                } else if (access$500 == -1) {
                    seekOperationParams2.updateSeekCeiling(searchForTimestamp.timestampToUpdate, searchForTimestamp.bytePositionToUpdate);
                } else if (access$500 == 0) {
                    markSeekOperationFinished(true, searchForTimestamp.bytePositionToUpdate);
                    skipInputUntilPosition(extractorInput, searchForTimestamp.bytePositionToUpdate);
                    return seekToPosition(extractorInput, searchForTimestamp.bytePositionToUpdate, positionHolder);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public SeekOperationParams createSeekParamsForTargetTimeUs(long j) {
        long j2 = j;
        return new SeekOperationParams(j2, this.seekMap.timeUsToTargetTime(j2), this.seekMap.floorTimePosition, this.seekMap.ceilingTimePosition, this.seekMap.floorBytePosition, this.seekMap.ceilingBytePosition, this.seekMap.approxBytesPerFrame);
    }

    /* access modifiers changed from: protected */
    public final void markSeekOperationFinished(boolean z, long j) {
        this.seekOperationParams = null;
        onSeekOperationFinished(z, j);
    }

    /* access modifiers changed from: protected */
    public final boolean skipInputUntilPosition(ExtractorInput extractorInput, long j) throws IOException, InterruptedException {
        long position = j - extractorInput.getPosition();
        if (position < 0 || position > MAX_SKIP_BYTES) {
            return false;
        }
        extractorInput.skipFully((int) position);
        return true;
    }

    /* access modifiers changed from: protected */
    public final int seekToPosition(ExtractorInput extractorInput, long j, PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j;
        return 1;
    }

    protected static class SeekOperationParams {
        private final long approxBytesPerFrame;
        private long ceilingBytePosition;
        private long ceilingTimePosition;
        private long floorBytePosition;
        private long floorTimePosition;
        private long nextSearchBytePosition;
        private final long seekTimeUs;
        private final long targetTimePosition;

        protected static long calculateNextSearchBytePosition(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return Util.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        protected SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.seekTimeUs = j;
            this.targetTimePosition = j2;
            this.floorTimePosition = j3;
            this.ceilingTimePosition = j4;
            this.floorBytePosition = j5;
            this.ceilingBytePosition = j6;
            this.approxBytesPerFrame = j7;
            this.nextSearchBytePosition = calculateNextSearchBytePosition(j2, j3, j4, j5, j6, j7);
        }

        /* access modifiers changed from: private */
        public long getFloorBytePosition() {
            return this.floorBytePosition;
        }

        /* access modifiers changed from: private */
        public long getCeilingBytePosition() {
            return this.ceilingBytePosition;
        }

        /* access modifiers changed from: private */
        public long getTargetTimePosition() {
            return this.targetTimePosition;
        }

        /* access modifiers changed from: private */
        public long getSeekTimeUs() {
            return this.seekTimeUs;
        }

        /* access modifiers changed from: private */
        public void updateSeekFloor(long j, long j2) {
            this.floorTimePosition = j;
            this.floorBytePosition = j2;
            updateNextSearchBytePosition();
        }

        /* access modifiers changed from: private */
        public void updateSeekCeiling(long j, long j2) {
            this.ceilingTimePosition = j;
            this.ceilingBytePosition = j2;
            updateNextSearchBytePosition();
        }

        /* access modifiers changed from: private */
        public long getNextSearchBytePosition() {
            return this.nextSearchBytePosition;
        }

        private void updateNextSearchBytePosition() {
            this.nextSearchBytePosition = calculateNextSearchBytePosition(this.targetTimePosition, this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame);
        }
    }

    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, C.TIME_UNSET, -1);
        public static final int RESULT_NO_TIMESTAMP = -3;
        public static final int RESULT_POSITION_OVERESTIMATED = -1;
        public static final int RESULT_POSITION_UNDERESTIMATED = -2;
        public static final int RESULT_TARGET_TIMESTAMP_FOUND = 0;
        /* access modifiers changed from: private */
        public final long bytePositionToUpdate;
        /* access modifiers changed from: private */
        public final int result;
        /* access modifiers changed from: private */
        public final long timestampToUpdate;

        private TimestampSearchResult(int i, long j, long j2) {
            this.result = i;
            this.timestampToUpdate = j;
            this.bytePositionToUpdate = j2;
        }

        public static TimestampSearchResult overestimatedResult(long j, long j2) {
            return new TimestampSearchResult(-1, j, j2);
        }

        public static TimestampSearchResult underestimatedResult(long j, long j2) {
            return new TimestampSearchResult(-2, j, j2);
        }

        public static TimestampSearchResult targetFoundResult(long j) {
            return new TimestampSearchResult(0, C.TIME_UNSET, j);
        }
    }

    public static class BinarySearchSeekMap implements SeekMap {
        /* access modifiers changed from: private */
        public final long approxBytesPerFrame;
        /* access modifiers changed from: private */
        public final long ceilingBytePosition;
        /* access modifiers changed from: private */
        public final long ceilingTimePosition;
        private final long durationUs;
        /* access modifiers changed from: private */
        public final long floorBytePosition;
        /* access modifiers changed from: private */
        public final long floorTimePosition;
        private final SeekTimestampConverter seekTimestampConverter;

        public boolean isSeekable() {
            return true;
        }

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter2, long j, long j2, long j3, long j4, long j5, long j6) {
            this.seekTimestampConverter = seekTimestampConverter2;
            this.durationUs = j;
            this.floorTimePosition = j2;
            this.ceilingTimePosition = j3;
            this.floorBytePosition = j4;
            this.ceilingBytePosition = j5;
            this.approxBytesPerFrame = j6;
        }

        public SeekMap.SeekPoints getSeekPoints(long j) {
            return new SeekMap.SeekPoints(new SeekPoint(j, SeekOperationParams.calculateNextSearchBytePosition(this.seekTimestampConverter.timeUsToTargetTime(j), this.floorTimePosition, this.ceilingTimePosition, this.floorBytePosition, this.ceilingBytePosition, this.approxBytesPerFrame)));
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long timeUsToTargetTime(long j) {
            return this.seekTimestampConverter.timeUsToTargetTime(j);
        }
    }
}
