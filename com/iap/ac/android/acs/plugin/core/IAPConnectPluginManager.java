package com.iap.ac.android.acs.plugin.core;

import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.biz.auth.AuthResultObserverManager;
import com.iap.ac.android.biz.common.model.AuthResult;
import com.iap.ac.android.common.log.ACLog;

public class IAPConnectPluginManager {
    private static final String TAG = "IAPConnectPlugin";
    private static volatile IAPConnectPluginManager sInstance;

    private IAPConnectPluginManager() {
    }

    public static IAPConnectPluginManager getInstance() {
        if (sInstance == null) {
            synchronized (IAPConnectPluginManager.class) {
                if (sInstance == null) {
                    sInstance = new IAPConnectPluginManager();
                }
            }
        }
        return sInstance;
    }

    public void notifyAuthResult(@Nullable AuthResult authResult) {
        ACLog.d("IAPConnectPlugin", "IAPConnectPluginManager#notifyAuthCode, authResult: ".concat(String.valueOf(authResult)));
        AuthResultObserverManager.notifyAuthResult(authResult);
    }
}
