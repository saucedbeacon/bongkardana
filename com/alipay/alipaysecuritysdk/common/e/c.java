package com.alipay.alipaysecuritysdk.common.e;

import com.alipay.alipaysecuritysdk.common.c.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static JSONObject a(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && map.size() > 0) {
            try {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (JSONException e) {
                b.a("SEC_SDK-tool", (Throwable) e);
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r1.get(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.util.Map<java.lang.String, java.lang.String> r1, java.lang.String r2) {
        /*
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.e.c.a(java.util.Map, java.lang.String):java.lang.String");
    }
}
