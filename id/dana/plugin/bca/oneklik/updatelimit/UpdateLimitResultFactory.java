package id.dana.plugin.bca.oneklik.updatelimit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class UpdateLimitResultFactory {

    @Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        public static final String ERROR_CODE_BACKPRESSED = "003";
        public static final String ERROR_CODE_PERMISSION_DENIED = "004";
        public static final String ERROR_CODE_TOKEN_EXPIRED = "002";
        public static final String ERROR_CODE_UNKNOWN_ERROR = "001";
    }
}
