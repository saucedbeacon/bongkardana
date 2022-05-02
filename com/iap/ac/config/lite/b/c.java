package com.iap.ac.config.lite.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.result.AmcsConfigCdnResult;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class c extends a {
    private final List<String> d;
    private String e = null;

    public c(@NonNull ConfigCenterContext configCenterContext, List<String> list) {
        super(configCenterContext);
        this.d = list;
        if (list != null && !list.isEmpty()) {
            this.e = e.a((Iterator<? extends CharSequence>) list.listIterator(), ',');
        }
    }

    @NonNull
    public String a() {
        return "ConfigCdnFetchByKeysTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a("config_by_keys_update_success", kVBuilder.put("keys", this.e).put("isCDN", Boolean.TRUE).build());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public AmcsConfigCdnResult b(String str, JSONObject jSONObject) throws Exception {
        return super.b(str, jSONObject);
    }

    public AmcsConfigByKeysRpcRequest c(String str, JSONObject jSONObject) {
        AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest = new AmcsConfigByKeysRpcRequest();
        try {
            amcsConfigByKeysRpcRequest.lastResponseTime = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            amcsConfigByKeysRpcRequest.lastResponseTime = 0;
        }
        amcsConfigByKeysRpcRequest.addParameters(jSONObject);
        amcsConfigByKeysRpcRequest.keys = this.d;
        return amcsConfigByKeysRpcRequest;
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_start", kVBuilder.put("keys", this.e).put("isCDN", Boolean.TRUE).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_failure", kVBuilder.put("keys", this.e).put("isCDN", Boolean.TRUE).build());
    }
}
