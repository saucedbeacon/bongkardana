package com.alipay.zoloz.zface.services;

import com.alipay.iap.android.aplog.log.behavior.BehaviorID;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.service.BioService;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import java.util.HashMap;
import java.util.Map;

public class ZFaceRecordService extends BioService {
    public static final String ACTION_END = "actionEnd";
    public static final String ACTION_START = "actionStart";
    public static final String ALERT_APPEAR = "AlertAppear";
    public static final String ALERT_CHOOSE = "AlertChoose";
    public static final String CALLBACK_VERIFY_SYSTEM = "callbackVerifySystem";
    public static final String DETECT_COND_END = "detectCondEnd";
    public static final String DETECT_COND_START = "detectCondStart";
    public static final String ENTER_DETECTION_END = "EnterDetectionEnd";
    public static final String ENTER_DETECTION_START = "EnterDetectionStart";
    public static final String ENTRY_SDK = "entrySDK";
    public static final String EXIT_SDK = "exitSDK";
    public static final String FACE_INFO_KEY = "faceInfoKey";
    public static final String FACE_SLICE = "faceSlice";
    public static final String FACE_STATUS_CHANGE = "faceStatusChange";
    public static final String IMAGE_CAPTURE_END = "imageCaptureEnd";
    public static final String IMAGE_CAPTURE_START = "imageCaptureStart";
    public static final String LIVEBODY_END = "livebodyEnd";
    public static final String LIVEBODY_START = "livebodyStart";
    public static final String NOTICE_EXIT_SDK = "noticeExitSDK";
    public static final String POSE_END = "poseEnd";
    public static final String POSE_START = "poseStart";
    public static final String PROMPT_COPY_POINT = "actionPrompt";
    public static final String TOYGER_FACE_FPS = "ztech_toyger_face_fps";
    public static final String UPLOAD_AVARRIABLE = "uploadAvarriable";
    public static final String UPLOAD_END = "uploadEnd";
    public static final String UPLOAD_START = "uploadStart";
    public static final String ZFACE_TECH_ENTER = "ztech_enter";
    public static final String ZFACE_TECH_EXIT = "ztech_exit";
    protected HashMap<String, MetaRecord> mRecordMap;
    private ZimRecordService mZimRecordService;

