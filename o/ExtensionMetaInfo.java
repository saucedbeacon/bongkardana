package o;

import o.b;

public final class ExtensionMetaInfo implements getAdapterPosition<DefaultExtensionRegistry> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<RVJsStatTrackService> paymentModelMapperProvider;
    private final b.C0007b<getBundleName> qrPayEntityDataFactoryProvider;
    private final b.C0007b<access$2300> securityEntityDataFactoryProvider;

    public ExtensionMetaInfo(b.C0007b<b.AnonymousClass3> bVar, b.C0007b<BackKeyDownPoint> bVar2, b.C0007b<getBundleName> bVar3, b.C0007b<access$2300> bVar4, b.C0007b<DialogLayout> bVar5, b.C0007b<RVJsStatTrackService> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        this.loginEntityDataFactoryProvider = bVar;
        this.guardFacadeProvider = bVar2;
        this.qrPayEntityDataFactoryProvider = bVar3;
        this.securityEntityDataFactoryProvider = bVar4;
        this.accountEntityDataFactoryProvider = bVar5;
        this.paymentModelMapperProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
    }

    public final DefaultExtensionRegistry get() {
        return newInstance(this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.qrPayEntityDataFactoryProvider.get(), this.securityEntityDataFactoryProvider.get(), this.accountEntityDataFactoryProvider.get(), this.paymentModelMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static ExtensionMetaInfo create(b.C0007b<b.AnonymousClass3> bVar, b.C0007b<BackKeyDownPoint> bVar2, b.C0007b<getBundleName> bVar3, b.C0007b<access$2300> bVar4, b.C0007b<DialogLayout> bVar5, b.C0007b<RVJsStatTrackService> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        return new ExtensionMetaInfo(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static DefaultExtensionRegistry newInstance(b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getBundleName getbundlename, access$2300 access_2300, DialogLayout dialogLayout, RVJsStatTrackService rVJsStatTrackService, getAppLaunchParams getapplaunchparams) {
        return new DefaultExtensionRegistry(r9, backKeyDownPoint, getbundlename, access_2300, dialogLayout, rVJsStatTrackService, getapplaunchparams);
    }
}
