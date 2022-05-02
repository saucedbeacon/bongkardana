package o;

import android.content.Context;
import o.b;

public final class getHeaders implements getAdapterPosition<getDataMap> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getHeaders(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final getDataMap get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getHeaders create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getHeaders(bVar, bVar2);
    }

    public static getDataMap newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new getDataMap(context, pluginInstallCallback);
    }
}
