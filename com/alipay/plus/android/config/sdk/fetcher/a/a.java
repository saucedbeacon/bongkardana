package com.alipay.plus.android.config.sdk.fetcher.a;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.utils.MiscUtils;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.AmcsConstants;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import java.util.List;
import java.util.Map;

public abstract class a {
    private static final String d = e.a("ConfigFetchTask");
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    protected ConfigCenterContext f10746a;
    @NonNull
    protected DistributionNode b;
    @NonNull
    protected boolean c;

    protected a(@NonNull ConfigCenterContext configCenterContext, @NonNull DistributionNode distributionNode) {
        this.c = false;
        this.f10746a = configCenterContext;
        this.b = distributionNode;
    }

    protected a(@NonNull ConfigCenterContext configCenterContext, @NonNull DistributionNode distributionNode, @NonNull boolean z) {
        this(configCenterContext, distributionNode);
        this.c = z;
    }

    @NonNull
    private static String a(@NonNull RpcProfile rpcProfile) {
        String str = rpcProfile.extras != null ? rpcProfile.extras.get(AmcsConstants.AMCS_BUSINESS_KEY) : null;
        return TextUtils.isEmpty(str) ? "default" : str;
    }

    @WorkerThread
    @NonNull
    private AmcsConfigRpcResult d(@Nullable String str) throws FetchException {
        try {
            c(str);
            e();
            AmcsConfigRpcResult c2 = c();
            if (c2 != null) {
                AmcsConfigRpcResult a2 = a(c2);
                if (a2.success) {
                    return a2;
                }
                throw new FetchException(a2.errorCode, a2.errorMessage);
            }
            throw new FetchException("rpc_result_is_null");
        } catch (Throwable th) {
            throw e.a(th, true);
        }
    }

    /* access modifiers changed from: protected */
    public AmcsConfigRpcResult a(AmcsConfigRpcResult amcsConfigRpcResult) throws Exception {
        if (!this.c || !amcsConfigRpcResult.success) {
            return amcsConfigRpcResult;
        }
        String str = d;
        StringBuilder sb = new StringBuilder("before encrypted: ");
        sb.append(JSONObject.toJSONString(amcsConfigRpcResult));
        LoggerWrapper.d(str, sb.toString());
        String staticSafeDecrypt = f().staticSafeDecrypt(16, AmcsConstants.AMCS_ENCRYPT_SECRET_KEY, amcsConfigRpcResult.responseTime, this.f10746a.getRpcProfile().authCode);
        if (!TextUtils.isEmpty(staticSafeDecrypt)) {
            String str2 = d;
            StringBuilder sb2 = new StringBuilder("after encrypted: ");
            sb2.append(JSONObject.toJSONString(staticSafeDecrypt));
            LoggerWrapper.d(str2, sb2.toString());
            return (AmcsConfigRpcResult) JSONObject.parseObject(staticSafeDecrypt, AmcsConfigRpcResult.class);
        }
        throw new FetchException("failed to decrypt result");
    }

    @NonNull
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull KVBuilder kVBuilder);

    /* access modifiers changed from: protected */
    public abstract void a(@NonNull KVBuilder kVBuilder, @NonNull AmcsConfigRpcResult amcsConfigRpcResult);

    /* access modifiers changed from: protected */
    public void a(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest) {
        if (amcsConfigRpcRequest != null) {
            Context context = this.f10746a.getContext();
            ConfigIdentifierProvider identifierProvider = this.f10746a.getIdentifierProvider();
            RpcProfile rpcProfile = this.f10746a.getRpcProfile();
            String versionName = MiscUtils.getVersionName(this.f10746a.getContext());
            if (TextUtils.isEmpty(versionName)) {
                versionName = "1.0";
            }
            amcsConfigRpcRequest.utdid = identifierProvider.getUtdId(context);
            amcsConfigRpcRequest.reference = identifierProvider.getConfigUserId(context);
            amcsConfigRpcRequest.productId = rpcProfile.productId;
            amcsConfigRpcRequest.mobileModel = Build.MODEL;
            amcsConfigRpcRequest.mobileBrand = Build.BRAND;
            amcsConfigRpcRequest.manufacturer = Build.MANUFACTURER;
            amcsConfigRpcRequest.osVersion = e.a();
            amcsConfigRpcRequest.clientVersion = versionName;
            amcsConfigRpcRequest.business = a(rpcProfile);
            amcsConfigRpcRequest.systemType = DeviceUtils.PLATFORM_TYPE;
        }
    }

    /* access modifiers changed from: protected */
    public void a(@NonNull String str, @Nullable Map<String, String> map) {
        this.f10746a.getConfigMonitor().behavior(str, map);
    }

    public boolean a(@Nullable String str) {
        return b().contains(str);
    }

    @WorkerThread
    @NonNull
    public final AmcsConfigRpcResult b(@Nullable String str) throws FetchException {
        a(KVBuilder.newBuilder().put("localVersion", str));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            AmcsConfigRpcResult d2 = d(str);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            LoggerWrapper.d(d, String.format("[%s] Fetch config success! increment = %s, responseTime = %s, duration = %s.", new Object[]{a(), Boolean.valueOf(d2.increment), d2.responseTime, Long.valueOf(elapsedRealtime2)}));
            a(KVBuilder.newBuilder().put("version", d2.responseTime).put("duration", Long.valueOf(elapsedRealtime2)).put("updateCount", Integer.valueOf(d2.updateKeys != null ? d2.updateKeys.size() : 0)), d2);
            return d2;
        } catch (FetchException e) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            LoggerWrapper.d(d, String.format("[%s] Fetch config failed! errorCode = %s, errorMessage = %s, duration = %s.", new Object[]{a(), e.errorCode, e.errorMessage, Long.valueOf(elapsedRealtime3)}));
            b(KVBuilder.newBuilder().put("errorCode", e.errorCode).put("errorMessage", e.errorMessage).put("duration", Long.valueOf(elapsedRealtime3)));
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    public abstract List<String> b();

    /* access modifiers changed from: protected */
    public abstract void b(@NonNull KVBuilder kVBuilder);

    /* access modifiers changed from: protected */
    @WorkerThread
    @Nullable
    public abstract AmcsConfigRpcResult c() throws Throwable;

    /* access modifiers changed from: protected */
    public void c(String str) {
    }

    @NonNull
    public DistributionNode d() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public void e() throws Exception {
    }

    /* access modifiers changed from: protected */
    @NonNull
    public IStaticDataEncryptComponent f() throws Exception {
        SecurityGuardManager instance = SecurityGuardManager.getInstance(this.f10746a.getContext());
        if (instance != null) {
            IStaticDataEncryptComponent staticDataEncryptComp = instance.getStaticDataEncryptComp();
            if (staticDataEncryptComp != null) {
                return staticDataEncryptComp;
            }
            throw new FetchException("failed to get security guard component!");
        }
        throw new FetchException("failed to get security guard component!");
    }

    public String toString() {
        return String.format("[%s] %s", new Object[]{a(), this.b});
    }
}
