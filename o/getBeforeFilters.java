package o;

import id.dana.di.modules.CoroutinesModule;
import o.APExpansion;

public final class getBeforeFilters implements getAdapterPosition<APExpansion.AnonymousClass1> {

    static final class getMin {
        /* access modifiers changed from: private */
        public static final getBeforeFilters getMax = new getBeforeFilters();
    }

    public static getBeforeFilters getMax() {
        return getMin.getMax;
    }

    public static APExpansion.AnonymousClass1 setMin() {
        APExpansion.AnonymousClass1 length = CoroutinesModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        APExpansion.AnonymousClass1 length = CoroutinesModule.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
