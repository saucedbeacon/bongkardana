package com.alipay.plus.android.config.sdk.fetcher.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.AmcsConstants;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import java.util.Collections;
import java.util.List;

public class d extends a {
    private static final String d = e.a("RpcFetchTask");
    private boolean e = false;
    private AmcsConfigRpcRequest f;

    public d(@NonNull ConfigCenterContext configCenterContext, @NonNull DistributionNode distributionNode, @NonNull boolean z) {
        super(configCenterContext, distributionNode, z);
    }

    @NonNull
    public String a() {
        return "RpcFetchTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_update_start", kVBuilder.put("isEncrypt", Boolean.valueOf(this.c)).put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.e)).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a("config_update_success", kVBuilder.put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.e)).put("keys", (amcsConfigRpcResult.updateKeys == null || amcsConfigRpcResult.updateKeys.isEmpty()) ? null : e.a((Iterable<? extends CharSequence>) amcsConfigRpcResult.updateKeys.keySet(), ',')).build());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public List<String> b() {
        return Collections.singletonList("1002");
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_update_failure", kVBuilder.put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.e)).build());
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public AmcsConfigRpcResult c() throws Throwable {
        return this.f10746a.getConfigRpcProvider().fetchConfig(this.f, this.b.configName);
    }

    /* access modifiers changed from: protected */
    public void c(String str) {
        AmcsConfigRpcRequest amcsConfigRpcRequest = new AmcsConfigRpcRequest();
        this.f = amcsConfigRpcRequest;
        amcsConfigRpcRequest.lastResponseTime = str;
        a(this.f);
    }

    /* access modifiers changed from: protected */
    public void e() throws Exception {
        if (this.c) {
            String staticSafeEncrypt = f().staticSafeEncrypt(16, AmcsConstants.AMCS_ENCRYPT_SECRET_KEY, JSONObject.toJSONString(this.f), this.f10746a.getRpcProfile().authCode);
            if (!TextUtils.isEmpty(staticSafeEncrypt)) {
                String str = d;
                StringBuilder sb = new StringBuilder("before encrypted: ");
                sb.append(JSONObject.toJSONString(this.f));
                LoggerWrapper.d(str, sb.toString());
                String str2 = this.f.lastResponseTime;
                AmcsConfigRpcRequest amcsConfigRpcRequest = new AmcsConfigRpcRequest();
                this.f = amcsConfigRpcRequest;
                amcsConfigRpcRequest.business = staticSafeEncrypt;
                this.f.lastResponseTime = "-".concat(String.valueOf(str2));
                String str3 = d;
                StringBuilder sb2 = new StringBuilder("after encrypted: ");
                sb2.append(JSONObject.toJSONString(this.f));
                LoggerWrapper.d(str3, sb2.toString());
                return;
            }
            throw new FetchException("failed to mEncrypt request!");
        }
    }
}
