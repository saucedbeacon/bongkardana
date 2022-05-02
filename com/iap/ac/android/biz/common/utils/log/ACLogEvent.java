package com.iap.ac.android.biz.common.utils.log;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.BuildConfig;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.PayResultCode;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.common.log.ACMonitor;
import com.iap.ac.android.common.log.event.LogEvent;
import com.iap.ac.android.common.log.event.LogEventType;
import java.util.HashMap;
import java.util.Map;

public class ACLogEvent {

    /* renamed from: a  reason: collision with root package name */
    public String f9689a;
    public String b;
    public LogEventType c = LogEventType.BEHAVIOR_LOG;
    public Map<String, String> d;

    public ACLogEvent(String str, String str2) {
        this.b = str2;
        this.f9689a = str;
    }

    public static void commonEvent(String str, long j, Result result) {
        LogResult logResult;
        if (result != null) {
            logResult = new LogResult();
            logResult.resultCode = result.resultCode;
            logResult.resultMessage = result.resultMessage;
        } else {
            logResult = null;
        }
        commonEvent(str, j, logResult);
    }

    public static void commonFailEvent(String str, String str2, String str3, String str4, long j) {
        newLogger(str, str2).addParams("result", "F").addParams("resultCode", str3).addParams("resultMessage", str4).addParams("timeCost", String.valueOf(j)).event();
    }

    public static void commonRpcFailEvent(String str, String str2, String str3, String str4, long j, String str5) {
        newLogger(str, str2).addParams("result", "F").addParams("resultCode", str3).addParams("resultMessage", str4).addParams("timeCost", String.valueOf(j)).addParams("traceId", str5).event();
    }

    public static void commonRpcSuccessEvent(String str, String str2, long j, String str3) {
        newLogger(str, str2).addParams("result", DiskFormatter.TB).addParams("timeCost", String.valueOf(j)).addParams("traceId", str3).event();
    }

    public static void commonSuccessEvent(String str, String str2, long j) {
        newLogger(str, str2).addParams("result", DiskFormatter.TB).addParams("timeCost", String.valueOf(j)).event();
    }

    public static void crucialEvent(String str, String str2, String str3) {
        newLogger(str, str2).addParams("resultMessage", str3).addParams("sdkVersion", BuildConfig.VERSION_NAME).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void crucialRpcEvent(String str, String str2, String str3, String str4) {
        newLogger(str, str2).addParams("resultMessage", str3).addParams("traceId", str4).addParams("sdkVersion", BuildConfig.VERSION_NAME).setEventType(LogEventType.CRUCIAL_LOG).event();
    }

    public static void exceptionLog(String str) {
        newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_exception").addParams("result", "F").addParams("resultCode", ResultCode.UNKNOWN_EXCEPTION).addParams("resultMessage", str).event();
    }

    public static void failEvent(String str, long j, @NonNull Result result) {
        newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", "F").addParams("resultCode", result.resultCode).addParams("resultMessage", result.resultMessage).addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j)).event();
    }

    public static ACLogEvent newLogger(String str, long j, Result result) {
        if (result != null && ("SUCCESS".equals(result.resultCode) || PayResultCode.PAY_SUCCESS.equals(result.resultCode))) {
            return newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", DiskFormatter.TB).addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j));
        }
        return newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", "F").addParams("resultCode", result != null ? result.resultCode : ResultCode.INVALID_NETWORK).addParams("resultMessage", result != null ? result.resultMessage : "Oops! System busy. Try again later!").addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j));
    }

    public static void successEvent(String str, long j) {
        newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", DiskFormatter.TB).addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j)).event();
    }

    public ACLogEvent addAll(Map<String, String> map) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.putAll(map);
        return this;
    }

    public ACLogEvent addParams(String str, String str2) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, str2);
        return this;
    }

    public void event() {
        LogEvent logEvent = new LogEvent(this.b, this.d);
        logEvent.bizCode = this.f9689a;
        logEvent.eventType = this.c;
        ACMonitor.getInstance("ac_biz").logEvent(logEvent);
    }

    public ACLogEvent setEventType(LogEventType logEventType) {
        this.c = logEventType;
        return this;
    }

    public static void commonEvent(String str, long j, LogResult logResult) {
        if (logResult == null || (!"SUCCESS".equals(logResult.resultCode) && !PayResultCode.PAY_SUCCESS.equals(logResult.resultCode))) {
            ACLogEvent addParams = newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", "F").addParams("resultCode", logResult != null ? logResult.resultCode : ResultCode.INVALID_NETWORK).addParams("resultMessage", logResult != null ? logResult.resultMessage : "Oops! System busy. Try again later!").addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j));
            if (logResult != null && !TextUtils.isEmpty(logResult.traceId)) {
                addParams.addParams("traceId", logResult.traceId);
            }
            addParams.event();
            return;
        }
        ACLogEvent addParams2 = newLogger(MultiLanguageLogger.BIZCODE_CENTER, str).addParams("result", DiskFormatter.TB).addParams("timeCost", String.valueOf(SystemClock.elapsedRealtime() - j));
        if (!TextUtils.isEmpty(logResult.traceId)) {
            addParams2.addParams("traceId", logResult.traceId);
        }
        addParams2.event();
    }

    public ACLogEvent addParams(String str, Object obj) {
        return addParams(str, String.valueOf(obj));
    }

    public static ACLogEvent newLogger(String str, String str2) {
        return new ACLogEvent(str, str2);
    }
}
