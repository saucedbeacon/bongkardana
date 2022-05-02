package id.dana.data.foundation.logger.rds;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.SOURCE)
public @interface RDSConstant {
    public static final String APP_KEY = "skywalker-21314794";
    public static final String KEY_APP_KEY = "appkey";
    public static final String KEY_APP_NAME = "appname";
    public static final String KEY_APP_VER = "appver";
    public static final String KEY_PAGE = "page";
    public static final String KEY_PAGE_SRC = "pagesrc";
    public static final String KEY_PB_SWITCH = "pbswitch";
    public static final String KEY_PRE_PAGE = "prepage";
    public static final String KEY_USER = "user";
    public static final String NEXT_CHECK_REGISTER = "nextCheckRegister";
    public static final String PAGE_ONBOARDING = "Onboarding";
    public static final String PB_SWITCH = "V3";
}
