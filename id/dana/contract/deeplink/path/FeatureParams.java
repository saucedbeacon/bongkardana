package id.dana.contract.deeplink.path;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface FeatureParams {
    public static final String ACCOUNT_NUMBER = "account_number";
    public static final String AMOUNT = "amount";
    public static final String BANK_ID = "bank_id";
    public static final String CATEGORY = "category";
    public static final String KEYWORD = "keyword";
    public static final String LOCATION_LAT = "lat";
    public static final String LOCATION_LONG = "long";
    public static final String MERCHANT_ID = "merchantId";
    public static final String MOBILE_NUMBER = "mobile_number";
    public static final String NEARBY_REVAMP = "nearby_revamp";
    public static final String OPEN_SERVICE = "service";
    public static final String SERVICES_LIST = "services";
    public static final String SHOP_ID = "shopId";
    public static final String SOURCE = "source";
}
