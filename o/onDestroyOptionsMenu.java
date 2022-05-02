package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;

public final class onDestroyOptionsMenu implements ExtractorsFactory {
    public static final onDestroyOptionsMenu length = new onDestroyOptionsMenu();

    public final Extractor[] createExtractors() {
        return FlvExtractor.lambda$static$0();
    }
}
