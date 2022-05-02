package com.twilio.verify;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/twilio/verify/TwilioVerifyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "errorCode", "Lcom/twilio/verify/TwilioVerifyException$ErrorCode;", "(Ljava/lang/Throwable;Lcom/twilio/verify/TwilioVerifyException$ErrorCode;)V", "ErrorCode", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class TwilioVerifyException extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TwilioVerifyException(@NotNull Throwable th, @NotNull ErrorCode errorCode) {
        super(errorCode.getMessage(), th);
        Intrinsics.checkParameterIsNotNull(th, "cause");
        Intrinsics.checkParameterIsNotNull(errorCode, "errorCode");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/twilio/verify/TwilioVerifyException$ErrorCode;", "", "message", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "NetworkError", "MapperError", "StorageError", "InputError", "KeyStorageError", "InitializationError", "AuthenticationTokenError", "verify_release"}, k = 1, mv = {1, 1, 16})
    public enum ErrorCode {
        NetworkError("{68001} Exception while calling the API"),
        MapperError("{68002} Exception while mapping an entity"),
        StorageError("{68003} Exception while storing/loading an entity"),
        InputError("{68004} Exception while loading input"),
        KeyStorageError("{68005} Exception while storing/loading key pairs"),
        InitializationError("{68006} Exception while initializing"),
        AuthenticationTokenError("{68007} Exception while generating token");
        
        @NotNull
        private final String message;

        private ErrorCode(String str) {
            this.message = str;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }
    }
}
