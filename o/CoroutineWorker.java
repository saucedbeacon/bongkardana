package o;

import id.dana.contract.permission.PermissionStateModule;
import o.ViewPager2;
import o.b;

public final class CoroutineWorker implements getAdapterPosition<ViewPager2.OffscreenPageLimit.length> {
    private final PermissionStateModule length;
    private final b.C0007b<ViewPager2.SavedState> setMin;

    public static ViewPager2.OffscreenPageLimit.length setMin(PermissionStateModule permissionStateModule, ViewPager2.SavedState savedState) {
        ViewPager2.OffscreenPageLimit.length max = permissionStateModule.setMax(savedState);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        ViewPager2.OffscreenPageLimit.length max = this.length.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
