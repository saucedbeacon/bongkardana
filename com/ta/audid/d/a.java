package com.ta.audid.d;

import android.content.Context;
import android.os.Build;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final b f9836a;

    static class b {
        public int a(Context context, String str, String str2) {
            return 1;
        }

        public String permissionToOp(String str) {
            return null;
        }

        private b() {
        }
    }

    /* renamed from: com.ta.audid.d.a$a  reason: collision with other inner class name */
    static class C0035a extends b {
        private C0035a() {
            super();
        }

        public String permissionToOp(String str) {
            return b.permissionToOp(str);
        }

        public int a(Context context, String str, String str2) {
            return b.a(context, str, str2);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f9836a = new C0035a();
        } else {
            f9836a = new b();
        }
    }

    public static String permissionToOp(String str) {
        return f9836a.permissionToOp(str);
    }

    public static int a(Context context, String str, String str2) {
        return f9836a.a(context, str, str2);
    }
}
