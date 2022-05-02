package com.uc.crashsdk.a;

import com.uc.crashsdk.JNIBridge;
import com.uc.crashsdk.b;
import com.uc.crashsdk.p;

public final class c {
    public static void a(String str) {
        p.G();
    }

    public static void b(String str) {
        p.G();
    }

    public static void c(String str) {
        p.G();
    }

    public static void a(String str, String str2) {
        p.G();
    }

    public static void b(String str, String str2) {
        if (b.d) {
            JNIBridge.nativeLog(5, str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (b.d) {
            JNIBridge.nativeLog(6, str, str2);
        }
    }
}
