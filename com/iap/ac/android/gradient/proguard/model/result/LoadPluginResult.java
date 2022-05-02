package com.iap.ac.android.gradient.proguard.model.result;

import java.io.Serializable;

public class LoadPluginResult implements Serializable {
    @ResultCode
    public int resultCode;
    public boolean success;

    public String toString() {
        StringBuilder sb = new StringBuilder("LoadPluginResult{resultCode=");
        sb.append(this.resultCode);
        sb.append(", success=");
        sb.append(this.success);
        sb.append('}');
        return sb.toString();
    }
}
