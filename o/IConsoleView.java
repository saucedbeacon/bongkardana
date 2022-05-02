package o;

import android.content.Context;
import o.b;

public final class IConsoleView implements getAdapterPosition<permit> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public IConsoleView(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final permit get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static IConsoleView create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new IConsoleView(bVar, bVar2);
    }

    public static permit newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new permit(context, pluginInstallCallback);
    }
}
