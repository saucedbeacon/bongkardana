package com.zoloz.android.phone.zdoc.utils;

import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.alipay.zoloz.toyger.doc.ToygerDocState;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import id.dana.lib.gcontainer.app.bridge.subapp.CloseSubAppEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZdocRecordManager {
    private final String TAG;
    private RecordScanAlgoResult algoResult;
    private ArrayList<String> mBasicCheck;
    private int mPageNumber;
    private long mStartTime;
    private ZdocRecordService mZdocRecordService;

    public void destory() {
    }

    public ZdocRecordManager() {
        this.TAG = "ZdocRecord";
        this.mBasicCheck = new ArrayList<>();
        this.mZdocRecordService = null;
        this.mStartTime = 0;
        this.mZdocRecordService = (ZdocRecordService) BioServiceManager.getCurrentInstance().getBioService(ZdocRecordService.class);
    }

    public void updatePageNumber(int i) {
        this.mPageNumber = i;
    }

    public void appendBasicCheck(String str) {
        this.mBasicCheck.add(str);
    }

    public void recordBasicCheck() {
        ArrayList<String> arrayList = this.mBasicCheck;
        if (arrayList != null && arrayList.size() > 0) {
            HashMap hashMap = new HashMap(2);
            hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
            hashMap.put("pageContent", Arrays.toString(this.mBasicCheck.toArray()));
            ZdocRecordService zdocRecordService = this.mZdocRecordService;
            if (zdocRecordService != null) {
                zdocRecordService.write(ZdocRecordService.BASIC_CHECK, hashMap);
            }
            this.mBasicCheck.clear();
        }
    }

    public void recordUploadEnd(int i, int i2, int i3) {
        HashMap hashMap = new HashMap();
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put(ZdocRecordService.UPLOAD_RESULT, Integer.toString(i));
        hashMap.put(ZdocRecordService.VALIDATION_RESULT, Integer.toString(i2));
        hashMap.put(ZdocRecordService.SERVER_RESULT, Integer.toString(i3));
        hashMap.put("uploadTime", String.valueOf(System.currentTimeMillis() - this.mStartTime));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write("uploadEnd", hashMap);
        }
    }

    public void recordUploadStart(long j) {
        this.mStartTime = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put("payload", String.valueOf(((float) j) / 1024.0f));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write("uploadStart", hashMap);
        }
    }

    public void recordAlertAppear(String str) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put(ZdocRecordService.REASON, str);
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.ALERT_APPEAR, hashMap);
        }
    }

    public void recordAlertChoose(String str, String str2) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put("pageContent", str);
        hashMap.put(ZdocRecordService.CLICK_ALERT, str2);
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.ALERT_CHOOSE, hashMap);
        }
    }

    public void recordAuthCheck(int i) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(ZdocRecordService.AUTH_CHECK_RESULT, Integer.toString(i));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.AUTH_CHECK, hashMap);
        }
        if (i == 0) {
            recordAlertAppear(ZdocRecordService.CAMERA_ERROR);
        }
    }

    public void recordClickButton(String str, String str2) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put(ZdocRecordService.ON_PAGE, str);
        hashMap.put(ZdocRecordService.CLICK_ITEM, str2);
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.CLICK_BUTTON, hashMap);
        }
    }

    public void recordOverTime() {
        HashMap hashMap = new HashMap(2);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        hashMap.put(ZdocRecordService.OVERTIME_REASON, ZdocRecordService.SCAN_OVER_TIME);
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.OVER_TIME, hashMap);
        }
    }

    public void recordEndScan(boolean z) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.END_SCAN, hashMap);
        }
    }

    public void recordStartScan() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.START_SCAN, hashMap);
        }
    }

    public void recordCompressResult(Map<String, Object> map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(next.getKey(), (String) next.getValue());
        }
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.COMPRESS_RESULT, hashMap);
        }
    }

    public int recordActionPrompt(String str, int i, int i2) {
        if (i != i2) {
            HashMap hashMap = new HashMap(2);
            hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
            hashMap.put("pageContent", ZdocRecordService.DOC_INCOMPLETE);
            ZdocRecordService zdocRecordService = this.mZdocRecordService;
            if (zdocRecordService != null) {
                zdocRecordService.write("actionPrompt", hashMap);
            }
        }
        return i2;
    }

    public void recordOverThreshold() {
        HashMap hashMap = new HashMap(1);
        hashMap.put(ZdocRecordService.PAGE_NUMBER, Integer.toString(this.mPageNumber));
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(ZdocRecordService.OVER_THRESHOLD, hashMap);
        }
    }

    public void record(String str) {
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.write(str);
        }
    }

    public void retry() {
        ZdocRecordService zdocRecordService = this.mZdocRecordService;
        if (zdocRecordService != null) {
            zdocRecordService.retry();
        }
    }

    public void recordImageUploadEnd(BioUploadResult bioUploadResult) {
        if (this.mZdocRecordService != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("rpcResultCode", String.valueOf(bioUploadResult.productRetCode));
            hashMap.put("uploadTime", String.valueOf(System.currentTimeMillis() - this.mStartTime));
            ZdocRecordService zdocRecordService = this.mZdocRecordService;
            if (zdocRecordService != null) {
                zdocRecordService.write("uploadEnd", hashMap);
            }
        }
    }

    public void recordImageSize(int i, int i2) {
        if (this.mZdocRecordService != null) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("width", String.valueOf(i));
            hashMap.put("height", String.valueOf(i2));
            this.mZdocRecordService.write(ZdocRecordService.FRAME_SIZE_WH, hashMap);
        }
    }

    public void recordScanTaskStart(int i, String str) {
        if (this.mZdocRecordService != null) {
            this.algoResult = new RecordScanAlgoResult();
            HashMap hashMap = new HashMap();
            hashMap.put("index", String.valueOf(i));
            hashMap.put(ZdocRecordService.PAGE_NUMBER, String.valueOf(this.mPageNumber));
            hashMap.putAll((HashMap) JSON.parseObject(str, HashMap.class));
            this.mZdocRecordService.write(ZdocRecordService.ZDOC_SCAN_TASK_START, hashMap);
        }
    }

    public void recordScanTaskEnd(int i, String str) {
        if (this.mZdocRecordService != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("index", String.valueOf(i));
            hashMap.put(ZdocRecordService.PAGE_NUMBER, String.valueOf(this.mPageNumber));
            hashMap.put("subType", str);
            hashMap.put(ZdocRecordService.SCAN_RESULT, "success");
            this.mZdocRecordService.write(ZdocRecordService.ZDOC_SCAN_TASK_END, hashMap);
            if (this.algoResult != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(TtmlNode.LEFT, String.valueOf(this.algoResult.leftCount));
                hashMap2.put(CloseSubAppEvent.TOP, String.valueOf(this.algoResult.topCount));
                hashMap2.put(TtmlNode.RIGHT, String.valueOf(this.algoResult.rightCount));
                hashMap2.put("bottom", String.valueOf(this.algoResult.bottomCount));
                hashMap2.put("face", String.valueOf(this.algoResult.faceCount));
                hashMap2.put("totalFrameCount", String.valueOf(this.algoResult.totalFrameCount));
                hashMap2.put("index", String.valueOf(i));
                hashMap2.put(ZdocRecordService.PAGE_NUMBER, String.valueOf(this.mPageNumber));
                hashMap2.put("subType", str);
                this.mZdocRecordService.write(ZdocRecordService.ZDOC_SCAN_ALGO_RESULT, hashMap2);
                this.algoResult.reset();
            }
        }
    }

    public void recordOneFrameAlgoState(ToygerDocState toygerDocState) {
        if (this.algoResult == null) {
            this.algoResult = new RecordScanAlgoResult();
        }
        this.algoResult.add(toygerDocState.left, toygerDocState.top, toygerDocState.right, toygerDocState.bottom, toygerDocState.hasFace);
    }

    public void resetRecordAlgoState(ToygerDocState toygerDocState) {
        new RecordScanAlgoResult().add(toygerDocState.left, toygerDocState.top, toygerDocState.right, toygerDocState.bottom, toygerDocState.hasFace);
    }

    public void recordSystemError(String str) {
        if (this.mZdocRecordService != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("subCode", str);
            hashMap.put("module", BlobStatic.META_TYPE_DOC);
            this.mZdocRecordService.write("ztech_system_error", hashMap);
        }
    }

    public static class RecordScanAlgoResult {
        public int bottomCount;
        public int faceCount;
        public int leftCount;
        public int rightCount;
        public int topCount;
        public int totalFrameCount;

        public void add(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            if (z) {
                this.leftCount++;
            }
            if (z2) {
                this.topCount++;
            }
            if (z3) {
                this.rightCount++;
            }
            if (z4) {
                this.bottomCount++;
            }
            if (z5) {
                this.faceCount++;
            }
            this.totalFrameCount++;
        }

        public void reset() {
            this.leftCount = 0;
            this.topCount = 0;
            this.rightCount = 0;
            this.bottomCount = 0;
            this.faceCount = 0;
            this.totalFrameCount = 0;
        }
    }
}
