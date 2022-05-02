package o;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lid/dana/data/config/source/split/DefaultJsonPath;", "", "()V", "DEFAULT_APP_VERSION", "", "DEFAULT_BCA_ONEKLIK_WEBVIEW_INTERCEPT_CONFIG", "DEFAULT_CATEGORY_EXPLORE", "DEFAULT_CONFIG_PROMO_CENTER", "DEFAULT_EWALLET_AFFIXES", "DEFAULT_EWALLET_CATEGORY_LIST", "DEFAULT_EWALLET_INNOV_CONFIG", "DEFAULT_FEATURE_CHANGE_USERNAME", "DEFAULT_FEATURE_CONTACT_SYNC", "DEFAULT_FEATURE_DEEPLINK_ENTRIES", "DEFAULT_FEATURE_ELECTRONIC_MONEY", "DEFAULT_FEATURE_GEOFENCE", "DEFAULT_FEATURE_GLOBAL_SEARCH_CATEGORIES", "DEFAULT_FEATURE_H5_ENTRIES", "DEFAULT_FEATURE_REQUEST_MONEY", "DEFAULT_FEATURE_SHOW_EXPRESSPAY", "DEFAULT_FEATURE_SPLIT_BILL_CONFIG", "DEFAULT_FEATURE_STORE_REVIEW", "DEFAULT_FEATURE_TERMS_CONDITIONS", "DEFAULT_FEED_CONFIG", "DEFAULT_FEED_HOME_CONFIG", "DEFAULT_GEOCODE_REVERSE_CONFIG", "DEFAULT_GLOBAL_SEARCH_CONFIG", "DEFAULT_GN_CONTENT", "Lkotlin/Function1;", "getDEFAULT_GN_CONTENT", "()Lkotlin/jvm/functions/Function1;", "DEFAULT_GN_COUNTRIES", "DEFAULT_GN_COUNTRY_FLAG", "DEFAULT_GN_COUNTRY_FLAG_SQUARE", "DEFAULT_GN_CSCANB_BLACKLISTED_COUNTRY", "DEFAULT_MERCHANT_CATEGORIES", "DEFAULT_MERCHANT_CATEGORIES_ORDER_JSON", "DEFAULT_MERCHANT_CATEGORIES_V2", "DEFAULT_MERCHANT_LIST_CATEGORIES_ORDER", "DEFAULT_MERCHANT_MAPS_CATEGORIES_ORDER", "DEFAULT_MERCHANT_SUB_CATEGORIES", "DEFAULT_MERCHANT_SUB_CATEGORIES_V2", "DEFAULT_MERCHANT_TOPUP", "DEFAULT_NEARBY_CONFIG", "DEFAULT_NEARBY_MERCHANT_CONFIG", "DEFAULT_NEARBY_RANKING_CONFIG", "DEFAULT_PAYMENT_METHODS", "DEFAULT_QRIS_CROSS_BORDER_SUPPORTED_COUNTRIES", "DEFAULT_REPORT_REASONS", "DEFAULT_SAVING_EMPTY_STATE_CONFIG", "DEFAULT_SENDMONEY_HOME_CATEGORY", "DEFAULT_SENDMONEY_HOME_MENU_SCENARIO", "DEFAULT_SEND_MONEY_PAYMETHOD_SECTION", "DEFAULT_SEND_MONEY_SOCIAL_MEDIA", "DEFAULT_SHARE_REFERRAL_MESSAGE_TEMPLATE", "DEFAULT_SHOW_ALIPAYCONNECT_BRAND", "DEFAULT_SKU_EXPLORE", "DEFAULT_SPLASH_ANIMATION", "DEFAULT_SUB_MERCHANT_ID_ADDING_NAME", "DEFAULT_SUB_MERCHANT_ID_SKIP_BUTTON_ADDING_NAME", "DEFAULT_TNC_REFERRAL_QUEST", "DEFAULT_TWILIO_TIMEOUT", "DEFAULT_VALID_EXTERNAL_DOMAIN", "DEFAULT_X2B_REDIRECT_ALL_BILLER_DATA", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class BaseAppContext {
    @NotNull
    public static final String DEFAULT_APP_VERSION = "split/default-app-version.json";
    @NotNull
    public static final String DEFAULT_BCA_ONEKLIK_WEBVIEW_INTERCEPT_CONFIG = "split/default-bca-oneklik-webview-intercept-config.json";
    @NotNull
    public static final String DEFAULT_CATEGORY_EXPLORE = "split/default-category-explore.json";
    @NotNull
    public static final String DEFAULT_CONFIG_PROMO_CENTER = "split/default-config-promo-center.json";
    @NotNull
    public static final String DEFAULT_EWALLET_AFFIXES = "split/default-ewallet-prefix-list.json";
    @NotNull
    public static final String DEFAULT_EWALLET_CATEGORY_LIST = "split/default-ewallet-categories-list.json";
    @NotNull
    public static final String DEFAULT_EWALLET_INNOV_CONFIG = "split/default-ewallet-innov-config.json";
    @NotNull
    public static final String DEFAULT_FEATURE_CHANGE_USERNAME = "split/default-feature-change-username.json";
    @NotNull
    public static final String DEFAULT_FEATURE_CONTACT_SYNC = "split/default-feature-contact-sync.json";
    @NotNull
    public static final String DEFAULT_FEATURE_DEEPLINK_ENTRIES = "split/default-feature-deeplink-entries.json";
    @NotNull
    public static final String DEFAULT_FEATURE_ELECTRONIC_MONEY = "split/default-feature-electronic-money.json";
    @NotNull
    public static final String DEFAULT_FEATURE_GEOFENCE = "split/default-feature-geofence.json";
    @NotNull
    public static final String DEFAULT_FEATURE_GLOBAL_SEARCH_CATEGORIES = "split/default-feature-global-search-categories.json";
    @NotNull
    public static final String DEFAULT_FEATURE_H5_ENTRIES = "split/default-feature-h5-entries.json";
    @NotNull
    public static final String DEFAULT_FEATURE_REQUEST_MONEY = "split/default-feature-request-money.json";
    @NotNull
    public static final String DEFAULT_FEATURE_SHOW_EXPRESSPAY = "split/default-feature-show-expresspay.json";
    @NotNull
    public static final String DEFAULT_FEATURE_SPLIT_BILL_CONFIG = "split/default-feature-split-bill-config.json";
    @NotNull
    public static final String DEFAULT_FEATURE_STORE_REVIEW = "split/default-feature-store-review.json";
    @NotNull
    public static final String DEFAULT_FEATURE_TERMS_CONDITIONS = "split/default-feature-terms-conditions.json";
    @NotNull
    public static final String DEFAULT_FEED_CONFIG = "split/default-feed-config.json";
    @NotNull
    public static final String DEFAULT_FEED_HOME_CONFIG = "split/feed-home-config.json";
    @NotNull
    public static final String DEFAULT_GEOCODE_REVERSE_CONFIG = "split/default-geocode-reverse-config.json";
    @NotNull
    public static final String DEFAULT_GLOBAL_SEARCH_CONFIG = "split/default-global-search-config.json";
    @NotNull
    private static final Function1<String, String> DEFAULT_GN_CONTENT = setMax.INSTANCE;
    @NotNull
    public static final String DEFAULT_GN_COUNTRIES = "split/default-gn-countries.json";
    @NotNull
    public static final String DEFAULT_GN_COUNTRY_FLAG = "split/default-gn-country-flag.json";
    @NotNull
    public static final String DEFAULT_GN_COUNTRY_FLAG_SQUARE = "split/default-gn-country-flag-square.json";
    @NotNull
    public static final String DEFAULT_GN_CSCANB_BLACKLISTED_COUNTRY = "split/default-gn-cscanb-blacklisted-country.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_CATEGORIES = "split/default-merchant-categories.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_CATEGORIES_ORDER_JSON = "split/default-merchant-order.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_CATEGORIES_V2 = "split/default-new-merchant-categories.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_LIST_CATEGORIES_ORDER = "split/default-merchant-list-categories-order.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_MAPS_CATEGORIES_ORDER = "split/default-merchant-maps-categories-order.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_SUB_CATEGORIES = "split/default-merchant-sub-categories.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_SUB_CATEGORIES_V2 = "split/default-new-merchant-sub-categories.json";
    @NotNull
    public static final String DEFAULT_MERCHANT_TOPUP = "split/default-merchant-topup-agent.json";
    @NotNull
    public static final String DEFAULT_NEARBY_CONFIG = "split/default-nearby-config.json";
    @NotNull
    public static final String DEFAULT_NEARBY_MERCHANT_CONFIG = "split/default-nearby-merchant-detail.json";
    @NotNull
    public static final String DEFAULT_NEARBY_RANKING_CONFIG = "split/default-nearby-ranking-config-v2.json";
    @NotNull
    public static final String DEFAULT_PAYMENT_METHODS = "split/default-send-money-paymethod.json";
    @NotNull
    public static final String DEFAULT_QRIS_CROSS_BORDER_SUPPORTED_COUNTRIES = "split/default-qris-cross-border-supported-countries.json";
    @NotNull
    public static final String DEFAULT_REPORT_REASONS = "split/default-report-reasons.json";
    @NotNull
    public static final String DEFAULT_SAVING_EMPTY_STATE_CONFIG = "split/default-saving-empty-state.json";
    @NotNull
    public static final String DEFAULT_SENDMONEY_HOME_CATEGORY = "split/default-sendmoney-home-category.json";
    @NotNull
    public static final String DEFAULT_SENDMONEY_HOME_MENU_SCENARIO = "split/default-sendmoney-home-menu-scenario.json";
    @NotNull
    public static final String DEFAULT_SEND_MONEY_PAYMETHOD_SECTION = "split/default-send-money-paymethod-section.json";
    @NotNull
    public static final String DEFAULT_SEND_MONEY_SOCIAL_MEDIA = "split/default-send-money-social-media.json";
    @NotNull
    public static final String DEFAULT_SHARE_REFERRAL_MESSAGE_TEMPLATE = "split/default-share-referral-message-template.json";
    @NotNull
    public static final String DEFAULT_SHOW_ALIPAYCONNECT_BRAND = "split/default_show_alipayconnect_brand.json";
    @NotNull
    public static final String DEFAULT_SKU_EXPLORE = "split/default-sku-explore.json";
    @NotNull
    public static final String DEFAULT_SPLASH_ANIMATION = "split/default-splash-animation.json";
    @NotNull
    public static final String DEFAULT_SUB_MERCHANT_ID_ADDING_NAME = "split/default-adding-name-merchant-whitelist.json";
    @NotNull
    public static final String DEFAULT_SUB_MERCHANT_ID_SKIP_BUTTON_ADDING_NAME = "split/default-adding-name-merchant-skip-button-whitelist.json";
    @NotNull
    public static final String DEFAULT_TNC_REFERRAL_QUEST = "split/feature-referral-url-tnc.json";
    @NotNull
    public static final String DEFAULT_TWILIO_TIMEOUT = "split/default-twilio-timeout.json";
    @NotNull
    public static final String DEFAULT_VALID_EXTERNAL_DOMAIN = "split/default-valid-external-domain.json";
    @NotNull
    public static final String DEFAULT_X2B_REDIRECT_ALL_BILLER_DATA = "split/default-x2b-redirect-all-biller-data.json";
    @NotNull
    public static final BaseAppContext INSTANCE = new BaseAppContext();

    public interface InitTabBarListener {
        @OperationType("alipayplus.mobilewallet.cdp.space.get")
        @SignCheck
        setNodeId get(AnonymousClass1 r1);
    }

    private BaseAppContext() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "countryName", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<String, String> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        @NotNull
        public final String invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "countryName");
            StringBuilder sb = new StringBuilder("split/default-gn-content-{");
            sb.append(str);
            sb.append("}.json");
            return sb.toString();
        }
    }

    @NotNull
    public final Function1<String, String> getDEFAULT_GN_CONTENT() {
        return DEFAULT_GN_CONTENT;
    }
}
