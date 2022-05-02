package o;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.setInteractionEnabled;

final class getEndState<K extends setInteractionEnabled, V> {
    private final getMin<K, V> setMax = new getMin<>();
    private final Map<K, getMin<K, V>> setMin = new HashMap();

    getEndState() {
    }

    public final void setMin(K k, V v) {
        getMin<K, V> getmin = this.setMin.get(k);
        if (getmin == null) {
            getmin = new getMin<>(k);
            getmin.setMin.getMin = getmin.getMin;
            getmin.getMin.setMin = getmin.setMin;
            getmin.setMin = this.setMax.setMin;
            getmin.getMin = this.setMax;
            getmin.getMin.setMin = getmin;
            getmin.setMin.getMin = getmin;
            this.setMin.put(k, getmin);
        } else {
            k.getMax();
        }
        if (getmin.setMax == null) {
            getmin.setMax = new ArrayList();
        }
        getmin.setMax.add(v);
    }

    @Nullable
    public final V getMin(K k) {
        getMin<K, V> getmin = this.setMin.get(k);
        if (getmin == null) {
            getmin = new getMin<>(k);
            this.setMin.put(k, getmin);
        } else {
            k.getMax();
        }
        getmin.setMin.getMin = getmin.getMin;
        getmin.getMin.setMin = getmin.setMin;
        getmin.setMin = this.setMax;
        getmin.getMin = this.setMax.getMin;
        getmin.getMin.setMin = getmin;
        getmin.setMin.getMin = getmin;
        int size = getmin.setMax != null ? getmin.setMax.size() : 0;
        if (size > 0) {
            return getmin.setMax.remove(size - 1);
        }
        return null;
    }

    @Nullable
    public final V setMax() {
        getMin<K, V> getmin = this.setMax.setMin;
        while (true) {
            V v = null;
            if (getmin.equals(this.setMax)) {
                return null;
            }
            int size = getmin.setMax != null ? getmin.setMax.size() : 0;
            if (size > 0) {
                v = getmin.setMax.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            getmin.setMin.getMin = getmin.getMin;
            getmin.getMin.setMin = getmin.setMin;
            this.setMin.remove(getmin.getMax);
            ((setInteractionEnabled) getmin.getMax).getMax();
            getmin = getmin.setMin;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (getMin<K, V> getmin = this.setMax.getMin; !getmin.equals(this.setMax); getmin = getmin.getMin) {
            z = true;
            sb.append('{');
            sb.append(getmin.getMax);
            sb.append(':');
            sb.append(getmin.setMax != null ? getmin.setMax.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }

    static class getMin<K, V> {
        final K getMax;
        getMin<K, V> getMin;
        List<V> setMax;
        getMin<K, V> setMin;

        getMin() {
            this((Object) null);
        }

        getMin(K k) {
            this.setMin = this;
            this.getMin = this;
            this.getMax = k;
        }
    }
}
