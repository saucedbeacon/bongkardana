package o;

import id.dana.contract.deeplink.FeatureModule;
import o.b;
import o.getRunningAnimators;

public final class setDuration implements getAdapterPosition<getRunningAnimators.getMin> {
    private final b.C0007b<getMode> getMin;
    private final FeatureModule length;

    private setDuration(FeatureModule featureModule, b.C0007b<getMode> bVar) {
        this.length = featureModule;
        this.getMin = bVar;
    }

    public static setDuration getMax(FeatureModule featureModule, b.C0007b<getMode> bVar) {
        return new setDuration(featureModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getRunningAnimators.getMin length2 = this.length.length(this.getMin.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
