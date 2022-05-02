package o;

import o.PackageDownloadRequest;
import o.b;

public final class PageHidePoint implements getAdapterPosition<PageEnterPoint> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;
    private final b.C0007b<getAppLaunchParams> errorConfigFactoryProvider;
    private final b.C0007b<PackageDownloadRequest.AnonymousClass1> generalPreferencesProvider;
    private final b.C0007b<PageExitInterceptPoint> geoFenceDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> guardFacadeProvider;
    private final b.C0007b<b.AnonymousClass3> loginEntityDataFactoryProvider;
    private final b.C0007b<getFrameMarginVerticalLess$core> securedAccountPreferencesProvider;

    public PageHidePoint(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<PageExitInterceptPoint> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<getFrameMarginVerticalLess$core> bVar7, b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar8) {
        this.accountEntityDataFactoryProvider = bVar;
        this.loginEntityDataFactoryProvider = bVar2;
        this.guardFacadeProvider = bVar3;
        this.errorConfigFactoryProvider = bVar4;
        this.geoFenceDataFactoryProvider = bVar5;
        this.deviceInformationProvider = bVar6;
        this.securedAccountPreferencesProvider = bVar7;
        this.generalPreferencesProvider = bVar8;
    }

    public final PageEnterPoint get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.loginEntityDataFactoryProvider.get(), this.guardFacadeProvider.get(), this.errorConfigFactoryProvider.get(), this.geoFenceDataFactoryProvider.get(), this.deviceInformationProvider.get(), this.securedAccountPreferencesProvider.get(), this.generalPreferencesProvider.get());
    }

    public static PageHidePoint create(b.C0007b<DialogLayout> bVar, b.C0007b<b.AnonymousClass3> bVar2, b.C0007b<BackKeyDownPoint> bVar3, b.C0007b<getAppLaunchParams> bVar4, b.C0007b<PageExitInterceptPoint> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<getFrameMarginVerticalLess$core> bVar7, b.C0007b<PackageDownloadRequest.AnonymousClass1> bVar8) {
        return new PageHidePoint(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public static PageEnterPoint newInstance(DialogLayout dialogLayout, b.AnonymousClass3 r11, BackKeyDownPoint backKeyDownPoint, getAppLaunchParams getapplaunchparams, PageExitInterceptPoint pageExitInterceptPoint, getPerformanceTracker getperformancetracker, getFrameMarginVerticalLess$core getframemarginverticalless_core, PackageDownloadRequest.AnonymousClass1 r17) {
        return new PageEnterPoint(dialogLayout, r11, backKeyDownPoint, getapplaunchparams, pageExitInterceptPoint, getperformancetracker, getframemarginverticalless_core, r17);
    }
}
