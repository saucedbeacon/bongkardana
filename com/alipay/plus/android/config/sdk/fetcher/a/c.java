package com.alipay.plus.android.config.sdk.fetcher.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import java.util.ArrayList;
import java.util.List;

public class c extends a {
    private static final String d = e.a("ConfigRpcFetchByKeysTask");
    private final List<String> e;
    private AmcsConfigByKeysRpcRequest f;
    private String g = null;

    public c(@NonNull ConfigCenterContext configCenterContext, @NonNull DistributionNode distributionNode, List<String> list) {
        super(configCenterContext, distributionNode);
        this.e = list;
        if (list != null && !list.isEmpty()) {
            this.g = e.a((Iterable<? extends CharSequence>) list, ',');
        }
    }

    @NonNull
    public String a() {
        return "RpcFetchByKeysTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_start", kVBuilder.put("keys", this.g).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a("config_by_keys_update_success", kVBuilder.put("keys", this.g).build());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public List<String> b() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_by_keys_update_failure", kVBuilder.put("keys", this.g).build());
    }

    /* access modifiers changed from: protected */
    @Nullable
    public AmcsConfigRpcResult c() throws Throwable {
        return this.f10746a.getConfigRpcProvider().fetchConfigByKeys(this.f, this.b.configName);
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest = new AmcsConfigByKeysRpcRequest();
        this.f = amcsConfigByKeysRpcRequest;
        a((AmcsConfigRpcRequest) amcsConfigByKeysRpcRequest);
        this.f.keys = this.e;
        String str2 = d;
        StringBuilder sb = new StringBuilder("start fetch request: ");
        sb.append(JSONObject.toJSONString(this.f));
        LoggerWrapper.i(str2, sb.toString());
    }
}
