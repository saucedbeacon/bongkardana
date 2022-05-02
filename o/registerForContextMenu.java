package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;

public final class registerForContextMenu implements ExtractorsFactory {
    public static final registerForContextMenu getMin = new registerForContextMenu();

    public final Extractor[] createExtractors() {
        return OggExtractor.lambda$static$0();
    }
}
