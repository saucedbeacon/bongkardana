package id.dana.domain.lazada;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LazadaEntryType {
    public static final String IPG_REGISTRATION = "ipgRegistration";
    public static final String LAZADA = "lazada";
}
