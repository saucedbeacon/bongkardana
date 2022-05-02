package o;

import id.dana.di.modules.DanaAppShortcutModule;
import o.StaggeredGridLayoutManager;
import o.b;
import o.doesTransientStatePreventRecycling;

public final class getPropertyPreFilters implements getAdapterPosition<doesTransientStatePreventRecycling.getMin> {
    private final b.C0007b<StaggeredGridLayoutManager.LayoutParams> getMax;
    private final DanaAppShortcutModule getMin;

    private getPropertyPreFilters(DanaAppShortcutModule danaAppShortcutModule, b.C0007b<StaggeredGridLayoutManager.LayoutParams> bVar) {
        this.getMin = danaAppShortcutModule;
        this.getMax = bVar;
    }

    public static getPropertyPreFilters getMin(DanaAppShortcutModule danaAppShortcutModule, b.C0007b<StaggeredGridLayoutManager.LayoutParams> bVar) {
        return new getPropertyPreFilters(danaAppShortcutModule, bVar);
    }

    public final /* synthetic */ Object get() {
        doesTransientStatePreventRecycling.getMin length = this.getMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
