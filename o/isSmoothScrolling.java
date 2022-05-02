package o;

import com.twilio.verify.models.ChallengeStatus;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000e\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0017¨\u0006-"}, d2 = {"Lcom/twilio/verify/domain/challenge/models/FactorChallenge;", "Lcom/twilio/verify/models/Challenge;", "sid", "", "challengeDetails", "Lcom/twilio/verify/models/ChallengeDetails;", "hiddenDetails", "", "factorSid", "status", "Lcom/twilio/verify/models/ChallengeStatus;", "createdAt", "Ljava/util/Date;", "updatedAt", "expirationDate", "signatureFields", "", "response", "Lorg/json/JSONObject;", "(Ljava/lang/String;Lcom/twilio/verify/models/ChallengeDetails;Ljava/util/Map;Ljava/lang/String;Lcom/twilio/verify/models/ChallengeStatus;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/List;Lorg/json/JSONObject;)V", "getChallengeDetails", "()Lcom/twilio/verify/models/ChallengeDetails;", "getCreatedAt", "()Ljava/util/Date;", "getExpirationDate", "factor", "Lcom/twilio/verify/models/Factor;", "getFactor$verify_release", "()Lcom/twilio/verify/models/Factor;", "setFactor$verify_release", "(Lcom/twilio/verify/models/Factor;)V", "getFactorSid", "()Ljava/lang/String;", "getHiddenDetails", "()Ljava/util/Map;", "getResponse$verify_release", "()Lorg/json/JSONObject;", "getSid", "getSignatureFields$verify_release", "()Ljava/util/List;", "getStatus", "()Lcom/twilio/verify/models/ChallengeStatus;", "setStatus", "(Lcom/twilio/verify/models/ChallengeStatus;)V", "getUpdatedAt", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class isSmoothScrolling implements detachAndScrapViewAt {
    @Nullable
    private final Map<String, String> IsOverlapping;
    @NotNull
    private final String equals;
    @Nullable
    public getHeight getMax;
    @NotNull
    public final String getMin;
    @NotNull
    private final Date hashCode;
    @NotNull
    private final Date isInside;
    @Nullable
    public final List<String> length;
    @Nullable
    public final JSONObject setMax;
    @NotNull
    private final removeAndRecycleView setMin;
    @NotNull
    private ChallengeStatus toFloatRange;
    @NotNull
    private final Date toIntRange;

    public isSmoothScrolling(@NotNull String str, @NotNull removeAndRecycleView removeandrecycleview, @Nullable Map<String, String> map, @NotNull String str2, @NotNull ChallengeStatus challengeStatus, @NotNull Date date, @NotNull Date date2, @NotNull Date date3, @Nullable List<String> list, @Nullable JSONObject jSONObject) {
        Intrinsics.checkParameterIsNotNull(str, "sid");
        Intrinsics.checkParameterIsNotNull(removeandrecycleview, "challengeDetails");
        Intrinsics.checkParameterIsNotNull(str2, "factorSid");
        Intrinsics.checkParameterIsNotNull(challengeStatus, "status");
        Intrinsics.checkParameterIsNotNull(date, "createdAt");
        Intrinsics.checkParameterIsNotNull(date2, "updatedAt");
        Intrinsics.checkParameterIsNotNull(date3, "expirationDate");
        this.getMin = str;
        this.setMin = removeandrecycleview;
        this.IsOverlapping = map;
        this.equals = str2;
        this.toFloatRange = challengeStatus;
        this.toIntRange = date;
        this.isInside = date2;
        this.hashCode = date3;
        this.length = list;
        this.setMax = jSONObject;
    }

    @NotNull
    public final removeAndRecycleView getMin() {
        return this.setMin;
    }

    @Nullable
    public final Map<String, String> getMax() {
        return this.IsOverlapping;
    }

    @NotNull
    public final String setMax() {
        return this.equals;
    }

    @NotNull
    public final ChallengeStatus length() {
        return this.toFloatRange;
    }
}