    public void onCreate(BioServiceManager bioServiceManager) {
        super.onCreate(bioServiceManager);
        HashMap<String, MetaRecord> hashMap = new HashMap<>();
        this.mRecordMap = hashMap;
        hashMap.put(ENTRY_SDK, new MetaRecord("UC-YWRLSB-161114-01", "event", "20000189", ENTRY_SDK, 1));
        this.mRecordMap.put(ENTER_DETECTION_START, new MetaRecord("UC-YWRLSB-161114-07", BehaviorID.OPENPAGE, "20000189", "enterDetectionStart", 1));
        this.mRecordMap.put(ENTER_DETECTION_END, new MetaRecord("UC-YWRLSB-161114-08", "event", "20000189", "enterDetectionEnd", 1));
        this.mRecordMap.put(DETECT_COND_START, new MetaRecord("UC-YWRLSB-161114-09", "event", "20000189", DETECT_COND_START, 1));
        this.mRecordMap.put(DETECT_COND_END, new MetaRecord("UC-YWRLSB-161114-10", "event", "20000189", DETECT_COND_END, 1));
        this.mRecordMap.put(POSE_START, new MetaRecord("UC-YWRLSB-161114-11", "event", "20000189", POSE_START, 1));
        this.mRecordMap.put(POSE_END, new MetaRecord("UC-YWRLSB-161114-12", "event", "20000189", POSE_END, 1));
        this.mRecordMap.put(LIVEBODY_START, new MetaRecord("UC-YWRLSB-161114-13", "event", "20000189", LIVEBODY_START, 1));
        this.mRecordMap.put(LIVEBODY_END, new MetaRecord("UC-YWRLSB-161114-14", "event", "20000189", LIVEBODY_END, 1));
        this.mRecordMap.put("uploadStart", new MetaRecord("UC-YWRLSB-161114-15", "event", "20000189", "imageUploadStart", 1));
        this.mRecordMap.put("uploadEnd", new MetaRecord("UC-YWRLSB-161114-16", "event", "20000189", "imageUploadEnd", 1));
        this.mRecordMap.put("actionPrompt", new MetaRecord("UC-YWRLSB-161114-17", "event", "20000189", "actionPrompt", 3, "2"));
        this.mRecordMap.put(FACE_SLICE, new MetaRecord("UC-YWRLSB-161114-18", "event", "20000189", FACE_SLICE, 1, "2"));
        this.mRecordMap.put(ALERT_APPEAR, new MetaRecord("UC-YWRLSB-161114-21", "event", "20000189", ZdocRecordService.ALERT_APPEAR, 1));
        this.mRecordMap.put(ALERT_CHOOSE, new MetaRecord("UC-YWRLSB-161114-22", "event", "20000189", ZdocRecordService.ALERT_CHOOSE, 1));
        this.mRecordMap.put(CALLBACK_VERIFY_SYSTEM, new MetaRecord("UC-YWRLSB-161114-23", "event", "20000189", CALLBACK_VERIFY_SYSTEM, 1));
        this.mRecordMap.put(EXIT_SDK, new MetaRecord("UC-YWRLSB-161114-24", "event", "20000189", EXIT_SDK, 1));
        this.mRecordMap.put(UPLOAD_AVARRIABLE, new MetaRecord("UC-YWRLSB-161114-25", "event", "20000189", "uploadAvailable", 1));
        this.mRecordMap.put(NOTICE_EXIT_SDK, new MetaRecord("UC-YWRLSB-161114-26", "event", "20000189", NOTICE_EXIT_SDK, 1));
        this.mRecordMap.put(IMAGE_CAPTURE_START, new MetaRecord("UC-YWRLSB-161114-30", "event", "20000189", IMAGE_CAPTURE_START, 1));
        this.mRecordMap.put(IMAGE_CAPTURE_END, new MetaRecord("UC-YWRLSB-161114-31", "event", "20000189", IMAGE_CAPTURE_END, 1));
        this.mRecordMap.put(TOYGER_FACE_FPS, new MetaRecord("UC-YWRLSB-161114-32", "event", "20000189", TOYGER_FACE_FPS, 1));
        this.mRecordMap.put("ztech_enter", new MetaRecord("UC-YWRLSB-161114-33", "event", "20000189", "ztech_enter", 1));
        this.mRecordMap.put("ztech_exit", new MetaRecord("UC-YWRLSB-161114-34", "event", "20000189", "ztech_exit", 1));
        this.mRecordMap.put(ACTION_START, new MetaRecord("UC-YWRLSB-161114-35", "event", "20000189", ACTION_START, 1));
        this.mRecordMap.put(ACTION_END, new MetaRecord("UC-YWRLSB-161114-36", "event", "20000189", ACTION_END, 1));
        this.mRecordMap.put(FACE_STATUS_CHANGE, new MetaRecord("UC-YWRLSB-161114-37", "event", "20000189", FACE_STATUS_CHANGE, 1));
        this.mRecordMap.put(FACE_INFO_KEY, new MetaRecord("UC-YWRLSB-161114-38", "event", "20000189", FACE_INFO_KEY, 1));
        this.mZimRecordService = (ZimRecordService) bioServiceManager.getBioService(ZimRecordService.class);
    }

    public void write(String str) {
        write(str, (Map<String, String>) null);
    }

    public void addExtProperties(Map<String, String> map) {
        this.mZimRecordService.addExtProperties(map);
    }

    public void write(String str, Map<String, String> map) {
        MetaRecord metaRecord = this.mRecordMap.get(str);
        if (metaRecord == null) {
            StringBuilder sb = new StringBuilder("UC-YWRLSB-161114-");
            sb.append(str.hashCode());
            metaRecord = new MetaRecord(sb.toString(), "event", "20000189", str, 1);
        }
        this.mZimRecordService.write(metaRecord, map);
    }

    public void retry() {
        this.mZimRecordService.retry();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}
