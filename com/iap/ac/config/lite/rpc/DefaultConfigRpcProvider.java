package com.iap.ac.config.lite.rpc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.delegate.ConfigRpcProvider;
import com.iap.ac.config.lite.facade.config.AmcsConfigRpcFacade;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigByKeysRpcV1Request;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcRequest;
import com.iap.ac.config.lite.facade.request.AmcsConfigRpcV1Request;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;

public class DefaultConfigRpcProvider implements ConfigRpcProvider {
    private static final String b = e.b("DefaultConfigRpcProvider");

    /* renamed from: a  reason: collision with root package name */
    private String f9825a;

    private AmcsConfigRpcFacade a() {
        if (!TextUtils.isEmpty(this.f9825a)) {
            return (AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class, this.f9825a);
        } else if (RPCProxyHost.isRpcProxyExist(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE)) {
            return (AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class, AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
        } else {
            return (AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class);
        }
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfig(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest) throws Exception {
        ACLog.i(b, String.format("DefaultConfigRpcProvider with bizCode [%s]. fetchConfig", new Object[]{this.f9825a}));
        return a().fetchConfig(amcsConfigRpcRequest);
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfigByKeys(@NonNull AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest) throws Exception {
        ACLog.i(b, String.format("DefaultConfigRpcProvider with bizCode [%s]. fetchConfigByKeys", new Object[]{this.f9825a}));
        return a().fetchConfigListByKeys(amcsConfigByKeysRpcRequest);
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfigByKeysV1(@NonNull AmcsConfigByKeysRpcV1Request amcsConfigByKeysRpcV1Request) throws Exception {
        ACLog.i(b, String.format("DefaultConfigRpcProvider with bizCode [%s]. fetchConfigByKeysV1", new Object[]{this.f9825a}));
        return a().fetchConfigListByKeysV1(amcsConfigByKeysRpcV1Request);
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfigV1(@NonNull AmcsConfigRpcV1Request amcsConfigRpcV1Request) throws Exception {
        ACLog.i(b, String.format("DefaultConfigRpcProvider with bizCode [%s]. fetchConfigV1", new Object[]{this.f9825a}));
        return a().fetchConfigV1(amcsConfigRpcV1Request);
    }

    public void setBizCode(String str) {
        this.f9825a = str;
    }
}
