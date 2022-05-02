package com.alipay.alipaysecuritysdk.apdid.e;

import android.content.Context;
import com.alipay.alipaysecuritysdk.apdid.bridge.JNIBridge;
import com.alipay.alipaysecuritysdk.apdid.g.a.b;
import com.alipay.alipaysecuritysdk.common.d.a;
import com.alipay.alipaysecuritysdk.common.e.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c {
    public static Map<String, String> a(Context context) {
        String str;
        String str2;
        Context context2 = context;
        HashMap hashMap = new HashMap();
        b a2 = com.alipay.alipaysecuritysdk.apdid.g.b.a(context);
        String a3 = com.alipay.alipaysecuritysdk.common.collector.b.a(context);
        String b = com.alipay.alipaysecuritysdk.common.collector.b.b(context);
        String l = com.alipay.alipaysecuritysdk.common.collector.b.l(context);
        String o2 = com.alipay.alipaysecuritysdk.common.collector.b.o(context);
        String n = com.alipay.alipaysecuritysdk.common.collector.b.n(context);
        String nativeProp = JNIBridge.getNativeProp(context2, "AD102", (String) null);
        String nativeProp2 = JNIBridge.getNativeProp(context2, "AD104", "");
        String nativeProp3 = JNIBridge.getNativeProp(context2, "AD108", (String) null);
        String nativeProp4 = JNIBridge.getNativeProp(context2, "dynData", "145");
        if (a2 != null) {
            if (e.c(a3)) {
                a3 = e.e(a2.f9262a);
            }
            if (e.c(b)) {
                b = e.e(a2.b);
            }
            if (e.c(l)) {
                l = e.e(a2.c);
            }
            if (e.c(o2)) {
                o2 = e.e(a2.d);
            }
            if (e.c(n)) {
                n = e.e(a2.e);
            }
        }
        b bVar = new b(a3, b, l, o2, n);
        if (context2 != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                str2 = nativeProp4;
                str = nativeProp3;
                try {
                    jSONObject.put("imei", e.e(bVar.f9262a));
                    jSONObject.put("imsi", e.e(bVar.b));
                    jSONObject.put("mac", e.e(bVar.c));
                    jSONObject.put("bluetoothmac", e.e(bVar.d));
                    jSONObject.put("gsi", e.e(bVar.e));
                    a.a(context2, "device_feature_prefs_name", "device_feature_prefs_key", jSONObject.toString());
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                str = nativeProp3;
                str2 = nativeProp4;
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", (Throwable) e);
                hashMap.put("AD1", a3);
                hashMap.put("AD2", b);
                hashMap.put("AD3", com.alipay.alipaysecuritysdk.common.collector.b.g(context));
                hashMap.put("AD5", com.alipay.alipaysecuritysdk.common.collector.b.i(context));
                hashMap.put("AD6", com.alipay.alipaysecuritysdk.common.collector.b.j(context));
                hashMap.put("AD7", com.alipay.alipaysecuritysdk.common.collector.b.k(context));
                hashMap.put("AD8", l);
                hashMap.put("AD9", com.alipay.alipaysecuritysdk.common.collector.b.m(context));
                hashMap.put("AD10", n);
                hashMap.put("AD11", com.alipay.alipaysecuritysdk.common.collector.b.c());
                hashMap.put("AD12", com.alipay.alipaysecuritysdk.common.collector.b.e());
                hashMap.put("AD13", com.alipay.alipaysecuritysdk.common.collector.b.f());
                hashMap.put("AD14", com.alipay.alipaysecuritysdk.common.collector.b.h());
                hashMap.put("AD15", com.alipay.alipaysecuritysdk.common.collector.b.i());
                hashMap.put("AD16", com.alipay.alipaysecuritysdk.common.collector.b.j());
                hashMap.put("AD18", o2);
                hashMap.put("AD19", com.alipay.alipaysecuritysdk.common.collector.b.p(context));
                hashMap.put("AD20", com.alipay.alipaysecuritysdk.common.collector.b.k());
                hashMap.put("AD23", com.alipay.alipaysecuritysdk.common.collector.b.r(context));
                hashMap.put("AD24", com.alipay.alipaysecuritysdk.common.b.c.a(com.alipay.alipaysecuritysdk.common.collector.b.h(context)));
                hashMap.put("AD26", com.alipay.alipaysecuritysdk.common.collector.b.f(context));
                hashMap.put("AD27", com.alipay.alipaysecuritysdk.common.collector.b.p());
                hashMap.put("AD28", com.alipay.alipaysecuritysdk.common.collector.b.r());
                hashMap.put("AD29", com.alipay.alipaysecuritysdk.common.collector.b.t());
                hashMap.put("AD30", com.alipay.alipaysecuritysdk.common.collector.b.q());
                hashMap.put("AD31", com.alipay.alipaysecuritysdk.common.collector.b.s());
                hashMap.put("AD32", String.valueOf(com.alipay.alipaysecuritysdk.common.collector.b.u()));
                hashMap.put("AD33", com.alipay.alipaysecuritysdk.common.collector.b.o());
                hashMap.put("AD34", com.alipay.alipaysecuritysdk.common.collector.b.t(context));
                hashMap.put("AD35", com.alipay.alipaysecuritysdk.common.collector.b.u(context));
                hashMap.put("AD36", com.alipay.alipaysecuritysdk.common.collector.b.s(context));
                hashMap.put("AD37", com.alipay.alipaysecuritysdk.common.collector.b.n());
                hashMap.put("AD38", com.alipay.alipaysecuritysdk.common.collector.b.m());
                hashMap.put("AD39", com.alipay.alipaysecuritysdk.common.collector.b.c(context));
                hashMap.put("AD40", com.alipay.alipaysecuritysdk.common.collector.b.d(context));
                hashMap.put("AD41", com.alipay.alipaysecuritysdk.common.collector.b.a());
                hashMap.put("AD42", com.alipay.alipaysecuritysdk.common.collector.b.b());
                hashMap.put("AD100", com.alipay.alipaysecuritysdk.common.collector.b.d());
                hashMap.put("AD102", nativeProp);
                hashMap.put("AD104", nativeProp2);
                hashMap.put("AD107", b(context));
                hashMap.put("AD108", str);
                hashMap.put("AD111", str2);
                hashMap.put("AL3", com.alipay.alipaysecuritysdk.common.collector.b.q(context));
                return hashMap;
            }
        } else {
            str = nativeProp3;
            str2 = nativeProp4;
        }
        hashMap.put("AD1", a3);
        hashMap.put("AD2", b);
        hashMap.put("AD3", com.alipay.alipaysecuritysdk.common.collector.b.g(context));
        hashMap.put("AD5", com.alipay.alipaysecuritysdk.common.collector.b.i(context));
        hashMap.put("AD6", com.alipay.alipaysecuritysdk.common.collector.b.j(context));
        hashMap.put("AD7", com.alipay.alipaysecuritysdk.common.collector.b.k(context));
        hashMap.put("AD8", l);
        hashMap.put("AD9", com.alipay.alipaysecuritysdk.common.collector.b.m(context));
        hashMap.put("AD10", n);
        hashMap.put("AD11", com.alipay.alipaysecuritysdk.common.collector.b.c());
        hashMap.put("AD12", com.alipay.alipaysecuritysdk.common.collector.b.e());
        hashMap.put("AD13", com.alipay.alipaysecuritysdk.common.collector.b.f());
        hashMap.put("AD14", com.alipay.alipaysecuritysdk.common.collector.b.h());
        hashMap.put("AD15", com.alipay.alipaysecuritysdk.common.collector.b.i());
        hashMap.put("AD16", com.alipay.alipaysecuritysdk.common.collector.b.j());
        hashMap.put("AD18", o2);
        hashMap.put("AD19", com.alipay.alipaysecuritysdk.common.collector.b.p(context));
        hashMap.put("AD20", com.alipay.alipaysecuritysdk.common.collector.b.k());
        hashMap.put("AD23", com.alipay.alipaysecuritysdk.common.collector.b.r(context));
        hashMap.put("AD24", com.alipay.alipaysecuritysdk.common.b.c.a(com.alipay.alipaysecuritysdk.common.collector.b.h(context)));
        hashMap.put("AD26", com.alipay.alipaysecuritysdk.common.collector.b.f(context));
        hashMap.put("AD27", com.alipay.alipaysecuritysdk.common.collector.b.p());
        hashMap.put("AD28", com.alipay.alipaysecuritysdk.common.collector.b.r());
        hashMap.put("AD29", com.alipay.alipaysecuritysdk.common.collector.b.t());
        hashMap.put("AD30", com.alipay.alipaysecuritysdk.common.collector.b.q());
        hashMap.put("AD31", com.alipay.alipaysecuritysdk.common.collector.b.s());
        hashMap.put("AD32", String.valueOf(com.alipay.alipaysecuritysdk.common.collector.b.u()));
        hashMap.put("AD33", com.alipay.alipaysecuritysdk.common.collector.b.o());
        hashMap.put("AD34", com.alipay.alipaysecuritysdk.common.collector.b.t(context));
        hashMap.put("AD35", com.alipay.alipaysecuritysdk.common.collector.b.u(context));
        hashMap.put("AD36", com.alipay.alipaysecuritysdk.common.collector.b.s(context));
        hashMap.put("AD37", com.alipay.alipaysecuritysdk.common.collector.b.n());
        hashMap.put("AD38", com.alipay.alipaysecuritysdk.common.collector.b.m());
        hashMap.put("AD39", com.alipay.alipaysecuritysdk.common.collector.b.c(context));
        hashMap.put("AD40", com.alipay.alipaysecuritysdk.common.collector.b.d(context));
        hashMap.put("AD41", com.alipay.alipaysecuritysdk.common.collector.b.a());
        hashMap.put("AD42", com.alipay.alipaysecuritysdk.common.collector.b.b());
        hashMap.put("AD100", com.alipay.alipaysecuritysdk.common.collector.b.d());
        hashMap.put("AD102", nativeProp);
        hashMap.put("AD104", nativeProp2);
        hashMap.put("AD107", b(context));
        hashMap.put("AD108", str);
        hashMap.put("AD111", str2);
        hashMap.put("AL3", com.alipay.alipaysecuritysdk.common.collector.b.q(context));
        return hashMap;
    }

    private static String b(Context context) {
        try {
            return String.valueOf(e.a(JNIBridge.getNativeProp(context, "AD107", (String) null)));
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", th);
            return "0";
        }
    }
}
