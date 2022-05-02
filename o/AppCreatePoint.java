package o;

import o.b;

public final class AppCreatePoint implements getAdapterPosition<SendMtopResponse> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onAppExit> cacheFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<addParameterMap> deleteFeedResultMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<onAppCreate> factoryProvider;
    private final b.C0007b<RVNativePermissionRequestManager> feedsResultMapperProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;

    public AppCreatePoint(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<addParameterMap> bVar4, b.C0007b<onAppCreate> bVar5, b.C0007b<onAppExit> bVar6, b.C0007b<onCallBack> bVar7, b.C0007b<RVNativePermissionRequestManager> bVar8, b.C0007b<getAppLaunchParams> bVar9) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.deleteFeedResultMapperProvider = bVar4;
        this.factoryProvider = bVar5;
        this.cacheFactoryProvider = bVar6;
        this.configEntityDataFactoryProvider = bVar7;
        this.feedsResultMapperProvider = bVar8;
        this.errorConfigFactoryProvider = bVar9;
    }

    public final SendMtopResponse get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.deleteFeedResultMapperProvider.get(), this.factoryProvider.get(), this.cacheFactoryProvider.get(), this.configEntityDataFactoryProvider.get(), this.feedsResultMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static AppCreatePoint create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<addParameterMap> bVar4, b.C0007b<onAppCreate> bVar5, b.C0007b<onAppExit> bVar6, b.C0007b<onCallBack> bVar7, b.C0007b<RVNativePermissionRequestManager> bVar8, b.C0007b<getAppLaunchParams> bVar9) {
        return new AppCreatePoint(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public static SendMtopResponse newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r12, BackKeyDownPoint backKeyDownPoint, addParameterMap addparametermap, onAppCreate onappcreate, onAppExit onappexit, onCallBack oncallback, RVNativePermissionRequestManager rVNativePermissionRequestManager, getAppLaunchParams getapplaunchparams) {
        return new SendMtopResponse(dialogLayout, r12, backKeyDownPoint, addparametermap, onappcreate, onappexit, oncallback, rVNativePermissionRequestManager, getapplaunchparams);
    }
}
