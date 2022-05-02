package com.wrapper.proxyapplication;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

public abstract class WrapperProxyApplication extends Application {
    static Context baseContext = null;
    static String className = "com.macrovideo.v380pro.V380ProApplication";
    static ClassLoader mLoader = null;
    static Application shellApp = null;
    static String tinkerApp = "tinker not support";

    /* access modifiers changed from: package-private */
    public native void Ooo0ooO0oO();

    /* access modifiers changed from: protected */
    public abstract void initProxyApplication(Context context);

    static Context getWrapperProxyAppBaseContext() {
        return baseContext;
    }

    private synchronized boolean Fixappname() {
        if (className.startsWith(".")) {
            className = super.getPackageName() + className;
        } else if (className.indexOf(".") < 0) {
            className = super.getPackageName() + "." + className;
        }
        return true;
    }

    public static void fixAndroid(Context context, Application application) {
        if (Build.VERSION.SDK_INT == 28) {
            try {
                mLoader = AndroidNClassLoader.inject(context.getClassLoader(), application);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static String getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "0";
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        baseContext = getBaseContext();
        if (shellApp == null) {
            shellApp = this;
        }
        Fixappname();
        initProxyApplication(context);
    }

    public void onCreate() {
        super.onCreate();
        Ooo0ooO0oO();
    }
}
