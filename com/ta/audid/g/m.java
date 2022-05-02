package com.ta.audid.g;

import android.os.Process;
import android.text.TextUtils;

public class m {
    private static String TAG = "Utdid";
    private static boolean i = false;
    private static boolean isDebug = false;

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static void d() {
        if (isDebug) {
            X();
            a((String) null, new Object[0]);
        }
    }

    public static void d(String str, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m1321a(String str, Object... objArr) {
        if (i) {
            X();
            a(str, objArr);
        }
    }

    public static void i(String str, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    public static void w(String str, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    public static void w(String str, Throwable th, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    public static void e(String str, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    public static void e(String str, Throwable th, Object... objArr) {
        if (isDebug) {
            X();
            a(str, objArr);
        }
    }

    private static String a(Object obj, Object obj2) {
        if (!isDebug) {
            return "";
        }
        Object[] objArr = new Object[2];
        if (obj == null) {
            obj = "";
        }
        objArr[0] = obj;
        if (obj2 == null) {
            obj2 = "";
        }
        objArr[1] = obj2;
        return String.format("%s:%s", objArr);
    }

    private static String X() {
        StringBuilder sb = new StringBuilder();
        sb.append(TAG);
        sb.append(":");
        return i(sb.toString());
    }

    private static String i(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = TAG;
        }
        StackTraceElement a2 = a();
        if (a2 != null) {
            String className = a2.getClassName();
            if (!TextUtils.isEmpty(className)) {
                str2 = className.substring(className.lastIndexOf(46) + 1);
                String valueOf = String.valueOf(Process.myPid());
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                sb.append(".");
                sb.append(valueOf);
                return sb.toString();
            }
        }
        str2 = "";
        String valueOf2 = String.valueOf(Process.myPid());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(".");
        sb2.append(valueOf2);
        return sb2.toString();
    }

    static String a(String str, Object... objArr) {
        String str2 = "";
        if (str == null && objArr == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement a2 = a();
        if (a2 != null) {
            str2 = a2.getMethodName();
        }
        int i2 = 0;
        sb.append(String.format("[%s]", new Object[]{str2}));
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= objArr.length) {
                    break;
                }
                sb.append("\n\t");
                sb.append(a(objArr[i2], objArr[i3]));
                i2 = i3 + 1;
            }
            if (i2 == objArr.length - 1) {
                sb.append("\n\t");
                sb.append(objArr[i2]);
            }
        }
        return sb.toString();
    }

    private static StackTraceElement a() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(m.class.getName())) {
                return stackTraceElement;
            }
        }
        return null;
    }
}
