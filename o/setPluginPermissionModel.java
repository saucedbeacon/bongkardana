package o;

import android.content.Context;
import o.b;

public final class setPluginPermissionModel implements getAdapterPosition<getPermissions> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<PluginInstallCallback> serializerProvider;
    private final b.C0007b<getAuthContentResult> socialContactProvider;

    public setPluginPermissionModel(b.C0007b<getAuthContentResult> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<Context> bVar4) {
        this.socialContactProvider = bVar;
        this.serializerProvider = bVar2;
        this.accountEntityDataFactoryProvider = bVar3;
        this.contextProvider = bVar4;
    }

    public final getPermissions get() {
        return newInstance(this.socialContactProvider.get(), this.serializerProvider.get(), this.accountEntityDataFactoryProvider.get(), this.contextProvider.get());
    }

    public static setPluginPermissionModel create(b.C0007b<getAuthContentResult> bVar, b.C0007b<PluginInstallCallback> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<Context> bVar4) {
        return new setPluginPermissionModel(bVar, bVar2, bVar3, bVar4);
    }

    public static getPermissions newInstance(getAuthContentResult getauthcontentresult, PluginInstallCallback pluginInstallCallback, DialogLayout dialogLayout, Context context) {
        return new getPermissions(getauthcontentresult, pluginInstallCallback, dialogLayout, context);
    }
}
