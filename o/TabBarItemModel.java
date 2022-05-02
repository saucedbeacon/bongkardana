package o;

import o.b;

public final class TabBarItemModel implements getAdapterPosition<getActiveIcon> {
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public TabBarItemModel(b.C0007b<PluginInstallCallback> bVar) {
        this.serializerProvider = bVar;
    }

    public final getActiveIcon get() {
        return newInstance(this.serializerProvider.get());
    }

    public static TabBarItemModel create(b.C0007b<PluginInstallCallback> bVar) {
        return new TabBarItemModel(bVar);
    }

    public static getActiveIcon newInstance(PluginInstallCallback pluginInstallCallback) {
        return new getActiveIcon(pluginInstallCallback);
    }
}
