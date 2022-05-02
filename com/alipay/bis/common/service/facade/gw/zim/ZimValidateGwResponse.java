package com.alipay.bis.common.service.facade.gw.zim;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.Map;

public class ZimValidateGwResponse {
    public Map<String, String> extParams;
    public boolean hasNext = false;
    public String nextProtocol;
    public int productRetCode = 0;
    public String retCodeSub;
    public String retMessageSub;
    public int validationRetCode = 0;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ZimValidateGwResponse{validationRetCode=");
        sb.append(this.validationRetCode);
        sb.append(", productRetCode=");
        sb.append(this.productRetCode);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
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
        sb.append(", retCodeSub='");
        sb.append(this.retCodeSub);
        sb.append('\'');
        sb.append(", retMessageSub='");
        sb.append(this.retMessageSub);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
