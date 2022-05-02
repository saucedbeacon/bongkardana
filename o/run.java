package o;

import o.b;

public final class run implements getAdapterPosition<inferTheme> {
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public run(b.C0007b<onCallBack> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.configEntityDataFactoryProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final inferTheme get() {
        return newInstance(this.configEntityDataFactoryProvider.get(), this.serializerProvider.get());
    }

    public static run create(b.C0007b<onCallBack> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new run(bVar, bVar2);
    }

    public static inferTheme newInstance(onCallBack oncallback, PluginInstallCallback pluginInstallCallback) {
        return new inferTheme(oncallback, pluginInstallCallback);
    }
}
