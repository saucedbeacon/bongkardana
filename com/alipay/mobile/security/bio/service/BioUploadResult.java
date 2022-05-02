package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.Map;

public class BioUploadResult {
    public Map<String, String> extParams;
    public boolean hasNext = false;
    public String nextProtocol;
    public int productRetCode = 3001;
    public String subCode = "";
    public String subMsg = "";
    public int validationRetCode;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BioUploadResult{productRetCode=");
        sb.append(this.productRetCode);
        sb.append(", validationRetCode=");
        sb.append(this.validationRetCode);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(", subCode=");
        sb.append(this.subCode);
        sb.append(", subMsg=");
        sb.append(this.subMsg);
        sb.append(", nextProtocol='");
        sb.append(this.nextProtocol);
        sb.append('\'');
        sb.append(", extParams=");
        Map<String, String> map = this.extParams;
        if (map == null) {
            str = "null";
        } else {
            str = StringUtil.collection2String(map.keySet());
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
