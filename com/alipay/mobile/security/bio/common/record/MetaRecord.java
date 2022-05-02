package com.alipay.mobile.security.bio.common.record;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class MetaRecord {
    public static final String BIZ_TYPE = "Biometrics";
    public static final String DEFAULT_LOG_CLASSIFIERS = "1#2";
    public static final String LOG_SEPARATOR = "#";
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = 3;
    public static final int PRIORITY_MIDDLE = 2;
    private String actionID;
    private String appID;
    private String bizType = BIZ_TYPE;
    private String caseID;
    private String classifier = "1";
    private boolean enableSequence = true;
    private String param1 = "";
    private String param2 = "";
    private String param3 = "";
    private Map<String, String> param4;
    private int priority = 2;
    private String seedID;
    private int sequenceId;

    public MetaRecord() {
    }

    public MetaRecord(String str, String str2, String str3, String str4) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
    }

    public MetaRecord(String str, String str2, String str3, String str4, String str5) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
        this.classifier = str5;
    }

    public MetaRecord(String str, String str2, String str3, String str4, int i) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
        this.priority = i;
    }

    public MetaRecord(String str, String str2, String str3, String str4, int i, String str5) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
        this.priority = i;
        this.classifier = str5;
    }

    public MetaRecord(String str, String str2, String str3, String str4, boolean z) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
        this.enableSequence = z;
    }

    public MetaRecord(String str, String str2, String str3, String str4, boolean z, int i) {
        this.caseID = str;
        this.actionID = str2;
        this.appID = str3;
        this.seedID = str4;
        this.enableSequence = z;
        this.priority = i;
    }

    public String getCaseID() {
        return this.caseID;
    }

    public void setCaseID(String str) {
        this.caseID = str;
    }

    public String getActionID() {
        return this.actionID;
    }

    public void setActionID(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1876751619, oncanceled);
            onCancelLoad.getMin(1876751619, oncanceled);
        }
        this.actionID = str;
    }

    public String getAppID() {
        return this.appID;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public String getSeedID() {
        return this.seedID;
    }

    public void setSeedID(String str) {
        this.seedID = str;
    }

    public int getSequenceId() {
        return this.sequenceId;
    }

    public void setSequenceId(int i) {
        this.sequenceId = i;
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

    public Map<String, String> getParam4() {
        return this.param4;
    }

    public void setParam4(Map<String, String> map) {
        this.param4 = map;
    }

    public boolean isEnableSequence() {
        return this.enableSequence;
    }

    public void setEnableSequence(boolean z) {
        this.enableSequence = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("caseID:");
        sb2.append(this.caseID);
        sb2.append("#");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("actionID:");
        sb3.append(this.actionID);
        sb3.append("#");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("appID:");
        sb4.append(this.appID);
        sb4.append("#");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("seedID:");
        sb5.append(this.seedID);
        sb5.append("#");
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder("bizType:");
        sb6.append(this.bizType);
        sb6.append("#");
        sb.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder("priority:");
        sb7.append(this.priority);
        sb7.append("#");
        sb.append(sb7.toString());
        StringBuilder sb8 = new StringBuilder("classifier:");
        sb8.append(this.classifier);
        sb8.append("#");
        sb.append(sb8.toString());
        StringBuilder sb9 = new StringBuilder("param1:");
        sb9.append(this.param1);
        sb9.append("#");
        sb.append(sb9.toString());
        StringBuilder sb10 = new StringBuilder("param2:");
        sb10.append(this.param2);
        sb10.append("#");
        sb.append(sb10.toString());
        StringBuilder sb11 = new StringBuilder("param3:");
        sb11.append(this.param3);
        sb11.append("#");
        sb.append(sb11.toString());
        sb.append("param4:");
        Map<String, String> map = this.param4;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                Object value = next.getValue();
                StringBuilder sb12 = new StringBuilder(AUScreenAdaptTool.PREFIX_ID);
                sb12.append(key);
                sb12.append(SimpleComparison.EQUAL_TO_OPERATION);
                sb12.append(value);
                sb.append(sb12.toString());
            }
        }
        return sb.toString();
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public void setClassifier(String str) {
        this.classifier = str;
    }
}
