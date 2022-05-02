package id.dana.domain.payasset.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PayOption {
    public static final String BALANCE = "BALANCE";
    public static final String CREDIT_CARD_MASTER = "CREDIT_CARD_MASTER";
    public static final String CREDIT_CARD_VISA = "CREDIT_CARD_VISA";
    public static final String DEBIT_CARD_MASTER = "DEBIT_CARD_MASTER";
    public static final String DEBIT_CARD_VISA = "DEBIT_CARD_VISA";
    public static final String DIRECT_DEBIT_BRI = "DD_DEBIT_CARD_BRI";
    public static final String DIRECT_DEBIT_MANDIRI = "DD_DEBIT_CARD_MDRIC1ID";
    public static final String NET_BANKING_BCA = "NET_BANKING_BCA";
}
