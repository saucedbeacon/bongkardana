package com.alipay.plus.android.transport.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface AbstractHttpTransport {
    @Nullable
    HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception;
}
