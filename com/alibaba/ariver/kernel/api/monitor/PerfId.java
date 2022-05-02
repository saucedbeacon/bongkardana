package com.alibaba.ariver.kernel.api.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public interface PerfId {
    public static final String activityCreated = "activityCreated";
    public static final String appStart = "appStart";
    public static final String appxLoaded = "appxLoaded";
    public static final String appxPageLoaded = "appxPageLoaded";
    public static final String appxWorkerFrameworkLoaded = "appxWorkerFrameworkLoaded";
    public static final String attachContext = "attachContext";
    public static final String engineInit = "engineInit";
    public static final String firstScreen = "firstScreen";
    public static final String fragmentCreateViewed = "fragmentCreateViewed";
    public static final String fragmentCreated = "fragmentCreated";
    public static final String frameworkAppStart = "frameworkAppStart";
    public static final String jumpAppStart = "jumpAppStart";
    public static final String loadUrl = "loadUrl";
    public static final String pageInit = "pageInit";
    public static final String pageStart = "pageStart";
    public static final String setupEnd = "setupEnd";
    public static final String setupStart = "setupStart";
    public static final String startActivity = "startActivity";
    public static final String viewCreate = "viewCreate";
    public static final String viewCreated = "viewCreated";
    public static final String viewShow = "viewShow";

    @Target({ElementType.PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    public @interface PerfValue {
    }
}
