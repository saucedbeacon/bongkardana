package com.alipay.mobile.security.zim.biz;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.log.BehaviourIdEnum;
import com.alipay.mobile.security.bio.log.VerifyBehavior;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

public class RecordProcessor {
    static String KEY_AUTH_REQUEST = "authRequest";
    static String KEY_AUTH_RESPONSE = "authResponse";
    static String KEY_INITPROD_REQUEST = "initProdRequest";
    public static String KEY_INITPROD_RESPONSE = "initProdResponse";
    public static String KEY_VALIDATE_REQUEST = "validateRequest";
    public static String KEY_VALIDATE_RESPONSE = "validateResponse";
    static String KEY_VERIFY_REQUEST = "verifyRequest";
    static String KEY_VERIFY_RESPONSE = "verifyResponse";
    static String KEY_ZIM_EXIT = "zimExit";
    static String KEY_ZIM_START = "zimStart";
    static String KEY_ZTECH_ENRTER = "ztech_enter";
    static String KEY_ZTECH_EXIT = "ztech_exit";
    public static String KEY_ZTECH_RPC_ERROR = "ztech_rpc_error";
    private static RecordProcessor sInstance;
    protected Context mContext;
    private boolean mDestroyable = true;
    protected Map<String, String> mExtParams = new HashMap();
    private MonitorLogService mMonitorLogService;
    private HashMap<String, MetaRecord> mRecords = new HashMap<>();
    private int mRetryId = 0;
    private int mSequenceId = 0;
    private String mUniqueID;
    private ZimRecordService mZimRecordService;

    public MonitorLogService getMonitorLogService() {
        return this.mMonitorLogService;
    }

    public static synchronized RecordProcessor createInstance(Context context) {
        RecordProcessor recordProcessor;
        synchronized (RecordProcessor.class) {
            recordProcessor = new RecordProcessor(context);
            sInstance = recordProcessor;
        }
        return recordProcessor;
    }

    public static RecordProcessor getInstance() {
        return sInstance;
    }

