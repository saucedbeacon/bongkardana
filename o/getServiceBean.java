package o;

import o.b;

public final class getServiceBean implements getAdapterPosition<deserializ> {
    private final b.C0007b<registerAndOverride> promoAdsPreferencesProvider;
    private final b.C0007b<RVPerfLogLifeCycleExtension> promoCategoryPreferencesProvider;

    public getServiceBean(b.C0007b<RVPerfLogLifeCycleExtension> bVar, b.C0007b<registerAndOverride> bVar2) {
        this.promoCategoryPreferencesProvider = bVar;
        this.promoAdsPreferencesProvider = bVar2;
    }

    public final deserializ get() {
        return newInstance(this.promoCategoryPreferencesProvider.get(), this.promoAdsPreferencesProvider.get());
    }

    public static getServiceBean create(b.C0007b<RVPerfLogLifeCycleExtension> bVar, b.C0007b<registerAndOverride> bVar2) {
        return new getServiceBean(bVar, bVar2);
    }

    public static deserializ newInstance(RVPerfLogLifeCycleExtension rVPerfLogLifeCycleExtension, registerAndOverride registerandoverride) {
        return new deserializ(rVPerfLogLifeCycleExtension, registerandoverride);
    }
}
