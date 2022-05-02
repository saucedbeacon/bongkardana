package com.zoloz.android.phone.zdoc.cardmanager;

import com.alipay.mobile.security.bio.service.BioUploadResult;
import java.util.HashMap;
import java.util.Map;

public class ZdocResponse {
    public BioUploadResult bioUploadResult;
    public Map<String, String> ext = new HashMap();
    public int retCode;
}
