package o;

import o.b;

public final class showOptionMenu implements getAdapterPosition<setDivider> {
    private final b.C0007b<AppRestartExtension> networkHomeEntityDataProvider;

    public showOptionMenu(b.C0007b<AppRestartExtension> bVar) {
        this.networkHomeEntityDataProvider = bVar;
    }

    public final setDivider get() {
        return newInstance(this.networkHomeEntityDataProvider.get());
    }

    public static showOptionMenu create(b.C0007b<AppRestartExtension> bVar) {
        return new showOptionMenu(bVar);
    }

    public static setDivider newInstance(AppRestartExtension appRestartExtension) {
        return new setDivider(appRestartExtension);
    }
}
