package com.alipay.plus.android.config.sdk.retry;

import com.alipay.plus.android.transport.proxy.HttpReqMethod;
import com.alipay.plus.android.transport.proxy.HttpReqUrl;
import com.alipay.plus.android.transport.sdk.HttpMethod;

public interface b {
    @HttpReqMethod(HttpMethod.GET)
    @HttpReqUrl("fromDelegate")
    a a() throws Throwable;
}
