package o;

import android.content.Context;
import o.b;

public final class convert2ApiPermissionInfo implements getAdapterPosition<isAppPermission> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;

    public convert2ApiPermissionInfo(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        this.contextProvider = bVar;
        this.serializerProvider = bVar2;
    }

    public final isAppPermission get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }

    public static convert2ApiPermissionInfo create(b.C0007b<Context> bVar, b.C0007b<PluginInstallCallback> bVar2) {
        return new convert2ApiPermissionInfo(bVar, bVar2);
    }

    public static isAppPermission newInstance(Context context, PluginInstallCallback pluginInstallCallback) {
        return new isAppPermission(context, pluginInstallCallback);
    }
}
