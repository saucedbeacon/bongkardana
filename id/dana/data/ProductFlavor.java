package id.dana.data;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ProductFlavor {
    public static final String DEV = "dev";
    public static final String INTEGRATION_1 = "integration1";
    public static final String INTEGRATION_2 = "integration2";
    public static final String PREPROD = "preprod";
    public static final String PRODUCTION = "production";
    public static final String PUBSIT = "publicsit";
    public static final String SIT = "sit";
}
