package o;

import android.content.Context;
import o.b;

public final class IAppUpdater implements getAdapterPosition<toFullString> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public IAppUpdater(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final toFullString get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static IAppUpdater create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new IAppUpdater(bVar, bVar2);
    }

    public static toFullString newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new toFullString(context, pluginInstallCallback);
    }
}
