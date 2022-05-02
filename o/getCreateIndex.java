package o;

import o.b;

public final class getCreateIndex implements getAdapterPosition<changeTabBarStyle> {
    private final b.C0007b<switchTab> amcsH5OnlineConfigProvider;

    public getCreateIndex(b.C0007b<switchTab> bVar) {
        this.amcsH5OnlineConfigProvider = bVar;
    }

    public final changeTabBarStyle get() {
        return newInstance(this.amcsH5OnlineConfigProvider.get());
    }

    public static getCreateIndex create(b.C0007b<switchTab> bVar) {
        return new getCreateIndex(bVar);
    }

    public static changeTabBarStyle newInstance(switchTab switchtab) {
        return new changeTabBarStyle(switchtab);
    }
}
