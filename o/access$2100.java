package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JW\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "savingBalanceAmount", "Lid/dana/data/nearbyme/model/MoneyViewEntity;", "maxSavingAmount", "maxSavingCount", "", "remainingAmount", "remainingCount", "savingViews", "", "Lid/dana/data/saving/model/SavingView;", "hasNext", "", "(Lid/dana/data/nearbyme/model/MoneyViewEntity;Lid/dana/data/nearbyme/model/MoneyViewEntity;JLid/dana/data/nearbyme/model/MoneyViewEntity;JLjava/util/List;Z)V", "getHasNext", "()Z", "getMaxSavingAmount", "()Lid/dana/data/nearbyme/model/MoneyViewEntity;", "getMaxSavingCount", "()J", "getRemainingAmount", "getRemainingCount", "getSavingBalanceAmount", "getSavingViews", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class access$2100 extends BaseRpcResult {
    private final boolean hasNext;
    @NotNull
    private final onWorkerReady maxSavingAmount;
    private final long maxSavingCount;
    @NotNull
    private final onWorkerReady remainingAmount;
    private final long remainingCount;
    @NotNull
    private final onWorkerReady savingBalanceAmount;
    @Nullable
    private final List<headers> savingViews;

    public static /* synthetic */ access$2100 copy$default(access$2100 access_2100, onWorkerReady onworkerready, onWorkerReady onworkerready2, long j, onWorkerReady onworkerready3, long j2, List list, boolean z, int i, Object obj) {
        access$2100 access_21002 = access_2100;
        return access_2100.copy((i & 1) != 0 ? access_21002.savingBalanceAmount : onworkerready, (i & 2) != 0 ? access_21002.maxSavingAmount : onworkerready2, (i & 4) != 0 ? access_21002.maxSavingCount : j, (i & 8) != 0 ? access_21002.remainingAmount : onworkerready3, (i & 16) != 0 ? access_21002.remainingCount : j2, (i & 32) != 0 ? access_21002.savingViews : list, (i & 64) != 0 ? access_21002.hasNext : z);
    }

    @NotNull
    public final onWorkerReady component1() {
        return this.savingBalanceAmount;
    }

    @NotNull
    public final onWorkerReady component2() {
        return this.maxSavingAmount;
    }

    public final long component3() {
        return this.maxSavingCount;
    }

    @NotNull
    public final onWorkerReady component4() {
        return this.remainingAmount;
    }

    public final long component5() {
        return this.remainingCount;
    }

    @Nullable
    public final List<headers> component6() {
        return this.savingViews;
    }

    public final boolean component7() {
        return this.hasNext;
    }

    @NotNull
    public final access$2100 copy(@NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, long j, @NotNull onWorkerReady onworkerready3, long j2, @Nullable List<headers> list, boolean z) {
        Intrinsics.checkNotNullParameter(onworkerready, "savingBalanceAmount");
        Intrinsics.checkNotNullParameter(onworkerready2, "maxSavingAmount");
        onWorkerReady onworkerready4 = onworkerready3;
        Intrinsics.checkNotNullParameter(onworkerready4, "remainingAmount");
        return new access$2100(onworkerready, onworkerready2, j, onworkerready4, j2, list, z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof access$2100)) {
            return false;
        }
        access$2100 access_2100 = (access$2100) obj;
        return Intrinsics.areEqual((Object) this.savingBalanceAmount, (Object) access_2100.savingBalanceAmount) && Intrinsics.areEqual((Object) this.maxSavingAmount, (Object) access_2100.maxSavingAmount) && this.maxSavingCount == access_2100.maxSavingCount && Intrinsics.areEqual((Object) this.remainingAmount, (Object) access_2100.remainingAmount) && this.remainingCount == access_2100.remainingCount && Intrinsics.areEqual((Object) this.savingViews, (Object) access_2100.savingViews) && this.hasNext == access_2100.hasNext;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSavingSummaryConsultResult(savingBalanceAmount=");
        sb.append(this.savingBalanceAmount);
        sb.append(", maxSavingAmount=");
        sb.append(this.maxSavingAmount);
        sb.append(", maxSavingCount=");
        sb.append(this.maxSavingCount);
        sb.append(", remainingAmount=");
        sb.append(this.remainingAmount);
        sb.append(", remainingCount=");
        sb.append(this.remainingCount);
        sb.append(", savingViews=");
        sb.append(this.savingViews);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(")");
        return sb.toString();
    }

    @NotNull
    public final onWorkerReady getSavingBalanceAmount() {
        return this.savingBalanceAmount;
    }

    @NotNull
    public final onWorkerReady getMaxSavingAmount() {
        return this.maxSavingAmount;
    }

    public final long getMaxSavingCount() {
        return this.maxSavingCount;
    }

    @NotNull
    public final onWorkerReady getRemainingAmount() {
        return this.remainingAmount;
    }

    public final long getRemainingCount() {
        return this.remainingCount;
    }

    @Nullable
    public final List<headers> getSavingViews() {
        return this.savingViews;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    public access$2100(@NotNull onWorkerReady onworkerready, @NotNull onWorkerReady onworkerready2, long j, @NotNull onWorkerReady onworkerready3, long j2, @Nullable List<headers> list, boolean z) {
        Intrinsics.checkNotNullParameter(onworkerready, "savingBalanceAmount");
        Intrinsics.checkNotNullParameter(onworkerready2, "maxSavingAmount");
        Intrinsics.checkNotNullParameter(onworkerready3, "remainingAmount");
        this.savingBalanceAmount = onworkerready;
        this.maxSavingAmount = onworkerready2;
        this.maxSavingCount = j;
        this.remainingAmount = onworkerready3;
        this.remainingCount = j2;
        this.savingViews = list;
        this.hasNext = z;
    }

    public final int hashCode() {
        onWorkerReady onworkerready = this.savingBalanceAmount;
        int i = 0;
        int hashCode = (onworkerready != null ? onworkerready.hashCode() : 0) * 31;
        onWorkerReady onworkerready2 = this.maxSavingAmount;
        int hashCode2 = (((hashCode + (onworkerready2 != null ? onworkerready2.hashCode() : 0)) * 31) + Long.valueOf(this.maxSavingCount).hashCode()) * 31;
        onWorkerReady onworkerready3 = this.remainingAmount;
        int hashCode3 = (((hashCode2 + (onworkerready3 != null ? onworkerready3.hashCode() : 0)) * 31) + Long.valueOf(this.remainingCount).hashCode()) * 31;
        List<headers> list = this.savingViews;
        if (list != null) {
            i = list.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.hasNext;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }
}
