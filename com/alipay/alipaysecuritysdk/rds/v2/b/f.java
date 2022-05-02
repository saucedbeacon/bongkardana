package com.alipay.alipaysecuritysdk.rds.v2.b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9287a = {"alipay", "taobao"};
    private Map<String, Object> b;

    public f() {
        this((byte) 0);
    }

    private f(byte b2) {
        this.b = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9287a) {
            Object obj = this.b.get(str);
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
