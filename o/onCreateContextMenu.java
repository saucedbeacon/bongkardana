package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;

public final class onCreateContextMenu implements ExtractorsFactory {
    public static final onCreateContextMenu getMax = new onCreateContextMenu();

    public final Extractor[] createExtractors() {
        return AmrExtractor.lambda$static$0();
    }
}
