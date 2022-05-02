package com.alipay.alipaysecuritysdk.apdid.attack;

import android.content.Context;
import android.util.Base64;
import com.alipay.alipaysecuritysdk.apdid.attack.b;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

public class ScanAttack {
    public static int CHECK_ALL = -1;
    public static int CHECK_DEBUG = 2;
    public static int CHECK_HOOK = 1;
    public static int CHECK_VIRTUAL = 4;
    public static int MODE_DETAIL = 1;
    public static int MODE_SIMPLE;
    private static volatile ScanAttack mInstance;

    private ScanAttack() {
    }

    public static ScanAttack getInstance() {
        if (mInstance == null) {
            synchronized (ScanAttack.class) {
                if (mInstance == null) {
                    mInstance = new ScanAttack();
                }
            }
        }
        return mInstance;
    }

    public static boolean scanPackage(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).packageName.equals(str);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public static JSONArray methodToNative() {
        a aVar = new a(2);
        for (b.a next : b.f10648a) {
            try {
                if (Modifier.isNative(Class.forName(next.b).getMethod(next.c, next.d).getModifiers())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(next.b);
                    sb.append("#");
                    sb.append(next.c);
                    aVar.a("native", sb.toString());
                }
            } catch (Exception e) {
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            }
        }
        return aVar.a();
    }

    public static boolean xp1(Context context) {
        return scanPackage(context, new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5pbnN0YWxsZXI=", 2)));
    }

    public static boolean xp2(Context context) {
        context.getFilesDir();
        try {
            throw new Exception("凸一_一凸");
        } catch (Exception e) {
            e.getMessage();
            boolean z = false;
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRCcmlkZ2U=", 2))) && stackTraceElement.getMethodName().equals(new String(Base64.decode("bWFpbg==", 2)))) {
                    z = true;
                }
                if (stackTraceElement.getClassName().equals(new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRCcmlkZ2U=", 2))) && stackTraceElement.getMethodName().equals(new String(Base64.decode("aGFuZGxlSG9va2VkTWV0aG9k", 2)))) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static String xp3(Context context) {
        context.getFilesDir();
        try {
            Field declaredField = ClassLoader.getSystemClassLoader().loadClass(new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRIZWxwZXJz", 2))).getDeclaredField(new String(Base64.decode("ZmllbGRDYWNoZQ==", 2)));
            declaredField.setAccessible(true);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(((Map) declaredField.get((Object) null)).keySet());
            return new JSONArray(arrayList).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String xp4(Context context) {
        String str;
        context.getFilesDir();
        a aVar = new a(1);
        try {
            Field declaredField = ClassLoader.getSystemClassLoader().loadClass(new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRCcmlkZ2U=", 2))).getDeclaredField(new String(Base64.decode("c0hvb2tlZE1ldGhvZENhbGxiYWNrcw==", 2)));
            declaredField.setAccessible(true);
            Class<?> loadClass = ClassLoader.getSystemClassLoader().loadClass(new String(Base64.decode("ZGUucm9idi5hbmRyb2lkLnhwb3NlZC5YcG9zZWRCcmlkZ2UkQ29weU9uV3JpdGVTb3J0ZWRTZXQ=", 2)));
            Method declaredMethod = loadClass.getDeclaredMethod(new String(Base64.decode("Z2V0U25hcHNob3Q=", 2)), new Class[0]);
            for (Map.Entry entry : ((Map) declaredField.get((Object) null)).entrySet()) {
                Object value = entry.getValue();
                String a2 = b.a(((Member) entry.getKey()).toString());
                if (!"".equals(a2) && loadClass.isInstance(value)) {
                    for (Object obj : (Object[]) declaredMethod.invoke(value, new Object[0])) {
                        String[] split = obj.getClass().getClassLoader().toString().split("\"");
                        if (split.length > 1) {
                            if (split == null || split.length <= 1) {
                                str = "";
                            } else {
                                str = split[1];
                            }
                            aVar.a(str, a2);
                        }
                    }
                }
            }
            JSONArray a3 = aVar.a();
            JSONArray methodToNative = methodToNative();
            if (a3 != null) {
                if (methodToNative != null) {
                    for (int i = 0; i < methodToNative.length(); i++) {
                        a3.put(methodToNative.getJSONObject(i));
                    }
                }
                return a3.toString();
            } else if (methodToNative != null) {
                return methodToNative.toString();
            } else {
                return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean cy1(Context context) {
        return scanPackage(context, new String(Base64.decode("Y29tLnNhdXJpay5zdWJzdHJhdGU=", 2)));
    }

    public static boolean cy2(Context context) {
        context.getFilesDir();
        try {
            throw new Exception("凸一_一凸");
        } catch (Exception e) {
            e.getMessage();
            boolean z = false;
            int i = 0;
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                if (stackTraceElement.getClassName().equals(new String(Base64.decode("Y29tLmFuZHJvaWQuaW50ZXJuYWwub3MuWnlnb3RlSW5pdA==", 2))) && (i = i + 1) == 2) {
                    z = true;
                }
                if (stackTraceElement.getClassName().equals(new String(Base64.decode("Y29tLnNhdXJpay5zdWJzdHJhdGUuTVMkMg==", 2))) && stackTraceElement.getMethodName().equals(new String(Base64.decode("aW52b2tlZA==", 2)))) {
                    z = true;
                }
            }
            return z;
        }
    }

    public static boolean cy3(Context context) {
        Class<?> cls;
        context.getFilesDir();
        try {
            cls = ClassLoader.getSystemClassLoader().loadClass(new String(Base64.decode("Y29tLnNhdXJpay5zdWJzdHJhdGUuU3Vic3RyYXRlQ2xhc3NMb2FkZXI=", 2)));
        } catch (Exception unused) {
            cls = null;
        }
        return cls != null;
    }

    public static String vir1(Context context) {
        try {
            String str = new String(Base64.decode("L2RhdGEvZGF0YS8=", 2));
            String str2 = new String(Base64.decode("L2RhdGEvdXNlci8=", 2));
            String packageName = context.getPackageName();
            String absolutePath = context.getFilesDir().getAbsolutePath();
            if (absolutePath.startsWith(str2)) {
                if (!absolutePath.substring(absolutePath.indexOf(47, str2.length()) + 1).startsWith(packageName)) {
                    absolutePath = "^^^".concat(String.valueOf(absolutePath));
                }
            }
            return (!absolutePath.startsWith(str) || absolutePath.substring(str.length()).startsWith(packageName)) ? absolutePath : "^^^".concat(String.valueOf(absolutePath));
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            return "";
        }
    }
}
