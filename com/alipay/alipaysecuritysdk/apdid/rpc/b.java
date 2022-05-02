package com.alipay.alipaysecuritysdk.apdid.rpc;

import android.content.Context;
import com.alipay.alipaysecuritysdk.apdid.bridge.JNIBridge;
import com.alipay.alipaysecuritysdk.apdid.face.Configuration;
import com.alipay.alipaysecuritysdk.apdid.g.d;
import com.alipay.alipaysecuritysdk.apdid.rpc.model.a.a;
import com.alipay.alipaysecuritysdk.common.e.c;
import com.alipay.alipaysecuritysdk.common.e.e;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import java.util.HashMap;
import java.util.Map;

public final class b {
    public static com.alipay.alipaysecuritysdk.apdid.rpc.model.a.b a(Context context, int i, Map<String, String> map) {
        a aVar;
        Configuration a2 = com.alipay.alipaysecuritysdk.apdid.a.a.a();
        com.alipay.alipaysecuritysdk.apdid.rpc.a.a aVar2 = new com.alipay.alipaysecuritysdk.apdid.rpc.a.a(context, a2.gateway, a2.headers);
        if (i == 0) {
            try {
                aVar = a(context, map);
            } catch (Exception e) {
                com.alipay.alipaysecuritysdk.common.c.a.a("rpc_request", F2FPayConstants.OrderStatus.FAILED, e.getMessage());
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", "send device data error", e);
                return null;
            }
        } else {
            aVar = null;
        }
        if (i == 1) {
            if (map == null) {
                aVar = null;
            } else {
                a aVar3 = new a();
                aVar3.f9267a = "android";
                aVar3.c = com.alipay.alipaysecuritysdk.apdid.d.a.a(context, map.get("appName"));
                HashMap hashMap = new HashMap(2);
                hashMap.put("dynamicTrace", map.get("dynamicTrace"));
                hashMap.put("dynamicNum", map.get("dynamicNum"));
                aVar3.k = hashMap;
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dynamicData", map.get("dynamicData"));
                aVar3.j = hashMap2;
                aVar = aVar3;
            }
        }
        return aVar2.a(aVar);
    }

    private static a a(Context context, Map<String, String> map) {
        a aVar = new a();
        String a2 = c.a(map, "appName");
        String a3 = c.a(map, "sessionId");
        String a4 = c.a(map, "rpcVersion");
        String a5 = com.alipay.alipaysecuritysdk.apdid.d.a.a(context, a2);
        String d = d.d(context);
        aVar.d = com.alipay.alipaysecuritysdk.apdid.a.a.a().needUmid ? com.alipay.alipaysecuritysdk.apdid.f.a.a(context) : "";
        aVar.e = d;
        aVar.f9267a = "android";
        aVar.i = a4;
        if (e.d(a3)) {
            aVar.c = a3;
        } else {
            aVar.c = a5;
        }
        com.alipay.alipaysecuritysdk.apdid.g.a.a c = com.alipay.alipaysecuritysdk.apdid.g.a.c(context);
        if (c != null) {
            aVar.b = c.f9261a;
            aVar.g = c.f9261a;
            aVar.h = c.c;
        }
        Map<String, String> a6 = com.alipay.alipaysecuritysdk.apdid.e.e.a(context, map);
        if (com.alipay.alipaysecuritysdk.apdid.a.a.a().secret != null) {
            try {
                String e = e.e(JNIBridge.aesEncrypt(c.a(a6).toString()));
                HashMap hashMap = new HashMap(2);
                hashMap.put("default", e);
                hashMap.put("wbType", com.alipay.alipaysecuritysdk.apdid.a.a.a().secret);
                aVar.j = hashMap;
            } catch (Throwable th) {
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", th);
            }
            return aVar;
        }
        aVar.j = a6;
        return aVar;
    }
}
