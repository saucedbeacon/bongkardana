package com.iap.ac.android.acs.plugin.utils;

import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utils {
    private static final String TAG = "IAPConnectPlugin";

    private Utils() {
    }

    public static Map<String, String> json2StringMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            ACLog.e("IAPConnectPlugin", "Utils#json2StringMap, json is null");
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.optString(next));
        }
        ACLog.d("IAPConnectPlugin", "Utils#json2StringMap, result: ".concat(String.valueOf(hashMap)));
        return hashMap;
    }

    public static JSONObject stringMap2Json(Map<String, String> map) throws JSONException {
        if (map == null || map.isEmpty()) {
            ACLog.e("IAPConnectPlugin", "Utils#stringMap2Json, string map is empty");
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            jSONObject.put((String) next.getKey(), next.getValue());
        }
        ACLog.d("IAPConnectPlugin", "Utils#stringMap2Json, result: ".concat(String.valueOf(jSONObject)));
        return jSONObject;
    }

    public static List<String> jsonArray2StringList(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            ACLog.e("IAPConnectPlugin", "Utils#jsonArray2StringList, json array is empty");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.optString(i));
        }
        ACLog.d("IAPConnectPlugin", "Utils#jsonArray2StringList, result:".concat(String.valueOf(arrayList)));
        return arrayList;
    }

    public static JSONArray stringList2JsonArray(List<String> list) {
        if (list == null || list.isEmpty()) {
            ACLog.e("IAPConnectPlugin", "Utils#stringList2JsonArray, string list is empty");
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        ACLog.d("IAPConnectPlugin", "Utils#stringList2JsonArray, result: ".concat(String.valueOf(jSONArray)));
        return jSONArray;
    }
}
