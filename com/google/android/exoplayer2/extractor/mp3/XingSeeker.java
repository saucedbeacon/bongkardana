package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

final class XingSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "XingSeeker";
    private final long dataSize;
    private final long dataStartPosition;
    private final long durationUs;
    @Nullable
    private final long[] tableOfContents;
    private final int xingFrameSize;

    @Nullable
    public static XingSeeker create(long j, long j2, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int readUnsignedIntToInt;
        long j3 = j;
        MpegAudioHeader mpegAudioHeader2 = mpegAudioHeader;
        int i = mpegAudioHeader2.samplesPerFrame;
        int i2 = mpegAudioHeader2.sampleRate;
        int readInt = parsableByteArray.readInt();
        if ((readInt & 1) != 1 || (readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt()) == 0) {
            return null;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp((long) readUnsignedIntToInt, ((long) i) * 1000000, (long) i2);
        if ((readInt & 6) != 6) {
            return new XingSeeker(j2, mpegAudioHeader2.frameSize, scaleLargeTimestamp);
        }
        long readUnsignedIntToInt2 = (long) parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = (long) parsableByteArray.readUnsignedByte();
        }
        if (j3 != -1) {
            long j4 = j2 + readUnsignedIntToInt2;
            if (j3 != j4) {
                StringBuilder sb = new StringBuilder("XING data size mismatch: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(j4);
                Log.w(TAG, sb.toString());
            }
        }
        return new XingSeeker(j2, mpegAudioHeader2.frameSize, scaleLargeTimestamp, readUnsignedIntToInt2, jArr);
    }

    private XingSeeker(long j, int i, long j2) {
        this(j, i, j2, -1, (long[]) null);
    }

    private XingSeeker(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.dataStartPosition = j;
        this.xingFrameSize = i;
        this.durationUs = j2;
        this.dataSize = j3;
        this.tableOfContents = jArr;
    }

    public final boolean isSeekable() {
        return this.tableOfContents != null;
    }

    public final SeekMap.SeekPoints getSeekPoints(long j) {
        double d;
        if (!isSeekable()) {
            return new SeekMap.SeekPoints(new SeekPoint(0, this.dataStartPosition + ((long) this.xingFrameSize)));
        }
        long constrainValue = Util.constrainValue(j, 0, this.durationUs);
        double d2 = (double) constrainValue;
        Double.isNaN(d2);
        double d3 = (double) this.durationUs;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i = (int) d4;
                long[] jArr = (long[]) Assertions.checkNotNull(this.tableOfContents);
                double d6 = (double) jArr[i];
                if (i == 99) {
                    d = 256.0d;
                } else {
                    d = (double) jArr[i + 1];
                }
                double d7 = (double) i;
                Double.isNaN(d7);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d7) * (d - d6));
            }
        }
        double d8 = (double) this.dataSize;
        Double.isNaN(d8);
        return new SeekMap.SeekPoints(new SeekPoint(constrainValue, this.dataStartPosition + Util.constrainValue(Math.round((d5 / 256.0d) * d8), (long) this.xingFrameSize, this.dataSize - 1)));
    }

    public final long getTimeUs(long j) {
        long j2;
        double d;
        long j3 = j - this.dataStartPosition;
        if (!isSeekable() || j3 <= ((long) this.xingFrameSize)) {
            return 0;
        }
        long[] jArr = (long[]) Assertions.checkNotNull(this.tableOfContents);
        double d2 = (double) j3;
        Double.isNaN(d2);
        double d3 = (double) this.dataSize;
        Double.isNaN(d3);
        double d4 = (d2 * 256.0d) / d3;
        int binarySearchFloor = Util.binarySearchFloor(jArr, (long) d4, true, true);
        long timeUsForTableIndex = getTimeUsForTableIndex(binarySearchFloor);
        long j4 = jArr[binarySearchFloor];
        int i = binarySearchFloor + 1;
        long timeUsForTableIndex2 = getTimeUsForTableIndex(i);
        if (binarySearchFloor == 99) {
            j2 = 256;
        } else {
            j2 = jArr[i];
        }
        if (j4 == j2) {
            d = 0.0d;
        } else {
            double d5 = (double) j4;
            Double.isNaN(d5);
            double d6 = (double) (j2 - j4);
            Double.isNaN(d6);
            d = (d4 - d5) / d6;
        }
        double d7 = (double) (timeUsForTableIndex2 - timeUsForTableIndex);
        Double.isNaN(d7);
        return timeUsForTableIndex + Math.round(d * d7);
    }

    public final long getDurationUs() {
        return this.durationUs;
    }

    private long getTimeUsForTableIndex(int i) {
        return (this.durationUs * ((long) i)) / 100;
    }
}
