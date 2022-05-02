package id.dana.danah5.akulaku;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LocationGuideResultType {
    public static final int RESULT_STATUS_FAILED = 1;
    public static final int RESULT_STATUS_SUCCESS = 0;
}
