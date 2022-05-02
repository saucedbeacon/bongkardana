package id.dana.myprofile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface SubtitleType {
    public static final String ACCOUNT_TYPE = "ACCOUNT_TYPE";
    public static final String BALANCE = "BALANCE";
    public static final String EMAIL = "EMAIL";
    public static final String ERROR_FETCH = "-";
    public static final String MOBILE_NUMBER = "MOBILE_NUMBER";
    public static final String PAYMENT_CARDS = "PAYMENT_CARDS";
    public static final String REAL_NAME = "REAL_NAME";
    public static final String SAVING = "SAVING";
    public static final String SECURITY_QUESTIONS = "SECURITY_QUESTIONS";
}
