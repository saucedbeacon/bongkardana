package com.alipay.alipaysecuritysdk.apdid.g;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.d.a;
import com.alipay.alipaysecuritysdk.common.e.e;
import org.json.JSONObject;

public final class b {
    public static com.alipay.alipaysecuritysdk.apdid.g.a.b a(Context context) {
        if (context == null) {
            return null;
        }
        String a2 = a.a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (e.c(a2)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a2);
            com.alipay.alipaysecuritysdk.apdid.g.a.b bVar = new com.alipay.alipaysecuritysdk.apdid.g.a.b();
            bVar.f9262a = jSONObject.getString("imei");
            bVar.b = jSONObject.getString("imsi");
            bVar.c = jSONObject.getString("mac");
            bVar.d = jSONObject.getString("bluetoothmac");
            bVar.e = jSONObject.getString("gsi");
            return bVar;
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-apdid", (Throwable) e);
            return null;
        }
    }
}
