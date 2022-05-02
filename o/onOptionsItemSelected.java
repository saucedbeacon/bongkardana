package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;

public final class onOptionsItemSelected implements ExtractorsFactory {
    public static final onOptionsItemSelected setMax = new onOptionsItemSelected();

    public final Extractor[] createExtractors() {
        return MatroskaExtractor.lambda$static$0();
    }
}
