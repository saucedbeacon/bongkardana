package o;

import android.content.Context;
import o.BridgeResponse;
import o.b;

public final class getErrorMessage implements getAdapterPosition<BridgeResponse.Error> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getErrorMessage(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final BridgeResponse.Error get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getErrorMessage create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getErrorMessage(bVar, bVar2);
    }

    public static BridgeResponse.Error newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new BridgeResponse.Error(context, pluginInstallCallback);
    }
}
