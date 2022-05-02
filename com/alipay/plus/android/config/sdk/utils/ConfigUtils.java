package com.alipay.plus.android.config.sdk.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.config.ConfigProxy;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.AmcsConfigProvider;
import java.util.HashMap;
import java.util.Map;

public class ConfigUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9516a = e.a("ConfigUtils");

    @Nullable
    public static Map<String, String> convertToStringMap(@Nullable Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            Object value = next.getValue();
            hashMap.put(next.getKey(), value instanceof String ? (String) value : String.valueOf(value));
        }
        return hashMap;
    }

    @NonNull
    public static String formatConfigVersionWithTime(long j) {
        return String.format("%s [ %s ]", new Object[]{Long.valueOf(j), e.a(j)});
    }

    public static int getBase64Percent(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return 100;
        }
        try {
            int length = str.length();
            if (length >= 2) {
                int i = length - 1;
                int i2 = 0;
                char charAt = str.subSequence(length - 2, i).charAt(0);
                char charAt2 = str.subSequence(i, length).charAt(0);
                int indexOf = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(charAt) >= 0 ? "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(charAt) : 0;
                if ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(charAt2) >= 0) {
                    i2 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ+/".indexOf(charAt2);
                }
                return ((indexOf * 64) + i2) % 100;
            }
        } catch (Throwable th) {
            String str2 = f9516a;
            StringBuilder sb = new StringBuilder("getBase64Percent error: ");
            sb.append(th.getMessage());
            LoggerWrapper.e(str2, sb.toString());
        }
        return 100;
    }

    @Nullable
    public static JSONArray getJSONArraySafe(@NonNull JSONObject jSONObject, @NonNull String str) {
        try {
            return jSONObject.getJSONArray(str);
        } catch (Throwable unused) {
            LoggerWrapper.w(f9516a, "Take it easy, can not get JSONArray of key: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    public static JSONObject getJSONObjectSafe(@NonNull JSONObject jSONObject, @NonNull String str) {
        try {
            return jSONObject.getJSONObject(str);
        } catch (Throwable unused) {
            LoggerWrapper.w(f9516a, "Take it easy, can not get JSONObject of key: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static boolean isDeviceHitRate(@Nullable Integer num, @Nullable ConfigCenterContext configCenterContext) {
        if (!(configCenterContext == null || num == null)) {
            int base64Percent = getBase64Percent(configCenterContext.getIdentifierProvider().getUtdId(configCenterContext.getContext()));
            LoggerWrapper.d(f9516a, String.format("Calc percent = %s, node.rate = %s", new Object[]{Integer.valueOf(base64Percent), num}));
            if (base64Percent < num.intValue()) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static JSONObject kv(@NonNull String str, @Nullable Object obj) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, obj);
        return jSONObject;
    }

    public static double parseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            LoggerWrapper.w(f9516a, String.format("Cannot parse %s to double!", new Object[]{str}));
            return d;
        }
    }

    public static long parseLong(String str, long j) {
        try {
            return (long) Double.parseDouble(str);
        } catch (Throwable unused) {
            LoggerWrapper.w(f9516a, String.format("Cannot parse %s to long!", new Object[]{str}));
            return j;
        }
    }

    public static void setupToConfigProxy() {
        ConfigProxy.getInstance().setConfigProvider(new AmcsConfigProvider());
    }

    @Nullable
    public static String toJSONString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable th) {
            String str = f9516a;
            StringBuilder sb = new StringBuilder("toJSONString failed. error = ");
            sb.append(th.getMessage());
            LoggerWrapper.e(str, sb.toString());
            return null;
        }
    }
}
