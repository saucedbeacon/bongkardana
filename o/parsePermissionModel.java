package o;

import o.b;

public final class parsePermissionModel implements getAdapterPosition<getPermissionModel> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getPermissionAppId> urlShortenerEntityDataFactoryProvider;

    public parsePermissionModel(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getPermissionAppId> bVar4, b.C0007b<getAppLaunchParams> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.urlShortenerEntityDataFactoryProvider = bVar4;
        this.errorConfigFactoryProvider = bVar5;
    }

    public final getPermissionModel get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.urlShortenerEntityDataFactoryProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static parsePermissionModel create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getPermissionAppId> bVar4, b.C0007b<getAppLaunchParams> bVar5) {
        return new parsePermissionModel(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static getPermissionModel newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getPermissionAppId getpermissionappid, getAppLaunchParams getapplaunchparams) {
        return new getPermissionModel(dialogLayout, r8, backKeyDownPoint, getpermissionappid, getapplaunchparams);
    }
}
