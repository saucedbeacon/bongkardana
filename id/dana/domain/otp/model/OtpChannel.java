package id.dana.domain.otp.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface OtpChannel {
    public static final String SMS = "SMS_CODE";
    public static final String WHATSAPP = "WA_CODE";
}
