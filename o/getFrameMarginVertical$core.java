package o;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import id.dana.data.base.UnInitializedSecuredPreferencesException;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.BridgeResponse;
import o.ErrId;
import o.PackageDownloadRequest;
import o.PermissionModel;
import o.RVResourceUtils;
import o.ScheduleExtensionInvoker;
import o.TitleBarRightButtonView;
import o.box;
import o.customListAdapter;
import o.getTitleView;
import o.horizontalLine;
import o.line;
import o.modifyFirstAndLastPadding;
import o.modifyScrollViewPadding;
import o.paint;
import o.setTitleView;
import o.verticalLine;

@Singleton
public class getFrameMarginVertical$core implements setDrawDivider {
    private final getFrameMarginVerticalLess$core accountPreferences;
    private final removeString<Boolean> balanceVisibility;
    private final Application context;
    private final onRequestPermissionResult deepLinkPreferences;
    private final UniformIpcUtils favoriteServicesPreference;
    private final PackageDownloadRequest.AnonymousClass1 generalPreferences;
    private final handlePostNotification h5ResponseCachePreferences;
    private final getSmallDotView kycRenewalPreference;
    private final unRegisterAppHandler maintenanceBroadcastPreference;
    private final BridgeResponse.NamedValue merchantReviewPreference;
    private final setExitPerform miniProgramPreference;
    private final getSuccessScopes persistanceRelationshipEntityData;
    private final AuthRequestContextModel preferenceSocialSyncEntityData;
    private final registerAndOverride promoAdsPreferences;
    private final setRemoteControlManagement promoPreference;
    private final ExtensionInvoker recentBankEntityData;
    private final ScheduleExtensionInvoker.AnonymousClass3 recentContactEntityData;
    private final onConnectClosed recentPayerEntityData;
    private final isKeyJsApi referralPreferences;
    private final BackKeyDownPoint securityGuardFacade;
    private final isAppPermission sessionPreferences;
    private final getCurrentLongitudeAndLatitude socialPreferences;
    private final onRemoteDebugExitClick splitBillEntityData;
    private final setLaunchParams userConfigPreference;
    private final PermissionModel.AnonymousClass1 userEducationPreference;

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$initAndRetry$35(TitleBarRightButtonView.AnonymousClass1 r0, Boolean bool) throws Exception {
        return r0;
    }

