package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class AUScreenAdaptTool {
    public static final String PREFIX_ID = "@";
    public static final int WIDTH_BASE = 360;
    public static int widthBase = 360;

    public static int getApFromAttrsStr(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (str.startsWith(PREFIX_ID)) {
            return getApFromDp(context, (float) getDpFromDimension(context, str));
        }
        return getApFromString(context, str);
    }

    public static int getApFromString(Context context, String str) {
        return getApFromString(context, str, 0);
    }

    public static int getApFromDimen(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    public static int getApFromPx(Context context, float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (int) (d + 0.5d);
    }

    public static int getApFromDp(Context context, float f) {
        return (int) (getDensity(context) * f);
    }

    public static float changePxToDp(Context context, float f) {
        return f / getDensity(context);
    }

    public static int getApFromString(Context context, String str, int i) {
        double parseFloat;
        try {
            String lowerCase = str.toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                GriverLogger.d("AUScreenAdaptTool", "attrValue is empty");
                return i;
            }
            float density = getDensity(context);
            if (lowerCase.contains("dp")) {
                parseFloat = (double) (Float.parseFloat(lowerCase.replace("dp", "")) * density);
                Double.isNaN(parseFloat);
            } else if (lowerCase.contains("dip")) {
                parseFloat = (double) (Float.parseFloat(lowerCase.replace("dip", "")) * density);
                Double.isNaN(parseFloat);
            } else if (!lowerCase.contains(RVParams.SHOW_PROGRESS)) {
                return lowerCase.contains("px") ? (int) Float.parseFloat(lowerCase.replace("px", "")) : i;
            } else {
                parseFloat = (double) (((Float.parseFloat(lowerCase.replace(RVParams.SHOW_PROGRESS, "")) * getScaledDensity(context)) / getDensity(context)) * density);
                Double.isNaN(parseFloat);
            }
            return (int) (parseFloat + 0.5d);
        } catch (NumberFormatException e) {
            GriverLogger.debug("AUScreenAdaptTool", "attrValue parse exception: e = ".concat(String.valueOf(e)));
            return i;
        }
    }

    public static float getAPDensity(Context context) {
        return ((float) getScreenWidth(context)) / ((float) widthBase);
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics.widthPixels > displayMetrics.heightPixels) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }

    public static float getDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static float getScaledDensity(Context context) {
        return context.getResources().getDisplayMetrics().scaledDensity;
    }

    public static int getDpFromDimension(Context context, String str) {
        double pxFromResourceId = (double) (getPxFromResourceId(context, str) / getDensity(context));
        Double.isNaN(pxFromResourceId);
        return (int) (pxFromResourceId + 0.5d);
    }

    public static float getPxFromResourceId(Context context, String str) {
        return context.getResources().getDimension(getIdStr(str));
    }

    public static int getIdStr(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (str.startsWith(PREFIX_ID)) {
                    return Integer.parseInt(str.substring(1, str.length()));
                }
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder("resource ID exception:");
                sb.append(e.toString());
                GriverLogger.e("AUScreenAdaptTool", sb.toString());
            }
        }
        return 0;
    }
}
