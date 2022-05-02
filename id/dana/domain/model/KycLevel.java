package id.dana.domain.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface KycLevel {
    public static final String KYC_0 = "KYC0";
    public static final String KYC_1 = "KYC1";
    public static final String KYC_2 = "KYC2";
}