    @Inject
    public getFrameMarginVertical$core(getFrameMarginVerticalLess$core getframemarginverticalless_core, isAppPermission isapppermission, BackKeyDownPoint backKeyDownPoint, PackageDownloadRequest.AnonymousClass1 r8, invokeWithTargetExtensions invokewithtargetextensions, ErrId.ErrCodePermissionForbidden errCodePermissionForbidden, RemoteDebugViewBridgeExtension remoteDebugViewBridgeExtension, RemoteDebugBridgeExtension remoteDebugBridgeExtension, onRequestPermissionResult onrequestpermissionresult, isKeyJsApi iskeyjsapi, handlePostNotification handlepostnotification, setLaunchParams setlaunchparams, Application application, PermissionModel.AnonymousClass1 r18, setRemoteControlManagement setremotecontrolmanagement, UniformIpcUtils uniformIpcUtils, AuthRequestContextModel authRequestContextModel, getSuccessScopes getsuccessscopes, getCurrentLongitudeAndLatitude getcurrentlongitudeandlatitude, BridgeResponse.NamedValue namedValue, getSmallDotView getsmalldotview, setExitPerform setexitperform, unRegisterAppHandler unregisterapphandler, registerAndOverride registerandoverride) {
        removeString<Boolean> max = removeString.getMax();
        this.balanceVisibility = max;
        this.accountPreferences = getframemarginverticalless_core;
        this.sessionPreferences = isapppermission;
        this.generalPreferences = r8;
        this.securityGuardFacade = backKeyDownPoint;
        this.recentBankEntityData = invokewithtargetextensions;
        this.recentContactEntityData = errCodePermissionForbidden;
        this.splitBillEntityData = remoteDebugViewBridgeExtension;
        this.recentPayerEntityData = remoteDebugBridgeExtension;
        this.deepLinkPreferences = onrequestpermissionresult;
        this.referralPreferences = iskeyjsapi;
        this.h5ResponseCachePreferences = handlepostnotification;
        this.userConfigPreference = setlaunchparams;
        this.context = application;
        this.userEducationPreference = r18;
        this.promoPreference = setremotecontrolmanagement;
        this.favoriteServicesPreference = uniformIpcUtils;
        this.preferenceSocialSyncEntityData = authRequestContextModel;
        this.persistanceRelationshipEntityData = getsuccessscopes;
        this.socialPreferences = getcurrentlongitudeandlatitude;
        this.merchantReviewPreference = namedValue;
        this.kycRenewalPreference = getsmalldotview;
        this.miniProgramPreference = setexitperform;
        this.maintenanceBroadcastPreference = unregisterapphandler;
        this.promoAdsPreferences = registerandoverride;
        Objects.requireNonNull(r8);
        max.onNext((Boolean) initObservable(new getButtonsLayout(r8)).blockingFirst());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> init(String str) {
        return initObservable(new getContentLayout(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$init$0(String str) throws Exception {
        this.accountPreferences.init(str);
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> hasAccount() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new box(getframemarginverticalless_core));
    }

    public TitleBarRightButtonView.AnonymousClass1<attach> getAccount() {
        return initObservable(new getRootView(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ attach lambda$getAccount$1() throws Exception {
        attach account = this.accountPreferences.getAccount();
        return account == null ? new attach() : account;
    }

    public Long getLastUpdatedTimeUserPan() {
        try {
            return Long.valueOf(this.accountPreferences.getLastUpdatedTimeUserPan());
        } catch (UnInitializedSecuredPreferencesException e) {
            LoggerWrapper.e(DanaLogConstants.TAG.PREFERENCE_ACCOUNT, e.getMessage());
            return 0L;
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getUserId() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new DialogContentLayout(getframemarginverticalless_core));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveAccount(attach attach) {
        return initObservable(new getTransformation(this, attach));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveAccount$2(attach attach) throws Exception {
        this.accountPreferences.saveAccount(attach);
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<attach> saveAccount(String str, String str2, String str3, String str4, String str5, String str6) {
        return initObservable(new customListAdapter(this, str, str2, str3, str4, str5, str6));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ attach lambda$saveAccount$3(String str, String str2, String str3, String str4, String str5, String str6) throws Exception {
        this.accountPreferences.saveAccount(str, str2, str3, str4, str5, str6);
        return this.accountPreferences.getAccount();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getPhoneNumber() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new getListAdapter(getframemarginverticalless_core));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getAvatarUrl() {
        return initializedRequest(getAccount().map(customListAdapter.Cdefault.length));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAvatarUrl$4(attach attach) throws Exception {
        String avatarUrl = attach.getAvatarUrl();
        return avatarUrl == null ? "" : avatarUrl;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> saveAvatarUrl(String str) {
        return initializedRequest(getAccount().map(new listItems(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$saveAvatarUrl$5(String str, attach attach) throws Exception {
        attach.setAvatarUrl(str);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getAvatarUrl();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getNickname() {
        return initializedRequest(getAccount().map(setTitleLayout.setMin));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$getNickname$6(attach attach) throws Exception {
        String nickname = attach.getNickname();
        return nickname == null ? "" : nickname;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> saveNickname(String str) {
        return initializedRequest(getAccount().map(new setContentLayout(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$saveNickname$7(String str, attach attach) throws Exception {
        attach.setNickname(str);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getNickname();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getUsername() {
        return initializedRequest(getAccount().map(getTitleLayout.getMax));
    }

    public TitleBarRightButtonView.AnonymousClass1<attach> saveUserInfoWithKyc(setTemplateConfig settemplateconfig) {
        return initializedRequest(getAccount().map(new attachDialog(this, settemplateconfig)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ attach lambda$saveUserInfoWithKyc$8(setTemplateConfig settemplateconfig, attach attach) throws Exception {
        attach.setPhoneMask(settemplateconfig.getLoginId());
        attach.setNickname(settemplateconfig.getNickname());
        attach.setAvatarUrl(settemplateconfig.getAvatarUrl());
        attach.setKycLevel(settemplateconfig.getKycLevel());
        attach.setUsername(settemplateconfig.getUsername());
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getKycLevel() {
        return initializedRequest(getAccount().map(attachButtonsLayout.getMin));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> saveKycLevel(String str) {
        return initializedRequest(getAccount().map(new setLayoutMode(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$saveKycLevel$9(String str, attach attach) throws Exception {
        attach.setKycLevel(str);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getKycLevel();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> saveUserPan(String str) {
        return initializedRequest(getAccount().map(new setButtonsLayout(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$saveUserPan$10(String str, attach attach) throws Exception {
        attach.setUserPan(str);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getUserPan();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastUpdatedTimeUserPan(long j) {
        return initObservable(new getLayoutMode(this, j));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveLastUpdatedTimeUserPan$11(long j) throws Exception {
        this.accountPreferences.saveLastUpdatedTimeUserPan(j);
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> setLastActiveTimestamp(Long l) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new paint(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long lambda$setLastActiveTimestamp$12(Long l) throws Exception {
        this.sessionPreferences.setActiveTimestamp(l);
        return this.sessionPreferences.getActiveTimestamp();
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getLastActiveTimestamp() {
        isAppPermission isapppermission = this.sessionPreferences;
        Objects.requireNonNull(isapppermission);
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new line(isapppermission));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> clearAll() {
        return initObservable(new box.Cdefault(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$clearAll$13() throws Exception {
        this.accountPreferences.clearAll();
        this.sessionPreferences.clearAll();
        this.generalPreferences.clearAll();
        this.recentBankEntityData.clearAll();
        this.recentContactEntityData.clearAll();
        this.splitBillEntityData.clearAll();
        this.recentPayerEntityData.clearAll();
        this.deepLinkPreferences.clearAll();
        this.referralPreferences.clearAll();
        this.h5ResponseCachePreferences.clearAll();
        this.userConfigPreference.clearAll();
        this.promoPreference.clearAll();
        this.persistanceRelationshipEntityData.clearAll();
        this.socialPreferences.clearAll();
        this.merchantReviewPreference.clearAll();
        this.kycRenewalPreference.setMax.clearAllData();
        this.miniProgramPreference.getMin.clearAllData();
        this.maintenanceBroadcastPreference.clearAll();
        getAlign.clearCookies(this.context);
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> savePocketLastTimestamp(Long l) {
        return initObservable(new paint.Cdefault(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Long lambda$savePocketLastTimestamp$14(Long l) throws Exception {
        this.accountPreferences.savePocketLastTimestamp(l.longValue());
        return this.accountPreferences.getPocketLastTimestamp();
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getPocketLastTimestamp() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new verticalLine.Cdefault(getframemarginverticalless_core));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getPocketNumUpdated$15(String str) throws Exception {
        return this.accountPreferences.getPocketNumUpdated(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getPocketNumUpdated(String str) {
        return initObservable(new line.Cdefault(this, str));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFirstTime() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new horizontalLine(getframemarginverticalless_core));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> finishFirstTime() {
        return initObservable(new verticalLine(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$finishFirstTime$16() throws Exception {
        this.accountPreferences.finishFirstTime();
        return this.accountPreferences.isFirstTime();
    }

    public TitleBarRightButtonView.AnonymousClass1<registerWorker> getBalance() {
        return initializedRequest(getAccount().map(horizontalLine.Cdefault.length));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ registerWorker lambda$getBalance$17(attach attach) throws Exception {
        registerWorker balance = attach.getBalance();
        if (balance == null) {
            balance = registerWorker.getDefault();
        }
        balance.setPlaceholder(true);
        return balance;
    }

    public TitleBarRightButtonView.AnonymousClass1<registerWorker> saveBalance(registerWorker registerworker) {
        return initializedRequest(getAccount().map(new setRootView(this, registerworker)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ registerWorker lambda$saveBalance$18(registerWorker registerworker, attach attach) throws Exception {
        attach.saveBalance(registerworker);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getBalance();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> setOfflinePublicKey(String str) {
        return initObservable(new DialogScrollView(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$setOfflinePublicKey$19(String str) throws Exception {
        this.accountPreferences.setOfflinePublicKey(str);
        return this.accountPreferences.getOfflinePublicKey();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getOfflinePublicKey() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new getIconView$core(getframemarginverticalless_core));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> setCardCredentialPublicKey(String str) {
        return initObservable(new DialogTitleLayout(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$setCardCredentialPublicKey$20(String str) throws Exception {
        this.accountPreferences.setCardCredentialPublicKey(str);
        return this.accountPreferences.getCardCredentialPublicKey();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getCardCredentialPublicKey() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new CustomUrlSpan(getframemarginverticalless_core));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$setReadInterstitialBanner$21(String str) throws Exception {
        return this.generalPreferences.addInterstitialBannerReadList(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> setReadInterstitialBanner(String str) {
        return initObservable(new getTitleView.core(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$checkReadInterstitialBanner$22(String str) throws Exception {
        return this.generalPreferences.checkBannerReadList(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkReadInterstitialBanner(String str) {
        return initObservable(new setIconView$core(this, str));
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getPhoneMask() {
        return initializedRequest(getAccount().map(setTitleView.core.getMin));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ String lambda$getPhoneMask$23(attach attach) throws Exception {
        String phoneMask = attach.getPhoneMask();
        return phoneMask == null ? "" : phoneMask;
    }

    public TitleBarRightButtonView.AnonymousClass1<String> savePhoneMask(String str) {
        return initializedRequest(getAccount().map(new shouldNotBeVisible(this, str)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$savePhoneMask$24(String str, attach attach) throws Exception {
        attach.setPhoneMask(str);
        this.accountPreferences.saveAccount(attach);
        return this.accountPreferences.getAccount().getPhoneMask();
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getUUID() {
        getFrameMarginVerticalLess$core getframemarginverticalless_core = this.accountPreferences;
        Objects.requireNonNull(getframemarginverticalless_core);
        return initObservable(new getFrameHorizontalMargin(getframemarginverticalless_core));
    }

    public String getUUIDAsString() {
        try {
            return this.accountPreferences.getUUID();
        } catch (UnInitializedSecuredPreferencesException unused) {
            return null;
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<attach> getDrutherDataForUpdate(Context context2) {
        String userId = getBadgeList.getUserId(this.securityGuardFacade, (String) null);
        if (TextUtils.isEmpty(userId)) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NullPointerException());
        }
        getFilePath buildDruther = new RVResourceUtils.getMax(context2).setPreferenceGroup(getFrameMarginVerticalLess$core.SECURED_ACCOUNT_PREFERENCES).setPassword(userId).buildDruther();
        attach attach = (attach) buildDruther.getObject("account", attach.class);
        buildDruther.clearAllData();
        if (attach == null) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NullPointerException());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(attach);
    }

    public TitleBarRightButtonView.AnonymousClass1<RVMain> getPayMethod() {
        return initObservable(new getRootLayout(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RVMain lambda$getPayMethod$25() throws Exception {
        RVMain payMethod = this.accountPreferences.getPayMethod();
        return payMethod == null ? new RVMain() : payMethod;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkShouldShowInterstitialBanner(Long l) {
        return initObservable(new getScrollView(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$checkShouldShowInterstitialBanner$26(Long l) throws Exception {
        return this.generalPreferences.checkShouldShowInterstitialBanner(l);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveInterstitialBannerNextGapTime(Long l) {
        return initObservable(new setScrollView(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveInterstitialBannerNextGapTime$27(Long l) throws Exception {
        return this.generalPreferences.saveInterstitialBannerNextGapTime(l);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkResetInterstitialBannerReadList(Long l) {
        return initObservable(new addCustomView(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$checkResetInterstitialBannerReadList$28(Long l) throws Exception {
        return this.generalPreferences.checkResetInterstitialBannerReadList(l);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveInterstitialBannerNextResetTime(Long l) {
        return initObservable(new haveMoreThanOneChild(this, l));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveInterstitialBannerNextResetTime$29(Long l) throws Exception {
        return this.generalPreferences.saveResetInterstitialBannerTime(l);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getBalanceVisibility() {
        return this.balanceVisibility;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$setBalanceVisibility$30(Boolean bool) throws Exception {
        return this.generalPreferences.setBalanceVisibility(bool);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> setBalanceVisibility(Boolean bool) {
        return initObservable(new getRecyclerView(this, bool)).map(new modifyFirstAndLastPadding(this, bool));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$setBalanceVisibility$31(Boolean bool, Boolean bool2) throws Exception {
        if (Boolean.TRUE.equals(bool2)) {
            this.balanceVisibility.onNext(bool);
        }
        return bool2;
    }

    public TitleBarRightButtonView.AnonymousClass1<RVMain> queryAsset() {
        return initObservable(new addRecyclerView(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RVMain lambda$queryAsset$32() throws Exception {
        RVMain assetCardResult = this.accountPreferences.getAssetCardResult();
        return assetCardResult == null ? new RVMain() : assetCardResult;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> saveLastTransaction(isItemChecked isitemchecked) {
        return initObservable(new modifyScrollViewPadding(this, isitemchecked));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$saveLastTransaction$33(isItemChecked isitemchecked) throws Exception {
        this.accountPreferences.saveLastTransaction(isitemchecked);
        return Boolean.TRUE;
    }

    public TitleBarRightButtonView.AnonymousClass1<isItemChecked> getLatestTransaction() {
        return initObservable(new modifyScrollViewPadding.Cdefault(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ isItemChecked lambda$getLatestTransaction$34() throws Exception {
        isItemChecked latestTransaction = this.accountPreferences.getLatestTransaction();
        return latestTransaction == null ? new isItemChecked() : latestTransaction;
    }

    private <T> TitleBarRightButtonView.AnonymousClass1<T> initObservable(Callable<T> callable) {
        return initializedRequest(TitleBarRightButtonView.AnonymousClass1.fromCallable(callable));
    }

    private <T> TitleBarRightButtonView.AnonymousClass1<T> initializedRequest(TitleBarRightButtonView.AnonymousClass1<T> r2) {
        return r2.onErrorResumeNext((RedDotDrawable<? super Throwable, ? extends TitleBarRightButtonView.AnonymousClass4<? extends T>>) initAndRetry(r2));
    }

    private <T> RedDotDrawable<Throwable, ? extends TitleBarRightButtonView.AnonymousClass1<? extends T>> initAndRetry(TitleBarRightButtonView.AnonymousClass1<T> r2) {
        return new addContentScrollView(this, r2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass1 lambda$initAndRetry$36(TitleBarRightButtonView.AnonymousClass1 r3, Throwable th) throws Exception {
        if (th instanceof UnInitializedSecuredPreferencesException) {
            String userId = getBadgeList.getUserId(this.securityGuardFacade, (String) null);
            if (!TextUtils.isEmpty(userId)) {
                return init(userId).concatMap(new modifyFirstAndLastPadding.Cdefault(r3));
            }
        }
        return TitleBarRightButtonView.AnonymousClass1.error(th);
    }
}
