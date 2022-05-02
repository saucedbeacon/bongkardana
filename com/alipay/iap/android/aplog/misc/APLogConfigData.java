package com.alipay.iap.android.aplog.misc;

import java.io.Serializable;
import java.util.ArrayList;

public class APLogConfigData implements Serializable {
    public long configRefreshInterval;
    public ArrayList<String> keywords;
    public boolean logEnable;
    public ArrayList<String> logTypes;
    public long reportActiveInterval;
    public String uploadURL;

    public String toString() {
        StringBuilder sb = new StringBuilder("logConfig{logEnable=");
        sb.append(this.logEnable);
        sb.append('\'');
        sb.append(", uploadURL=");
        sb.append(this.uploadURL);
        sb.append('\'');
        sb.append(", configRefreshInterval=");
        sb.append(this.configRefreshInterval);
        sb.append('\'');
        sb.append(", reportActiveInterval=");
        sb.append(this.reportActiveInterval);
        sb.append('\'');
        sb.append(", autotrackKeywords=");
        sb.append(this.keywords);
        sb.append('\'');
        sb.append(", logTypes=");
        sb.append(this.logTypes);
        sb.append('\'');
        sb.append("}");
        return sb.toString();
    }
}
