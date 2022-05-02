package com.iap.ac.android.biz.common.proxy.common;

public interface NetworkProxy {
    HttpProxyResponseInfo sendHttpRequest(HttpProxyRequestInfo httpProxyRequestInfo);
}
