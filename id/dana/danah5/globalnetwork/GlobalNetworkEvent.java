package id.dana.danah5.globalnetwork;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface GlobalNetworkEvent {
    public static final String BOTTOM_SHEET = "bottomSheet";
    public static final String GET_FOREX_BALANCE = "balance";
    public static final String INQUIRY_FOREX_RATE = "rate";
}
