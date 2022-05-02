package o;

import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;

public final class onPrepareOptionsMenu implements Id3Decoder.FramePredicate {
    public static final onPrepareOptionsMenu getMin = new onPrepareOptionsMenu();

    public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return GaplessInfoHolder.lambda$static$0(i, i2, i3, i4, i5);
    }
}
