package com.alipay.mobile.rome.syncsdk.b;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.util.c;
import java.util.concurrent.ConcurrentHashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9409a = a.class.getSimpleName();
    private static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    private static a c;

    private a() {
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                c = new a();
            }
            aVar = c;
        }
        return aVar;
    }

    public final synchronized void a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            b(context, str, str2);
        }
    }

    public final synchronized String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return c(context, str);
    }

    private synchronized String c(Context context, String str) {
        Context context2;
        String str2;
        int max;
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Exception e) {
                String str3 = f9409a;
                StringBuilder sb = new StringBuilder("getString: [ Exception ");
                sb.append(e);
                sb.append(" ]");
                c.d(str3, sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        } else {
            context2 = null;
        }
        if (!(context2 == null || (max = dispatchOnCancelled.setMax(context2, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(116805331, oncanceled);
            onCancelLoad.getMin(116805331, oncanceled);
        }
        str2 = b.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        str2 = context.getSharedPreferences("com.alipay.android.phone.rome.syncsdk.linkinfo", 0).getString(str, (String) null);
        if (str2 != null) {
            b.put(str, str2);
        }
        return str2;
    }

    private synchronized boolean b(Context context, String str, String str2) {
        Context context2;
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Exception e) {
                String str3 = f9409a;
                StringBuilder sb = new StringBuilder("putString: [ Exception ");
                sb.append(e);
                sb.append(" ]");
                c.d(str3, sb.toString());
                return false;
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
                onCancelLoad.setMax(1800201124, oncanceled);
                onCancelLoad.getMin(1800201124, oncanceled);
            }
        }
        context.getSharedPreferences("com.alipay.android.phone.rome.syncsdk.linkinfo", 0).edit().putString(str, str2).commit();
        b.put(str, str2);
        return true;
    }

    public final synchronized void b(Context context, String str) {
        b.remove(str);
        try {
            context.getSharedPreferences("com.alipay.android.phone.rome.syncsdk.linkinfo", 4).edit().remove(str).commit();
        } catch (Exception e) {
            String str2 = f9409a;
            StringBuilder sb = new StringBuilder("putString: [ Exception ");
            sb.append(e);
            sb.append(" ]");
            c.d(str2, sb.toString());
        }
    }

    public final synchronized void a(String str, String str2) {
        a(com.alipay.mobile.rome.syncservice.d.a.f9473a, str, str2);
    }

    public final synchronized String a(String str) {
        return a(com.alipay.mobile.rome.syncservice.d.a.f9473a, str);
    }
}
