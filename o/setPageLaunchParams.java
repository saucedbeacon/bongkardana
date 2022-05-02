package o;

import android.content.Context;
import o.b;

public final class setPageLaunchParams implements getAdapterPosition<setPages> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setPageLaunchParams(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final setPages get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setPageLaunchParams create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setPageLaunchParams(bVar, bVar2);
    }

    public static setPages newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new setPages(context, pluginInstallCallback);
    }
}
