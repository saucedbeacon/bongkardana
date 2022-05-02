package o;

import id.dana.di.modules.RecentContactModule;
import o.onLoadFailed;

public final class GRVMPMoreMenuItemChangeListener implements getAdapterPosition<onLoadFailed.length> {
    private final RecentContactModule setMax;

    private GRVMPMoreMenuItemChangeListener(RecentContactModule recentContactModule) {
        this.setMax = recentContactModule;
    }

    public static GRVMPMoreMenuItemChangeListener getMax(RecentContactModule recentContactModule) {
        return new GRVMPMoreMenuItemChangeListener(recentContactModule);
    }

    public final /* synthetic */ Object get() {
        onLoadFailed.length min = this.setMax.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
