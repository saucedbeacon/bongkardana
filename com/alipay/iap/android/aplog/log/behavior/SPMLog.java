package com.alipay.iap.android.aplog.log.behavior;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.util.IntUtil;
import com.alipay.iap.android.aplog.util.TraceIdUtil;

public class SPMLog extends AbTestLog {
    private BehaviourPageInfo behaviourPageInfo;
    private String bizType;
    private String logcategory = LogCategory.LOG_SPM;
    private String refer;
    private String seedID;

    public SPMLog(String str) {
        initLog();
        this.seedID = str;
        String c10to64 = IntUtil.c10to64(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(TraceIdUtil.UNDERLINE);
        sb.append(LoggerFactory.getLogContext().getDeviceID());
        sb.append(TraceIdUtil.UNDERLINE);
        sb.append(c10to64);
        String obj = sb.toString();
        this.behaviourPageInfo.setPageID(obj);
        LoggerFactory.getLogContext().addSPMPage(obj);
    }

    private void initLog() {
        this.behaviourPageInfo = new BehaviourPageInfo();
        generateSequenceID();
        BehaviourPageInfo behaviourPageInfo2 = this.behaviourPageInfo;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        behaviourPageInfo2.setStartTime(sb.toString());
        this.behaviourPageInfo.setLastPage(LoggerFactory.getLogContext().getLastSPMPage());
    }

    public String getLogCategory() {
        return this.logcategory;
    }

    public BehaviourPageInfo getBehaviourPageInfo() {
        return this.behaviourPageInfo;
    }

    public void setBehaviourPageInfo(BehaviourPageInfo behaviourPageInfo2) {
        this.behaviourPageInfo = behaviourPageInfo2;
    }

    public void setEndTime(String str) {
        BehaviourPageInfo behaviourPageInfo2 = this.behaviourPageInfo;
        if (behaviourPageInfo2 != null) {
            behaviourPageInfo2.setEndTime(str);
        }
    }

    public void setStartTime(String str) {
        BehaviourPageInfo behaviourPageInfo2 = this.behaviourPageInfo;
        if (behaviourPageInfo2 != null) {
            behaviourPageInfo2.setStartTime(str);
        }
    }

    public String getSeedID() {
        return this.seedID;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public String getRefer() {
        return this.refer;
    }

    public void setRefer(String str) {
        this.refer = str;
    }

    public void setPageID(String str) {
        this.behaviourPageInfo.setPageID(str);
    }
}
