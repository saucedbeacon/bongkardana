package id.dana.domain.otp.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SendStrategy {
    public static final String AP_LOGIN = "AP_LOGIN";
    public static final String TWILIO_CONSULT = "TWILIO_CONSULT";
    public static final String TWILIO_DEREGISTER = "TWILIO_DEREGISTER";
}
