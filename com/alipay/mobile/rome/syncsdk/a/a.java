package com.alipay.mobile.rome.syncsdk.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.alipay.mobile.rome.longlinkservice.LongLinkAppConfig;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncsdk.util.d;
import com.ta.utdid2.device.UTDevice;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {
    private static final String d = a.class.getSimpleName();
    private static a e;

    /* renamed from: a  reason: collision with root package name */
    public String f9405a;
    public String b;
    public LongLinkAppConfig c;
    private String f = UTDevice.getUtdid(com.alipay.mobile.rome.syncservice.d.a.f9473a);
    private boolean g;
    private String h;

    private a() {
        a((LongLinkAppConfig) null);
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (e == null) {
                e = new a();
            }
            aVar = e;
        }
        return aVar;
    }

    public final void a(LongLinkAppConfig longLinkAppConfig) {
        if (longLinkAppConfig == null) {
            c.b(d, "longLinkAppConfig is null, will retrieve from manifest or mpaas.properties");
            Context context = com.alipay.mobile.rome.syncservice.d.a.f9473a;
            LongLinkAppConfig longLinkAppConfig2 = new LongLinkAppConfig();
            longLinkAppConfig2.appId = d.b(context);
            longLinkAppConfig2.appKey = d.a(context);
            longLinkAppConfig2.workspaceId = d.c(context);
            longLinkAppConfig2.productId = d.g(context);
            longLinkAppConfig2.authCode = d.f(context);
            longLinkAppConfig2.servHost = d.d(com.alipay.mobile.rome.syncservice.d.a.f9473a);
            longLinkAppConfig2.servPort = d.e(com.alipay.mobile.rome.syncservice.d.a.f9473a);
            longLinkAppConfig = longLinkAppConfig2;
        }
        if (TextUtils.isEmpty(longLinkAppConfig.productId)) {
            longLinkAppConfig.productId = String.format("%s-%s", new Object[]{longLinkAppConfig.appKey, longLinkAppConfig.workspaceId});
        }
        if (TextUtils.isEmpty(longLinkAppConfig.productVersion)) {
            longLinkAppConfig.productVersion = l();
        }
        this.c = longLinkAppConfig;
        String str = d;
        StringBuilder sb = new StringBuilder("longLinkAppConfig = ");
        sb.append(this.c.toString());
        c.b(str, sb.toString());
    }

    public final synchronized String b() {
        return this.c.productVersion;
    }

    public final synchronized String c() {
        return this.c.productId;
    }

    public final synchronized String d() {
        return this.c.appId;
    }

    public final synchronized String e() {
        return this.f;
    }

    public final synchronized String f() {
        return this.b;
    }

    public final synchronized String g() {
        return this.c.appKey;
    }

    public final synchronized String a(Context context) {
        return com.alipay.mobile.rome.syncsdk.b.a.a().a(context, "key_cdid");
    }

    public final synchronized void a(Context context, String str) {
        Context context2;
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            context2 = null;
        }
        if (context2 != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(context2, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(2023941802, oncanceled);
                onCancelLoad.getMin(2023941802, oncanceled);
            }
        }
        com.alipay.mobile.rome.syncsdk.b.a.a().a(context, "key_cdid", str);
    }

    public final synchronized String h() {
        return this.c.servHost;
    }

    public final synchronized String i() {
        return this.c.servPort;
    }

    public final synchronized boolean j() {
        this.g = false;
        if (TextUtils.equals(this.c.servPort, "443")) {
            this.g = true;
        }
        return this.g;
    }

    public final synchronized String k() {
        this.h = null;
        if (TextUtils.equals(this.c.servPort, "443")) {
            String str = this.c.servHost;
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                while (str.startsWith(" ")) {
                    str = str.substring(1, str.length()).trim();
                }
                while (str.endsWith(" ")) {
                    str = str.substring(0, str.length() - 1).trim();
                }
                if (str.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
                    String[] split = str.split("\\.");
                    if (Integer.parseInt(split[0]) < 255 && Integer.parseInt(split[1]) < 255 && Integer.parseInt(split[2]) < 255 && Integer.parseInt(split[3]) < 255) {
                        z = true;
                    }
                }
            }
            if (z) {
                this.h = "*.cloud.alipay.com";
            } else {
                this.h = this.c.servHost;
            }
        }
        return this.h;
    }

    private static String l() {
        Context context = com.alipay.mobile.rome.syncservice.d.a.f9473a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Throwable th) {
            c.a(d, "LongLinkAppInfo exception:".concat(String.valueOf(th)));
            return null;
        }
    }
}
