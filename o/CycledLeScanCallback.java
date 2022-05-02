package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lid/dana/domain/statement/model/StatementDetail;", "", "date", "", "amount", "Lid/dana/domain/user/CurrencyAmount;", "(JLid/dana/domain/user/CurrencyAmount;)V", "getAmount", "()Lid/dana/domain/user/CurrencyAmount;", "getDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class CycledLeScanCallback {
    @NotNull
    private final stopBleScan amount;
    private final long date;

    public static /* synthetic */ CycledLeScanCallback copy$default(CycledLeScanCallback cycledLeScanCallback, long j, stopBleScan stopblescan, int i, Object obj) {
        if ((i & 1) != 0) {
            j = cycledLeScanCallback.date;
        }
        if ((i & 2) != 0) {
            stopblescan = cycledLeScanCallback.amount;
        }
        return cycledLeScanCallback.copy(j, stopblescan);
    }

    public final long component1() {
        return this.date;
    }

    @NotNull
    public final stopBleScan component2() {
        return this.amount;
    }

    @NotNull
    public final CycledLeScanCallback copy(long j, @NotNull stopBleScan stopblescan) {
        Intrinsics.checkNotNullParameter(stopblescan, "amount");
        return new CycledLeScanCallback(j, stopblescan);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CycledLeScanCallback)) {
            return false;
        }
        CycledLeScanCallback cycledLeScanCallback = (CycledLeScanCallback) obj;
        return this.date == cycledLeScanCallback.date && Intrinsics.areEqual((Object) this.amount, (Object) cycledLeScanCallback.amount);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementDetail(date=");
        sb.append(this.date);
        sb.append(", amount=");
        sb.append(this.amount);
        sb.append(")");
        return sb.toString();
    }

    public CycledLeScanCallback(long j, @NotNull stopBleScan stopblescan) {
        Intrinsics.checkNotNullParameter(stopblescan, "amount");
        this.date = j;
        this.amount = stopblescan;
    }

    public final long getDate() {
        return this.date;
    }

    @NotNull
    public final stopBleScan getAmount() {
        return this.amount;
    }

    public final int hashCode() {
        int hashCode = Long.valueOf(this.date).hashCode() * 31;
        stopBleScan stopblescan = this.amount;
        return hashCode + (stopblescan != null ? stopblescan.hashCode() : 0);
    }
}
