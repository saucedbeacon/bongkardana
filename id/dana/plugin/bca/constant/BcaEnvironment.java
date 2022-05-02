package id.dana.plugin.bca.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface BcaEnvironment {
    public static final String DEV = "DEV";
    public static final String PROD = "PROD";
}
