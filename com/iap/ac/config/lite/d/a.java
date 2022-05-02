package com.iap.ac.config.lite.d;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.ConfigGetter;
import com.iap.ac.config.lite.b.b;
import com.iap.ac.config.lite.b.d;
import com.iap.ac.config.lite.b.f;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.ConfigFetchCallback;
import com.iap.ac.config.lite.polling.PollingScheduler;
import java.util.Map;

public class a extends c<b> {
    private static final String s = e.b("ConfigFetchAllScheduler");
    private long p;
    @Nullable
    private String q;
    @Nullable
    private String r;

    private a(@Nullable Map<String, Object> map, @NonNull ConfigCenterContext configCenterContext, long j, @Nullable String str, @NonNull ConfigFetchCallback configFetchCallback) {
        super(map, configCenterContext, configFetchCallback);
        this.q = str;
        this.p = j;
        l();
    }

    @NonNull
    public static a a(@NonNull ConfigCenterContext configCenterContext, long j, @Nullable String str, @Nullable Map<String, Object> map, @NonNull ConfigFetchCallback configFetchCallback) {
        a aVar = new a(map, configCenterContext, j, str, configFetchCallback);
        aVar.e();
        return aVar;
    }

    private void l() {
        ConfigCenter instance = ConfigCenter.getInstance(this.d.getBizCode());
        ConfigGetter sectionConfigGetter = instance.getSectionConfigGetter("amcs");
        String stringConfig = sectionConfigGetter != null ? sectionConfigGetter.getStringConfig("encryptStatus") : null;
        long a2 = a(true);
        long a3 = a(false);
        if (e.a(instance)) {
            d dVar = new d(this.d);
            a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(dVar, a2), new PollingScheduler.f(dVar, a3), new PollingScheduler.f(new f(this.d), a3)});
            return;
        }
        f fVar = new f(this.d, true);
        f fVar2 = new f(this.d);
        if ("MIXED".equals(stringConfig)) {
            a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(fVar, a2), new PollingScheduler.f(fVar2, a3)});
        } else if ("ENCRYPT".equals(stringConfig)) {
            a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(fVar, a2), new PollingScheduler.f(fVar, a3)});
        } else {
            a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(fVar2, a2), new PollingScheduler.f(fVar2, a3)});
        }
    }

    public String c() {
        return "ConfigFetchAllScheduler";
    }

    public void g() {
        ACLog.i(s, "** Notify all fetch tasks failed.");
        if (!isCanceled()) {
            this.m.onFetchFailed("Unknown", "All fetch tasks failed.");
            cancel();
            return;
        }
        ACLog.w(s, "Scheduler already canceled. will skip notify failure.");
    }

    /* access modifiers changed from: protected */
    public String k() {
        String json = JsonUtils.toJson(e.a(this.d, this.n));
        this.r = json;
        return TextUtils.equals(this.q, json) ? String.valueOf(this.p) : "0";
    }

    public int a() {
        ConfigGetter sectionConfigGetter = ConfigCenter.getInstance(this.d.getBizCode()).getSectionConfigGetter("amcs");
        int i = 10;
        if (sectionConfigGetter != null) {
            i = sectionConfigGetter.getIntConfig("refreshMaxCount", 10);
        }
        ACLog.i(s, "refreshMaxCount = ".concat(String.valueOf(i)));
        return i;
    }

    /* access modifiers changed from: protected */
    public void a(AmcsConfigRpcResult amcsConfigRpcResult) {
        this.m.onFetchSuccess(amcsConfigRpcResult, this.r);
    }
}
