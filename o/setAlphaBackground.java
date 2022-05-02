package o;

import o.b;

public final class setAlphaBackground implements getAdapterPosition<BaseTabBar> {
    private final b.C0007b<handleSwitchTab> networkIpgRegistrationUrlEntityDataProvider;

    public setAlphaBackground(b.C0007b<handleSwitchTab> bVar) {
        this.networkIpgRegistrationUrlEntityDataProvider = bVar;
    }

    public final BaseTabBar get() {
        return newInstance(this.networkIpgRegistrationUrlEntityDataProvider.get());
    }

    public static setAlphaBackground create(b.C0007b<handleSwitchTab> bVar) {
        return new setAlphaBackground(bVar);
    }

    public static BaseTabBar newInstance(handleSwitchTab handleswitchtab) {
        return new BaseTabBar(handleswitchtab);
    }
}
