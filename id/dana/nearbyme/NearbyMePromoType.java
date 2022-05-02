package id.dana.nearbyme;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface NearbyMePromoType {

    @Retention(RetentionPolicy.SOURCE)
    public @interface LimitRangeType {
        public static final String DC = "DC";
        public static final String LC = "LC";
        public static final String MC = "MC";
        public static final String WC = "WC";
        public static final String YC = "YC";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LimitType {
        public static final String DIVISION_ID = "DIVISION_ID";
        public static final String IP_ROLE_ID = "IP_ROLE_ID";
        public static final String MERCHANT_ID = "MERCHANT_ID";
        public static final String SHOP_ID = "SHOP_ID";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PaymentMethodType {
        public static final String ALL = "";
        public static final String BALANCE = "BALANCE";
        public static final String COUPON = "COUPON";
        public static final String CREDIT_CARD = "CREDIT_CARD";
        public static final String DEBIT_CARD = "DEBIT_CARD";
        public static final String DIRECT_DEBIT_CREDIT_CARD = "DIRECT_DEBIT_CREDIT_CARD";
        public static final String DIRECT_DEBIT_DEBIT_CARD = "DIRECT_DEBIT_DEBIT_CARD";
        public static final String NET_BANKING = "NET_BANKING";
        public static final String ONLINE_CREDIT = "ONLINE_CREDIT";
        public static final String VIRTUAL_ACCOUNT = "VIRTUAL_ACCOUNT";
    }
}
