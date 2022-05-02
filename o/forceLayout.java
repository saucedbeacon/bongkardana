package o;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public final class forceLayout {
    private final List<getMin<?, ?>> setMax = new ArrayList();

    public final synchronized <Z, R> void setMin(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull setConstraintSet<Z, R> setconstraintset) {
        this.setMax.add(new getMin(cls, cls2, setconstraintset));
    }

    @NonNull
    public final synchronized <Z, R> setConstraintSet<Z, R> getMax(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return setOnConstraintsChanged.setMin();
        }
        for (getMin next : this.setMax) {
            if (next.length(cls, cls2)) {
                return next.getMax;
            }
        }
        StringBuilder sb = new StringBuilder("No transcoder registered to transcode from ");
        sb.append(cls);
        sb.append(" to ");
        sb.append(cls2);
        throw new IllegalArgumentException(sb.toString());
    }

    @NonNull
    public final synchronized <Z, R> List<Class<R>> setMax(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (getMin<?, ?> length : this.setMax) {
            if (length.length(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    static final class getMin<Z, R> {
        final setConstraintSet<Z, R> getMax;
        private final Class<Z> setMax;
        private final Class<R> setMin;

        getMin(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull setConstraintSet<Z, R> setconstraintset) {
            this.setMax = cls;
            this.setMin = cls2;
            this.getMax = setconstraintset;
        }

        public final boolean length(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.setMax.isAssignableFrom(cls) && cls2.isAssignableFrom(this.setMin);
        }
    }
}
