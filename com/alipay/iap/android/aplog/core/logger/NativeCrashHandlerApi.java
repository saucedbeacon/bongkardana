package com.alipay.iap.android.aplog.core.logger;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.uc.crashsdk.export.CrashApi;
import java.util.LinkedHashMap;
import java.util.Map;

public class NativeCrashHandlerApi {
    public static final String CAT_LAST_PRODUCT_INFO = "last product info:";
    public static final String KEY_LAST_RUNTIME_CODE_PATH = "LastRuntimeCodePath";
    public static final String KEY_LAST_RUNTIME_VERSION = "LastRuntimeVersion";

    /* renamed from: a  reason: collision with root package name */
    private static String f9302a = "NativeCrashHandlerApi";
    private static NativeCrashApiGetter b = null;
    private static OnNativeCrashUploadListener c = null;
    private static Map<String, ReportCrashListener> d = null;
    private static volatile int e = -1;
    public static String sLastCodePath = "";
    public static String sLastRunningProductVersion = "";

    public interface NativeCrashApiGetter {
        CrashApi getCrashApi();
    }

    @Deprecated
    public interface OnNativeCrashUploadListener {
        @Deprecated
        void onUpload(String str);
    }

    public interface ReportCrashListener {
        Object onReportCrash(String str, String str2, String str3, String str4, boolean z);
    }

    public static void setNewInstall() {
        CrashApi crashApi = getCrashApi();
        if (crashApi != null) {
            crashApi.setNewInstall();
            LoggerFactory.getTraceLogger().info(f9302a, "setNewInstall");
            return;
        }
        LoggerFactory.getTraceLogger().info(f9302a, "setNewInstall failed, crashApi is null");
    }

    public static void setForeground(boolean z) {
        CrashApi crashApi = getCrashApi();
        if (crashApi == null) {
            LoggerFactory.getTraceLogger().info(f9302a, "setForeground failed, crashApi is null");
        } else if (z && e == 1) {
            return;
        } else {
            if (z || e != 0) {
                crashApi.setForeground(z);
                if (z) {
                    e = 1;
                } else {
                    e = 0;
                }
                LoggerFactory.getTraceLogger().info(f9302a, "setForeground: ".concat(String.valueOf(z)));
            } else {
                return;
            }
        }
        LoggerFactory.getTraceLogger().info(f9302a, "flush applog");
        LoggerFactory.getTraceLogger().info(f9302a, "flush applog done");
    }

    public static void onExit() {
        CrashApi crashApi = getCrashApi();
        if (crashApi == null) {
            LoggerFactory.getTraceLogger().info(f9302a, "onExit failed, crashApi is null");
        } else if (e != 2) {
            crashApi.onExit();
            e = 2;
            LoggerFactory.getTraceLogger().info(f9302a, "onExit");
        } else {
            return;
        }
        LoggerFactory.getTraceLogger().info(f9302a, "flush applog");
        LoggerFactory.getTraceLogger().info(f9302a, "flush applog done");
    }

    public static void setLastRunningProductVersion(String str) {
        sLastRunningProductVersion = str;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str2 = f9302a;
        StringBuilder sb = new StringBuilder("setLastRunningProductVersion: ");
        sb.append(sLastRunningProductVersion);
        traceLogger.info(str2, sb.toString());
    }

    public static void setLastCodePath(String str) {
        sLastCodePath = str;
        TraceLogger traceLogger = LoggerFactory.getTraceLogger();
        String str2 = f9302a;
        StringBuilder sb = new StringBuilder("setLastCodePath: ");
        sb.append(sLastCodePath);
        traceLogger.info(str2, sb.toString());
    }

    public static boolean addCrashHeadInfo(String str, String str2) {
        NativeCrashApiGetter nativeCrashApiGetter = b;
        if (nativeCrashApiGetter != null) {
            CrashApi crashApi = nativeCrashApiGetter.getCrashApi();
            if (crashApi != null) {
                crashApi.addHeaderInfo(str, str2);
                LoggerFactory.getTraceLogger().info(f9302a, "addCrashHeadInfo success, key: ".concat(String.valueOf(str)));
                return true;
            }
            LoggerFactory.getTraceLogger().warn(f9302a, "addCrashHeadInfo failed, CrashApi is null, key: ".concat(String.valueOf(str)));
            return false;
        }
        LoggerFactory.getTraceLogger().warn(f9302a, "addCrashHeadInfo failed, crashGetter is null, key: ".concat(String.valueOf(str)));
        return false;
    }

