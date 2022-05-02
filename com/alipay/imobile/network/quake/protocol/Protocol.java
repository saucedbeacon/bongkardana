package com.alipay.imobile.network.quake.protocol;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.Response;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.Map;

public interface Protocol<T> {
    public static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    public static final String DEFAULT_RESPONSE_ENCODING = "UTF-8";

    Response<T> deserialize(Request request, NetworkResponse networkResponse) throws RpcException;

    @NonNull
    String generateCacheKey(Request request);

    String getBodyContentType();

    @Nullable
    Map<String, String> getExternalInfo(Request request);

    byte[] serialize(Request request) throws RpcException;
}
