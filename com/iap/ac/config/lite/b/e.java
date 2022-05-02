package com.iap.ac.config.lite.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.delegate.ConfigRpcProvider;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcV1Request;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class e extends b {
    private static final String e = com.iap.ac.config.lite.c.e.b("ConfigRpcFetchByKeysTask");
    private final List<String> c;
    private String d = null;

    public e(@NonNull ConfigCenterContext configCenterContext, List<String> list) {
        super(configCenterContext);
        this.c = list;
        if (list != null && !list.isEmpty()) {
            this.d = com.iap.ac.config.lite.c.e.a((Iterator<? extends CharSequence>) list.listIterator(), ',');
        }
    }

    @NonNull
    public String a() {
        return "ConfigRpcFetchByKeysTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a("config_by_keys_update_success", kVBuilder.put("keys", this.d).build());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public AmcsConfigRpcResult b(String str, JSONObject jSONObject) throws Exception {
        ConfigRpcProvider configRpcProvider = this.f9795a.getConfigRpcProvider();
        if (this.f9795a.getVersion() == ConfigCenterContext.SchemeVersion.V1) {
            AmcsConfigByKeysRpcV1Request amcsConfigByKeysRpcV1Request = new AmcsConfigByKeysRpcV1Request();
            a((AmcsConfigRpcV1Request) amcsConfigByKeysRpcV1Request, jSONObject);
            amcsConfigByKeysRpcV1Request.keys = this.c;
            String str2 = e;
            StringBuilder sb = new StringBuilder("start fetch request: ");
            sb.append(JsonUtils.toJson(amcsConfigByKeysRpcV1Request));
            ACLog.i(str2, sb.toString());
            return configRpcProvider.fetchConfigByKeysV1(amcsConfigByKeysRpcV1Request);
        }
        AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest = new AmcsConfigByKeysRpcRequest();
        a((AmcsConfigRpcRequest) amcsConfigByKeysRpcRequest, jSONObject);
        amcsConfigByKeysRpcRequest.keys = this.c;
        String str3 = e;
        StringBuilder sb2 = new StringBuilder("start fetch request: ");
        sb2.append(JsonUtils.toJson(amcsConfigByKeysRpcRequest));
        ACLog.i(str3, sb2.toString());
        return configRpcProvider.fetchConfigByKeys(amcsConfigByKeysRpcRequest);
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_failure", kVBuilder.put("keys", this.d).build());
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_start", kVBuilder.put("keys", this.d).build());
    }
}
