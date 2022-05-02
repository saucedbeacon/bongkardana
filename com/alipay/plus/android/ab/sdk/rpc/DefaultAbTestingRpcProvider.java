package com.alipay.plus.android.ab.sdk.rpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.plus.android.ab.sdk.facade.AbTestingFacade;
import com.alipay.plus.android.ab.sdk.facade.request.AbTestingRequest;
import com.alipay.plus.android.ab.sdk.facade.result.AbTestingResponse;
import com.alipay.plus.android.config.sdk.a.e;

public class DefaultAbTestingRpcProvider implements AbTestingRpcProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10729a = e.a("DefaultAbTestingRpcProvider");

    @Nullable
    public AbTestingResponse fetchVariation(@NonNull AbTestingRequest abTestingRequest) throws Throwable {
        LoggerWrapper.i(f10729a, "execute fetch AB variation without customize setting.");
        return ((AbTestingFacade) RPCProxyHost.getInterfaceProxy(AbTestingFacade.class)).getVariation(abTestingRequest);
    }
}
