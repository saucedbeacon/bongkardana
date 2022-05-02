package o;

import android.content.Context;
import o.b;

public final class required implements getAdapterPosition<BindingApiContext> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public required(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        this.serializerProvider = bVar;
        this.contextProvider = bVar2;
    }

    public final BindingApiContext get() {
        return newInstance(this.serializerProvider.get(), this.contextProvider.get());
    }

    public static required create(b.C0007b<PluginInstallCallback> bVar, b.C0007b<Context> bVar2) {
        return new required(bVar, bVar2);
    }

    public static BindingApiContext newInstance(PluginInstallCallback pluginInstallCallback, Context context) {
        return new BindingApiContext(pluginInstallCallback, context);
    }
}
