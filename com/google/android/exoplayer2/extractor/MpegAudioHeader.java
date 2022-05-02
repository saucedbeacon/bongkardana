package com.google.android.exoplayer2.extractor;

import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;

public final class MpegAudioHeader {
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, BlobStatic.MONITOR_IMAGE_WIDTH, PsExtractor.AUDIO_STREAM, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, BlobStatic.MONITOR_IMAGE_WIDTH, PsExtractor.AUDIO_STREAM, 224, 256, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, BlobStatic.MONITOR_IMAGE_WIDTH, PsExtractor.AUDIO_STREAM, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, BlobStatic.MONITOR_IMAGE_WIDTH};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, BlobStatic.MONITOR_IMAGE_WIDTH, 176, PsExtractor.AUDIO_STREAM, 224, 256};
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    private static final String[] MIME_TYPE_BY_LAYER = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;

    public static int getFrameSize(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1]) * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1];
        } else {
            i6 = BITRATE_V2[i4 - 1];
        }
        int i9 = 144000;
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i9 * i6) / i7) + i8;
    }

    public static boolean populateHeader(int i, MpegAudioHeader mpegAudioHeader) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i11 = SAMPLING_RATE_V1[i5];
        if (i2 == 2) {
            i11 /= 2;
        } else if (i2 == 0) {
            i11 /= 4;
        }
        int i12 = i11;
        int i13 = (i >>> 9) & 1;
        if (i3 == 3) {
            i8 = i2 == 3 ? BITRATE_V1_L1[i4 - 1] : BITRATE_V2_L1[i4 - 1];
            i7 = (((i8 * SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES) / i12) + i13) * 4;
            i6 = 384;
        } else {
            int i14 = 1152;
            if (i2 == 3) {
                i10 = i3 == 2 ? BITRATE_V1_L2[i4 - 1] : BITRATE_V1_L3[i4 - 1];
            } else {
                i10 = BITRATE_V2[i4 - 1];
                if (i3 == 1) {
                    i14 = 576;
                }
                if (i3 == 1) {
                    i9 = DefaultOggSeeker.MATCH_RANGE;
                    i6 = i14;
                    i7 = ((i9 * i8) / i12) + i13;
                }
            }
            i9 = 144000;
            i6 = i14;
            i7 = ((i9 * i8) / i12) + i13;
        }
        mpegAudioHeader.setValues(i2, MIME_TYPE_BY_LAYER[3 - i3], i7, i12, ((i >> 6) & 3) == 3 ? 1 : 2, i8 * 1000, i6);
        return true;
    }

    private void setValues(int i, String str, int i2, int i3, int i4, int i5, int i6) {
        this.version = i;
        this.mimeType = str;
        this.frameSize = i2;
        this.sampleRate = i3;
        this.channels = i4;
        this.bitrate = i5;
        this.samplesPerFrame = i6;
    }
}
