package o;

import o.StaggeredGridLayoutManager;
import o.b;
import o.doesTransientStatePreventRecycling;

public final class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements getAdapterPosition<StaggeredGridLayoutManager.LayoutParams> {
    private final b.C0007b<ToolbarMenuClickListener> length;
    private final b.C0007b<doesTransientStatePreventRecycling.length> setMax;

    private StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(b.C0007b<doesTransientStatePreventRecycling.length> bVar, b.C0007b<ToolbarMenuClickListener> bVar2) {
        this.setMax = bVar;
        this.length = bVar2;
    }

    public static StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem setMax(b.C0007b<doesTransientStatePreventRecycling.length> bVar, b.C0007b<ToolbarMenuClickListener> bVar2) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new StaggeredGridLayoutManager.LayoutParams(this.setMax.get(), this.length.get());
    }
}
