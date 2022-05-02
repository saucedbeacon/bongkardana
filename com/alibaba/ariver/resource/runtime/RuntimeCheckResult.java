package com.alibaba.ariver.resource.runtime;

import android.text.TextUtils;
import androidx.annotation.Keep;

@Keep
public class RuntimeCheckResult {
    public static final String DEGRADE_BY_APPINFO_MISS = "7";
    public static final String DEGRADE_BY_CONFIG = "0";
    public static final String DEGRADE_BY_ENGINE_FAIL = "4";
    public static final String DEGRADE_BY_EXTENSION = "3";
    public static final String DEGRADE_BY_FATAL = "2";
    public static final String DEGRADE_BY_INVALID_PARAMS = "6";
    public static final String DEGRADE_BY_MINSDK_FAIL = "5";
    public static final String DEGRADE_BY_RESOURCE = "1";
    private String degradeReason;
    private boolean degraded;
    private boolean enabled;
    public String extendInfo;

    public RuntimeCheckResult(boolean z) {
        this.enabled = false;
        this.degraded = false;
        this.enabled = z;
        this.degraded = false;
        this.degradeReason = null;
    }

    public RuntimeCheckResult(boolean z, boolean z2, String str) {
        this.enabled = false;
        this.degraded = false;
        this.enabled = z;
        this.degraded = z2;
        this.degradeReason = str;
    }

    public RuntimeCheckResult(boolean z, boolean z2, String str, String str2) {
        this(z, z2, str);
        this.extendInfo = str2;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isDegrade() {
        return this.degraded;
    }

    public String getDegradeReason() {
        if (TextUtils.isEmpty(this.degradeReason)) {
            return "";
        }
        return this.degradeReason;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RuntimeCheckResult{enabled=");
        sb.append(this.enabled);
        sb.append(", hasDegrade=");
        sb.append(this.degraded);
        sb.append(", degradeReason=");
        sb.append(this.degradeReason);
        sb.append(", extendInfo=");
        sb.append(this.extendInfo);
        sb.append('}');
        return sb.toString();
    }
}
