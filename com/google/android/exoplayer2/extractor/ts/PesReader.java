package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

public final class PesReader implements TsPayloadReader {
    private static final int HEADER_SIZE = 9;
    private static final int MAX_HEADER_EXTENSION_SIZE = 10;
    private static final int PES_SCRATCH_SIZE = 10;
    private static final int STATE_FINDING_HEADER = 0;
    private static final int STATE_READING_BODY = 3;
    private static final int STATE_READING_HEADER = 1;
    private static final int STATE_READING_HEADER_EXTENSION = 2;
    private static final String TAG = "PesReader";
    private int bytesRead;
    private boolean dataAlignmentIndicator;
    private boolean dtsFlag;
    private int extendedHeaderLength;
    private int payloadSize;
    private final ParsableBitArray pesScratch = new ParsableBitArray(new byte[10]);
    private boolean ptsFlag;
    private final ElementaryStreamReader reader;
    private boolean seenFirstDts;
    private int state = 0;
    private long timeUs;
    private TimestampAdjuster timestampAdjuster;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.reader = elementaryStreamReader;
    }

    public final void init(TimestampAdjuster timestampAdjuster2, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.timestampAdjuster = timestampAdjuster2;
        this.reader.createTracks(extractorOutput, trackIdGenerator);
    }

    public final void seek() {
        this.state = 0;
        this.bytesRead = 0;
        this.seenFirstDts = false;
        this.reader.seek();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2 A[SYNTHETIC] */
    public final void consume(com.google.android.exoplayer2.util.ParsableByteArray r9, boolean r10) throws com.google.android.exoplayer2.ParserException {
        /*
            r8 = this;
            r0 = -1
            r1 = 3
            r2 = 2
            r3 = 1
            if (r10 == 0) goto L_0x0041
            int r10 = r8.state
            if (r10 == 0) goto L_0x003f
            if (r10 == r3) goto L_0x003f
            java.lang.String r4 = "PesReader"
            if (r10 == r2) goto L_0x003a
            if (r10 != r1) goto L_0x0034
            int r10 = r8.payloadSize
            if (r10 == r0) goto L_0x002e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected start indicator: expected "
            r10.<init>(r5)
            int r5 = r8.payloadSize
            r10.append(r5)
            java.lang.String r5 = " more bytes"
            r10.append(r5)
            java.lang.String r10 = r10.toString()
            com.google.android.exoplayer2.util.Log.w(r4, r10)
        L_0x002e:
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r10 = r8.reader
            r10.packetFinished()
            goto L_0x003f
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x003a:
            java.lang.String r10 = "Unexpected start indicator reading extended header"
            com.google.android.exoplayer2.util.Log.w(r4, r10)
        L_0x003f:
            r10 = r8
            goto L_0x007c
        L_0x0041:
            r10 = r8
        L_0x0042:
            int r4 = r9.bytesLeft()
            if (r4 <= 0) goto L_0x00d2
            int r4 = r10.state
            if (r4 == 0) goto L_0x00c9
            r5 = 0
            if (r4 == r3) goto L_0x00b1
            if (r4 == r2) goto L_0x0086
            if (r4 != r1) goto L_0x0080
            int r4 = r9.bytesLeft()
            int r6 = r10.payloadSize
            if (r6 != r0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r5 = r4 - r6
        L_0x005e:
            if (r5 <= 0) goto L_0x0069
            int r4 = r4 - r5
            int r5 = r9.getPosition()
            int r5 = r5 + r4
            r9.setLimit(r5)
        L_0x0069:
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r5 = r10.reader
            r5.consume(r9)
            int r5 = r10.payloadSize
            if (r5 == r0) goto L_0x0042
            int r5 = r5 - r4
            r10.payloadSize = r5
            if (r5 != 0) goto L_0x0042
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r4 = r10.reader
            r4.packetFinished()
        L_0x007c:
            r10.setState(r3)
            goto L_0x0042
        L_0x0080:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0086:
            r4 = 10
            int r5 = r10.extendedHeaderLength
            int r4 = java.lang.Math.min(r4, r5)
            com.google.android.exoplayer2.util.ParsableBitArray r5 = r10.pesScratch
            byte[] r5 = r5.data
            boolean r4 = r10.continueRead(r9, r5, r4)
            if (r4 == 0) goto L_0x0042
            r4 = 0
            int r5 = r10.extendedHeaderLength
            boolean r4 = r10.continueRead(r9, r4, r5)
            if (r4 == 0) goto L_0x0042
            r10.parseHeaderExtension()
            com.google.android.exoplayer2.extractor.ts.ElementaryStreamReader r4 = r10.reader
            long r5 = r10.timeUs
            boolean r7 = r10.dataAlignmentIndicator
            r4.packetStarted(r5, r7)
            r10.setState(r1)
            goto L_0x0042
        L_0x00b1:
            com.google.android.exoplayer2.util.ParsableBitArray r4 = r10.pesScratch
            byte[] r4 = r4.data
            r6 = 9
            boolean r4 = r10.continueRead(r9, r4, r6)
            if (r4 == 0) goto L_0x0042
            boolean r4 = r10.parseHeader()
            if (r4 == 0) goto L_0x00c4
            r5 = 2
        L_0x00c4:
            r10.setState(r5)
            goto L_0x0042
        L_0x00c9:
            int r4 = r9.bytesLeft()
            r9.skipBytes(r4)
            goto L_0x0042
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ts.PesReader.consume(com.google.android.exoplayer2.util.ParsableByteArray, boolean):void");
    }

    private void setState(int i) {
        this.state = i;
        this.bytesRead = 0;
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.bytesRead);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(bArr, this.bytesRead, min);
        }
        int i2 = this.bytesRead + min;
        this.bytesRead = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    private boolean parseHeader() {
        this.pesScratch.setPosition(0);
        int readBits = this.pesScratch.readBits(24);
        if (readBits != 1) {
            Log.w(TAG, "Unexpected start code prefix: ".concat(String.valueOf(readBits)));
            this.payloadSize = -1;
            return false;
        }
        this.pesScratch.skipBits(8);
        int readBits2 = this.pesScratch.readBits(16);
        this.pesScratch.skipBits(5);
        this.dataAlignmentIndicator = this.pesScratch.readBit();
        this.pesScratch.skipBits(2);
        this.ptsFlag = this.pesScratch.readBit();
        this.dtsFlag = this.pesScratch.readBit();
        this.pesScratch.skipBits(6);
        int readBits3 = this.pesScratch.readBits(8);
        this.extendedHeaderLength = readBits3;
        if (readBits2 == 0) {
            this.payloadSize = -1;
        } else {
            this.payloadSize = ((readBits2 + 6) - 9) - readBits3;
        }
        return true;
    }

    private void parseHeaderExtension() {
        this.pesScratch.setPosition(0);
        this.timeUs = C.TIME_UNSET;
        if (this.ptsFlag) {
            this.pesScratch.skipBits(4);
            this.pesScratch.skipBits(1);
            this.pesScratch.skipBits(1);
            long readBits = (((long) this.pesScratch.readBits(3)) << 30) | ((long) (this.pesScratch.readBits(15) << 15)) | ((long) this.pesScratch.readBits(15));
            this.pesScratch.skipBits(1);
            if (!this.seenFirstDts && this.dtsFlag) {
                this.pesScratch.skipBits(4);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.pesScratch.skipBits(1);
                this.timestampAdjuster.adjustTsTimestamp((((long) this.pesScratch.readBits(3)) << 30) | ((long) (this.pesScratch.readBits(15) << 15)) | ((long) this.pesScratch.readBits(15)));
                this.seenFirstDts = true;
            }
            this.timeUs = this.timestampAdjuster.adjustTsTimestamp(readBits);
        }
    }
}
