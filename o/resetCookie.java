package o;

import com.alipayplus.mobile.component.domain.model.request.BaseRpcRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lid/dana/data/saving/repository/source/network/request/UserGoalCreateSubmitRequest;", "Lcom/alipayplus/mobile/component/domain/model/request/BaseRpcRequest;", "requestId", "", "categoryCode", "title", "targetAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategoryCode", "()Ljava/lang/String;", "getRequestId", "getTargetAmount", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resetCookie extends BaseRpcRequest {
    @NotNull
    private final String categoryCode;
    @NotNull
    private final String requestId;
    @NotNull
    private final String targetAmount;
    @NotNull
    private final String title;

    public static /* synthetic */ resetCookie copy$default(resetCookie resetcookie, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resetcookie.requestId;
        }
        if ((i & 2) != 0) {
            str2 = resetcookie.categoryCode;
        }
        if ((i & 4) != 0) {
            str3 = resetcookie.title;
        }
        if ((i & 8) != 0) {
            str4 = resetcookie.targetAmount;
        }
        return resetcookie.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.requestId;
    }

    @NotNull
    public final String component2() {
        return this.categoryCode;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.targetAmount;
    }

    @NotNull
    public final resetCookie copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "requestId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        return new resetCookie(str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resetCookie)) {
            return false;
        }
        resetCookie resetcookie = (resetCookie) obj;
        return Intrinsics.areEqual((Object) this.requestId, (Object) resetcookie.requestId) && Intrinsics.areEqual((Object) this.categoryCode, (Object) resetcookie.categoryCode) && Intrinsics.areEqual((Object) this.title, (Object) resetcookie.title) && Intrinsics.areEqual((Object) this.targetAmount, (Object) resetcookie.targetAmount);
    }

    public final int hashCode() {
        String str = this.requestId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.categoryCode;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.targetAmount;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserGoalCreateSubmitRequest(requestId=");
        sb.append(this.requestId);
        sb.append(", categoryCode=");
        sb.append(this.categoryCode);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", targetAmount=");
        sb.append(this.targetAmount);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final String getCategoryCode() {
        return this.categoryCode;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getTargetAmount() {
        return this.targetAmount;
    }

    public resetCookie(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "requestId");
        Intrinsics.checkNotNullParameter(str2, "categoryCode");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "targetAmount");
        this.requestId = str;
        this.categoryCode = str2;
        this.title = str3;
        this.targetAmount = str4;
    }
}
