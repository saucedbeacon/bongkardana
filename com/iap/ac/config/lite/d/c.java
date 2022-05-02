package com.iap.ac.config.lite.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.b.b;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.ConfigFetchCallback;
import com.iap.ac.config.lite.fetcher.FetchException;
import com.iap.ac.config.lite.polling.PollingScheduler;
import java.util.Map;

public abstract class c<T extends b> extends PollingScheduler<T> {

    /* renamed from: o  reason: collision with root package name */
    private static final String f9801o = e.b("FetchScheduler");
    @NonNull
    protected final ConfigFetchCallback m;
    @Nullable
    protected Map<String, Object> n;

    protected c(@Nullable Map<String, Object> map, @NonNull ConfigCenterContext configCenterContext, @NonNull ConfigFetchCallback configFetchCallback) {
        super(configCenterContext);
        this.n = map;
        this.m = configFetchCallback;
    }

    /* access modifiers changed from: protected */
    public abstract void a(AmcsConfigRpcResult amcsConfigRpcResult);

    public void f() {
        if (this.g > 0) {
            this.d.getConfigMonitor().behavior("config_update_retry", KVBuilder.newBuilder().put("retryCount", Integer.valueOf(this.f)).build());
        }
    }

    /* access modifiers changed from: protected */
    public abstract String k();

    public long a(boolean z) {
        long random;
        long j;
        if (z) {
            random = (long) (Math.random() * 3000.0d);
            j = 5000;
        } else {
            random = (long) (Math.random() * 45000.0d);
            j = 45000;
        }
        return random + j;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public boolean a(@NonNull b bVar) {
        ACLog.i(f9801o, String.format("[%s] Will do task now! mCurrentTaskIndex = %s", new Object[]{bVar.a(), Integer.valueOf(this.g)}));
        try {
            AmcsConfigRpcResult a2 = bVar.a(k(), e.a(this.d, this.n));
            if (isCanceled()) {
                ACLog.w(f9801o, "Scheduler already canceled. will skip notify success.");
                return false;
            }
            a(a2);
            return true;
        } catch (FetchException e) {
            ACLog.e(f9801o, String.format("[%s] Fetch failed! mCurrentTaskIndex = %s, error: %s", new Object[]{bVar.a(), Integer.valueOf(this.g), e}));
            String str = e.errorCode;
            if (bVar.a(str)) {
                ACLog.d(f9801o, String.format("** isRequestLimited! task = %s, errorCode = %s.", new Object[]{bVar.a(), str}));
                this.d.getConfigMonitor().behavior("config_rate_limited", KVBuilder.newBuilder().put("code", str).build());
                g();
            }
            return false;
        }
    }
}
