package com.alibaba.griver.api.resource.appinfo;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.Map;

public class UpdateAppParam implements Serializable {
    @Nullable
    private Bundle mExtras = new Bundle();
    private Map<String, String> requestApps;

    public Map<String, String> getRequestApps() {
        return this.requestApps;
    }

    public void setRequestApps(Map<String, String> map) {
        this.requestApps = map;
    }

    public void setExtras(@Nullable Bundle bundle) {
        this.mExtras = bundle;
    }

    public String getExtra(String str) {
        return (String) this.mExtras.get(str);
    }

    @Nullable
    public Bundle getExtras() {
        return this.mExtras;
    }
}
