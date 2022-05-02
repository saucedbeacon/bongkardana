package id.dana.domain.referral.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ReferralConstant {
    public static final String PAYMENT = "PAYMENT";
    public static final String USER_KYC = "USERKYC";
    public static final String USER_REGISTER = "USERREGISTER";
}
