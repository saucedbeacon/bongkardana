package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.common.base.Ascii;
import java.io.IOException;

final class PsDurationReader {
    private static final int DURATION_READ_BYTES = 20000;
    private long durationUs = C.TIME_UNSET;
    private long firstScrValue = C.TIME_UNSET;
    private boolean isDurationRead;
    private boolean isFirstScrValueRead;
    private boolean isLastScrValueRead;
    private long lastScrValue = C.TIME_UNSET;
    private final ParsableByteArray packetBuffer = new ParsableByteArray(20000);
    private final TimestampAdjuster scrTimestampAdjuster = new TimestampAdjuster(0);

    PsDurationReader() {
    }

    public final boolean isDurationReadFinished() {
        return this.isDurationRead;
    }

    public final TimestampAdjuster getScrTimestampAdjuster() {
        return this.scrTimestampAdjuster;
    }

    public final int readDuration(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        if (!this.isLastScrValueRead) {
            return readLastScrValue(extractorInput, positionHolder);
        }
        if (this.lastScrValue == C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        if (!this.isFirstScrValueRead) {
            return readFirstScrValue(extractorInput, positionHolder);
        }
        long j = this.firstScrValue;
        if (j == C.TIME_UNSET) {
            return finishReadDuration(extractorInput);
        }
        this.durationUs = this.scrTimestampAdjuster.adjustTsTimestamp(this.lastScrValue) - this.scrTimestampAdjuster.adjustTsTimestamp(j);
        return finishReadDuration(extractorInput);
    }

    public final long getDurationUs() {
        return this.durationUs;
    }

    public static long readScrValueFromPack(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        if (parsableByteArray.bytesLeft() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        parsableByteArray.readBytes(bArr, 0, 9);
        parsableByteArray.setPosition(position);
        if (!checkMarkerBits(bArr)) {
            return C.TIME_UNSET;
        }
        return readScrValueFromPackHeader(bArr);
    }

    private int finishReadDuration(ExtractorInput extractorInput) {
        this.isDurationRead = true;
        extractorInput.resetPeekPosition();
        return 0;
    }

    private int readFirstScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        if (extractorInput.getPosition() != 0) {
            positionHolder.position = 0;
            return 1;
        }
        int min = (int) Math.min(20000, extractorInput.getLength());
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.data, 0, min);
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(min);
        this.firstScrValue = readFirstScrValueFromBuffer(this.packetBuffer);
        this.isFirstScrValueRead = true;
        return 0;
    }

    private long readFirstScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit - 3; position++) {
            if (peekIntAtPosition(parsableByteArray.data, position) == 442) {
                parsableByteArray.setPosition(position + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != C.TIME_UNSET) {
                    return readScrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int readLastScrValue(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        int min = (int) Math.min(20000, extractorInput.getLength());
        long length = extractorInput.getLength() - ((long) min);
        if (extractorInput.getPosition() != length) {
            positionHolder.position = length;
            return 1;
        }
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.packetBuffer.data, 0, min);
        this.packetBuffer.setPosition(0);
        this.packetBuffer.setLimit(min);
        this.lastScrValue = readLastScrValueFromBuffer(this.packetBuffer);
        this.isLastScrValueRead = true;
        return 0;
    }

    private long readLastScrValueFromBuffer(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        for (int limit = parsableByteArray.limit() - 4; limit >= position; limit--) {
            if (peekIntAtPosition(parsableByteArray.data, limit) == 442) {
                parsableByteArray.setPosition(limit + 4);
                long readScrValueFromPack = readScrValueFromPack(parsableByteArray);
                if (readScrValueFromPack != C.TIME_UNSET) {
                    return readScrValueFromPack;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int peekIntAtPosition(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean checkMarkerBits(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private static long readScrValueFromPackHeader(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }
}
