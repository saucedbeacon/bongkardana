package com.iap.ac.android.biz.common.model.http;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.FirebasePerformance;

public enum HttpMethod {
    GET("GET"),
    POST("POST"),
    PUT(FirebasePerformance.HttpMethod.PUT),
    HEAD(FirebasePerformance.HttpMethod.HEAD),
    TRACE(FirebasePerformance.HttpMethod.TRACE),
    PATCH(FirebasePerformance.HttpMethod.PATCH),
    DELETE(FirebasePerformance.HttpMethod.DELETE),
    CONNECT(FirebasePerformance.HttpMethod.CONNECT),
    OPTIONS(FirebasePerformance.HttpMethod.OPTIONS);
    
    public String method;

    /* access modifiers changed from: public */
    HttpMethod(@NonNull String str) {
        this.method = str;
    }

    @Nullable
    public static HttpMethod fromString(@NonNull String str) {
        if (POST.method.equalsIgnoreCase(str)) {
            return POST;
        }
        if (GET.method.equalsIgnoreCase(str)) {
            return GET;
        }
        if (PUT.method.equalsIgnoreCase(str)) {
            return PUT;
        }
        if (HEAD.method.equalsIgnoreCase(str)) {
            return HEAD;
        }
        if (TRACE.method.equalsIgnoreCase(str)) {
            return TRACE;
        }
        if (PATCH.method.equalsIgnoreCase(str)) {
            return PATCH;
        }
        if (DELETE.method.equalsIgnoreCase(str)) {
            return DELETE;
        }
        if (CONNECT.method.equalsIgnoreCase(str)) {
            return CONNECT;
        }
        if (OPTIONS.method.equalsIgnoreCase(str)) {
            return OPTIONS;
        }
        return null;
    }
}
