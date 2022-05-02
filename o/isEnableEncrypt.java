package o;

import android.content.Context;
import o.b;

public final class isEnableEncrypt implements getAdapterPosition<isGetMethod> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public isEnableEncrypt(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final isGetMethod get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static isEnableEncrypt create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new isEnableEncrypt(bVar, bVar2);
    }

    public static isGetMethod newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new isGetMethod(context, pluginInstallCallback);
    }
}
