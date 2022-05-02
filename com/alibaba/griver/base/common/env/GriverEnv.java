package com.alibaba.griver.base.common.env;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.env.GriverVerifyPublicKeyProxy;
import com.alibaba.griver.api.ui.GriverAppExtension;
import com.alibaba.griver.base.common.bridge.GriverAppLanguageExtension;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.KitUtils;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Stack;

public class GriverEnv {

    /* renamed from: a  reason: collision with root package name */
    private static String f9050a;
    private static Application b;
    private static String c;
    private static String d;
    private static String e;
    /* access modifiers changed from: private */
    public static Stack<Activity> f = new Stack<>();
    private static Boolean g = null;
    /* access modifiers changed from: private */
    public static boolean h = false;
    private static boolean i = true;
    private static GriverVerifyPublicKeyProxy j = new GriverVerifyPublicKeyProxy() {
        public final String getPublicKey() {
            return null;
        }
    };

    public static String defaultPlatform() {
        return RVOpenAuthHelper.PLATFORM_AP;
    }

    public static boolean isBackgroundRunning() {
        return false;
    }

    public static void openUrl(String str) {
    }

    public static Application getApplicationContext() {
        if (b == null) {
            Application a2 = a();
            b = a2;
            a(a2);
        }
        return b;
    }

    public static WeakReference<Activity> getTopActivity() {
        if (f.size() == 0) {
            return null;
        }
        return new WeakReference<>(f.peek());
    }

    public static int getLpid() {
        try {
            if (ProcessUtils.isMainProcess()) {
                return 0;
            }
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) getApplicationContext().getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningAppProcesses()) {
                if (next.pid == myPid) {
                    String str = next.processName;
                    GriverLogger.d("GriverEnv", "get lpid, process name: ".concat(String.valueOf(str)));
                    if (!TextUtils.isEmpty(str)) {
                        return Integer.valueOf(str.substring(str.length() - 1)).intValue();
                    }
                }
            }
            return 0;
        } catch (Exception e2) {
            GriverLogger.e("GriverEnv", "getLpid faild", e2);
        }
    }

    public static Resources getResources() {
        Application application = b;
        if (application == null) {
            return null;
        }
        return application.getResources();
    }

    public static String getProductVersion() {
        try {
            return getApplicationContext().getPackageManager().getPackageInfo(getApplicationContext().getPackageName(), 0).versionName;
        } catch (Exception e2) {
            GriverLogger.e("GriverEnv", "getVersion error!", e2);
            return null;
        }
    }

    public static String convertPlatform(String str) {
        if ("1".equals(str)) {
            return RVOpenAuthHelper.PLATFORM_AP;
        }
        if ("2".equals(str)) {
            return RVOpenAuthHelper.PLATFORM_TB;
        }
        return null;
    }

    public static String getAppName() {
        JSONObject parseObject = JSON.parseObject(KitUtils.getAssetContent(getApplicationContext(), GriverBaseConstants.GRIVER_APP_ASSET_PATH));
        return (parseObject == null || !parseObject.containsKey("appName")) ? "" : parseObject.getString("appName");
    }

    public static String getAppLanguage() {
        return ((GriverAppLanguageExtension) RVProxy.get(GriverAppLanguageExtension.class)).getAppLanguage();
    }

    public static void setApplication(Application application) {
        if (application == null) {
            GriverLogger.e("GriverEnv", "application is null, return directly", (Throwable) null);
        } else if (b != null) {
            GriverLogger.w("GriverEnv", "application has been set, ignore this", (Throwable) null);
        } else {
            b = application;
            a(application);
        }
    }

    private static void a(Application application) {
        if (application == null) {
            GriverLogger.w("GriverEnv", "application is null, can not register lifecycle");
        } else {
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityStarted(Activity activity) {
                }

                public final void onActivityStopped(Activity activity) {
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    GriverEnv.f.push(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    boolean unused = GriverEnv.h = true;
                }

                public final void onActivityPaused(Activity activity) {
                    boolean unused = GriverEnv.h = false;
                }

                public final void onActivityDestroyed(Activity activity) {
                    GriverEnv.f.remove(activity);
                }
            });
        }
    }

    public static boolean isForeground() {
        return h;
    }

    public static String getVerifyPulickey() {
        return j.getPublicKey();
    }

    public static void setVerifyPublicKeyProxy(GriverVerifyPublicKeyProxy griverVerifyPublicKeyProxy) {
        if (griverVerifyPublicKeyProxy != null) {
            j = griverVerifyPublicKeyProxy;
        }
    }

    private static Application a() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke((Object) null, new Object[0]));
        } catch (Exception e2) {
            GriverLogger.e("GriverEnv", "get application failed", e2);
            return null;
        }
    }

    public static boolean isDebuggable() {
        Boolean bool = g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            if ((getApplicationContext().getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getAppId() {
        return f9050a;
    }

    public static void setAppId(String str) {
        f9050a = str;
    }

    public static String getWorkSpaceId() {
        return c;
    }

    public static void setWorkSpaceId(String str) {
        c = str;
    }

    public static String getEnvironment() {
        return d;
    }

    public static void setEnvironment(String str) {
        d = str;
    }

    public static App getAppByUrl(String str) {
        return ((GriverAppExtension) RVProxy.get(GriverAppExtension.class)).getAppByUrl(str);
    }

    public static synchronized void setDebuggable(boolean z) {
        synchronized (GriverEnv.class) {
            i = z;
        }
    }

    public static synchronized boolean getDebuggable() {
        boolean z;
        synchronized (GriverEnv.class) {
            z = i;
        }
        return z;
    }

    public static String getAlwaysShowDiagnosticTool() {
        return e;
    }

    public static void setAlwaysShowDiagnosticTool(String str) {
        e = str;
    }
}
