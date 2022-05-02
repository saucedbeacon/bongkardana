package o;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.setPositiveButtonIcon;

public final class access$2000 {
    private final getMin setMax;
    private final setSaturation setMin;

    public access$2000(@NonNull setPositiveButtonIcon.length<List<Throwable>> length) {
        this(new setSaturation(length));
    }

    private access$2000(@NonNull setSaturation setsaturation) {
        this.setMax = new getMin();
        this.setMin = setsaturation;
    }

    public final synchronized <Model, Data> void getMax(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull access$1900<? extends Model, ? extends Data> access_1900) {
        this.setMin.getMin(cls, cls2, access_1900);
        this.setMax.setMax.clear();
    }

    @NonNull
    public final synchronized List<Class<?>> getMin(@NonNull Class<?> cls) {
        return this.setMin.getMin(cls);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<A>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <A> java.util.List<o.SolverVariable$Type<A, ?>> setMin(@androidx.annotation.NonNull java.lang.Class<A> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            o.access$2000$getMin r0 = r3.setMax     // Catch:{ all -> 0x0041 }
            java.util.Map<java.lang.Class<?>, o.access$2000$getMin$getMax<?>> r0 = r0.setMax     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            o.access$2000$getMin$getMax r0 = (o.access.2000.getMin.getMax) r0     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0011
        L_0x000f:
            java.util.List<o.SolverVariable$Type<Model, ?>> r0 = r0.setMax     // Catch:{ all -> 0x0041 }
        L_0x0011:
            if (r0 != 0) goto L_0x003f
            o.setSaturation r0 = r3.setMin     // Catch:{ all -> 0x0041 }
            java.util.List r0 = r0.setMax(r4)     // Catch:{ all -> 0x0041 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0041 }
            o.access$2000$getMin r1 = r3.setMax     // Catch:{ all -> 0x0041 }
            java.util.Map<java.lang.Class<?>, o.access$2000$getMin$getMax<?>> r1 = r1.setMax     // Catch:{ all -> 0x0041 }
            o.access$2000$getMin$getMax r2 = new o.access$2000$getMin$getMax     // Catch:{ all -> 0x0041 }
            r2.<init>(r0)     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.put(r4, r2)     // Catch:{ all -> 0x0041 }
            o.access$2000$getMin$getMax r1 = (o.access.2000.getMin.getMax) r1     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x002f
            goto L_0x003f
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Already cached loaders for model: "
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0041 }
            java.lang.String r4 = r1.concat(r4)     // Catch:{ all -> 0x0041 }
            r0.<init>(r4)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r0
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access$2000.setMin(java.lang.Class):java.util.List");
    }

    static class getMin {
        final Map<Class<?>, getMax<?>> setMax = new HashMap();

        getMin() {
        }

        static class getMax<Model> {
            final List<SolverVariable$Type<Model, ?>> setMax;

            public getMax(List<SolverVariable$Type<Model, ?>> list) {
                this.setMax = list;
            }
        }
    }
}
