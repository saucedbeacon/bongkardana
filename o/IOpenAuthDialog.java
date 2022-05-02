package o;

import o.LocalAuthPermissionManager;
import o.b;

public final class IOpenAuthDialog implements getAdapterPosition<LocalAuthPermissionManager.SCOPE> {
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public IOpenAuthDialog(b.C0007b<PluginInstallCallback> bVar) {
        this.serializerProvider = bVar;
    }

    public final LocalAuthPermissionManager.SCOPE get() {
        return newInstance(this.serializerProvider.get());
    }

    public static IOpenAuthDialog create(b.C0007b<PluginInstallCallback> bVar) {
        return new IOpenAuthDialog(bVar);
    }

    public static LocalAuthPermissionManager.SCOPE newInstance(PluginInstallCallback pluginInstallCallback) {
        return new LocalAuthPermissionManager.SCOPE(pluginInstallCallback);
    }
}
