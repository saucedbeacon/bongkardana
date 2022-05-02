package com.iap.ac.android.common.log;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.PageLogEvent;
import java.util.HashMap;
import java.util.Map;

public class ACMonitor {
    private static final String EVENT_GET_DEFAULT_IMPL = "ac_common_get_monitor_defalut_impl";
    public static final String EVENT_PARAM_KEY_BIZ_CODE = "bizCode";
    public static final String EVENT_PARAM_KEY_ERROR_MSG = "errorMsg";
    public static final String EVENT_PARAM_KEY_MSG = "msg";
    private static final String TAG = "ACMonitor";
    public static IACMonitor defaultMonitor = new IACMonitor() {
        public final void logEvent(LogEvent logEvent) {
            ACLog.w(ACMonitor.TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        }

        public final void logPageEvent(PageLogEvent pageLogEvent) {
            ACLog.w(ACMonitor.TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        }

        public final void setGlobalParameters(Map<String, String> map) {
            ACLog.w(ACMonitor.TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        }

        public final void flush() {
            ACLog.w(ACMonitor.TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        }
    };
    private static IACMonitor iACMonitor;
    private static final Map<String, IACMonitor> monitorMap = new HashMap();

    @NonNull
    public static IACMonitor getInstance(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return getInstance();
        }
        IACMonitor iACMonitor2 = monitorMap.get(str);
        if (iACMonitor2 == null && (iACMonitor2 = iACMonitor) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("bizCode", str);
            hashMap.put("msg", "Cannot find the implemetation for this bizCode. Using default instead.");
            LogEvent logEvent = new LogEvent(EVENT_GET_DEFAULT_IMPL, hashMap);
            logEvent.bizCode = str;
            iACMonitor2.logEvent(logEvent);
        }
        if (iACMonitor2 != null) {
            return iACMonitor2;
        }
        ACLog.e("ac_common_get_monitor_impl_error", "Can not find any implementation for bizCode:".concat(String.valueOf(str)));
        return defaultMonitor;
    }

    @NonNull
    public static IACMonitor getInstance() {
        IACMonitor iACMonitor2 = iACMonitor;
        if (iACMonitor2 != null) {
            return iACMonitor2;
        }
        return defaultMonitor;
    }

    public static void setACMonitorImpl(@NonNull IACMonitor iACMonitor2) {
        iACMonitor = iACMonitor2;
    }

    public static void setACMonitorImpl(@NonNull IACMonitor iACMonitor2, @NonNull String str) {
        monitorMap.put(str, iACMonitor2);
    }

    public static void logEvent(LogEvent logEvent) {
        IACMonitor iACMonitor2 = iACMonitor;
        if (iACMonitor2 == null) {
            ACLog.w(TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        } else {
            iACMonitor2.logEvent(logEvent);
        }
    }

    public static void logPageEvent(PageLogEvent pageLogEvent) {
        IACMonitor iACMonitor2 = iACMonitor;
        if (iACMonitor2 == null) {
            ACLog.w(TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        } else {
            iACMonitor2.logPageEvent(pageLogEvent);
        }
    }

    public static void setGlobalParameters(Map<String, String> map) {
        IACMonitor iACMonitor2 = iACMonitor;
        if (iACMonitor2 == null) {
            ACLog.w(TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        } else {
            iACMonitor2.setGlobalParameters(map);
        }
    }

    public static void flush() {
        IACMonitor iACMonitor2 = iACMonitor;
        if (iACMonitor2 == null) {
            ACLog.w(TAG, "Cannot find iACMonitor implementation. Please setiACMonitor.");
        } else {
            iACMonitor2.flush();
        }
    }
}
