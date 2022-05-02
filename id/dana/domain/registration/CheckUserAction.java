package id.dana.domain.registration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface CheckUserAction {
    public static final String LOGIN = "PAGE_NORMAL_LOGIN";
    public static final String REGISTER = "PAGE_MAIN_APP_REG_OTP_VERIFY";
    public static final String TRUST_RISK_LOGIN = "PAGE_RISK_TRUST_LOGIN";
}
