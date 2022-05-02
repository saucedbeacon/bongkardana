package com.iap.ac.android.biz.common.model.acl;

import com.iap.ac.android.a.a;

public class AclMiniProgramMetaData {
    public String appId;
    public String merchantId;

    public AclMiniProgramMetaData(String str, String str2) {
        this.appId = str;
        this.merchantId = str2;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public String toString() {
        StringBuilder a2 = a.a("AclMiniProgramMetaData{appId='");
        a2.append(this.appId);
        a2.append('\'');
        a2.append(", merchantId='");
        a2.append(this.merchantId);
        a2.append('\'');
        a2.append('}');
        return a2.toString();
    }
}
