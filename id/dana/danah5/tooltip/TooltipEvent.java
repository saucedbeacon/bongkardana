package id.dana.danah5.tooltip;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TooltipEvent {
    public static final String BOTTOM_SHEET = "bottomSheet";
    public static final String SHOW_CASE = "showcase";
}
