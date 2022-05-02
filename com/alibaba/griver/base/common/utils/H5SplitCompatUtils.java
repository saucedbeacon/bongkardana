package com.alibaba.griver.base.common.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.R;
import com.alibaba.griver.base.common.config.GriverConfig;
import java.lang.reflect.InvocationTargetException;

public class H5SplitCompatUtils {
    public static void doInstall(@NonNull Context context) {
        RVLogger.d("H5SplitCompatUtils", "do split install for context: ".concat(String.valueOf(context)));
        String config = GriverConfig.getConfig("h5_dynamic_delivery_fix", "");
        RVLogger.d("H5SplitCompatUtils", "h5_dynamic_delivery_fix value: ".concat(String.valueOf(config)));
        if (!"NO".equalsIgnoreCase(config)) {
            RVLogger.d("H5SplitCompatUtils", "start to do SplitCompat.install");
            if (a() && a(context)) {
                b(context);
            }
        }
    }

    private static boolean a(@NonNull Context context) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            context.getResources().getLayout(R.layout.griver_layout_base_activity);
            context.getResources().getLayout(R.layout.griver_tablayout);
            z = false;
        } catch (Exception e) {
            RVLogger.e("H5SplitCompatUtils", "check resource failed", e);
            z = true;
        }
        RVLogger.d("H5SplitCompatUtils", "check resource inaccessible: ".concat(String.valueOf(z)));
        StringBuilder sb = new StringBuilder("check resource cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        RVLogger.d("H5SplitCompatUtils", sb.toString());
        return z;
    }

    private static boolean a() {
        try {
            Class.forName("com.google.android.play.core.splitcompat.SplitCompat");
            return true;
        } catch (Exception unused) {
            RVLogger.e("H5SplitCompatUtils", "SplitCompat class not found, just check, take it easy");
            return false;
        }
    }

    private static void b(Context context) {
        try {
            Class<?> cls = Class.forName("com.google.android.play.core.splitcompat.SplitCompat");
            cls.getDeclaredMethod("install", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            RVLogger.d("H5SplitCompatUtils", "SplitCompat install complete");
        } catch (ClassNotFoundException unused) {
            RVLogger.e("H5SplitCompatUtils", "SplitCompat class not found, install failed");
        } catch (NoSuchMethodException unused2) {
            RVLogger.e("H5SplitCompatUtils", "SplitCompat install method not found, install failed");
        } catch (IllegalAccessException unused3) {
            RVLogger.e("H5SplitCompatUtils", "Invoke splitCompat install method exception, install failed");
        } catch (InvocationTargetException unused4) {
            RVLogger.e("H5SplitCompatUtils", "Invoke splitCompat install method exception, install failed");
        } catch (Exception unused5) {
            RVLogger.e("H5SplitCompatUtils", "SplitCompat install failed");
        }
    }
}
