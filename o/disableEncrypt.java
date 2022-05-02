package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "categoryCodes", "", "", "maxTargetAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "(Ljava/util/List;Lid/dana/data/nearbyme/model/MoneyViewEntity;)V", "getCategoryCodes", "()Ljava/util/List;", "getMaxTargetAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class disableEncrypt extends BaseRpcResult {
    @Nullable
    private final List<String> categoryCodes;
    @Nullable
    private final onWorkerReady maxTargetAmount;

    public static /* synthetic */ disableEncrypt copy$default(disableEncrypt disableencrypt, List<String> list, onWorkerReady onworkerready, int i, Object obj) {
        if ((i & 1) != 0) {
            list = disableencrypt.categoryCodes;
        }
        if ((i & 2) != 0) {
            onworkerready = disableencrypt.maxTargetAmount;
        }
        return disableencrypt.copy(list, onworkerready);
    }

    @Nullable
    public final List<String> component1() {
        return this.categoryCodes;
    }

    @Nullable
    public final onWorkerReady component2() {
        return this.maxTargetAmount;
    }

    @NotNull
    public final disableEncrypt copy(@Nullable List<String> list, @Nullable onWorkerReady onworkerready) {
        return new disableEncrypt(list, onworkerready);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof disableEncrypt)) {
            return false;
        }
        disableEncrypt disableencrypt = (disableEncrypt) obj;
        return Intrinsics.areEqual((Object) this.categoryCodes, (Object) disableencrypt.categoryCodes) && Intrinsics.areEqual((Object) this.maxTargetAmount, (Object) disableencrypt.maxTargetAmount);
    }

    public final int hashCode() {
        List<String> list = this.categoryCodes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        onWorkerReady onworkerready = this.maxTargetAmount;
        if (onworkerready != null) {
            i = onworkerready.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalCreateInitResult(categoryCodes=");
        sb.append(this.categoryCodes);
        sb.append(", maxTargetAmount=");
        sb.append(this.maxTargetAmount);
        sb.append(")");
        return sb.toString();
    }

    @Nullable
    public final List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    @Nullable
    public final onWorkerReady getMaxTargetAmount() {
        return this.maxTargetAmount;
    }

    public disableEncrypt(@Nullable List<String> list, @Nullable onWorkerReady onworkerready) {
        this.categoryCodes = list;
        this.maxTargetAmount = onworkerready;
    }
}
