package o;

import o.b;

public final class IOpenAuthNoticeDialog implements getAdapterPosition<setNegativeListener> {
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public IOpenAuthNoticeDialog(b.C0007b<PluginInstallCallback> bVar) {
        this.serializerProvider = bVar;
    }

    public final setNegativeListener get() {
        return newInstance(this.serializerProvider.get());
    }

    public static IOpenAuthNoticeDialog create(b.C0007b<PluginInstallCallback> bVar) {
        return new IOpenAuthNoticeDialog(bVar);
    }

    public static setNegativeListener newInstance(PluginInstallCallback pluginInstallCallback) {
        return new setNegativeListener(pluginInstallCallback);
    }
}
