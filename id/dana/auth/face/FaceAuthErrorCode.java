package id.dana.auth.face;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface FaceAuthErrorCode {
    public static final int CANCEL = 1003;
    public static final int FAIL = 1001;
    public static final int INVALID_PARAMS = 1006;
    public static final int TIMEOUT = 1005;
}
