package o;

import o.b;

public final class AppConfigModelInitPoint implements getAdapterPosition<hasInputException> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<defaultPlatform> currencyAmountResultMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getAlias> userInfoEntityDataFactoryProvider;
    private final b.C0007b<PackageQueryPoint> userInfoMapperProvider;

    public AppConfigModelInitPoint(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAlias> bVar4, b.C0007b<defaultPlatform> bVar5, b.C0007b<PackageQueryPoint> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.userInfoEntityDataFactoryProvider = bVar4;
        this.currencyAmountResultMapperProvider = bVar5;
        this.userInfoMapperProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
    }

    public final hasInputException get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.userInfoEntityDataFactoryProvider.get(), this.currencyAmountResultMapperProvider.get(), this.userInfoMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static AppConfigModelInitPoint create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAlias> bVar4, b.C0007b<defaultPlatform> bVar5, b.C0007b<PackageQueryPoint> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        return new AppConfigModelInitPoint(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static hasInputException newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, getAlias getalias, defaultPlatform defaultplatform, PackageQueryPoint packageQueryPoint, getAppLaunchParams getapplaunchparams) {
        return new hasInputException(dialogLayout, r10, backKeyDownPoint, getalias, defaultplatform, packageQueryPoint, getapplaunchparams);
    }
}
