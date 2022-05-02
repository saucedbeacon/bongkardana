package id.dana.danah5.share.file;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ErrorCode {
    public static final String NO_APP_SUPPORTED_ERROR_CODE = "002";
    public static final String STORAGE_RUNNING_OUT_ERROR_CODE = "003";
}
