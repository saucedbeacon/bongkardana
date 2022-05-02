package com.alipay.plus.android.config.sdk.trigger;

import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.a.e;

public abstract class ConfigUpdateTrigger {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10766a = e.a("ConfigUpdateTrigger");

    public abstract void startTrigger(@NonNull ConfigCenterContext configCenterContext);

    public void updateConfig() {
        LoggerWrapper.d(f10766a, "updateConfig with trigger.");
        ConfigCenter instance = ConfigCenter.getInstance();
        if (!instance.isShutdown()) {
            instance.refreshConfig();
        } else {
            LoggerWrapper.e(f10766a, "ConfigCenter already shutdown. will not trigger update.");
        }
    }
}
