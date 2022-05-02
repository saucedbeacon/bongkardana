package com.alipay.iap.android.aplog.log.behavior;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.util.IntUtil;
import com.alipay.iap.android.aplog.util.TraceIdUtil;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class BehaviourLog extends AbTestLog {
    private String behaviourID;
    private BehaviourPageInfo behaviourPageInfo;
    private String bizType;
    private String logCategory;
    private int loggerLevel;
    private String param1;
    private String param2;
    private String param3;
    private String seedID;
    private String sourceID;

    public static class Builder {
        private final BehaviourLog behaviourLog;

        public Builder() {
            this.behaviourLog = new BehaviourLog();
        }

        public Builder(Context context) {
            this.behaviourLog = new BehaviourLog(context);
        }

        public Builder(Fragment fragment) {
            this.behaviourLog = new BehaviourLog(fragment);
        }

        public Builder setBehaviourID(String str) {
            this.behaviourLog.setBehaviourID(str);
            return this;
        }

        public Builder setLoggerLevel(int i) {
            this.behaviourLog.setLoggerLevel(i);
            return this;
        }

        public Builder setBizType(String str) {
            this.behaviourLog.setBizType(str);
            return this;
        }

        public Builder setEndTime(String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(1265116453, oncanceled);
                onCancelLoad.getMin(1265116453, oncanceled);
            }
            this.behaviourLog.setEndTime(str);
            return this;
        }

        public Builder setLogCategory(String str) {
            this.behaviourLog.setLogCategory(str);
            return this;
        }

        public Builder setParam1(String str) {
            this.behaviourLog.setParam1(str);
            return this;
        }

        public Builder setParam2(String str) {
            this.behaviourLog.setParam2(str);
            return this;
        }

        public Builder setParam3(String str) {
            this.behaviourLog.setParam3(str);
            return this;
        }

        public Builder setSeedID(String str) {
            this.behaviourLog.setSeedID(str);
            return this;
        }

        public Builder setSourceID(String str) {
            this.behaviourLog.setSourceID(str);
            return this;
        }

        public Builder setStartTime(String str) {
            this.behaviourLog.setStartTime(str);
            return this;
        }

        public Builder putExtParam(String str, String str2) {
            this.behaviourLog.putExtParam(str, str2);
            return this;
        }

        public Builder addAllExtParam(Map<String, String> map) {
            if (map != null && map.size() > 0) {
                for (String next : map.keySet()) {
                    putExtParam(next, map.get(next));
                }
            }
            return this;
        }

        public BehaviourLog build() {
            return this.behaviourLog;
        }

        public Builder setPageId(String str) {
            this.behaviourLog.getBehaviourPageInfo().setPageID(str);
            return this;
        }

        public Builder setLastPage(String str) {
            this.behaviourLog.getBehaviourPageInfo().setLastPage(str);
            return this;
        }

        public Builder setAbTestInfo(String str) {
            this.behaviourLog.setAbTestInfo(str);
            return this;
        }
    }

    public BehaviourLog() {
        this.logCategory = LogCategory.LOG_BEHAVIOUR_MANUAL;
        this.behaviourID = "event";
        this.loggerLevel = 2;
        this.behaviourPageInfo = new BehaviourPageInfo();
        generateSequenceID();
    }

    public BehaviourLog(Context context) {
        this.logCategory = LogCategory.LOG_BEHAVIOUR_MANUAL;
        this.behaviourID = "event";
        this.loggerLevel = 2;
        initLog();
        if (context instanceof Activity) {
            String c10to64 = IntUtil.c10to64(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder();
            sb.append(context.getClass().getName());
            sb.append(TraceIdUtil.UNDERLINE);
            sb.append(LoggerFactory.getLogContext().getDeviceID());
            sb.append(TraceIdUtil.UNDERLINE);
            sb.append(c10to64);
            String obj = sb.toString();
            this.behaviourPageInfo.setPageID(obj);
            setSeedID(context.getClass().getName());
            this.behaviourPageInfo.setViewID(context.getClass().getName());
            LoggerFactory.getLogContext().addPage(obj);
        }
    }

    public BehaviourLog(Fragment fragment) {
        this.logCategory = LogCategory.LOG_BEHAVIOUR_MANUAL;
        this.behaviourID = "event";
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

    public BehaviourLog setSeedID(String str) {
        this.seedID = str;
        return this;
    }

    public BehaviourPageInfo getBehaviourPageInfo() {
        return this.behaviourPageInfo;
    }

    public BehaviourLog setBehaviourPageInfo(BehaviourPageInfo behaviourPageInfo2) {
        this.behaviourPageInfo = behaviourPageInfo2;
        return this;
    }

    public String getLogCategory() {
        return this.logCategory;
    }

    public BehaviourLog setLogCategory(String str) {
        this.logCategory = str;
        return this;
    }

    public String getBehaviourID() {
        return this.behaviourID;
    }

    public BehaviourLog setBehaviourID(String str) {
        this.behaviourID = str;
        return this;
    }

    public int getLoggerLevel() {
        return this.loggerLevel;
    }

    public BehaviourLog setLoggerLevel(int i) {
        this.loggerLevel = i;
        return this;
    }

    public String getSourceID() {
        return this.sourceID;
    }

    public BehaviourLog setSourceID(String str) {
        this.sourceID = str;
        return this;
    }

    public void setStartTime(String str) {
        this.behaviourPageInfo.setEndTime(str);
    }

    public void setEndTime(String str) {
        this.behaviourPageInfo.setEndTime(str);
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public String getParam1() {
        return this.param1;
    }

    public void setParam1(String str) {
        this.param1 = str;
    }

    public String getParam2() {
        return this.param2;
    }

    public void setParam2(String str) {
        this.param2 = str;
    }

    public String getParam3() {
        return this.param3;
    }

    public void setParam3(String str) {
        this.param3 = str;
    }
}
