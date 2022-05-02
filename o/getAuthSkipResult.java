package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lid/dana/data/social/model/ActivityReactionsRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "activityId", "", "kind", "idLT", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getIdLT", "getKind", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getAuthSkipResult extends BaseRpcRequest {
    @NotNull
    private final String activityId;
    @NotNull
    private final String idLT;
    @NotNull
    private final String kind;

    public static /* synthetic */ getAuthSkipResult copy$default(getAuthSkipResult getauthskipresult, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getauthskipresult.activityId;
        }
        if ((i & 2) != 0) {
            str2 = getauthskipresult.kind;
        }
        if ((i & 4) != 0) {
            str3 = getauthskipresult.idLT;
        }
        return getauthskipresult.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.activityId;
    }

    @NotNull
    public final String component2() {
        return this.kind;
    }

    @NotNull
    public final String component3() {
        return this.idLT;
    }

    @NotNull
    public final getAuthSkipResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "kind");
        Intrinsics.checkNotNullParameter(str3, "idLT");
        return new getAuthSkipResult(str, str2, str3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getAuthSkipResult)) {
            return false;
        }
        getAuthSkipResult getauthskipresult = (getAuthSkipResult) obj;
        return Intrinsics.areEqual((Object) this.activityId, (Object) getauthskipresult.activityId) && Intrinsics.areEqual((Object) this.kind, (Object) getauthskipresult.kind) && Intrinsics.areEqual((Object) this.idLT, (Object) getauthskipresult.idLT);
    }

    public final int hashCode() {
        String str = this.activityId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.kind;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.idLT;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityReactionsRequest(activityId=");
        sb.append(this.activityId);
        sb.append(", kind=");
        sb.append(this.kind);
        sb.append(", idLT=");
        sb.append(this.idLT);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getIdLT() {
        return this.idLT;
    }

    @NotNull
    public final String getKind() {
        return this.kind;
    }

    public getAuthSkipResult(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, setBuildNumber.EXTEND_INFO_ACTIVITY_ID);
        Intrinsics.checkNotNullParameter(str2, "kind");
        Intrinsics.checkNotNullParameter(str3, "idLT");
        this.activityId = str;
        this.kind = str2;
        this.idLT = str3;
    }
}
