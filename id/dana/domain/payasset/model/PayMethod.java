package id.dana.domain.payasset.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PayMethod {
    public static final String ALL = "ALL";
    public static final String BALANCE = "BALANCE";
    public static final String COUPON = "COUPON";
    public static final String CREDIT_CARD = "CREDIT_CARD";
    public static final String DEBIT_CARD = "DEBIT_CARD";
    public static final String DIRECT_DEBIT_CREDIT_CARD = "DIRECT_DEBIT_CREDIT_CARD";
    public static final String DIRECT_DEBIT_DEBIT_CARD = "DIRECT_DEBIT_DEBIT_CARD";
    public static final String NET_BANKING = "NET_BANKING";
    public static final String VIRTUAL_ACCOUNT = "VIRTUAL_ACCOUNT";
}
