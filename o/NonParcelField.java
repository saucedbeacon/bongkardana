package o;

import id.dana.contract.globalsearch.GlobalSearchModule;
import o.getAlpha;

public final class NonParcelField implements getAdapterPosition<getAlpha.setMax> {
    private final GlobalSearchModule getMax;

    private NonParcelField(GlobalSearchModule globalSearchModule) {
        this.getMax = globalSearchModule;
    }

    public static NonParcelField length(GlobalSearchModule globalSearchModule) {
        return new NonParcelField(globalSearchModule);
    }

    public final /* synthetic */ Object get() {
        getAlpha.setMax max = this.getMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
