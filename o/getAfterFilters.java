package o;

import id.dana.di.modules.CoroutinesModule;
import o.APExpansion;

public final class getAfterFilters implements getAdapterPosition<APExpansion.AnonymousClass1> {
    public static APExpansion.AnonymousClass1 setMin() {
        APExpansion.AnonymousClass1 max = CoroutinesModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        APExpansion.AnonymousClass1 max = CoroutinesModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
