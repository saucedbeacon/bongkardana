package com.alipay.alipaysecuritysdk.rds.v2.b;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f9293a = {"appKey", SecurityConstants.KEY_TEXT, "wua"};
    private Map<String, Object> b;

    public i() {
        this((byte) 0);
    }

    private i(byte b2) {
        this.b = new HashMap();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (String str : f9293a) {
            Object obj = this.b.get(str);
            if (obj != null && (obj instanceof String)) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }
}
