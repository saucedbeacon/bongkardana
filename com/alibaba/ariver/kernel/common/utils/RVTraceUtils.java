package com.alibaba.ariver.kernel.common.utils;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.alibaba.ariver.kernel.common.RVProxy;

public class RVTraceUtils {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9147a = RVKernelUtils.isDebug();
    public static boolean isOpenSystemTrace = false;
    public static boolean isPerfTestMode = false;

    private static void a(String str, String str2) {
        if (f9147a || !isPerfTestMode) {
            RVLogger.debug(str, str2);
        } else {
            b(str, str2);
        }
    }

    private static void b(String str, String str2) {
        try {
            String name = Thread.currentThread().getName();
            StringBuilder sb = new StringBuilder(91);
            sb.append(name);
            sb.append(']');
            sb.append(str2);
            ReflectUtils.invokeStaticMethod(Log.class, "d", new Class[]{String.class, String.class}, new Object[]{str, sb.toString()});
        } catch (Throwable unused) {
        }
    }

    private static boolean a() {
        if (!f9147a) {
            return isPerfTestMode && isOpenSystemTrace;
        }
        return true;
    }

    public static void traceBeginSection(String str) {
        if (a()) {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    if (str.length() > 127) {
                        str = str.substring(0, 127);
                    }
                    Trace.beginSection(str);
                    a("RVTraceUtils", "traceBeginSection: ".concat(String.valueOf(str)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void traceEndSection(String str) {
        if (a()) {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    Trace.endSection();
                    a("RVTraceUtils", "traceEndSection: ".concat(String.valueOf(str)));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void asyncTraceBegin(RVTracePhase rVTracePhase) {
        try {
            RVPhaseRecorder rVPhaseRecorder = (RVPhaseRecorder) RVProxy.get(RVPhaseRecorder.class);
            if (rVPhaseRecorder != null) {
                rVPhaseRecorder.startPhase(rVTracePhase);
            }
        } catch (Throwable th) {
            RVLogger.e("phase recorder start exception", th);
        }
        if (a()) {
            try {
                asyncTraceBegin(rVTracePhase.phaseName, rVTracePhase.cookie);
            } catch (Throwable th2) {
                a("RVTraceUtils", th2.toString());
            }
        }
    }

    public static void asyncTraceEnd(RVTracePhase rVTracePhase) {
        try {
            RVPhaseRecorder rVPhaseRecorder = (RVPhaseRecorder) RVProxy.get(RVPhaseRecorder.class);
            if (rVPhaseRecorder != null) {
                rVPhaseRecorder.stopPhase(rVTracePhase);
            }
        } catch (Throwable th) {
            RVLogger.e("phase recorder start exception", th);
        }
        if (a()) {
            try {
                asyncTraceEnd(rVTracePhase.phaseName, rVTracePhase.cookie);
            } catch (Throwable th2) {
                a("RVTraceUtils", th2.toString());
            }
        }
    }

    public static void asyncTraceBegin(String str, int i) {
        if (a()) {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    ReflectUtils.invokeStaticMethod(Trace.class, "asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE}, new Object[]{4096L, str, Integer.valueOf(i)});
                    a("RVTraceUtils", "asyncTraceBegin: ".concat(String.valueOf(str)));
                }
            } catch (Exception e) {
                a("RVTraceUtils", e.toString());
            }
        }
    }

    public static void asyncTraceEnd(String str, int i) {
        if (a()) {
            try {
                if (Build.VERSION.SDK_INT >= 18) {
                    ReflectUtils.invokeStaticMethod(Trace.class, "asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE}, new Object[]{4096L, str, Integer.valueOf(i)});
                }
            } catch (Exception e) {
                a("RVTraceUtils", e.toString());
            }
        }
    }
}
