package com.iap.ac.config.lite;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.c.g;
import com.iap.ac.config.lite.delegate.ConfigIdentifierProvider;
import com.iap.ac.config.lite.delegate.ConfigMonitor;
import com.iap.ac.config.lite.delegate.ConfigRpcProvider;
import com.iap.ac.config.lite.rpc.DefaultConfigRpcProvider;
import com.iap.ac.config.lite.storage.a;
import com.iap.ac.config.lite.utils.ConfigUtils;

public class ConfigCenterContext {
    private static final String l = e.b("ConfigCenterContext");
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private Context f9788a;
    private SchemeVersion b;
    @NonNull
    private ConfigRpcProvider c;
    @NonNull
    private ConfigIdentifierProvider d;
    @NonNull
    private ConfigMonitor e;
    @NonNull
    private String f;
    @NonNull
    private ApplicationInfo g;
    private RpcAppInfo h;
    private String i;
    @Nullable
    private String j;
    private a k;

    public static class ApplicationInfo {
        public String appId;
        public String tntInstId;
        public String workspaceId;
    }

    public enum SchemeVersion {
        V1,
        V2
    }

    public ConfigCenterContext(@NonNull Context context, @NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @Nullable String str2, @Nullable String str3, @NonNull String str4, @Nullable String str5) {
        this.b = SchemeVersion.V2;
        this.c = new DefaultConfigRpcProvider();
        this.d = new g();
        this.e = new ConfigMonitor.ACLogMonitor();
        this.g = new ApplicationInfo();
        this.f9788a = context;
        this.f = str;
        a(str4, str2, str3);
        a(rpcAppInfo);
        setBizCode(str5);
    }

    private void a(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        ApplicationInfo applicationInfo = this.g;
        applicationInfo.appId = str;
        applicationInfo.tntInstId = str2;
        applicationInfo.workspaceId = str3;
        String str4 = l;
        StringBuilder sb = new StringBuilder("applicationInfo: ");
        sb.append(ConfigUtils.toJSONString(this.g));
        ACLog.d(str4, sb.toString());
    }

    @NonNull
    public String getAppId() {
        return this.g.appId;
    }

    @Nullable
    public String getBizCode() {
        return this.j;
    }

    @NonNull
    public ConfigMonitor getConfigMonitor() {
        return this.e;
    }

    @NonNull
    public ConfigRpcProvider getConfigRpcProvider() {
        return this.c;
    }

    public a getConfigStorage() {
        return this.k;
    }

    @NonNull
    public final Context getContext() {
        return this.f9788a;
    }

    public String getDnsServer() {
        return this.i;
    }

    @NonNull
    public String getEnvironment() {
        return this.f;
    }

    @NonNull
    public ConfigIdentifierProvider getIdentifierProvider() {
        return this.d;
    }

    @NonNull
    public RpcAppInfo getRpcProfile() {
        return this.h;
    }

    @Nullable
    public String getTntInstId() {
        return this.g.tntInstId;
    }

    public SchemeVersion getVersion() {
        return this.b;
    }

    @Nullable
    public String getWorkspaceId() {
        return this.g.workspaceId;
    }

    public void setAppId(@NonNull String str) {
        this.g.appId = str;
    }

    public void setBizCode(@Nullable String str) {
        this.j = str;
        this.e.setBizCode(str);
        ConfigRpcProvider configRpcProvider = this.c;
        if (configRpcProvider instanceof DefaultConfigRpcProvider) {
            ((DefaultConfigRpcProvider) configRpcProvider).setBizCode(this.j);
        }
    }

    public void setConfigMonitor(@NonNull ConfigMonitor configMonitor) {
        this.e = configMonitor;
    }

    public void setConfigRpcProvider(@NonNull ConfigRpcProvider configRpcProvider) {
        this.c = configRpcProvider;
    }

    public void setConfigStorage(a aVar) {
        this.k = aVar;
    }

    public void setDnsServer(String str) {
        this.i = str;
    }

    public void setEnvironment(@NonNull String str) {
        this.f = str;
    }

    public void setIdentifierProvider(@NonNull ConfigIdentifierProvider configIdentifierProvider) {
        this.d = configIdentifierProvider;
    }

    public void setTntInstId(@Nullable String str) {
        this.g.tntInstId = str;
    }

    public void setVersion(SchemeVersion schemeVersion) {
        this.b = schemeVersion;
    }

    public void setWorkspaceId(@Nullable String str) {
        this.g.workspaceId = str;
    }

    private void a(@NonNull RpcAppInfo rpcAppInfo) {
        this.h = rpcAppInfo;
        String str = l;
        StringBuilder sb = new StringBuilder("rpcProfile: ");
        sb.append(ConfigUtils.toJSONString(this.h));
        ACLog.d(str, sb.toString());
    }

    public ConfigCenterContext(@NonNull Context context, @NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @Nullable String str2, @NonNull String str3) {
        this(context, rpcAppInfo, str, str2, (String) null, str3, (String) null);
    }

    public ConfigCenterContext(@NonNull Context context, @NonNull RpcAppInfo rpcAppInfo, @NonNull String str, @NonNull String str2) {
        this(context, rpcAppInfo, str, (String) null, (String) null, str2, (String) null);
    }
}
