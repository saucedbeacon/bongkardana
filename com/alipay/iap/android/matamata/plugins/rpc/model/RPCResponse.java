package com.alipay.iap.android.matamata.plugins.rpc.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public class RPCResponse {
    @Nullable
    public Map<String, String> headers;
    @NonNull
    public String requestId;
    @Nullable
    public String result;
    @NonNull
    public long timeStamp;
}
