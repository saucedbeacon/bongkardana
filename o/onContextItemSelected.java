package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;

public final class onContextItemSelected implements ExtractorsFactory {
    public static final onContextItemSelected getMin = new onContextItemSelected();

    public final Extractor[] createExtractors() {
        return Ac3Extractor.lambda$static$0();
    }
}
