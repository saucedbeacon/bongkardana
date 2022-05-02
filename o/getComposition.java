package o;

import android.content.Context;
import o.b;

public final class getComposition implements getAdapterPosition<setComposition> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getComposition(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final setComposition get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getComposition create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getComposition(bVar, bVar2);
    }

    public static setComposition newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new setComposition(context, pluginInstallCallback);
    }
}
