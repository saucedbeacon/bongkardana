package com.alipay.iap.android.aplog.api;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.apm.ApmLog;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import com.alipay.iap.android.aplog.log.exception.ExceptionLog;
import com.alipay.iap.android.aplog.log.performance.PerformanceID;
import com.alipay.iap.android.aplog.log.performance.PerformanceLog;
import java.util.HashMap;
import java.util.Map;

public class LogHelper {
    @Deprecated
    public static void Behaviour(Context context, String str, String str2) {
        BehaviourLog behaviourLog = new BehaviourLog(context);
        behaviourLog.setSeedID(str);
        behaviourLog.setSourceID(str2);
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    @Deprecated
    public static void Behaviour(Context context, String str, String str2, String str3, String str4) {
        BehaviourLog behaviourLog = new BehaviourLog(context);
        behaviourLog.setSeedID(str);
        behaviourLog.setSourceID(str2);
        behaviourLog.setStartTime(str3);
        behaviourLog.setEndTime(str4);
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    public static void Behaviour(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        BehaviourLog behaviourLog = new BehaviourLog(context);
        behaviourLog.setSeedID(str);
        behaviourLog.setParam1(str2);
        behaviourLog.setParam2(str3);
        behaviourLog.setParam3(str4);
        behaviourLog.putAllExtParam(map);
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    public static void Behaviour(BehaviourLog.Builder builder) {
        LoggerFactory.getLogContext().appendLog(builder.build());
    }

    public static void Alive() {
        LoggerFactory.getLogContext().appendLog(new AliveReportLog());
    }

    @Deprecated
    public static void performance(String str, String str2, String str3, String str4, Map<String, String> map) {
        PerformanceLog performanceLog = new PerformanceLog();
        performanceLog.setPerformanceID(PerformanceID.MONITORPOINT_PERFORMANCE);
        performanceLog.setBizType(str);
        performanceLog.setParam1(str2);
        performanceLog.setParam2(str3);
        performanceLog.setParam3(str4);
        performanceLog.putAllExtParam(map);
        LoggerFactory.getLogContext().appendLog(performanceLog);
    }

    public static void performance(String str, String str2, Map<String, String> map) {
        PerformanceLog performanceLog = new PerformanceLog();
        performanceLog.setPerformanceIdDesc(str);
        performanceLog.setBizType(str2);
        performanceLog.putAllExtParam(map);
        LoggerFactory.getLogContext().appendLog(performanceLog);
    }

    @Deprecated
    public static void performance(PerformanceLog performanceLog) {
        LoggerFactory.getLogContext().appendLog(performanceLog);
    }

    public static void apm(String str, String str2, Throwable th, Map<String, String> map) {
        ApmLog apmLog = new ApmLog();
        apmLog.setBizType(str2);
        apmLog.setType(str);
        apmLog.setCause(th);
        apmLog.putAllExtParam(map);
        LoggerFactory.getLogContext().appendLog(apmLog);
    }

    public static void exception(String str, Map<String, String> map) {
        ExceptionLog exceptionLog = new ExceptionLog();
        if (map == null) {
            map = new HashMap<>();
        }
        String remove = map.remove("exceptionType");
        if (TextUtils.isEmpty(remove)) {
            remove = "keybiztrace";
        }
        exceptionLog.setExceptionType(remove);
        exceptionLog.setEx((Throwable) null);
        map.put("bizType", str);
        exceptionLog.putAllExtParam(map);
        LoggerFactory.getLogContext().appendLog(exceptionLog);
    }
}
