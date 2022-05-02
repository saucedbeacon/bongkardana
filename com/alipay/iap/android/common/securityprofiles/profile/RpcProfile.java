package com.alipay.iap.android.common.securityprofiles.profile;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RpcProfile implements Serializable {
    public String appId;
    public String appKey;
    public String authCode;
    public String environment;
    public Map<String, String> extras;
    public String gatewayUrl;
    public Map<String, String> headers;
    public String productId;

    public void addHeader(@NonNull String str, @Nullable String str2) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        this.headers.put(str, str2);
    }

    public void addHeaders(@NonNull Map<String, String> map) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        this.headers.putAll(map);
    }
}
