package o;

import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;

public final class setEnterSharedElementCallback implements ExtractorsFactory {
    public static final setEnterSharedElementCallback getMin = new setEnterSharedElementCallback();

    public final Extractor[] createExtractors() {
        return Mp4Extractor.lambda$static$0();
    }
}
