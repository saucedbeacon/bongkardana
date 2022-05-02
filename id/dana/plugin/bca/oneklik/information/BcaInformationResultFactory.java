package id.dana.plugin.bca.oneklik.information;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class BcaInformationResultFactory {

    @Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        public static final String ERROR_CODE_PERMISSION_DENIED = "002";
        public static final String ERROR_CODE_UNKNOWN_ERROR = "001";
    }
}
