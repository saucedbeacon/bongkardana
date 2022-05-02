package o;

import id.dana.di.modules.RecentContactModule;
import o.b;
import o.onLoadFailed;

public final class isShowBadge implements getAdapterPosition<onLoadFailed.setMax> {
    private final RecentContactModule getMin;
    private final b.C0007b<GriverGlideExtensionImpl> setMax;

    private isShowBadge(RecentContactModule recentContactModule, b.C0007b<GriverGlideExtensionImpl> bVar) {
        this.getMin = recentContactModule;
        this.setMax = bVar;
    }

    public static isShowBadge setMax(RecentContactModule recentContactModule, b.C0007b<GriverGlideExtensionImpl> bVar) {
        return new isShowBadge(recentContactModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onLoadFailed.setMax max = this.getMin.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
