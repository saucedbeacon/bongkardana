package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/domain/statement/model/StatementSummary;", "", "amount", "Lid/dana/domain/user/CurrencyAmount;", "bizType", "", "description", "(Lid/dana/domain/user/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Lid/dana/domain/user/CurrencyAmount;", "getBizType", "()Ljava/lang/String;", "getDescription", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class getDistinctPacketsDetectedPerScan {
    @NotNull
    private final stopBleScan amount;
    @NotNull
    private final String bizType;
    @NotNull
    private final String description;

    public static /* synthetic */ getDistinctPacketsDetectedPerScan copy$default(getDistinctPacketsDetectedPerScan getdistinctpacketsdetectedperscan, stopBleScan stopblescan, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            stopblescan = getdistinctpacketsdetectedperscan.amount;
        }
        if ((i & 2) != 0) {
            str = getdistinctpacketsdetectedperscan.bizType;
        }
        if ((i & 4) != 0) {
            str2 = getdistinctpacketsdetectedperscan.description;
        }
        return getdistinctpacketsdetectedperscan.copy(stopblescan, str, str2);
    }

    @NotNull
    public final stopBleScan component1() {
        return this.amount;
    }

    @NotNull
    public final String component2() {
        return this.bizType;
    }

    @NotNull
    public final String component3() {
        return this.description;
    }

    @NotNull
    public final getDistinctPacketsDetectedPerScan copy(@NotNull stopBleScan stopblescan, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(stopblescan, "amount");
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "description");
        return new getDistinctPacketsDetectedPerScan(stopblescan, str, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getDistinctPacketsDetectedPerScan)) {
            return false;
        }
        getDistinctPacketsDetectedPerScan getdistinctpacketsdetectedperscan = (getDistinctPacketsDetectedPerScan) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) getdistinctpacketsdetectedperscan.amount) && Intrinsics.areEqual((Object) this.bizType, (Object) getdistinctpacketsdetectedperscan.bizType) && Intrinsics.areEqual((Object) this.description, (Object) getdistinctpacketsdetectedperscan.description);
    }

    public final int hashCode() {
        stopBleScan stopblescan = this.amount;
        int i = 0;
        int hashCode = (stopblescan != null ? stopblescan.hashCode() : 0) * 31;
        String str = this.bizType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("StatementSummary(amount=");
        sb.append(this.amount);
        sb.append(", bizType=");
        sb.append(this.bizType);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(")");
        return sb.toString();
    }

    public getDistinctPacketsDetectedPerScan(@NotNull stopBleScan stopblescan, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(stopblescan, "amount");
        Intrinsics.checkNotNullParameter(str, "bizType");
        Intrinsics.checkNotNullParameter(str2, "description");
        this.amount = stopblescan;
        this.bizType = str;
        this.description = str2;
    }

    @NotNull
    public final stopBleScan getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getBizType() {
        return this.bizType;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}
