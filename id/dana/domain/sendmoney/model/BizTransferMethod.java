package id.dana.domain.sendmoney.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BizTransferMethod {
    public static final String BALANCE = "BALANCE";
    public static final String BANK_TRANSFER = "BANK_TRANSFER";
    public static final String LINK = "LINK";
    public static final String OTC = "OTC";
}
