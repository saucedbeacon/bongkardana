package com.alipay.bis.common.service.facade.gw.zim;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.Map;

public class ZimValidateJsonGwRequest {
    public Map<String, String> bizData;
    public String zimData;
    public String zimId;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ZimValidateJsonGwRequest{zimId='");
        sb.append(this.zimId);
        sb.append("', data='");
        if (this.zimData == null) {
            str = "null";
        } else {
            StringBuilder sb2 = new StringBuilder("[length=");
            sb2.append(this.zimData.length());
            sb2.append("]");
            str = sb2.toString();
        }
        sb.append(str);
        sb.append("', bizData='");
        sb.append(StringUtil.map2String(this.bizData));
        sb.append("'}");
        return sb.toString();
    }
}
