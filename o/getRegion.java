package o;

import o.b;

public final class getRegion implements getAdapterPosition<gwUrl> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getRegion(b.C0007b<PluginInstallCallback> bVar, b.C0007b<onCallBack> bVar2) {
        this.serializerProvider = bVar;
        this.configEntityDataFactoryProvider = bVar2;
    }

    public final gwUrl get() {
        return newInstance(this.serializerProvider.get(), this.configEntityDataFactoryProvider.get());
    }

    public static getRegion create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<onCallBack> bVar2) {
        return new getRegion(bVar, bVar2);
    }

    public static gwUrl newInstance(PluginInstallCallback pluginInstallCallback, onCallBack oncallback) {
        return new gwUrl(pluginInstallCallback, oncallback);
    }
}
