package o;

import android.content.Context;
import o.b;

public final class getServiceBeanCount implements getAdapterPosition<registerAndOverride> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getServiceBeanCount(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final registerAndOverride get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getServiceBeanCount create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getServiceBeanCount(bVar, bVar2);
    }

    public static registerAndOverride newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new registerAndOverride(context, pluginInstallCallback);
    }
}
