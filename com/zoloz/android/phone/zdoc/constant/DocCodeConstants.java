package com.zoloz.android.phone.zdoc.constant;

import java.util.HashMap;
import java.util.Map;

public class DocCodeConstants {
    public static String ERROR_CAMERA = "Z2001";
    public static String ERROR_SYSTEM = "Z2000";
    public static String FAIL_RETRY = "Z2007";
    public static String INTERRUPT = "Z2005";
    public static String NETWORK_BAD = "Z2003";
    public static String TIME_OUT = "Z2004";
    public static String TOO_MANY_FAIL = "Z2006";
    public static String USER_QUIT = "Z2002";
    private static Map map = new HashMap() {
        {
            put(DocCodeConstants.ERROR_SYSTEM, "System Error");
            put(DocCodeConstants.ERROR_CAMERA, "Failed to access the camera");
            put(DocCodeConstants.USER_QUIT, "User quit");
            put(DocCodeConstants.NETWORK_BAD, "Not connected to Internet");
            put(DocCodeConstants.TIME_OUT, "Time out");
            put(DocCodeConstants.INTERRUPT, "Verification Interrupted");
            put(DocCodeConstants.TOO_MANY_FAIL, "Too many attempts");
            put(DocCodeConstants.FAIL_RETRY, "Quality check failed");
        }
    };

    public static String getMessage(String str) {
        return String.format("%s(%s)", new Object[]{map.get(str), str});
    }
}
