package com.alipay.alipaysecuritysdk.common.c;

import java.util.ArrayList;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static a f9271a;

    public interface a {
        void print(String str, String str2);
    }

    public static void a(String str, String str2) {
        a(1, str, str2, true);
    }

    public static void b(String str, String str2) {
        a(2, str, str2, false);
    }

    public static void a(String str, Throwable th) {
        a(2, str, th.getMessage(), false);
        for (StackTraceElement obj : th.getStackTrace()) {
            StringBuilder sb = new StringBuilder("\t");
            sb.append(obj.toString());
            a(2, str, sb.toString(), false);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        a(2, str, str2, false);
        a(2, str, th.getMessage(), true);
        for (StackTraceElement obj : th.getStackTrace()) {
            StringBuilder sb = new StringBuilder("\t");
            sb.append(obj.toString());
            a(2, str, sb.toString(), false);
        }
    }

    private static String a() {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int length = stackTrace.length - 1;
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (length <= 0) {
                break;
            } else if (stackTrace[length - 1].getClassName().contains(b.class.getName())) {
                sb.append("(");
                sb.append(stackTrace[length].getFileName());
                sb.append(":");
                sb.append(stackTrace[length].getLineNumber());
                sb.append(")");
                sb.append(stackTrace[length].getMethodName());
                break;
            } else {
                length--;
            }
        }
        return sb.toString();
    }

    private static void a(int i, String str, String str2, boolean z) {
        if (str2 != null) {
            a aVar = f9271a;
            if (aVar != null) {
                aVar.print(str, str2);
            }
            if (z) {
                for (String str3 : str2.split("\n")) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (str3.length() < 10000) {
                        arrayList.add(str3);
                    } else {
                        int i2 = 0;
                        while (i2 < str3.length()) {
                            int i3 = i2 + 10000;
                            if (i3 >= str3.length()) {
                                i3 = str3.length();
                            }
                            arrayList.add(str3.substring(i2, i3));
                            i2 = i3;
                        }
                    }
                    for (String str4 : arrayList) {
                        if (i == 0) {
                            a();
                        } else if (i == 1) {
                            a();
                        } else if (i != 2) {
                            a();
                        } else {
                            a();
                        }
                    }
                }
            }
        }
    }
}
