package com.alipay.alipaysecuritysdk.common.e;

import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public static JSONArray a(List<Map<String, String>> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null && list.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : list.get(size).entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }
}
