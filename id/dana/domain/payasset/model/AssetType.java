package id.dana.domain.payasset.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface AssetType {
    public static final String CREDIT_CARD = "CREDIT_CARD";
    public static final String DEBIT_CARD = "DEBIT_CARD";
}
