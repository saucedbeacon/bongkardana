package id.dana.domain.promoquest.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PrizeType {
    public static final String CASHBACK = "CASHBACK";
    public static final String CASHCOUPON = "CASHCOUPON";
    public static final String CHANCETOKEN = "CHANCETOKEN";
    public static final String DISCOUNTCOUPON = "DISCOUNTCOUPON";
}
