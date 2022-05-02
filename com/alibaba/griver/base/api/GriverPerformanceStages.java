package com.alibaba.griver.base.api;

public class GriverPerformanceStages {
    public static final String KEY_APPX_APP_LOADED = "appxAppLoaded";
    public static final String KEY_APPX_PAGE_LOADED = "appxPageLoaded";
    public static final String KEY_APPX_WORKER_LOADED = "appxWorkerFrameworkLoaded";
    public static final String KEY_APP_INFO_END = "appInfoEnd";
    public static final String KEY_APP_INFO_START = "appInfoStart";
    public static final String KEY_APP_STARTUP_BREAK = "appStartupBreak";
    public static final String KEY_FIRST_SCREEN = "firstScreen";
    public static final String KEY_PAGE_STARTUP_BREAK = "pageStartupBreak";
    public static final String KEY_RESOURCE_READY = "resourceReady";
    public static long activityCreated;
    public static long appInfoEnd;
    public static long appInfoStart;
    public static long appxAppLoaded;
    public static long appxPageLoaded;
    public static long appxWorkerFrameworkLoaded;
    public static long attachContext;
    public static long firstScreen;
    public static long jumpAppStart;
    public static long resourceReady;
    public static long setupEnd;
    public static long setupStart;
    public static long startActivity;
}
