package com.alibaba.ariver.permission.api;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class RVFlag {
    public static Map<String, Long> eventTrackerCostMap = new ConcurrentHashMap();
    public static Map<String, Long> eventTrackerStubMap = new ConcurrentHashMap();
    public static boolean hasShowLoading = false;
    public static boolean initUcNormal = true;
    public static boolean isInChane = true;
    public static boolean isUploadLog = true;
    public static long lastTouchTime = 0;
    public static Boolean sInjectDebugConsoleJS = Boolean.FALSE;
    public static HashMap<String, Boolean> sOpenAuthGrantFlag = new HashMap<>();
    public static boolean ucReady = false;

    public static synchronized boolean getOpenAuthGrantFlag(String str) {
        boolean z;
        synchronized (RVFlag.class) {
            z = false;
            if (sOpenAuthGrantFlag.containsKey(str)) {
                z = sOpenAuthGrantFlag.get(str).booleanValue();
            }
        }
        return z;
    }

    public static synchronized void setOpenAuthGrantFlag(String str, boolean z) {
        synchronized (RVFlag.class) {
            if (!TextUtils.isEmpty(str)) {
                sOpenAuthGrantFlag.put(str, Boolean.valueOf(z));
            }
        }
    }
}
