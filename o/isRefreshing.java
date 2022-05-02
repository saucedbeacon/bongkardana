package o;

import id.dana.contract.boundcard.BoundCardModule;
import o.b;
import o.setColorSchemeColors;

public final class isRefreshing implements getAdapterPosition<setColorSchemeColors.length> {
    private final b.C0007b<setOnChildScrollUpCallback> getMax;
    private final BoundCardModule getMin;

    public static setColorSchemeColors.length getMax(BoundCardModule boundCardModule, setOnChildScrollUpCallback setonchildscrollupcallback) {
        setColorSchemeColors.length min = boundCardModule.getMin(setonchildscrollupcallback);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        setColorSchemeColors.length min = this.getMin.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
