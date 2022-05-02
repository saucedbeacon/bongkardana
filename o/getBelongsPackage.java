package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/twilio/repository/source/network/result/VerifyPushBindEnrollmentResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "status", "", "(Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getBelongsPackage extends BaseRpcResult {
    @NotNull
    private final String status;

    public getBelongsPackage() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ getBelongsPackage copy$default(getBelongsPackage getbelongspackage, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getbelongspackage.status;
        }
        return getbelongspackage.copy(str);
    }

    @NotNull
    public final String component1() {
        return this.status;
    }

    @NotNull
    public final getBelongsPackage copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "status");
        return new getBelongsPackage(str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof getBelongsPackage) && Intrinsics.areEqual((Object) this.status, (Object) ((getBelongsPackage) obj).status);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.status;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyPushBindEnrollmentResult(status=");
        sb.append(this.status);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getBelongsPackage(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public getBelongsPackage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "status");
        this.status = str;
    }
}
