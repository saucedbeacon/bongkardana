package o;

import android.content.Context;
import o.b;

public final class SceneParamChangePoint implements getAdapterPosition<handlePostNotification> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public SceneParamChangePoint(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final handlePostNotification get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static SceneParamChangePoint create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new SceneParamChangePoint(bVar, bVar2);
    }

    public static handlePostNotification newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new handlePostNotification(context, pluginInstallCallback);
    }
}
