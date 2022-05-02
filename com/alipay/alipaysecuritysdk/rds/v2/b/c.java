package com.alipay.alipaysecuritysdk.rds.v2.b;

import android.content.Context;
import com.alipay.alipaysecuritysdk.common.collector.b;
import com.alipay.alipaysecuritysdk.common.e.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9284a = {"apdid", "h", "imei", "imsi", "mac", "px", "sensor", "umid", "utdid", "apdidToken", "w", "tid", "idfa", "gss", "gss2", "usb", "wi"};
    public b b;
    public Map<String, Object> c;

    public c(Context context, String str, String str2, String str3, String str4, String str5) {
        this();
        this.c.put("apdid", str);
        this.c.put("umid", str2);
        this.c.put("utdid", str3);
        this.c.put("tid", str4);
        this.c.put("apdidToken", str5);
        this.c.put("imei", b.a(context));
        this.c.put("imsi", b.b(context));
        this.c.put("mac", b.l(context));
        this.c.put("px", b.i(context));
        this.c.put("w", b.j(context));
        this.c.put("h", b.k(context));
        String str6 = "";
        this.c.put("idfa", str6);
        this.c.put("gss", com.alipay.alipaysecuritysdk.common.collector.c.o());
        this.c.put("gss2", com.alipay.alipaysecuritysdk.common.collector.c.p());
        this.c.put("usb", com.alipay.alipaysecuritysdk.common.collector.c.r());
        this.c.put("wi", !e.c(com.alipay.alipaysecuritysdk.common.collector.c.q()) ? com.alipay.alipaysecuritysdk.common.collector.c.q() : str6);
    }

    private c() {
        this.c = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9284a) {
            Object obj = this.c.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            } else if (obj != null && (obj instanceof b)) {
                jSONObject.put(str, ((b) obj).a());
            }
        }
        return jSONObject;
    }
}
