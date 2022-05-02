package o;

import com.twilio.verify.models.FactorStatus;
import com.twilio.verify.models.FactorType;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/twilio/verify/domain/factor/models/PushFactor;", "Lcom/twilio/verify/models/Factor;", "sid", "", "friendlyName", "accountSid", "serviceSid", "identity", "status", "Lcom/twilio/verify/models/FactorStatus;", "createdAt", "Ljava/util/Date;", "config", "Lcom/twilio/verify/domain/factor/models/Config;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/twilio/verify/models/FactorStatus;Ljava/util/Date;Lcom/twilio/verify/domain/factor/models/Config;)V", "getAccountSid", "()Ljava/lang/String;", "getConfig", "()Lcom/twilio/verify/domain/factor/models/Config;", "getCreatedAt", "()Ljava/util/Date;", "getFriendlyName", "getIdentity", "keyPairAlias", "getKeyPairAlias", "setKeyPairAlias", "(Ljava/lang/String;)V", "getServiceSid", "getSid", "getStatus", "()Lcom/twilio/verify/models/FactorStatus;", "setStatus", "(Lcom/twilio/verify/models/FactorStatus;)V", "type", "Lcom/twilio/verify/models/FactorType;", "getType", "()Lcom/twilio/verify/models/FactorType;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class detachView implements getHeight {
    @NotNull
    private final Date IsOverlapping;
    @NotNull
    public final addViewInt equals;
    @NotNull
    public final String getMax;
    @NotNull
    public final String getMin;
    @NotNull
    public final String isInside;
    @Nullable
    public String length;
    @NotNull
    public final FactorType setMax = FactorType.PUSH;
    @NotNull
    public final String setMin;
    @NotNull
    private FactorStatus toFloatRange;
    @NotNull
    public final String toIntRange;

    public detachView(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull FactorStatus factorStatus, @NotNull Date date, @NotNull addViewInt addviewint) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(str2, "friendlyName");
        Intrinsics.checkParameterIsNotNull(str3, "accountSid");
        Intrinsics.checkParameterIsNotNull(str4, "serviceSid");
        Intrinsics.checkParameterIsNotNull(str5, "identity");
        Intrinsics.checkParameterIsNotNull(factorStatus, "status");
        Intrinsics.checkParameterIsNotNull(date, "createdAt");
        Intrinsics.checkParameterIsNotNull(addviewint, "config");
        this.getMin = str;
        this.setMin = str2;
        this.getMax = str3;
        this.toIntRange = str4;
        this.isInside = str5;
        this.toFloatRange = factorStatus;
        this.IsOverlapping = date;
        this.equals = addviewint;
    }

    @NotNull
    public final String getMin() {
        return this.getMin;
    }

    @NotNull
    public final String setMax() {
        return this.setMin;
    }

    @NotNull
    public final String length() {
        return this.getMax;
    }

    @NotNull
    public final String setMin() {
        return this.toIntRange;
    }

    @NotNull
    public final String IsOverlapping() {
        return this.isInside;
    }

    public final void setMax(@NotNull FactorStatus factorStatus) {
        Intrinsics.checkParameterIsNotNull(factorStatus, "<set-?>");
        this.toFloatRange = factorStatus;
    }

    @NotNull
    public final FactorStatus toIntRange() {
        return this.toFloatRange;
    }

    @NotNull
    public final Date equals() {
        return this.IsOverlapping;
    }

    @NotNull
    public final FactorType getMax() {
        return this.setMax;
    }
}
