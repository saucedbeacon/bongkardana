package o;

import o.b;

public final class getTitleBarRawHeight implements getAdapterPosition<getTabBarHeightSpec> {
    private final b.C0007b<getWidthSpec> globalNetworkPreferenceProvider;

    public getTitleBarRawHeight(b.C0007b<getWidthSpec> bVar) {
        this.globalNetworkPreferenceProvider = bVar;
    }

    public final getTabBarHeightSpec get() {
        return newInstance(this.globalNetworkPreferenceProvider.get());
    }

    public static getTitleBarRawHeight create(b.C0007b<getWidthSpec> bVar) {
        return new getTitleBarRawHeight(bVar);
    }

    public static getTabBarHeightSpec newInstance(getWidthSpec getwidthspec) {
        return new getTabBarHeightSpec(getwidthspec);
    }
}
