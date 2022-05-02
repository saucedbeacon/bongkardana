package o;

import android.content.Context;
import o.b;

public final class RVPerformanceTracker implements getAdapterPosition<errorLog> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public RVPerformanceTracker(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final errorLog get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static RVPerformanceTracker create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new RVPerformanceTracker(bVar, bVar2);
    }

    public static errorLog newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new errorLog(context, pluginInstallCallback);
    }
}
