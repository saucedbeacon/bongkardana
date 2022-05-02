package com.twilio.verify.networking;

import com.google.firebase.perf.FirebasePerformance;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/twilio/verify/networking/HttpMethod;", "", "method", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMethod", "()Ljava/lang/String;", "Get", "Post", "Delete", "Put", "verify_release"}, k = 1, mv = {1, 1, 16})
public enum HttpMethod {
    Get("GET"),
    Post("POST"),
    Delete(FirebasePerformance.HttpMethod.DELETE),
    Put(FirebasePerformance.HttpMethod.PUT);
    
    @NotNull
    private final String method;

    private HttpMethod(String str) {
        this.method = str;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }
}
