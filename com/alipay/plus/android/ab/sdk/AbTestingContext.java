package com.alipay.plus.android.ab.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.plus.android.ab.sdk.monitor.AbTestingMonitor;
import com.alipay.plus.android.ab.sdk.rpc.AbTestingRpcProvider;
import com.alipay.plus.android.ab.sdk.rpc.DefaultAbTestingRpcProvider;
import com.alipay.plus.android.ab.sdk.trigger.AbTestingSyncTrigger;
import com.alipay.plus.android.ab.sdk.trigger.AbTestingTrigger;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.a.g;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import java.util.Map;

public class AbTestingContext {
    public static final String PROD_ENVIRONMENT = "prod";

    /* renamed from: a  reason: collision with root package name */
    private static final String f10725a = e.a("AbTestingContext");
    @NonNull
    private Context b;
    @NonNull
    private String c;
    @Nullable
    private AbTestingTrigger d = new AbTestingSyncTrigger();
    @NonNull
    private AbTestingRpcProvider e = new DefaultAbTestingRpcProvider();
    @NonNull
    private AbTestingMonitor f = new AbTestingMonitor.IAPLogMonitor();
    private String g;
    private String h;
    private Map<String, String> i;
    private String j;
    @NonNull
    private ConfigIdentifierProvider k = new g();

    public AbTestingContext(@NonNull Context context, @NonNull String str) {
        this.b = context;
        this.c = str;
    }

    @NonNull
    public AbTestingMonitor getAbTestingMonitor() {
        return this.f;
    }

    @NonNull
    public AbTestingRpcProvider getAbTestingRpcProvider() {
        return this.e;
    }

    @Nullable
    public AbTestingTrigger getAbTestingTrigger() {
        return this.d;
    }

    public Map<String, String> getCondition() {
        return this.i;
    }

    @NonNull
    public Context getContext() {
        return this.b;
    }

    public String getCookie() {
        return this.h;
    }

    public String getDeviceId() {
        String str = this.j;
        return str == null ? this.k.getUtdId(this.b) : str;
    }

    @NonNull
    public String getEnvironment() {
        return this.c;
    }

    @NonNull
    public ConfigIdentifierProvider getIdentifierProvider() {
        return this.k;
    }

    public String getUserId() {
        return this.g;
    }

    public void setAbTestingMonitor(@NonNull AbTestingMonitor abTestingMonitor) {
        this.f = abTestingMonitor;
    }

    public void setAbTestingRpcProvider(@NonNull AbTestingRpcProvider abTestingRpcProvider) {
        this.e = abTestingRpcProvider;
    }

    public void setAbTestingTrigger(@Nullable AbTestingTrigger abTestingTrigger) {
        this.d = abTestingTrigger;
    }

    public void setCondition(Map<String, String> map) {
        this.i = map;
    }

    public void setContext(@NonNull Context context) {
        this.b = context;
    }

    public void setCookie(String str) {
        this.h = str;
    }

    public void setDeviceId(String str) {
        this.j = str;
    }

    public void setEnvironment(@NonNull String str) {
        this.c = str;
    }

    public void setIdentifierProvider(@NonNull ConfigIdentifierProvider configIdentifierProvider) {
        this.k = configIdentifierProvider;
    }

    public void setUserId(String str) {
        this.g = str;
    }
}
