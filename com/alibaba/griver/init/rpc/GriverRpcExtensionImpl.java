package com.alibaba.griver.init.rpc;

import android.text.TextUtils;
import com.alibaba.griver.base.common.rpc.GriverRpcExtension;
import com.iap.ac.android.common.rpc.RPCProxyHost;

public class GriverRpcExtensionImpl implements GriverRpcExtension {

    /* renamed from: a  reason: collision with root package name */
    private String f9203a;

    public GriverRpcExtensionImpl(String str) {
        this.f9203a = str;
    }

    public <T> T getFacade(Class<T> cls) {
        if (!TextUtils.isEmpty(this.f9203a)) {
            return RPCProxyHost.getInterfaceProxy(cls, this.f9203a);
        }
        return RPCProxyHost.getInterfaceProxy(cls, "GriverAppContainer");
    }
}
