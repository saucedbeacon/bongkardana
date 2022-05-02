package o;

import com.google.android.exoplayer2.metadata.id3.Id3Decoder;

public final class setExitTransition implements Id3Decoder.FramePredicate {
    public static final setExitTransition getMin = new setExitTransition();

    public final boolean evaluate(int i, int i2, int i3, int i4, int i5) {
        return Id3Decoder.length(i, i2, i3, i4, i5);
    }
}
