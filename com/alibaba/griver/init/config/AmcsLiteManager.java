package com.alibaba.griver.init.config;

import android.content.Context;
import com.alibaba.griver.init.IAPConfig;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.util.Map;

public class AmcsLiteManager {
    public static void initAmcs(Context context, IAPConfig iAPConfig) {
        ConfigCenter instance = ConfigCenter.getInstance("GriverAppContainer");
        RpcAppInfo rpcAppInfo = new RpcAppInfo();
        rpcAppInfo.rpcGateWayUrl = iAPConfig.getExtra().getGatewayUrl();
        rpcAppInfo.appId = iAPConfig.getAppId();
        rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, iAPConfig.getWorkSpaceId());
        rpcAppInfo.authCode = iAPConfig.getAuthCode();
        ConfigCenterContext configCenterContext = new ConfigCenterContext(context, rpcAppInfo, iAPConfig.getExtra().getEnv(), "", iAPConfig.getWorkSpaceId(), iAPConfig.getAppId(), "GriverAppContainer");
        configCenterContext.setBizCode("GriverAppContainer");
        instance.initialize(configCenterContext);
        ConfigUtils.setConfigProxy("GriverAppContainer");
        instance.refreshConfigWithFrequenceLimit((Map<String, Object>) null);
    }
}
