package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/GoalTopUpInitRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "savingId", "", "(Ljava/lang/String;)V", "getSavingId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class appKey extends BaseRpcRequest {
    @NotNull
    private final String savingId;

    public static /* synthetic */ appKey copy$default(appKey appkey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appkey.savingId;
        }
        return appkey.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.savingId;
    }

    @NotNull
    public final appKey copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        return new appKey(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof appKey) && Intrinsics.areEqual((Object) this.savingId, (Object) ((appKey) obj).savingId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.savingId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalTopUpInitRequest(savingId=");
        sb.append(this.savingId);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getSavingId() {
        return this.savingId;
    }

    public appKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "savingId");
        this.savingId = str;
    }
}
