package o;

import android.content.Context;
import o.b;

public final class isAutoInstall implements getAdapterPosition<getVersion> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public isAutoInstall(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final getVersion get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static isAutoInstall create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new isAutoInstall(bVar, bVar2);
    }

    public static getVersion newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new getVersion(context, pluginInstallCallback);
    }
}
