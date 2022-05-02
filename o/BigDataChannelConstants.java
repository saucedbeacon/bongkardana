package o;

import android.content.Context;
import o.b;

public final class BigDataChannelConstants implements getAdapterPosition<decrementRef> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public BigDataChannelConstants(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final decrementRef get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static BigDataChannelConstants create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new BigDataChannelConstants(bVar, bVar2);
    }

    public static decrementRef newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new decrementRef(context, pluginInstallCallback);
    }
}
