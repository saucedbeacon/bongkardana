package id.dana.sendmoney;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TransferType {
    public static final String ATM_TRANSFER = "ATM_TRANSFER";
    public static final String BALANCE = "BALANCE";
    public static final String BANK = "BANK_TRANSFER";
    public static final String LINK = "LINK";
    public static final String OTC = "OTC";
}
