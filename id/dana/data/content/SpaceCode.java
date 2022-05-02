package id.dana.data.content;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SpaceCode {
    public static final String DANA_TUTORIAL = "native_home_tutorial";
    public static final String EXPLORE_DANA = "native_explore_dana";
    public static final String GLOBAL_SEARCH_POPULAR = "search_popular_001";
    public static final String HOME_MORE_FOR_YOU_INFO = "native_home_moreinfo";
    public static final String HOME_PROMO_BANNER = "native_promo_banner_home";
    public static final String HOME_REFERRAL_BANNER = "native_home_referral_banner";
    public static final String HOME_REFERRAL_P2P_BANNER = "native_home_referral_p2p_banner";
    public static final String HOME_SHOPPING_BANNER = "native_linked_accounts_banner";
    public static final String INTERSTITIAL_BANNER = "native_interstitial_banner";
    public static final String LEADERBOARD_BANNER = "native_leaderboard_banner_home";
    public static final String PROMO_CLAIM_BANNER = "native_promo_claim_banner";
    public static final String REFERRAL_TRACKER_EMPTY_PLACEHOLDER = "native_referral_empty_state_image";
    public static final String SEND_MONEY_BANNER = "native_promo_banner_send_money";
    public static final String SEND_MONEY_VENDOR_LOGO = "native_x2c_agent_image";
}
