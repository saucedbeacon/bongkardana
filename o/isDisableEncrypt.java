package o;

import android.content.Context;
import o.b;

public final class isDisableEncrypt implements getAdapterPosition<isAllowNonNet> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public isDisableEncrypt(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final isAllowNonNet get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static isDisableEncrypt create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new isDisableEncrypt(bVar, bVar2);
    }

    public static isAllowNonNet newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new isAllowNonNet(context, pluginInstallCallback);
    }
}
