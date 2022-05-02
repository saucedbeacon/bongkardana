package id.dana.domain.globalnetwork;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface CountryCode {
    public static final String INDONESIA = "ID";
    public static final String JAPAN = "JP";
}
