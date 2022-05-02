package com.zoloz.android.phone.zdoc.service;

import com.alipay.iap.android.aplog.log.behavior.BehaviorID;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import java.util.HashMap;
import java.util.Map;

public class ZdocRecordService extends BioService {
    public static final String ACTION_PROMPT = "actionPrompt";
    public static final String ACTIVE_EXIT = "active_exit";
    public static final String ALERT_APPEAR = "alertAppear";
    public static final String ALERT_CHOOSE = "alertChoose";
    public static final String APDIDTOKEN = "apdidToken";
    public static final String AUTH_CHECK = "authCheck";
    public static final String AUTH_CHECK_RESULT = "authCheckResult";
    public static final String BACKSTAGE_INTERRUPT = "backstage_interrupt";
    public static final String BASIC_CHECK = "basicCheck";
    public static final String BISTOKEN = "bisToken";
    public static final String CAMERA_ERROR = "camera_error";
    public static final String CAPTURE_MODE = "captureMode";
    public static final String CAPTURE_RESULT = "captureResult";
    public static final String CLICK_ALERT = "clickAlert";
    public static final String CLICK_BUTTON = "clickButton";
    public static final String CLICK_ITEM = "clickItem";
    public static final String COMPRESS_RESULT = "compressResult";
    public static final String DEVICE_BRAND = "deviceBrand";
    public static final String DOC_COPY = "doc_copyreject";
    public static final String DOC_INCOMPLETE = "doc_incomplete";
    public static final String DOC_NO_DETECT = "doc_nodetect";
    public static final String DOC_REFLECTION = "doc_reflection";
    public static final String DOC_TYPE = "docType";
    public static final String DOC_VAGUE = "doc_vague";
    public static final String END_SCAN = "endScan";
    public static final String END_ZDOC = "endZdoc";
    public static final String FRAME_SIZE_WH = "ztech_zdoc_frame_size";
    public static final String GO_BACK = "go_back";
    public static final String MAX_PAGE = "maxPage";
    public static final String NETWORK_ERROR = "network_error";
    public static final String ON_PAGE = "onPage";
    public static final String OVERTIME_ERROR = "overtime_error";
    public static final String OVERTIME_REASON = "overtimeReason";
    public static final String OVER_THRESHOLD = "overThreshold";
    public static final String OVER_THRESHOLD_ERROR = "overthreshold_error";
    public static final String OVER_TIME = "overtime";
    public static final String PAGE_CONTENT = "pageContent";
    public static final String PAGE_NUMBER = "pageNumber";
    public static final String PARAMES = "params";
    public static final String PHOTO_CANCEL = "photo_cancel";
    public static final String PHOTO_CONFIRM = "photo_confirm";
    public static final String POST_COMPRESS_SIZE = "postCompressSize";
    public static final String PRE_COMPRESS_SIZE = "preCompressSize";
    public static final String PRODUCT_ID = "productId";
    public static final String REASON = "reason";
    public static final String RPC_RESULT_CODE = "rpcResultCode";
    public static final String SCAN_OVER_TIME = "scan_overtime";
    public static final String SCAN_RESULT = "scanResult";
    public static final String SCENCE_ID = "sceneId";
    public static final String SDK_VERSION = "sdkVersion";
    public static final String SERVER_QUALITY_ERROR = "serverQuality_error";
    public static final String SERVER_RESULT = "serverResult";
    public static final String START_SCAN = "startScan";
    public static final String START_ZDOC = "startZdoc";
    public static final String SYSTEM_EXCEPTION_ERROR = "systemException_error";
    public static final String TAKE_PHOTO = "take_photo";
    public static final String TECH_SEED = "techSeed";
    public static final String UPLOAD_END = "uploadEnd";
    public static final String UPLOAD_RESULT = "uploadResult";
    public static final String UPLOAD_START = "uploadStart";
    public static final String UPLOAD_TIME = "uploadTime";
    public static final String VALIDATION_RESULT = "validationResult";
    public static final String ZDOC_RESULT = "zdocResult";
    public static final String ZDOC_SCAN_ALGO_RESULT = "aggAlgoResult";
    public static final String ZDOC_SCAN_OVER_TIME = "overTme";
    public static final String ZDOC_SCAN_TASK_END = "endScanTask";
    public static final String ZDOC_SCAN_TASK_START = "startScanTask";
    public static final String ZTECH_ENTER = "ztech_enter";
    public static final String ZTECH_EXIT = "ztech_exit";
    protected HashMap<String, MetaRecord> mRecordMap;
    private ZimRecordService mZimRecordService;

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        HashMap<String, MetaRecord> hashMap = new HashMap<>();
        this.mRecordMap = hashMap;
        hashMap.put(START_ZDOC, new MetaRecord("UC-YWRLSB-161114-01", "event", "20000189", START_ZDOC, 1));
        this.mRecordMap.put(CAPTURE_MODE, new MetaRecord("UC-YWRLSB-161114-02", "event", "20000189", CAPTURE_MODE, 1));
        this.mRecordMap.put(AUTH_CHECK, new MetaRecord("UC-YWRLSB-161114-03", "event", "20000189", AUTH_CHECK, 1));
        this.mRecordMap.put(START_SCAN, new MetaRecord("UC-YWRLSB-161114-04", "event", "20000189", START_SCAN, 1));
        this.mRecordMap.put(BASIC_CHECK, new MetaRecord("UC-YWRLSB-161114-05", "event", "20000189", BASIC_CHECK, 1));
        this.mRecordMap.put(OVER_TIME, new MetaRecord("UC-YWRLSB-161114-06", "event", "20000189", OVER_TIME, 1));
        this.mRecordMap.put(OVER_THRESHOLD, new MetaRecord("UC-YWRLSB-161114-07", "event", "20000189", OVER_THRESHOLD, 1));
        this.mRecordMap.put(COMPRESS_RESULT, new MetaRecord("UC-YWRLSB-161114-08", "event", "20000189", COMPRESS_RESULT, 1));
        this.mRecordMap.put("uploadStart", new MetaRecord("UC-YWRLSB-161114-09", BehaviorID.OPENPAGE, "20000189", "uploadStart", 1));
        this.mRecordMap.put("uploadEnd", new MetaRecord("UC-YWRLSB-161114-10", "event", "20000189", "uploadEnd", 1));
        this.mRecordMap.put(END_ZDOC, new MetaRecord("UC-YWRLSB-161114-11", "event", "20000189", END_ZDOC, 1));
        this.mRecordMap.put(CLICK_BUTTON, new MetaRecord("UC-YWRLSB-161114-12", "event", "20000189", CLICK_BUTTON, 1));
        this.mRecordMap.put(ALERT_APPEAR, new MetaRecord("UC-YWRLSB-161114-13", "event", "20000189", ALERT_APPEAR, 1));
        this.mRecordMap.put(ALERT_CHOOSE, new MetaRecord("UC-YWRLSB-161114-14", "event", "20000189", ALERT_CHOOSE, 1));
        this.mRecordMap.put("actionPrompt", new MetaRecord("UC-YWRLSB-161114-15", "event", "20000189", "actionPrompt", 1));
        this.mRecordMap.put(END_SCAN, new MetaRecord("UC-YWRLSB-161114-16", "event", "20000189", END_SCAN, 1));
        this.mRecordMap.put("techSeed", new MetaRecord("UC-YWRLSB-161114-17", "event", "20000189", "techSeed", 1));
        this.mRecordMap.put(FRAME_SIZE_WH, new MetaRecord("UC-YWRLSB-161114-19", "event", "20000189", FRAME_SIZE_WH, 1));
        this.mRecordMap.put("ztech_enter", new MetaRecord("UC-YWRLSB-161114-20", "event", "20000189", "ztech_enter", 1));
        this.mRecordMap.put("ztech_exit", new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", "ztech_exit", 1));
        this.mRecordMap.put(ZDOC_SCAN_TASK_START, new MetaRecord("UC-YWRLSB-161114-22", "event", "20000189", ZDOC_SCAN_TASK_START, 1));
        this.mRecordMap.put(ZDOC_SCAN_TASK_END, new MetaRecord("UC-YWRLSB-161114-23", "event", "20000189", ZDOC_SCAN_TASK_END, 1));
        this.mRecordMap.put(ZDOC_SCAN_ALGO_RESULT, new MetaRecord("UC-YWRLSB-161114-24", "event", "20000189", ZDOC_SCAN_ALGO_RESULT, 1));
        this.mRecordMap.put(ZDOC_SCAN_OVER_TIME, new MetaRecord("UC-YWRLSB-161114-25", "event", "20000189", ZDOC_SCAN_OVER_TIME, 1));
        this.mZimRecordService = (ZimRecordService) bioServiceManager.getBioService(ZimRecordService.class);
    }

    public void write(String str) {
        write(str, (Map<String, String>) null);
    }

    public void addExtProperties(Map<String, String> map) {
        this.mZimRecordService.addExtProperties(map);
    }

    public void write(String str, Map<String, String> map) {
        this.mZimRecordService.write(this.mRecordMap.get(str), map);
    }

    public void retry() {
        this.mZimRecordService.retry();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
