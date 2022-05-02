package com.alipay.iap.android.matamata.plugins.rpc.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public class RPCRequest {
    @Nullable
    public Object[] arguments;
    @Nullable
    public Map<String, String> headers;
    @NonNull
    public String method;
    @NonNull
    public String requestId;
    @NonNull
    public long timeStamp;
    @NonNull
    public String url;
}
