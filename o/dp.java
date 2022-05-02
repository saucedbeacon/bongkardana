package o;

import o.b;
import o.dimen;

public final class dp implements getAdapterPosition<font> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<dimenPx> faceAuthenticationEntityDataFactoryProvider;
    private final b.C0007b<dimen.Cdefault> faceAuthenticationEntityMapperProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;

    public dp(b.C0007b<dimenPx> bVar, b.C0007b<dimen.Cdefault> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<b.AnonymousClass3> bVar4, b.C0007b<BackKeyDownPoint> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        this.faceAuthenticationEntityDataFactoryProvider = bVar;
        this.faceAuthenticationEntityMapperProvider = bVar2;
        this.accountEntityDataFactoryProvider = bVar3;
        this.loginEntityDataFactoryProvider = bVar4;
        this.securityGuardFacadeProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
    }

    public final font get() {
        return newInstance(this.faceAuthenticationEntityDataFactoryProvider.get(), this.faceAuthenticationEntityMapperProvider.get(), this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.securityGuardFacadeProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static dp create(b.C0007b<dimenPx> bVar, b.C0007b<dimen.Cdefault> bVar2, b.C0007b<DialogLayout> bVar3, b.C0007b<b.AnonymousClass3> bVar4, b.C0007b<BackKeyDownPoint> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        return new dp(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static font newInstance(dimenPx dimenpx, dimen.Cdefault defaultR, DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams) {
        return new font(dimenpx, defaultR, dialogLayout, r11, backKeyDownPoint, getapplaunchparams);
    }
}
