package com.iap.ac.android.biz.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.multigateway.sdk.BuildConfig;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.configcenter.ConfigCenter;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.foundation.FoundationProxy;
import com.iap.ac.android.biz.common.internal.rpc.ACRpcInterceptor;
import com.iap.ac.android.biz.common.internal.rpc.SignRpcRequestPluginImpl;
import com.iap.ac.android.biz.common.model.InitConfig;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.w.a;
import java.util.HashSet;
import java.util.Set;

public class ACCoreManager {
    public static volatile ACCoreManager c;

    /* renamed from: a  reason: collision with root package name */
    public a f9690a;
    public boolean b = false;

    public static ACCoreManager getInstance() {
        if (c == null) {
            synchronized (ACCoreManager.class) {
                if (c == null) {
                    c = new ACCoreManager();
                }
            }
        }
        return c;
    }

    public void clear() {
        if (initialized()) {
            this.f9690a.clear();
        }
    }

    public Set<String> getCrashWhiteList() {
        HashSet hashSet = new HashSet();
        hashSet.add("com.iap.ac");
        hashSet.add(BuildConfig.APPLICATION_ID);
        hashSet.add("com.alibaba.wireless.security");
        hashSet.add("com.alipay.iap.android.webapp");
        hashSet.add("com.alipay.mobile.nebula");
        hashSet.add("com.alipay.mobile.nebulacore");
        hashSet.add("com.alipay.mobile.nebulaappcenter");
        hashSet.add("com.alipay.mobile.h5container");
        hashSet.add("com.alibaba.ariver");
        hashSet.add("com.alibaba.griver");
        return hashSet;
    }

    public void init(@NonNull Context context, @NonNull InitConfig initConfig) {
        ACLog.d(Constants.TAG, "ACCoreManager init begin");
        FoundationProxy instance = FoundationProxy.getInstance("ac_biz");
        ACManager.getInstance().getCommonConfig().crashWhiteListSet = getCrashWhiteList();
        instance.init(context, ACManager.getInstance().getCommonConfig());
        if (initConfig.networkProxy != null) {
            FoundationProxy.getInstance("ac_biz").setNetworkType(FoundationProxy.NetworkType.NETWORK_TYPE_PROXY);
        }
        this.f9690a = new a("ac_biz");
        RPCProxyHost.getInstance("ac_biz").addRpcInterceptor(this.f9690a);
        RPCProxyHost.getInstance("ac_biz").addRpcInterceptor(new ACRpcInterceptor());
        RPCProxyHost.getInstance("ac_biz").setSignRequest(new SignRpcRequestPluginImpl());
        ConfigCenter.INSTANCE.init();
        this.b = true;
    }

    public boolean initialized() {
        return this.b;
    }
}
