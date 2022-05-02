package o;

import android.content.Context;
import o.b;

public final class getResponseHelper implements getAdapterPosition<DefaultBridgeCallback> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getResponseHelper(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final DefaultBridgeCallback get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getResponseHelper create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getResponseHelper(bVar, bVar2);
    }

    public static DefaultBridgeCallback newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new DefaultBridgeCallback(context, pluginInstallCallback);
    }
}
