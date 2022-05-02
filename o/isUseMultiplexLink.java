package o;

import android.content.Context;
import o.b;

public final class isUseMultiplexLink implements getAdapterPosition<isRpcLoggerLevel> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public isUseMultiplexLink(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final isRpcLoggerLevel get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static isUseMultiplexLink create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new isUseMultiplexLink(bVar, bVar2);
    }

    public static isRpcLoggerLevel newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new isRpcLoggerLevel(context, pluginInstallCallback);
    }
}
