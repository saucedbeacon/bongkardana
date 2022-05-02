package o;

import o.b;

public final class shouldInterceptWebViewNaviJsApi implements getAdapterPosition<hasPermissionOnScheme> {
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public shouldInterceptWebViewNaviJsApi(b.C0007b<PluginInstallCallback> bVar) {
        this.serializerProvider = bVar;
    }

    public final hasPermissionOnScheme get() {
        return newInstance(this.serializerProvider.get());
    }

    public static shouldInterceptWebViewNaviJsApi create(b.C0007b<PluginInstallCallback> bVar) {
        return new shouldInterceptWebViewNaviJsApi(bVar);
    }

    public static hasPermissionOnScheme newInstance(PluginInstallCallback pluginInstallCallback) {
        return new hasPermissionOnScheme(pluginInstallCallback);
    }
}
