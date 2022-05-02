package com.iap.ac.config.lite.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.result.AmcsConfigCdnResult;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import java.util.Iterator;
import org.json.JSONObject;

public class d extends a {
    public d(@NonNull ConfigCenterContext configCenterContext) {
        super(configCenterContext);
    }

    @NonNull
    public String a() {
        return "ConfigCdnFetchTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        JSONObject jSONObject = amcsConfigRpcResult.updateKeys;
        a("config_update_success", kVBuilder.put("keys", (jSONObject == null || jSONObject.length() == 0) ? null : e.a((Iterator<? extends CharSequence>) amcsConfigRpcResult.updateKeys.keys(), ',')).put("isCDN", Boolean.TRUE).build());
    }

    public AmcsConfigRpcRequest c(String str, JSONObject jSONObject) {
        AmcsConfigRpcRequest amcsConfigRpcRequest = new AmcsConfigRpcRequest();
        try {
            amcsConfigRpcRequest.lastResponseTime = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            amcsConfigRpcRequest.lastResponseTime = 0;
        }
        amcsConfigRpcRequest.addParameters(jSONObject);
        return amcsConfigRpcRequest;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public AmcsConfigCdnResult b(String str, JSONObject jSONObject) throws Exception {
        return super.b(str, jSONObject);
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_update_start", kVBuilder.put("isCDN", Boolean.TRUE).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_update_failure", kVBuilder.put("isCDN", Boolean.TRUE).build());
    }
}
