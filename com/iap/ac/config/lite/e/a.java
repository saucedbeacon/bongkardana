package com.iap.ac.config.lite.e;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.ConfigGetter;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import com.iap.ac.config.lite.polling.PollingScheduler;

public class a extends PollingScheduler<com.iap.ac.config.lite.a.a> {
    private static final String m = e.b("DnsCheckScheduler");

    private a(@NonNull ConfigCenterContext configCenterContext) {
        super(configCenterContext);
        a((PollingScheduler.f<T>[]) new PollingScheduler.f[]{new PollingScheduler.f(new com.iap.ac.config.lite.a.a(configCenterContext), a(true))});
    }

    private long l() {
        ConfigGetter sectionConfigGetter;
        ConfigCenter instance = ConfigCenter.getInstance(this.d.getBizCode());
        if (!instance.isInitialized() || (sectionConfigGetter = instance.getSectionConfigGetter("amcs")) == null) {
            return 0;
        }
        return (long) sectionConfigGetter.getIntConfig(AmcsConstants.AMCS_SYNC_INTERVAL, 300);
    }

    public String c() {
        return "DnsCheckScheduler";
    }

    public void f() {
        ACLog.d(m, "start dns check");
    }

    public void g() {
        if (a() > 0) {
            this.f = 0;
            this.g = 0;
            a(a(false));
        }
    }

    public boolean k() {
        return l() > 0;
    }

    public static a a(@NonNull ConfigCenterContext configCenterContext) {
        return new a(configCenterContext);
    }

    /* access modifiers changed from: protected */
    public boolean a(@NonNull com.iap.ac.config.lite.a.a aVar) {
        try {
            long b = aVar.b();
            ConfigCenter instance = ConfigCenter.getInstance(this.d.getBizCode());
            if (!instance.newerThanLocalVersion(b)) {
                return false;
            }
            KVBuilder newBuilder = KVBuilder.newBuilder();
            newBuilder.put("newVersion", Long.valueOf(b));
            newBuilder.put("host", aVar.a());
            this.d.getConfigMonitor().behavior(ConfigMonitor.Events.CONFIG_UPDATE_BY_DNS, newBuilder.build());
            instance.refreshConfig();
            return false;
        } catch (Exception e) {
            ACLog.e(m, "failed to retrieve dns", e);
            return false;
        }
    }

    public long a(boolean z) {
        long l = l();
        if (l == 0) {
            return -1;
        }
        return l * 1000;
    }

    public int a() {
        return l() > 0 ? Integer.MAX_VALUE : 0;
    }
}
