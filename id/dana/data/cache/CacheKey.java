package id.dana.data.cache;

public interface CacheKey {
    public static final String CDP = "alipayplus.mobilewallet.cdp.space.get";
    public static final String delimiter = "#";

    public @interface HOME {
        public static final String CDP_BANNER = "alipayplus.mobilewallet.cdp.space.get#native_promo_banner_home";
        public static final String CDP_DANA_TUTORIAL = "alipayplus.mobilewallet.cdp.space.get#native_home_tutorial";
        public static final String CDP_EXPLORE = "alipayplus.mobilewallet.cdp.space.get#native_explore_dana";
        public static final String CDP_HOME_REFERRAL = "alipayplus.mobilewallet.cdp.space.get#native_home_referral_banner";
        public static final String CDP_HOME_REFERRAL_P2P = "alipayplus.mobilewallet.cdp.space.get#native_home_referral_p2p_banner";
        public static final String CDP_HOME_SHOPPING_BANNER = "alipayplus.mobilewallet.cdp.space.get#native_linked_accounts_banner";
        public static final String CDP_LEADERBOARD = "alipayplus.mobilewallet.cdp.space.get#native_leaderboard_banner_home";
        public static final String CDP_MORE_FOR_YOU_INFO = "alipayplus.mobilewallet.cdp.space.get#native_home_moreinfo";
        public static final String CDP_PROMO_CLAIM = "alipayplus.mobilewallet.cdp.space.get#native_promo_claim_banner";
        public static final String CDP_SENDMONEY_HOME_BANNER = "alipayplus.mobilewallet.cdp.space.get#native_promo_banner_send_money";
        public static final String FEEDS = "alipayplus.mobilewallet.feeds.fetchActivity";
        public static final String FEEDS_GLOBAL = "alipayplus.mobilewallet.feeds.fetchActivity#GLOBAL";
    }
}
