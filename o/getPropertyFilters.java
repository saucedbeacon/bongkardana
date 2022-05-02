package o;

import id.dana.di.modules.DanaAppShortcutModule;
import o.doesTransientStatePreventRecycling;

public final class getPropertyFilters implements getAdapterPosition<doesTransientStatePreventRecycling.length> {
    private final DanaAppShortcutModule getMin;

    private getPropertyFilters(DanaAppShortcutModule danaAppShortcutModule) {
        this.getMin = danaAppShortcutModule;
    }

    public static getPropertyFilters length(DanaAppShortcutModule danaAppShortcutModule) {
        return new getPropertyFilters(danaAppShortcutModule);
    }

    public final /* synthetic */ Object get() {
        doesTransientStatePreventRecycling.length max = this.getMin.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
