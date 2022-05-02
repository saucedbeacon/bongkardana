package com.alipay.imobile.network.quake.request;

import androidx.annotation.NonNull;
import com.alipay.imobile.network.quake.NetworkResponse;
import com.alipay.imobile.network.quake.Request;

public interface RequestInterceptor {
    void afterReceiveResponse(@NonNull Request request, @NonNull NetworkResponse networkResponse);

    void beforeSendRequest(@NonNull Request request);
}
