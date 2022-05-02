package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import id.dana.data.Source;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AppMsgReceiver;
import o.AppNode;
import o.IMtopProxy;
import o.LottieAnimationView;
import o.PackageDownloadRequest;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bw\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d¢\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020%0 2\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u000200H\u0002J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#020 H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u0002050 2\u0006\u00106\u001a\u00020#H\u0016J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#080 H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020:0 H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0 H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020>0 H\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0@0 H\u0016J\u0014\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0C0 H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020E0 H\u0016J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0 H\u0016J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020I0 H\u0016J\u0014\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0@0 H\u0016J\u000e\u0010L\u001a\b\u0012\u0004\u0012\u00020M0 H\u0016J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020M0 H\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020P0 H\u0016J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0 H\u0016J\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010T\u001a\b\u0012\u0004\u0012\u00020U0 H\u0016J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020M0 H\u0016J\u0016\u0010W\u001a\b\u0012\u0004\u0012\u00020X0 2\u0006\u0010Y\u001a\u00020#H\u0016J\u0014\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#080 H\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0 H\u0016J\u000e\u0010]\u001a\b\u0012\u0004\u0012\u00020^0 H\u0016J\u000e\u0010_\u001a\b\u0012\u0004\u0012\u00020`0 H\u0016J\u000e\u0010a\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010b\u001a\b\u0012\u0004\u0012\u00020M0 H\u0016J\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020:0 H\u0016J\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020e0 H\u0016J\u0014\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0@0 H\u0016J\b\u0010h\u001a\u00020iH\u0016J\u000e\u0010j\u001a\b\u0012\u0004\u0012\u00020k0 H\u0016J(\u0010l\u001a\b\u0012\u0004\u0012\u00020%0 2\u0018\u0010m\u001a\u0014\u0012\u0004\u0012\u00020+\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0 0nH\u0002J\u000e\u0010o\u001a\b\u0012\u0004\u0012\u00020#0 H\u0016J\u0010\u0010p\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010 H\u0016J\u0014\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#080 H\u0016J\u0014\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#080 H\u0016J\u000e\u0010t\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010u\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010v\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010w\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010x\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010y\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010z\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010{\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010|\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010}\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010~\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000e\u0010\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u0018\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 2\u0007\u0010\u0001\u001a\u00020#H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010£\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010¤\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u000f\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020%0 H\u0016J\u0010\u0010¦\u0001\u001a\t\u0012\u0005\u0012\u00030§\u00010 H\u0016J\u0017\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u0002050 2\u0006\u00106\u001a\u00020#H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006©\u0001"}, d2 = {"Lid/dana/data/config/repository/FeatureConfigEntityRepository;", "Lid/dana/domain/featureconfig/FeatureConfigRepository;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "maintenanceBroadcastDataFactory", "Lid/dana/data/homeinfo/repository/source/MaintenanceBroadcastDataFactory;", "featureNonAMCSEntityDataFactory", "Lid/dana/data/featureswitch/FeatureNonAMCSEntityDataFactory;", "maintenanceBroadcastResultMapper", "Lid/dana/data/config/mapper/MaintenanceBroadcastResultMapper;", "expiryInfoResultMapper", "Lid/dana/data/config/mapper/ExpiryInfoResultMapper;", "requestMoneyInfoResultMapper", "Lid/dana/data/config/mapper/RequestMoneyInfoResultMapper;", "referralPageConfigResultMapper", "Lid/dana/data/config/mapper/ReferralPageConfigResultMapper;", "splitBillConfigMapper", "Lid/dana/data/config/mapper/SplitBillConfigMapper;", "promoCenterConfigMapper", "Lid/dana/data/config/mapper/PromoCenterConfigMapper;", "geofenceConfigMapper", "Lid/dana/data/config/mapper/GeofenceConfigMapper;", "donationCampaignConfigMapper", "Lid/dana/data/config/mapper/DonationCampaignConfigMapper;", "splashAnimationConfigMapper", "Lid/dana/data/config/mapper/SplashAnimationConfigMapper;", "twilioTimeoutConfigMapper", "Lid/dana/data/config/mapper/TwilioTimeoutConfigMapper;", "generalPreferences", "Lid/dana/data/storage/GeneralPreferences;", "(Lid/dana/data/config/source/ConfigEntityDataFactory;Lid/dana/data/homeinfo/repository/source/MaintenanceBroadcastDataFactory;Lid/dana/data/featureswitch/FeatureNonAMCSEntityDataFactory;Lid/dana/data/config/mapper/MaintenanceBroadcastResultMapper;Lid/dana/data/config/mapper/ExpiryInfoResultMapper;Lid/dana/data/config/mapper/RequestMoneyInfoResultMapper;Lid/dana/data/config/mapper/ReferralPageConfigResultMapper;Lid/dana/data/config/mapper/SplitBillConfigMapper;Lid/dana/data/config/mapper/PromoCenterConfigMapper;Lid/dana/data/config/mapper/GeofenceConfigMapper;Lid/dana/data/config/mapper/DonationCampaignConfigMapper;Lid/dana/data/config/mapper/SplashAnimationConfigMapper;Lid/dana/data/config/mapper/TwilioTimeoutConfigMapper;Lid/dana/data/storage/GeneralPreferences;)V", "checkDeepLinkFeatureVisibility", "Lio/reactivex/Observable;", "Lid/dana/domain/featureconfig/model/DeepLinkFeatureSwitchModel;", "name", "", "checkDexguardHookCheckFeature", "", "checkDexguardRootCheckFeature", "checkDexguardTamperCheckFeature", "checkIsResendWhatsAppEnable", "checkVisibilityFeature", "createConfigAMCSEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "createConfigSplitEntityData", "createFeatureNonAmcsEntityData", "Lid/dana/data/featureswitch/repository/source/FeatureNonAMCSEntityData;", "createMaintenanceBroadcastEntityData", "Lid/dana/data/homeinfo/repository/source/MaintenanceBroadcastRepository;", "getAddingNameWhitelistedSubMerchantId", "", "getAppShortcutEnabled", "getBroadcastSavingState", "Lid/dana/domain/maintenance/model/BroadcastSavingStateResult;", "lastDismissedBroadcast", "getCategoryExplore", "", "getDecodeQrTimeout", "", "getDonationCampaignConfig", "Lid/dana/domain/featureconfig/model/DonationCampaignConfig;", "getEnableExpressPayInfo", "Lid/dana/domain/featureconfig/model/ExpressPayInfo;", "getExpiryChoice", "", "Lid/dana/domain/featureconfig/model/ExpiryInfo;", "getFeatureSkipButtonMerchantList", "", "getFeedConfig", "Lid/dana/domain/social/model/FeedHomeConfig;", "getFeedbackConfigInfo", "Lid/dana/domain/featureconfig/model/FeedBackConfigInfo;", "getGeofenceConfig", "Lid/dana/domain/featureconfig/model/GeofenceConfig;", "getGnBindingBenefits", "Lid/dana/domain/oauth/model/GnBindingBenefit;", "getMaxBankAccount", "", "getMinimumRadiusInMeter", "getNearbyConfig", "Lid/dana/domain/nearbyme/model/NearbyConfig;", "getPromoAdsFeatureConfig", "Lid/dana/domain/promocenter/model/PromoAdsConfig;", "getPromoBannerSliderItemNewSizeEnabled", "getPromoCenterConfig", "Lid/dana/domain/featureconfig/model/PromoCenterConfig;", "getQrCount", "getQrisCrossBorderContent", "Lid/dana/domain/qriscrossborder/model/QrisCrossBorderContent;", "countryCode", "getQrisCrossBorderSupportedCountries", "getReferralMessageTemplate", "Lid/dana/domain/featureconfig/model/ReferralMessageTemplateConfig;", "getReferralPageConfig", "Lid/dana/domain/featureconfig/model/ReferralPageConfig;", "getRequestMoneyInfo", "Lid/dana/domain/featureconfig/model/RequestMoneyInfo;", "getSendMoneyFeedConfig", "getSendMoneyNoteCharLimit", "getSendMoneyRefundTimeout", "getShowAlipayConnectBrandConfig", "Lid/dana/domain/featureconfig/model/ShowAlipayConnectBrandConfig;", "getSkuExplore", "Lid/dana/domain/featureconfig/model/SkuExploreConfig;", "getSplashAnimationConfig", "Lid/dana/domain/featureconfig/model/SplashAnimationConfig;", "getSplitBillConfig", "Lid/dana/domain/featureconfig/model/SplitBillConfig;", "getSplitWithAmcsFallbackConfig", "getConfig", "Lkotlin/Function1;", "getTnCReferralMissionConfig", "getTwilioTimeoutConfig", "Lid/dana/domain/featureconfig/model/TwilioTimeoutConfig;", "getValidDomainWhitelisted", "getWhitelistedSubMerchantId", "isBranchDeepLinkEnable", "isCScanBEnabled", "isCameraCardEnable", "isChangeUsernameEnabled", "isContactSyncEnable", "isDoHoldLogin", "isFaceLoginEnable", "isFavoriteServicesEnable", "isFeatureAnnouncementEnable", "isFeatureFeedHighlightEnabled", "isFeatureGnProxyEnable", "isFeatureGoalsBalanceEnable", "isFeatureInvestmentEnabled", "isFeatureQrisCrossBorderEnable", "isFeedCommentEnable", "isFeedInboxTabEnable", "isFeedNotificationEnable", "isGlobalNetworkEnabled", "isHomeRevampEnable", "isInterstitialBannerEnabled", "isKnowYourBusinessEnable", "isKnowledgeBasedAuthEnable", "type", "isLeaderboardEntryEnable", "isLogoutEnable", "isMerchantCategoryFilterEnable", "isMixpanelTrackEnable", "isNearbyMeEnable", "isNearbyMeMapViewEnable", "isOfflineF2FPay", "isProfileCompletionWidgetEnable", "isPromoCenterEnable", "isPromoClaimEnable", "isPromoQuestEnable", "isPushNotifDiagnosticEnable", "isQrisEnable", "isQrisTcico", "isQrisTopUpEnable", "isReferralSendMoneyEnable", "isSendMoneyPeerToCashEnable", "isSendMoneyV2Enable", "isSendToBankEnable", "isSendToLinkEnable", "isShowReferralCode", "isStatementDownloadEnable", "isStatementEnable", "isTwilioEnrollmentEnable", "isX2BPreKitkatDialogEnable", "isX2PEnable", "isX2XVoucherEnable", "observeMaintenanceBroadcast", "Lid/dana/domain/maintenance/model/MaintenanceBroadcast;", "setBroadcastSavingState", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class exitApp implements setDefaultFontSize {
    private final onCallBack configEntityDataFactory;
    /* access modifiers changed from: private */
    public final removeLottieOnCompositionLoadedListener donationCampaignConfigMapper;
    /* access modifiers changed from: private */
    public final LottieAnimationView.SavedState expiryInfoResultMapper;
    private final requestAsync featureNonAMCSEntityDataFactory;
    /* access modifiers changed from: private */
    public final PackageDownloadRequest.AnonymousClass1 generalPreferences;
    /* access modifiers changed from: private */
    public final disableExtraScaleModeInFitXY geofenceConfigMapper;
    private final showBackButton maintenanceBroadcastDataFactory;
    /* access modifiers changed from: private */
    public final DocumentData$Justification maintenanceBroadcastResultMapper;
    /* access modifiers changed from: private */
    public final LottieDrawable$RepeatMode promoCenterConfigMapper;
    /* access modifiers changed from: private */
    public final MergePaths$MergePathsMode referralPageConfigResultMapper;
    /* access modifiers changed from: private */
    public final ShapeStroke$LineCapType requestMoneyInfoResultMapper;
    /* access modifiers changed from: private */
    public final ShapeStroke$LineJoinType splashAnimationConfigMapper;
    /* access modifiers changed from: private */
    public final toPaintCap splitBillConfigMapper;
    /* access modifiers changed from: private */
    public final forFile twilioTimeoutConfigMapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ exitApp length;
        final /* synthetic */ Function1 setMax;

        ICustomTabsCallback(exitApp exitapp, Function1 function1) {
            this.length = exitapp;
            this.setMax = function1;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "homeRevampEnabled", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
        static final class Stub<T, R> implements RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
            final /* synthetic */ exitApp setMax;

            Stub(exitApp exitapp) {
                this.setMax = exitapp;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                Intrinsics.checkNotNullParameter(bool, "homeRevampEnabled");
                this.setMax.generalPreferences.setHomeRevampEnabledFlag(bool.booleanValue());
                return TitleBarRightButtonView.AnonymousClass1.just(bool);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "it", "Lid/dana/data/config/source/ConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class Default extends Lambda implements Function1<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass1<Boolean>> {
            public static final Default INSTANCE = new Default();

            Default() {
                super(1);
            }

            @NotNull
            public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke(@NotNull AppMsgReceiver.AnonymousClass2 r2) {
                Intrinsics.checkNotNullParameter(r2, "it");
                TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled = r2.isGlobalNetworkEnabled();
                Intrinsics.checkNotNullExpressionValue(isGlobalNetworkEnabled, "it.isGlobalNetworkEnabled");
                return isGlobalNetworkEnabled;
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return (TitleBarRightButtonView.AnonymousClass4) this.setMax.invoke(this.length.createConfigAMCSEntityData());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends Set<? extends String>>> {
        public static final IsOverlapping length = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(CollectionsKt.toMutableSet(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "apply", "(Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class asBinder<T, R> implements RedDotDrawable<access$002, Boolean> {
        public static final asBinder setMax = new asBinder();

        asBinder() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$002 access_002 = (access$002) obj;
            Intrinsics.checkNotNullParameter(access_002, "it");
            return Boolean.valueOf(access_002.toFeedHomeConfig().isFeedCommentEnabled());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "apply", "(Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class asInterface<T, R> implements RedDotDrawable<access$002, Boolean> {
        public static final asInterface setMin = new asInterface();

        asInterface() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$002 access_002 = (access$002) obj;
            Intrinsics.checkNotNullParameter(access_002, "it");
            return Boolean.valueOf(access_002.toFeedHomeConfig().isFeedNotificationEnabled());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/SplitBillConfig;", "kotlin.jvm.PlatformType", "splitBillConfigResult", "Lid/dana/data/config/source/amcs/result/SplitBillConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class b<T, R> implements RedDotDrawable<AppNode.AnonymousClass9, onTooManyRedirects> {
        final /* synthetic */ exitApp setMax;

        b(exitApp exitapp) {
            this.setMax = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass9 r2 = (AppNode.AnonymousClass9) obj;
            Intrinsics.checkNotNullParameter(r2, "splitBillConfigResult");
            return this.setMax.splitBillConfigMapper.map(r2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/TwilioTimeoutConfig;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/TwilioTimeoutConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class create<T, R> implements RedDotDrawable<onNetworkChanged, onWebViewEvent> {
        final /* synthetic */ exitApp setMin;

        create(exitApp exitapp) {
            this.setMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            onNetworkChanged onnetworkchanged = (onNetworkChanged) obj;
            Intrinsics.checkNotNullParameter(onnetworkchanged, "sourceItem");
            return (onWebViewEvent) this.setMin.twilioTimeoutConfigMapper.apply(onnetworkchanged);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/social/model/FeedHomeConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/FeedHomeConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T, R> implements RedDotDrawable<access$002, getMonitoringStatus> {
        public static final equals length = new equals();

        equals() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            access$002 access_002 = (access$002) obj;
            Intrinsics.checkNotNullParameter(access_002, "it");
            return access_002.toFeedHomeConfig();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/ConfigEntityData;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class extraCallback<T, R> implements RedDotDrawable<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ exitApp length;

        extraCallback(exitApp exitapp) {
            this.length = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppMsgReceiver.AnonymousClass2 r2 = (AppMsgReceiver.AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r2, "it");
            if (r2 instanceof AppUtils) {
                return ((AppUtils) r2).isFavoriteServicesEnabled().onErrorResumeNext(this.length.createConfigAMCSEntityData().isFavoriteServicesEnabled());
            }
            return r2.isFavoriteServicesEnabled();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "obj", "Lid/dana/data/config/source/amcs/result/ContactSyncConfigResult;", "apply", "(Lid/dana/data/config/source/amcs/result/ContactSyncConfigResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult<T, R> implements RedDotDrawable<getStartUrl, Boolean> {
        public static final extraCallbackWithResult setMin = new extraCallbackWithResult();

        extraCallbackWithResult() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getStartUrl getstarturl = (getStartUrl) obj;
            Intrinsics.checkNotNullParameter(getstarturl, "obj");
            return Boolean.valueOf(getstarturl.isSynchronizeContact());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/SplashAnimationConfig;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/SplashAnimationConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getCause<T, R> implements RedDotDrawable<AppNode.AnonymousClass8.AnonymousClass1, onLoadResource> {
        final /* synthetic */ exitApp getMax;

        getCause(exitApp exitapp) {
            this.getMax = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass8.AnonymousClass1 r2 = (AppNode.AnonymousClass8.AnonymousClass1) obj;
            Intrinsics.checkNotNullParameter(r2, "sourceItem");
            return (onLoadResource) this.getMax.splashAnimationConfigMapper.apply(r2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/DeepLinkFeatureSwitchModel;", "featureNonAmcs", "", "featureActive", "apply", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lid/dana/domain/featureconfig/model/DeepLinkFeatureSwitchModel;"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T1, T2, R> implements removeNode<Boolean, Boolean, getSettings> {
        public static final getMax getMax = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            Intrinsics.checkNotNullParameter(bool, "featureNonAmcs");
            Intrinsics.checkNotNullParameter(bool2, "featureActive");
            getSettings getsettings = new getSettings();
            getsettings.setFeatureActive(bool2.booleanValue());
            getsettings.setFeatureNonAmcs(bool.booleanValue());
            return getsettings;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/nearbyme/model/NearbyConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/NearbyConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T, R> implements RedDotDrawable<AppNode.AnonymousClass12, clearExpired> {
        public static final hashCode getMin = new hashCode();

        hashCode() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass12 r2 = (AppNode.AnonymousClass12) obj;
            Intrinsics.checkNotNullParameter(r2, "it");
            return r2.toNearbyConfig();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/qriscrossborder/model/QrisCrossBorderContent;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/source/amcs/result/QrisCrossBorderContentResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class invoke<T, R> implements RedDotDrawable<initResult, setConfigUnits> {
        public static final invoke getMax = new invoke();

        invoke() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            initResult initresult = (initResult) obj;
            Intrinsics.checkNotNullParameter(initresult, "it");
            return forId.toQrisCrossBorderContent(initresult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/RequestMoneyInfo;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/RequestMoneyInfoResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend<T, R> implements RedDotDrawable<AppNode.AnonymousClass8, onReceivedError> {
        final /* synthetic */ exitApp getMin;

        invokeSuspend(exitApp exitapp) {
            this.getMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass8 r2 = (AppNode.AnonymousClass8) obj;
            Intrinsics.checkNotNullParameter(r2, "sourceItem");
            return (onReceivedError) this.getMin.requestMoneyInfoResultMapper.apply(r2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/GeofenceConfig;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/GeofenceConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<onComplete, setOnScrollChangedCallback> {
        final /* synthetic */ exitApp getMin;

        isInside(exitApp exitapp) {
            this.getMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            onComplete oncomplete = (onComplete) obj;
            Intrinsics.checkNotNullParameter(oncomplete, "sourceItem");
            return (setOnScrollChangedCallback) this.getMin.geofenceConfigMapper.apply(oncomplete);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/profilemenu/model/ChangeUsernameEntity;", "apply", "(Lid/dana/data/profilemenu/model/ChangeUsernameEntity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class onPostMessage<T, R> implements RedDotDrawable<setActivityClz, Boolean> {
        public static final onPostMessage length = new onPostMessage();

        onPostMessage() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            setActivityClz setactivityclz = (setActivityClz) obj;
            Intrinsics.checkNotNullParameter(setactivityclz, "it");
            return Boolean.valueOf(setactivityclz.getEnable());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "fromSplit", "", "apply", "(Ljava/lang/Boolean;)Lid/dana/data/config/source/ConfigEntityData;"}, k = 3, mv = {1, 4, 2})
    static final class onRelationshipValidationResult<T, R> implements RedDotDrawable<Boolean, AppMsgReceiver.AnonymousClass2> {
        final /* synthetic */ exitApp setMin;

        onRelationshipValidationResult(exitApp exitapp) {
            this.setMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "fromSplit");
            return bool.booleanValue() ? this.setMin.createConfigSplitEntityData() : this.setMin.createConfigAMCSEntityData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class onTransact<T, R> implements RedDotDrawable<Throwable, Boolean> {
        public static final onTransact setMin = new onTransact();

        onTransact() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return Boolean.FALSE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "appShortcutEnabled", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ exitApp length;

        setMax(exitApp exitapp) {
            this.length = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "appShortcutEnabled");
            this.length.generalPreferences.setAppShortcutEnabledFlag(bool.booleanValue());
            return TitleBarRightButtonView.AnonymousClass1.just(bool);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010 \n\u0000\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0005\u001a$\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0010\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00070\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "", "kotlin.jvm.PlatformType", "it", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends Set<String>>> {
        public static final setMin getMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return TitleBarRightButtonView.AnonymousClass1.just(CollectionsKt.toMutableSet(list));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/config/source/amcs/result/PromoCenterConfigResult;", "kotlin.jvm.PlatformType", "enabled", "", "apply", "(Ljava/lang/Boolean;)Lio/reactivex/ObservableSource;"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<Boolean, TitleBarRightButtonView.AnonymousClass4<? extends AppNode.AnonymousClass6.AnonymousClass1.AnonymousClass1>> {
        final /* synthetic */ exitApp setMin;

        toDoubleRange(exitApp exitapp) {
            this.setMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            Intrinsics.checkNotNullParameter(bool, "enabled");
            if (bool.booleanValue()) {
                return this.setMin.createConfigSplitEntityData().getPromoCenterConfig(bool.booleanValue()).onErrorResumeNext(this.setMin.createConfigAMCSEntityData().getPromoCenterConfig(bool.booleanValue()));
            }
            return TitleBarRightButtonView.AnonymousClass1.just(new Object() {
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
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/domain/featureconfig/model/ExpiryInfo;", "kotlin.jvm.PlatformType", "sourceItem", "", "Lid/dana/data/config/source/amcs/result/ExpiryInfoResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<List<getExtensionManager>, List<? extends setDownloadListener>> {
        final /* synthetic */ exitApp length;

        toIntRange(exitApp exitapp) {
            this.length = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "sourceItem");
            return (List) this.length.expiryInfoResultMapper.apply(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/promocenter/model/PromoAdsConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/config/model/PromoAdsConfigResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<findApp, GriverRVResourceManagerImpl> {
        public static final toString getMin = new toString();

        toString() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            findApp findapp = (findApp) obj;
            Intrinsics.checkNotNullParameter(findapp, "it");
            return setLocalCallManager.toPromoAdsConfig(findapp);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class valueOf<T, R> implements RedDotDrawable<Throwable, Boolean> {
        public static final valueOf length = new valueOf();

        valueOf() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012(\u0010\u0004\u001a$\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00060\u00060\u00010\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/domain/oauth/model/GnBindingBenefit;", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/data/config/model/BindingBenefitEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class values<T, R> implements RedDotDrawable<List<JsonReader$Token>, List<? extends getAssetContent>> {
        public static final values length = new values();

        values() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return Mask$MaskMode.toGnBindingBenefitList(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/maintenance/model/MaintenanceBroadcast;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/MaintenanceBroadcastResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setDefaultImpl<T, R> implements RedDotDrawable<AppNode.AnonymousClass2, installPath> {
        final /* synthetic */ exitApp setMax;

        setDefaultImpl(exitApp exitapp) {
            this.setMax = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            AppNode.AnonymousClass2 r2 = (AppNode.AnonymousClass2) obj;
            Intrinsics.checkNotNullParameter(r2, "sourceItem");
            return (installPath) this.setMax.maintenanceBroadcastResultMapper.apply(r2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/featureconfig/model/DonationCampaignConfig;", "kotlin.jvm.PlatformType", "sourceItem", "Lid/dana/data/config/source/amcs/result/DonationCampaignConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<performBack, setWebViewClient> {
        final /* synthetic */ exitApp setMin;

        toFloatRange(exitApp exitapp) {
            this.setMin = exitapp;
        }

        public final /* synthetic */ Object apply(Object obj) {
            performBack performback = (performBack) obj;
            Intrinsics.checkNotNullParameter(performback, "sourceItem");
            return (setWebViewClient) this.setMin.donationCampaignConfigMapper.apply(performback);
        }
    }

    @Inject
    public exitApp(@NotNull onCallBack oncallback, @NotNull showBackButton showbackbutton, @NotNull requestAsync requestasync, @NotNull DocumentData$Justification documentData$Justification, @NotNull LottieAnimationView.SavedState savedState, @NotNull ShapeStroke$LineCapType shapeStroke$LineCapType, @NotNull MergePaths$MergePathsMode mergePaths$MergePathsMode, @NotNull toPaintCap topaintcap, @NotNull LottieDrawable$RepeatMode lottieDrawable$RepeatMode, @NotNull disableExtraScaleModeInFitXY disableextrascalemodeinfitxy, @NotNull removeLottieOnCompositionLoadedListener removelottieoncompositionloadedlistener, @NotNull ShapeStroke$LineJoinType shapeStroke$LineJoinType, @NotNull forFile forfile, @NotNull PackageDownloadRequest.AnonymousClass1 r15) {
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        Intrinsics.checkNotNullParameter(showbackbutton, "maintenanceBroadcastDataFactory");
        Intrinsics.checkNotNullParameter(requestasync, "featureNonAMCSEntityDataFactory");
        Intrinsics.checkNotNullParameter(documentData$Justification, "maintenanceBroadcastResultMapper");
        Intrinsics.checkNotNullParameter(savedState, "expiryInfoResultMapper");
        Intrinsics.checkNotNullParameter(shapeStroke$LineCapType, "requestMoneyInfoResultMapper");
        Intrinsics.checkNotNullParameter(mergePaths$MergePathsMode, "referralPageConfigResultMapper");
        Intrinsics.checkNotNullParameter(topaintcap, "splitBillConfigMapper");
        Intrinsics.checkNotNullParameter(lottieDrawable$RepeatMode, "promoCenterConfigMapper");
        Intrinsics.checkNotNullParameter(disableextrascalemodeinfitxy, "geofenceConfigMapper");
        Intrinsics.checkNotNullParameter(removelottieoncompositionloadedlistener, "donationCampaignConfigMapper");
        Intrinsics.checkNotNullParameter(shapeStroke$LineJoinType, "splashAnimationConfigMapper");
        Intrinsics.checkNotNullParameter(forfile, "twilioTimeoutConfigMapper");
        Intrinsics.checkNotNullParameter(r15, "generalPreferences");
        this.configEntityDataFactory = oncallback;
        this.maintenanceBroadcastDataFactory = showbackbutton;
        this.featureNonAMCSEntityDataFactory = requestasync;
        this.maintenanceBroadcastResultMapper = documentData$Justification;
        this.expiryInfoResultMapper = savedState;
        this.requestMoneyInfoResultMapper = shapeStroke$LineCapType;
        this.referralPageConfigResultMapper = mergePaths$MergePathsMode;
        this.splitBillConfigMapper = topaintcap;
        this.promoCenterConfigMapper = lottieDrawable$RepeatMode;
        this.geofenceConfigMapper = disableextrascalemodeinfitxy;
        this.donationCampaignConfigMapper = removelottieoncompositionloadedlistener;
        this.splashAnimationConfigMapper = shapeStroke$LineJoinType;
        this.twilioTimeoutConfigMapper = forfile;
        this.generalPreferences = r15;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowledgeBasedAuthEnable(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowledgeBasedAuthEnable = createConfigAMCSEntityData().isKnowledgeBasedAuthEnable(str);
        Intrinsics.checkNotNullExpressionValue(isKnowledgeBasedAuthEnable, "createConfigAMCSEntityDa…edgeBasedAuthEnable(type)");
        return isKnowledgeBasedAuthEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowYourBusinessEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isKnowYourBusinessEnable = createConfigAMCSEntityData().isKnowYourBusinessEnable();
        Intrinsics.checkNotNullExpressionValue(isKnowYourBusinessEnable, "createConfigAMCSEntityDa….isKnowYourBusinessEnable");
        return isKnowYourBusinessEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isNearbyMeEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().getNearbyMeFeature().onErrorResumeNext(createConfigAMCSEntityData().getNearbyMeFeature());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…tyData().nearbyMeFeature)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isNearbyMeMapViewEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().getNearbyMeMapViewFeature().onErrorResumeNext(createConfigAMCSEntityData().getNearbyMeMapViewFeature());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…).nearbyMeMapViewFeature)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isLogoutEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isLogoutEnable = createConfigAMCSEntityData().isLogoutEnable();
        Intrinsics.checkNotNullExpressionValue(isLogoutEnable, "createConfigAMCSEntityData().isLogoutEnable");
        return isLogoutEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isTwilioEnrollmentEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isTwilioEnrollmentEnable = createConfigSplitEntityData().isTwilioEnrollmentEnable();
        Intrinsics.checkNotNullExpressionValue(isTwilioEnrollmentEnable, "createConfigSplitEntityD….isTwilioEnrollmentEnable");
        return isTwilioEnrollmentEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoQuestEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isPromoQuestEnable().onErrorResumeNext(createConfigAMCSEntityData().isPromoQuestEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isPromoQuestEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getSendMoneyRefundTimeout() {
        TitleBarRightButtonView.AnonymousClass1<Long> sendMoneyRefundTimeout = createConfigAMCSEntityData().getSendMoneyRefundTimeout();
        Intrinsics.checkNotNullExpressionValue(sendMoneyRefundTimeout, "createConfigAMCSEntityDa…().sendMoneyRefundTimeout");
        return sendMoneyRefundTimeout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getSendMoneyNoteCharLimit() {
        TitleBarRightButtonView.AnonymousClass1<Integer> sendMoneyNoteCharLimit = createConfigAMCSEntityData().getSendMoneyNoteCharLimit();
        Intrinsics.checkNotNullExpressionValue(sendMoneyNoteCharLimit, "createConfigAMCSEntityDa…().sendMoneyNoteCharLimit");
        return sendMoneyNoteCharLimit;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPushNotifDiagnosticEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isPushNotifDiagnosticEnable().onErrorResumeNext(createConfigAMCSEntityData().isPushNotifDiagnosticEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…iagnosticEnable\n        )");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setHorizontalScrollBarEnabled> getFeedbackConfigInfo() {
        TitleBarRightButtonView.AnonymousClass1<setHorizontalScrollBarEnabled> feedbackConfigInfo = createConfigAMCSEntityData().getFeedbackConfigInfo();
        Intrinsics.checkNotNullExpressionValue(feedbackConfigInfo, "createConfigAMCSEntityData().feedbackConfigInfo");
        return feedbackConfigInfo;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<installPath> observeMaintenanceBroadcast() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigAMCSEntityData().observeMaintenanceBroadcast().map(new setDefaultImpl(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigAMCSEntityDa…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTcico() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isQrisTcico().onErrorResumeNext(createConfigAMCSEntityData().isQrisTcico());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…EntityData().isQrisTcico)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkEnabled() {
        return getSplitWithAmcsFallbackConfig(ICustomTabsCallback.Default.INSTANCE);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTopUpEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisTopUpEnable = createConfigAMCSEntityData().isQrisTopUpEnable();
        Intrinsics.checkNotNullExpressionValue(isQrisTopUpEnable, "createConfigAMCSEntityData().isQrisTopUpEnable");
        return isQrisTopUpEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getAppShortcutEnabled() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigSplitEntityData().getAppWidgetEnabled().startWith(TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.generalPreferences.getAppShortcutEnabledFlag()))).flatMap(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "createConfigSplitEntityD…cutEnabled)\n            }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getQrCount() {
        TitleBarRightButtonView.AnonymousClass1<Integer> qrCount = createConfigSplitEntityData().getQrCount();
        Intrinsics.checkNotNullExpressionValue(qrCount, "createConfigSplitEntityData().qrCount");
        return qrCount;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getValidDomainWhitelisted() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> whitelistedDomain = createConfigSplitEntityData().getWhitelistedDomain();
        Intrinsics.checkNotNullExpressionValue(whitelistedDomain, "createConfigSplitEntityData().whitelistedDomain");
        return whitelistedDomain;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGoalsBalanceEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGoalsBalanceEnable = createConfigSplitEntityData().isFeatureGoalsBalanceEnable();
        Intrinsics.checkNotNullExpressionValue(isFeatureGoalsBalanceEnable, "createConfigSplitEntityD…FeatureGoalsBalanceEnable");
        return isFeatureGoalsBalanceEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getMonitoringStatus> getFeedConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getFeedConfig().map(equals.length);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…eedHomeConfig()\n        }");
        return map;
    }

    @Nullable
    public final TitleBarRightButtonView.AnonymousClass1<onWebViewEvent> getTwilioTimeoutConfig() {
        return createConfigSplitEntityData().getTwilioTimeoutConfig().map(new create(this));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedCommentEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getFeedConfig().map(asBinder.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…().isFeedCommentEnabled }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedNotificationEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getFeedConfig().map(asInterface.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…FeedNotificationEnabled }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isDoHoldLogin() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isDoHoldLogin = createConfigAMCSEntityData().isDoHoldLogin();
        Intrinsics.checkNotNullExpressionValue(isDoHoldLogin, "createConfigAMCSEntityData().isDoHoldLogin");
        return isDoHoldLogin;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isOfflineF2FPay() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isOfflineF2FPay().onErrorResumeNext(createConfigAMCSEntityData().isOfflineF2FPay());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…isOfflineF2FPay\n        )");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isBranchDeepLinkEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isBranchDeepLinkEnable().onErrorResumeNext(createConfigAMCSEntityData().isBranchDeepLinkEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…).isBranchDeepLinkEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isMerchantCategoryFilterEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isMerchantCategoryFilterEnable().onErrorResumeNext(createConfigAMCSEntityData().isMerchantCategoryFilterEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…hantCategoryFilterEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setAPWebViewListener> getEnableExpressPayInfo() {
        TitleBarRightButtonView.AnonymousClass1<setAPWebViewListener> onErrorResumeNext = createConfigSplitEntityData().getEnableExpressPayInfo().onErrorResumeNext(createConfigAMCSEntityData().getEnableExpressPayInfo());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…eExpressPayInfo\n        )");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<setDownloadListener>> getExpiryChoice() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigAMCSEntityData().getExpiryChoice().map(new toIntRange(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigAMCSEntityDa…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isShowReferralCode() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isShowReferralCode = createConfigSplitEntityData().isShowReferralCode();
        Intrinsics.checkNotNullExpressionValue(isShowReferralCode, "createConfigSplitEntityData().isShowReferralCode");
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = getMinimumFontSize.timeoutForFirstEmit(isShowReferralCode, 3000).onErrorResumeNext(createConfigAMCSEntityData().isShowReferralCode());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isShowReferralCode)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isLeaderboardEntryEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isLeaderboardEntryEnabled().onErrorResumeNext(createConfigAMCSEntityData().isLeaderboardEntryEnabled());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…sLeaderboardEntryEnabled)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToLinkEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isSendToLinkEnable().onErrorResumeNext(createConfigAMCSEntityData().isSendToLinkEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isSendToLinkEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getPromoBannerSliderItemNewSizeEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> promoBannerSliderItemNewSizeEnabled = createConfigSplitEntityData().getPromoBannerSliderItemNewSizeEnabled();
        Intrinsics.checkNotNullExpressionValue(promoBannerSliderItemNewSizeEnabled, "createConfigSplitEntityD…rSliderItemNewSizeEnabled");
        return promoBannerSliderItemNewSizeEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onReceivedError> getRequestMoneyInfo() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getRequestMoneyInfo().onErrorResumeNext(createConfigAMCSEntityData().getRequestMoneyInfo()).map(new invokeSuspend(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getSendMoneyFeedConfig() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorReturn = createConfigSplitEntityData().getSendMoneyFeedConfig().onErrorReturn(valueOf.length);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "createConfigSplitEntityD…  .onErrorReturn { true }");
        return onErrorReturn;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2PEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isX2PEnable().onErrorResumeNext(createConfigAMCSEntityData().isX2PEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…EntityData().isX2PEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyV2Enable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorReturn = createConfigSplitEntityData().isSendMoneyV2Enabled().onErrorReturn(onTransact.setMin);
        Intrinsics.checkNotNullExpressionValue(onErrorReturn, "createConfigSplitEntityD… .onErrorReturn { false }");
        return onErrorReturn;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2BPreKitkatDialogEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isX2BPreKitkatDialogEnable().onErrorResumeNext(createConfigAMCSEntityData().isX2BPreKitkatDialogEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…X2BPreKitkatDialogEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isX2XVoucherEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isX2XVoucherEnable().onErrorResumeNext(createConfigAMCSEntityData().isX2XVoucherEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isX2XVoucherEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getCurrentPageSnapshot> getReferralPageConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigAMCSEntityData().getReferralPageConfig().map(new exitApp$Mean$Arithmetic(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigAMCSEntityDa…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendToBankEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isSendToBankEnable().onErrorResumeNext(createConfigAMCSEntityData().isSendToBankEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isSendToBankEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getCategoryExplore() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> categoryExplore = createConfigSplitEntityData().getCategoryExplore();
        Intrinsics.checkNotNullExpressionValue(categoryExplore, "createConfigSplitEntityData().categoryExplore");
        return categoryExplore;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isContactSyncEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getContactSyncConfig().onErrorResumeNext(createConfigAMCSEntityData().getContactSyncConfig()).map(extraCallbackWithResult.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…bj.isSynchronizeContact }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkIsResendWhatsAppEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isResendWhatsAppEnable = createConfigAMCSEntityData().isResendWhatsAppEnable();
        Intrinsics.checkNotNullExpressionValue(isResendWhatsAppEnable, "createConfigAMCSEntityDa…().isResendWhatsAppEnable");
        return isResendWhatsAppEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoClaimEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isPromoClaimEnable().onErrorResumeNext(createConfigAMCSEntityData().isPromoClaimEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isPromoClaimEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onTooManyRedirects> getSplitBillConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getSplitBillConfig().onErrorResumeNext(createConfigAMCSEntityData().getSplitBillConfig()).map(new b(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…(splitBillConfigResult) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isPromoCenterEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isPromoCenterEnable().onErrorResumeNext(createConfigAMCSEntityData().isPromoCenterEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ta().isPromoCenterEnable)");
        return onErrorResumeNext;
    }

    private final TitleBarRightButtonView.AnonymousClass1<Boolean> getSplitWithAmcsFallbackConfig(Function1<? super AppMsgReceiver.AnonymousClass2, ? extends TitleBarRightButtonView.AnonymousClass1<Boolean>> function1) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = ((TitleBarRightButtonView.AnonymousClass1) function1.invoke(createConfigSplitEntityData())).onErrorResumeNext(new ICustomTabsCallback(this, function1));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "getConfig.invoke(createC…      )\n                }");
        return onErrorResumeNext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "configEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass1<Boolean>> {
        final /* synthetic */ String $name;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(String str) {
            super(1);
            this.$name = str;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke(@NotNull AppMsgReceiver.AnonymousClass2 r2) {
            Intrinsics.checkNotNullParameter(r2, "configEntityData");
            TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature = r2.checkVisibilityFeature(this.$name);
            Intrinsics.checkNotNullExpressionValue(checkVisibilityFeature, "configEntityData.checkVisibilityFeature(name)");
            return checkVisibilityFeature;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return getSplitWithAmcsFallbackConfig(new getMin(str));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isQrisEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isQrisEnabled().onErrorResumeNext(createConfigAMCSEntityData().isQrisEnabled());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…tityData().isQrisEnabled)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isReferralSendMoneyEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isReferralSendMoneyEnable = createConfigAMCSEntityData().isReferralSendMoneyEnable();
        Intrinsics.checkNotNullExpressionValue(isReferralSendMoneyEnable, "createConfigAMCSEntityDa…isReferralSendMoneyEnable");
        return isReferralSendMoneyEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getWhitelistedSubMerchantId() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> whitelistedSubMerchantId = createConfigSplitEntityData().getWhitelistedSubMerchantId();
        Intrinsics.checkNotNullExpressionValue(whitelistedSubMerchantId, "createConfigSplitEntityD….whitelistedSubMerchantId");
        return whitelistedSubMerchantId;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Set<String>> getAddingNameWhitelistedSubMerchantId() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigSplitEntityData().getAddingNameWhitelistedSubMerchantId().flatMap(setMin.getMax);
        Intrinsics.checkNotNullExpressionValue(flatMap, "createConfigSplitEntityD…(merchantIdSet)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isSendMoneyPeerToCashEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isSendMoneyPeerToCashEnable().onErrorResumeNext(createConfigAMCSEntityData().isSendMoneyPeerToCashEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…endMoneyPeerToCashEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkDexguardRootCheckFeature() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isDexguardRootCheckEnable().onErrorResumeNext(createConfigAMCSEntityData().isDexguardRootCheckEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…sDexguardRootCheckEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkDexguardHookCheckFeature() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isDexguardHookCheckEnable().onErrorResumeNext(createConfigAMCSEntityData().isDexguardHookCheckEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…sDexguardHookCheckEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> checkDexguardTamperCheckFeature() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isDexguardTamperCheckEnable().onErrorResumeNext(createConfigAMCSEntityData().isDexguardTamperCheckEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…exguardTamperCheckEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getPageUrl> getPromoCenterConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = isPromoCenterEnable().flatMap(new toDoubleRange(this)).map(new exitApp$Grayscale$Algorithm(this));
        Intrinsics.checkNotNullExpressionValue(map, "isPromoCenterEnable\n    …apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureAnnouncementEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isFeatureAnnouncementEnable().onErrorResumeNext(createConfigAMCSEntityData().isFeatureAnnouncementEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…eatureAnnouncementEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Set<String>> getFeatureSkipButtonMerchantList() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigSplitEntityData().getFeatureSkipButtonMerchantList().flatMap(IsOverlapping.length);
        Intrinsics.checkNotNullExpressionValue(flatMap, "createConfigSplitEntityD…(merchantIdSet)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isMixpanelTrackEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isMixpanelTrackEnable().onErrorResumeNext(createConfigAMCSEntityData().isMixpanelTrackEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…().isMixpanelTrackEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFavoriteServicesEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigSplitEntityData().isFeatureSplitMigration().map(new onRelationshipValidationResult(this)).flatMap(new extraCallback(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "createConfigSplitEntityD…Enabled\n                }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFaceLoginEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isFaceLoginEnabled().timeout(3, TimeUnit.SECONDS).onErrorResumeNext(createConfigAMCSEntityData().isFaceLoginEnabled());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…ata().isFaceLoginEnabled)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isCameraCardEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().getFeatureCameraCard().onErrorResumeNext(createConfigAMCSEntityData().getFeatureCameraCard());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…Data().featureCameraCard)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setOnScrollChangedCallback> getGeofenceConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getGeofenceConfig().onErrorResumeNext(createConfigAMCSEntityData().getGeofenceConfig()).map(new isInside(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setWebViewClient> getDonationCampaignConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getDonationCampaignConfig().onErrorResumeNext(createConfigAMCSEntityData().getDonationCampaignConfig()).map(new toFloatRange(this));
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…apper.apply(sourceItem) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMaxBankAccount() {
        TitleBarRightButtonView.AnonymousClass1<Integer> maxBankAccount = createConfigAMCSEntityData().getMaxBankAccount();
        Intrinsics.checkNotNullExpressionValue(maxBankAccount, "createConfigAMCSEntityData().maxBankAccount");
        return maxBankAccount;
    }

    @NotNull
    public final onLoadResource getSplashAnimationConfig() {
        R blockingSingle = createConfigSplitEntityData().getSplashAnimationConfig().onErrorResumeNext(createConfigAMCSEntityData().getSplashAnimationConfig()).map(new getCause(this)).blockingSingle();
        Intrinsics.checkNotNullExpressionValue(blockingSingle, "createConfigSplitEntityD…        .blockingSingle()");
        return (onLoadResource) blockingSingle;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getTnCReferralMissionConfig() {
        TitleBarRightButtonView.AnonymousClass1<String> tnCReferralMission = createConfigAMCSEntityData().getTnCReferralMission();
        Intrinsics.checkNotNullExpressionValue(tnCReferralMission, "createConfigAMCSEntityData().tnCReferralMission");
        return tnCReferralMission;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementEnabled = createConfigAMCSEntityData().isStatementEnabled();
        Intrinsics.checkNotNullExpressionValue(isStatementEnabled, "createConfigAMCSEntityData().isStatementEnabled");
        return isStatementEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isStatementDownloadEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isStatementDownloadEnabled().onErrorResumeNext(createConfigAMCSEntityData().isStatementDownloadEnabled());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…StatementDownloadEnabled)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<overTime> setBroadcastSavingState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastDismissedBroadcast");
        return createMaintenanceBroadcastEntityData().setBroadcastSavingState(str);
    }

    private final showTitleLoading createMaintenanceBroadcastEntityData() {
        return this.maintenanceBroadcastDataFactory.createData("local");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<overTime> getBroadcastSavingState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "lastDismissedBroadcast");
        return createMaintenanceBroadcastEntityData().getBroadcastSavingState(str);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGnProxyEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorResumeNext = createConfigSplitEntityData().isFeatureGnProxyEnable().onErrorResumeNext(createConfigAMCSEntityData().isFeatureGnProxyEnable());
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createConfigSplitEntityD…).isFeatureGnProxyEnable)");
        return onErrorResumeNext;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isProfileCompletionWidgetEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> profileCompletionWidgetVisibility = createConfigSplitEntityData().getProfileCompletionWidgetVisibility();
        Intrinsics.checkNotNullExpressionValue(profileCompletionWidgetVisibility, "createConfigSplitEntityD…ompletionWidgetVisibility");
        return profileCompletionWidgetVisibility;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<getSettings> checkDeepLinkFeatureVisibility(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        TitleBarRightButtonView.AnonymousClass1<R> zipWith = createFeatureNonAmcsEntityData().isFeatureNonAMCS(str).zipWith(getSplitWithAmcsFallbackConfig(new length(str)), getMax.getMax);
        Intrinsics.checkNotNullExpressionValue(zipWith, "createFeatureNonAmcsEnti…                       })");
        return zipWith;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "configEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass1<Boolean>> {
        final /* synthetic */ String $name;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(String str) {
            super(1);
            this.$name = str;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke(@NotNull AppMsgReceiver.AnonymousClass2 r2) {
            Intrinsics.checkNotNullParameter(r2, "configEntityData");
            TitleBarRightButtonView.AnonymousClass1<Boolean> checkVisibilityFeature = r2.checkVisibilityFeature(this.$name);
            Intrinsics.checkNotNullExpressionValue(checkVisibilityFeature, "configEntityData.checkVisibilityFeature(name)");
            return checkVisibilityFeature;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isHomeRevampEnable() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = createConfigSplitEntityData().isHomeRevampEnable().startWith(TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(this.generalPreferences.getHomeRevampEnabledFlag()))).flatMap(new ICustomTabsCallback.Stub(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "createConfigSplitEntityD…nabled)\n                }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureQrisCrossBorderEnabled = createConfigSplitEntityData().isFeatureQrisCrossBorderEnabled();
        Intrinsics.checkNotNullExpressionValue(isFeatureQrisCrossBorderEnabled, "createConfigSplitEntityD…ureQrisCrossBorderEnabled");
        return isFeatureQrisCrossBorderEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getQrisCrossBorderSupportedCountries() {
        TitleBarRightButtonView.AnonymousClass1<List<String>> qrisCrossBorderSupportedCountries = createConfigSplitEntityData().getQrisCrossBorderSupportedCountries();
        Intrinsics.checkNotNullExpressionValue(qrisCrossBorderSupportedCountries, "createConfigSplitEntityD…sBorderSupportedCountries");
        return qrisCrossBorderSupportedCountries;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<setConfigUnits> getQrisCrossBorderContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getQrisCrossBorderContent(str).map(invoke.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…risCrossBorderContent() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<getAssetContent>> getGnBindingBenefits() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getGnBindingBenefits().onErrorResumeNext(createConfigAMCSEntityData().getGnBindingBenefits()).map(values.length);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…oGnBindingBenefitList() }");
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "it", "Lid/dana/data/config/source/ConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent extends Lambda implements Function1<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass1<Boolean>> {
        public static final onNavigationEvent INSTANCE = new onNavigationEvent();

        onNavigationEvent() {
            super(1);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke(@NotNull AppMsgReceiver.AnonymousClass2 r2) {
            Intrinsics.checkNotNullParameter(r2, "it");
            TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled = r2.isCScanBEnabled();
            Intrinsics.checkNotNullExpressionValue(isCScanBEnabled, "it.isCScanBEnabled");
            return isCScanBEnabled;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isCScanBEnabled() {
        return getSplitWithAmcsFallbackConfig(onNavigationEvent.INSTANCE);
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isInterstitialBannerEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isInterstitialBannerEnabled = createConfigSplitEntityData().isInterstitialBannerEnabled();
        Intrinsics.checkNotNullExpressionValue(isInterstitialBannerEnabled, "createConfigSplitEntityD…InterstitialBannerEnabled");
        return isInterstitialBannerEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureFeedHighlightEnabled() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureFeedHightlightEnabled = createConfigSplitEntityData().isFeatureFeedHightlightEnabled();
        Intrinsics.checkNotNullExpressionValue(isFeatureFeedHightlightEnabled, "createConfigSplitEntityD…tureFeedHightlightEnabled");
        return isFeatureFeedHightlightEnabled;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedInboxTabEnable() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeedInboxTabEnable = createConfigSplitEntityData().isFeedInboxTabEnable();
        Intrinsics.checkNotNullExpressionValue(isFeedInboxTabEnable, "createConfigSplitEntityData().isFeedInboxTabEnable");
        return isFeedInboxTabEnable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isChangeUsernameEnabled() {
        TitleBarRightButtonView.AnonymousClass1<R> onErrorReturnItem = createConfigSplitEntityData().isChangeUsernameEnabled().map(onPostMessage.length).onErrorReturnItem(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "createConfigSplitEntityD….onErrorReturnItem(false)");
        return onErrorReturnItem;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl> getPromoAdsFeatureConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getFeaturePromoAds().map(toString.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…romoAdsConfig()\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getDecodeQrTimeout() {
        TitleBarRightButtonView.AnonymousClass1<Long> decodeQrTimeout = createConfigSplitEntityData().getDecodeQrTimeout();
        Intrinsics.checkNotNullExpressionValue(decodeQrTimeout, "createConfigSplitEntityData().decodeQrTimeout");
        return decodeQrTimeout;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<postWebMessage> getReferralMessageTemplate() {
        TitleBarRightButtonView.AnonymousClass1<postWebMessage> shareReferralMessageTemplate = createConfigSplitEntityData().getShareReferralMessageTemplate();
        Intrinsics.checkNotNullExpressionValue(shareReferralMessageTemplate, "createConfigSplitEntityD…reReferralMessageTemplate");
        return shareReferralMessageTemplate;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<shouldOverrideUrlLoading> getShowAlipayConnectBrandConfig() {
        TitleBarRightButtonView.AnonymousClass1<shouldOverrideUrlLoading> showAlipayConnectBrandConfig = createConfigSplitEntityData().getShowAlipayConnectBrandConfig();
        Intrinsics.checkNotNullExpressionValue(showAlipayConnectBrandConfig, "createConfigSplitEntityD…wAlipayConnectBrandConfig");
        return showAlipayConnectBrandConfig;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> getMinimumRadiusInMeter() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getPromoAdsLocationConfig().map(exitApp$FastBitmap$CoordinateSystem.getMax);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…inimumRadiusInMeter\n    }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<clearExpired> getNearbyConfig() {
        TitleBarRightButtonView.AnonymousClass1<R> map = createConfigSplitEntityData().getNearbyConfig().map(hashCode.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "createConfigSplitEntityD…p { it.toNearbyConfig() }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> getSkuExplore() {
        TitleBarRightButtonView.AnonymousClass1<List<onReceivedHttpError>> skuExplore = createConfigSplitEntityData().getSkuExplore();
        Intrinsics.checkNotNullExpressionValue(skuExplore, "createConfigSplitEntityData().skuExplore");
        return skuExplore;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "it", "Lid/dana/data/config/source/ConfigEntityData;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady extends Lambda implements Function1<AppMsgReceiver.AnonymousClass2, TitleBarRightButtonView.AnonymousClass1<Boolean>> {
        public static final onMessageChannelReady INSTANCE = new onMessageChannelReady();

        onMessageChannelReady() {
            super(1);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> invoke(@NotNull AppMsgReceiver.AnonymousClass2 r2) {
            Intrinsics.checkNotNullParameter(r2, "it");
            TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureInvestmentEnabled = r2.isFeatureInvestmentEnabled();
            Intrinsics.checkNotNullExpressionValue(isFeatureInvestmentEnabled, "it.isFeatureInvestmentEnabled");
            return isFeatureInvestmentEnabled;
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureInvestmentEnabled() {
        return getSplitWithAmcsFallbackConfig(onMessageChannelReady.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final AppMsgReceiver.AnonymousClass2 createConfigAMCSEntityData() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData("amcs");
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.AMCS)");
        return createData;
    }

    /* access modifiers changed from: private */
    public final AppMsgReceiver.AnonymousClass2 createConfigSplitEntityData() {
        AppMsgReceiver.AnonymousClass2 createData = this.configEntityDataFactory.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "configEntityDataFactory.createData(Source.SPLIT)");
        return createData;
    }

    private final IMtopProxy.Callback createFeatureNonAmcsEntityData() {
        IMtopProxy.Callback createData = this.featureNonAMCSEntityDataFactory.createData("local");
        Intrinsics.checkNotNullExpressionValue(createData, "featureNonAMCSEntityData….createData(Source.LOCAL)");
        return createData;
    }
}
