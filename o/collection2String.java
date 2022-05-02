package o;

import android.content.Context;
import o.b;

public final class collection2String implements getAdapterPosition<invokeMethod> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public collection2String(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final invokeMethod get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static collection2String create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new collection2String(bVar, bVar2);
    }

    public static invokeMethod newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new invokeMethod(context, pluginInstallCallback);
    }
}
