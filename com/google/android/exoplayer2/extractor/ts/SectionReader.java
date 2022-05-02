package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;

public final class SectionReader implements TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final SectionPayloadReader reader;
    private final ParsableByteArray sectionData = new ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    public final void seek() {
        this.waitingForPayloadStart = true;
    }

    public final void consume(ParsableByteArray parsableByteArray, boolean z) {
        int i;
        if (z) {
            i = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
        } else {
            i = -1;
        }
        if (this.waitingForPayloadStart) {
            if (z) {
                this.waitingForPayloadStart = false;
                parsableByteArray.setPosition(i);
                this.bytesRead = 0;
            } else {
                return;
            }
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.bytesRead;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (readUnsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int min = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, min);
                int i3 = this.bytesRead + min;
                this.bytesRead = i3;
                if (i3 == 3) {
                    this.sectionData.reset(3);
                    this.sectionData.skipBytes(1);
                    int readUnsignedByte2 = this.sectionData.readUnsignedByte();
                    int readUnsignedByte3 = this.sectionData.readUnsignedByte();
                    if ((readUnsignedByte2 & 128) == 0) {
                        z2 = false;
                    }
                    this.sectionSyntaxIndicator = z2;
                    this.totalSectionLength = (((readUnsignedByte2 & 15) << 8) | readUnsignedByte3) + 3;
                    if (this.sectionData.capacity() < this.totalSectionLength) {
                        byte[] bArr = this.sectionData.data;
                        this.sectionData.reset(Math.min(4098, Math.max(this.totalSectionLength, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.sectionData.data, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, min2);
                int i4 = this.bytesRead + min2;
                this.bytesRead = i4;
                int i5 = this.totalSectionLength;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.sectionSyntaxIndicator) {
                        this.sectionData.reset(i5);
                    } else if (Util.crc(this.sectionData.data, 0, this.totalSectionLength, -1) != 0) {
                        this.waitingForPayloadStart = true;
                        return;
                    } else {
                        this.sectionData.reset(this.totalSectionLength - 4);
                    }
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }
}
