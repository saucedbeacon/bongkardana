package id.dana.promoquest.handler.nativepage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface NativePageType {
    public static final String ALL_SERVICES = "ALL_SERVICES";
    public static final String SCAN_QR = "SCAN_QR";
    public static final String SEND_MONEY = "SEND_MONEY";
}
