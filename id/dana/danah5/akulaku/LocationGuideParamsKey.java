package id.dana.danah5.akulaku;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface LocationGuideParamsKey {
    public static final String KEY_FAIL_MESSAGE = "failMessage";
    public static final String KEY_FAIL_TITLE = "failTitle";
    public static final String KEY_GUIDE_ACTION = "action";
    public static final String KEY_GUIDE_MESSAGE = "guideMessage";
    public static final String KEY_GUIDE_TITLE = "guideTitle";
}
