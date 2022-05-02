package com.alipay.iap.android.aplog.util;

import android.content.Context;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.AliveReportLog;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;

@Deprecated
public class LogHelper {
    public static void Behaviour(Context context, String str, String str2) {
        BehaviourLog behaviourLog = new BehaviourLog(context);
        behaviourLog.setSeedID(str).setSourceID(str2);
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    public static void Behaviour(Context context, String str, String str2, String str3, String str4) {
        BehaviourLog behaviourLog = new BehaviourLog(context);
        behaviourLog.setSeedID(str).setSourceID(str2);
        behaviourLog.setStartTime(str3);
        behaviourLog.setEndTime(str4);
        LoggerFactory.getLogContext().appendLog(behaviourLog);
    }

    public static void Alive() {
        LoggerFactory.getLogContext().appendLog(new AliveReportLog());
    }
}
