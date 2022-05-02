package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/social/repository/source/network/request/FetchCommentRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "activityId", "", "idLT", "(Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getIdLT", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getSuccess extends BaseRpcRequest {
    @NotNull
    private final String activityId;
    @Nullable
    private final String idLT;

    public static /* synthetic */ getSuccess copy$default(getSuccess getsuccess, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getsuccess.activityId;
        }
        if ((i & 2) != 0) {
            str2 = getsuccess.idLT;
        }
        return getsuccess.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.activityId;
    }

    @Nullable
    public final String component2() {
        return this.idLT;
    }

    @NotNull
    public final getSuccess copy(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        return new getSuccess(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSuccess)) {
            return false;
        }
        getSuccess getsuccess = (getSuccess) obj;
        return Intrinsics.areEqual((Object) this.activityId, (Object) getsuccess.activityId) && Intrinsics.areEqual((Object) this.idLT, (Object) getsuccess.idLT);
    }

    public final int hashCode() {
        String str = this.activityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.idLT;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FetchCommentRequest(activityId=");
        sb.append(this.activityId);
        sb.append(", idLT=");
        sb.append(this.idLT);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getIdLT() {
        return this.idLT;
    }

    public getSuccess(@NotNull String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        this.activityId = str;
        this.idLT = str2;
    }
}
