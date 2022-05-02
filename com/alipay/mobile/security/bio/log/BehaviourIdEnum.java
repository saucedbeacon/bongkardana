package com.alipay.mobile.security.bio.log;

import com.alipay.iap.android.aplog.log.behavior.BehaviorID;
import com.alipay.zoloz.toyger.blob.BlobStatic;

public enum BehaviourIdEnum {
    NONE("none"),
    EVENT("event"),
    CLICKED(BehaviorID.CLICK),
    OPENPAGE(BehaviorID.OPENPAGE),
    LONGCLICKED(BehaviorID.LONGCLICK),
    DYNAMICLOADTOCHECK("dynamicLoadToCheck"),
    AUTO_CLICKED("auto_clicked"),
    AUTO_OPENPAGE(BehaviorID.AUTOOPENPAGE),
    SUBMITED(BehaviorID.SUBMITE),
    BIZLAUNCHED("bizLaunched"),
    ERROR("error"),
    EXCEPTION("exception"),
    SETGESTURE("setGesture"),
    CHECKGESTURE("checkGesture"),
    SLIDED(BehaviorID.SLIDE),
    MONITOR(BlobStatic.INVTP_TYPE_MONITOR),
    EXECCOMMAND("execCommand"),
    MONITORPERF("monitorPerf");
    
    private String desc;

    private BehaviourIdEnum(String str) {
        this.desc = str;
    }

    public final String getDes() {
        return this.desc;
    }

    public static BehaviourIdEnum convert(String str) {
        for (BehaviourIdEnum behaviourIdEnum : values()) {
            if (behaviourIdEnum.desc.equals(str)) {
                return behaviourIdEnum;
            }
        }
        return NONE;
    }
}
