package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/twilio/verify/models/VerifyPushFactorPayload;", "Lcom/twilio/verify/models/VerifyFactorPayload;", "sid", "", "(Ljava/lang/String;)V", "getSid", "()Ljava/lang/String;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getPaddingStart implements getPaddingTop {
    @NotNull
    private final String length;

    public getPaddingStart(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        this.length = str;
    }

    @NotNull
    public final String setMax() {
        return this.length;
    }
}
