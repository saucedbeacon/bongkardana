package o;

import android.content.Context;
import o.b;

public final class RVConstants implements getAdapterPosition<RVPerfLogLifeCycleExtension> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public RVConstants(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final RVPerfLogLifeCycleExtension get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static RVConstants create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new RVConstants(bVar, bVar2);
    }

    public static RVPerfLogLifeCycleExtension newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new RVPerfLogLifeCycleExtension(context, pluginInstallCallback);
    }
}
