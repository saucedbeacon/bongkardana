package com.iap.ac.android.common.rpc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class RpcAppInfo {
    public String appId;
    public String appKey;
    public String authCode;
    public Map<String, String> headers = new HashMap();
    public String rpcGateWayUrl;
    public int timeoutMS = 0;

    public RpcAppInfo() {
    }

    public RpcAppInfo(@NonNull RpcAppInfo rpcAppInfo) {
        this.appId = rpcAppInfo.appId;
        this.appKey = rpcAppInfo.appKey;
        this.authCode = rpcAppInfo.authCode;
        this.rpcGateWayUrl = rpcAppInfo.rpcGateWayUrl;
        this.headers = new HashMap(rpcAppInfo.headers);
        this.timeoutMS = rpcAppInfo.timeoutMS;
    }

    public RpcAppInfo(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) {
        this.appId = str;
        this.appKey = str2;
        this.authCode = str3;
        this.rpcGateWayUrl = str4;
    }

    public void addHeader(@NonNull String str, @Nullable Object obj) {
        if (this.headers == null) {
            this.headers = new HashMap();
        }
        if (obj != null) {
            this.headers.put(str, String.valueOf(obj));
        } else {
            this.headers.put(str, (Object) null);
        }
    }

    public void addHeaders(@Nullable Map<String, String> map) {
        if (map != null) {
            if (this.headers == null) {
                this.headers = new HashMap();
            }
            this.headers.putAll(map);
        }
    }

    public void clearHeaders() {
        Map<String, String> map = this.headers;
        if (map != null) {
            map.clear();
        }
    }
}
