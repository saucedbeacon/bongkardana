package com.alipay.plus.android.transport.sdk;

import androidx.annotation.NonNull;

public enum HttpError {
    Unknown("Unknown"),
    UrlIsEmpty("UrlIsEmpty"),
    RetrieveStatusCodeError("UrlIsEmpty"),
    NoHttpReqUrlAnnotation("NoHttpReqUrlAnnotation"),
    ResponseIsNull("ResponseIsNull"),
    StatusCodeNot200("StatusCodeNot200"),
    ParseResponseJsonFailed("ParseResponseJsonFailed"),
    ParseResponseFailed("ParseResponseFailed");
    
    @NonNull
    protected String errorCode;

    private HttpError(String str) {
        this.errorCode = str;
    }

    @NonNull
    public final String getErrorCode() {
        return this.errorCode;
    }
}
