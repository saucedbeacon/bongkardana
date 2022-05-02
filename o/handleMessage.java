package o;

import android.content.Context;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alipay.mobile.security.bio.service.local.NotImplementedException;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.listener.ConfigChangeType;
import com.iap.ac.config.lite.listener.sectionconfig.ChangedDetails;
import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.data.socialshare.ShareAppKey;
import id.dana.domain.bcaoneklik.model.BcaOneKlikInterceptData;
import id.dana.domain.featureconfig.model.ExpressPayTag;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.domain.version.Version;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AppMsgReceiver;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@Singleton
public class handleMessage implements AppMsgReceiver.AnonymousClass2 {
    private static final long CONVERT_MILISECONDS_TO_MINUTE = 60000;
    private static final long CONVERT_MINUTES_TO_DAY = 1440;
    private static final int DEFAULT_MAX_SAVED_BANK = 20;
    private static final long DEFAULT_TIMEOUT_PERIOD = 4320;
    private static final int MAXIMUM_BATCH_SIZE_SYNC_CONTACT = 50;
    private static final int MAXIMUM_REQUEST_MONEY = 10000000;
    private static final int MAXIMUM_SPLIT_BILL_PAYER = 20;
    private static final int MINIMUM_REQUEST_MONEY = 1;
    private static final String NEARBY_RADIUS = "radius";
    private static final String NEARBY_RATING = "rating";
    private static final String NEARBY_REVIEW = "review";
    private static final int ZERO_VALUE = 0;
    private PluginInstallCallback serializer;

