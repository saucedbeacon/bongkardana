package id.dana.myprofile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface MenuListViewType {
    public static final int NORMAL_MENU = 1;
    public static final int TOP_MENU = 0;
}
