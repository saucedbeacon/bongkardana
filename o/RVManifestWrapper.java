package o;

import android.content.Context;
import o.b;

public final class RVManifestWrapper implements getAdapterPosition<getViewId> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public RVManifestWrapper(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final getViewId get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static RVManifestWrapper create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new RVManifestWrapper(bVar, bVar2);
    }

    public static getViewId newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new getViewId(context, pluginInstallCallback);
    }
}
