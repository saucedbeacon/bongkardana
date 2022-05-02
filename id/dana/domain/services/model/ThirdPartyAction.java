package id.dana.domain.services.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ThirdPartyAction {
    public static final String GET = "GET";
    public static final String POST = "POST";
}
