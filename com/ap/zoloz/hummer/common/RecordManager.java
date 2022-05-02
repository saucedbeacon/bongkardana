package com.ap.zoloz.hummer.common;

import android.content.Context;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.alipay.mobile.verifyidentity.base.message.MessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.Map;

public class RecordManager {
    private static RecordManager sInstance;
    private RecordProcessor mRecordProcessor;

    public static RecordManager getInstance() {
        if (sInstance == null) {
            synchronized (RecordManager.class) {
                if (sInstance == null) {
                    sInstance = new RecordManager();
                }
            }
        }
        return sInstance;
    }

    public void init(Context context, Map<String, String> map) {
        HummerLogService.reset();
        HummerLogService.config.putAll(map);
        String str = map.get(HummerConstants.HUMMER_ID);
        String str2 = map.get("bizId");
        RecordProcessor instance = RecordProcessor.getInstance();
        this.mRecordProcessor = instance;
        if (instance == null) {
            this.mRecordProcessor = RecordProcessor.createInstance(context);
        }
        if (!StringUtil.isNullorEmpty(str)) {
            this.mRecordProcessor.setUniqueID(str);
        } else if (!StringUtil.isNullorEmpty(str2)) {
            this.mRecordProcessor.setUniqueID(str2);
        }
        this.mRecordProcessor.setDestroyable(false);
    }

    public void release() {
        RecordProcessor recordProcessor = this.mRecordProcessor;
        if (recordProcessor != null) {
            recordProcessor.destroy();
            this.mRecordProcessor = null;
        }
        sInstance = null;
    }

    public void record(String str, Map<String, String> map) {
        RecordProcessor recordProcessor = this.mRecordProcessor;
        if (recordProcessor != null) {
            recordProcessor.record(new MetaRecord("", "event", "20001117", str, 1), map);
        }
    }

    public void record(String str, Map<String, String> map, String str2) {
        HummerLogService.config.put(MessageConstants.KEY_PRODUCT_NAME, str2);
        record(str, map);
    }

    public void triggerUpload() {
        RecordProcessor recordProcessor = this.mRecordProcessor;
        if (recordProcessor != null && recordProcessor.getMonitorLogService() != null) {
            this.mRecordProcessor.getMonitorLogService().trigUpload();
        }
    }
}
