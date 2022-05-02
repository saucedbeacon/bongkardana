package o;

import o.PrepareController;
import o.b;

public final class moveToNext implements getAdapterPosition<PrepareController.Status> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getBeginTime> verifyTokenEntityDataFactoryProvider;

    public moveToNext(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getBeginTime> bVar5) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.verifyTokenEntityDataFactoryProvider = bVar5;
    }

    public final PrepareController.Status get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.verifyTokenEntityDataFactoryProvider.get());
    }

    public static moveToNext create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<getBeginTime> bVar5) {
        return new moveToNext(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static PrepareController.Status newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r8, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, getBeginTime getbegintime) {
        return new PrepareController.Status(dialogLayout, r8, backKeyDownPoint, getapplaunchparams, getbegintime);
    }
}
