package com.alipay.iap.android.aplog.log.behavior;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.util.IntUtil;
import com.alipay.iap.android.aplog.util.TraceIdUtil;

public class AutoBehaviourLog extends AbTestLog {
    private String behaviourID;
    private BehaviourPageInfo behaviourPageInfo;
    private String logCategory;
    private int loggerLevel;
    private String seedID;
    private String sourceID;

    public AutoBehaviourLog() {
        this.behaviourID = BehaviorID.AUTOOPENPAGE;
        this.logCategory = LogCategory.LOG_BEHAVIOUR_AUTO;
        this.loggerLevel = 2;
        this.behaviourPageInfo = new BehaviourPageInfo();
        generateSequenceID();
    }

    public AutoBehaviourLog(Context context) {
        this.behaviourID = BehaviorID.AUTOOPENPAGE;
        this.logCategory = LogCategory.LOG_BEHAVIOUR_AUTO;
        this.loggerLevel = 2;
        initLog();
        if (context instanceof Activity) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getClass().getName());
            sb.append("_");
            sb.append(LoggerFactory.getLogContext().getDeviceID());
            sb.append("_");
            sb.append(IntUtil.c10to64(System.currentTimeMillis()));
            String obj = sb.toString();
            this.behaviourPageInfo.setPageID(obj);
            setSeedID(context.getClass().getName());
            this.behaviourPageInfo.setViewID(context.getClass().getName());
            LoggerFactory.getLogContext().addPage(obj);
        }
    }

    public AutoBehaviourLog(Fragment fragment) {
        this.behaviourID = BehaviorID.AUTOOPENPAGE;
        this.logCategory = LogCategory.LOG_BEHAVIOUR_AUTO;
        this.loggerLevel = 2;
        initLog();
        if (fragment != null) {
            String c10to64 = IntUtil.c10to64(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append(fragment.getActivity().getClass().toString());
            sb.append(TraceIdUtil.UNDERLINE);
            sb.append(LoggerFactory.getLogContext().getDeviceID());
            sb.append(TraceIdUtil.UNDERLINE);
            sb.append(c10to64);
            String obj = sb.toString();
            this.behaviourPageInfo.setPageID(obj);
            setSeedID(fragment.getActivity().getClass().toString());
            this.behaviourPageInfo.setViewID(fragment.getActivity().getClass().toString());
            LoggerFactory.getLogContext().addPage(obj);
        }
    }

    private void initLog() {
        this.behaviourPageInfo = new BehaviourPageInfo();
        generateSequenceID();
        BehaviourPageInfo behaviourPageInfo2 = this.behaviourPageInfo;
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        behaviourPageInfo2.setStartTime(sb.toString());
        this.behaviourPageInfo.setLastPage(LoggerFactory.getLogContext().getLastPage());
    }

    public String getSeedID() {
        return this.seedID;
    }

    public AutoBehaviourLog setSeedID(String str) {
        this.seedID = str;
        return this;
    }

    public BehaviourPageInfo getBehaviourPageInfo() {
        return this.behaviourPageInfo;
    }

    public void setBehaviourPageInfo(BehaviourPageInfo behaviourPageInfo2) {
        this.behaviourPageInfo = behaviourPageInfo2;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public AutoBehaviourLog setLogCategory(String str) {
        this.logCategory = str;
        return this;
    }

    public String getBehaviourID() {
        return this.behaviourID;
    }

    public AutoBehaviourLog setBehaviourID(String str) {
        this.behaviourID = str;
        return this;
    }

    public int getLoggerLevel() {
        return this.loggerLevel;
    }

    public AutoBehaviourLog setLoggerLevel(int i) {
        this.loggerLevel = i;
        return this;
    }

    public String getSourceID() {
        return this.sourceID;
    }

    public AutoBehaviourLog setSourceID(String str) {
        this.sourceID = str;
        return this;
    }

    public void setStartTime(String str) {
        this.behaviourPageInfo.setEndTime(str);
    }

    public void setEndTime(String str) {
        this.behaviourPageInfo.setEndTime(str);
    }
}
