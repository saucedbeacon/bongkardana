package com.alipay.mobile.security.bio.common.record.impl;

import android.util.Base64;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.StringUtil;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class ZimRecordServiceImpl extends ZimRecordService {
    public static final String LOG_CLASSIFIERS = "log_classifiers";
    public static final String ZOLOZ_RECORDS = "zoloz_records";
    protected Map<String, String> mExtParams = new Hashtable();
    private final Set<String> mLogClassifiers = new HashSet(Arrays.asList(MetaRecord.DEFAULT_LOG_CLASSIFIERS.split("#")));
    private MonitorLogService mMonitorLogService;
    protected int mRetryID = -1;
    protected int mSequenceID = 0;
    protected String mUniqueID = "";

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        this.mMonitorLogService = (MonitorLogService) bioServiceManager.getBioService(MonitorLogService.class);
    }

    public boolean write(MetaRecord metaRecord) {
        return write(metaRecord, (Map<String, String>) null);
    }

    public boolean write(MetaRecord metaRecord, Map<String, String> map) {
        JSONObject jSONObject;
        if (metaRecord != null && this.mLogClassifiers.contains(metaRecord.getClassifier())) {
            VerifyBehavior verifyBehavior = new VerifyBehavior();
            verifyBehavior.setUserCaseID(metaRecord.getCaseID());
            String actionID = metaRecord.getActionID();
            verifyBehavior.setAppID(metaRecord.getAppID());
            verifyBehavior.setSeedID(metaRecord.getSeedID());
            verifyBehavior.setParam1(this.mUniqueID);
            StringBuilder sb = new StringBuilder();
            int i = this.mSequenceID + 1;
            this.mSequenceID = i;
            sb.append(i);
            verifyBehavior.setParam2(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.mRetryID);
            verifyBehavior.setParam3(sb2.toString());
            verifyBehavior.setBizType(metaRecord.getBizType());
            verifyBehavior.setLoggerLevel(metaRecord.getPriority());
            verifyBehavior.addExtParam("base64", SummaryActivity.CHECKED);
            HashMap hashMap = new HashMap();
            for (String next : this.mExtParams.keySet()) {
                String str = this.mExtParams.get(next);
                if (EXCLUDE_EXT_PARAMS.contains(next)) {
                    verifyBehavior.addExtParam(next, str);
                } else {
                    hashMap.put(next, str);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(hashMap);
            verifyBehavior.addExtParam("publicParam", Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            if (map != null) {
                jSONObject = new JSONObject();
                jSONObject.putAll(map);
            } else {
                jSONObject = new JSONObject();
            }
            verifyBehavior.addExtParam("extParam", Base64.encodeToString(jSONObject.toJSONString().getBytes(), 2));
            BehaviourIdEnum convert = BehaviourIdEnum.convert(actionID);
            MonitorLogService monitorLogService = this.mMonitorLogService;
            if (monitorLogService == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getClass().getName());
                sb3.append(".write(");
                sb3.append(metaRecord);
                sb3.append(") failed. MonitorLogService==null");
                new RuntimeException(sb3.toString());
            } else {
                monitorLogService.logBehavior(convert, verifyBehavior);
                return true;
            }
        }
        return false;
    }

    public void init(String str, int i, int i2, Map<String, String> map) {
        this.mUniqueID = str;
        this.mSequenceID = i;
        this.mRetryID = i2;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                if (!(next == null || next.getKey() == null || next.getValue() == null)) {
                    this.mExtParams.put(next.getKey(), next.getValue());
                }
            }
        }
        StringUtil.map2String(this.mExtParams);
    }

    public void addExtProperty(String str, String str2) {
        this.mExtParams.put(str, str2);
    }

    public void addExtProperties(Map<String, String> map) {
        this.mExtParams.putAll(map);
    }

    public String getUniqueID() {
        return this.mUniqueID;
    }

    public int getSequenceID() {
        return this.mSequenceID;
    }

    public int getRetryID() {
        return this.mRetryID;
    }

    public void retry() {
        this.mRetryID++;
    }

    public void setLogClassifier(Set<String> set) {
        if (set != null) {
            this.mLogClassifiers.clear();
            this.mLogClassifiers.addAll(set);
        }
    }

    public Map<String, String> getExtProperties() {
        return this.mExtParams;
    }
}
