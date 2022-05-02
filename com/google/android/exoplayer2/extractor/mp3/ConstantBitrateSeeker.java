package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.ConstantBitrateSeekMap;
import com.google.android.exoplayer2.extractor.MpegAudioHeader;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;

final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Mp3Extractor.Seeker {
    public ConstantBitrateSeeker(long j, long j2, MpegAudioHeader mpegAudioHeader) {
        super(j, j2, mpegAudioHeader.bitrate, mpegAudioHeader.frameSize);
    }

    public final long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }
}
