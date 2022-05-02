package o;

import android.content.Context;
import o.b;

public final class getUpdateMode implements getAdapterPosition<setQueryScene> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getUpdateMode(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final setQueryScene get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getUpdateMode create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getUpdateMode(bVar, bVar2);
    }

    public static setQueryScene newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new setQueryScene(context, pluginInstallCallback);
    }
}
