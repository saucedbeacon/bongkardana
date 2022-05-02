package com.iap.ac.config.lite.a;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import com.iap.ac.config.lite.dns.lookup.f;
import com.iap.ac.config.lite.dns.lookup.i;
import com.iap.ac.config.lite.dns.lookup.j;
import com.iap.ac.config.lite.dns.lookup.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class a {
    private static final String e = e.b("RetrieveDnsTask");

    /* renamed from: a  reason: collision with root package name */
    private String f9794a;
    @NonNull
    private ConfigCenterContext b;
    private long c = 0;
    private f d;

    public a(@NonNull ConfigCenterContext configCenterContext) {
        this.b = configCenterContext;
        StringBuilder sb = new StringBuilder();
        sb.append(d());
        sb.append(".amcstxt.alipay.com.");
        this.f9794a = sb.toString();
    }

    private synchronized void c() throws Exception {
        if (this.d == null) {
            f fVar = new f(this.f9794a);
            this.d = fVar;
            fVar.a(new j(this.b.getDnsServer()));
        }
    }

    private String d() {
        StringBuilder sb = new StringBuilder(this.b.getAppId());
        sb.append("-");
        sb.append(TextUtils.isEmpty(this.b.getTntInstId()) ? "alipw3sg" : this.b.getTntInstId());
        sb.append("-");
        sb.append(TextUtils.isEmpty(this.b.getWorkspaceId()) ? "default" : this.b.getWorkspaceId());
        return sb.toString().replaceAll("_", "-");
    }

    private List<String> e() throws Exception {
        ArrayList arrayList = new ArrayList();
        c();
        try {
            List<i> a2 = this.d.a();
            if (a2 != null) {
                Iterator<i> it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.addAll(((k) it.next()).c());
                }
            }
        } catch (Exception e2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.c > 1800000) {
                this.c = elapsedRealtime;
                this.b.getConfigMonitor().behavior(ConfigMonitor.Events.CONFIG_DNS_CHECK_FAILED, KVBuilder.newBuilder().put("host", this.f9794a).put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, e2.getMessage()).build());
            }
        }
        return arrayList;
    }

    public String a() {
        return this.f9794a;
    }

    public long b() throws Exception {
        long j;
        ACLog.d(e, String.format("start dns check for [%s]", new Object[]{this.f9794a}));
        List<String> e2 = e();
        long j2 = 0;
        if (e2 != null) {
            long j3 = 0;
            for (String parseLong : e2) {
                try {
                    j = Long.parseLong(parseLong);
                } catch (NumberFormatException unused) {
                    j = 0;
                }
                if (j > j3) {
                    j3 = j;
                }
            }
            j2 = j3;
        }
        ACLog.i(e, String.format(Locale.US, "success get DNS for [%s],value is [%d]", new Object[]{this.f9794a, Long.valueOf(j2)}));
        return j2;
    }
}
