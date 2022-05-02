package o;

import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.TitleBarRightButtonView;
import o.b;

@Singleton
public class hasInputException extends setMinProgress implements onDescriptorWrite {
    private final defaultPlatform currencyAmountResultMapper;
    private final getAlias userInfoEntityDataFactory;
    private final PackageQueryPoint userInfoMapper;

    /* access modifiers changed from: private */
    public static /* synthetic */ setTemplateConfig lambda$getBalance$4(setTemplateConfig settemplateconfig, registerWorker registerworker) throws Exception {
        return settemplateconfig;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setTemplateConfig lambda$getSingleBalance$6(setTemplateConfig settemplateconfig, registerWorker registerworker) throws Exception {
        return settemplateconfig;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setTemplateConfig lambda$getUserInfo$1(setTemplateConfig settemplateconfig, String str) throws Exception {
        return settemplateconfig;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setTemplateConfig lambda$getUserInfoWithKyc$8(setTemplateConfig settemplateconfig, attach attach) throws Exception {
        return settemplateconfig;
    }

    @Inject
    public hasInputException(DialogLayout dialogLayout, b.AnonymousClass3 r2, BackKeyDownPoint backKeyDownPoint, getAlias getalias, defaultPlatform defaultplatform, PackageQueryPoint packageQueryPoint, getAppLaunchParams getapplaunchparams) {
        super(dialogLayout, r2, backKeyDownPoint, getapplaunchparams);
        this.userInfoEntityDataFactory = getalias;
        this.currencyAmountResultMapper = defaultplatform;
        this.userInfoMapper = packageQueryPoint;
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnect> getUserInfo() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = authenticatedRequest(createUserData().getUserInfo()).repeatWhen(releaseContent.setMax).flatMap(new setFallbackCache(this));
        PackageQueryPoint packageQueryPoint = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint);
        return flatMap.map(new setLanguageAware(packageQueryPoint));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfo$2(setTemplateConfig settemplateconfig) throws Exception {
        return createAccountData().saveNickname(settemplateconfig.getNickname()).map(new setAppxNgRoute(settemplateconfig));
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, String>> checkUserInfo(String str, String str2, String str3) {
        return createUserData().checkUserInfo(str, str2, str3).map(isDisableResourcePackage.setMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<startBleScan> getMiniProgramUserInfo(String str, String str2) {
        TitleBarRightButtonView.AnonymousClass1<setStatus> authenticatedRequest = authenticatedRequest(createUserData().getMiniProgramUserInfo(str, str2));
        PackageQueryPoint packageQueryPoint = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint);
        return authenticatedRequest.map(new asUrl(packageQueryPoint));
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnect> getFaceAuthInfo() {
        TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> authenticatedRequest = authenticatedRequest(createUserData().getFaceAuthInfo());
        PackageQueryPoint packageQueryPoint = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint);
        return authenticatedRequest.map(new setLanguageAware(packageQueryPoint));
    }

    public TitleBarRightButtonView.AnonymousClass1<stopBleScan> getBalance() {
        TitleBarRightButtonView.AnonymousClass1<R> startWith = authenticatedRequest(createUserData().getBalance()).repeatWhen(isAppxNgRoute.setMin).flatMap(new setMainDoc(this)).map(AppModelInitPoint.length).startWith(createAccountData().getBalance());
        defaultPlatform defaultplatform = this.currencyAmountResultMapper;
        Objects.requireNonNull(defaultplatform);
        return startWith.map(new PackageParsedPoint(defaultplatform));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getBalance$5(setTemplateConfig settemplateconfig) throws Exception {
        return createAccountData().saveBalance(settemplateconfig.getBalance()).map(new isLanguageAware(settemplateconfig));
    }

    public TitleBarRightButtonView.AnonymousClass1<stopBleScan> getSingleBalance() {
        TitleBarRightButtonView.AnonymousClass1<R> startWith = authenticatedRequest(createUserData().getBalance()).flatMap(new PluginPackageParsedPoint(this)).map(AppModelInitPoint.length).startWith(createAccountData().getBalance());
        defaultPlatform defaultplatform = this.currencyAmountResultMapper;
        Objects.requireNonNull(defaultplatform);
        return startWith.map(new PackageParsedPoint(defaultplatform));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getSingleBalance$7(setTemplateConfig settemplateconfig) throws Exception {
        return createAccountData().saveBalance(settemplateconfig.getBalance()).map(new setDisableResourcePackage(settemplateconfig));
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnect> getUserInfoWithKyc() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = authenticatedRequest(createUserData().getInfoWithKyc()).flatMap(new mapContent(this));
        TitleBarRightButtonView.AnonymousClass1<attach> account = createAccountData().getAccount();
        PackageQueryPoint packageQueryPoint = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint);
        TitleBarRightButtonView.AnonymousClass1<R> startWith = flatMap.startWith((TitleBarRightButtonView.AnonymousClass4<? extends R>) account.map(new setCanUseFallback(packageQueryPoint)));
        PackageQueryPoint packageQueryPoint2 = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint2);
        return startWith.map(new setLanguageAware(packageQueryPoint2));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfoWithKyc$9(setTemplateConfig settemplateconfig) throws Exception {
        return createAccountData().saveUserInfoWithKyc(settemplateconfig).map(new isCanUseFallback(settemplateconfig));
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnect> getUserInfoWithUserPan() {
        return createAccountData().getAccount().flatMap(new ResourceQuery(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfoWithUserPan$10(attach attach) throws Exception {
        if (attach.getUserPan().isEmpty() || PrepareCallback.isPastToday(getLastUpdatedTimeUserPan().longValue())) {
            return getUserInfoWithUserPanFromNetwork(attach);
        }
        return TitleBarRightButtonView.AnonymousClass1.just(this.userInfoMapper.transformToUserInfoResponse(attach));
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnectAllDevices> checkUsername(String str) {
        return createUserData().checkUsername(str).map(getLocalResource.setMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<disconnect> getUserStatusInfo() {
        TitleBarRightButtonView.AnonymousClass1<setTemplateConfig> authenticatedRequest = authenticatedRequest(createUserData().getUserStatusInfo());
        PackageQueryPoint packageQueryPoint = this.userInfoMapper;
        Objects.requireNonNull(packageQueryPoint);
        return authenticatedRequest.map(new setLanguageAware(packageQueryPoint));
    }

    private ResourceProviderPoint createUserData() {
        return this.userInfoEntityDataFactory.createData("network");
    }

    private TitleBarRightButtonView.AnonymousClass4<disconnect> getUserInfoWithUserPanFromNetwork(attach attach) {
        return authenticatedRequest(createUserData().getUserInfoWithUserPan()).flatMap(new setNeedAutoCompleteHost(this, attach));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfoWithUserPanFromNetwork$13(attach attach, setTemplateConfig settemplateconfig) throws Exception {
        return createAccountData().saveLastUpdatedTimeUserPan(System.currentTimeMillis()).flatMap(new getFallbackUrl(this, settemplateconfig)).map(new isNeedAutoCompleteHost(this, attach));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getUserInfoWithUserPanFromNetwork$11(setTemplateConfig settemplateconfig, Boolean bool) throws Exception {
        return createAccountData().saveUserPan(settemplateconfig.getUserPan());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ disconnect lambda$getUserInfoWithUserPanFromNetwork$12(attach attach, String str) throws Exception {
        attach.setUserPan(str);
        return this.userInfoMapper.transformToUserInfoResponse(attach);
    }

    private Long getLastUpdatedTimeUserPan() {
        return createAccountData().getLastUpdatedTimeUserPan();
    }
}
