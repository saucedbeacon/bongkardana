package id.dana.requestmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BundleKey {
    public static final String AMOUNT = "amount";
    public static final String ENABLE_REMARKS = "enableRemarks";
    public static final String MAXIMUM_AMOUNT = "maxAmount";
    public static final String MINIMUM_AMOUNT = "minAmount";
    public static final String SEPARATOR_VISIBILITY = "sourceActivity";
    public static final String TITLE = "title";
}
