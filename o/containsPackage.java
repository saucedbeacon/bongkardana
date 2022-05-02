package o;

import o.b;

public final class containsPackage implements getAdapterPosition<setAppVersion> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<onCallBack> configEntityDataFactoryProvider;
    private final b.C0007b<getOnlineResourceFetcher> contactEntityMapperProvider;
    private final b.C0007b<getSnapshotTitleBarParams> contactMapperProvider;
    private final b.C0007b<getSnapshotIndex> contactSyncConfigMapperProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<ResolveExtensionInvoker> recentContactEntityRepositoryProvider;
    private final b.C0007b<registerRule> syncContactDataFactoryProvider;

    public containsPackage(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<onCallBack> bVar4, b.C0007b<registerRule> bVar5, b.C0007b<ResolveExtensionInvoker> bVar6, b.C0007b<getSnapshotTitleBarParams> bVar7, b.C0007b<getOnlineResourceFetcher> bVar8, b.C0007b<getSnapshotIndex> bVar9, b.C0007b<getAppLaunchParams> bVar10) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.configEntityDataFactoryProvider = bVar4;
        this.syncContactDataFactoryProvider = bVar5;
        this.recentContactEntityRepositoryProvider = bVar6;
        this.contactMapperProvider = bVar7;
        this.contactEntityMapperProvider = bVar8;
        this.contactSyncConfigMapperProvider = bVar9;
        this.errorConfigFactoryProvider = bVar10;
    }

    public final setAppVersion get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.configEntityDataFactoryProvider.get(), this.syncContactDataFactoryProvider.get(), this.recentContactEntityRepositoryProvider.get(), this.contactMapperProvider.get(), this.contactEntityMapperProvider.get(), this.contactSyncConfigMapperProvider.get(), this.errorConfigFactoryProvider.get());
    }

    public static containsPackage create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<onCallBack> bVar4, b.C0007b<registerRule> bVar5, b.C0007b<ResolveExtensionInvoker> bVar6, b.C0007b<getSnapshotTitleBarParams> bVar7, b.C0007b<getOnlineResourceFetcher> bVar8, b.C0007b<getSnapshotIndex> bVar9, b.C0007b<getAppLaunchParams> bVar10) {
        return new containsPackage(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10);
    }

    public static setAppVersion newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r13, BackKeyDownPoint backKeyDownPoint, onCallBack oncallback, registerRule registerrule, ResolveExtensionInvoker resolveExtensionInvoker, getSnapshotTitleBarParams getsnapshottitlebarparams, getOnlineResourceFetcher getonlineresourcefetcher, getSnapshotIndex getsnapshotindex, getAppLaunchParams getapplaunchparams) {
        return new setAppVersion(dialogLayout, r13, backKeyDownPoint, oncallback, registerrule, resolveExtensionInvoker, getsnapshottitlebarparams, getonlineresourcefetcher, getsnapshotindex, getapplaunchparams);
    }
}
