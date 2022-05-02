package com.alipay.alipaysecuritysdk.rds.v2.b;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9288a = {"dev", "loc", "env", "usr"};
    public Map<String, Object> b;
    public b c;
    public b d;
    public b e;
    public b f;

    public g() {
        this((byte) 0);
    }

    private g(byte b2) {
        this.b = new HashMap();
    }

    /* renamed from: b */
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9288a) {
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
