package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/twilio/verify/domain/challenge/ChallengeListMapper;", "", "challengeMapper", "Lcom/twilio/verify/domain/challenge/ChallengeMapper;", "(Lcom/twilio/verify/domain/challenge/ChallengeMapper;)V", "fromApi", "Lcom/twilio/verify/models/ChallengeList;", "jsonObject", "Lorg/json/JSONObject;", "verify_release"}, k = 1, mv = {1, 1, 16})
public final class setItemPrefetchEnabled {
    private final setAutoMeasureEnabled getMax;

    public setItemPrefetchEnabled() {
        this((byte) 0);
    }

    private setItemPrefetchEnabled(@NotNull setAutoMeasureEnabled setautomeasureenabled) {
        Intrinsics.checkParameterIsNotNull(setautomeasureenabled, "challengeMapper");
        this.getMax = setautomeasureenabled;
    }

    public /* synthetic */ setItemPrefetchEnabled(byte b) {
        this(new setAutoMeasureEnabled());
    }
}
