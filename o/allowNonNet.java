package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/GoalRevokeResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "needWithdraw", "", "(Z)V", "getNeedWithdraw", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class allowNonNet extends BaseRpcResult {
    private final boolean needWithdraw;

    public static /* synthetic */ allowNonNet copy$default(allowNonNet allownonnet, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = allownonnet.needWithdraw;
        }
        return allownonnet.copy(z);
    }

    public final boolean component1() {
        return this.needWithdraw;
    }

    @NotNull
    public final allowNonNet copy(boolean z) {
        return new allowNonNet(z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof allowNonNet) && this.needWithdraw == ((allowNonNet) obj).needWithdraw;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.needWithdraw;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalRevokeResult(needWithdraw=");
        sb.append(this.needWithdraw);
        sb.append(")");
        return sb.toString();
    }

    public final boolean getNeedWithdraw() {
        return this.needWithdraw;
    }

    public allowNonNet(boolean z) {
        this.needWithdraw = z;
    }
}
