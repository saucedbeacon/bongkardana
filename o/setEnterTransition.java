package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;

public final class setEnterTransition implements ExtractorsFactory {
    public static final setEnterTransition getMin = new setEnterTransition();

    public final Extractor[] createExtractors() {
        return AdtsExtractor.lambda$static$0();
    }
}
