package o;

import android.content.Context;
import o.b;

public final class getStartClientBundle implements getAdapterPosition<onRequestPermissionResult> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public getStartClientBundle(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final onRequestPermissionResult get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static getStartClientBundle create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new getStartClientBundle(bVar, bVar2);
    }

    public static onRequestPermissionResult newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new onRequestPermissionResult(context, pluginInstallCallback);
    }
}
