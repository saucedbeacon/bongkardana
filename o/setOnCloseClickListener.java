package o;

import o.LocalAuthPermissionManager;
import o.b;

public final class setOnCloseClickListener implements getAdapterPosition<LocalAuthPermissionManager.a> {
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setOnCloseClickListener(b.C0007b<PluginInstallCallback> bVar) {
        this.serializerProvider = bVar;
    }

    public final LocalAuthPermissionManager.a get() {
        return newInstance(this.serializerProvider.get());
    }

    public static setOnCloseClickListener create(b.C0007b<PluginInstallCallback> bVar) {
        return new setOnCloseClickListener(bVar);
    }

    public static LocalAuthPermissionManager.a newInstance(PluginInstallCallback pluginInstallCallback) {
        return new LocalAuthPermissionManager.a(pluginInstallCallback);
    }
}
