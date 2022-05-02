package com.iap.ac.android.biz.common.proxy.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.http.HttpTransportFactory;

public class CommonRegionNetworkProxy {
    public static final String TAG = "CommonRegionNetworkProxy";
    public static CommonRegionNetworkProxy mInstance;

    public static CommonRegionNetworkProxy getInstance() {
        if (mInstance == null) {
            synchronized (CommonRegionNetworkProxy.class) {
                if (mInstance == null) {
                    mInstance = new CommonRegionNetworkProxy();
                }
            }
        }
        return mInstance;
    }

    public void setHttpTransporter(@Nullable ProxyScene proxyScene, @NonNull NetworkProxy networkProxy) throws IllegalArgumentException {
        ACLog.i(TAG, "set network proxy");
        if (proxyScene == null || networkProxy == null) {
            ACLog.i(TAG, "proxy scene or proxy implementation is null");
        } else if (proxyScene == ProxyScene.PROXY_SCENE_PAY) {
            HttpTransportFactory.setCreater(HttpTransportCreatorUtils.createHttpTransporter(networkProxy, proxyScene), "ac_biz");
        } else if (proxyScene == ProxyScene.PROXY_SCENE_MINI_PROGRAM) {
            HttpTransportFactory.setCreater(HttpTransportCreatorUtils.createHttpTransporter(networkProxy, proxyScene), "region_biz");
        } else {
            ACLog.i(TAG, "no common network proxy for this proxy scene");
        }
    }
}
