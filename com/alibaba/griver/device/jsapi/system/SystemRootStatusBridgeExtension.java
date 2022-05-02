package com.alibaba.griver.device.jsapi.system;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.AOMPDeviceUtils;
import com.alibaba.griver.device.proxy.RVCommonAbilityProxy;
import id.dana.sendmoney.summary.SummaryActivity;

public class SystemRootStatusBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9088a = SystemRootStatusBridgeExtension.class.getSimpleName();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse isSystemRoot(@BindingApiContext ApiContext apiContext) {
        String str = "false";
        RVCommonAbilityProxy rVCommonAbilityProxy = (RVCommonAbilityProxy) RVProxy.get(RVCommonAbilityProxy.class);
        if (rVCommonAbilityProxy == null || !rVCommonAbilityProxy.hasRootStatusPermission(apiContext.getAppId())) {
            return new BridgeResponse.NamedValue("isSystemRoot", "unknow");
        }
        try {
            if (AOMPDeviceUtils.isRooted()) {
                str = SummaryActivity.CHECKED;
            }
        } catch (Exception e) {
            RVLogger.e(f9088a, (Throwable) e);
        }
        return new BridgeResponse.NamedValue("isSystemRoot", str);
    }
}
