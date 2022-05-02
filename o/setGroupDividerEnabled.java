package o;

import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public abstract class setGroupDividerEnabled {
    @Nullable
    private final Map<String, Object> getMax = new HashMap();
    private volatile boolean getMin = false;

    public void getMin() {
    }

    /* access modifiers changed from: package-private */
    @MainThread
    public final void length() {
        this.getMin = true;
        Map<String, Object> map = this.getMax;
        if (map != null) {
            synchronized (map) {
                for (Object next : this.getMax.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable) next).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        getMin();
    }

    /* access modifiers changed from: package-private */
    public final <T> T getMin(String str, T t) {
        T t2;
        synchronized (this.getMax) {
            t2 = this.getMax.get(str);
            if (t2 == null) {
                this.getMax.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.getMin && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }

    public final <T> T getMax(String str) {
        T t;
        Map<String, Object> map = this.getMax;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.getMax.get(str);
        }
        return t;
    }
}
