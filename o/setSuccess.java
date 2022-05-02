package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/social/repository/source/network/request/DeleteActivityReactionRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "reactionId", "", "activityId", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getReactionId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSuccess extends BaseRpcRequest {
    @NotNull
    private final String activityId;
    @Nullable
    private final String reactionId;

    public static /* synthetic */ setSuccess copy$default(setSuccess setsuccess, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setsuccess.reactionId;
        }
        if ((i & 2) != 0) {
            str2 = setsuccess.activityId;
        }
        return setsuccess.copy(str, str2);
    }

    @Nullable
    public final String component1() {
        return this.reactionId;
    }

    @NotNull
    public final String component2() {
        return this.activityId;
    }

    @NotNull
    public final setSuccess copy(@Nullable String str, @NotNull String str2) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-1429265320, oncanceled);
            onCancelLoad.getMin(-1429265320, oncanceled);
        }
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        return new setSuccess(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setSuccess)) {
            return false;
        }
        setSuccess setsuccess = (setSuccess) obj;
        return Intrinsics.areEqual((Object) this.reactionId, (Object) setsuccess.reactionId) && Intrinsics.areEqual((Object) this.activityId, (Object) setsuccess.activityId);
    }

    public final int hashCode() {
        String str = this.reactionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.activityId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteActivityReactionRequest(reactionId=");
        sb.append(this.reactionId);
        sb.append(", activityId=");
        sb.append(this.activityId);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setSuccess(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2);
    }

    @Nullable
    public final String getReactionId() {
        return this.reactionId;
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    public setSuccess(@Nullable String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str2, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        this.reactionId = str;
        this.activityId = str2;
    }
}
