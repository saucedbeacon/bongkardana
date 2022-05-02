package o;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.setProgress;

public final class isUsedOnShow {
    private static final setProgress.getMin<?> setMin = new setProgress.getMin<Object>() {
        @NonNull
        public final setProgress<Object> setMax(@NonNull Object obj) {
            return new getMax(obj);
        }

        @NonNull
        public final Class<Object> setMin() {
            throw new UnsupportedOperationException("Not implemented");
        }
    };
    private final Map<Class<?>, setProgress.getMin<?>> length = new HashMap();

    public final synchronized void getMin(@NonNull setProgress.getMin<?> getmin) {
        this.length.put(getmin.setMin(), getmin);
    }

    @NonNull
    public final synchronized <T> setProgress<T> setMin(@NonNull T t) {
        setProgress.getMin<?> getmin;
        if (t != null) {
            getmin = this.length.get(t.getClass());
            if (getmin == null) {
                Iterator<setProgress.getMin<?>> it = this.length.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    setProgress.getMin<?> next = it.next();
                    if (next.setMin().isAssignableFrom(t.getClass())) {
                        getmin = next;
                        break;
                    }
                }
            }
            if (getmin == null) {
                getmin = setMin;
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
        return getmin.setMax(t);
    }

    static final class getMax implements setProgress<Object> {
        private final Object getMax;

        public final void getMax() {
        }

        getMax(@NonNull Object obj) {
            this.getMax = obj;
        }

        @NonNull
        public final Object getMin() {
            return this.getMax;
        }
    }
}
