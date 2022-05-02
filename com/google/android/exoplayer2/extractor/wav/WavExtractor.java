package com.google.android.exoplayer2.extractor.wav;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;
import o.getEnterTransition;

public final class WavExtractor implements Extractor {
    public static final ExtractorsFactory FACTORY = getEnterTransition.setMax;
    private static final int MAX_INPUT_SIZE = 32768;
    private int bytesPerFrame;
    private ExtractorOutput extractorOutput;
    private int pendingBytes;
    private TrackOutput trackOutput;
    private WavHeader wavHeader;

    public final void release() {
    }

    public static /* synthetic */ Extractor[] lambda$static$0() {
        return new Extractor[]{new WavExtractor()};
    }

    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return WavHeaderReader.peek(extractorInput) != null;
    }

    public final void init(ExtractorOutput extractorOutput2) {
        this.extractorOutput = extractorOutput2;
        this.trackOutput = extractorOutput2.track(0, 1);
        this.wavHeader = null;
        extractorOutput2.endTracks();
    }

    public final void seek(long j, long j2) {
        this.pendingBytes = 0;
    }

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        if (this.wavHeader == null) {
            WavHeader peek = WavHeaderReader.peek(extractorInput);
            this.wavHeader = peek;
            if (peek != null) {
                this.trackOutput.format(Format.createAudioSampleFormat((String) null, MimeTypes.AUDIO_RAW, (String) null, peek.getBitrate(), MAX_INPUT_SIZE, this.wavHeader.getNumChannels(), this.wavHeader.getSampleRateHz(), this.wavHeader.getEncoding(), (List<byte[]>) null, (DrmInitData) null, 0, (String) null));
                this.bytesPerFrame = this.wavHeader.getBytesPerFrame();
            } else {
                throw new ParserException("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.wavHeader.hasDataBounds()) {
            WavHeaderReader.skipToData(extractorInput, this.wavHeader);
            this.extractorOutput.seekMap(this.wavHeader);
        }
        long dataLimit = this.wavHeader.getDataLimit();
        Assertions.checkState(dataLimit != -1);
        long position = dataLimit - extractorInput.getPosition();
        if (position <= 0) {
            return -1;
        }
        int sampleData = this.trackOutput.sampleData(extractorInput, (int) Math.min((long) (MAX_INPUT_SIZE - this.pendingBytes), position), true);
        if (sampleData != -1) {
            this.pendingBytes += sampleData;
        }
        int i = this.pendingBytes / this.bytesPerFrame;
        if (i > 0) {
            long timeUs = this.wavHeader.getTimeUs(extractorInput.getPosition() - ((long) this.pendingBytes));
            int i2 = i * this.bytesPerFrame;
            int i3 = this.pendingBytes - i2;
            this.pendingBytes = i3;
            this.trackOutput.sampleMetadata(timeUs, 1, i2, i3, (TrackOutput.CryptoData) null);
        }
        if (sampleData == -1) {
            return -1;
        }
        return 0;
    }
}
