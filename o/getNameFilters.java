package o;

import id.dana.di.modules.CoroutinesModule;
import o.APExpansion;

public final class getNameFilters implements getAdapterPosition<APExpansion.AnonymousClass1> {

    static final class setMin {
        /* access modifiers changed from: private */
        public static final getNameFilters length = new getNameFilters();
    }

    public static getNameFilters getMax() {
        return setMin.length;
    }

    public static APExpansion.AnonymousClass1 getMin() {
        APExpansion.AnonymousClass1 min = CoroutinesModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        APExpansion.AnonymousClass1 min = CoroutinesModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
