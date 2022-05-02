package com.twilio.verify.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.stopIgnoringView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB#\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/twilio/verify/networking/NetworkException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "failureResponse", "Lcom/twilio/verify/networking/FailureResponse;", "(Lcom/twilio/verify/networking/FailureResponse;)V", "cause", "", "(Ljava/lang/Throwable;)V", "message", "", "(Ljava/lang/String;Ljava/lang/Throwable;Lcom/twilio/verify/networking/FailureResponse;)V", "getFailureResponse", "()Lcom/twilio/verify/networking/FailureResponse;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class NetworkException extends Exception {
    @Nullable
    private final stopIgnoringView failureResponse;

    @Nullable
    public final stopIgnoringView getFailureResponse() {
        return this.failureResponse;
    }

    public NetworkException(@Nullable String str, @Nullable Throwable th, @Nullable stopIgnoringView stopignoringview) {
        super(str, th);
        this.failureResponse = stopignoringview;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NetworkException(@org.jetbrains.annotations.Nullable o.stopIgnoringView r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Network exception with status code "
            r0.<init>(r1)
            r1 = 0
            if (r4 == 0) goto L_0x0011
            int r2 = r4.getMax
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0012
        L_0x0011:
            r2 = r1
        L_0x0012:
            r0.append(r2)
            java.lang.String r2 = " and body: "
            r0.append(r2)
            if (r4 == 0) goto L_0x001f
            java.lang.String r2 = r4.setMin
            goto L_0x0020
        L_0x001f:
            r2 = r1
        L_0x0020:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twilio.verify.networking.NetworkException.<init>(o.stopIgnoringView):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NetworkException(@NotNull Throwable th) {
        this(th.getMessage(), th, (stopIgnoringView) null);
        Intrinsics.checkParameterIsNotNull(th, "cause");
    }
}
