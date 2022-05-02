package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.graphics.Color;
import android.net.ParseException;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.DensityUtil;

public class ToolUtils {
    public static String judgeRes(int i) {
        int i2 = i & 16711680;
        return i2 != 131072 ? i2 != 458752 ? "" : "string" : "drawable";
    }

    public static boolean isAlipayApp(Context context) {
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName) || !packageName.contains("com.alipay")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("isAlipayApp");
            sb.append(e.toString());
            GriverLogger.e("AUTitleBar", sb.toString());
            return false;
        }
    }

    public static int parseColor(String str) {
        try {
            return Color.parseColor(str);
        } catch (ParseException unused) {
            return -1;
        }
    }

    public static boolean isConcaveScreen(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        String str = Build.BRAND;
        if (context == null || context.getPackageManager() == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals(lowerCase, "oppo")) {
            return ConcaveUtils.checkOppoConcave(context);
        }
        if (TextUtils.equals(lowerCase, "vivo")) {
            return ConcaveUtils.checkVivoConcave();
        }
        if (TextUtils.equals(lowerCase, "huawei") || TextUtils.equals(lowerCase, "honor")) {
            return ConcaveUtils.checkHuaweiConcave(context);
        }
        if (TextUtils.equals(lowerCase, "xiaomi")) {
            return ConcaveUtils.checkXiaomiConcave();
        }
        if (ConcaveUtils.checkSamsungConcave(context)) {
            return true;
        }
        return false;
    }

    public static int parseDimen(Context context, String str) {
        try {
            return DensityUtil.dip2px(context, Float.parseFloat(str));
        } catch (ParseException unused) {
            return -1;
        }
    }

    public static int[] getScreenWidth_Height(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        return new int[]{defaultDisplay.getWidth(), defaultDisplay.getHeight()};
    }
}
