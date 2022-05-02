package o;

import id.dana.di.modules.GlobalNetworkModule;
import o.b;
import o.onNext;

public final class SerialContext implements getAdapterPosition<onNext.setMin> {
    private final GlobalNetworkModule setMax;
    private final b.C0007b<BLEServiceUnit> setMin;

    private SerialContext(GlobalNetworkModule globalNetworkModule, b.C0007b<BLEServiceUnit> bVar) {
        this.setMax = globalNetworkModule;
        this.setMin = bVar;
    }

    public static SerialContext length(GlobalNetworkModule globalNetworkModule, b.C0007b<BLEServiceUnit> bVar) {
        return new SerialContext(globalNetworkModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onNext.setMin min = this.setMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
