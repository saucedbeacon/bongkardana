package com.alipay.iap.android.aplog.misc;

import android.text.TextUtils;
import com.alipay.iap.android.aplog.api.LogHelper;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import com.alipay.iap.android.common.log.IMonitor;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class APLogger implements IMonitor {
    public void performance(String str, String str2, String str3, Map<String, String> map) {
    }

    public void aliveReport() {
        LoggerFactory.getLogContext().appendLog(new AliveReportLog());
    }

    public void behaviour(String str, Map<String, String> map) {
        behaviour(str, (String) null, map);
    }

    public void behaviour(String str, String str2, Map<String, String> map) {
        BehaviourLog behaviourLog = new BehaviourLog();
        behaviourLog.setSeedID(str);
        if (!TextUtils.isEmpty(str2)) {
            behaviourLog.setBizType(str2);
        }
        if (map != null) {
            for (String next : map.keySet()) {
                behaviourLog.putExtParam(next, map.get(next));
            }
        }
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    public void flush() {
        LoggerFactory.getLogContext().flush();
    }

    public void pageOnStart(Object obj, String str) {
        LoggerFactory.getLogContext().getSpmMonitor().pageOnStart(obj, str);
    }

    public void pageOnEnd(Object obj, String str, String str2, Map<String, String> map) {
        LoggerFactory.getLogContext().getSpmMonitor().pageOnEnd(obj, str, str2, map);
    }

    public void pageOnDestroy(Object obj) {
        LoggerFactory.getLogContext().getSpmMonitor().pageOnDestroy(obj);
    }

    public void spmClick(Object obj, String str, String str2, Map<String, String> map) {
        LoggerFactory.getLogContext().getSpmMonitor().spmClick(obj, str, str2, map);
    }

    public void spmExpose(Object obj, String str, String str2, Map<String, String> map) {
        LoggerFactory.getLogContext().getSpmMonitor().spmExpose(obj, str, str2, map);
    }

    public void exception(String str, String str2, Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("exceptionType", str);
        LogHelper.exception(str2, map);
    }

    public void exception(String str, Map<String, String> map) {
        LogHelper.exception(str, map);
    }

    public void performance(String str, String str2, Map<String, String> map) {
        LogHelper.performance(str, str2, map);
    }
}
