package o;

import o.CommonExitPerform;
import o.CreatePromptParam;
import o.b;

public final class baseInfo implements getAdapterPosition<lock> {
    private final b.C0007b<DialogLayout> accountEntityDataFactoryProvider;
    private final b.C0007b<positiveButtonClicked> avatarEntityDataFactoryProvider;
    private final b.C0007b<getPageId> deepLinkEntityDataFactoryProvider;
    private final b.C0007b<waitOnFinalized> deepLinkPayloadManagerProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;
    private final b.C0007b<PackageInstallCallback> generalPreferencesDataFactoryProvider;
    private final b.C0007b<CreatePromptParam.PositiveListener> geocodeEntityRepositoryProvider;
    private final b.C0007b<CommonExitPerform.CollectJsApiHandler> pushNotificationEntityDataFactoryProvider;
    private final b.C0007b<getLogType> regManagerProvider;
    private final b.C0007b<setParentId> registrationEntityDataFactoryProvider;
    private final b.C0007b<setStatusCode> registrationMapperProvider;
    private final b.C0007b<access$2300> securityEntityDataFactoryProvider;
    private final b.C0007b<BackKeyDownPoint> securityGuardFacadeProvider;

    public baseInfo(b.C0007b<DialogLayout> bVar, b.C0007b<positiveButtonClicked> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<waitOnFinalized> bVar4, b.C0007b<setParentId> bVar5, b.C0007b<setStatusCode> bVar6, b.C0007b<access$2300> bVar7, b.C0007b<CommonExitPerform.CollectJsApiHandler> bVar8, b.C0007b<PackageInstallCallback> bVar9, b.C0007b<BackKeyDownPoint> bVar10, b.C0007b<getPerformanceTracker> bVar11, b.C0007b<getPageId> bVar12, b.C0007b<CreatePromptParam.PositiveListener> bVar13) {
        this.accountEntityDataFactoryProvider = bVar;
        this.avatarEntityDataFactoryProvider = bVar2;
        this.regManagerProvider = bVar3;
        this.deepLinkPayloadManagerProvider = bVar4;
        this.registrationEntityDataFactoryProvider = bVar5;
        this.registrationMapperProvider = bVar6;
        this.securityEntityDataFactoryProvider = bVar7;
        this.pushNotificationEntityDataFactoryProvider = bVar8;
        this.generalPreferencesDataFactoryProvider = bVar9;
        this.securityGuardFacadeProvider = bVar10;
        this.deviceInformationProvider = bVar11;
        this.deepLinkEntityDataFactoryProvider = bVar12;
        this.geocodeEntityRepositoryProvider = bVar13;
    }

    public final lock get() {
        return newInstance(this.accountEntityDataFactoryProvider.get(), this.avatarEntityDataFactoryProvider.get(), this.regManagerProvider.get(), this.deepLinkPayloadManagerProvider.get(), this.registrationEntityDataFactoryProvider.get(), this.registrationMapperProvider.get(), this.securityEntityDataFactoryProvider.get(), this.pushNotificationEntityDataFactoryProvider.get(), this.generalPreferencesDataFactoryProvider.get(), this.securityGuardFacadeProvider.get(), this.deviceInformationProvider.get(), this.deepLinkEntityDataFactoryProvider.get(), this.geocodeEntityRepositoryProvider.get());
    }

    public static baseInfo create(b.C0007b<DialogLayout> bVar, b.C0007b<positiveButtonClicked> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<waitOnFinalized> bVar4, b.C0007b<setParentId> bVar5, b.C0007b<setStatusCode> bVar6, b.C0007b<access$2300> bVar7, b.C0007b<CommonExitPerform.CollectJsApiHandler> bVar8, b.C0007b<PackageInstallCallback> bVar9, b.C0007b<BackKeyDownPoint> bVar10, b.C0007b<getPerformanceTracker> bVar11, b.C0007b<getPageId> bVar12, b.C0007b<CreatePromptParam.PositiveListener> bVar13) {
        return new baseInfo(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13);
    }

    public static lock newInstance(DialogLayout dialogLayout, positiveButtonClicked positivebuttonclicked, getLogType getlogtype, waitOnFinalized waitonfinalized, setParentId setparentid, setStatusCode setstatuscode, access$2300 access_2300, CommonExitPerform.CollectJsApiHandler collectJsApiHandler, PackageInstallCallback packageInstallCallback, BackKeyDownPoint backKeyDownPoint, getPerformanceTracker getperformancetracker, getPageId getpageid, CreatePromptParam.PositiveListener positiveListener) {
        return new lock(dialogLayout, positivebuttonclicked, getlogtype, waitonfinalized, setparentid, setstatuscode, access_2300, collectJsApiHandler, packageInstallCallback, backKeyDownPoint, getperformancetracker, getpageid, positiveListener);
    }
}
