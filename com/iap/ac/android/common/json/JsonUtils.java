package com.iap.ac.android.common.json;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.iap.ac.android.common.json.impl.GsonAdapter;
import com.iap.ac.android.common.log.ACLog;
import java.lang.reflect.Type;
import org.json.JSONObject;

public class JsonUtils {
    private static final IJson DEFAULT_JSON_UTIL;
    private static final String NO_JSON_IMPL_MESSAGE = "Cannot find json parser. Please import gson library to your project or invoke JsonUtils.setJsonParser(IJson iJson) to set your own json parser.";
    private static final String TAG = "JsonUtils";
    private static IJson iJson;

    static {
        AnonymousClass1 r0 = new IJson() {
            public final String toJson(Object obj) {
                if (JsonUtils.checkGsonExists()) {
                    return GsonAdapter.gson().toJson(obj);
                }
                ACLog.e(JsonUtils.TAG, JsonUtils.NO_JSON_IMPL_MESSAGE);
                return null;
            }

            public final <T> T fromJson(String str, Class<T> cls) {
                if (JsonUtils.checkGsonExists()) {
                    return GsonAdapter.gson().fromJson(str, cls);
                }
                ACLog.e(JsonUtils.TAG, JsonUtils.NO_JSON_IMPL_MESSAGE);
                return null;
            }

            public final <T> T fromJson(String str, Type type) {
                if (JsonUtils.checkGsonExists()) {
                    return GsonAdapter.gson().fromJson(str, type);
                }
                ACLog.e(JsonUtils.TAG, JsonUtils.NO_JSON_IMPL_MESSAGE);
                return null;
            }

            public final <T> T fromJson(JSONObject jSONObject, Class<T> cls) {
                if (!JsonUtils.checkGsonExists()) {
                    ACLog.e(JsonUtils.TAG, JsonUtils.NO_JSON_IMPL_MESSAGE);
                    return null;
                } else if (jSONObject == null) {
                    return null;
                } else {
                    return GsonAdapter.gson().fromJson(new JsonParser().parse(jSONObject.toString()), cls);
                }
            }

            public final String getJsonObjectFieldAsString(String str, String str2) {
                if (JsonUtils.checkGsonExists()) {
                    JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
                    if (asJsonObject == null || !asJsonObject.has(str2)) {
                        return null;
                    }
                    return asJsonObject.get(str2).toString();
                }
                ACLog.e(JsonUtils.TAG, JsonUtils.NO_JSON_IMPL_MESSAGE);
                return null;
            }
        };
        DEFAULT_JSON_UTIL = r0;
        iJson = r0;
    }

    /* access modifiers changed from: private */
    public static boolean checkGsonExists() {
        try {
            return Class.forName("com.google.gson.Gson") != null;
        } catch (ClassNotFoundException e) {
            ACLog.e(TAG, "Gson library not found.", e);
            return false;
        }
    }

    public static String toJson(Object obj) {
        return iJson.toJson(obj);
    }

    public static <T> T fromJson(String str, Class<T> cls) {
        return iJson.fromJson(str, cls);
    }

    public static <T> T fromJson(String str, Type type) {
        return iJson.fromJson(str, type);
    }

    public static <T> T fromJson(JSONObject jSONObject, Class<T> cls) {
        return iJson.fromJson(jSONObject, cls);
    }

    public static String getJsonObjectFieldAsString(String str, String str2) {
        return iJson.getJsonObjectFieldAsString(str, str2);
    }

    public static void setJsonParser(IJson iJson2) {
        if (iJson2 != null) {
            iJson = iJson2;
        }
    }

    public static IJson getJsonParser() {
        return iJson;
    }
}
