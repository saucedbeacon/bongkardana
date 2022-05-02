package o;

import android.content.Context;
import o.b;

public final class unlock implements getAdapterPosition<poll> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public unlock(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final poll get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static unlock create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new unlock(bVar, bVar2);
    }

    public static poll newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new poll(context, pluginInstallCallback);
    }
}
