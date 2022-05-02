package com.alipay.plus.push.core;

import android.app.Application;
import androidx.annotation.NonNull;
import com.alipay.plus.push.core.model.PushSource;
import com.alipay.plus.push.core.pushservice.IPushService;

public class PushServiceInstance {
    private static final String TAG = PushServiceInstance.class.getSimpleName();
    private static IPushServiceManager iPushServiceManager;

    public static IPushService create(@NonNull Application application, @NonNull PushSource pushSource) {
        if (iPushServiceManager == null) {
            iPushServiceManager = new PushServiceManager();
        }
        if (application == null || pushSource == null) {
            return null;
        }
        iPushServiceManager.init(application, pushSource);
        return iPushServiceManager.getPushService();
    }

    public static IPushService getPushService() {
        return iPushServiceManager.getPushService();
    }
}
