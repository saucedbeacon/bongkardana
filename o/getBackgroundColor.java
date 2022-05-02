package o;

import o.b;

public final class getBackgroundColor implements getAdapterPosition<TabBarItemColorModel> {
    private final b.C0007b<getTextColor> hereAutosuggestApiProvider;
    private final b.C0007b<setBadgeColor> hereLookupByIdApiProvider;
    private final b.C0007b<getTabbarModel> hereOauthManagerProvider;

    public getBackgroundColor(b.C0007b<getTextColor> bVar, b.C0007b<setBadgeColor> bVar2, b.C0007b<getTabbarModel> bVar3) {
        this.hereAutosuggestApiProvider = bVar;
        this.hereLookupByIdApiProvider = bVar2;
        this.hereOauthManagerProvider = bVar3;
    }

    public final TabBarItemColorModel get() {
        return newInstance(this.hereAutosuggestApiProvider.get(), this.hereLookupByIdApiProvider.get(), this.hereOauthManagerProvider.get());
    }

    public static getBackgroundColor create(b.C0007b<getTextColor> bVar, b.C0007b<setBadgeColor> bVar2, b.C0007b<getTabbarModel> bVar3) {
        return new getBackgroundColor(bVar, bVar2, bVar3);
    }

    public static TabBarItemColorModel newInstance(getTextColor gettextcolor, setBadgeColor setbadgecolor, getTabbarModel gettabbarmodel) {
        return new TabBarItemColorModel(gettextcolor, setbadgecolor, gettabbarmodel);
    }
}
