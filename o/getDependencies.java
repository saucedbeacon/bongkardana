package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class getDependencies<T, Y> {
    private long getMax;
    private long getMin;
    private final Map<T, Y> length = new LinkedHashMap(100, 0.75f, true);
    private final long setMin;

    /* access modifiers changed from: protected */
    public void getMin(@NonNull T t, @Nullable Y y) {
    }

    public int setMax(@Nullable Y y) {
        return 1;
    }

    public getDependencies(long j) {
        this.setMin = j;
        this.getMax = j;
    }

    public final synchronized long length() {
        return this.getMax;
    }

    @Nullable
    public final synchronized Y getMax(@NonNull T t) {
        return this.length.get(t);
    }

    @Nullable
    public final synchronized Y length(@NonNull T t, @Nullable Y y) {
        long max = (long) setMax(y);
        if (max >= this.getMax) {
            getMin(t, y);
            return null;
        }
        if (y != null) {
            this.getMin += max;
        }
        Y put = this.length.put(t, y);
        if (put != null) {
            this.getMin -= (long) setMax(put);
            if (!put.equals(y)) {
                getMin(t, put);
            }
        }
        setMax(this.getMax);
        return put;
    }

    @Nullable
    public final synchronized Y length(@NonNull T t) {
        Y remove;
        remove = this.length.remove(t);
        if (remove != null) {
            this.getMin -= (long) setMax(remove);
        }
        return remove;
    }

    public final void getMax() {
        setMax(0);
    }

    /* access modifiers changed from: protected */
    public final synchronized void setMax(long j) {
        while (this.getMin > j) {
            Iterator<Map.Entry<T, Y>> it = this.length.entrySet().iterator();
            Map.Entry next = it.next();
            Object value = next.getValue();
            this.getMin -= (long) setMax(value);
            Object key = next.getKey();
            it.remove();
            getMin(key, value);
        }
    }
}
