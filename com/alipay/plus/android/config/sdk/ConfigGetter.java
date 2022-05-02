package com.alipay.plus.android.config.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.a.e;
import id.dana.sendmoney.summary.SummaryActivity;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ConfigGetter {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9509a = e.a("ConfigGetter");

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = getConfigInternal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean containsKey(@androidx.annotation.Nullable java.lang.String r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.alibaba.fastjson.JSONObject r1 = r2.getConfigInternal()
            if (r1 == 0) goto L_0x0012
            boolean r3 = r1.containsKey(r3)
            if (r3 == 0) goto L_0x0012
            r3 = 1
            return r3
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.ConfigGetter.containsKey(java.lang.String):boolean");
    }

    public boolean getBoolConfig(@NonNull String str) {
        return getBoolConfig(str, false);
    }

    public boolean getBoolConfig(@NonNull String str, boolean z) {
        Object config = getConfig(str);
        return config == null ? z : config instanceof Boolean ? ((Boolean) config).booleanValue() : config instanceof String ? SummaryActivity.CHECKED.equalsIgnoreCase((String) config) : z;
    }

    @Nullable
    public Object getConfig(@NonNull String str) {
        return getConfig(str, (Object) null);
    }

    @Nullable
    public Object getConfig(@NonNull String str, @Nullable Object obj) {
        JSONObject configInternal = getConfigInternal();
        return (configInternal == null || TextUtils.isEmpty(str)) ? obj : configInternal.get(str);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public abstract JSONObject getConfigInternal();

    @Nullable
    public JSONObject getConfigObject() {
        return getConfigInternal();
    }

    public double getDoubleConfig(@NonNull String str) {
        return getDoubleConfig(str, 0.0d);
    }

    public double getDoubleConfig(@NonNull String str, double d) {
        return getNumberConfig(str, Double.valueOf(d)).doubleValue();
    }

    public float getFloatConfig(@NonNull String str) {
        return getFloatConfig(str, 0.0d);
    }

    public float getFloatConfig(@NonNull String str, double d) {
        return getNumberConfig(str, Double.valueOf(d)).floatValue();
    }

    public int getIntConfig(@NonNull String str) {
        return getIntConfig(str, 0);
    }

    public int getIntConfig(@NonNull String str, int i) {
        return getNumberConfig(str, Integer.valueOf(i)).intValue();
    }

    @Nullable
    public JSONArray getJSONArrayConfig(@NonNull String str) {
        return getJSONArrayConfig(str, (JSONArray) null);
    }

    @Nullable
    public JSONArray getJSONArrayConfig(@NonNull String str, @Nullable JSONArray jSONArray) {
        Object config = getConfig(str);
        return config instanceof JSONArray ? (JSONArray) config : jSONArray;
    }

    @Nullable
    public JSONObject getJSONObjectConfig(@NonNull String str) {
        return getJSONObjectConfig(str, (JSONObject) null);
    }

    @Nullable
    public JSONObject getJSONObjectConfig(@NonNull String str, @Nullable JSONObject jSONObject) {
        Object config = getConfig(str);
        return config instanceof JSONObject ? (JSONObject) config : jSONObject;
    }

    @Nullable
    public ConfigGetter getJSONObjectGetter(@NonNull String str) {
        final JSONObject jSONObjectConfig = getJSONObjectConfig(str);
        if (jSONObjectConfig == null) {
            return null;
        }
        return new ConfigGetter() {
            /* access modifiers changed from: protected */
            public JSONObject getConfigInternal() {
                return jSONObjectConfig;
            }
        };
    }

    public long getLongConfig(@NonNull String str) {
        return getLongConfig(str, 0);
    }

    public long getLongConfig(@NonNull String str, long j) {
        return getNumberConfig(str, Long.valueOf(j)).longValue();
    }

    @NonNull
    public Number getNumberConfig(@NonNull String str) {
        return getNumberConfig(str, 0);
    }

    @NonNull
    public Number getNumberConfig(@NonNull String str, @NonNull Number number) {
        Object config = getConfig(str);
        if (config == null) {
            return number;
        }
        if (config instanceof Number) {
            return (Number) config;
        }
        if (config instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) config));
            } catch (Exception e) {
                LoggerWrapper.d(f9509a, "Take it easy! just parse failed. will use default!", e);
            }
        }
        return number;
    }

    @Nullable
    public String getStringConfig(@NonNull String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1465202272, oncanceled);
            onCancelLoad.getMin(-1465202272, oncanceled);
        }
        return getStringConfig(str, (String) null);
    }

    @Nullable
    public String getStringConfig(@NonNull String str, @Nullable String str2) {
        Object config = getConfig(str);
        return config == null ? str2 : String.valueOf(config);
    }
}
