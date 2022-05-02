package o;

import androidx.annotation.NonNull;
import com.alibaba.fastjson.JSONObject;
import id.dana.data.config.source.amcs.result.OTCAcceptExpiryTimeConfigResult;
import id.dana.data.deeplink.repository.source.branch.result.DeepLinkPayloadEntity;
import id.dana.domain.bcaoneklik.model.BcaOneKlikInterceptData;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.domain.version.Version;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.AppNode;
import o.TitleBarRightButtonView;
import org.json.JSONArray;

@Singleton
public class AppMsgReceiver implements getCursiveFontFamily {
    private final PackageInstallCallback generalPreferencesDataFactory;

    /* renamed from: o.AppMsgReceiver$2  reason: invalid class name */
    public interface AnonymousClass2 {
        TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature(String str);

        TitleBarRightButtonView.AnonymousClass1<List<String>> getAddingNameWhitelistedSubMerchantId();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getAmlEddMandatory();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getAndMonitorCertificateWhitelist();

        TitleBarRightButtonView.AnonymousClass1<Version> getAppVersion();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getAppWidgetEnabled();

        TitleBarRightButtonView.AnonymousClass1<BcaOneKlikInterceptData> getBcaOneKlikInterceptConfig();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getCategoryExplore();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getCertificatesUrl();

        TitleBarRightButtonView.AnonymousClass1<getStartUrl> getContactSyncConfig();

        TitleBarRightButtonView.AnonymousClass1<Long> getDecodeQrTimeout();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getDeeplinkEntries();

        TitleBarRightButtonView.AnonymousClass1<DeepLinkPayloadEntity> getDeeplinkFeatureConfigByKeys(List<String> list, String str);

        TitleBarRightButtonView.AnonymousClass1<List<String>> getDeeplinkFeatureConfigList();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getDefaultFeedFromConfig();

        TitleBarRightButtonView.AnonymousClass1<performBack> getDonationCampaignConfig();

        TitleBarRightButtonView.AnonymousClass1<Map<String, setSupportMultipleWindows>> getElectronicMoneyConfig();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getEnableAddNewCard();

        TitleBarRightButtonView.AnonymousClass1<setAPWebViewListener> getEnableExpressPayInfo();

        TitleBarRightButtonView.AnonymousClass1<List<getExtensionManager>> getExpiryChoice();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureAmlEdd();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureCameraCard();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getFeatureForcedFirstCard();

        TitleBarRightButtonView.AnonymousClass1<Map<String, setVerticalScrollBarEnabled>> getFeatureGlobalSearchCategories();

        TitleBarRightButtonView.AnonymousClass1<findApp> getFeaturePromoAds();

        TitleBarRightButtonView.AnonymousClass1<BigDataChannelModel> getFeatureReferralEngagementDialogConfig();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getFeatureSkipButtonMerchantList();

        TitleBarRightButtonView.AnonymousClass1<access$002> getFeedConfig();

        TitleBarRightButtonView.AnonymousClass1<access$002> getFeedHomeConfig();

        TitleBarRightButtonView.AnonymousClass1<Integer> getFeedVersionConfig();

        TitleBarRightButtonView.AnonymousClass1<setHorizontalScrollBarEnabled> getFeedbackConfigInfo();

        TitleBarRightButtonView.AnonymousClass1<org.json.JSONObject> getFriendshipEmojiList();

        TitleBarRightButtonView.AnonymousClass1<Integer> getFriendshipSyncProgressInterval();

        TitleBarRightButtonView.AnonymousClass1<onComplete> getGeofenceConfig();

        TitleBarRightButtonView.AnonymousClass1<APWebViewClient> getGlobalSearchConfig();

        TitleBarRightButtonView.AnonymousClass1<List<JsonReader$Token>> getGnBindingBenefits();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getH5Entries();

        TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getHomeBannerDefaultContent();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass1> getInterstitialBannerConfig();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxBankAccount();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxContactPerBatch();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentBank();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentContact();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxRecentRecipient();

        TitleBarRightButtonView.AnonymousClass1<Integer> getMaxSavedBank();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantCategories();

        TitleBarRightButtonView.AnonymousClass1<JSONArray> getMerchantOrder();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantSubcategories();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getMerchantTopups();

        TitleBarRightButtonView.AnonymousClass1<getCacheDir> getNearbyAutoSearchConfig();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass12> getNearbyConfig();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeFeature();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getNearbyMeMapViewFeature();

        TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfig();

        TitleBarRightButtonView.AnonymousClass1<clearTempPath> getNearbyRankingConfigV2();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantCategories();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getNewMerchantCategoryOrder(@NonNull MerchantCategoryType merchantCategoryType);

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass10> getNewMerchantSubCategories();

        TitleBarRightButtonView.AnonymousClass1<OTCAcceptExpiryTimeConfigResult> getOTCExpiryConfig();

