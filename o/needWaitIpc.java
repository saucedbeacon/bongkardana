package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lid/dana/data/electronicmoney/network/response/EmoneyCardInfoResponse;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "data", "Lid/dana/data/electronicmoney/network/response/EmoneyDataEntity;", "(Lid/dana/data/electronicmoney/network/response/EmoneyDataEntity;)V", "getData", "()Lid/dana/data/electronicmoney/network/response/EmoneyDataEntity;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class needWaitIpc extends BaseRpcResult {
    @Nullable
    private final StartClientBundle data;

    public static /* synthetic */ needWaitIpc copy$default(needWaitIpc needwaitipc, StartClientBundle startClientBundle, int i, Object obj) {
        if ((i & 1) != 0) {
            startClientBundle = needwaitipc.data;
        }
        return needwaitipc.copy(startClientBundle);
    }

    @Nullable
    public final StartClientBundle component1() {
        return this.data;
    }

    @NotNull
    public final needWaitIpc copy(@Nullable StartClientBundle startClientBundle) {
        return new needWaitIpc(startClientBundle);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            return (obj instanceof needWaitIpc) && Intrinsics.areEqual((Object) this.data, (Object) ((needWaitIpc) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        StartClientBundle startClientBundle = this.data;
        if (startClientBundle != null) {
            return startClientBundle.hashCode();
        }
        return 0;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("EmoneyCardInfoResponse(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final StartClientBundle getData() {
        return this.data;
    }

    public needWaitIpc(@Nullable StartClientBundle startClientBundle) {
        this.data = startClientBundle;
    }
}
