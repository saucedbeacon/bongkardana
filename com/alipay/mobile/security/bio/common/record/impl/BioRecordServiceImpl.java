package com.alipay.mobile.security.bio.common.record.impl;

import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioRecordService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.SignHelper;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Hashtable;
import java.util.Map;

public class BioRecordServiceImpl extends BioRecordService {
    private static final String INIT_SEQUENCE_ID_KEY = "sequence_id";
    protected Map<String, String> mParam4 = new Hashtable();
    protected int mSequenceId = 0;
    protected String mUniqueID = "";
    private MonitorLogService monitorLogService;
    protected Object objLock = new Object();

    public void onDestroy() {
    }

    public BioRecordServiceImpl() {
        StringBuilder sb = new StringBuilder("");
        sb.append(System.currentTimeMillis());
        sb.append(Math.round(10000.0f));
        this.mUniqueID = SignHelper.SHA1(sb.toString());
        synchronized (this.objLock) {
            if (this.mParam4 != null) {
                this.mParam4.clear();
            }
        }
    }

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        this.monitorLogService = (MonitorLogService) bioServiceManager.getBioService(MonitorLogService.class);
    }

    /* access modifiers changed from: protected */
    public String getExtParam4() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtParam:");
        synchronized (this.objLock) {
            if (this.mParam4 != null) {
                for (Map.Entry next : this.mParam4.entrySet()) {
                    Object key = next.getKey();
                    Object value = next.getValue();
                    StringBuilder sb2 = new StringBuilder(AUScreenAdaptTool.PREFIX_ID);
                    sb2.append(key);
                    sb2.append(SimpleComparison.EQUAL_TO_OPERATION);
                    sb2.append(value);
                    sb.append(sb2.toString());
                }
            }
        }
        return sb.toString();
    }

    protected static void addExtParam(Map<String, String> map, Map<String, String> map2) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                Object value = next.getValue();
                if (!(key == null || value == null)) {
                    map2.put(key.toString(), value.toString());
                }
            }
        }
    }

    public void write(MetaRecord metaRecord) {
        superWrite(metaRecord);
        if (metaRecord != null) {
            VerifyBehavior verifyBehavior = new VerifyBehavior();
            verifyBehavior.setUserCaseID(metaRecord.getCaseID());
            String actionID = metaRecord.getActionID();
            verifyBehavior.setAppID(metaRecord.getAppID());
            verifyBehavior.setSeedID(metaRecord.getSeedID());
            verifyBehavior.setParam1(this.mUniqueID);
            verifyBehavior.setParam2(metaRecord.getParam2());
            verifyBehavior.setParam3(metaRecord.getParam3());
            verifyBehavior.setBizType(metaRecord.getBizType());
            verifyBehavior.setLoggerLevel(metaRecord.getPriority());
            addExtParam(verifyBehavior, this.mParam4);
            addExtParam(verifyBehavior, metaRecord.getParam4());
            BehaviourIdEnum convert = BehaviourIdEnum.convert(actionID);
            MonitorLogService monitorLogService2 = this.monitorLogService;
            if (monitorLogService2 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(getClass().getName());
                sb.append(".write(");
                sb.append(metaRecord);
                sb.append(") failed. MonitorLogService==null");
                new RuntimeException(sb.toString());
                return;
            }
            monitorLogService2.logBehavior(convert, verifyBehavior);
        }
    }

    private void addExtParam(VerifyBehavior verifyBehavior, Map<String, String> map) {
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Object key = next.getKey();
                Object value = next.getValue();
                if (!(key == null || value == null)) {
                    verifyBehavior.addExtParam(key.toString(), value.toString());
                }
            }
        }
    }

    public void superWrite(MetaRecord metaRecord) {
        synchronized (this.objLock) {
            if (metaRecord != null) {
                metaRecord.setParam1(this.mUniqueID);
                if (metaRecord.isEnableSequence()) {
                    int i = this.mSequenceId + 1;
                    this.mSequenceId = i;
                    metaRecord.setSequenceId(i);
                    Map<String, String> map = this.mParam4;
                    StringBuilder sb = new StringBuilder("");
                    sb.append(this.mSequenceId);
                    map.put(INIT_SEQUENCE_ID_KEY, sb.toString());
                } else {
                    this.mParam4.remove(INIT_SEQUENCE_ID_KEY);
                }
            }
        }
    }

    public String getUniqueID() {
        return this.mUniqueID;
    }

    public void setUniqueID(String str) {
        this.mUniqueID = str;
    }

    public void setExtProperty(Map<String, String> map) {
        synchronized (this.objLock) {
            addExtParam(map, this.mParam4);
        }
    }

    public int getSequenceID() {
        return this.mSequenceId;
    }
}
