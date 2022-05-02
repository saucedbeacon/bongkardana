package com.iap.ac.android.common.json.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class GsonAdapter {
    @Nullable
    private static Gson iGson;

    @NonNull
    public static Gson gson() {
        if (iGson == null) {
            iGson = new GsonBuilder().disableHtmlEscaping().registerTypeAdapter(JSONObject.class, JSONObjectAdapter.sInstance).registerTypeAdapter(JSONArray.class, JSONArrayAdapter.sInstance).create();
        }
        return iGson;
    }

    static class JSONObjectAdapter implements JsonSerializer<JSONObject>, JsonDeserializer<JSONObject> {
        public static final JSONObjectAdapter sInstance = new JSONObjectAdapter();

        private JSONObjectAdapter() {
        }

        public JsonElement serialize(JSONObject jSONObject, Type type, JsonSerializationContext jsonSerializationContext) {
            if (jSONObject == null) {
                return null;
            }
            JsonObject jsonObject = new JsonObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                jsonObject.add(next, jsonSerializationContext.serialize(opt, opt.getClass()));
            }
            return jsonObject;
        }

        public JSONObject deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement == null) {
                return null;
            }
            try {
                return new JSONObject(jsonElement.toString());
            } catch (JSONException e) {
                throw new JsonParseException((Throwable) e);
            }
        }
    }

    static class JSONArrayAdapter implements JsonSerializer<JSONArray>, JsonDeserializer<JSONArray> {
        public static final JSONArrayAdapter sInstance = new JSONArrayAdapter();

        private JSONArrayAdapter() {
        }

        public JsonElement serialize(JSONArray jSONArray, Type type, JsonSerializationContext jsonSerializationContext) {
            if (jSONArray == null) {
                return null;
            }
            JsonArray jsonArray = new JsonArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                Object opt = jSONArray.opt(i);
                jsonArray.add(jsonSerializationContext.serialize(opt, opt.getClass()));
            }
            return jsonArray;
        }

        public JSONArray deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            if (jsonElement == null) {
                return null;
            }
            try {
                return new JSONArray(jsonElement.toString());
            } catch (JSONException e) {
                throw new JsonParseException((Throwable) e);
            }
        }
    }
}
