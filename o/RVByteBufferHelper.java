package o;

import o.b;

public final class RVByteBufferHelper implements getAdapterPosition<onChannelCreated> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<RVByteBufferManager> mapperProvider;
    private final b.C0007b<mutable> referralTrackerEntityDataFactoryProvider;

    public RVByteBufferHelper(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<mutable> bVar4, b.C0007b<RVByteBufferManager> bVar5, b.C0007b<onCallBack> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.referralTrackerEntityDataFactoryProvider = bVar4;
        this.mapperProvider = bVar5;
        this.configEntityDataFactoryProvider = bVar6;
        this.errorConfigFactoryProvider = bVar7;
    }

    public final onChannelCreated get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.referralTrackerEntityDataFactoryProvider.get(), this.mapperProvider.get(), this.configEntityDataFactoryProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static RVByteBufferHelper create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<mutable> bVar4, b.C0007b<RVByteBufferManager> bVar5, b.C0007b<onCallBack> bVar6, b.C0007b<getAppLaunchParams> bVar7) {
        return new RVByteBufferHelper(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static onChannelCreated newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, mutable mutable, RVByteBufferManager rVByteBufferManager, onCallBack oncallback, getAppLaunchParams getapplaunchparams) {
        return new onChannelCreated(dialogLayout, r10, backKeyDownPoint, mutable, rVByteBufferManager, oncallback, getapplaunchparams);
    }
}
