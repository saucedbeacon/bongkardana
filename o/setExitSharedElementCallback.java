package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;

public final class setExitSharedElementCallback implements ExtractorsFactory {
    public static final setExitSharedElementCallback getMin = new setExitSharedElementCallback();

    public final Extractor[] createExtractors() {
        return Mp3Extractor.lambda$static$0();
    }
}
