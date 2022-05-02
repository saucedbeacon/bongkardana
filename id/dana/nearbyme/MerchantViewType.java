package id.dana.nearbyme;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MerchantViewType {
    public static final String MERCHANT_CAT_ALL = "mc_all";
    public static final String MERCHANT_CAT_COVID_19 = "mc_covid";
    public static final String MERCHANT_CAT_DANA_BISNIS = "mc_dana_bisnis";
    public static final String MERCHANT_CAT_ENTERTAINMENT = "mc_6";
    public static final String MERCHANT_CAT_FINANCIAL = "mc_7";
    public static final String MERCHANT_CAT_FOOD_AND_BEVERAGES = "mc_1";
    public static final String MERCHANT_CAT_HEALTH = "mc_5";
    public static final String MERCHANT_CAT_NON_PROFIT_ORGANIZATION = "mc_8";
    public static final String MERCHANT_CAT_OPEN_NOW = "mc_open_now";
    public static final String MERCHANT_CAT_ORDER_ONLINE = "mc_order_online";
    public static final String MERCHANT_CAT_PROFESSIONAL_SERVICES = "mc_4";
    public static final String MERCHANT_CAT_PROMO = "mc_promo";
    public static final String MERCHANT_CAT_RETAIL = "mc_2";
    public static final String MERCHANT_CAT_TOP_UP_AGENT = "mc_3";
}
