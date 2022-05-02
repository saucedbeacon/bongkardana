package com.iap.ac.config.lite.b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alipay.plus.android.config.sdk.common.AmcsConstants;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import com.iap.ac.config.lite.delegate.ConfigRpcProvider;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.FetchException;
import java.util.Iterator;
import org.json.JSONObject;

public class f extends b {
    private static final String e = e.b("RpcFetchTask");
    private boolean c = false;
    private boolean d = false;

    public f(@NonNull ConfigCenterContext configCenterContext, boolean z) {
        super(configCenterContext);
        this.d = z;
    }

    private AmcsConfigRpcResult a(AmcsConfigRpcResult amcsConfigRpcResult) throws Exception {
        if (!this.d || amcsConfigRpcResult == null || !amcsConfigRpcResult.success) {
            return amcsConfigRpcResult;
        }
        if (this.f9795a.getVersion() != ConfigCenterContext.SchemeVersion.V1) {
            JSONObject jSONObject = amcsConfigRpcResult.updateKeys;
            return (jSONObject == null || !jSONObject.has("business")) ? amcsConfigRpcResult : (AmcsConfigRpcResult) JsonUtils.fromJson(c(amcsConfigRpcResult.updateKeys.getString("business")), AmcsConfigRpcResult.class);
        } else if (TextUtils.isEmpty(amcsConfigRpcResult.responseTime)) {
            return amcsConfigRpcResult;
        } else {
            return (AmcsConfigRpcResult) JsonUtils.fromJson(c(amcsConfigRpcResult.responseTime), AmcsConfigRpcResult.class);
        }
    }

    private String c(String str) throws Exception {
        String staticSafeDecrypt = b().staticSafeDecrypt(16, AmcsConstants.AMCS_ENCRYPT_SECRET_KEY, str, this.f9795a.getRpcProfile().authCode);
        if (!TextUtils.isEmpty(staticSafeDecrypt)) {
            return staticSafeDecrypt;
        }
        throw new FetchException("failed to decrypt result");
    }

    private String d(String str) throws Exception {
        String staticSafeEncrypt = b().staticSafeEncrypt(16, AmcsConstants.AMCS_ENCRYPT_SECRET_KEY, str, this.f9795a.getRpcProfile().authCode);
        if (!TextUtils.isEmpty(staticSafeEncrypt)) {
            return staticSafeEncrypt;
        }
        throw new FetchException("failed to mEncrypt request!");
    }

    @NonNull
    public String a() {
        return "RpcFetchTask";
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public AmcsConfigRpcResult b(String str, JSONObject jSONObject) throws Exception {
        ConfigRpcProvider configRpcProvider = this.f9795a.getConfigRpcProvider();
        if (this.f9795a.getVersion() == ConfigCenterContext.SchemeVersion.V1) {
            AmcsConfigRpcV1Request amcsConfigRpcV1Request = new AmcsConfigRpcV1Request();
            amcsConfigRpcV1Request.lastResponseTime = str;
            a(amcsConfigRpcV1Request, jSONObject);
            return a(configRpcProvider.fetchConfigV1(a(amcsConfigRpcV1Request)));
        }
        AmcsConfigRpcRequest amcsConfigRpcRequest = new AmcsConfigRpcRequest();
        try {
            amcsConfigRpcRequest.lastResponseTime = Long.parseLong(str);
        } catch (NumberFormatException unused) {
            amcsConfigRpcRequest.lastResponseTime = 0;
        }
        a(amcsConfigRpcRequest, jSONObject);
        return a(configRpcProvider.fetchConfig(a(amcsConfigRpcRequest)));
    }

    public f(@NonNull ConfigCenterContext configCenterContext) {
        super(configCenterContext);
    }

    @NonNull
    private AmcsConfigRpcRequest a(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest) throws Exception {
        if (!this.d) {
            return amcsConfigRpcRequest;
        }
        AmcsConfigRpcRequest amcsConfigRpcRequest2 = new AmcsConfigRpcRequest();
        amcsConfigRpcRequest2.lastResponseTime = -1;
        amcsConfigRpcRequest2.addParameter("business", d(JsonUtils.toJson(amcsConfigRpcRequest)));
        return amcsConfigRpcRequest2;
    }

    @NonNull
    private AmcsConfigRpcV1Request a(@NonNull AmcsConfigRpcV1Request amcsConfigRpcV1Request) throws Exception {
        if (!this.d) {
            return amcsConfigRpcV1Request;
        }
        AmcsConfigRpcV1Request amcsConfigRpcV1Request2 = new AmcsConfigRpcV1Request();
        amcsConfigRpcV1Request2.lastResponseTime = "-1";
        amcsConfigRpcV1Request2.business = d(JsonUtils.toJson(amcsConfigRpcV1Request));
        return amcsConfigRpcV1Request2;
    }

    @NonNull
    private IStaticDataEncryptComponent b() throws Exception {
        if (b(SecurityConstants.SG_CLASS) || b("com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent")) {
            throw new FetchException("Can not find security guard library!");
        }
        SecurityGuardManager instance = SecurityGuardManager.getInstance(this.f9795a.getContext(), this.f9795a.getRpcProfile().authCode);
        if (instance != null) {
            IStaticDataEncryptComponent staticDataEncryptComp = instance.getStaticDataEncryptComp();
            if (staticDataEncryptComp != null) {
                return staticDataEncryptComp;
            }
            throw new FetchException("failed to get security guard component!");
        }
        throw new FetchException("failed to get security guard component!");
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        JSONObject jSONObject = amcsConfigRpcResult.updateKeys;
        a("config_update_success", kVBuilder.put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.c)).put("keys", (jSONObject == null || jSONObject.length() == 0) ? null : e.a((Iterator<? extends CharSequence>) amcsConfigRpcResult.updateKeys.keys(), ',')).put(ConfigMonitor.Keywords.KEY_WORD_NEED_ENCRYPT, Boolean.valueOf(this.d)).build());
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull KVBuilder kVBuilder) {
        a("config_update_failure", kVBuilder.put(ConfigMonitor.Keywords.KEY_WORD_NEED_ENCRYPT, Boolean.valueOf(this.d)).put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.c)).build());
    }

    private boolean b(String str) {
        try {
            return Class.forName(str) == null;
        } catch (ClassNotFoundException e2) {
            ACLog.e(e, "library not found: ".concat(String.valueOf(str)), e2);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void b(@NonNull KVBuilder kVBuilder) {
        a("config_update_start", kVBuilder.put(ConfigMonitor.Keywords.KEY_WORD_IS_RETRY, Boolean.valueOf(this.c)).put(ConfigMonitor.Keywords.KEY_WORD_NEED_ENCRYPT, Boolean.valueOf(this.d)).build());
    }
}
