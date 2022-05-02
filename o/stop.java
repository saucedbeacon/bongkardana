package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class stop<K, V> implements Iterable<Map.Entry<K, V>> {
    public int getMax = 0;
    public WeakHashMap<equals<K, V>, Boolean> getMin = new WeakHashMap<>();
    public getMin<K, V> length;
    public getMin<K, V> setMax;

    interface equals<K, V> {
        void a_(@NonNull getMin<K, V> getmin);
    }

    /* access modifiers changed from: protected */
    public getMin<K, V> setMin(K k) {
        getMin<K, V> getmin = this.setMax;
        while (getmin != null && !getmin.setMax.equals(k)) {
            getmin = getmin.setMin;
        }
        return getmin;
    }

    public V length(@NonNull K k, @NonNull V v) {
        getMin min = setMin(k);
        if (min != null) {
            return min.getMin;
        }
        setMax(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    public final getMin<K, V> setMax(@NonNull K k, @NonNull V v) {
        getMin<K, V> getmin = new getMin<>(k, v);
        this.getMax++;
        getMin<K, V> getmin2 = this.length;
        if (getmin2 == null) {
            this.setMax = getmin;
            this.length = getmin;
            return getmin;
        }
        getmin2.setMin = getmin;
        getmin.length = this.length;
        this.length = getmin;
        return getmin;
    }

    public V length(@NonNull K k) {
        getMin min = setMin(k);
        if (min == null) {
            return null;
        }
        this.getMax--;
        if (!this.getMin.isEmpty()) {
            for (equals<K, V> a_ : this.getMin.keySet()) {
                a_.a_(min);
            }
        }
        if (min.length != null) {
            min.length.setMin = min.setMin;
        } else {
            this.setMax = min.setMin;
        }
        if (min.setMin != null) {
            min.setMin.length = min.length;
        } else {
            this.length = min.length;
        }
        min.setMin = null;
        min.length = null;
        return min.getMin;
    }

    @NonNull
    public Iterator<Map.Entry<K, V>> iterator() {
        length length2 = new length(this.setMax, this.length);
        this.getMin.put(length2, Boolean.FALSE);
        return length2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof stop)) {
            return false;
        }
        stop stop = (stop) obj;
        if (this.getMax != stop.getMax) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = stop.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    static abstract class getMax<K, V> implements Iterator<Map.Entry<K, V>>, equals<K, V> {
        getMin<K, V> setMax;
        getMin<K, V> setMin;

        /* access modifiers changed from: package-private */
        public abstract getMin<K, V> getMin(getMin<K, V> getmin);

        /* access modifiers changed from: package-private */
        public abstract getMin<K, V> length(getMin<K, V> getmin);

        getMax(getMin<K, V> getmin, getMin<K, V> getmin2) {
            this.setMin = getmin2;
            this.setMax = getmin;
        }

        public boolean hasNext() {
            return this.setMax != null;
        }

        public final void a_(@NonNull getMin<K, V> getmin) {
            getMin<K, V> getmin2 = null;
            if (this.setMin == getmin && getmin == this.setMax) {
                this.setMax = null;
                this.setMin = null;
            }
            getMin<K, V> getmin3 = this.setMin;
            if (getmin3 == getmin) {
                this.setMin = getMin(getmin3);
            }
            getMin<K, V> getmin4 = this.setMax;
            if (getmin4 == getmin) {
                getMin<K, V> getmin5 = this.setMin;
                if (!(getmin4 == getmin5 || getmin5 == null)) {
                    getmin2 = length(getmin4);
                }
                this.setMax = getmin2;
            }
        }

        public /* synthetic */ Object next() {
            getMin<K, V> getmin;
            getMin<K, V> getmin2 = this.setMax;
            getMin<K, V> getmin3 = this.setMin;
            if (getmin2 == getmin3 || getmin3 == null) {
                getmin = null;
            } else {
                getmin = length(getmin2);
            }
            this.setMax = getmin;
            return getmin2;
        }
    }

    static class length<K, V> extends getMax<K, V> {
        length(getMin<K, V> getmin, getMin<K, V> getmin2) {
            super(getmin, getmin2);
        }

        /* access modifiers changed from: package-private */
        public final getMin<K, V> length(getMin<K, V> getmin) {
            return getmin.setMin;
        }

        /* access modifiers changed from: package-private */
        public final getMin<K, V> getMin(getMin<K, V> getmin) {
            return getmin.length;
        }
    }

    public static class setMax<K, V> extends getMax<K, V> {
        public setMax(getMin<K, V> getmin, getMin<K, V> getmin2) {
            super(getmin, getmin2);
        }

        /* access modifiers changed from: package-private */
        public final getMin<K, V> length(getMin<K, V> getmin) {
            return getmin.length;
        }

        /* access modifiers changed from: package-private */
        public final getMin<K, V> getMin(getMin<K, V> getmin) {
            return getmin.setMin;
        }
    }

    public class setMin implements Iterator<Map.Entry<K, V>>, equals<K, V> {
        private getMin<K, V> length;
        private boolean setMax = true;

        public setMin() {
        }

        public final void a_(@NonNull getMin<K, V> getmin) {
            getMin<K, V> getmin2 = this.length;
            if (getmin == getmin2) {
                getMin<K, V> getmin3 = getmin2.length;
                this.length = getmin3;
                this.setMax = getmin3 == null;
            }
        }

        public final boolean hasNext() {
            if (this.setMax) {
                return stop.this.setMax != null;
            }
            getMin<K, V> getmin = this.length;
            return (getmin == null || getmin.setMin == null) ? false : true;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            getMin<K, V> getmin;
            if (this.setMax) {
                this.setMax = false;
                getmin = stop.this.setMax;
            } else {
                getMin<K, V> getmin2 = this.length;
                getmin = getmin2 != null ? getmin2.setMin : null;
            }
            this.length = getmin;
            return getmin;
        }
    }

    public static class getMin<K, V> implements Map.Entry<K, V> {
        @NonNull
        final V getMin;
        public getMin<K, V> length;
        @NonNull
        final K setMax;
        getMin<K, V> setMin;

        getMin(@NonNull K k, @NonNull V v) {
            this.setMax = k;
            this.getMin = v;
        }

        @NonNull
        public final K getKey() {
            return this.setMax;
        }

        @NonNull
        public final V getValue() {
            return this.getMin;
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMax);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(this.getMin);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return this.setMax.equals(getmin.setMax) && this.getMin.equals(getmin.getMin);
        }

        public final int hashCode() {
            return this.setMax.hashCode() ^ this.getMin.hashCode();
        }
    }
}
