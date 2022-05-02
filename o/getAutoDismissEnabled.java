package o;

import id.dana.contract.user.GetPocketInfoModule;
import o.b;
import o.getDialogLayout;

public final class getAutoDismissEnabled implements getAdapterPosition<getDialogLayout.length> {
    private final GetPocketInfoModule getMax;
    private final b.C0007b<LayoutMode> setMax;

    private getAutoDismissEnabled(GetPocketInfoModule getPocketInfoModule, b.C0007b<LayoutMode> bVar) {
        this.getMax = getPocketInfoModule;
        this.setMax = bVar;
    }

    public static getAutoDismissEnabled length(GetPocketInfoModule getPocketInfoModule, b.C0007b<LayoutMode> bVar) {
        return new getAutoDismissEnabled(getPocketInfoModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getDialogLayout.length max = this.getMax.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
