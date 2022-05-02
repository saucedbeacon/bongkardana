package com.alipay.mobile.security.zim.api;

import com.alipay.mobile.security.bio.utils.StringUtil;
import java.util.HashMap;
import java.util.Map;

public class ZIMResponse {
    public String bizData;
    public int code;
    public Map<String, String> extInfo = new HashMap();
    public String msg;
    public String reason;
    public String singleTag;
    public String subCode;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ZIMResponse{code=");
        sb.append(this.code);
        sb.append(", subCode=");
        sb.append(this.subCode);
        sb.append(", msg=");
        sb.append(this.msg);
        sb.append(", reason='");
        sb.append(this.reason);
        sb.append('\'');
        sb.append(", bizData='");
        sb.append(this.bizData);
        sb.append('\'');
        sb.append(", singleTag='");
        sb.append(this.singleTag);
        sb.append('\'');
        sb.append(", extInfo.keySet()=");
        Map<String, String> map = this.extInfo;
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
