package com.alipay.imobile.network.quake;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.transport.TrafficFlowMonitor;
import com.alipay.imobile.network.quake.transport.http.CookieJar;
import com.alipay.imobile.network.quake.transport.http.JavaNetCookieJar;
import com.alipay.imobile.network.quake.transport.strategy.DefaultRetryPolicy;
import com.alipay.imobile.network.quake.transport.strategy.RetryPolicy;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class QuakeConfig {

    /* renamed from: a  reason: collision with root package name */
    private String f9339a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private String g;
    private String h;
    private String i;
    private int j;
    private CookieJar k;
    private TrafficFlowMonitor l;
    private Map<String, String> m;
    /* access modifiers changed from: private */
    public CookieManager n;

    public QuakeConfig(@NonNull QuakeConfig quakeConfig) {
        this(quakeConfig.f9339a, quakeConfig.b, quakeConfig.c, quakeConfig.d, quakeConfig.j);
    }

    public QuakeConfig(String str, String str2) {
        this(str, "", str2, 4);
    }

    public QuakeConfig(String str, String str2, String str3) {
        this(str, str2, str3, 4);
    }

    public QuakeConfig(String str, String str2, String str3, int i2) {
        this(str, str2, "", str3, i2);
    }

    public QuakeConfig(String str, String str2, String str3, String str4, int i2) {
        this.e = 10000;
        this.f = 0;
        this.f9339a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.j = i2;
        this.l = null;
        try {
            a();
        } catch (Throwable th) {
            LoggerWrapper.e(Quake.TAG, "buildDefaultCookieJar error", th);
            b();
        }
    }

    private void a() {
        this.n = CookieManager.getInstance();
        this.k = new JavaNetCookieJar(new CookieHandler() {
            public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
                if (uri == null) {
                    return null;
                }
                String cookie = QuakeConfig.this.n.getCookie(uri.toString());
                if (TextUtils.isEmpty(cookie)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(cookie);
                HashMap hashMap = new HashMap();
                hashMap.put("Cookie", arrayList);
                return hashMap;
            }

            public void put(URI uri, Map<String, List<String>> map) throws IOException {
                if (uri != null && map != null && !map.isEmpty()) {
                    for (Map.Entry<String, List<String>> value : map.entrySet()) {
                        for (String cookie : (List) value.getValue()) {
                            QuakeConfig.this.n.setCookie(uri.toString(), cookie);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        QuakeConfig.this.n.flush();
                    } else {
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
        });
    }

    private void b() {
        this.k = new JavaNetCookieJar(new java.net.CookieManager());
    }

    public QuakeConfig cookieJar(CookieJar cookieJar) {
        this.k = cookieJar;
        return this;
    }

    public String getAppId() {
        return this.f9339a;
    }

    public String getAppKeyForSecurityGuard() {
        return this.b;
    }

    public String getAuthCodeForSecurityGuard() {
        return this.c;
    }

    public int getConcurrentRequestNumber() {
        return this.j;
    }

    public CookieJar getCookieJar() {
        return this.k;
    }

    public Map<String, String> getExternalInfo() {
        return this.m;
    }

    public String getGwUrl() {
        return this.d;
    }

    public RetryPolicy getRetryPolicy() {
        return new DefaultRetryPolicy(this.e, this.f, 1.0f);
    }

    public String getTenantId() {
        return this.i;
    }

    public TrafficFlowMonitor getTrafficFlowMonitor() {
        return this.l;
    }

    public String getVersion() {
        return this.g;
    }

    public String getWorkspaceId() {
        return this.h;
    }

    public void setAppId(String str) {
        this.f9339a = str;
    }

    public void setAppKeyForSecurityGuard(String str) {
        LoggerWrapper.d(Quake.TAG, "set app key=".concat(String.valueOf(str)));
        this.b = str;
    }

    public void setAuthCodeForSecurityGuard(String str) {
        LoggerWrapper.d(Quake.TAG, "set auth code=".concat(String.valueOf(str)));
        this.c = str;
    }

    public void setConcurrentRequestNumber(int i2) {
        this.j = i2;
    }

    public void setExternalInfo(Map<String, String> map) {
        this.m = map;
    }

    public void setGateWayUrl(String str) {
        LoggerWrapper.d(Quake.TAG, "set gateway url=".concat(String.valueOf(str)));
        this.d = str;
    }

    public void setNumRetries(int i2) {
        this.f = i2;
    }

    public void setTenantId(String str) {
        this.i = str;
    }

    public void setTimeoutMs(int i2) {
        this.e = i2;
    }

    public void setVersion(String str) {
        this.g = str;
    }

    public void setWorkspaceId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-703179435, oncanceled);
            onCancelLoad.getMin(-703179435, oncanceled);
        }
        this.h = str;
    }

    public QuakeConfig trafficFlowMonitor(TrafficFlowMonitor trafficFlowMonitor) {
        this.l = trafficFlowMonitor;
        return this;
    }
}
