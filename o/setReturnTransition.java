package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

public final class setReturnTransition implements ExtractorsFactory {
    public static final setReturnTransition length = new setReturnTransition();

    public final Extractor[] createExtractors() {
        return PsExtractor.lambda$static$0();
    }
}
