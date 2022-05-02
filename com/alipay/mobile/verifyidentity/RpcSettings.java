package com.alipay.mobile.verifyidentity;

import android.text.TextUtils;
import com.alipay.fc.riskcloud.biz.mic.rpc.ICRpcService;
import com.alipay.iap.android.common.rpcintegration.RPCProxyHost;
import com.alipay.mobile.common.rpc.RpcInvokeContext;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.framework.service.common.RpcService;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.http.HttpGetSettings;

public class RpcSettings {
    private static String sGwUrl;

    public static void setGwUrl(String str) {
        sGwUrl = str;
    }

    public static ICRpcService retrieveRpcService() {
        try {
            if (RequestConstants.HOST_CHANNEL == 1) {
                return HttpGetSettings.getInstance();
            }
        } catch (Exception unused) {
        }
        try {
            Class.forName("com.alipay.mobile.framework.MicroApplicationContext");
            Class.forName("com.alipay.mobile.framework.service.common.RpcService");
            RpcService rpcService = (RpcService) LauncherApplicationAgent.getInstance().getMicroApplicationContext().findServiceByInterface(RpcService.class.getName());
            ICRpcService iCRpcService = (ICRpcService) rpcService.getRpcProxy(ICRpcService.class);
            RpcInvokeContext rpcInvokeContext = rpcService.getRpcInvokeContext(iCRpcService);
            if (rpcInvokeContext != null && !TextUtils.isEmpty(sGwUrl)) {
                rpcInvokeContext.setGwUrl(sGwUrl);
            }
            return iCRpcService;
        } catch (ClassNotFoundException unused2) {
            return (ICRpcService) RPCProxyHost.getInterfaceProxy(ICRpcService.class);
        }
    }
}
