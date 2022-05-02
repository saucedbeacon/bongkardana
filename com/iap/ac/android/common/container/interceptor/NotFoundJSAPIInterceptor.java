package com.iap.ac.android.common.container.interceptor;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.container.interceptor.BridgeInterceptor;

public interface NotFoundJSAPIInterceptor {

    public static class NotFoundJSAPIContext extends BridgeInterceptor.InterceptContext {
        public String jsapiName;
    }

    boolean handleNotFoundJSAPI(@NonNull NotFoundJSAPIContext notFoundJSAPIContext, @NonNull BridgeCallback bridgeCallback);
}
