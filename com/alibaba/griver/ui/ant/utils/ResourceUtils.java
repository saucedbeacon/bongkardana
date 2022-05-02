package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class ResourceUtils {
    private static String a() {
        return "com.griver.core";
    }

    public static int getResourceId(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, str2, a());
        } catch (Exception e) {
            GriverLogger.e("getResourceId", e.toString());
            return -1;
        }
    }
}
