package com.alipay.mobile.security.bio.common.statistics;

import android.content.Context;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import java.util.HashMap;
import java.util.Map;

public class StatisticsProcessor {
    private static StatisticsProcessor ourInstance;
    private Map<String, String> mGlobalMap;
    private final RecordExtService mRecordExtService;

    public static StatisticsProcessor getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new StatisticsProcessor(context);
        }
        return ourInstance;
    }

    private StatisticsProcessor(Context context) {
        if (BioServiceManager.getCurrentInstance() != null) {
            this.mRecordExtService = (RecordExtService) BioServiceManager.getCurrentInstance().getBioService(RecordExtService.class);
        } else {
            this.mRecordExtService = null;
        }
    }

    public void init(String str) {
        RecordExtService recordExtService = this.mRecordExtService;
        if (recordExtService != null) {
            recordExtService.setUniqueID(str);
        }
    }

    public void setGlobalMap(Map map) {
        if (this.mGlobalMap == null) {
            this.mGlobalMap = new HashMap();
        }
        this.mGlobalMap.putAll(map);
    }

    public void write(RecordExtAction recordExtAction) {
        RecordExtService recordExtService = this.mRecordExtService;
        if (recordExtService != null) {
            Map<String, String> map = this.mGlobalMap;
            if (map != null) {
                recordExtService.write(recordExtAction, map);
            } else {
                recordExtService.write(recordExtAction);
            }
        }
    }

    public void writeWithKey(RecordExtAction recordExtAction, String str, String str2) {
        if (this.mRecordExtService != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            Map<String, String> map = this.mGlobalMap;
            if (map != null) {
                hashMap.putAll(map);
            }
            this.mRecordExtService.write(recordExtAction, hashMap);
        }
    }

    public void writeWithMap(RecordExtAction recordExtAction, Map map) {
        if (this.mRecordExtService != null) {
            Map<String, String> map2 = this.mGlobalMap;
            if (!(map2 == null || map == null)) {
                map.putAll(map2);
            }
            this.mRecordExtService.write(recordExtAction, map);
        }
    }

    public void writeWithKeys(RecordExtAction recordExtAction, String str, String str2, String str3, String str4) {
        if (this.mRecordExtService != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, str2);
            hashMap.put(str3, str4);
            Map<String, String> map = this.mGlobalMap;
            if (map != null) {
                hashMap.putAll(map);
            }
            this.mRecordExtService.write(recordExtAction, hashMap);
        }
    }

    public void release() {
        if (ourInstance != null) {
            ourInstance = null;
        }
    }
}
