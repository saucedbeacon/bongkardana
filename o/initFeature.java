package o;

import android.util.SparseArray;
import android.view.View;
import o.PlaybackStateCompat;

public class initFeature {
    public final PlaybackStateCompat.ShuffleMode<View> getMax = new PlaybackStateCompat.ShuffleMode<>();
    public final PlaybackStateCompat<View, hasIcon> getMin = new PlaybackStateCompat<>();
    public final PlaybackStateCompat<String, View> setMax = new PlaybackStateCompat<>();
    public final SparseArray<View> setMin = new SparseArray<>();
}
