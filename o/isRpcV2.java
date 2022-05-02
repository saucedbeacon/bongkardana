package o;

import o.b;

public final class isRpcV2 implements getAdapterPosition<isAllowRetry> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getRequestHeader> savingEntityDataFactoryProvider;
    private final b.C0007b<isBgRpc> savingWithdrawEntityDataFactoryProvider;

    public isRpcV2(b.C0007b<getPerformanceTracker> bVar, b.C0007b<getRequestHeader> bVar2, b.C0007b<isBgRpc> bVar3, b.C0007b<DialogLayout> bVar4, b.C0007b<b.AnonymousClass3> bVar5, b.C0007b<BackKeyDownPoint> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        this.deviceInformationProvider = bVar;
        this.savingEntityDataFactoryProvider = bVar2;
        this.savingWithdrawEntityDataFactoryProvider = bVar3;
        this.accountEntityDataFactoryProvider = bVar4;
        this.loginEntityDataFactoryProvider = bVar5;
        this.guardFacadeProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
    }

    public final isAllowRetry get() {
        return newInstance(this.deviceInformationProvider.get(), this.savingEntityDataFactoryProvider.get(), this.savingWithdrawEntityDataFactoryProvider.get(), this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static isRpcV2 create(b.C0007b<getPerformanceTracker> bVar, b.C0007b<getRequestHeader> bVar2, b.C0007b<isBgRpc> bVar3, b.C0007b<DialogLayout> bVar4, b.C0007b<b.AnonymousClass3> bVar5, b.C0007b<BackKeyDownPoint> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        return new isRpcV2(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static isAllowRetry newInstance(getPerformanceTracker getperformancetracker, getRequestHeader getrequestheader, isBgRpc isbgrpc, DialogLayout dialogLayout, b.AnonymousClass3 r13, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams) {
        return new isAllowRetry(getperformancetracker, getrequestheader, isbgrpc, dialogLayout, r13, backKeyDownPoint, getapplaunchparams);
    }
}