    public TitleBarRightButtonView.AnonymousClass1<BcaOneKlikInterceptData> getBcaOneKlikInterceptConfig() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> getElectronicMoneyConfig() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getQrCount() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyBannerConfig() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyFeedConfig() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<IPCCallManager> getX2LBannerConfig() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<List<IPCContextManager>> getX2LSocialLinks() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<setActivityClz> isChangeUsernameEnabled() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSplitMigration() {
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isHomeRevampEnable() {
        return null;
    }

    @Inject
    public handleMessage(Context context, AppPausePoint appPausePoint, PluginInstallCallback pluginInstallCallback) {
        this.serializer = pluginInstallCallback;
        if (!appPausePoint.isInitialized()) {
            appPausePoint.startAmcsService(context, "prod");
        }
    }

    private JSONObject getWidgetSection() {
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("Widget");
        if (sectionConfig != null) {
            return getPositiveString.parseObject(sectionConfig);
        }
        return null;
    }

    private JSONObject getWidgetSectionJsonObject(String str) {
        JSONObject widgetSection = getWidgetSection();
        if (widgetSection != null) {
            return widgetSection.getJSONObject(str);
        }
        return null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Version> getAppVersion() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(AppNode.getMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Version lambda$getAppVersion$0() throws Exception {
        org.json.JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig(MyProfileMenuAction.APP_VERSION);
        Version version = new Version();
        if (jSONConfig != null) {
            version.setLatestMajorVersion(jSONConfig.getString(Version.LATEST_MAJOR_VERSION));
            version.setLatestMinorVersion(jSONConfig.getString(Version.LATEST_MINOR_VERSION));
            version.setLatestPatchVersion(jSONConfig.getString(Version.LATEST_PATCH_VERSION));
            version.setValidMajorVersion(jSONConfig.getString(Version.VALID_MAJOR_VERSION));
            version.setValidMinorVersion(jSONConfig.getString(Version.VALID_MINOR_VERSION));
            version.setValidPatchVersion(jSONConfig.getString(Version.VALID_PATCH_VERSION));
            return version;
        }
        throw null;
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getTimeoutPeriod() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getSplashView.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getSendMoneyRefundTimeout() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getAppType.getMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getSendMoneyNoteCharLimit() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(preCreatePage.setMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getEnableAddNewCard() {
        return getPrepareData.getFeatureSwitch("feature_show_other_card", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getCertificatesUrl() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(pushPage.setMin).map(isFirstPage.length);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ JSONArray lambda$getCertificatesUrl$4() throws Exception {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("certificates");
        return jSONArrayConfig == null ? new JSONArray() : jSONArrayConfig;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$getCertificatesUrl$5(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getPinningMode() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(isDestroyed.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowledgeBasedAuthEnable(String str) {
        return getPrepareData.getFeatureSwitch("forgot_pin".equals(str) ? "feature_knowledge_based_auth" : "feature_kba_setting", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowYourBusinessEnable() {
        return getPrepareData.getFeatureSwitch("feature_know_your_business", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isLogoutEnable() {
        return getPrepareData.getFeatureSwitch("feature_logout", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isTwilioEnrollmentEnable() {
        return getPrepareData.getFeatureSwitch("feature_twilio_enrollment", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoQuestEnable() {
        return getPrepareData.getFeatureSwitch("feature_promoquest", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isPushNotifDiagnosticEnable() {
        return getPrepareData.getFeatureSwitch("feature_push_notif_diagnostic", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<setHorizontalScrollBarEnabled> getFeedbackConfigInfo() {
        return getPrepareData.getFeatureSwitch("feature_know_your_user", getDefaultFeedBackConfig()).map(destroy.setMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setHorizontalScrollBarEnabled lambda$getFeedbackConfigInfo$7(JSONObject jSONObject) throws Exception {
        setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = new setHorizontalScrollBarEnabled();
        sethorizontalscrollbarenabled.setFeedbackEnable(jSONObject.getBoolean(setHorizontalScrollBarEnabled.FEEDBACK_ENABLE).booleanValue());
        sethorizontalscrollbarenabled.setFeedbackUrl(jSONObject.getString(setHorizontalScrollBarEnabled.FEEDBACK_URL));
        return sethorizontalscrollbarenabled;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isDoHoldLogin() {
        return getPrepareData.getFeatureSwitch("feature_holdlogin_splash", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isOfflineF2FPay() {
        return getPrepareData.getFeatureSwitch("feature_f2fpay_V2", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass2> observeMaintenanceBroadcast() {
        IComponent max = IComponent.setMax();
        ConfigCenter.getInstance().addSectionConfigListener("FeatureSwitch", new onUserLeaveHint(this, max));
        return max.startWith(maintenanceBroadcastStarter());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$observeMaintenanceBroadcast$8(IComponent iComponent, String str, org.json.JSONObject jSONObject, ChangedDetails changedDetails) {
        try {
            iComponent.onNext((AppNode.AnonymousClass2) this.serializer.deserialize(jSONObject != null ? jSONObject.getString("feature_maintenance_broadcasting") : null, AppNode.AnonymousClass2.class));
        } catch (Exception e) {
            iComponent.onError(e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isBranchDeepLinkEnable() {
        return getPrepareData.getFeatureSwitch("feature_branch_deeplink", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isMerchantCategoryFilterEnable() {
        return getPrepareData.getFeatureSwitch("feature_nearby_me_merchant_filter", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<setAPWebViewListener> getEnableExpressPayInfo() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getScopeType.setMax).map(createAppMsgReceiver.getMin);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ setAPWebViewListener lambda$getEnableExpressPayInfo$10(JSONObject jSONObject) throws Exception {
        setAPWebViewListener setapwebviewlistener = new setAPWebViewListener();
        if (jSONObject != null) {
            setapwebviewlistener.setEnableInQR(jSONObject.getBooleanValue(ExpressPayTag.FEATURE_SHOW_IN_QR));
            setapwebviewlistener.setEnableInP2P(jSONObject.getBooleanValue(ExpressPayTag.FEATURE_SHOW_IN_P2P));
        }
        return setapwebviewlistener;
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getPlayStoreReviewFeature() {
        return getPrepareData.getFeatureSwitch("feature_store_review", new JSONObject());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeFeature() {
        return getPrepareData.getFeatureSwitch("feature_nearby", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeMapViewFeature() {
        return getPrepareData.getFeatureSwitch("feature_maps_nearby_home", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<getCacheDir> getNearbyAutoSearchConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getMsgHandler.getMin).map(new getEngineProxy(this)).onErrorResumeNext(new bindContext(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getCacheDir lambda$getNearbyAutoSearchConfig$12(JSONObject jSONObject) throws Exception {
        if (jSONObject != null) {
            return new getCacheDir(jSONObject.getBoolean("enabled").booleanValue(), jSONObject.getInteger("interval").intValue(), jSONObject.getInteger(GriverMonitorConstants.KEY_THRESHOLD).intValue());
        }
        return getDefaultNearbyAutoSearchConfig();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getNearbyAutoSearchConfig$13(Throwable th) throws Exception {
        return TitleBarRightButtonView.AnonymousClass1.just(getDefaultNearbyAutoSearchConfig());
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfig() {
        org.json.JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig("nearby_merchant_rank_weighting", (org.json.JSONObject) null);
        try {
            return TitleBarRightButtonView.AnonymousClass1.just(new clearTempPath(Integer.valueOf(jSONConfig.getInt("radius")), jSONConfig.getInt(NEARBY_RATING), jSONConfig.getInt(NEARBY_REVIEW)));
        } catch (Exception e) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfigV2() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getTncAgreementFeature() {
        return getPrepareData.getFeatureSwitch("feature_tnc_agreement", new JSONObject());
    }

    public TitleBarRightButtonView.AnonymousClass1<List<getExtensionManager>> getExpiryChoice() {
        return getPrepareData.getFeatureSwitch("feature_expiry", getDefaultExpiry()).map(new getStartToken(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isShowReferralCode() {
        return getPrepareData.getFeatureSwitch("feature_myreferral", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isLeaderboardEntryEnabled() {
        return getPrepareData.getFeatureSwitch("feature_leaderboard", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToLinkEnable() {
        return getPrepareData.getFeatureSwitch("feature_send_to_link", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToBankEnable() {
        return getPrepareData.getFeatureSwitch("feature_send_money_to_bank", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyPeerToCashEnable() {
        return getPrepareData.getFeatureSwitch("feature_send_money_x2c", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isX2PEnable() {
        return getPrepareData.getFeatureSwitch("feature_send_money_x2p", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyV2Enabled() {
        return getPrepareData.getFeatureSwitch("feature_x2x_v2", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8> getRequestMoneyInfo() {
        return getPrepareData.getFeatureSwitch("feature_request_money", getDefaultRequestMoneyInfo()).map(new preCreateInit(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppNode.AnonymousClass8 lambda$getRequestMoneyInfo$14(JSONObject jSONObject) throws Exception {
        return (AppNode.AnonymousClass8) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass8.class);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isX2BPreKitkatDialogEnable() {
        return getPrepareData.getFeatureSwitch("feature_dialog_pre_kitkat_x2b", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isX2XVoucherEnable() {
        return getPrepareData.getFeatureSwitch("feature_x2x_voucher", Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String lambda$getReferralPageConfig$15() throws Exception {
        return ConfigCenter.getInstance().getStringConfig("referral_page_config", getDefaultReferralPageConfigResult());
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass5> getReferralPageConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new restart(this)).map(new restartFromServer(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppNode.AnonymousClass5 lambda$getReferralPageConfig$16(String str) throws Exception {
        return (AppNode.AnonymousClass5) this.serializer.deserialize(str, AppNode.AnonymousClass5.class);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> monitorPinningMode() {
        IComponent max = IComponent.setMax();
        ConfigCenter.getInstance().addCommonConfigListener("pinning_mode", new onRestart(max));
        return max;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$monitorPinningMode$17(IComponent iComponent, String str, Object obj, ConfigChangeType configChangeType) {
        try {
            iComponent.onNext((Integer) obj);
        } catch (Exception e) {
            iComponent.onError(e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> monitorCertificatesUrl() {
        IComponent max = IComponent.setMax();
        ConfigCenter.getInstance().addCommonConfigListener("certificates", new isTinyApp(this, max));
        return max;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$monitorCertificatesUrl$18(IComponent iComponent, String str, Object obj, ConfigChangeType configChangeType) {
        try {
            iComponent.onNext(transform(JSON.parseArray(obj.toString())));
        } catch (Exception e) {
            iComponent.onError(e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getAndMonitorCertificateWhitelist() {
        IComponent max = IComponent.setMax();
        ConfigCenter.getInstance().addCommonConfigListener("ssl_certificate_whitelist_host", new setAppType(this, max));
        return max.startWith(certificateWhitelist());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$getAndMonitorCertificateWhitelist$19(IComponent iComponent, String str, Object obj, ConfigChangeType configChangeType) {
        try {
            iComponent.onNext(transform(JSON.parseArray(obj.toString())));
        } catch (Exception e) {
            iComponent.onError(e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ org.json.JSONObject lambda$getInterstitialBannerConfig$20() throws Exception {
        return ConfigCenter.getInstance().getJSONConfig("interstitial_banner_config", getPositiveString.parseObject(getDefaultInterstitialBannerConfig()));
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass1> getInterstitialBannerConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new relaunchToUrl(this)).map(new getAppManager(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isReferredUserEnabled() {
        return getPrepareData.getFeatureSwitch("feature_referred_user", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<getStartUrl> getContactSyncConfig() {
        return getPrepareData.getFeatureSwitch("feature_contact_sync", getDefaultContactSyncConfig()).map(new getOriginalStartParams(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ getStartUrl lambda$getContactSyncConfig$21(JSONObject jSONObject) throws Exception {
        return (getStartUrl) this.serializer.deserialize(jSONObject.toString(), getStartUrl.class);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass9> getSplitBillConfig() {
        return getPrepareData.getFeatureSwitch("feature_split_bill_config", getDefaultSplitBillConfig()).map(new getAppId(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ AppNode.AnonymousClass9 lambda$getSplitBillConfig$22(JSONObject jSONObject) throws Exception {
        return (AppNode.AnonymousClass9) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass9.class);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, Boolean>> getWhitelistedDevices() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getStartParams(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map lambda$getWhitelistedDevices$23() throws Exception {
        org.json.JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig("whitelisted_devices");
        if (jSONConfig == null || jSONConfig.length() == 0) {
            return new HashMap();
        }
        return (Map) JSONObject.parseObject(jSONConfig.toString().toLowerCase(), new TypeReference<Map<String, Boolean>>() {
        }, new Feature[0]);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isResendWhatsAppEnable() {
        return getPrepareData.getFeatureSwitch("feature_resend_whatsapp", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoClaimEnable() {
        return getPrepareData.getFeatureSwitch("feature_promo_claim", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getSocialMediaCategoryShare() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getAppVersion(this)).map(addPageReadyListener.setMin);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ JSONArray lambda$getSocialMediaCategoryShare$24() throws Exception {
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("social_media_category_share", getDefaultSocialMediaCategoryConfig());
        if (jSONArrayConfig != null) {
            return jSONArrayConfig;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List lambda$getSocialMediaCategoryShare$25(JSONArray jSONArray) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isUserConfigSyncEnable(String str) {
        return getPrepareData.getFeatureSwitch(str, Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoCenterEnable() {
        return getPrepareData.getFeatureSwitch("feature_promocenter", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass7> getTermsConditionsConfig() {
        return getPrepareData.getFeatureSwitch("feature_terms_conditions", getDefaultTermsConditionsConfig()).map(new getPageByIndex(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentBank() {
        return getPrepareData.getFeatureSwitch("feature_max_recent_bank", 3);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentContact() {
        return getPrepareData.getFeatureSwitch("feature_max_recent_contact", 5);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentRecipient() {
        return getPrepareData.getFeatureSwitch("feature_max_recent_transaction", 20);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isEnableSendRiskLuckyMoney() {
        return getPrepareData.getFeatureSwitch("feature_send_risk_luckymoney", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature(String str) {
        return getPrepareData.getFeatureSwitch(String.format("feature_%s", new Object[]{str}), Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisEnabled() {
        return getPrepareData.getFeatureSwitch("feature_qris", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isReferralSendMoneyEnable() {
        return getPrepareData.getFeatureSwitch("feature_referral_p2p", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardRootCheckEnable() {
        return getPrepareData.getFeatureSwitch("feature_dexguard_root_check", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardHookCheckEnable() {
        return getPrepareData.getFeatureSwitch("feature_dexguard_hook_check", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardTamperCheckEnable() {
        return getPrepareData.getFeatureSwitch("feature_dexguard_tamper_check", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<OTCAcceptExpiryTimeConfigResult> getOTCExpiryConfig() {
        return getPrepareData.getFeatureSwitch("x2c_expiry_time", getOTCExpiryTimeDefaultConfig()).map(getPageByNodeId.setMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1> getPromoCenterConfig(boolean z) {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getSceneParams(this)).map(new getActivePage(this, z));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ org.json.JSONObject lambda$getPromoCenterConfig$26() throws Exception {
        return ConfigCenter.getInstance().getJSONConfig("config_promo_center", getDefaultPromoCenterConfig());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isMixpanelTrackEnable() {
        return getPrepareData.getFeatureSwitch("feature_mixpanel", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxSavedBank() {
        int i;
        Number numberConfig = ConfigCenter.getInstance().getNumberConfig("feature_max_saved_bank");
        if (numberConfig.intValue() == 0) {
            i = 20;
        } else {
            i = numberConfig.intValue();
        }
        return TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(i));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFavoriteServicesEnabled() {
        return getPrepareData.getFeatureSwitch(DefaultEventTracker.SYNC_KEY, Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFaceLoginEnabled() {
        return getPrepareData.getFeatureSwitch("feature_facelogin", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialContactSyncEnabled() {
        return getPrepareData.getFeatureSwitch("feature_friendship_contact_sync", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isRecurringContactSyncEnabled() {
        return getPrepareData.getFeatureSwitch("feature_recurring_contact_sync", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxContactPerBatch() {
        try {
            return TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(getFriendshipSection().getInt("friendship_sync_max_contact")));
        } catch (NullPointerException | JSONException unused) {
            return TitleBarRightButtonView.AnonymousClass1.just(50);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeatureEnable() {
        return getPrepareData.getFeatureSwitch("feature_home_friendship", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureCameraCard() {
        return getPrepareData.getFeatureSwitch("feature_camera_card", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getFeedVersionConfig() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(getAlivePageCount.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureForcedFirstCard() {
        return getPrepareData.getFeatureSwitch("feature_force_first_card", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getFriendshipSyncProgressInterval() {
        return getPrepareData.getFeatureSwitch("friendship_sync_progress_interval", 60);
    }

    public TitleBarRightButtonView.AnonymousClass1<onComplete> getGeofenceConfig() {
        return getPrepareData.getFeatureSwitch("feature_geofence", getDefaultGeofenceConfig()).map(new preProcessStartParams(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureAmlEdd() {
        return getPrepareData.getFeatureSwitch("feature_aml_edd", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getAmlEddMandatory() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(setEngineProxy.getMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<performBack> getDonationCampaignConfig() {
        JSONObject widgetSectionJsonObject = getWidgetSectionJsonObject("widget_donation_campaign");
        if (widgetSectionJsonObject != null) {
            return TitleBarRightButtonView.AnonymousClass1.fromCallable(new getAppContext(this, widgetSectionJsonObject)).doOnError(new popPage(widgetSectionJsonObject));
        }
        return TitleBarRightButtonView.AnonymousClass1.just(new performBack());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDonationCampaignConfig$31(JSONObject jSONObject, Throwable th) throws Exception {
        FirebaseCrashlytics.getInstance().setCustomKey("case", "FastJSON");
        FirebaseCrashlytics instance = FirebaseCrashlytics.getInstance();
        StringBuilder sb = new StringBuilder("campaign: ");
        sb.append(jSONObject.toString());
        instance.log(sb.toString());
        FirebaseCrashlytics.getInstance().recordException(th);
    }

    public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8.AnonymousClass1> getSplashAnimationConfig() {
        return getPrepareData.getFeatureSwitch("splash_animation", getDefaultSplashAnimationConfig()).map(new c(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<org.json.JSONObject> getFriendshipEmojiList() {
        org.json.JSONObject jSONConfig = ConfigCenter.getInstance().getJSONConfig("friendship_emoji_list", new org.json.JSONObject());
        JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("friendship_emoji_order", new JSONArray());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("friendship_emoji_list", jSONConfig);
            jSONObject.put("friendship_emoji_order", jSONArrayConfig);
            return TitleBarRightButtonView.AnonymousClass1.just(jSONObject);
        } catch (JSONException e) {
            return TitleBarRightButtonView.AnonymousClass1.error((Throwable) e);
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<String> getTnCReferralMission() {
        org.json.JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig("FeatureReferral");
        if (sectionConfig == null) {
            return TitleBarRightButtonView.AnonymousClass1.just("https://www.dana.id/id/promo/detail/770/untuk-kamu-yang-terudang-kejar-voucher-dana");
        }
        try {
            return TitleBarRightButtonView.AnonymousClass1.just(sectionConfig.getString("feature_referral_url_tnc"));
        } catch (NullPointerException | JSONException unused) {
            return TitleBarRightButtonView.AnonymousClass1.just("");
        }
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementEnabled() {
        return getPrepareData.getFeatureSwitch("feature_statement", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementDownloadEnabled() {
        return getPrepareData.getFeatureSwitch("feature_download_statement", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGnProxyEnable() {
        return getPrepareData.getFeatureSwitch("feature_gn_proxy", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isAnalyticsModuleEnable() {
        return getPrepareData.getFeatureSwitch("feature_analytics_unified", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isEncryptCardEnabled() {
        return getPrepareData.getFeatureSwitch("feature_encrypt_card", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSecureRecentTransactionEnabled() {
        return getPrepareData.getFeatureSwitch("feature_secure_recent_transaction", Boolean.TRUE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureOldRecentTransactionEnabled() {
        return getPrepareData.getFeatureSwitch("feature_sync_recent_transaction", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getProfileCompletionWidgetVisibility() {
        return getPrepareData.getFeatureSwitch("feature_profile_completion_widget", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTcico() {
        return getPrepareData.getFeatureSwitch("feature_qris_tcico", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTopUpEnable() {
        return getPrepareData.getFeatureSwitch("feature_qris_topup", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Integer> getMaxBankAccount() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(removePage.setMin);
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getDeeplinkEntries() {
        return getPrepareData.getFeatureSwitch("feature_deeplink_entries", new JSONObject());
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getCategoryExplore() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getAppWidgetEnabled() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedDomain() {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayList());
    }

    public TitleBarRightButtonView.AnonymousClass1<onNetworkChanged> getTwilioTimeoutConfig() {
        return getPrepareData.getFeatureSwitch("twilio_timeout_config", getDefaultTwilioTimeoutConfig()).map(new onPageStarted(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<access$002> getFeedHomeConfig() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureAnnouncementEnable() {
        return getPrepareData.getFeatureSwitch("feature_announcement", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getFeatureSkipButtonMerchantList() {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayList());
    }

    public TitleBarRightButtonView.AnonymousClass1<BigDataChannelModel> getFeatureReferralEngagementDialogConfig() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnabled() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Map<String, setVerticalScrollBarEnabled>> getFeatureGlobalSearchCategories() {
        return TitleBarRightButtonView.AnonymousClass1.just(new ArrayMap());
    }

    public TitleBarRightButtonView.AnonymousClass1<APWebViewClient> getGlobalSearchConfig() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedCommentEnable() {
        return getPrepareData.getFeatureSwitch("feature_comment", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getReportReasonsConfig() {
        return TitleBarRightButtonView.AnonymousClass1.empty();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnabled() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getQrisCrossBorderSupportedCountries() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getAddingNameWhitelistedSubMerchantId() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<initResult> getQrisCrossBorderContent(String str) {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<JsonReader$Token>> getGnBindingBenefits() {
        return getPrepareData.getFeatureSwitch("gn_binding_benefit", new JSONObject()).map(new isInited(this));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        return getPrepareData.getFeatureSwitch("feature_global_network", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        return getPrepareData.getFeatureSwitch("feature_global_network_cscanb", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedNotificationEnable() {
        return getPrepareData.getFeatureSwitch("feature_notification_feed", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGoalsBalanceEnable() {
        return getPrepareData.getFeatureSwitch("feature_cumulative_balance", Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> getPromoBannerSliderItemNewSizeEnabled() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantCategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(isShadowNode.getMax).map(exit.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantSubcategories() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(isExited.setMax).map(exit.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantTopups() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(popTo.getMin).map(exit.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONArray> getMerchantOrder() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(onExit.getMax);
    }

    public TitleBarRightButtonView.AnonymousClass1<JSONObject> getH5Entries() {
        return TitleBarRightButtonView.AnonymousClass1.fromCallable(backPressed.length);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingWithdrawOptionsConfig() {
        throw new NotImplementedException();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingCategories() {
        throw new NotImplementedException();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getDefaultFeedFromConfig() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isInterstitialBannerEnabled() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getHomeBannerDefaultContent() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new Exception("No AMCS Config"));
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureFeedHightlightEnabled() {
        return TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedInboxTabEnable() {
        throw new NotImplementedException();
    }

    public TitleBarRightButtonView.AnonymousClass1<access$002> getFeedConfig() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    public TitleBarRightButtonView.AnonymousClass1<findApp> getFeaturePromoAds() {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<startApp> getPromoAdsLocationConfig() {
        throw new UnsupportedOperationException();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedSubMerchantId() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<List<String>> getDeeplinkFeatureConfigList() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> getDeeplinkFeatureConfigByKeys(List<String> list, String str) {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<Long> getDecodeQrTimeout() {
        throw new NotImplementedError();
    }

    public TitleBarRightButtonView.AnonymousClass1<shouldOverrideUrlLoading> getShowAlipayConnectBrandConfig() {
        throw new NotImplementedError();
    }

    @NonNull
    private getCacheDir getDefaultNearbyAutoSearchConfig() {
        return new getCacheDir(true, 1500, 500);
    }

    public TitleBarRightButtonView.AnonymousClass1<postWebMessage> getShareReferralMessageTemplate() {
        return TitleBarRightButtonView.AnonymousClass1.error((Throwable) new NotImplementedError());
    }

    private JSONObject getDefaultGeofenceConfig() {
        return (JSONObject) JSON.toJSON(new onComplete(false, 0, 0));
    }

    private JSONObject getDefaultSplashAnimationConfig() {
        return (JSONObject) JSON.toJSON(new AppNode.AnonymousClass8.AnonymousClass1());
    }

    private JSONObject getDefaultTwilioTimeoutConfig() {
        return (JSONObject) JSON.toJSON(new onNetworkChanged(10, 10));
    }

    /* access modifiers changed from: private */
    /* renamed from: convertJsonToPromoCenterConfig */
    public AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 lambda$getPromoCenterConfig$27(org.json.JSONObject jSONObject, boolean z) {
        AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 r3 = (AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1.class);
        r3.setEnable(z);
        return r3;
    }

    private org.json.JSONObject getDefaultPromoCenterConfig() {
        AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1 r0 = new Object() {
            String buttonIconUrl;
            String buttonTitle;
            String description;
            boolean enable;
            String title;

            private String getStringOrEmpty(String str) {
                return str == null ? "" : str;
            }

            public String getTitle() {
                return this.title;
            }

            public void setTitle(String str) {
                this.title = str;
            }

            public String getDescription() {
                return this.description;
            }

            public void setDescription(String str) {
                this.description = str;
            }

            public boolean isEnable() {
                return this.enable;
            }

            public void setEnable(boolean z) {
                this.enable = z;
            }

            public String getButtonIconUrl() {
                return getStringOrEmpty(this.buttonIconUrl);
            }

            public void setButtonIconUrl(String str) {
                this.buttonIconUrl = str;
            }

            public String getButtonTitle() {
                return getStringOrEmpty(this.buttonTitle);
            }

            public void setButtonTitle(String str) {
                this.buttonTitle = str;
            }
        };
        r0.setTitle("");
        r0.setDescription("");
        r0.setButtonIconUrl("");
        r0.setButtonTitle("");
        return getPositiveString.parseObject((Object) r0);
    }

    private JSONObject getDefaultTermsConditionsConfig() {
        AppNode.AnonymousClass7 r0 = new Object() {
            boolean enable;
            @JSONField(name = "latest_valid_version")
            int latestValidVersion;

            public boolean isEnable() {
                return this.enable;
            }

            public void setEnable(boolean z) {
                this.enable = z;
            }

            public int getLatestValidVersion() {
                return this.latestValidVersion;
            }

            public void setLatestValidVersion(int i) {
                this.latestValidVersion = i;
            }
        };
        r0.setEnable(false);
        r0.setLatestValidVersion(0);
        return (JSONObject) JSON.toJSON(r0);
    }

    private JSONObject getDefaultRequestMoneyInfo() {
        AppNode.AnonymousClass8 r0 = new Object() {
            @JSONField(name = "maximum_amount")
            private int maxAmount;
            @JSONField(name = "minimum_amount")
            private int minAmount;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lid/dana/data/config/source/amcs/result/SplashAnimationConfigResult;", "Ljava/io/Serializable;", "enable", "", "animationFile", "", "(ZLjava/lang/String;)V", "getAnimationFile", "()Ljava/lang/String;", "getEnable", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.AppNode$8$1  reason: invalid class name */
            public final class AnonymousClass1 implements Serializable {
                @NotNull
                String animationFile;
                boolean enable;

                public AnonymousClass1() {
                    this(false, (String) null, 3, (DefaultConstructorMarker) null);
                }

                public static /* synthetic */ AnonymousClass1 copy$default(AnonymousClass1 r0, boolean z, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        z = r0.enable;
                    }
                    if ((i & 2) != 0) {
                        str = r0.animationFile;
                    }
                    return r0.copy(z, str);
                }

                public final boolean component1() {
                    return this.enable;
                }

                @NotNull
                public final String component2() {
                    return this.animationFile;
                }

                @NotNull
                public final AnonymousClass1 copy(boolean z, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "animationFile");
                    return new AnonymousClass1(z, str);
                }

                public final boolean equals(@Nullable Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof AnonymousClass1)) {
                        return false;
                    }
                    AnonymousClass1 r3 = (AnonymousClass1) obj;
                    return this.enable == r3.enable && Intrinsics.areEqual((Object) this.animationFile, (Object) r3.animationFile);
                }

                public final int hashCode() {
                    boolean z = this.enable;
                    if (z) {
                        z = true;
                    }
                    int i = (z ? 1 : 0) * true;
                    String str = this.animationFile;
                    return i + (str != null ? str.hashCode() : 0);
                }

                @NotNull
                public final String toString() {
                    StringBuilder sb = new StringBuilder("SplashAnimationConfigResult(enable=");
                    sb.append(this.enable);
                    sb.append(", animationFile=");
                    sb.append(this.animationFile);
                    sb.append(")");
                    return sb.toString();
                }

                public AnonymousClass1(boolean z, @NotNull String str) {
                    Intrinsics.checkNotNullParameter(str, "animationFile");
                    this.enable = z;
                    this.animationFile = str;
                }

                public final boolean getEnable() {
                    return this.enable;
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ AnonymousClass1(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
                }

                @NotNull
                public final String getAnimationFile() {
                    return this.animationFile;
                }
            }

            public int getMinAmount() {
                return this.minAmount;
            }

            public void setMinAmount(int i) {
                this.minAmount = i;
            }

            public int getMaxAmount() {
                return this.maxAmount;
            }

            public void setMaxAmount(int i) {
                this.maxAmount = i;
            }
        };
        r0.setMinAmount(1);
        r0.setMaxAmount(MAXIMUM_REQUEST_MONEY);
        return (JSONObject) JSON.toJSON(r0);
    }

    private String getDefaultReferralPageConfigResult() {
        AppNode.AnonymousClass5 r0 = new Object() {
            private String referralDescription;
            private String referralEmptyImageUrl;
            private String referralImageUrl;
            private String referralTncDescription;
            private String referralTncUrl;

            public String getReferralDescription() {
                return this.referralDescription;
            }

            public void setReferralDescription(String str) {
                this.referralDescription = str;
            }

            public String getReferralImageUrl() {
                return this.referralImageUrl;
            }

            public void setReferralImageUrl(String str) {
                this.referralImageUrl = str;
            }

            public String getReferralEmptyImageUrl() {
                return this.referralEmptyImageUrl;
            }

            public void setReferralEmptyImageUrl(String str) {
                this.referralEmptyImageUrl = str;
            }

            public String getReferralTncUrl() {
                return this.referralTncUrl;
            }

            public void setReferralTncUrl(String str) {
                this.referralTncUrl = str;
            }

            public String getReferralTncDescription() {
                return this.referralTncDescription;
            }

            public void setReferralTncDescription(String str) {
                this.referralTncDescription = str;
            }
        };
        r0.setReferralDescription("");
        r0.setReferralEmptyImageUrl("");
        r0.setReferralImageUrl("");
        r0.setReferralTncDescription("");
        r0.setReferralTncUrl("");
        return ((JSONObject) JSON.toJSON(r0)).toJSONString();
    }

    private com.alibaba.fastjson.JSONArray getDefaultExpiry() {
        getExtensionManager getextensionmanager = new getExtensionManager();
        getextensionmanager.setExpiryNumber(1);
        getextensionmanager.setExpiryUnit("Hour");
        getextensionmanager.setExpiryDefault(true);
        getExtensionManager getextensionmanager2 = new getExtensionManager();
        getextensionmanager2.setExpiryNumber(1);
        getextensionmanager2.setExpiryUnit("Day");
        getExtensionManager getextensionmanager3 = new getExtensionManager();
        getextensionmanager3.setExpiryNumber(7);
        getextensionmanager3.setExpiryUnit("Days");
        ArrayList arrayList = new ArrayList();
        arrayList.add(getextensionmanager);
        arrayList.add(getextensionmanager2);
        arrayList.add(getextensionmanager3);
        return (com.alibaba.fastjson.JSONArray) JSON.toJSON(arrayList);
    }

    /* access modifiers changed from: private */
    public List<getExtensionManager> convertJsonToListExpiry(com.alibaba.fastjson.JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            arrayList.add((getExtensionManager) this.serializer.deserialize(jSONArray.getString(i), getExtensionManager.class));
        }
        return arrayList;
    }

    private AppNode.AnonymousClass2 maintenanceBroadcastStarter() {
        JSONObject featureSwitchJSONObject = getPrepareData.getFeatureSwitchJSONObject("feature_maintenance_broadcasting");
        AppNode.AnonymousClass2 r1 = new Object() {
            public static final String KEY_DATE = "date";
            public static final String KEY_ICON_URL = "iconUrl";
            public static final String KEY_TEXT = "text";
            public static final String KEY_VERSION = "version";
            public static final String KEY_VISIBLE = "visible";
            private String date;
            private String iconUrl;
            private String text;
            private int version;
            private boolean visible;

            public static AnonymousClass2 createDefault() {
                AnonymousClass2 r0 = 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0008: CONSTRUCTOR  (r1v0 'r1' o.AppNode$2) =  call: o.AppNode.2.<init>():void type: CONSTRUCTOR in method: o.handleMessage.maintenanceBroadcastStarter():o.AppNode$2, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Method generation error
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:274)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 29 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 'r0' o.AppNode$2) =  call: o.AppNode.2.<init>():void type: CONSTRUCTOR in method: o.AppNode.2.createDefault():o.AppNode$2, dex: classes2.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	... 46 more
                    Caused by: jadx.core.utils.exceptions.CodegenException: Anonymous inner class unlimited recursion detected. Convert class to inner: o.AppNode.2
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:649)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 55 more
                    */
                /*
                    this = this;
                    java.lang.String r0 = "feature_maintenance_broadcasting"
                    com.alibaba.fastjson.JSONObject r0 = o.getPrepareData.getFeatureSwitchJSONObject(r0)
                    o.AppNode$2 r1 = new o.AppNode$2
                    r1.<init>()
                    if (r0 == 0) goto L_0x005c
                    java.lang.String r2 = "text"
                    java.lang.String r2 = r0.getString(r2)
                    r1.setText(r2)
                    java.lang.String r2 = "visible"
                    java.lang.Boolean r2 = r0.getBoolean(r2)
                    boolean r2 = r2.booleanValue()
                    r1.setVisible(r2)
                    java.lang.String r2 = "version"
                    boolean r3 = r0.containsKey(r2)
                    if (r3 == 0) goto L_0x0036
                    java.lang.Integer r2 = r0.getInteger(r2)
                    int r2 = r2.intValue()
                    goto L_0x0037
                L_0x0036:
                    r2 = 0
                L_0x0037:
                    r1.setVersion(r2)
                    java.lang.String r2 = "date"
                    boolean r3 = r0.containsKey(r2)
                    java.lang.String r4 = ""
                    if (r3 == 0) goto L_0x0049
                    java.lang.String r2 = r0.getString(r2)
                    goto L_0x004a
                L_0x0049:
                    r2 = r4
                L_0x004a:
                    r1.setDate(r2)
                    java.lang.String r2 = "iconUrl"
                    boolean r3 = r0.containsKey(r2)
                    if (r3 == 0) goto L_0x0059
                    java.lang.String r4 = r0.getString(r2)
                L_0x0059:
                    r1.setIconUrl(r4)
                L_0x005c:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: o.handleMessage.maintenanceBroadcastStarter():o.AppNode$2");
            }

            private JSONObject getDefaultFeedBackConfig() {
                setHorizontalScrollBarEnabled sethorizontalscrollbarenabled = new setHorizontalScrollBarEnabled();
                sethorizontalscrollbarenabled.setFeedbackEnable(false);
                sethorizontalscrollbarenabled.setFeedbackUrl((String) null);
                return (JSONObject) JSON.toJSON(sethorizontalscrollbarenabled);
            }

            private JSONObject getDefaultInterstitialBannerConfig() {
                AppNode.AnonymousClass1 r0 = new Object() {
                    @JSONField(name = "gapTimeInMinute")
                    long gapTime;
                    @JSONField(name = "resetTimeInDay")
                    long resetTime;

                    public long getGapTime() {
                        return this.gapTime;
                    }

                    public void setGapTime(long j) {
                        this.gapTime = j;
                    }

                    public long getResetTime() {
                        return this.resetTime;
                    }

                    public void setResetTime(long j) {
                        this.resetTime = j;
                    }
                };
                r0.setGapTime(15);
                r0.setResetTime(0);
                return (JSONObject) JSON.toJSON(r0);
            }

            /* access modifiers changed from: private */
            public AppNode.AnonymousClass1 convertJsonToInterstitialBannerConfig(org.json.JSONObject jSONObject) {
                AppNode.AnonymousClass1 r5 = (AppNode.AnonymousClass1) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass1.class);
                r5.setGapTime(r5.getGapTime() * 60000);
                r5.setResetTime(r5.getResetTime() * 60000 * CONVERT_MINUTES_TO_DAY);
                return r5;
            }

            /* access modifiers changed from: private */
            public AppNode.AnonymousClass7 convertJsonToTermsConditionsResult(JSONObject jSONObject) {
                return (AppNode.AnonymousClass7) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass7.class);
            }

            /* access modifiers changed from: private */
            public onComplete convertJsonToGeofenceConfigResult(JSONObject jSONObject) {
                return (onComplete) this.serializer.deserialize(jSONObject.toString(), onComplete.class);
            }

            /* access modifiers changed from: private */
            public onNetworkChanged convertJsonToTwilioTimeoutConfigResult(JSONObject jSONObject) {
                return (onNetworkChanged) this.serializer.deserialize(jSONObject.toString(), onNetworkChanged.class);
            }

            /* access modifiers changed from: private */
            public AppNode.AnonymousClass8.AnonymousClass1 convertJsonToSplashAnimationResult(JSONObject jSONObject) {
                return (AppNode.AnonymousClass8.AnonymousClass1) this.serializer.deserialize(jSONObject.toString(), AppNode.AnonymousClass8.AnonymousClass1.class);
            }

            /* access modifiers changed from: private */
            /* renamed from: convertJsonToDonationCampaignConfigResult */
            public performBack lambda$getDonationCampaignConfig$30(JSONObject jSONObject) {
                return (performBack) this.serializer.deserialize(jSONObject.toString(), performBack.class);
            }

            /* access modifiers changed from: private */
            public List<JsonReader$Token> convertJsonToGnBindingBenefitsResult(JSONObject jSONObject) {
                access$502 access_502 = (access$502) this.serializer.deserialize(jSONObject.toString(), access$502.class);
                ArrayList arrayList = new ArrayList();
                if (access_502.getGnBenefitEntitySendmoney() != null) {
                    arrayList.add(access_502.getGnBenefitEntitySendmoney());
                }
                if (access_502.getGnBenefitEntityBillpayment() != null) {
                    arrayList.add(access_502.getGnBenefitEntityBillpayment());
                }
                if (access_502.getGnBenefitEntityCashoutBalance() != null) {
                    arrayList.add(access_502.getGnBenefitEntityCashoutBalance());
                }
                if (access_502.getGnBenefitEntityDanaProtection() != null) {
                    arrayList.add(access_502.getGnBenefitEntityDanaProtection());
                }
                return arrayList;
            }

            private List<AppNode.AnonymousClass6> convertJsonToReferralWidgetConfig(com.alibaba.fastjson.JSONArray jSONArray) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    arrayList.add((AppNode.AnonymousClass6) this.serializer.deserialize(jSONArray.getString(i), AppNode.AnonymousClass6.class));
                }
                return arrayList;
            }

            private List<String> transform(com.alibaba.fastjson.JSONArray jSONArray) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                return arrayList;
            }

            private List<String> certificateWhitelist() {
                JSONArray jSONArrayConfig = ConfigCenter.getInstance().getJSONArrayConfig("ssl_certificate_whitelist_host");
                if (jSONArrayConfig == null) {
                    return new ArrayList();
                }
                return transform(getPositiveString.parseArray(jSONArrayConfig));
            }

            private JSONObject getDefaultContactSyncConfig() {
                getStartUrl getstarturl = new getStartUrl();
                getstarturl.setSynchronizeContact(false);
                getstarturl.setMaxContactSyncBatchSize(50);
                return (JSONObject) JSON.toJSON(getstarturl);
            }

            private JSONArray getDefaultSocialMediaCategoryConfig() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ShareAppKey.WHATSAPP);
                arrayList.add(ShareAppKey.LINE);
                return new JSONArray(arrayList);
            }

            private JSONObject getDefaultSplitBillConfig() {
                AppNode.AnonymousClass9 r0 = new Object() {
                    @JSONField(name = "feature_enable")
                    private boolean featureEnable;
                    @JSONField(name = "max_recipient")
                    private int maxRecipient;

                    public boolean isFeatureEnable() {
                        return this.featureEnable;
                    }

                    public void setFeatureEnable(boolean z) {
                        this.featureEnable = z;
                    }

                    public int getMaxRecipient() {
                        return this.maxRecipient;
                    }

                    public void setMaxRecipient(int i) {
                        this.maxRecipient = i;
                    }
                };
                r0.setFeatureEnable(false);
                r0.setMaxRecipient(20);
                return (JSONObject) JSON.toJSON(r0);
            }

            private JSONObject getOTCExpiryTimeDefaultConfig() {
                return (JSONObject) JSON.toJSON(OTCAcceptExpiryTimeConfigResult.createDefaultConfig());
            }

            private org.json.JSONObject getFriendshipSection() {
                return ConfigCenter.getInstance().getSectionConfig("Friendship");
            }

            public TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(@NotNull MerchantCategoryType merchantCategoryType) {
                throw new UnsupportedOperationException();
            }

            public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantCategories() {
                throw new NotImplementedError();
            }

            public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantSubCategories() {
                throw new NotImplementedError();
            }

            public TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass12> getNearbyConfig() {
                throw new NotImplementedError();
            }

            public TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> getSkuExplore() {
                throw new NotImplementedError();
            }

            public TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureInvestmentEnabled() {
                return getPrepareData.getFeatureSwitch("home_widget_investment", Boolean.FALSE);
            }
        }
