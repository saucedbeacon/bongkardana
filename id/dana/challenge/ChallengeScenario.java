package id.dana.challenge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ChallengeScenario {
    public static final String AUTH_AGREEMENT = "auth_agreement";
    public static final String AUTO_ROUTE = "auto_route";
    public static final String FACE_ACTIVATION = "face_activation";
    public static final String LOGIN = "login";
    public static final String PAYMENT_AUTH = "payment_auth";
    public static final String REGISTRATION = "otp_registration";
    public static final String RELOGIN = "relogin";
    public static final String TRUST_RISK_LOGIN = "trust_risk_login";
    public static final String TRUST_RISK_LOGIN_TWILIO = "trust_risk_login_twilio";
    public static final String TWILIO_OTP = "twilio_otp";
    public static final String TWILIO_PIN = "twilio_pin";
    public static final String UNBIND_MERCHANT = "unbind_merchant";
}
