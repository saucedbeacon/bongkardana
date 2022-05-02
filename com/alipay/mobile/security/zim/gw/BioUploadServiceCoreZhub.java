package com.alipay.mobile.security.zim.gw;

import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.zim.biz.RecordProcessor;
import com.alipay.mobile.security.zim.biz.ZimPlatform;
import java.util.HashMap;
import java.util.Map;

public abstract class BioUploadServiceCoreZhub<Request> extends BioUploadServiceCore<Request> {
    protected Map<String, Object> mParams;
    protected String mZimId;

    /* access modifiers changed from: protected */
    public abstract BioUploadResult doUpload(Request request, boolean z);

    public void setExtParams(String str, Map<String, Object> map) {
        StringUtil.map2String(map);
        this.mZimId = str;
        this.mParams = map;
    }

    public void setZimId(String str) {
        this.mZimId = str;
    }

    public BioUploadResult upload(Request request, boolean z) {
        if (z) {
            RecordProcessor.getInstance().record(RecordProcessor.KEY_VALIDATE_REQUEST);
        }
        BioUploadResult doUpload = doUpload(request, z);
        if (z) {
            recordValidateResponse(doUpload);
        }
        return doUpload;
    }

    private void recordValidateResponse(BioUploadResult bioUploadResult) {
        HashMap hashMap = new HashMap();
        if (bioUploadResult != null) {
            int i = bioUploadResult.validationRetCode;
            if (i == 100 || i == 1000) {
                hashMap.put("result", ZimPlatform.RESULT_TRUE);
            } else {
                hashMap.put("result", ZimPlatform.RESULT_FALSE);
            }
            hashMap.put("message", "");
            StringBuilder sb = new StringBuilder("");
            sb.append(bioUploadResult.validationRetCode);
            hashMap.put("retCode", sb.toString());
            hashMap.put("subCode", bioUploadResult.subCode);
            hashMap.put(ZimPlatform.KEY_SUB_MSG, bioUploadResult.subMsg);
        } else {
            hashMap.put("result", ZimPlatform.RESULT_FALSE);
            hashMap.put("message", "0");
            hashMap.put("retCode", "0");
            hashMap.put("subCode", "");
            hashMap.put(ZimPlatform.KEY_SUB_MSG, "");
        }
        RecordProcessor instance = RecordProcessor.getInstance();
        if (instance != null) {
            instance.record(RecordProcessor.KEY_VALIDATE_RESPONSE, (Map<String, String>) hashMap);
        }
    }
}
