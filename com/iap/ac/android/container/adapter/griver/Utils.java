package com.iap.ac.android.container.adapter.griver;

import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class Utils {
    private static final String TAG = "Utils";

    public static boolean isGriverContainerInit() {
        return true;
    }

    @Nullable
    public static JSONObject fastJsonToJson(@Nullable com.alibaba.fastjson.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e(TAG, "fastJsonToJson error: ", e);
            return null;
        }
    }

    @Nullable
    public static com.alibaba.fastjson.JSONObject jsonObjectToFastJson(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e(TAG, "jsonObjectToFastJson error: ", e);
            return null;
        }
    }
}
