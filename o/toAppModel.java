package o;

import o.b;

public final class toAppModel implements getAdapterPosition<setExtendInfo> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<setPluginPermissions> mapperProvider;
    private final b.C0007b<setPermission> userEmailAddressEntityDataFactoryProvider;

    public toAppModel(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setPermission> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<setPluginPermissions> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.userEmailAddressEntityDataFactoryProvider = bVar4;
        this.errorConfigFactoryProvider = bVar5;
        this.mapperProvider = bVar6;
    }

    public final setExtendInfo get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.userEmailAddressEntityDataFactoryProvider.get(), this.errorConfigFactoryProvider.get(), this.mapperProvider.get());
    }

    public static toAppModel create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<setPermission> bVar4, b.C0007b<getAppLaunchParams> bVar5, b.C0007b<setPluginPermissions> bVar6) {
        return new toAppModel(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static setExtendInfo newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, setPermission setpermission, getAppLaunchParams getapplaunchparams, setPluginPermissions setpluginpermissions) {
        return new setExtendInfo(dialogLayout, r9, backKeyDownPoint, setpermission, getapplaunchparams, setpluginpermissions);
    }
}
