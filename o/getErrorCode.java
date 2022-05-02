package o;

import android.content.Context;
import o.BridgeResponse;
import o.b;

public final class getErrorCode implements getAdapterPosition<BridgeResponse.NamedValue> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getErrorCode(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final BridgeResponse.NamedValue get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getErrorCode create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getErrorCode(bVar, bVar2);
    }

    public static BridgeResponse.NamedValue newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new BridgeResponse.NamedValue(context, pluginInstallCallback);
    }
}
