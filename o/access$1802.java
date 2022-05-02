package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lid/dana/social/model/ReactionModificationRequest;", "", "toAddReaction", "", "activityId", "", "reactionId", "reactionKind", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getReactionId", "getReactionKind", "getToAddReaction", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$1802 {
    @Nullable
    public final String getMin;
    @NotNull
    public final String length;
    @NotNull
    public final String setMax;
    private final boolean setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$1802)) {
            return false;
        }
        access$1802 access_1802 = (access$1802) obj;
        return this.setMin == access_1802.setMin && Intrinsics.areEqual((Object) this.setMax, (Object) access_1802.setMax) && Intrinsics.areEqual((Object) this.getMin, (Object) access_1802.getMin) && Intrinsics.areEqual((Object) this.length, (Object) access_1802.length);
    }

    public final int hashCode() {
        boolean z = this.setMin;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        String str = this.setMax;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.getMin;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.length;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ReactionModificationRequest(toAddReaction=");
        sb.append(this.setMin);
        sb.append(", activityId=");
        sb.append(this.setMax);
        sb.append(", reactionId=");
        sb.append(this.getMin);
        sb.append(", reactionKind=");
        sb.append(this.length);
        sb.append(")");
        return sb.toString();
    }

    private access$1802(boolean z, @NotNull String str, @Nullable String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str3, "reactionKind");
        this.setMin = z;
        this.setMax = str;
        this.getMin = str2;
        this.length = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ access$1802(boolean z, String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? true : z, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
