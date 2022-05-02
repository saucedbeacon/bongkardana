package o;

import id.dana.appshortcut.DanaAppShortcut;
import id.dana.di.modules.DanaAppShortcutModule;
import o.DownloadStep;
import o.PrepareException;
import o.StaggeredGridLayoutManager;
import o.b;
import o.doesTransientStatePreventRecycling;

public final class isForceUse implements DownloadStep.AnonymousClass1 {
    private b.C0007b<StaggeredGridLayoutManager.LayoutParams> getMax;
    private b.C0007b<ToolbarMenuClickListener> getMin;
    private b.C0007b<doesTransientStatePreventRecycling.getMin> length;
    private b.C0007b<doesTransientStatePreventRecycling.length> setMax;
    private b.C0007b<setDefaultFontSize> setMin;

    public /* synthetic */ isForceUse(DanaAppShortcutModule danaAppShortcutModule, PrepareException.AnonymousClass1 r2, byte b) {
        this(danaAppShortcutModule, r2);
    }

    private isForceUse(DanaAppShortcutModule danaAppShortcutModule, PrepareException.AnonymousClass1 r3) {
        this.setMax = isScrap.getMin(getPropertyFilters.length(danaAppShortcutModule));
        setMin setmin = new setMin(r3);
        this.setMin = setmin;
        ToolbarMenu create = ToolbarMenu.create(setmin);
        this.getMin = create;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem max = StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.setMax(this.setMax, create);
        this.getMax = max;
        this.length = isScrap.getMin(getPropertyPreFilters.getMin(danaAppShortcutModule, max));
    }

    public static final class getMin {
        public PrepareException.AnonymousClass1 getMin;
        public DanaAppShortcutModule setMax;

        public /* synthetic */ getMin(byte b) {
            this();
        }

        private getMin() {
        }
    }

    static class setMin implements b.C0007b<setDefaultFontSize> {
        private final PrepareException.AnonymousClass1 setMin;

        setMin(PrepareException.AnonymousClass1 r1) {
            this.setMin = r1;
        }

        public final /* synthetic */ Object get() {
            setDefaultFontSize updateVisuals = this.setMin.updateVisuals();
            if (updateVisuals != null) {
                return updateVisuals;
            }
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    public final void setMax(DanaAppShortcut danaAppShortcut) {
        StaggeredGridLayoutManager.SavedState.setMin(danaAppShortcut, this.length.get());
    }
}
