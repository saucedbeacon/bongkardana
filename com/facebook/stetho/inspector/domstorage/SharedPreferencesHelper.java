package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

public class SharedPreferencesHelper {
    private static final String PREFS_SUFFIX = ".xml";

    private SharedPreferencesHelper() {
    }

    public static List<String> getSharedPreferenceTags(Context context) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append("/shared_prefs");
        File file = new File(sb.toString());
        if (file.exists()) {
            for (File name : file.listFiles()) {
                String name2 = name.getName();
                if (name2.endsWith(PREFS_SUFFIX)) {
                    arrayList.add(name2.substring(0, name2.length() - 4));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static String valueToString(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Set)) {
            return obj.toString();
        }
        JSONArray jSONArray = new JSONArray();
        for (String put : (Set) obj) {
            jSONArray.put(put);
        }
        return jSONArray.toString();
    }

    @Nullable
    public static Object valueFromString(String str, Object obj) throws IllegalArgumentException {
        if (obj instanceof Integer) {
            return Integer.valueOf(Integer.parseInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(Long.parseLong(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf(Float.parseFloat(str));
        }
        if (obj instanceof Boolean) {
            return parseBoolean(str);
        }
        if (obj instanceof String) {
            return str;
        }
        if (obj instanceof Set) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                HashSet hashSet = new HashSet(length);
                for (int i = 0; i < length; i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                return hashSet;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            StringBuilder sb = new StringBuilder("Unsupported type: ");
            sb.append(obj.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private static Boolean parseBoolean(String str) throws IllegalArgumentException {
        if ("1".equals(str) || SummaryActivity.CHECKED.equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("0".equals(str) || "false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        throw new IllegalArgumentException("Expected boolean, got ".concat(String.valueOf(str)));
    }
}
