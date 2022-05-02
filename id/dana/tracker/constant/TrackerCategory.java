package id.dana.tracker.constant;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface TrackerCategory {
    public static final String RDS_ON_CONTROL_CLICK = "rds_on_control_click";
    public static final String RDS_ON_KEY_DOWN = "rds_on_key_down";
    public static final String RDS_ON_LOST_FOCUS = "rds_on_lost_focus";
    public static final String RDS_ON_PAGE = "rds_on_page";
    public static final String RDS_ON_PAGE_ZIP = "rds_on_page_zip";
    public static final String RDS_ON_TOUCH_SCREEN = "rds_on_touch_screen";
}
