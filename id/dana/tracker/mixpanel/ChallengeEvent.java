package id.dana.tracker.mixpanel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface ChallengeEvent {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Channel {
        public static final String SMS = "SMS";
        public static final String WHATSAPP = "Whatsapp";
    }

    public @interface Property {
        public static final String BOKU_SILENT_OTP_DURATION = "$duration";
        public static final String BOKU_SILENT_OTP_SUCCESS = "Success";
        public static final String OTP_CHANNEL = "OTP Channel";
        public static final String OTP_NUMBER_OF_ATTEMPTS = "OTP Number of Attempts";
        public static final String OTP_NUMBER_OF_REQUESTS = "OTP Number of Requests";
        public static final String OTP_SUCCESS = "OTP Success";
        public static final String PIN_SUCCESS = "PIN Success";
        public static final String SOURCE = "Source";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Source {
        public static final String FACE_ACTIVATION = "Face Activation";
        public static final String LOGIN = "Login";
        public static final String PAYMENT_AUTH = "Payment Authentication";
        public static final String REGISTRATION = "Registration";
        public static final String RELOGIN = "Re-login";
        public static final String TRUST_RISK_LOGIN = "Trust Risk Login";
        public static final String UNBIND_MERCHANT = "Unbind Merchant";
    }
}
