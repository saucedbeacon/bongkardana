package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.OpenAPIBridgeExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lid/dana/data/referral/source/local/model/ReferralEngagementDialogCacheEntity;", "", "scenario", "", "showHomeReferralPopup", "", "showPopUpTimerSeed", "", "(Ljava/lang/String;ZJ)V", "getScenario", "()Ljava/lang/String;", "getShowHomeReferralPopup", "()Z", "getShowPopUpTimerSeed", "()J", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toReferralEngagementDialogCache", "Lid/dana/domain/referral/model/ReferralEngagementDialogCache;", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createChannelWithBuffer {
    @NotNull
    private final String scenario;
    private final boolean showHomeReferralPopup;
    private final long showPopUpTimerSeed;

    public static /* synthetic */ createChannelWithBuffer copy$default(createChannelWithBuffer createchannelwithbuffer, String str, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createchannelwithbuffer.scenario;
        }
        if ((i & 2) != 0) {
            z = createchannelwithbuffer.showHomeReferralPopup;
        }
        if ((i & 4) != 0) {
            j = createchannelwithbuffer.showPopUpTimerSeed;
        }
        return createchannelwithbuffer.copy(str, z, j);
    }

    @NotNull
    public final String component1() {
        return this.scenario;
    }

    public final boolean component2() {
        return this.showHomeReferralPopup;
    }

    public final long component3() {
        return this.showPopUpTimerSeed;
    }

    @NotNull
    public final createChannelWithBuffer copy(@NotNull String str, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "scenario");
        return new createChannelWithBuffer(str, z, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createChannelWithBuffer)) {
            return false;
        }
        createChannelWithBuffer createchannelwithbuffer = (createChannelWithBuffer) obj;
        return Intrinsics.areEqual((Object) this.scenario, (Object) createchannelwithbuffer.scenario) && this.showHomeReferralPopup == createchannelwithbuffer.showHomeReferralPopup && this.showPopUpTimerSeed == createchannelwithbuffer.showPopUpTimerSeed;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReferralEngagementDialogCacheEntity(scenario=");
        sb.append(this.scenario);
        sb.append(", showHomeReferralPopup=");
        sb.append(this.showHomeReferralPopup);
        sb.append(", showPopUpTimerSeed=");
        sb.append(this.showPopUpTimerSeed);
        sb.append(")");
        return sb.toString();
    }

    public createChannelWithBuffer(@NotNull String str, boolean z, long j) {
        Intrinsics.checkNotNullParameter(str, "scenario");
        this.scenario = str;
        this.showHomeReferralPopup = z;
        this.showPopUpTimerSeed = j;
    }

    @NotNull
    public final String getScenario() {
        return this.scenario;
    }

    public final boolean getShowHomeReferralPopup() {
        return this.showHomeReferralPopup;
    }

    public final long getShowPopUpTimerSeed() {
        return this.showPopUpTimerSeed;
    }

    @NotNull
    public final OpenAPIBridgeExtension.AnonymousClass3 toReferralEngagementDialogCache() {
        return new OpenAPIBridgeExtension.AnonymousClass3(this.scenario, this.showHomeReferralPopup, this.showPopUpTimerSeed);
    }

    public final int hashCode() {
        String str = this.scenario;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.showHomeReferralPopup;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + Long.valueOf(this.showPopUpTimerSeed).hashCode();
    }
}
