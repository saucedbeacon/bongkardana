package com.iap.ac.android.mpm.base.model.route;

import com.iap.ac.android.a.a;

public class ACDecodeConfig {
    public String acquireId;
    public String minAndroidAcSdkVersion;
    public String minIOSAcSdkVersion;
    public String routerType;
    public String ruleId;
    public String userAgent;

    public String toString() {
        StringBuilder a2 = a.a("ACDecodeConfig{routerType='");
        a2.append(this.routerType);
        a2.append('\'');
        a2.append(", userAgent='");
        a2.append(this.userAgent);
        a2.append('\'');
        a2.append(", minAndroidAcSdkVersion='");
        a2.append(this.minAndroidAcSdkVersion);
        a2.append('\'');
        a2.append(", minIOSAcSdkVersion='");
        a2.append(this.minIOSAcSdkVersion);
        a2.append('\'');
        a2.append(", ruleId='");
        a2.append(this.ruleId);
        a2.append('\'');
        a2.append(", acquireId='");
        a2.append(this.acquireId);
        a2.append('\'');
        a2.append('}');
        return a2.toString();
    }
}
