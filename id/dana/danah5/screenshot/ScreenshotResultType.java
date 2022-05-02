package id.dana.danah5.screenshot;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface ScreenshotResultType {
    public static final String LOW_STORAGE = "004";
    public static final String NO_ACCESS = "002";
    public static final String SAVE_FAIL = "003";
    public static final String SUCCESS = "001";
}