    public static CrashApi getCrashApi() {
        NativeCrashApiGetter nativeCrashApiGetter = b;
        if (nativeCrashApiGetter != null) {
            CrashApi crashApi = nativeCrashApiGetter.getCrashApi();
            if (crashApi != null) {
                return crashApi;
            }
            LoggerFactory.getTraceLogger().info(f9302a, "getCrashApi failed, api is null");
            return null;
        }
        LoggerFactory.getTraceLogger().warn(f9302a, "getCrashApi failed, crashGetter is null");
        return null;
    }

    public static void setOnNativeCrashUploadListener(OnNativeCrashUploadListener onNativeCrashUploadListener) {
        c = onNativeCrashUploadListener;
    }

    public static NativeCrashApiGetter getCrashGetter() {
        return b;
    }

    public static void setCrashGetter(NativeCrashApiGetter nativeCrashApiGetter) {
        b = nativeCrashApiGetter;
    }

    private static void a() {
        if (d == null) {
            synchronized (NativeCrashHandlerApi.class) {
                if (d == null) {
                    d = new LinkedHashMap();
                }
            }
        }
    }

    public static boolean putReportCrashListener(String str, ReportCrashListener reportCrashListener) {
        if (reportCrashListener == null || TextUtils.isEmpty(str)) {
            return false;
        }
        a();
        if (d.containsKey(str)) {
            LoggerFactory.getTraceLogger().warn(f9302a, "putReportCrashListener, exist: ".concat(String.valueOf(str)));
            return false;
        }
        d.put(str, reportCrashListener);
        LoggerFactory.getTraceLogger().info(f9302a, "putReportCrashListener: ".concat(String.valueOf(str)));
        return true;
    }

    public static boolean removeReportCrashListener(String str) {
        if (d == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if (d.remove(str) == null) {
            LoggerFactory.getTraceLogger().warn(f9302a, "removeReportCrashListener, not exist: ".concat(String.valueOf(str)));
            return false;
        }
        LoggerFactory.getTraceLogger().info(f9302a, "removeReportCrashListener: ".concat(String.valueOf(str)));
        return true;
    }

    public static void onReportCrash(String str, String str2, String str3, boolean z) {
        long j;
        Throwable th;
        LoggerFactory.getTraceLogger().info(f9302a, "onReportCrash");
        if (c != null) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                c.onUpload(str);
                currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                TraceLogger traceLogger = LoggerFactory.getTraceLogger();
                String str4 = f9302a;
                StringBuilder sb = new StringBuilder();
                sb.append(currentTimeMillis);
                sb.append(" spend, OnNativeCrashUploadListener.onUpload");
                traceLogger.info(str4, sb.toString());
            } catch (Throwable th2) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                TraceLogger traceLogger2 = LoggerFactory.getTraceLogger();
                String str5 = f9302a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(currentTimeMillis2);
                sb2.append(" spend, OnNativeCrashUploadListener.onUpload");
                traceLogger2.error(str5, sb2.toString(), th2);
            }
        }
        Map<String, ReportCrashListener> map = d;
        if (map != null && map.size() > 0) {
            long currentTimeMillis3 = System.currentTimeMillis();
            for (Map.Entry next : d.entrySet()) {
                String str6 = (String) next.getKey();
                try {
                    ((ReportCrashListener) next.getValue()).onReportCrash(str6, str, str2, str3, z);
                    j = System.currentTimeMillis();
                    long j2 = j - currentTimeMillis3;
                    try {
                        TraceLogger traceLogger3 = LoggerFactory.getTraceLogger();
                        String str7 = f9302a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(j2);
                        sb3.append(" spend, ReportCrashListener.onReportCrash: ");
                        sb3.append(str6);
                        traceLogger3.info(str7, sb3.toString());
                        currentTimeMillis3 = j;
                    } catch (Throwable th3) {
                        th = th3;
                        long currentTimeMillis4 = System.currentTimeMillis();
                        TraceLogger traceLogger4 = LoggerFactory.getTraceLogger();
                        String str8 = f9302a;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(currentTimeMillis4 - j);
                        sb4.append(" spend, ReportCrashListener.onReportCrash: ");
                        sb4.append(str6);
                        traceLogger4.error(str8, sb4.toString(), th);
                        currentTimeMillis3 = currentTimeMillis4;
                    }
                } catch (Throwable th4) {
                    j = currentTimeMillis3;
                    th = th4;
                    long currentTimeMillis42 = System.currentTimeMillis();
                    TraceLogger traceLogger42 = LoggerFactory.getTraceLogger();
                    String str82 = f9302a;
                    StringBuilder sb42 = new StringBuilder();
                    sb42.append(currentTimeMillis42 - j);
                    sb42.append(" spend, ReportCrashListener.onReportCrash: ");
                    sb42.append(str6);
                    traceLogger42.error(str82, sb42.toString(), th);
                    currentTimeMillis3 = currentTimeMillis42;
                }
            }
        }
    }
}
