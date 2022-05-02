package com.alipay.android.phone.mobilesdk.socketcraft.monitor;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.alipay.android.phone.mobilesdk.socketcraft.util.StringUtils;
import java.util.HashMap;
import java.util.Map;

public class MonitorModel {
    public Map<String, String> itemMap;
    public String logTitle;

    public MonitorModel() {
        HashMap hashMap = new HashMap();
        this.itemMap = hashMap;
        hashMap.put(MonitorItemConstants.KEY_VER, "17");
    }

    public MonitorModel appendAppId(String str) {
        this.itemMap.put(MonitorItemConstants.KEY_APP_ID, str);
        return this;
    }

    public MonitorModel appendUrl(String str) {
        this.itemMap.put("URL", str);
        return this;
    }

    public MonitorModel appendResult(boolean z) {
        this.itemMap.put(MonitorItemConstants.KEY_RESULT, z ? DiskFormatter.TB : "F");
        return this;
    }

    public MonitorModel appendAllTime(String str) {
        this.itemMap.put(MonitorItemConstants.KEY_ALL_TIME, str);
        return this;
    }

    public MonitorModel appendCode(String str) {
        this.itemMap.put(MonitorItemConstants.KEY_CODE, str);
        return this;
    }

    public MonitorModel appendErrMsg(String str) {
        this.itemMap.put(MonitorItemConstants.KEY_ERR_MSG, str);
        return this;
    }

    public MonitorModel appendLiveTime(String str) {
        this.itemMap.put(MonitorItemConstants.KEY_LIVE_TIME, str);
        return this;
    }

    public MonitorModel appendUpMsgCount(String str) {
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_UPC, str);
        return this;
    }

    public MonitorModel appendDownMsgCount(String str) {
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_DOWNC, str);
        return this;
    }

    public MonitorModel appendUpMsgLens(String str) {
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_UPMSG, str);
        return this;
    }

    public MonitorModel appendDownMsgLens(String str) {
        if (StringUtils.isEmpty(str)) {
            return this;
        }
        this.itemMap.put(MonitorItemConstants.KEY_DOWNMSG, str);
        return this;
    }

    public MonitorModel appendDnsTime(String str) {
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_DNS_TIME, str);
        }
        return this;
    }

    public MonitorModel appendTcpTime(String str) {
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_TCP_TIME, str);
        }
        return this;
    }

    public MonitorModel appendSSLTime(String str) {
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_SSL_TIME, str);
        }
        return this;
    }

    public MonitorModel appendWsHsTime(String str) {
        if (!StringUtils.isEmpty(str) && !"-1".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_WS_HS_TIME, str);
        }
        return this;
    }

    public MonitorModel appendTargetHost(String str) {
        if (!StringUtils.isEmpty(str) && !"null".equals(str)) {
            this.itemMap.put(MonitorItemConstants.KEY_TARGET_HOST, str);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MonitorModel{logTitle='");
        sb.append(this.logTitle);
        sb.append('\'');
        sb.append(", itemMap=");
        sb.append(this.itemMap);
        sb.append('}');
        return sb.toString();
    }
}
