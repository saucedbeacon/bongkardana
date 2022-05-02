package id.dana.data.security;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface PublicKeyScene {
    public static final String CARD_CREDENTIAL = "CARD_CREDENTIAL";
    public static final String F2FPAY = "F2FPAY";
    public static final String LOGIN = "LOGIN";
}
