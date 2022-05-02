package o;

import o.CommonBackPerform;
import o.CommonExitPerform;
import o.b;

public final class onResponse implements getAdapterPosition<EmbedViewConstant> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<CommonExitPerform.CollectJsApiHandler> factoryProvider;
    private final b.C0007b<PackageInstallCallback> generalPreferencesDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<CommonBackPerform.AnonymousClass1> pushNotificationMapperProvider;
    private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;

    public onResponse(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<PackageInstallCallback> bVar4, b.C0007b<CommonExitPerform.CollectJsApiHandler> bVar5, b.C0007b<CommonBackPerform.AnonymousClass1> bVar6, b.C0007b<BackKeyDownPoint> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.generalPreferencesDataFactoryProvider = bVar4;
        this.factoryProvider = bVar5;
        this.pushNotificationMapperProvider = bVar6;
        this.securityGuardFacadeProvider = bVar7;
        this.errorConfigFactoryProvider = bVar8;
    }

    public final EmbedViewConstant get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.generalPreferencesDataFactoryProvider.get(), this.factoryProvider.get(), this.pushNotificationMapperProvider.get(), this.securityGuardFacadeProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static onResponse create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<PackageInstallCallback> bVar4, b.C0007b<CommonExitPerform.CollectJsApiHandler> bVar5, b.C0007b<CommonBackPerform.AnonymousClass1> bVar6, b.C0007b<BackKeyDownPoint> bVar7, b.C0007b<getAppLaunchParams> bVar8) {
        return new onResponse(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static EmbedViewConstant newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, PackageInstallCallback packageInstallCallback, CommonExitPerform.CollectJsApiHandler collectJsApiHandler, CommonBackPerform.AnonymousClass1 r15, BackKeyDownPoint backKeyDownPoint2, getAppLaunchParams getapplaunchparams) {
        return new EmbedViewConstant(dialogLayout, r11, backKeyDownPoint, packageInstallCallback, collectJsApiHandler, r15, backKeyDownPoint2, getapplaunchparams);
    }
}
