package o;

import id.dana.contract.globalsearch.GlobalSearchModule;
import o.b;
import o.getAlpha;

public final class ParcelField implements getAdapterPosition<getAlpha.length> {
    private final GlobalSearchModule length;
    private final b.C0007b<ParcelImpl> setMin;

    private ParcelField(GlobalSearchModule globalSearchModule, b.C0007b<ParcelImpl> bVar) {
        this.length = globalSearchModule;
        this.setMin = bVar;
    }

    public static ParcelField length(GlobalSearchModule globalSearchModule, b.C0007b<ParcelImpl> bVar) {
        return new ParcelField(globalSearchModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getAlpha.length min = this.length.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
