package com.alibaba.griver.device.jsapi.phone;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.utils.CommonUtils;

public class MakePhoneCallBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9080a = MakePhoneCallBridgeExtension.class.getName();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private static void a(Activity activity, Intent intent) {
        if (intent != null && activity != null) {
            try {
                activity.startActivity(intent);
            } catch (Exception e) {
                RVLogger.e(f9080a, "startActivity exception", e);
            }
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse makePhoneCall(@BindingParam({"number"}) String str) {
        if (TextUtils.isEmpty(str)) {
            return BridgeResponse.INVALID_PARAM;
        }
        StringBuilder sb = new StringBuilder("tel:");
        sb.append(Uri.encode(str));
        Uri parseUrl = CommonUtils.parseUrl(sb.toString());
        if (parseUrl == null) {
            return BridgeResponse.INVALID_PARAM;
        }
        Intent intent = new Intent("android.intent.action.VIEW", parseUrl);
        intent.setFlags(268435456);
        try {
            a(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getTopActivity().get(), intent);
            return BridgeResponse.SUCCESS;
        } catch (Throwable unused) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
    }
}
