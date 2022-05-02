package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/GoalCreateSubmitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "savingView", "Lid/dana/data/saving/model/SavingView;", "(Lid/dana/data/saving/model/SavingView;)V", "getSavingView", "()Lid/dana/data/saving/model/SavingView;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class allowBgLogin extends BaseRpcResult {
    @NotNull
    private final headers savingView;

    public static /* synthetic */ allowBgLogin copy$default(allowBgLogin allowbglogin, headers headers, int i, Object obj) {
        if ((i & 1) != 0) {
            headers = allowbglogin.savingView;
        }
        return allowbglogin.copy(headers);
    }

    @NotNull
    public final headers component1() {
        return this.savingView;
    }

    @NotNull
    public final allowBgLogin copy(@NotNull headers headers) {
        Intrinsics.checkNotNullParameter(headers, "savingView");
        return new allowBgLogin(headers);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof allowBgLogin) && Intrinsics.areEqual((Object) this.savingView, (Object) ((allowBgLogin) obj).savingView);
        }
        return true;
    }

    public final int hashCode() {
        headers headers = this.savingView;
        if (headers != null) {
            return headers.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalCreateSubmitResult(savingView=");
        sb.append(this.savingView);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final headers getSavingView() {
        return this.savingView;
    }

    public allowBgLogin(@NotNull headers headers) {
        Intrinsics.checkNotNullParameter(headers, "savingView");
        this.savingView = headers;
    }
}
