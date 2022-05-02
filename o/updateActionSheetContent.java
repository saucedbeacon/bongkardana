package o;

import android.text.TextUtils;
import com.alipay.iap.android.common.log.MonitorWrapper;
import id.dana.data.base.NetworkException;
import java.util.HashMap;
import java.util.Map;

public final class updateActionSheetContent {
    private static final String EXCEPTION_TYPE = "exceptionType";
    private static final String MESSAGE = "message";
    private static final String TRACE_ID = "traceId";

    public static void d(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void i(String str, String str2) {
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void v(String str, String str2) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    public static void w(String str, Throwable th) {
    }

    private updateActionSheetContent() {
    }

    public static void exception(String str, String str2, String str3) {
        exception(str, str2, str3, "");
    }

    public static void exception(String str, String str2, String str3, String str4) {
        sendLog(str, getParam(str2, str3, str4));
    }

    private static Map<String, String> getParam(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(EXCEPTION_TYPE, str);
        hashMap.put("message", str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(TRACE_ID, str3);
        }
        return hashMap;
    }

    private static void sendLog(String str, Map<String, String> map) {
        MonitorWrapper.exception(str, map);
        logLocalExceptionLog(str, map);
    }

    public static void logNetworkException(String str, String str2, Throwable th) {
        if (th instanceof NetworkException) {
            NetworkException networkException = (NetworkException) th;
            exception(str, str2, networkException.getMessage(), networkException.getTraceId());
            return;
        }
        exception(str, str2, th.getMessage());
        e(str, str2, th);
    }

    private static void logLocalExceptionLog(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb.append("[");
            sb.append((String) next.getKey());
            sb.append(": ");
            sb.append((String) next.getValue());
            sb.append("] ");
        }
        e(str, sb.toString());
    }

    public static void exception(String str, String str2, String str3, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(EXCEPTION_TYPE, str2);
        map.put("message", str3);
        MonitorWrapper.exception(str, map);
        logLocalExceptionLog(str, map);
    }

    public static void behaviorAndLog(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", str2);
        MonitorWrapper.behaviour(str, hashMap);
    }

    public static void behaviour(String str, String str2, Map<String, String> map) {
        MonitorWrapper.behaviour(str, str2, map);
    }
}
