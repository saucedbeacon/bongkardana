package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.SolverVariable$Type;
import o.setPositiveButtonIcon;

public final class setSaturation {
    private static final SolverVariable$Type<Object, Object> getMax = new getMax();
    private static final getMin setMax = new getMin();
    private final getMin getMin;
    private final setPositiveButtonIcon.length<List<Throwable>> isInside;
    private final List<setMin<?, ?>> length;
    private final Set<setMin<?, ?>> setMin;

    public setSaturation(@NonNull setPositiveButtonIcon.length<List<Throwable>> length2) {
        this(length2, setMax);
    }

    @VisibleForTesting
    private setSaturation(@NonNull setPositiveButtonIcon.length<List<Throwable>> length2, @NonNull getMin getmin) {
        this.length = new ArrayList();
        this.setMin = new HashSet();
        this.isInside = length2;
        this.getMin = getmin;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final synchronized <Model> List<SolverVariable$Type<Model, ?>> setMax(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (setMin next : this.length) {
                if (!this.setMin.contains(next) && next.getMax(cls)) {
                    this.setMin.add(next);
                    SolverVariable$Type<? extends Model, ? extends Data> max = next.setMin.getMax(this);
                    if (max != null) {
                        arrayList.add(max);
                        this.setMin.remove(next);
                    } else {
                        throw new NullPointerException("Argument must not be null");
                    }
                }
            }
        } catch (Throwable th) {
            this.setMin.clear();
            throw th;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final synchronized List<Class<?>> getMin(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (setMin next : this.length) {
            if (!arrayList.contains(next.getMin) && next.getMax(cls)) {
                arrayList.add(next.getMin);
            }
        }
        return arrayList;
    }

    @NonNull
    public final synchronized <Model, Data> SolverVariable$Type<Model, Data> length(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (setMin next : this.length) {
                if (this.setMin.contains(next)) {
                    z = true;
                } else if (next.getMax(cls, cls2)) {
                    this.setMin.add(next);
                    SolverVariable$Type<? extends Model, ? extends Data> max = next.setMin.getMax(this);
                    if (max != null) {
                        arrayList.add(max);
                        this.setMin.remove(next);
                    } else {
                        throw new NullPointerException("Argument must not be null");
                    }
                } else {
                    continue;
                }
            }
            if (arrayList.size() > 1) {
                return new ConstraintWidget$DimensionBehaviour(arrayList, this.isInside);
            } else if (arrayList.size() == 1) {
                return (SolverVariable$Type) arrayList.get(0);
            } else if (z) {
                return getMax;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.setMin.clear();
            throw th;
        }
    }

    static class setMin<Model, Data> {
        final Class<Data> getMin;
        private final Class<Model> length;
        final access$1900<? extends Model, ? extends Data> setMin;

        public setMin(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull access$1900<? extends Model, ? extends Data> access_1900) {
            this.length = cls;
            this.getMin = cls2;
            this.setMin = access_1900;
        }

        public final boolean getMax(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return getMax(cls) && this.getMin.isAssignableFrom(cls2);
        }

        public final boolean getMax(@NonNull Class<?> cls) {
            return this.length.isAssignableFrom(cls);
        }
    }

    static class getMin {
        getMin() {
        }
    }

    static class getMax implements SolverVariable$Type<Object, Object> {
        public final boolean getMin(@NonNull Object obj) {
            return false;
        }

        @Nullable
        public final SolverVariable$Type.setMax<Object> setMin(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) {
            return null;
        }

        getMax() {
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized <Model, Data> void getMin(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull access$1900<? extends Model, ? extends Data> access_1900) {
        this.length.add(this.length.size(), new setMin(cls, cls2, access_1900));
    }
}
