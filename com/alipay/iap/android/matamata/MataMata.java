package com.alipay.iap.android.matamata;

import android.content.Context;
import com.facebook.flipper.core.FlipperPlugin;
import o.getViewVerticalDragRange;
import o.onDependentViewChanged;

public class MataMata {
    private static Context sContext = null;
    private static boolean sIsInitialized = false;

    public static void initialize(Context context) {
        if (!sIsInitialized) {
            sContext = context.getApplicationContext() == null ? context : context.getApplicationContext();
            getViewVerticalDragRange.setMax(context);
            sIsInitialized = true;
        }
    }

    public static void start() {
        checkMataMataSingleton();
        onDependentViewChanged.setMin(sContext).start();
    }

    public static void stop() {
        checkMataMataSingleton();
        onDependentViewChanged.setMin(sContext).stop();
    }

    public static void addPlugin(FlipperPlugin flipperPlugin) {
        checkMataMataSingleton();
        onDependentViewChanged.setMin(sContext).setMin(flipperPlugin);
    }

    public static void removePlugin(FlipperPlugin flipperPlugin) {
        onDependentViewChanged.setMin(sContext).getMax(flipperPlugin);
    }

    private static void checkMataMataSingleton() {
        if (sContext == null || !sIsInitialized) {
            throw new RuntimeException("MataMata not yet initialized, please call MataMata.initialize() first");
        }
    }
}
