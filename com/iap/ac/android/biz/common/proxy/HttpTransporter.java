package com.iap.ac.android.biz.common.proxy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.rpc.model.HttpRequest;
import com.iap.ac.android.common.rpc.model.HttpResponse;
import java.io.IOException;

public interface HttpTransporter {
    @Nullable
    HttpResponse sendHttpRequest(@NonNull HttpRequest httpRequest) throws IOException;
}
