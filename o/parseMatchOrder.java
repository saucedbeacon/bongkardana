package o;

import id.dana.contract.deeplink.FeatureModule;
import o.b;
import o.getRunningAnimators;

public final class parseMatchOrder implements getAdapterPosition<getRunningAnimators.setMax> {
    private final b.C0007b<getTargets> getMin;
    private final FeatureModule setMax;

    private parseMatchOrder(FeatureModule featureModule, b.C0007b<getTargets> bVar) {
        this.setMax = featureModule;
        this.getMin = bVar;
    }

    public static parseMatchOrder length(FeatureModule featureModule, b.C0007b<getTargets> bVar) {
        return new parseMatchOrder(featureModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getRunningAnimators.setMax max = this.setMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
