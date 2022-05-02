package com.ta.audid.a;

import android.content.Context;
import com.ta.audid.g.m;
import com.ta.utdid2.a.a.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class b {
    private static Map<String, String> b(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("V", "1.0");
        hashMap.putAll(d.c(context));
        hashMap.putAll(g.d(context));
        hashMap.putAll(a.a(context));
        return hashMap;
    }

    public static JSONObject a(Context context) {
        if (!m.isDebug()) {
            return new JSONObject(b(context));
        }
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject(e.a(b(context)));
        m.a(jSONObject.toString(), new Object[0]);
        StringBuilder sb = new StringBuilder("getFPInfo time:");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        m.a(sb.toString(), new Object[0]);
        return jSONObject;
    }
}
