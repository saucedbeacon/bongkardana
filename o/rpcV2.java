package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import id.dana.requestmoney.BundleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "maxAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "currentAmount", "targetAmount", "(Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;)V", "getCurrentAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getMaxAmount", "getTargetAmount", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class rpcV2 extends BaseRpcResult {
    @NotNull
    private final onWorkerReady currentAmount;
    @NotNull
    private final onWorkerReady maxAmount;
    @NotNull
    private final onWorkerReady targetAmount;

    public static /* synthetic */ rpcV2 copy$default(rpcV2 rpcv2, onWorkerReady onworkerready, onWorkerReady onworkerready2, onWorkerReady onworkerready3, int i, Object obj) {
        if ((i & 1) != 0) {
            onworkerready = rpcv2.maxAmount;
        }
        if ((i & 2) != 0) {
            onworkerready2 = rpcv2.currentAmount;
        }
        if ((i & 4) != 0) {
            onworkerready3 = rpcv2.targetAmount;
        }
        return rpcv2.copy(onworkerready, onworkerready2, onworkerready3);
    }

    @NotNull
    public final onWorkerReady component1() {
        return this.maxAmount;
    }

    @NotNull
    public final onWorkerReady component2() {
        return this.currentAmount;
    }

    @NotNull
    public final onWorkerReady component3() {
        return this.targetAmount;
    }

    @NotNull
    public final rpcV2 copy(@NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, @NotNull onWorkerReady onworkerready3) {
        Intrinsics.checkNotNullParameter(onworkerready, BundleKey.MAXIMUM_AMOUNT);
        Intrinsics.checkNotNullParameter(onworkerready2, "currentAmount");
        Intrinsics.checkNotNullParameter(onworkerready3, "targetAmount");
        return new rpcV2(onworkerready, onworkerready2, onworkerready3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpcV2)) {
            return false;
        }
        rpcV2 rpcv2 = (rpcV2) obj;
        return Intrinsics.areEqual((Object) this.maxAmount, (Object) rpcv2.maxAmount) && Intrinsics.areEqual((Object) this.currentAmount, (Object) rpcv2.currentAmount) && Intrinsics.areEqual((Object) this.targetAmount, (Object) rpcv2.targetAmount);
    }

    public final int hashCode() {
        onWorkerReady onworkerready = this.maxAmount;
        int i = 0;
        int hashCode = (onworkerready != null ? onworkerready.hashCode() : 0) * 31;
        onWorkerReady onworkerready2 = this.currentAmount;
        int hashCode2 = (hashCode + (onworkerready2 != null ? onworkerready2.hashCode() : 0)) * 31;
        onWorkerReady onworkerready3 = this.targetAmount;
        if (onworkerready3 != null) {
            i = onworkerready3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalTopUpInitResult(maxAmount=");
        sb.append(this.maxAmount);
        sb.append(", currentAmount=");
        sb.append(this.currentAmount);
        sb.append(", targetAmount=");
        sb.append(this.targetAmount);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final onWorkerReady getMaxAmount() {
        return this.maxAmount;
    }

    @NotNull
    public final onWorkerReady getCurrentAmount() {
        return this.currentAmount;
    }

    @NotNull
    public final onWorkerReady getTargetAmount() {
        return this.targetAmount;
    }

    public rpcV2(@NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, @NotNull onWorkerReady onworkerready3) {
        Intrinsics.checkNotNullParameter(onworkerready, BundleKey.MAXIMUM_AMOUNT);
        Intrinsics.checkNotNullParameter(onworkerready2, "currentAmount");
        Intrinsics.checkNotNullParameter(onworkerready3, "targetAmount");
        this.maxAmount = onworkerready;
        this.currentAmount = onworkerready2;
        this.targetAmount = onworkerready3;
    }
}
