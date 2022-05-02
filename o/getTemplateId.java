package o;

import o.b;

public final class getTemplateId implements getAdapterPosition<setTemplateVersion> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getTemplateVersion> mapperProvider;
    private final b.C0007b<getExtObj> userProfileInfoEntityDataFactoryProvider;

    public getTemplateId(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getExtObj> bVar4, b.C0007b<getTemplateVersion> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.userProfileInfoEntityDataFactoryProvider = bVar4;
        this.mapperProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
    }

    public final setTemplateVersion get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.userProfileInfoEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static getTemplateId create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getExtObj> bVar4, b.C0007b<getTemplateVersion> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        return new getTemplateId(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static setTemplateVersion newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getExtObj getextobj, getTemplateVersion gettemplateversion, getAppLaunchParams getapplaunchparams) {
        return new setTemplateVersion(dialogLayout, r9, backKeyDownPoint, getextobj, gettemplateversion, getapplaunchparams);
    }
}
