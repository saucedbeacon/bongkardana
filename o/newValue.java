package o;

import android.content.Context;
import o.b;

public final class newValue implements getAdapterPosition<BridgeResponse> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public newValue(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
        this.serializerProvider = bVar3;
    }

    public final BridgeResponse get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get(), this.serializerProvider.get());
    }

    public static newValue create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        return new newValue(bVar, bVar2, bVar3);
    }

    public static BridgeResponse newInstance(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        return new BridgeResponse(context, appPausePoint, pluginInstallCallback);
    }
}
