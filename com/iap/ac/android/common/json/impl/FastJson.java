package com.iap.ac.android.common.json.impl;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.iap.ac.android.common.json.IJson;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.Type;
import org.json.JSONObject;

public class FastJson implements IJson {
    private static final String TAG = "FastJson";

    public FastJson() {
        FastJsonAdapter.adapterToFastjson();
    }

    public String toJson(Object obj) {
        if (obj == null) {
            return null;
        }
        return JSON.toJSONString(obj);
    }

    public <T> T fromJson(String str, Class<T> cls) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return JSON.parseObject(str, cls);
    }

    public <T> T fromJson(String str, Type type) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return JSON.parseObject(str, type, new Feature[0]);
    }

    public <T> T fromJson(JSONObject jSONObject, Class<T> cls) {
        if (jSONObject == null) {
            return null;
        }
        return fromJson(jSONObject.toString(), cls);
    }

    public String getJsonObjectFieldAsString(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return JSON.parseObject(str).getString(str2);
            } catch (Throwable th) {
                ACLog.w(TAG, "getJsonObjectFieldAsString: ".concat(String.valueOf(th)));
            }
        }
        return null;
    }
}
