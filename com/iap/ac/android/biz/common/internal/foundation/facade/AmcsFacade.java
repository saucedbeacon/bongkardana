package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import com.alibaba.griver.base.common.constants.AMCSConstants;
import com.alibaba.griver.base.common.constants.SecurityConstants;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.d.e;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.rpc.AmcsRpcUtils;
import com.iap.ac.config.lite.utils.ConfigUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class AmcsFacade extends BaseFacade {
    public static boolean mInitialized = false;

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1635023514, oncanceled);
                onCancelLoad.getMin(1635023514, oncanceled);
            }
        }
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            if (!Utils.checkClassExist(AMCSConstants.AMCS_LITE_MAIN_CLASS) || !Utils.checkClassExist("com.iap.ac.config.lite.ConfigCenterContext") || !Utils.checkClassExist("com.iap.ac.config.lite.rpc.AmcsRpcUtils") || !Utils.checkClassExist("com.iap.ac.config.lite.utils.ConfigUtils") || !Utils.checkClassExist("com.iap.ac.android.rpc.multigateway.RpcGatewayController")) {
                ACLog.e(Constants.TAG, "AMCS init error, without dependent libraries");
                return;
            }
            ConfigCenter instance = ConfigCenter.getInstance(str);
            RpcAppInfo rpcAppInfo = new RpcAppInfo();
            rpcAppInfo.rpcGateWayUrl = commonConfig.amcsGatewayUrl;
            if ("SANDBOX".equals(commonConfig.envType)) {
                rpcAppInfo.appId = String.format(CommonConfig.SANDBOXMOCK, new Object[]{commonConfig.appId});
                StringBuilder sb = new StringBuilder();
                sb.append(rpcAppInfo.appId);
                sb.append("_ANDROID");
                rpcAppInfo.appKey = sb.toString();
            } else {
                rpcAppInfo.appId = commonConfig.appId;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(commonConfig.appId);
                sb2.append("_ANDROID");
                rpcAppInfo.appKey = sb2.toString();
            }
            rpcAppInfo.authCode = e.a(context, SecurityConstants.DEFAULT_AUTH_CODE, commonConfig.envType, commonConfig.gpSignature);
            rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, commonConfig.getWorkspaceId());
            ConfigCenterContext configCenterContext = new ConfigCenterContext(context, rpcAppInfo, commonConfig.envType, "", commonConfig.appId);
            AmcsRpcUtils.initializeRpcGateway(RpcGatewayController.getGatewayController(str), configCenterContext.getRpcProfile(), commonConfig.envType);
            instance.initialize(configCenterContext);
            ConfigUtils.setConfigProxy(str);
            ACLog.i(Constants.TAG, String.format("AMCS(%s,%s) component initialize finish", new Object[]{this.mBizCode, commonConfig.envType}));
            mInitialized = true;
            ConfigCenter.getInstance(str).refreshConfig();
        }
    }

    public boolean isInitialized() {
        return mInitialized;
    }
}
