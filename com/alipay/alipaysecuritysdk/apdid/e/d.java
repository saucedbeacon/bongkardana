package com.alipay.alipaysecuritysdk.apdid.e;

import android.content.Context;
import com.alipay.alipaysecuritysdk.apdid.bridge.JNIBridge;
import com.alipay.alipaysecuritysdk.common.collector.c;
import java.util.HashMap;
import java.util.Map;

public final class d {
    public static synchronized Map<String, String> a(Context context) {
        HashMap hashMap;
        synchronized (d.class) {
            hashMap = new HashMap(18);
            hashMap.put("AE1", c.a());
            hashMap.put("AE2", c.b() ? "1" : "0");
            hashMap.put("AE3", c.a(context) ? "1" : "0");
            hashMap.put("AE4", c.c());
            hashMap.put("AE5", c.d());
            hashMap.put("AE6", c.e());
            hashMap.put("AE7", c.f());
            hashMap.put("AE8", c.g());
            hashMap.put("AE9", c.h());
            hashMap.put("AE10", c.i());
            hashMap.put("AE11", c.j());
            hashMap.put("AE12", c.k());
            hashMap.put("AE13", c.l());
            hashMap.put("AE14", c.m());
            hashMap.put("AE15", c.n());
            hashMap.put("AE20", JNIBridge.getNativeProp(context, "AE20", (String) null));
            hashMap.put("AE21", c.s());
        }
        return hashMap;
    }
}
