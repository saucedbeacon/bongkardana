package id.dana.domain.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface KybStatus {
    public static final String FAILED = "FAILED";
    public static final String INIT = "INIT";
    public static final String REVOKED = "REVOKED";
    public static final String SUCCESS = "SUCCESS";
}
