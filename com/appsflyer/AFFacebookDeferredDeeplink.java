package com.appsflyer;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationHandler;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFFacebookDeferredDeeplink {

    /* renamed from: ˊ  reason: contains not printable characters */
    public String f8557;

    /* renamed from: ˋ  reason: contains not printable characters */
    String f8558;

    /* renamed from: ˎ  reason: contains not printable characters */
    byte[] f8559;

    /* renamed from: ˏ  reason: contains not printable characters */
    String f8560;

    public interface AppLinkFetchEvents {
        void onAppLinkFetchFailed(String str);

        void onAppLinkFetchFinished(@Nullable String str, @Nullable String str2, @Nullable String str3);
    }

    AFFacebookDeferredDeeplink() {
    }

    /* renamed from: com.appsflyer.AFFacebookDeferredDeeplink$4  reason: invalid class name */
    public static class AnonymousClass4 implements InvocationHandler {

        /* renamed from: ˊ  reason: contains not printable characters */
        private static String f8561;

        /* renamed from: ˋ  reason: contains not printable characters */
        private static String f8562;

        /* renamed from: ˎ  reason: contains not printable characters */
        private /* synthetic */ AppLinkFetchEvents f8563;

        /* renamed from: ॱ  reason: contains not printable characters */
        private /* synthetic */ Class f8564;

        AnonymousClass4(Class cls, AppLinkFetchEvents appLinkFetchEvents) {
            this.f8564 = cls;
            this.f8563 = appLinkFetchEvents;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0049, code lost:
            r4 = r4.getBundle("deeplink_context");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, java.lang.Object[] r6) throws java.lang.Throwable {
            /*
                r3 = this;
                java.lang.String r4 = r5.getName()
                java.lang.String r5 = "onDeferredAppLinkDataFetched"
                boolean r4 = r4.equals(r5)
                r5 = 0
                if (r4 == 0) goto L_0x006d
                r4 = 0
                r0 = r6[r4]
                if (r0 == 0) goto L_0x0065
                java.lang.Class r0 = r3.f8564
                r6 = r6[r4]
                java.lang.Object r6 = r0.cast(r6)
                java.lang.Class r0 = r3.f8564
                java.lang.Class[] r1 = new java.lang.Class[r4]
                java.lang.String r2 = "getArgumentBundle"
                java.lang.reflect.Method r0 = r0.getMethod(r2, r1)
                java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Object r4 = r0.invoke(r6, r4)
                java.lang.Object r4 = r1.cast(r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                if (r4 == 0) goto L_0x005a
                java.lang.String r6 = "com.facebook.platform.APPLINK_NATIVE_URL"
                java.lang.String r6 = r4.getString(r6)
                java.lang.String r0 = "target_url"
                java.lang.String r0 = r4.getString(r0)
                java.lang.String r1 = "extras"
                android.os.Bundle r4 = r4.getBundle(r1)
                if (r4 == 0) goto L_0x0058
                java.lang.String r1 = "deeplink_context"
                android.os.Bundle r4 = r4.getBundle(r1)
                if (r4 == 0) goto L_0x0058
                java.lang.String r1 = "promo_code"
                java.lang.String r4 = r4.getString(r1)
                goto L_0x005d
            L_0x0058:
                r4 = r5
                goto L_0x005d
            L_0x005a:
                r4 = r5
                r6 = r4
                r0 = r6
            L_0x005d:
                com.appsflyer.AFFacebookDeferredDeeplink$AppLinkFetchEvents r1 = r3.f8563
                if (r1 == 0) goto L_0x006c
                r1.onAppLinkFetchFinished(r6, r0, r4)
                goto L_0x006c
            L_0x0065:
                com.appsflyer.AFFacebookDeferredDeeplink$AppLinkFetchEvents r4 = r3.f8563
                if (r4 == 0) goto L_0x006c
                r4.onAppLinkFetchFinished(r5, r5, r5)
            L_0x006c:
                return r5
            L_0x006d:
                com.appsflyer.AFFacebookDeferredDeeplink$AppLinkFetchEvents r4 = r3.f8563
                if (r4 == 0) goto L_0x0076
                java.lang.String r6 = "onDeferredAppLinkDataFetched invocation failed"
                r4.onAppLinkFetchFailed(r6)
            L_0x0076:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFFacebookDeferredDeeplink.AnonymousClass4.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        AnonymousClass4() {
        }

        /* renamed from: ॱ  reason: contains not printable characters */
        static void m1123(String str) {
            f8561 = str;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || i == str.length() - 1) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append("*");
                }
            }
            f8562 = sb.toString();
        }

        /* renamed from: ˏ  reason: contains not printable characters */
        public static void m1122(String str) {
            if (f8561 == null) {
                m1123(AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY));
            }
            String str2 = f8561;
            if (str2 != null && str.contains(str2)) {
                AFLogger.afInfoLog(str.replace(f8561, f8562));
            }
        }
    }

    AFFacebookDeferredDeeplink(String str, byte[] bArr, String str2) {
        this.f8558 = str;
        this.f8559 = bArr;
        this.f8560 = str2;
    }

    public AFFacebookDeferredDeeplink(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.f8558 = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.f8560 = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.f8560);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.f8559 = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes();
            }
        }
        scanner.close();
    }
}
