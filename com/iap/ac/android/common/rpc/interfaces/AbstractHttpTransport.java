package com.iap.ac.android.common.rpc.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;

public interface AbstractHttpTransport {
    @Nullable
    HttpResponse performRequest(@NonNull HttpRequest httpRequest) throws Exception;
}
