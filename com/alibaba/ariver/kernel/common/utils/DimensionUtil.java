package com.alibaba.ariver.kernel.common.utils;

import android.content.Context;
import android.view.View;
import android.view.WindowManager;

public class DimensionUtil {

    /* renamed from: a  reason: collision with root package name */
    private static float f9023a;
    private static float b;
    private static int c;
    private static int d;

    public static float getFontSize(float f) {
        if (f == 0.875f) {
            return 14.0f;
        }
        if (f == 1.0f) {
            return 16.0f;
        }
        if (f == 1.125f) {
            return 18.0f;
        }
        if (f == 1.25f) {
            return 20.0f;
        }
        return f == 1.375f ? 22.0f : 16.0f;
    }

    public static boolean isValueEqule(float f, float f2) {
        return ((int) f) == ((int) f2);
    }

    public static int dip2px(Context context, float f) {
        a(context);
        return (int) ((f * f9023a) + 0.5f);
    }

    private static void a(Context context) {
        try {
            if (f9023a == 0.0f) {
                f9023a = context.getResources().getDisplayMetrics().density;
            }
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:DimensionUtil", th);
        }
    }

    public static float getDensity(Context context) {
        a(context);
        return f9023a;
    }

    public static int px2dip(Context context, float f) {
        a(context);
        return (int) ((f / f9023a) + 0.5f);
    }

    public static int getRelativeTop(View view) {
        if (view.getId() == 16908290) {
            return view.getTop();
        }
        return view.getTop() + getRelativeTop((View) view.getParent());
    }

    public static int getRelativeLeft(View view) {
        if (view.getId() == 16908290) {
            return view.getLeft();
        }
        return view.getLeft() + getRelativeLeft((View) view.getParent());
    }

    public static float px2sp(Context context, float f) {
        b(context);
        return f / b;
    }

    public static int sp2px(Context context, float f) {
        b(context);
        return (int) ((f * b) + 0.5f);
    }

    private static void b(Context context) {
        try {
            if (b == 0.0f) {
                b = context.getResources().getDisplayMetrics().scaledDensity;
            }
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:DimensionUtil", th);
        }
    }

    public static int getScreenWidth(Context context) {
        int i = d;
        if (i != 0) {
            return i;
        }
        int width = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
        d = width;
        return width;
    }

    public static int getScreenHeight(Context context) {
        int i = c;
        if (i != 0) {
            return i;
        }
        int height = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getHeight();
        c = height;
        return height;
    }

    public static void resetDimensions() {
        d = 0;
        c = 0;
        b = 0.0f;
        f9023a = 0.0f;
    }
}
