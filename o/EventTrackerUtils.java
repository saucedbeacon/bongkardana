package o;

import o.PackageDownloadRequest;
import o.b;

public final class EventTrackerUtils implements getAdapterPosition<apiCallIsFull> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<getExtraAttrByJoinList> factoryProvider;
    private final b.C0007b<PackageDownloadRequest.AnonymousClass1> generalPreferencesProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<EventTrackStore> mapperProvider;

    public EventTrackerUtils(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getExtraAttrByJoinList> bVar4, b.C0007b<EventTrackStore> bVar5, b.C0007b<getAppLaunchParams> bVar6, b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar7) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.factoryProvider = bVar4;
        this.mapperProvider = bVar5;
        this.errorConfigFactoryProvider = bVar6;
        this.generalPreferencesProvider = bVar7;
    }

    public final apiCallIsFull get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.factoryProvider.get(), this.mapperProvider.get(), this.errorConfigFactoryProvider.get(), this.generalPreferencesProvider.get());
    }

    public static EventTrackerUtils create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getExtraAttrByJoinList> bVar4, b.C0007b<EventTrackStore> bVar5, b.C0007b<getAppLaunchParams> bVar6, b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar7) {
        return new EventTrackerUtils(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static apiCallIsFull newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r10, BackKeyDownPoint backKeyDownPoint, getExtraAttrByJoinList getextraattrbyjoinlist, EventTrackStore eventTrackStore, getAppLaunchParams getapplaunchparams, PackageDownloadRequest.AnonymousClass1 r15) {
        return new apiCallIsFull(dialogLayout, r10, backKeyDownPoint, getextraattrbyjoinlist, eventTrackStore, getapplaunchparams, r15);
    }
}
