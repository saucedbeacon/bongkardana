package o;

import android.content.Context;
import o.b;

public final class TinyCheckAppXInterceptor implements getAdapterPosition<DefaultPageFactoryImpl> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public TinyCheckAppXInterceptor(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
        this.serializerProvider = bVar3;
    }

    public final DefaultPageFactoryImpl get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get(), this.serializerProvider.get());
    }

    public static TinyCheckAppXInterceptor create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2, b.C0007b<PluginInstallCallback> bVar3) {
        return new TinyCheckAppXInterceptor(bVar, bVar2, bVar3);
    }

    public static DefaultPageFactoryImpl newInstance(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        return new DefaultPageFactoryImpl(context, appPausePoint, pluginInstallCallback);
    }
}
