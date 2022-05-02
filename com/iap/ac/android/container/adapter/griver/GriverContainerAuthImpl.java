package com.iap.ac.android.container.adapter.griver;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.iap.ac.android.common.container.auth.IContainerAuth;
import java.util.HashMap;
import java.util.Map;

public class GriverContainerAuthImpl implements IContainerAuth {
    private static final String TAG = "GriverContainerAuthImpl";

    public Map<String, Boolean> getDeviceAuthSetting(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            RVLogger.d(TAG, "appId or userId is null");
            return null;
        }
        HashMap hashMap = new HashMap();
        AuthenticationProxy authenticationProxy = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
        if (authenticationProxy != null) {
            return authenticationProxy.getAllPermissions(str2, str, (AppModel) null, "");
        }
        RVLogger.d(TAG, "getSetting, service is null");
        return hashMap;
    }
}
