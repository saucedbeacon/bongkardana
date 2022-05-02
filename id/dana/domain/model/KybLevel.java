package id.dana.domain.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface KybLevel {
    public static final String KYB_1 = "1";
    public static final String KYB_3 = "3";
}
