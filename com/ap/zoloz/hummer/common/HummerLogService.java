package com.ap.zoloz.hummer.common;

import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import java.util.HashMap;
import java.util.Map;

public abstract class HummerLogService extends MonitorLogService {
    public static Map<String, Object> config = new HashMap();
    protected static int mSequenceId;

    public abstract void logBehavior(BehaviourIdEnum behaviourIdEnum, VerifyBehavior verifyBehavior);

    public static void reset() {
        mSequenceId = 0;
        config.clear();
    }
}
