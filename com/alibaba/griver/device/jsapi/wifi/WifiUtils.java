package com.alibaba.griver.device.jsapi.wifi;

public class WifiUtils {
    public static int parseInt(String str) {
        return parseInt(str, 0);
    }

    public static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static long parseLong(String str) {
        return parseLong(str, 0);
    }

    public static long parseLong(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return j;
        }
    }
}
