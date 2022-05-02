package o;

import android.content.Context;
import o.b;

public final class parseUrl implements getAdapterPosition<parseColorLong> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public parseUrl(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final parseColorLong get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static parseUrl create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new parseUrl(bVar, bVar2);
    }

    public static parseColorLong newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new parseColorLong(context, pluginInstallCallback);
    }
}
