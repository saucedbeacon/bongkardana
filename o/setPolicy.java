package o;

import android.content.Context;
import o.b;

public final class setPolicy implements getAdapterPosition<setConsumerReady> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setPolicy(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
        this.serializerProvider = bVar3;
    }

    public final setConsumerReady get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get(), this.serializerProvider.get());
    }

    public static setPolicy create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        return new setPolicy(bVar, bVar2, bVar3);
    }

    public static setConsumerReady newInstance(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        return new setConsumerReady(context, appPausePoint, pluginInstallCallback);
    }
}
