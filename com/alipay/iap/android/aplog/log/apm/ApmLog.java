package com.alipay.iap.android.aplog.log.apm;

import com.alipay.iap.android.aplog.api.LogCategory;
import com.alipay.iap.android.aplog.log.BaseLogInfo;

public class ApmLog extends BaseLogInfo {
    private String bizType;
    private Throwable cause;
    private String logCategory = LogCategory.LOG_CATEGORY_APM;
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getBizType() {
        return this.bizType;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public void setCause(Throwable th) {
        this.cause = th;
    }

    public String getLogCategory() {
        return this.logCategory;
    }
}
