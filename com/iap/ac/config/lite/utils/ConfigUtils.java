package com.iap.ac.config.lite.utils;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.config.ACConfig;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.c.e;
import org.json.JSONObject;

public class ConfigUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9830a = e.b("ConfigUtils");

    static class a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f9831a;

        a(Runnable runnable) {
            this.f9831a = runnable;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Void doInBackground(Void... voidArr) {
            this.f9831a.run();
            return null;
        }
    }

    public static <T> T deepCopyObject(T t) {
        if (t == null) {
            return null;
        }
        try {
            return JsonUtils.fromJson(JsonUtils.toJson(t), t.getClass());
        } catch (Exception e) {
            ACLog.e(f9830a, "deep copy object failed!", e);
            return null;
        }
    }

    @SuppressLint({"StaticFieldLeak"})
    public static void doAsyncTask(@NonNull Runnable runnable) {
        new a(runnable).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
    }

    @NonNull
    public static String formatConfigVersionWithTime(long j) {
        return String.format("%s [ %s ]", new Object[]{Long.valueOf(j), e.a(j)});
    }

    @NonNull
    public static JSONObject kv(@NonNull String str, @Nullable Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static double parseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable unused) {
            ACLog.w(f9830a, String.format("Cannot parse %s to double!", new Object[]{str}));
            return d;
        }
    }

    public static long parseLong(String str, long j) {
        try {
            return (long) Double.parseDouble(str);
        } catch (Throwable unused) {
            ACLog.w(f9830a, String.format("Cannot parse %s to long!", new Object[]{str}));
            return j;
        }
    }

    public static void setConfigProxy() {
        setConfigProxy((String) null);
    }

    @Nullable
    public static String toJSONString(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return JsonUtils.toJson(obj);
        } catch (Throwable th) {
            String str = f9830a;
            StringBuilder sb = new StringBuilder("toJSONString failed. error = ");
            sb.append(th.getMessage());
            ACLog.e(str, sb.toString());
            return null;
        }
    }

    public static void setConfigProxy(String str) {
        if (TextUtils.isEmpty(str)) {
            ACConfig.setConfigImpl(ConfigProxy.newInstance());
        } else {
            ACConfig.setConfigImpl(ConfigProxy.newInstance(str), str);
        }
    }
}
