package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.WavUtil;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    public static WavHeader peek(ExtractorInput extractorInput) throws IOException, InterruptedException {
        ChunkHeader peek;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f9535id != WavUtil.RIFF_FOURCC) {
            return null;
        }
        extractorInput.peekFully(parsableByteArray.data, 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt != WavUtil.WAVE_FOURCC) {
            Log.e(TAG, "Unsupported RIFF format: ".concat(String.valueOf(readInt)));
            return null;
        }
        while (true) {
            peek = ChunkHeader.peek(extractorInput, parsableByteArray);
            if (peek.f9535id == WavUtil.FMT_FOURCC) {
                break;
            }
            extractorInput.advancePeekPosition((int) peek.size);
        }
        Assertions.checkState(peek.size >= 16);
        extractorInput.peekFully(parsableByteArray.data, 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = (readLittleEndianUnsignedShort2 * readLittleEndianUnsignedShort4) / 8;
        if (readLittleEndianUnsignedShort3 == i) {
            int encodingForType = WavUtil.getEncodingForType(readLittleEndianUnsignedShort, readLittleEndianUnsignedShort4);
            if (encodingForType == 0) {
                StringBuilder sb = new StringBuilder("Unsupported WAV format: ");
                sb.append(readLittleEndianUnsignedShort4);
                sb.append(" bit/sample, type ");
                sb.append(readLittleEndianUnsignedShort);
                Log.e(TAG, sb.toString());
                return null;
            }
            extractorInput.advancePeekPosition(((int) peek.size) - 16);
            return new WavHeader(readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, encodingForType);
        }
        StringBuilder sb2 = new StringBuilder("Expected block alignment: ");
        sb2.append(i);
        sb2.append("; got: ");
        sb2.append(readLittleEndianUnsignedShort3);
        throw new ParserException(sb2.toString());
    }

    public static void skipToData(ExtractorInput extractorInput, WavHeader wavHeader) throws IOException, InterruptedException {
        Assertions.checkNotNull(extractorInput);
        Assertions.checkNotNull(wavHeader);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.f9535id != Util.getIntegerCodeForString("data")) {
            StringBuilder sb = new StringBuilder("Ignoring unknown WAV chunk: ");
            sb.append(peek.f9535id);
            Log.w(TAG, sb.toString());
            long j = peek.size + 8;
            if (peek.f9535id == Util.getIntegerCodeForString("RIFF")) {
                j = 12;
            }
            if (j <= 2147483647L) {
                extractorInput.skipFully((int) j);
                peek = ChunkHeader.peek(extractorInput, parsableByteArray);
            } else {
                StringBuilder sb2 = new StringBuilder("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(peek.f9535id);
                throw new ParserException(sb2.toString());
            }
        }
        extractorInput.skipFully(8);
        wavHeader.setDataBounds(extractorInput.getPosition(), peek.size);
    }

    private WavHeaderReader() {
    }

    static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id  reason: collision with root package name */
        public final int f9535id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.f9535id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException, InterruptedException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }
}
