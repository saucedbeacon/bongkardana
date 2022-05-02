package id.dana.domain.promotion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PromotionValue {
    public static final String DEFAULT_MOBILE_RECHARGE = "Beli pulsa di sini";
}
