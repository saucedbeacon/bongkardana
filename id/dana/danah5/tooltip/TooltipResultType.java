package id.dana.danah5.tooltip;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TooltipResultType {
    public static final String NO_CONTENT_INFO = "NO_CONTENT_INFO";
    public static final String NO_MESSAGE = "NO_MESSAGE";
    public static final String SUCCESS = "SUCCESS";
    public static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";
}
