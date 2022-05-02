package com.iap.ac.android.common.account;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import java.util.HashMap;
import java.util.Map;

public enum ACUserInfoManager implements IUserInfoManager {
    INSTANCE;
    
    private static final String EVENT_GET_DEFAULT_IMPL = "ac_common_get_user_info_defalut_impl";
    private static final String EVENT_GET_IMPL_ERROR = "ac_common_get_user_info_impl_error";
    private static final String TAG = "ACUserInfoManager";
    private static IUserInfoManager defaultManager;
    private static IUserInfoManager sUserInfoManager;
    private static final Map<String, IUserInfoManager> userInfoManagerMap = null;

    static {
        userInfoManagerMap = new HashMap();
        defaultManager = new IUserInfoManager() {
            public final ACUserInfo getUserInfo() {
                ACUserInfoManager.noImplementationError();
                return null;
            }

            public final String getOpenId() {
                ACUserInfoManager.noImplementationError();
                return null;
            }

            public final boolean setUserInfo(ACUserInfo aCUserInfo) {
                ACUserInfoManager.noImplementationError();
                return false;
            }
        };
    }

    @NonNull
    public static IUserInfoManager getInstance(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        IUserInfoManager iUserInfoManager = userInfoManagerMap.get(str);
        if (iUserInfoManager == null && (iUserInfoManager = sUserInfoManager) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", str);
            hashMap.put("msg", "Cannot find the implemetation for this bizCode. Using default instead.");
            LogEvent logEvent = new LogEvent(EVENT_GET_DEFAULT_IMPL, hashMap);
            logEvent.bizCode = str;
            ACMonitor.getInstance(str).logEvent(logEvent);
        }
        if (iUserInfoManager != null) {
            return iUserInfoManager;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bizCode", str);
        hashMap2.put(ACMonitor.EVENT_PARAM_KEY_ERROR_MSG, "Cannot find the implemetation for this bizCode.");
        LogEvent logEvent2 = new LogEvent(EVENT_GET_IMPL_ERROR, hashMap2);
        logEvent2.bizCode = str;
        logEvent2.eventType = LogEventType.CRUCIAL_LOG;
        ACMonitor.getInstance(str).logEvent(logEvent2);
        return defaultManager;
    }

    @NonNull
    public static IUserInfoManager getInstance() {
        IUserInfoManager iUserInfoManager = sUserInfoManager;
        if (iUserInfoManager != null) {
            return iUserInfoManager;
        }
        return defaultManager;
    }

    public static void setUserInfoManager(IUserInfoManager iUserInfoManager) {
        sUserInfoManager = iUserInfoManager;
    }

    public static void setUserInfoManager(@NonNull IUserInfoManager iUserInfoManager, @NonNull String str) {
        userInfoManagerMap.put(str, iUserInfoManager);
    }

    public final ACUserInfo getUserInfo() {
        IUserInfoManager iUserInfoManager = sUserInfoManager;
        if (iUserInfoManager != null) {
            return iUserInfoManager.getUserInfo();
        }
        noImplementationError();
        return null;
    }

    public final String getOpenId() {
        IUserInfoManager iUserInfoManager = sUserInfoManager;
        if (iUserInfoManager != null) {
            return iUserInfoManager.getOpenId();
        }
        noImplementationError();
        return null;
    }

    public final boolean setUserInfo(ACUserInfo aCUserInfo) {
        IUserInfoManager iUserInfoManager = sUserInfoManager;
        if (iUserInfoManager != null) {
            return iUserInfoManager.setUserInfo(aCUserInfo);
        }
        noImplementationError();
        return false;
    }

    /* access modifiers changed from: private */
    public static void noImplementationError() {
        ACLog.e(TAG, "No implementation of userInfoManager is found. Please setUserInfoManager first.");
    }
}
