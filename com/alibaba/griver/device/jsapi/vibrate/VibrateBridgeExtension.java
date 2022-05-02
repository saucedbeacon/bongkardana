package com.alibaba.griver.device.jsapi.vibrate;

import android.os.Vibrator;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;

public class VibrateBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9089a = VibrateBridgeExtension.class.getName();

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private static BridgeResponse a(int i) {
        try {
            Vibrator vibrator = (Vibrator) ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate((long) i);
            }
            return BridgeResponse.SUCCESS;
        } catch (Throwable th) {
            RVLogger.e(f9089a, th);
            return BridgeResponse.UNKNOWN_ERROR;
        }
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse vibrateLong() {
        return a(400);
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse vibrate() {
        return a(400);
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse vibrateShort() {
        return a(40);
    }
}
