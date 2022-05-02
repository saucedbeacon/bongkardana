package com.alipay.plus.android.config.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.extractor.ProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.extractor.SecurityProfileExtractor;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.iap.android.common.syncintegration.impl.SyncProvider;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.a.g;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import com.alipay.plus.android.config.sdk.delegate.ConfigMonitor;
import com.alipay.plus.android.config.sdk.delegate.ConfigRpcProvider;
import com.alipay.plus.android.config.sdk.rpc.DefaultConfigRpcProvider;
import com.alipay.plus.android.config.sdk.trigger.ConfigUpdateSyncTrigger;
import com.alipay.plus.android.config.sdk.trigger.ConfigUpdateTrigger;
import com.alipay.plus.android.config.sdk.utils.ConfigProfileUtils;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;

public class ConfigCenterContext {
    public static final String PROD_ENVIRONMENT = "prod";

    /* renamed from: a  reason: collision with root package name */
    private static final String f9508a = e.a("ConfigCenterContext");
    @NonNull
    private boolean b;
    @NonNull
    protected ConfigRpcProvider mConfigRpcProvider;
    @Nullable
    protected ConfigUpdateTrigger mConfigUpdateTrigger;
    @NonNull
    protected Context mContext;
    @NonNull
    protected ConfigIdentifierProvider mIdentifierProvider;
    @NonNull
    protected ConfigMonitor mMonitor;
    @NonNull
    protected RpcProfile mRpcProfile;
    protected boolean mUseExternalOperationType;

    public ConfigCenterContext(@NonNull Context context, @NonNull RpcProfile rpcProfile) {
        this.mConfigRpcProvider = new DefaultConfigRpcProvider();
        this.mMonitor = new ConfigMonitor.IAPLogMonitor();
        this.mIdentifierProvider = new g();
        this.mConfigUpdateTrigger = new ConfigUpdateSyncTrigger(new SyncProvider());
        this.mUseExternalOperationType = false;
        this.b = false;
        this.mContext = context;
        a(rpcProfile);
    }

    public ConfigCenterContext(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        this(context, str, str2, new SecurityProfileExtractor(context, str2));
    }

    public ConfigCenterContext(@NonNull Context context, @NonNull String str, @NonNull String str2, @NonNull ProfileExtractor profileExtractor) {
        this.mConfigRpcProvider = new DefaultConfigRpcProvider();
        this.mMonitor = new ConfigMonitor.IAPLogMonitor();
        this.mIdentifierProvider = new g();
        this.mConfigUpdateTrigger = new ConfigUpdateSyncTrigger(new SyncProvider());
        this.mUseExternalOperationType = false;
        this.b = false;
        RpcProfile createRpcProfile = ConfigProfileUtils.createRpcProfile(profileExtractor, str, str2);
        if (createRpcProfile == null) {
            createRpcProfile = new RpcProfile();
            createRpcProfile.authCode = str2;
            createRpcProfile.environment = str;
            LoggerWrapper.e(f9508a, "Cannot get prod RpcProfile!!");
        }
        this.mContext = context;
        a(createRpcProfile);
    }

    private void a(@NonNull RpcProfile rpcProfile) {
        this.mRpcProfile = rpcProfile;
        String str = f9508a;
        StringBuilder sb = new StringBuilder("rpcProfile: ");
        sb.append(ConfigUtils.toJSONString(this.mRpcProfile));
        LoggerWrapper.d(str, sb.toString());
    }

    @NonNull
    public ConfigMonitor getConfigMonitor() {
        return this.mMonitor;
    }

    @NonNull
    public ConfigRpcProvider getConfigRpcProvider() {
        return this.mConfigRpcProvider;
    }

    @Nullable
    public ConfigUpdateTrigger getConfigUpdateTrigger() {
        return this.mConfigUpdateTrigger;
    }

    @NonNull
    public final Context getContext() {
        return this.mContext;
    }

    @NonNull
    public String getEnvironment() {
        return this.mRpcProfile.environment;
    }

    @NonNull
    public ConfigIdentifierProvider getIdentifierProvider() {
        return this.mIdentifierProvider;
    }

    @NonNull
    public RpcProfile getRpcProfile() {
        return this.mRpcProfile;
    }

    public boolean isUseExternalOperationType() {
        return this.mUseExternalOperationType;
    }

    @NonNull
    public boolean isUseGraySscaleAsDefault() {
        return this.b;
    }

    public void setConfigMonitor(@NonNull ConfigMonitor configMonitor) {
        this.mMonitor = configMonitor;
    }

    public void setConfigRpcProvider(@NonNull ConfigRpcProvider configRpcProvider) {
        this.mConfigRpcProvider = configRpcProvider;
    }

    public void setConfigUpdateTrigger(@Nullable ConfigUpdateTrigger configUpdateTrigger) {
        this.mConfigUpdateTrigger = configUpdateTrigger;
    }

    public void setEnvironment(@NonNull String str) {
        this.mRpcProfile.environment = str;
    }

    public void setIdentifierProvider(@NonNull ConfigIdentifierProvider configIdentifierProvider) {
        this.mIdentifierProvider = configIdentifierProvider;
    }

    public void setUseExternalOperationType(boolean z) {
        this.mUseExternalOperationType = z;
    }

    public void setUseGrayScaleAsDefault(@NonNull boolean z) {
        this.b = z;
    }
}
