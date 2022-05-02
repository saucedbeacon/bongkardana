package com.alipay.mobile.verifyidentity.uitools;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static String getString(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? jSONObject.optString(str) : "";
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.getJSONArray(str);
        }
        return null;
    }
}
