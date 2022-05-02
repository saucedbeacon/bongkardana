package o;

import android.content.Context;
import o.b;

public final class TypeUtils implements getAdapterPosition<map2String> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public TypeUtils(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final map2String get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static TypeUtils create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new TypeUtils(bVar, bVar2);
    }

    public static map2String newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new map2String(context, pluginInstallCallback);
    }
}
