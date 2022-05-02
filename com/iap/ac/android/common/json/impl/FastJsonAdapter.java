package com.iap.ac.android.common.json.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ListSerializer;
import com.alibaba.fastjson.serializer.MapSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FastJsonAdapter {
    public static void adapterToFastjson() {
        SerializeConfig globalInstance = SerializeConfig.getGlobalInstance();
        ParserConfig globalInstance2 = ParserConfig.getGlobalInstance();
        globalInstance.put(JSONObject.class, new OrgJsonObjectSerializer());
        globalInstance.put(JSONArray.class, new OrgJsonArraySerializer());
        globalInstance2.putDeserializer(JSONObject.class, new OrgJsonObjectDeserializer());
        globalInstance2.putDeserializer(JSONArray.class, new OrgJsonArrayDeserializer());
    }

    static class OrgJsonObjectSerializer implements ObjectSerializer {
        @NonNull
        private final MapSerializer mapSerializer;

        private OrgJsonObjectSerializer() {
            this.mapSerializer = new MapSerializer();
        }

        @Nullable
        private static Map<String, Object> json2Map(@Nullable JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            HashMap hashMap = new HashMap(jSONObject.length());
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = jSONObject.opt(next);
                if (!(opt == null || opt == JSONObject.NULL)) {
                    hashMap.put(next, opt);
                }
            }
            return hashMap;
        }

        public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
            if (obj == null) {
                jSONSerializer.out.writeNull();
                return;
            }
            this.mapSerializer.write(jSONSerializer, json2Map((JSONObject) obj), obj2, new TypeReference<Map<String, Object>>() {
            }.getType());
        }
    }

    static class OrgJsonObjectDeserializer implements ObjectDeserializer {
        private OrgJsonObjectDeserializer() {
        }

        public JSONObject deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
            String str = (String) defaultJSONParser.parseObject(String.class);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    static class OrgJsonArraySerializer implements ObjectSerializer {
        @NonNull
        private final ListSerializer listSerializer;

        private OrgJsonArraySerializer() {
            this.listSerializer = new ListSerializer();
        }

        public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
            if (obj == null) {
                jSONSerializer.out.writeNull();
                return;
            }
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object opt = jSONArray.opt(i);
                if (opt == JSONObject.NULL) {
                    arrayList.add((Object) null);
                } else {
                    arrayList.add(opt);
                }
            }
            this.listSerializer.write(jSONSerializer, arrayList, obj2, new TypeReference<ArrayList<Object>>() {
            }.getType());
        }
    }

    static class OrgJsonArrayDeserializer implements ObjectDeserializer {
        private OrgJsonArrayDeserializer() {
        }

        public JSONArray deserialze(DefaultJSONParser defaultJSONParser, Type type, Object obj) {
            String str = (String) defaultJSONParser.parseObject(String.class);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new JSONArray(str);
            } catch (JSONException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
