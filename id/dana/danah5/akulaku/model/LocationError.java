package id.dana.danah5.akulaku.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LocationError {
    public static final int LOCATION_FAILED = 13;
    public static final int LOCATION_TIMEOUT = 14;
    public static final int NETWORK_LOCATING_ERROR = 12;
    public static final int NO_LBS_PERMISSION = 11;
    public static final int SUCCESS = 0;
}