        TitleBarRightButtonView.AnonymousClass1<Integer> getPinningMode();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getPlayStoreReviewFeature();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getProfileCompletionWidgetVisibility();

        TitleBarRightButtonView.AnonymousClass1<startApp> getPromoAdsLocationConfig();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getPromoBannerSliderItemNewSizeEnabled();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1> getPromoCenterConfig(boolean z);

        TitleBarRightButtonView.AnonymousClass1<Integer> getQrCount();

        TitleBarRightButtonView.AnonymousClass1<initResult> getQrisCrossBorderContent(String str);

        TitleBarRightButtonView.AnonymousClass1<List<String>> getQrisCrossBorderSupportedCountries();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass5> getReferralPageConfig();

        TitleBarRightButtonView.AnonymousClass1<List<JSONObject>> getReportReasonsConfig();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8> getRequestMoneyInfo();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingCategories();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getSavingWithdrawOptionsConfig();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyBannerConfig();

        TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyFeedConfig();

        TitleBarRightButtonView.AnonymousClass1<Integer> getSendMoneyNoteCharLimit();

        TitleBarRightButtonView.AnonymousClass1<Long> getSendMoneyRefundTimeout();

        TitleBarRightButtonView.AnonymousClass1<postWebMessage> getShareReferralMessageTemplate();

        TitleBarRightButtonView.AnonymousClass1<shouldOverrideUrlLoading> getShowAlipayConnectBrandConfig();

        TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> getSkuExplore();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getSocialMediaCategoryShare();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass8.AnonymousClass1> getSplashAnimationConfig();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass9> getSplitBillConfig();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass7> getTermsConditionsConfig();

        TitleBarRightButtonView.AnonymousClass1<Long> getTimeoutPeriod();

        TitleBarRightButtonView.AnonymousClass1<String> getTnCReferralMission();

        TitleBarRightButtonView.AnonymousClass1<JSONObject> getTncAgreementFeature();

        TitleBarRightButtonView.AnonymousClass1<onNetworkChanged> getTwilioTimeoutConfig();

        TitleBarRightButtonView.AnonymousClass1<Map<String, Boolean>> getWhitelistedDevices();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedDomain();

        TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedSubMerchantId();

        TitleBarRightButtonView.AnonymousClass1<IPCCallManager> getX2LBannerConfig();

        TitleBarRightButtonView.AnonymousClass1<List<IPCContextManager>> getX2LSocialLinks();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isAnalyticsModuleEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isBranchDeepLinkEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled();

        TitleBarRightButtonView.AnonymousClass1<setActivityClz> isChangeUsernameEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardHookCheckEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardRootCheckEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isDexguardTamperCheckEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isDoHoldLogin();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isEnableSendRiskLuckyMoney();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isEncryptCardEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFaceLoginEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFavoriteServicesEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureAnnouncementEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureFeedHightlightEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGnProxyEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGoalsBalanceEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureInvestmentEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureOldRecentTransactionEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSecureRecentTransactionEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureSplitMigration();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedCommentEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedInboxTabEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedNotificationEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isHomeRevampEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isInterstitialBannerEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowYourBusinessEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowledgeBasedAuthEnable(String str);

        TitleBarRightButtonView.AnonymousClass1<Boolean> isLeaderboardEntryEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isLogoutEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isMerchantCategoryFilterEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isMixpanelTrackEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isOfflineF2FPay();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoCenterEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoClaimEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoQuestEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isPushNotifDiagnosticEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTcico();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTopUpEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isRecurringContactSyncEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isReferralSendMoneyEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isReferredUserEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isResendWhatsAppEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyPeerToCashEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyV2Enabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToBankEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToLinkEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isShowReferralCode();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialContactSyncEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isSocialFeatureEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementDownloadEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementEnabled();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isTwilioEnrollmentEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isUserConfigSyncEnable(String str);

        TitleBarRightButtonView.AnonymousClass1<Boolean> isX2BPreKitkatDialogEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isX2PEnable();

        TitleBarRightButtonView.AnonymousClass1<Boolean> isX2XVoucherEnable();

        TitleBarRightButtonView.AnonymousClass1<List<String>> monitorCertificatesUrl();

        TitleBarRightButtonView.AnonymousClass1<Integer> monitorPinningMode();

        TitleBarRightButtonView.AnonymousClass1<AppNode.AnonymousClass2> observeMaintenanceBroadcast();
    }

    @Inject
    public AppMsgReceiver(PackageInstallCallback packageInstallCallback) {
        this.generalPreferencesDataFactory = packageInstallCallback;
    }

    public TitleBarRightButtonView.AnonymousClass1<Boolean> isAppFirstLaunch() {
        return createGeneralPreferences().isAppFirstLaunch();
    }

    private isInDownloadPath createGeneralPreferences() {
        return this.generalPreferencesDataFactory.createData("local");
    }
}
