package com.alipay.plus.android.config.sdk.rpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.delegate.ConfigRpcProvider;
import com.alipay.plus.android.config.sdk.facade.config.AmcsConfigRpcFacade;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysRpcRequest;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;

public class DefaultConfigRpcProvider implements ConfigRpcProvider {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10761a = e.a("DefaultConfigRpcProvider");

    @Nullable
    public AmcsConfigRpcResult fetchApps(@NonNull AmcsConfigByKeysLiteRpcRequest amcsConfigByKeysLiteRpcRequest) throws Throwable {
        return ((AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class)).fetchLiteConfigByKeys(amcsConfigByKeysLiteRpcRequest);
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfig(@NonNull AmcsConfigRpcRequest amcsConfigRpcRequest, @Nullable String str) throws Throwable {
        LoggerWrapper.i(f10761a, "DefaultConfigRpcProvider. distributionName: ".concat(String.valueOf(str)));
        AmcsConfigRpcFacade amcsConfigRpcFacade = (AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class);
        if (AmcsRpcUtils.isGrayscaleService(str)) {
            return amcsConfigRpcFacade.fetchConfigListGrayscale(amcsConfigRpcRequest);
        }
        if (AmcsRpcUtils.isMdsService(str)) {
            return ConfigCenter.getInstance().getConfigContext().isUseExternalOperationType() ? amcsConfigRpcFacade.fetchConfigListExternal(amcsConfigRpcRequest) : amcsConfigRpcFacade.fetchConfigList(amcsConfigRpcRequest);
        }
        throw new FetchException("Cannot find distributionName method for:".concat(String.valueOf(str)));
    }

    @Nullable
    public AmcsConfigRpcResult fetchConfigByKeys(@NonNull AmcsConfigByKeysRpcRequest amcsConfigByKeysRpcRequest, @Nullable String str) throws Throwable {
        LoggerWrapper.i(f10761a, "DefaultConfigRpcProvider. distributionName: ".concat(String.valueOf(str)));
        AmcsConfigRpcFacade amcsConfigRpcFacade = (AmcsConfigRpcFacade) RPCProxyHost.getInterfaceProxy(AmcsConfigRpcFacade.class);
        if (AmcsRpcUtils.isGrayscaleService(str)) {
            return amcsConfigRpcFacade.fetchConfigListByKeys(amcsConfigByKeysRpcRequest);
        }
        if (AmcsRpcUtils.isMdsService(str)) {
            throw new FetchException(String.format("Cannot use this %s method for fetchConfigByKeys", new Object[]{str}));
        }
        throw new FetchException("Cannot find distributionName method for:".concat(String.valueOf(str)));
    }
}
