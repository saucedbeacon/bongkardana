package id.dana.danah5.share.file;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ShareFileResultType {
    public static final String GENERAL_ERROR = "GENERAL_ERROR";
    public static final String NO_APP_SUPPORTED_ERROR = "NO_APP_SUPPORTED_ERROR";
    public static final String STORAGE_RUNNING_OUT_ERROR = "STORAGE_RUNNING_OUT_ERROR";
    public static final String SUCCESS = "SUCCESS";
}
