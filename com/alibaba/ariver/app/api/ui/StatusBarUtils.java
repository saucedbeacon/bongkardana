package com.alibaba.ariver.app.api.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.Window;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;

public class StatusBarUtils {

    /* renamed from: a  reason: collision with root package name */
    private static int f8954a;

    public static boolean isSupport() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @TargetApi(21)
    public static void setTransparentColor(Activity activity, int i) {
        if (isSupport() && activity != null) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(APEncodeOptions.DEFAULT_MAX_LEN);
            window.setStatusBarColor(i);
        }
    }

    public static int getStatusBarHeight(Context context) {
        if (f8954a < 3) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
            f8954a = dimensionPixelSize;
            if (dimensionPixelSize < 3 && (context instanceof Activity)) {
                try {
                    Rect rect = new Rect();
                    ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    f8954a = rect.top;
                    StringBuilder sb = new StringBuilder(" status bar height rect height = ");
                    sb.append(f8954a);
                    RVLogger.d("StatusBarUtils", sb.toString());
                } catch (Throwable unused) {
                }
            }
        }
        return f8954a;
    }

    public static boolean isConfigSupport() {
        return ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigBoolean("ariver_supportStatusBar", true);
    }
}
