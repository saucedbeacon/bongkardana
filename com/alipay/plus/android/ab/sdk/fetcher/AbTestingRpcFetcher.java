package com.alipay.plus.android.ab.sdk.fetcher;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.ab.sdk.AbTestingContext;
import com.alipay.plus.android.ab.sdk.facade.request.AbTestingRequest;
import com.alipay.plus.android.ab.sdk.facade.result.AbTestingResponse;
import com.alipay.plus.android.ab.sdk.monitor.AbTestingMonitor;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import java.util.Map;

public class AbTestingRpcFetcher implements AbTestingFetcher {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10728a = e.a("AbTestingRpcFetcher");
    @NonNull
    private AbTestingContext b;

    public AbTestingRpcFetcher(@NonNull AbTestingContext abTestingContext) {
        this.b = abTestingContext;
    }

    private AbTestingRequest a(String str) {
        AbTestingRequest abTestingRequest = new AbTestingRequest();
        abTestingRequest.deviceId = this.b.getDeviceId();
        abTestingRequest.entrance = str;
        abTestingRequest.userId = this.b.getUserId();
        abTestingRequest.condition = this.b.getCondition();
        abTestingRequest.cookie = this.b.getCookie();
        return abTestingRequest;
    }

    private void a(@NonNull KVBuilder kVBuilder) {
        a(AbTestingMonitor.Events.AB_FETCH_START, kVBuilder.build());
    }

    private void a(@NonNull String str, @Nullable Map<String, String> map) {
        this.b.getAbTestingMonitor().behavior(str, map);
    }

    private void b(@NonNull KVBuilder kVBuilder) {
        a(AbTestingMonitor.Events.AB_FETCH_SUCCESS, kVBuilder.build());
    }

    private void c(@NonNull KVBuilder kVBuilder) {
        a(AbTestingMonitor.Events.AB_FETCH_FAILURE, kVBuilder.build());
    }

    @Nullable
    public Map<String, String> getVariation(@NonNull String str, @NonNull String str2) throws FetchException {
        KVBuilder newBuilder = KVBuilder.newBuilder();
        newBuilder.put("source", str);
        newBuilder.put("entrance", str2);
        a(newBuilder);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            AbTestingResponse fetchVariation = this.b.getAbTestingRpcProvider().fetchVariation(a(str2));
            if (fetchVariation.success) {
                KVBuilder newBuilder2 = KVBuilder.newBuilder();
                newBuilder2.put("source", str);
                newBuilder2.put("entrance", str2);
                newBuilder2.put("duration", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                b(newBuilder2);
                return fetchVariation.params;
            }
            throw new FetchException(fetchVariation.errorCode, fetchVariation.errorMessage);
        } catch (Throwable th) {
            LoggerWrapper.e(f10728a, "fetch variation failed", th);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            FetchException a2 = e.a(th, true);
            KVBuilder newBuilder3 = KVBuilder.newBuilder();
            newBuilder3.put("source", str);
            newBuilder3.put("entrance", str2);
            newBuilder3.put("duration", Long.valueOf(elapsedRealtime2));
            newBuilder3.put("errorCode", a2.errorCode);
            newBuilder3.put("errorMessage", a2.errorMessage);
            c(newBuilder3);
            throw a2;
        }
    }
}
