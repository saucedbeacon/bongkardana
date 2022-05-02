package com.iap.ac.android.common.log.event;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BaseLogEvent implements Serializable {
    @Nullable
    public String bizCode;
    @NonNull
    public Map<String, String> params = new HashMap();

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseLogEvent{params=");
        sb.append(this.params);
        sb.append(", bizCode='");
        sb.append(this.bizCode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
