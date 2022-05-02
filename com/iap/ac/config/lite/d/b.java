package com.iap.ac.config.lite.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.b.c;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.ConfigFetchCallback;
import com.iap.ac.config.lite.fetcher.ConfigNotifyCallback;
import com.iap.ac.config.lite.polling.PollingScheduler;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class b extends c<com.iap.ac.config.lite.b.b> {
    private static final String r = e.b("ConfigFetchByKeyScheduler");
    private boolean p;
    @Nullable
    private ConfigNotifyCallback q;

    private b(@Nullable Map<String, Object> map, @NonNull ConfigCenterContext configCenterContext, @NonNull ConfigFetchCallback configFetchCallback, @Nullable ConfigNotifyCallback configNotifyCallback, @NonNull List<String> list, boolean z) {
        super(map, configCenterContext, configFetchCallback);
        this.q = configNotifyCallback;
        this.p = z;
        ConfigCenter instance = ConfigCenter.getInstance(this.d.getBizCode());
        c cVar = new c(this.d, list);
        com.iap.ac.config.lite.b.e eVar = new com.iap.ac.config.lite.b.e(this.d, list);
        if (e.a(instance)) {
            a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(cVar, a(true)), new PollingScheduler.f(eVar, a(true))});
            return;
        }
        a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(eVar, a(true))});
    }

    @NonNull
    public static b a(@NonNull ConfigCenterContext configCenterContext, @NonNull List<String> list, @Nullable Map<String, Object> map, @NonNull ConfigFetchCallback configFetchCallback, boolean z, @Nullable ConfigNotifyCallback configNotifyCallback) {
        b bVar = new b(map, configCenterContext, configFetchCallback, configNotifyCallback, list, z);
        bVar.e();
        return bVar;
    }

    private JSONObject b(AmcsConfigRpcResult amcsConfigRpcResult) {
        JSONObject jSONObject;
        if (amcsConfigRpcResult == null || (jSONObject = amcsConfigRpcResult.updateKeys) == null) {
            return null;
        }
        return (JSONObject) JsonUtils.fromJson(JsonUtils.toJson(jSONObject), JSONObject.class);
    }

    public int a() {
        return 1;
    }

    public String c() {
        return "ConfigFetchByKeyScheduler";
    }

    public void g() {
        ACLog.i(r, "** Notify all fetch tasks failed.");
        ConfigNotifyCallback configNotifyCallback = this.q;
        if (configNotifyCallback != null) {
            configNotifyCallback.onFetchFailed("Unknown", "All fetch tasks failed.");
        }
    }

    /* access modifiers changed from: protected */
    public String k() {
        return "0";
    }

    /* access modifiers changed from: protected */
    public void a(AmcsConfigRpcResult amcsConfigRpcResult) {
        if (this.p) {
            this.m.onFetchByKeysSuccess(amcsConfigRpcResult);
        }
        ConfigNotifyCallback configNotifyCallback = this.q;
        if (configNotifyCallback != null) {
            configNotifyCallback.onFetchSuccess(b(amcsConfigRpcResult));
        }
    }
}
