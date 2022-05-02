package id.dana.domain.qrpay.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface FundSource {
    public static final int CREDIT_CARD = 2;
    public static final int DANA_BALANCE = 3;
    public static final int DEBIT_CARD = 1;
}
