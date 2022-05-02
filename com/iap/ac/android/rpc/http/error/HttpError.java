package com.iap.ac.android.rpc.http.error;

import androidx.annotation.NonNull;

public enum HttpError {
    Unknown("Unknown"),
    UrlIsEmpty("UrlIsEmpty"),
    RetrieveStatusCodeError("RetrieveStatusCodeError"),
    NoHttpReqUrlAnnotation("NoHttpReqUrlAnnotation"),
    ResponseIsNull("ResponseIsNull"),
    ParseResponseJsonFailed("ParseResponseJsonFailed"),
    ParseResponseFailed("ParseResponseFailed");
    
    @NonNull
    protected String errorCode;

    private HttpError(@NonNull String str) {
        this.errorCode = str;
    }

    @NonNull
    public final String getErrorCode() {
        return this.errorCode;
    }
}
