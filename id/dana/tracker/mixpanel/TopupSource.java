package id.dana.tracker.mixpanel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TopupSource {
    public static final String DANA_PAY = "danaPay";
    public static final String DANA_WALLET = "danaWallet";
    public static final String FOUR_KING_KONG = "fourKingKong";
    public static final String NEARBY = "nearbyMe";
    public static final String PROFILE_PAGE = "profilePage";
    public static final String PROMOTION_BANNER = "promotionBanner";
    public static final String PROMOTION_CENTER = "promotionCenter";
    public static final String PROMO_QUEST = "promoQuest";
    public static final String SEND_MONEY = "sendMoney";
}
