package id.dana.plugin.bca.oneklik;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BcaOneKlikEvent {
    public static final String INFORMATION = "information";
    public static final String REGISTRATION = "registration";
    public static final String UPDATELIMIT = "updateLimit";
}
