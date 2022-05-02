package com.alipay.mobile.security.bio.workspace;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.HashMap;
import java.util.Map;

public class BioFragmentResponse {
    public int errorCode = 500;
    public Map<String, String> ext = new HashMap();
    public boolean isSucess;
    public String resultMessage;
    public String subCode;
    public String subMsg;
    public int suggest;
    public String token;

    public String toString() {
        StringBuilder sb = new StringBuilder("BioFragmentResponse{errorCode=");
        sb.append(this.errorCode);
        sb.append(", subcode=");
        sb.append(this.subCode);
        sb.append(", submsg='");
        sb.append(this.subMsg);
        sb.append('\'');
        sb.append(", suggest=");
        sb.append(this.suggest);
        sb.append(", isSucess=");
        sb.append(this.isSucess);
        sb.append(", token='");
        sb.append(this.token);
        sb.append('\'');
        sb.append(", resultMessage='");
        sb.append(this.resultMessage);
        sb.append('\'');
        sb.append(", ext=");
        sb.append(StringUtil.collection2String(this.ext.keySet()));
        sb.append('}');
        return sb.toString();
    }
}
