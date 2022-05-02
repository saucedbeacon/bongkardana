package com.alibaba.ariver.kernel.common.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import id.dana.danah5.akulaku.AkuEventParamsKey;

public class ProcessUtils {
    public static final String ACTIVITY_THREAD = "android.app.ActivityThread";
    public static final String CURRENT_ACTIVITY_THREAD = "currentActivityThread";
    public static final String GET_PROCESS_NAME = "getProcessName";

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f9027a;
    private static Boolean b;
    private static Context c;
    private static String d;

    public static void setAppContext(Context context) {
        c = context;
    }

    @Nullable
    public static Context getContext() {
        Context context = c;
        if (context != null) {
            return context;
        }
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            return rVEnvironmentService.getApplicationContext();
        }
        return null;
    }

    public static int getPid() {
        return Process.myPid();
    }

    public static String getProcessName() {
        try {
            if (d != null && d.length() > 0) {
                return d;
            }
            try {
                d = (String) ReflectUtils.invokeMethod(ReflectUtils.invokeMethod(ACTIVITY_THREAD, CURRENT_ACTIVITY_THREAD), GET_PROCESS_NAME);
                StringBuilder sb = new StringBuilder("getProcessName from ActivityThread: ");
                sb.append(d);
                RVLogger.d("AriverKernel", sb.toString());
            } catch (Throwable th) {
                RVLogger.e("AriverKernel", "getProcessName error!", th);
            }
            if (d == null) {
                Context context = getContext();
                if (context == null) {
                    return null;
                }
                int myPid = Process.myPid();
                for (ActivityManager.RunningAppProcessInfo next : ((ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        d = next.processName;
                    }
                }
            }
            return d;
        } catch (Exception e) {
            RVLogger.e("AriverKernel", "getProcessName error", e);
        }
    }

    public static boolean isMainProcess() {
        boolean z = true;
        if (isInTestProcess()) {
            return true;
        }
        if (f9027a == null) {
            Context context = getContext();
            if (context == null) {
                RVLogger.w("AriverKernel", "Context is null in isMainProcess()");
                return true;
            }
            String processName = getProcessName();
            if (context == null || !TextUtils.equals(processName, context.getPackageName())) {
                z = false;
            }
            f9027a = Boolean.valueOf(z);
            StringBuilder sb = new StringBuilder("isMainProcess ");
            sb.append(f9027a);
            sb.append(" processName: ");
            sb.append(processName);
            sb.append(" stack: ");
            sb.append(Log.getStackTraceString(new Throwable("Just Print!")));
            RVLogger.d("AriverKernel", sb.toString());
        }
        return f9027a.booleanValue();
    }

    public static boolean isInTestProcess() {
        return "robolectric".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean isTinyProcess() {
        if (b == null) {
            String processName = getProcessName();
            b = Boolean.valueOf(!TextUtils.isEmpty(processName) && processName.contains("lite"));
        }
        return b.booleanValue();
    }
}
