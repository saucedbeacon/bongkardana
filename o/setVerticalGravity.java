package o;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.layer.Layer;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.IResultReceiver;
import o.LinearLayoutCompat;
import o.PlaybackStateCompat;

public class setVerticalGravity {
    public boolean FastBitmap$CoordinateSystem;
    public List<onSuggestionsKey> IsOverlapping;
    public Rect equals;
    public Map<String, List<Layer>> getMax;
    public Map<String, getSuggestionsAdapter> getMin;
    public int hashCode = 0;
    public PlaybackStateCompat.ShuffleMode<Layer> isInside;
    public final HashSet<String> length = new HashSet<>();
    public Map<String, setGravity> setMax;
    public final LinearLayoutCompat.LayoutParams setMin = new LinearLayoutCompat.LayoutParams();
    public float toDoubleRange;
    public IResultReceiver.Stub<setQueryRefinementEnabled> toFloatRange;
    public List<Layer> toIntRange;
    public float toString;
    public float values;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final boolean setMin() {
        return this.FastBitmap$CoordinateSystem;
    }

    @Nullable
    public final onSuggestionsKey getMax(String str) {
        int size = this.IsOverlapping.size();
        for (int i = 0; i < size; i++) {
            onSuggestionsKey onsuggestionskey = this.IsOverlapping.get(i);
            if (onsuggestionskey.length(str)) {
                return onsuggestionskey;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (Layer max : this.toIntRange) {
            sb.append(max.setMax("\t"));
        }
        return sb.toString();
    }
}
