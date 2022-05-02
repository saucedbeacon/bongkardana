package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "categoryCodes", "", "", "maxTargetAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "savingView", "Lid/dana/data/saving/model/SavingView;", "(Ljava/util/List;Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/saving/model/SavingView;)V", "getCategoryCodes", "()Ljava/util/List;", "getMaxTargetAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getSavingView", "()Lid/dana/data/saving/model/SavingView;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class rpcLoggerLevel extends BaseRpcResult {
    @NotNull
    private final List<String> categoryCodes;
    @NotNull
    private final onWorkerReady maxTargetAmount;
    @NotNull
    private final headers savingView;

    public static /* synthetic */ rpcLoggerLevel copy$default(rpcLoggerLevel rpcloggerlevel, List<String> list, onWorkerReady onworkerready, headers headers, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rpcloggerlevel.categoryCodes;
        }
        if ((i & 2) != 0) {
            onworkerready = rpcloggerlevel.maxTargetAmount;
        }
        if ((i & 4) != 0) {
            headers = rpcloggerlevel.savingView;
        }
        return rpcloggerlevel.copy(list, onworkerready, headers);
    }

    @NotNull
    public final List<String> component1() {
        return this.categoryCodes;
    }

    @NotNull
    public final onWorkerReady component2() {
        return this.maxTargetAmount;
    }

    @NotNull
    public final headers component3() {
        return this.savingView;
    }

    @NotNull
    public final rpcLoggerLevel copy(@NotNull List<String> list, @NotNull onWorkerReady onworkerready, @NotNull headers headers) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(onworkerready, "maxTargetAmount");
        Intrinsics.checkNotNullParameter(headers, "savingView");
        return new rpcLoggerLevel(list, onworkerready, headers);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpcLoggerLevel)) {
            return false;
        }
        rpcLoggerLevel rpcloggerlevel = (rpcLoggerLevel) obj;
        return Intrinsics.areEqual((Object) this.categoryCodes, (Object) rpcloggerlevel.categoryCodes) && Intrinsics.areEqual((Object) this.maxTargetAmount, (Object) rpcloggerlevel.maxTargetAmount) && Intrinsics.areEqual((Object) this.savingView, (Object) rpcloggerlevel.savingView);
    }

    public final int hashCode() {
        List<String> list = this.categoryCodes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        onWorkerReady onworkerready = this.maxTargetAmount;
        int hashCode2 = (hashCode + (onworkerready != null ? onworkerready.hashCode() : 0)) * 31;
        headers headers = this.savingView;
        if (headers != null) {
            i = headers.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("GoalUpdateInitResult(categoryCodes=");
        sb.append(this.categoryCodes);
        sb.append(", maxTargetAmount=");
        sb.append(this.maxTargetAmount);
        sb.append(", savingView=");
        sb.append(this.savingView);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    @NotNull
    public final onWorkerReady getMaxTargetAmount() {
        return this.maxTargetAmount;
    }

    @NotNull
    public final headers getSavingView() {
        return this.savingView;
    }

    public rpcLoggerLevel(@NotNull List<String> list, @NotNull onWorkerReady onworkerready, @NotNull headers headers) {
        Intrinsics.checkNotNullParameter(list, "categoryCodes");
        Intrinsics.checkNotNullParameter(onworkerready, "maxTargetAmount");
        Intrinsics.checkNotNullParameter(headers, "savingView");
        this.categoryCodes = list;
        this.maxTargetAmount = onworkerready;
        this.savingView = headers;
    }
}
