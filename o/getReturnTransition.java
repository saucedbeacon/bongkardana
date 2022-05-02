package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

public final class getReturnTransition implements ExtractorsFactory {
    public static final getReturnTransition getMin = new getReturnTransition();

    public final Extractor[] createExtractors() {
        return TsExtractor.lambda$static$0();
    }
}
