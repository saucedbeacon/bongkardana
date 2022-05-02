package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/twilio/verify/models/PushFactorPayload;", "Lcom/twilio/verify/models/FactorPayload;", "friendlyName", "", "serviceSid", "identity", "pushToken", "accessToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "factorType", "Lcom/twilio/verify/models/FactorType;", "getFactorType", "()Lcom/twilio/verify/models/FactorType;", "getFriendlyName", "getIdentity", "getPushToken", "getServiceSid", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getWidthMode implements getChildAt {
    @NotNull
    private final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    private final String setMax;
    @NotNull
    private final String setMin;

    public getWidthMode(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkParameterIsNotNull(str, "friendlyName");
        Intrinsics.checkParameterIsNotNull(str2, "serviceSid");
        Intrinsics.checkParameterIsNotNull(str3, "identity");
        Intrinsics.checkParameterIsNotNull(str4, "pushToken");
        Intrinsics.checkParameterIsNotNull(str5, "accessToken");
        this.setMax = str;
        this.getMax = str2;
        this.setMin = str3;
        this.length = str4;
        this.getMin = str5;
    }

    @NotNull
    public final String getMin() {
        return this.setMax;
    }

    @NotNull
    public final String setMin() {
        return this.getMax;
    }

    @NotNull
    public final String setMax() {
        return this.setMin;
    }
}
