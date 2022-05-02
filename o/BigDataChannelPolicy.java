package o;

import android.content.Context;
import o.b;

public final class BigDataChannelPolicy implements getAdapterPosition<onReceiveData> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public BigDataChannelPolicy(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final onReceiveData get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static BigDataChannelPolicy create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new BigDataChannelPolicy(bVar, bVar2);
    }

    public static onReceiveData newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new onReceiveData(context, pluginInstallCallback);
    }
}
