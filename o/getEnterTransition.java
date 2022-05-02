package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;

public final class getEnterTransition implements ExtractorsFactory {
    public static final getEnterTransition setMax = new getEnterTransition();

    public final Extractor[] createExtractors() {
        return WavExtractor.lambda$static$0();
    }
}
