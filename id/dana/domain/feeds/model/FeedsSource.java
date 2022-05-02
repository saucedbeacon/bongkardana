package id.dana.domain.feeds.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface FeedsSource {
    public static final String GLOBAL = "GLOBAL";
    public static final String USER = "USER";
}
