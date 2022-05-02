package com.iap.ac.config.lite;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import id.dana.sendmoney.summary.SummaryActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ConfigGetter {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9790a = e.b("ConfigGetter");

    class a extends ConfigGetter {
        final /* synthetic */ JSONObject b;

        a(ConfigGetter configGetter, JSONObject jSONObject) {
            this.b = jSONObject;
        }

        /* access modifiers changed from: protected */
        public JSONObject getConfigInternal() {
            return this.b;
        }
    }

    public boolean containsKey(@Nullable String str) {
        JSONObject configInternal;
        if (str == null || (configInternal = getConfigInternal()) == null || !configInternal.has(str)) {
            return false;
        }
        return true;
    }

    public boolean getBoolConfig(@NonNull String str) {
        return getBoolConfig(str, false);
    }

    @Nullable
    public Object getConfig(@NonNull String str) {
        return getConfig(str, (Object) null);
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

    public float getFloatConfig(@NonNull String str) {
        return getFloatConfig(str, 0.0d);
    }

    public int getIntConfig(@NonNull String str) {
        return getIntConfig(str, 0);
    }

    @Nullable
    public JSONArray getJSONArrayConfig(@NonNull String str) {
        return getJSONArrayConfig(str, (JSONArray) null);
    }

    @Nullable
    public JSONObject getJSONConfig(@NonNull String str) {
        return getJSONConfig(str, (JSONObject) null);
    }

    public long getLongConfig(@NonNull String str) {
        return getLongConfig(str, 0);
    }

    @Nullable
    public ConfigGetter getMapGetter(@NonNull String str) {
        JSONObject jSONConfig = getJSONConfig(str);
        if (jSONConfig == null) {
            return null;
        }
        return new a(this, jSONConfig);
    }

    @NonNull
    public Number getNumberConfig(@NonNull String str) {
        return getNumberConfig(str, 0);
    }

    @Nullable
    public String getStringConfig(@NonNull String str) {
        return getStringConfig(str, (String) null);
    }

    public boolean getBoolConfig(@NonNull String str, boolean z) {
        Object config = getConfig(str);
        if (config == null) {
            return z;
        }
        if (config instanceof Boolean) {
            return ((Boolean) config).booleanValue();
        }
        return config instanceof String ? SummaryActivity.CHECKED.equalsIgnoreCase((String) config) : z;
    }

    @Nullable
    public Object getConfig(@NonNull String str, @Nullable Object obj) {
        JSONObject configInternal = getConfigInternal();
        if (configInternal != null && !TextUtils.isEmpty(str)) {
            try {
                return configInternal.get(str);
            } catch (JSONException unused) {
            }
        }
        return obj;
    }

    public double getDoubleConfig(@NonNull String str, double d) {
        return getNumberConfig(str, Double.valueOf(d)).doubleValue();
    }

    public float getFloatConfig(@NonNull String str, double d) {
        return getNumberConfig(str, Double.valueOf(d)).floatValue();
    }

    public int getIntConfig(@NonNull String str, int i) {
        return getNumberConfig(str, Integer.valueOf(i)).intValue();
    }

    @Nullable
    public JSONArray getJSONArrayConfig(@NonNull String str, @Nullable JSONArray jSONArray) {
        Object config = getConfig(str);
        return config instanceof JSONArray ? (JSONArray) config : jSONArray;
    }

    @Nullable
    public JSONObject getJSONConfig(@NonNull String str, @Nullable JSONObject jSONObject) {
        Object config = getConfig(str);
        return config instanceof JSONObject ? (JSONObject) config : jSONObject;
    }

    public long getLongConfig(@NonNull String str, long j) {
        return getNumberConfig(str, Long.valueOf(j)).longValue();
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
                ACLog.d(f9790a, "Take it easy! just parse failed. will use default!", e);
            }
        }
        return number;
    }

    @Nullable
    public String getStringConfig(@NonNull String str, @Nullable String str2) {
        Object config = getConfig(str);
        if (config == null) {
            return str2;
        }
        if (config instanceof String) {
            return (String) config;
        }
        if (config instanceof Number) {
            return String.valueOf(config);
        }
        return JsonUtils.toJson(config);
    }
}
