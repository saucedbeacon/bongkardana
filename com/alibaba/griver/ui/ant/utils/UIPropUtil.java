package com.alibaba.griver.ui.ant.utils;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.lang.reflect.Array;

public class UIPropUtil {
    public static final float INVALID_DIMEN = -1.0f;
    static final String SPLITER = " ";

    /* renamed from: a  reason: collision with root package name */
    private static DisplayMetrics f10572a;

    public static int getColorByValue(String str) {
        if (str.contains("rgb")) {
            int[] iArr = new int[3];
            String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            int i = 0;
            while (i < split.length) {
                try {
                    iArr[i] = Integer.parseInt(split[i].trim());
                    i++;
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder("RGB format error: ");
                    sb.append(str);
                    sb.append(", ");
                    sb.append(e.toString());
                    GriverLogger.e("UIPropUtil", sb.toString());
                }
            }
            return Color.rgb(iArr[0], iArr[1], iArr[2]);
        }
        if (!str.startsWith("#")) {
            str = "#".concat(String.valueOf(str));
        }
        return Color.parseColor(str);
    }

    public static ColorStateList genTextSelector(Context context, String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        int[][] iArr = (int[][]) Array.newInstance(int.class, new int[]{5, 5});
        int[] iArr2 = new int[4];
        boolean z = true;
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (!TextUtils.isEmpty(str)) {
                if (i == 0) {
                    iArr[0] = new int[]{16842910, -16842919, -16842908, -16842913};
                    iArr2[0] = getColorByValue(str);
                } else if (i == 1) {
                    iArr[1] = new int[]{16842910, 16842919};
                    iArr2[1] = getColorByValue(str);
                    iArr[2] = new int[]{16842910, 16842908};
                    iArr2[2] = getColorByValue(str);
                    iArr[3] = new int[]{16842910, 16842913};
                    iArr2[3] = getColorByValue(str);
                } else if (i == 2) {
                    iArr[4] = new int[]{-16842910};
                    iArr2[4] = getColorByValue(str);
                }
                z = false;
            }
        }
        if (!z) {
            return new ColorStateList(iArr, iArr2);
        }
        return null;
    }

    public static float convertDipToPx(Context context, float f) {
        return f * getDensity(context, false);
    }

    public static float convertSpToPx(Context context, float f) {
        return f * getDensity(context, true);
    }

    public static float getPx(String str, Context context) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                if (str.endsWith("dp")) {
                    return convertDipToPx(context, Float.parseFloat(str.substring(0, str.lastIndexOf("dp"))));
                }
                if (str.endsWith(RVParams.SHOW_PROGRESS)) {
                    return convertSpToPx(context, Float.parseFloat(str.substring(0, str.lastIndexOf(RVParams.SHOW_PROGRESS))));
                }
                if (str.endsWith("px")) {
                    return Float.parseFloat(str.substring(0, str.lastIndexOf("px")));
                }
                return convertDipToPx(context, Float.parseFloat(str));
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0f;
    }

    public static synchronized float getDensity(Context context, boolean z) {
        synchronized (UIPropUtil.class) {
            if (f10572a == null) {
                f10572a = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(f10572a);
            }
            if (z) {
                float f = f10572a.scaledDensity;
                return f;
            }
            float f2 = f10572a.density;
            return f2;
        }
    }
}
