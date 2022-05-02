package o;

import android.content.Context;
import o.b;

public final class setRenderMode implements getAdapterPosition<setFrame> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public setRenderMode(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final setFrame get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static setRenderMode create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new setRenderMode(bVar, bVar2);
    }

    public static setFrame newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new setFrame(context, pluginInstallCallback);
    }
}
