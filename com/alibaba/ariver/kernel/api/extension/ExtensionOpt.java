package com.alibaba.ariver.kernel.api.extension;

import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExtensionOpt {
    public static final String TAG = "AriverKernel:ExtensionOpt";

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<? extends Extension>, MethodInvokeOptimizer> f9010a = new ConcurrentHashMap();
    private static Map<Class<? extends Extension>, MethodInvokeOptimizer> b = new ConcurrentHashMap();
    private static ExceptionHandler c;

    public interface ExceptionHandler {
        void reportException(Throwable th, String str, String str2, String str3, Map<String, String> map);

        boolean shouldThrowOut(Throwable th, String str, String str2);
    }

    public interface MethodInvokeOptimizer {
        Object doMethodInvoke(String str, Extension extension, Object[] objArr);
    }

    public static class MismatchMethodException extends Exception {
        public MismatchMethodException(String str) {
            super("mismatched method to invoke: ".concat(String.valueOf(str)));
        }
    }

    public static void setupMethodInvokeOptimizer(Class<? extends Extension> cls, MethodInvokeOptimizer methodInvokeOptimizer) {
        if (cls != null && methodInvokeOptimizer != null) {
            if (f9010a.put(cls, methodInvokeOptimizer) != null) {
                StringBuilder sb = new StringBuilder("setupMethodInvokeOptimizer, duplicate: ");
                sb.append(cls.getName());
                RVLogger.d(TAG, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder("setupMethodInvokeOptimizer: ");
            sb2.append(cls.getName());
            RVLogger.d(TAG, sb2.toString());
        }
    }

    public static void setupMethodInvokeOptimizerForBridge(Class<? extends Extension> cls, MethodInvokeOptimizer methodInvokeOptimizer) {
        if (cls != null && methodInvokeOptimizer != null) {
            if (b.put(cls, methodInvokeOptimizer) != null) {
                StringBuilder sb = new StringBuilder("setupMethodInvokeOptimizerForBridge, duplicate: ");
                sb.append(cls.getName());
                RVLogger.d(TAG, sb.toString());
                return;
            }
            StringBuilder sb2 = new StringBuilder("setupMethodInvokeOptimizerForBridge: ");
            sb2.append(cls.getName());
            RVLogger.d(TAG, sb2.toString());
        }
    }

    public static void clearAllMethodInvokeOptimizer() {
        if (f9010a.size() > 0) {
            f9010a = new ConcurrentHashMap();
        }
        if (b.size() > 0) {
            b = new ConcurrentHashMap();
        }
        RVLogger.d(TAG, "clearAllMethodInvokeOptimizer");
    }

    public static MethodInvokeOptimizer getMethodInvokeOptimizer(Class<? extends Extension> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        Map<Class<? extends Extension>, MethodInvokeOptimizer> map = z ? b : f9010a;
        if (map.size() == 0) {
            return null;
        }
        return map.get(cls);
    }

    public static void setupExceptionHandler(ExceptionHandler exceptionHandler) {
        StringBuilder sb = new StringBuilder("setupExceptionHandler, old: ");
        sb.append(c);
        sb.append(", new: ");
        sb.append(exceptionHandler);
        RVLogger.d(TAG, sb.toString());
        c = exceptionHandler;
    }

    public static void reportException(Throwable th, String str, String str2, String str3, Map<String, String> map) {
        ExceptionHandler exceptionHandler = c;
        if (exceptionHandler != null) {
            try {
                exceptionHandler.reportException(th, str, str2, str3, map);
            } catch (Throwable th2) {
                RVLogger.e(TAG, "reportException, occur error: ".concat(String.valueOf(th2)));
            }
        }
    }

    public static boolean shouldThrowOut(Throwable th, String str, String str2) {
        boolean z = "doMethodInvoke".equals(str) && "FinalCatch".equals(str2);
        StringBuilder sb = new StringBuilder("shouldThrowOut, t: ");
        sb.append(th);
        sb.append(", s: ");
        sb.append(str);
        sb.append(", f: ");
        sb.append(str2);
        sb.append(", r: ");
        sb.append(z);
        RVLogger.d(TAG, sb.toString());
        return z;
    }
}
