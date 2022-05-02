package com.iap.ac.android.biz.common.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.callback.IOAuth;
import com.iap.ac.android.biz.common.callback.IPay;
import com.iap.ac.android.biz.common.callback.OpenAbilityDelegate;
import com.iap.ac.android.biz.common.callback.UserDelegate;
import com.iap.ac.android.biz.common.proxy.HttpTransporter;
import com.iap.ac.android.biz.common.proxy.common.NetworkProxy;
import com.iap.ac.android.biz.common.proxy.common.ProxyScene;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InitConfig {
    public static final int PREDICT_HASH_MAP_MAX_CAPACITY = 3;
    public String appId;
    public final Map<ProxyScene, NetworkProxy> commonNetworkProxyMap = new ConcurrentHashMap(3);
    public String envType;
    @Deprecated
    @Nullable
    public HttpTransporter networkProxy;
    public IOAuth oAuth;
    public OpenAbilityDelegate openAbilityDelegate;
    public IPay pay;
    public String tid;
    @Nullable
    public String userAgent;
    public UserDelegate userDelegate;

    public NetworkProxy getCommonNetworkProxy(ProxyScene proxyScene) {
        return this.commonNetworkProxyMap.get(proxyScene);
    }

    public void registerNetworkProxy(@NonNull ProxyScene proxyScene, @NonNull NetworkProxy networkProxy2) {
        this.commonNetworkProxyMap.put(proxyScene, networkProxy2);
    }
}
