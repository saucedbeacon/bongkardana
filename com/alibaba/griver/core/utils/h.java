package com.alibaba.griver.core.utils;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.text.TextUtils;
import android.view.Window;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.image.framework.encode.APEncodeOptions;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private static int f9199a;

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @TargetApi(21)
    public static void a(Activity activity, int i) {
        if (a() && activity != null) {
            Window window = activity.getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(APEncodeOptions.DEFAULT_MAX_LEN);
            window.setStatusBarColor(i);
        }
    }

    public static boolean b() {
        if (TextUtils.equals(GriverConfig.getConfig("TSBS"), "0")) {
            return false;
        }
        String config = GriverConfig.getConfig("TSBSOFF");
        String str = Build.MODEL;
        if (TextUtils.isEmpty(config) || !config.contains(str)) {
            return true;
        }
        return false;
    }
}
