package com.iap.ac.android.biz.common.internal.rpc;

import android.os.Build;
import androidx.annotation.NonNull;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.ACConstants;
import com.iap.ac.android.biz.common.risk.RiskControlManager;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.model.RpcExceptionInterceptResult;
import com.iap.ac.android.rpccommon.model.domain.request.BaseRpcRequest;
import com.iap.ac.android.rpccommon.model.facade.MobileEnvInfo;
import java.lang.reflect.Method;
import java.util.HashMap;

public class ACRpcInterceptor implements RpcInterceptor {
    @NonNull
    public MobileEnvInfo generateMobileEnvInfo(MobileEnvInfo mobileEnvInfo) {
        if (mobileEnvInfo == null) {
            mobileEnvInfo = new MobileEnvInfo();
        }
        mobileEnvInfo.tokenId = RiskControlManager.getInstance().getTokenId();
        String str = "";
        mobileEnvInfo.clientIp = str;
        mobileEnvInfo.terminalType = ACConstants.MerchantType.IS_APP;
        mobileEnvInfo.osType = "android";
        mobileEnvInfo.sourcePlatform = "MAIN_APP";
        mobileEnvInfo.osVersion = Build.VERSION.RELEASE;
        mobileEnvInfo.sdkVersion = BuildConfig.VERSION_NAME;
        try {
            str = ACManager.getInstance().getContext().getPackageManager().getPackageInfo(ACManager.getInstance().getContext().getPackageName(), 0).versionName;
        } catch (Exception unused) {
        }
        mobileEnvInfo.appVersion = str;
        mobileEnvInfo.extendInfo = new HashMap();
        mobileEnvInfo.extendInfo.put("instanceId", InstanceInfo.getInstanceId(ACManager.getInstance().getContext()));
        return mobileEnvInfo;
    }

    public Object onAfterReceive(RpcRequest rpcRequest, Object obj, FacadeInvoker facadeInvoker, Method method) {
        return null;
    }

    public void onBeforeSend(RpcRequest rpcRequest) {
        Object obj;
        if (rpcRequest != null && (obj = rpcRequest.request) != null && (obj instanceof BaseRpcRequest)) {
            BaseRpcRequest baseRpcRequest = (BaseRpcRequest) obj;
            baseRpcRequest.envInfo = generateMobileEnvInfo(baseRpcRequest.envInfo);
        }
    }

    public RpcExceptionInterceptResult onExceptionOccurred(RpcRequest rpcRequest, Throwable th, FacadeInvoker facadeInvoker, Method method) {
        return null;
    }
}
