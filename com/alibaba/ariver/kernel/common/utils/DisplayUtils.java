package com.alibaba.ariver.kernel.common.utils;

import android.app.Activity;
import android.graphics.Rect;

public class DisplayUtils {
    public static int getTitleAndStatusBarHeight(Activity activity) {
        try {
            Rect rect = new Rect();
            activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return ((int) ((float) DimensionUtil.dip2px(activity, 48.0f))) + rect.top;
        } catch (Throwable th) {
            RVLogger.e("DisplayUtils", "getTitleAndStatusBarHeight...e=".concat(String.valueOf(th)));
            return DimensionUtil.dip2px(activity, 1.0f) * 73;
        }
    }
}
