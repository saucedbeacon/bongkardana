package o;

import o.b;

public final class setAnimationFromUrl implements getAdapterPosition<setAnimation> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<LottieAnimationView> autoRouteDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<setAnimationFromJson> localAutoRouteEntityProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;

    public setAnimationFromUrl(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<LottieAnimationView> bVar5, b.C0007b<setAnimationFromJson> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.autoRouteDataFactoryProvider = bVar5;
        this.localAutoRouteEntityProvider = bVar6;
    }

    public final setAnimation get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.autoRouteDataFactoryProvider.get(), this.localAutoRouteEntityProvider.get());
    }

    public static setAnimationFromUrl create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<LottieAnimationView> bVar5, b.C0007b<setAnimationFromJson> bVar6) {
        return new setAnimationFromUrl(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static setAnimation newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, LottieAnimationView lottieAnimationView, setAnimationFromJson setanimationfromjson) {
        return new setAnimation(dialogLayout, r9, backKeyDownPoint, getapplaunchparams, lottieAnimationView, setanimationfromjson);
    }
}
