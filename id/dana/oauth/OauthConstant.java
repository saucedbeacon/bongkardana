package id.dana.oauth;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public @interface OauthConstant {

    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorPathOauth {
        public static final String CANCEL = "ERROR_CANCEL";
        public static final String TRY_AGAIN = "ERROR_TRY_AGAIN";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocalErrorCode {
        public static final String ACCESS_CANCEL = "ACCESS_CANCEL";
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PathParams {
        public static final String ERROR_CODE = "errorCode";
        public static final String ERROR_DESCRIPTION = "errorDescription";
        public static final String MOBILE_AUTH_CODE = "mobileAuthCode";
        public static final String SERVER_AUTH_CODE = "serverAuthCode";
        public static final String STATE_CODE = "stateCode";
    }
}
