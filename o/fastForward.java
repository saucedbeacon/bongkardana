package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import o.stop;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class fastForward<K, V> extends stop<K, V> {
    public HashMap<K, stop.getMin<K, V>> setMin = new HashMap<>();

    /* access modifiers changed from: protected */
    public final stop.getMin<K, V> setMin(K k) {
        return this.setMin.get(k);
    }

    public final V length(@NonNull K k) {
        V length = super.length(k);
        this.setMin.remove(k);
        return length;
    }

    public final boolean getMax(K k) {
        return this.setMin.containsKey(k);
    }

    public final V length(@NonNull K k, @NonNull V v) {
        stop.getMin getmin = this.setMin.get(k);
        if (getmin != null) {
            return getmin.getMin;
        }
        this.setMin.put(k, setMax(k, v));
        return null;
    }
}
