package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lid/dana/data/social/repository/source/network/request/ModifyRelationRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "targetUserId", "", "operationType", "(Ljava/lang/String;Ljava/lang/String;)V", "getOperationType", "()Ljava/lang/String;", "getTargetUserId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setErrorMsg extends BaseRpcRequest {
    @NotNull
    private final String operationType;
    @NotNull
    private final String targetUserId;

    public setErrorMsg() {
        this((String) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ setErrorMsg copy$default(setErrorMsg seterrormsg, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = seterrormsg.targetUserId;
        }
        if ((i & 2) != 0) {
            str2 = seterrormsg.operationType;
        }
        return seterrormsg.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.targetUserId;
    }

    @NotNull
    public final String component2() {
        return this.operationType;
    }

    @NotNull
    public final setErrorMsg copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "targetUserId");
        Intrinsics.checkNotNullParameter(str2, "operationType");
        return new setErrorMsg(str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setErrorMsg)) {
            return false;
        }
        setErrorMsg seterrormsg = (setErrorMsg) obj;
        return Intrinsics.areEqual((Object) this.targetUserId, (Object) seterrormsg.targetUserId) && Intrinsics.areEqual((Object) this.operationType, (Object) seterrormsg.operationType);
    }

    public final int hashCode() {
        String str = this.targetUserId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.operationType;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ModifyRelationRequest(targetUserId=");
        sb.append(this.targetUserId);
        sb.append(", operationType=");
        sb.append(this.operationType);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getTargetUserId() {
        return this.targetUserId;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ setErrorMsg(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    public final String getOperationType() {
        return this.operationType;
    }

    public setErrorMsg(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "targetUserId");
        Intrinsics.checkNotNullParameter(str2, "operationType");
        this.targetUserId = str;
        this.operationType = str2;
    }
}
