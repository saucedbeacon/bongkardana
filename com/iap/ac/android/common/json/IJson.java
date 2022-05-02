package com.iap.ac.android.common.json;

import java.lang.reflect.Type;
import org.json.JSONObject;

public interface IJson {
    <T> T fromJson(String str, Class<T> cls);

    <T> T fromJson(String str, Type type);

    <T> T fromJson(JSONObject jSONObject, Class<T> cls);

    String getJsonObjectFieldAsString(String str, String str2);

    String toJson(Object obj);
}
