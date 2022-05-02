package o;

import com.twilio.verify.models.ChallengeStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/twilio/verify/models/UpdatePushChallengePayload;", "Lcom/twilio/verify/models/UpdateChallengePayload;", "factorSid", "", "challengeSid", "status", "Lcom/twilio/verify/models/ChallengeStatus;", "(Ljava/lang/String;Ljava/lang/String;Lcom/twilio/verify/models/ChallengeStatus;)V", "getChallengeSid", "()Ljava/lang/String;", "getFactorSid", "getStatus", "()Lcom/twilio/verify/models/ChallengeStatus;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class getPaddingBottom implements getWidth {
    @NotNull
    private final String getMax;
    @NotNull
    public final ChallengeStatus setMax;
    @NotNull
    private final String setMin;

    public getPaddingBottom(@NotNull String str, @NotNull String str2, @NotNull ChallengeStatus challengeStatus) {
        Intrinsics.checkParameterIsNotNull(str, "factorSid");
        Intrinsics.checkParameterIsNotNull(str2, "challengeSid");
        Intrinsics.checkParameterIsNotNull(challengeStatus, "status");
        this.getMax = str;
        this.setMin = str2;
        this.setMax = challengeStatus;
    }

    @NotNull
    public final String getMax() {
        return this.getMax;
    }

    @NotNull
    public final String setMin() {
        return this.setMin;
    }
}
