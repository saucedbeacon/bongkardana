package com.alipay.alipaysecuritysdk.apdid.g;

import android.content.Context;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.alipaysecuritysdk.common.c.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import org.json.JSONObject;

public final class a {
    public static synchronized void a(Context context) {
        synchronized (a.class) {
            com.alipay.alipaysecuritysdk.common.d.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
        }
    }

    public static synchronized void b(Context context) {
        synchronized (a.class) {
            c(context);
        }
    }

    public static synchronized void a(Context context, com.alipay.alipaysecuritysdk.apdid.g.a.a aVar) {
        synchronized (a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", aVar.f9261a);
                jSONObject.put("deviceInfoHash", aVar.b);
                jSONObject.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, aVar.c);
                jSONObject.put("tid", aVar.d);
                jSONObject.put("utdid", aVar.e);
                com.alipay.alipaysecuritysdk.common.d.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject.toString());
            } catch (Exception e) {
                b.a("SEC_SDK-apdid", "V4 saveStorageModelV4 happed exception:", e);
            }
        }
    }

    public static synchronized com.alipay.alipaysecuritysdk.apdid.g.a.a c(Context context) {
        com.alipay.alipaysecuritysdk.apdid.g.a.a a2;
        synchronized (a.class) {
            a2 = a(com.alipay.alipaysecuritysdk.common.d.a.a(context, "vkeyid_profiles_v4", "key_deviceid_v4"));
        }
        return a2;
    }

    private static com.alipay.alipaysecuritysdk.apdid.g.a.a a(String str) {
        try {
            if (e.c(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new com.alipay.alipaysecuritysdk.apdid.g.a.a(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            b.a("SEC_SDK-apdid", (Throwable) e);
            return null;
        }
    }
}
