package o;

import o.b;

public final class IgnorePermissionPoint implements getAdapterPosition<RVGroup> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<handleMessage> amcsConfigEntityDataProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getPermissions> contactDeviceNameMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<startH5OpenAuth> reportReasonsConfigMapperProvider;
    private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;
    private final b.C0007b<setApiLevelStr> socialMediaDataFactoryProvider;
    private final b.C0007b<getLink> socialPreferencesDataFactoryProvider;
    private final b.C0007b<getOrigin> userConfigEntityRepositoryProvider;

    public IgnorePermissionPoint(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<setApiLevelStr> bVar6, b.C0007b<getPermissions> bVar7, b.C0007b<getLink> bVar8, b.C0007b<handleMessage> bVar9, b.C0007b<onCallBack> bVar10, b.C0007b<startH5OpenAuth> bVar11) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.securityGuardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.userConfigEntityRepositoryProvider = bVar5;
        this.socialMediaDataFactoryProvider = bVar6;
        this.contactDeviceNameMapperProvider = bVar7;
        this.socialPreferencesDataFactoryProvider = bVar8;
        this.amcsConfigEntityDataProvider = bVar9;
        this.configEntityDataFactoryProvider = bVar10;
        this.reportReasonsConfigMapperProvider = bVar11;
    }

    public final RVGroup get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.securityGuardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.userConfigEntityRepositoryProvider.get(), this.socialMediaDataFactoryProvider.get(), this.contactDeviceNameMapperProvider.get(), this.socialPreferencesDataFactoryProvider.get(), this.amcsConfigEntityDataProvider.get(), this.configEntityDataFactoryProvider.get(), this.reportReasonsConfigMapperProvider.get());
    }

    public static IgnorePermissionPoint create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getOrigin> bVar5, b.C0007b<setApiLevelStr> bVar6, b.C0007b<getPermissions> bVar7, b.C0007b<getLink> bVar8, b.C0007b<handleMessage> bVar9, b.C0007b<onCallBack> bVar10, b.C0007b<startH5OpenAuth> bVar11) {
        return new IgnorePermissionPoint(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11);
    }

    public static RVGroup newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r14, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getOrigin getorigin, setApiLevelStr setapilevelstr, getPermissions getpermissions, getLink getlink, handleMessage handlemessage, onCallBack oncallback, startH5OpenAuth starth5openauth) {
        return new RVGroup(dialogLayout, r14, backKeyDownPoint, getapplaunchparams, getorigin, setapilevelstr, getpermissions, getlink, handlemessage, oncallback, starth5openauth);
    }
}
