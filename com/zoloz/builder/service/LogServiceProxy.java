package com.zoloz.builder.service;

import android.content.Context;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.log.behavior.BehaviourLog;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.common.HummerLogService;
import com.google.firebase.perf.FirebasePerformance;
import com.zoloz.builder.buildconfig.AppUtils;
import com.zoloz.builder.monitor.ZLZCrashHandler;
import java.util.HashMap;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class LogServiceProxy extends HummerLogService {
    public void onCreate(BioServiceManager bioServiceManager) {
        if (this.mContext != null && !sInitialized) {
            initLog(this.mContext);
        }
    }

    private void initLog(Context context) {
        ZLZCommonLog zLZCommonLog = new ZLZCommonLog();
        zLZCommonLog.setLog(AppUtils.isDebug(context));
        BioLog.setLogger(zLZCommonLog);
        HummerLogger.setLogger(zLZCommonLog);
        ZLZCrashHandler.getInstance().enable(context);
        sInitialized = true;
    }

    public void install(Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(279105455, oncanceled);
            onCancelLoad.getMin(279105455, oncanceled);
        }
        if (!sInitialized) {
            initLog(context);
        }
    }

    public void logBehavior(BehaviourIdEnum behaviourIdEnum, VerifyBehavior verifyBehavior) {
        if (verifyBehavior != null) {
            mSequenceId++;
            HashMap hashMap = new HashMap();
            if (verifyBehavior.getExtParams() != null) {
                hashMap.putAll(verifyBehavior.getExtParams());
            }
            String str = FirebasePerformance.HttpMethod.CONNECT.equals(HummerLogService.config.get(HummerConstants.AUTH_TYPE)) ? "connectId" : "ekycId";
            if (HummerLogService.config.containsKey(HummerConstants.HUMMER_ID)) {
                hashMap.put(str, (String) HummerLogService.config.get(HummerConstants.HUMMER_ID));
            } else {
                hashMap.put(str, verifyBehavior.getParam1());
            }
            hashMap.put("buildVersion", "7.0.0.200909163736");
            hashMap.put(HummerConstants.SEQUENCE_ID, Integer.toString(mSequenceId));
            if (HummerLogService.config.containsKey(MessageConstants.KEY_PRODUCT_NAME)) {
                hashMap.put(MessageConstants.KEY_PRODUCT_NAME, (String) HummerLogService.config.get(MessageConstants.KEY_PRODUCT_NAME));
            }
            BehaviourLog behaviourLog = new BehaviourLog();
            behaviourLog.setSeedID(verifyBehavior.getSeedID());
            behaviourLog.setBizType(HummerConstants.BIZ_TYPE);
            for (String str2 : hashMap.keySet()) {
                behaviourLog.putExtParam(str2, (String) hashMap.get(str2));
            }
            LoggerFactory.getLogContext().appendLog(behaviourLog);
        }
    }
}
