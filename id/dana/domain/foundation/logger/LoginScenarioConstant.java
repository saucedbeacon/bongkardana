package id.dana.domain.foundation.logger;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LoginScenarioConstant {
    public static final String LOGIN = "normalLogin";
    public static final String NORMAL_BOKU_LOGIN = "normalBokuLogin";
    public static final String OTPLOGIN = "otpLogin";
    public static final String RELOGIN = "reLogin";
    public static final String TRUSTRISKLOGIN = "trustRiskLogin";
    public static final String TRUST_BOKU_LOGIN = "trustBokuLogin";
}
