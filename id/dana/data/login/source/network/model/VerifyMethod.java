package id.dana.data.login.source.network.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface VerifyMethod {
    public static final String NO_VERIFICATION = "NO_VERIFICATION";
    public static final String OTP_SMS = "OTP_SMS";
    public static final String PASSWORD = "PASSWORD";
    public static final String PUSH_VERIFY = "PUSH_VERIFY";
    public static final String VERIFY_BOKU = "CARRIER_IDENTIFICATION";
}
