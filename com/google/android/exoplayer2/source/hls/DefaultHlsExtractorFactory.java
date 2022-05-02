package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Track;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.EOFException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DefaultHlsExtractorFactory implements HlsExtractorFactory {
    public static final String AAC_FILE_EXTENSION = ".aac";
    public static final String AC3_FILE_EXTENSION = ".ac3";
    public static final String EC3_FILE_EXTENSION = ".ec3";
    public static final String M4_FILE_EXTENSION_PREFIX = ".m4";
    public static final String MP3_FILE_EXTENSION = ".mp3";
    public static final String MP4_FILE_EXTENSION = ".mp4";
    public static final String MP4_FILE_EXTENSION_PREFIX = ".mp4";
    public static final String VTT_FILE_EXTENSION = ".vtt";
    public static final String WEBVTT_FILE_EXTENSION = ".webvtt";

    public final Pair<Extractor, Boolean> createExtractor(Extractor extractor, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, TimestampAdjuster timestampAdjuster, Map<String, List<String>> map, ExtractorInput extractorInput) throws InterruptedException, IOException {
        List<Format> list2;
        if (extractor == null) {
            Extractor createExtractorByFileExtension = createExtractorByFileExtension(uri, format, list, drmInitData, timestampAdjuster);
            extractorInput.resetPeekPosition();
            if (sniffQuietly(createExtractorByFileExtension, extractorInput)) {
                return buildResult(createExtractorByFileExtension);
            }
            if (!(createExtractorByFileExtension instanceof WebvttExtractor)) {
                WebvttExtractor webvttExtractor = new WebvttExtractor(format.language, timestampAdjuster);
                if (sniffQuietly(webvttExtractor, extractorInput)) {
                    return buildResult(webvttExtractor);
                }
            }
            if (!(createExtractorByFileExtension instanceof AdtsExtractor)) {
                AdtsExtractor adtsExtractor = new AdtsExtractor();
                if (sniffQuietly(adtsExtractor, extractorInput)) {
                    return buildResult(adtsExtractor);
                }
            }
            if (!(createExtractorByFileExtension instanceof Ac3Extractor)) {
                Ac3Extractor ac3Extractor = new Ac3Extractor();
                if (sniffQuietly(ac3Extractor, extractorInput)) {
                    return buildResult(ac3Extractor);
                }
            }
            if (!(createExtractorByFileExtension instanceof Mp3Extractor)) {
                Mp3Extractor mp3Extractor = new Mp3Extractor(0, 0);
                if (sniffQuietly(mp3Extractor, extractorInput)) {
                    return buildResult(mp3Extractor);
                }
            }
            if (!(createExtractorByFileExtension instanceof FragmentedMp4Extractor)) {
                if (list != null) {
                    list2 = list;
                } else {
                    list2 = Collections.emptyList();
                }
                FragmentedMp4Extractor fragmentedMp4Extractor = new FragmentedMp4Extractor(0, timestampAdjuster, (Track) null, drmInitData, list2);
                if (sniffQuietly(fragmentedMp4Extractor, extractorInput)) {
                    return buildResult(fragmentedMp4Extractor);
                }
            }
            if (!(createExtractorByFileExtension instanceof TsExtractor)) {
                TsExtractor createTsExtractor = createTsExtractor(format, list, timestampAdjuster);
                if (sniffQuietly(createTsExtractor, extractorInput)) {
                    return buildResult(createTsExtractor);
                }
            }
            return buildResult(createExtractorByFileExtension);
        } else if ((extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor)) {
            return buildResult(extractor);
        } else {
            if (extractor instanceof WebvttExtractor) {
                return buildResult(new WebvttExtractor(format.language, timestampAdjuster));
            }
            if (extractor instanceof AdtsExtractor) {
                return buildResult(new AdtsExtractor());
            }
            if (extractor instanceof Ac3Extractor) {
                return buildResult(new Ac3Extractor());
            }
            if (extractor instanceof Mp3Extractor) {
                return buildResult(new Mp3Extractor());
            }
            StringBuilder sb = new StringBuilder("Unexpected previousExtractor type: ");
            sb.append(extractor.getClass().getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private Extractor createExtractorByFileExtension(Uri uri, Format format, List<Format> list, DrmInitData drmInitData, TimestampAdjuster timestampAdjuster) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        if (MimeTypes.TEXT_VTT.equals(format.sampleMimeType) || lastPathSegment.endsWith(WEBVTT_FILE_EXTENSION) || lastPathSegment.endsWith(VTT_FILE_EXTENSION)) {
            return new WebvttExtractor(format.language, timestampAdjuster);
        }
        if (lastPathSegment.endsWith(AAC_FILE_EXTENSION)) {
            return new AdtsExtractor();
        }
        if (lastPathSegment.endsWith(AC3_FILE_EXTENSION) || lastPathSegment.endsWith(EC3_FILE_EXTENSION)) {
            return new Ac3Extractor();
        }
        if (lastPathSegment.endsWith(MP3_FILE_EXTENSION)) {
            return new Mp3Extractor(0, 0);
        }
        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(M4_FILE_EXTENSION_PREFIX, lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
            return createTsExtractor(format, list, timestampAdjuster);
        }
        if (list == null) {
            list = Collections.emptyList();
        }
        return new FragmentedMp4Extractor(0, timestampAdjuster, (Track) null, drmInitData, list);
    }

    private static TsExtractor createTsExtractor(Format format, List<Format> list, TimestampAdjuster timestampAdjuster) {
        int i;
        if (list != null) {
            i = 48;
        } else {
            list = Collections.singletonList(Format.createTextSampleFormat((String) null, MimeTypes.APPLICATION_CEA608, 0, (String) null));
            i = 16;
        }
        String str = format.codecs;
        if (!TextUtils.isEmpty(str)) {
            if (!MimeTypes.AUDIO_AAC.equals(MimeTypes.getAudioMediaMimeType(str))) {
                i |= 2;
            }
            if (!MimeTypes.VIDEO_H264.equals(MimeTypes.getVideoMediaMimeType(str))) {
                i |= 4;
            }
        }
        return new TsExtractor(2, timestampAdjuster, new DefaultTsPayloadReaderFactory(i, list));
    }

    private static Pair<Extractor, Boolean> buildResult(Extractor extractor) {
        return new Pair<>(extractor, Boolean.valueOf((extractor instanceof AdtsExtractor) || (extractor instanceof Ac3Extractor) || (extractor instanceof Mp3Extractor)));
    }

    /* JADX INFO: finally extract failed */
    private static boolean sniffQuietly(Extractor extractor, ExtractorInput extractorInput) throws InterruptedException, IOException {
        try {
            boolean sniff = extractor.sniff(extractorInput);
            extractorInput.resetPeekPosition();
            return sniff;
        } catch (EOFException unused) {
            extractorInput.resetPeekPosition();
            return false;
        } catch (Throwable th) {
            extractorInput.resetPeekPosition();
            throw th;
        }
    }
}
