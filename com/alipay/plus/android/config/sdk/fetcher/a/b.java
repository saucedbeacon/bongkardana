package com.alipay.plus.android.config.sdk.fetcher.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.delegate.ConfigMonitor;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import com.alipay.plus.android.config.sdk.retry.a;
import com.alipay.plus.android.transport.proxy.HttpTransportProxy;
import java.util.ArrayList;
import java.util.List;

public class b extends a {
    private static final String d = e.a("CdnFetchTask");

    public b(@NonNull ConfigCenterContext configCenterContext, @NonNull DistributionNode distributionNode) {
        super(configCenterContext, distributionNode);
    }

    @NonNull
    private KVBuilder c(@Nullable KVBuilder kVBuilder) {
        if (kVBuilder == null) {
            kVBuilder = KVBuilder.newBuilder();
        }
        return kVBuilder.put("cdnType", this.b.type).put("cdnName", this.b.configName);
    }

    @NonNull
    public String a() {
        return "CdnFetchTask";
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        String str = d;
        StringBuilder sb = new StringBuilder("CDN fetch start. backupConfig = ");
        sb.append(this.b);
        LoggerWrapper.i(str, sb.toString());
        a(ConfigMonitor.Events.CONFIG_CDN_UPDATE_START, c(kVBuilder).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        String str = d;
        StringBuilder sb = new StringBuilder("CDN fetch success. backupConfig = ");
        sb.append(this.b);
        LoggerWrapper.i(str, sb.toString());
        a(ConfigMonitor.Events.CONFIG_CDN_UPDATE_SUCCESS, c(kVBuilder).build());
    }

    /* access modifiers changed from: protected */
    @NonNull
    public List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("429");
        if (this.b.type == DistributionNode.a.ALICLOUD) {
            arrayList.add("403");
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        String str = d;
        StringBuilder sb = new StringBuilder("CDN fetch Failed. backupConfig = ");
        sb.append(this.b);
        LoggerWrapper.i(str, sb.toString());
        a(ConfigMonitor.Events.CONFIG_CDN_UPDATE_FAILURE, c(kVBuilder).build());
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public AmcsConfigRpcResult c() throws Throwable {
        String str = d;
        StringBuilder sb = new StringBuilder("will perform CDN retry. backupConfig = ");
        sb.append(this.b);
        LoggerWrapper.i(str, sb.toString());
        a a2 = ((com.alipay.plus.android.config.sdk.retry.b) HttpTransportProxy.getInterfaceProxy(com.alipay.plus.android.config.sdk.retry.b.class, (HttpTransportProxy.Delegate) new HttpTransportProxy.DelegateAdapter() {
            @NonNull
            public String transformUrl(@NonNull String str) {
                return b.this.b.url;
            }
        })).a();
        if (a2 != null) {
            AmcsConfigRpcResult amcsConfigRpcResult = new AmcsConfigRpcResult();
            amcsConfigRpcResult.success = true;
            amcsConfigRpcResult.updateKeys = a2.data;
            amcsConfigRpcResult.responseTime = a2.version;
            return amcsConfigRpcResult;
        }
        throw new FetchException("CdnResultIsNull", "CDN fetched config result is null!");
    }
}
