package com.iap.ac.config.lite.b;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipay.mobile.verifyidentity.base.message.EnvDataConstants;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.FetchException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class b {
    private static final String b = e.b("ConfigFetchTask");
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    protected ConfigCenterContext f9795a;

    protected b(@NonNull ConfigCenterContext configCenterContext) {
        this.f9795a = configCenterContext;
    }

    @NonNull
    private List<String> b() {
        return Arrays.asList(new String[]{"1002", "6667"});
    }

    @WorkerThread
    @NonNull
    private AmcsConfigRpcResult c(String str, JSONObject jSONObject) throws FetchException {
        try {
            AmcsConfigRpcResult b2 = b(str, jSONObject);
            if (b2 == null) {
                throw new FetchException("rpc_result_is_null");
            } else if (b2.success) {
                return b2;
            } else {
                throw new FetchException(b2.errorCode, b2.errorMessage);
            }
        } catch (Throwable th) {
            throw e.a(th, true);
        }
    }

    @WorkerThread
    @NonNull
    public final AmcsConfigRpcResult a(String str, JSONObject jSONObject) throws FetchException {
        b(KVBuilder.newBuilder());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            AmcsConfigRpcResult c = c(str, jSONObject);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            ACLog.d(b, String.format("[%s] Fetch config success! increment = %s, responseTime = %s, duration = %s.", new Object[]{a(), Boolean.valueOf(c.increment), c.responseTime, Long.valueOf(elapsedRealtime2)}));
            a(KVBuilder.newBuilder().put("version", c.responseTime).put("duration", Long.valueOf(elapsedRealtime2)).put("updateCount", Integer.valueOf(c.updateKeys != null ? c.updateKeys.length() : 0)), c);
            return c;
        } catch (FetchException e) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            ACLog.d(b, String.format("[%s] Fetch config failed! errorCode = %s, errorMessage = %s, duration = %s.", new Object[]{a(), e.errorCode, e.errorMessage, Long.valueOf(elapsedRealtime3)}));
            a(KVBuilder.newBuilder().put("errorCode", e.errorCode).put("errorMessage", e.errorMessage).put("duration", Long.valueOf(elapsedRealtime3)));
            throw e;
        }
    }

    @NonNull
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull KVBuilder kVBuilder);

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult);

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public abstract AmcsConfigRpcResult b(String str, JSONObject jSONObject) throws Exception;

    /* access modifiers changed from: protected */
    public abstract void b(@NonNull KVBuilder kVBuilder);

    public String toString() {
        return String.format("[%s]", new Object[]{a()});
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest, JSONObject jSONObject) {
        if (amcsConfigRpcRequest != null) {
            amcsConfigRpcRequest.tntInstId = this.f9795a.getTntInstId();
            amcsConfigRpcRequest.appId = this.f9795a.getAppId();
            amcsConfigRpcRequest.workspaceId = this.f9795a.getWorkspaceId();
            amcsConfigRpcRequest.addParameters(jSONObject);
        }
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull AmcsConfigRpcV1Request amcsConfigRpcV1Request, JSONObject jSONObject) {
        if (amcsConfigRpcV1Request != null) {
            amcsConfigRpcV1Request.productId = e.a((Iterator<? extends CharSequence>) Arrays.asList(new String[]{this.f9795a.getAppId(), DeviceUtils.PLATFORM_TYPE, this.f9795a.getWorkspaceId()}).iterator(), '_');
            amcsConfigRpcV1Request.utdid = jSONObject.optString("utdid");
            amcsConfigRpcV1Request.reference = jSONObject.optString("reference");
            amcsConfigRpcV1Request.mobileModel = jSONObject.optString("mobileModel");
            amcsConfigRpcV1Request.mobileBrand = jSONObject.optString("mobileBrand");
            amcsConfigRpcV1Request.manufacturer = jSONObject.optString(EnvDataConstants.MANUFACTURER);
            amcsConfigRpcV1Request.osVersion = jSONObject.optString("osVersion");
            amcsConfigRpcV1Request.clientVersion = jSONObject.optString(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_CLIENTVERSION);
            amcsConfigRpcV1Request.business = jSONObject.optString("business", "default");
            amcsConfigRpcV1Request.systemType = jSONObject.optString("systemType");
        }
    }

    /* access modifiers changed from: package-private */
    public void a(@NonNull String str, @Nullable Map<String, String> map) {
        this.f9795a.getConfigMonitor().behavior(str, map);
    }

    public boolean a(@Nullable String str) {
        return b().contains(str);
    }
}
