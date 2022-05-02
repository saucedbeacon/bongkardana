package o;

import o.b;

public final class getIcon implements getAdapterPosition<getSelectedColor> {
    private final b.C0007b<setBadgeSize> geocodeApiProvider;
    private final b.C0007b<getTabbarModel> oauthManagerProvider;

    public getIcon(b.C0007b<setBadgeSize> bVar, b.C0007b<getTabbarModel> bVar2) {
        this.geocodeApiProvider = bVar;
        this.oauthManagerProvider = bVar2;
    }

    public final getSelectedColor get() {
        return newInstance(this.geocodeApiProvider.get(), this.oauthManagerProvider.get());
    }

    public static getIcon create(b.C0007b<setBadgeSize> bVar, b.C0007b<getTabbarModel> bVar2) {
        return new getIcon(bVar, bVar2);
    }

    public static getSelectedColor newInstance(setBadgeSize setbadgesize, getTabbarModel gettabbarmodel) {
        return new getSelectedColor(setbadgesize, gettabbarmodel);
    }
}
