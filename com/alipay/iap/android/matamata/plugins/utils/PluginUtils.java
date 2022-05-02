package com.alipay.iap.android.matamata.plugins.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.facebook.flipper.core.FlipperArray;
import com.facebook.flipper.core.FlipperObject;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class PluginUtils {
    @Nullable
    public static FlipperObject convertFlipperObject(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return convertFlipperObject((JSONObject) obj);
        }
        try {
            return convertFlipperObject(JSON.parseObject(JSON.toJSONString(obj)));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static FlipperObject convertFlipperObject(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        FlipperObject.setMax setmax = new FlipperObject.setMax();
        for (Map.Entry next : jSONObject.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof JSONObject) {
                setmax.setMax(str, convertFlipperObject((JSONObject) value));
            } else if (value instanceof JSONArray) {
                setmax.getMin(str, convertFlipperArray((JSONArray) value));
            } else {
                setmax.setMax(str, value);
            }
        }
        return new FlipperObject(setmax.getMax);
    }

    @Nullable
    public static FlipperArray convertFlipperArray(@Nullable List list) {
        if (list == null) {
            return null;
        }
        FlipperArray.getMax getmax = new FlipperArray.getMax();
        for (Object next : list) {
            if (next instanceof JSONObject) {
                FlipperObject convertFlipperObject = convertFlipperObject((JSONObject) next);
                getmax.getMax.put(convertFlipperObject == null ? null : convertFlipperObject.setMax);
            } else if (next instanceof JSONArray) {
                FlipperArray convertFlipperArray = convertFlipperArray((JSONArray) next);
                getmax.getMax.put(convertFlipperArray == null ? null : convertFlipperArray.setMax);
            } else if (next instanceof CharSequence) {
                getmax.getMax.put(next.toString());
            } else if (next instanceof Boolean) {
                getmax.getMax.put((Boolean) next);
            } else if (next instanceof Integer) {
                getmax.getMax.put((Integer) next);
            } else if (next instanceof Long) {
                getmax.getMax.put((Long) next);
            } else if (next instanceof Float) {
                Float f = (Float) next;
                org.json.JSONArray jSONArray = getmax.getMax;
                if (Float.isNaN(f.floatValue())) {
                    f = null;
                }
                jSONArray.put(f);
            } else if (next instanceof Double) {
                Double d = (Double) next;
                org.json.JSONArray jSONArray2 = getmax.getMax;
                if (Double.isNaN(d.doubleValue())) {
                    d = null;
                }
                jSONArray2.put(d);
            } else {
                FlipperObject convertFlipperObject2 = convertFlipperObject(next);
                getmax.getMax.put(convertFlipperObject2 == null ? null : convertFlipperObject2.setMax);
            }
        }
        return new FlipperArray(getmax.getMax);
    }
}
