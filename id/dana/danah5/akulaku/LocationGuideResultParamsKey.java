package id.dana.danah5.akulaku;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LocationGuideResultParamsKey {
    public static final String RESULT_ERROR_CODE = "errorCode";
    public static final String RESULT_STATUS = "status";
}
