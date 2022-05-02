package o;

import o.b;

public final class preInvoke implements getAdapterPosition<WorkerExceptionPoint> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<RVJSApiHandlerProxy> paymentEntityDataFactoryProvider;
    private final b.C0007b<access$2300> securityEntityDataFactoryProvider;

    public preInvoke(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<RVJSApiHandlerProxy> bVar4, b.C0007b<access$2300> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.paymentEntityDataFactoryProvider = bVar4;
        this.securityEntityDataFactoryProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
    }

    public final WorkerExceptionPoint get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.paymentEntityDataFactoryProvider.get(), this.securityEntityDataFactoryProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static preInvoke create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<RVJSApiHandlerProxy> bVar4, b.C0007b<access$2300> bVar5, b.C0007b<getAppLaunchParams> bVar6) {
        return new preInvoke(bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public static WorkerExceptionPoint newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r9, BackKeyDownPoint backKeyDownPoint, RVJSApiHandlerProxy rVJSApiHandlerProxy, access$2300 access_2300, getAppLaunchParams getapplaunchparams) {
        return new WorkerExceptionPoint(dialogLayout, r9, backKeyDownPoint, rVJSApiHandlerProxy, access_2300, getapplaunchparams);
    }
}
