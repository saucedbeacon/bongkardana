package com.alibaba.wireless.security.framework.utils;

import android.os.Process;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f9217a = "SGFramework";
    private static String b = "SGTIME";
    private static boolean c = false;

    public static String a() {
        if (c) {
            return Thread.currentThread().getStackTrace()[3].getMethodName();
        }
        return null;
    }

    public static void a(String str) {
    }

    public static void a(String str, String str2, String str3, long j) {
        if (c) {
            Process.myPid();
            Process.myTid();
        }
    }

    public static void a(String str, Throwable th) {
    }

    public static long b() {
        if (c) {
            return System.currentTimeMillis();
        }
        return 0;
    }

    public static void b(String str) {
    }
}
