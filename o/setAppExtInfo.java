package o;

import android.content.Context;
import o.b;

public final class setAppExtInfo implements getAdapterPosition<AuthRequestContextModel> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setAppExtInfo(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final AuthRequestContextModel get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setAppExtInfo create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setAppExtInfo(bVar, bVar2);
    }

    public static AuthRequestContextModel newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new AuthRequestContextModel(context, pluginInstallCallback);
    }
}
