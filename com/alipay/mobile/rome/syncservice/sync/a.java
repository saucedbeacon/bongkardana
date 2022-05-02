package com.alipay.mobile.rome.syncservice.sync;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.register.Biz;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9483a = com.alipay.mobile.rome.syncservice.sync.c.a.class.getSimpleName();
    public static final ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
    private static volatile a e;
    public volatile Context b = com.alipay.mobile.rome.syncservice.d.a.f9473a;
    public volatile SharedPreferences d = this.b.getSharedPreferences("com.alipay.android.phone.rome.syncservice.syncinfo", 0);

    private a() {
    }

    public static a a() {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    e = new a();
                }
            }
        }
        return e;
    }

    public final long a(String str, String str2) {
        Biz.BizDimeEnum b2 = com.alipay.mobile.rome.syncservice.sync.register.a.a().b(str);
        if (Biz.BizDimeEnum.USER == b2) {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
            }
            return b(str2, str);
        }
        if (Biz.BizDimeEnum.DEVICE != b2) {
            String str3 = f9483a;
            StringBuilder sb = new StringBuilder("getBizSkey: [ unkown biz ][ biz=");
            sb.append(str);
            sb.append(" ]");
            c.d(str3, sb.toString());
            if (TextUtils.isEmpty(str2)) {
                str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
            }
            long b3 = b(str2, str);
            if (b3 > 0) {
                return b3;
            }
        }
        String a2 = a("deviceId_".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(a2)) {
            return Long.parseLong(a2);
        }
        return 0;
    }

    private long b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        StringBuilder sb = new StringBuilder("sync_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        String a2 = a(sb.toString());
        if (!TextUtils.isEmpty(a2)) {
            return Long.parseLong(a2);
        }
        return 0;
    }

    public final long a(String str, long j, String str2) {
        Biz.BizDimeEnum b2 = com.alipay.mobile.rome.syncservice.sync.register.a.a().b(str);
        if (Biz.BizDimeEnum.USER == b2) {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.alipay.mobile.rome.syncsdk.a.a.a().f9405a;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb = new StringBuilder("sync_");
                sb.append(str2);
                sb.append("_");
                sb.append(str);
                c(sb.toString(), String.valueOf(j));
            }
        } else if (Biz.BizDimeEnum.DEVICE == b2) {
            c("deviceId_".concat(String.valueOf(str)), String.valueOf(j));
        } else {
            String str3 = f9483a;
            StringBuilder sb2 = new StringBuilder("setBizSkey: [ unkown biz ][ biz=");
            sb2.append(str);
            sb2.append(" ]");
            c.d(str3, sb2.toString());
        }
        return j;
    }

    public final String a(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(54411273, oncanceled);
            onCancelLoad.getMin(54411273, oncanceled);
        }
        String str2 = c.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            if (this.d == null) {
                this.d = this.b.getSharedPreferences("com.alipay.android.phone.rome.syncservice.syncinfo", 0);
            }
            str2 = this.d.getString(str, (String) null);
            if (str2 != null) {
                c.put(str, str2);
            }
        } catch (Exception e2) {
            String str3 = f9483a;
            StringBuilder sb = new StringBuilder("getString: [ Exception ");
            sb.append(e2);
            sb.append(" ]");
            c.d(str3, sb.toString());
        }
        return str2;
    }

    private boolean c(String str, String str2) {
        try {
            if (this.d == null) {
                this.d = this.b.getSharedPreferences("com.alipay.android.phone.rome.syncservice.syncinfo", 0);
            }
            this.d.edit().putString(str, str2).apply();
            c.put(str, str2);
            return true;
        } catch (Exception e2) {
            String str3 = f9483a;
            StringBuilder sb = new StringBuilder("putString: [ Exception ");
            sb.append(e2);
            sb.append(" ]");
            c.d(str3, sb.toString());
            return false;
        }
    }

    public final void b(String str) {
        try {
            if (this.d == null) {
                this.d = this.b.getSharedPreferences("com.alipay.android.phone.rome.syncservice.syncinfo", 0);
            }
            this.d.edit().remove(str).apply();
            String str2 = f9483a;
            StringBuilder sb = new StringBuilder("removeSPKey:");
            sb.append(str);
            sb.append(" successfully!");
            c.b(str2, sb.toString());
        } catch (Exception e2) {
            String str3 = f9483a;
            StringBuilder sb2 = new StringBuilder("removeSPKey: [ Exception ");
            sb2.append(e2);
            sb2.append(" ]");
            c.d(str3, sb2.toString());
        }
    }
}
