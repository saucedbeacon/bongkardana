package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;

public final class unregisterForContextMenu implements ExtractorsFactory {
    public static final unregisterForContextMenu setMax = new unregisterForContextMenu();

    public final Extractor[] createExtractors() {
        return FragmentedMp4Extractor.lambda$static$0();
    }
}