    public RecordProcessor(Context context) {
        if (context instanceof Activity) {
            this.mContext = context.getApplicationContext();
        } else {
            this.mContext = context;
        }
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID().toString());
        sb.append(random.nextInt());
        this.mUniqueID = sb.toString().replace("-", "").toLowerCase();
        this.mExtParams.put("logModelVersion", "V1.0");
        this.mExtParams.put("logPlanId", "ZOLOZ_LOGPLAN_ALIPAYCLOUD_V1");
        this.mExtParams.put("logType", "BI_C_V1");
        HashMap<String, MetaRecord> hashMap = this.mRecords;
        String str = KEY_ZIM_START;
        hashMap.put(str, new MetaRecord("UC-RZHY-170807-01", "event", "20001117", str, 1));
        HashMap<String, MetaRecord> hashMap2 = this.mRecords;
        String str2 = KEY_VERIFY_REQUEST;
        hashMap2.put(str2, new MetaRecord("UC-RZHY-170807-01", "event", "20001117", str2, 1));
        HashMap<String, MetaRecord> hashMap3 = this.mRecords;
        String str3 = KEY_INITPROD_REQUEST;
        hashMap3.put(str3, new MetaRecord("UC-RZHY-170807-02", "event", "20001117", str3, 1));
        HashMap<String, MetaRecord> hashMap4 = this.mRecords;
        String str4 = KEY_INITPROD_RESPONSE;
        hashMap4.put(str4, new MetaRecord("UC-RZHY-170807-03", "event", "20001117", str4, 1));
        HashMap<String, MetaRecord> hashMap5 = this.mRecords;
        String str5 = KEY_AUTH_REQUEST;
        hashMap5.put(str5, new MetaRecord("UC-RZHY-170807-04", "event", "20001117", str5, 1));
        HashMap<String, MetaRecord> hashMap6 = this.mRecords;
        String str6 = KEY_AUTH_RESPONSE;
        hashMap6.put(str6, new MetaRecord("UC-RZHY-170807-05", "event", "20001117", str6, 1));
        HashMap<String, MetaRecord> hashMap7 = this.mRecords;
        String str7 = KEY_VALIDATE_REQUEST;
        hashMap7.put(str7, new MetaRecord("UC-RZHY-170807-06", "event", "20001117", str7, 1));
        HashMap<String, MetaRecord> hashMap8 = this.mRecords;
        String str8 = KEY_VALIDATE_RESPONSE;
        hashMap8.put(str8, new MetaRecord("UC-RZHY-170807-07", "event", "20001117", str8, 1));
        HashMap<String, MetaRecord> hashMap9 = this.mRecords;
        String str9 = KEY_VERIFY_RESPONSE;
        hashMap9.put(str9, new MetaRecord("UC-RZHY-170807-08", "event", "20001117", str9, 1));
        HashMap<String, MetaRecord> hashMap10 = this.mRecords;
        String str10 = KEY_ZIM_EXIT;
        hashMap10.put(str10, new MetaRecord("UC-RZHY-170807-09", "event", "20001117", str10, 1));
        HashMap<String, MetaRecord> hashMap11 = this.mRecords;
        String str11 = KEY_ZTECH_RPC_ERROR;
        hashMap11.put(str11, new MetaRecord("UC-RZHY-170807-10", "event", "20001117", str11, 1));
        HashMap<String, MetaRecord> hashMap12 = this.mRecords;
        String str12 = KEY_ZTECH_ENRTER;
        hashMap12.put(str12, new MetaRecord("UC-RZHY-170807-11", "event", "20001117", str12, 1));
        HashMap<String, MetaRecord> hashMap13 = this.mRecords;
        String str13 = KEY_ZTECH_EXIT;
        hashMap13.put(str13, new MetaRecord("UC-RZHY-170807-11", "event", "20001117", str13, 1));
    }

    public void setUniqueID(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mUniqueID = str;
        }
    }

    public String getUniqueID() {
        return this.mUniqueID;
    }

    public void zimInit(String str) {
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (this.mZimRecordService == null) {
            this.mZimRecordService = (ZimRecordService) currentInstance.getBioService(ZimRecordService.class.getName());
            this.mExtParams.put(HummerConstants.ZIM_ID, str);
            ApSecurityService apSecurityService = (ApSecurityService) currentInstance.getBioService(ApSecurityService.class);
            String apDidToken = apSecurityService != null ? apSecurityService.getApDidToken() : "";
            if (TextUtils.isEmpty(apDidToken)) {
                apDidToken = ApSecurityService.getStaticApDidToken();
            }
            this.mExtParams.put("apdidToken", apDidToken);
            this.mZimRecordService.init(this.mUniqueID, this.mSequenceId, this.mRetryId, this.mExtParams);
            MonitorLogService monitorLogService = this.mMonitorLogService;
            if (monitorLogService != null) {
                monitorLogService.destroy();
                this.mMonitorLogService = null;
            }
        }
    }

    public void addExtProperty(String str, String str2) {
        this.mExtParams.put(str, str2);
        ZimRecordService zimRecordService = this.mZimRecordService;
        if (zimRecordService != null) {
            zimRecordService.addExtProperty(str, str2);
        }
    }

    public void addExtProperties(Map<String, String> map) {
        this.mExtParams.putAll(map);
        ZimRecordService zimRecordService = this.mZimRecordService;
        if (zimRecordService != null) {
            zimRecordService.addExtProperties(map);
        }
    }

    public boolean record(String str) {
        return record(str, (Map<String, String>) null);
    }

    public boolean record(String str, Map<String, String> map) {
        if (this.mRecords.containsKey(str)) {
            return record(this.mRecords.get(str), map);
        }
        return false;
    }

    public boolean record(MetaRecord metaRecord) {
        return record(metaRecord, (Map<String, String>) null);
    }

    public boolean record(MetaRecord metaRecord, Map<String, String> map) {
        JSONObject jSONObject;
        ZimRecordService zimRecordService = this.mZimRecordService;
        if (zimRecordService != null) {
            return zimRecordService.write(metaRecord, map);
        }
        if (this.mMonitorLogService == null) {
            MonitorLogService monitorLogService = (MonitorLogService) BioServiceManager.getLocalService(this.mContext, MonitorLogService.class);
            this.mMonitorLogService = monitorLogService;
            if (monitorLogService == null) {
                new IllegalStateException("mZimRecordService == null && mMonitorLogService == null");
                return false;
            }
            monitorLogService.create((BioServiceManager) null);
        }
        VerifyBehavior verifyBehavior = new VerifyBehavior();
        verifyBehavior.setUserCaseID(metaRecord.getCaseID());
        String actionID = metaRecord.getActionID();
        verifyBehavior.setAppID(metaRecord.getAppID());
        verifyBehavior.setSeedID(metaRecord.getSeedID());
        verifyBehavior.setParam1(this.mUniqueID);
        StringBuilder sb = new StringBuilder();
        int i = this.mSequenceId + 1;
        this.mSequenceId = i;
        sb.append(i);
        verifyBehavior.setParam2(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.mRetryId);
        verifyBehavior.setParam3(sb2.toString());
        verifyBehavior.setBizType(metaRecord.getBizType());
        verifyBehavior.setLoggerLevel(metaRecord.getPriority());
        verifyBehavior.addExtParam("base64", SummaryActivity.CHECKED);
        HashMap hashMap = new HashMap();
        for (String next : this.mExtParams.keySet()) {
            String str = this.mExtParams.get(next);
            if (ZimRecordService.EXCLUDE_EXT_PARAMS.contains(next)) {
                verifyBehavior.addExtParam(next, str);
            } else {
                hashMap.put(next, str);
            }
        }
        verifyBehavior.addExtParam("publicParam", Base64.encodeToString(new JSONObject(hashMap).toString().getBytes(), 2));
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = new JSONObject();
        }
        verifyBehavior.addExtParam("extParam", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        BehaviourIdEnum convert = BehaviourIdEnum.convert(actionID);
        MonitorLogService monitorLogService2 = this.mMonitorLogService;
        if (monitorLogService2 == null) {
            return true;
        }
        monitorLogService2.logBehavior(convert, verifyBehavior);
        return true;
    }

    public void retry() {
        this.mRetryId++;
    }

    public void destroy() {
        this.mExtParams.clear();
        this.mZimRecordService = null;
        this.mRetryId = 0;
        this.mSequenceId = 0;
        MonitorLogService monitorLogService = this.mMonitorLogService;
        if (monitorLogService != null) {
            monitorLogService.destroy();
            this.mMonitorLogService = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void clear() {
        ZimRecordService zimRecordService = this.mZimRecordService;
        if (zimRecordService != null) {
            this.mRetryId = zimRecordService.getRetryID();
            this.mSequenceId = this.mZimRecordService.getSequenceID();
            this.mZimRecordService = null;
        }
    }

    public void setDestroyable(boolean z) {
        this.mDestroyable = z;
    }

    public boolean destroyable() {
        return this.mDestroyable;
    }
}
