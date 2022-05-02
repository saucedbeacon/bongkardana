package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

final class OggPageHeader {
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    private static final int TYPE_OGGS = Util.getIntegerCodeForString("OggS");
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public final int[] laces = new int[255];
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    private final ParsableByteArray scratch = new ParsableByteArray(255);
    public long streamSerialNumber;
    public int type;

    OggPageHeader() {
    }

    public final void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0;
        this.streamSerialNumber = 0;
        this.pageSequenceNumber = 0;
        this.pageChecksum = 0;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }

    public final boolean populate(ExtractorInput extractorInput, boolean z) throws IOException, InterruptedException {
        this.scratch.reset();
        reset();
        if (!(extractorInput.getLength() == -1 || extractorInput.getLength() - extractorInput.getPeekPosition() >= 27) || !extractorInput.peekFully(this.scratch.data, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.scratch.readUnsignedInt() == ((long) TYPE_OGGS)) {
            int readUnsignedByte = this.scratch.readUnsignedByte();
            this.revision = readUnsignedByte;
            if (readUnsignedByte == 0) {
                this.type = this.scratch.readUnsignedByte();
                this.granulePosition = this.scratch.readLittleEndianLong();
                this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
                this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
                this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
                int readUnsignedByte2 = this.scratch.readUnsignedByte();
                this.pageSegmentCount = readUnsignedByte2;
                this.headerSize = readUnsignedByte2 + 27;
                this.scratch.reset();
                extractorInput.peekFully(this.scratch.data, 0, this.pageSegmentCount);
                for (int i = 0; i < this.pageSegmentCount; i++) {
                    this.laces[i] = this.scratch.readUnsignedByte();
                    this.bodySize += this.laces[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new ParserException("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
    }
}
