package com.alipay.plus.android.config.sdk.retry;

import android.os.AsyncTask;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.delegate.ConfigMonitor;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.ConfigNotifyCallback;

public class d extends AsyncTask<AmcsConfigByKeysLiteRpcRequest, Object, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9515a = e.a("FetchAppsTask");
    @Nullable
    private ConfigNotifyCallback b;
    private ConfigMonitor c = ConfigCenter.getInstance().getConfigContext().getConfigMonitor();
    private ConfigCenterContext d = ConfigCenter.getInstance().getConfigContext();

    private d(@Nullable ConfigNotifyCallback configNotifyCallback) {
        this.b = configNotifyCallback;
    }

    private AmcsConfigRpcResult a() {
        AmcsConfigRpcResult amcsConfigRpcResult = new AmcsConfigRpcResult();
        amcsConfigRpcResult.success = false;
        amcsConfigRpcResult.errorCode = "UNKNOWN";
        return amcsConfigRpcResult;
    }

    public static d a(ConfigNotifyCallback configNotifyCallback) {
        return new d(configNotifyCallback);
    }

    private void a(KVBuilder kVBuilder) {
        ConfigMonitor configMonitor = this.c;
        if (configMonitor != null) {
            configMonitor.behavior(ConfigMonitor.Events.CONFIG_FETCH_LITE_APPS_FAILURE, kVBuilder.build());
        }
    }

    private void b(KVBuilder kVBuilder) {
        ConfigMonitor configMonitor = this.c;
        if (configMonitor != null) {
            configMonitor.behavior(ConfigMonitor.Events.CONFIG_FETCH_LITE_APPS_SUCCESS, kVBuilder.build());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean doInBackground(AmcsConfigByKeysLiteRpcRequest... amcsConfigByKeysLiteRpcRequestArr) {
        AmcsConfigRpcResult amcsConfigRpcResult;
        if (amcsConfigByKeysLiteRpcRequestArr == null || amcsConfigByKeysLiteRpcRequestArr.length <= 0) {
            ConfigNotifyCallback configNotifyCallback = this.b;
            if (configNotifyCallback != null) {
                configNotifyCallback.onFetchFailed("UNKNOWN", "Invalid Request");
            }
            return Boolean.FALSE;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        AmcsConfigByKeysLiteRpcRequest amcsConfigByKeysLiteRpcRequest = amcsConfigByKeysLiteRpcRequestArr[0];
        try {
            amcsConfigRpcResult = this.d.getConfigRpcProvider().fetchApps(amcsConfigByKeysLiteRpcRequest);
            if (amcsConfigRpcResult == null) {
                amcsConfigRpcResult = a();
            }
        } catch (Throwable th) {
            AmcsConfigRpcResult a2 = a();
            a2.errorMessage = th.getMessage();
            amcsConfigRpcResult = a2;
        }
        KVBuilder put = KVBuilder.newBuilder().put("version", amcsConfigRpcResult.responseTime).put("duration", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime)).put("keys", e.a((Iterable<? extends CharSequence>) amcsConfigByKeysLiteRpcRequest.keys, ','));
        if (amcsConfigRpcResult.success) {
            String str = f9515a;
            StringBuilder sb = new StringBuilder("Fetch apps from AMCS Lite success!! key size is:");
            sb.append(amcsConfigRpcResult.updateKeys == null ? "0" : String.valueOf(amcsConfigRpcResult.updateKeys.size()));
            LoggerWrapper.d(str, sb.toString());
            ConfigNotifyCallback configNotifyCallback2 = this.b;
            if (configNotifyCallback2 != null) {
                configNotifyCallback2.onFetchSuccess(amcsConfigRpcResult.updateKeys);
            }
            b(put);
            return Boolean.TRUE;
        }
        String str2 = f9515a;
        StringBuilder sb2 = new StringBuilder("Fetch apps from AMCS Lite failed!! reason is:");
        sb2.append(amcsConfigRpcResult.errorMessage);
        LoggerWrapper.d(str2, sb2.toString());
        ConfigNotifyCallback configNotifyCallback3 = this.b;
        if (configNotifyCallback3 != null) {
            configNotifyCallback3.onFetchFailed(amcsConfigRpcResult.errorCode, amcsConfigRpcResult.errorMessage);
        }
        a(put);
        return Boolean.FALSE;
    }
}
