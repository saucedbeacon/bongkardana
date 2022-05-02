package o;

import id.dana.contract.payqr.OfflinePayModule;
import o.getPageSize;

public final class FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 implements getAdapterPosition<getPageSize.getMin> {
    private final OfflinePayModule length;

    private FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(OfflinePayModule offlinePayModule) {
        this.length = offlinePayModule;
    }

    public static FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3 getMin(OfflinePayModule offlinePayModule) {
        return new FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3(offlinePayModule);
    }

    public final /* synthetic */ Object get() {
        getPageSize.getMin min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
