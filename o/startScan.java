package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\nHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lid/dana/domain/statement/model/UserStatement;", "", "accumulateAmount", "Lid/dana/domain/user/CurrencyAmount;", "userStatement", "", "Lid/dana/domain/statement/model/StatementSummary;", "statementType", "", "viewType", "", "(Lid/dana/domain/user/CurrencyAmount;Ljava/util/List;Ljava/lang/String;I)V", "getAccumulateAmount", "()Lid/dana/domain/user/CurrencyAmount;", "getStatementType", "()Ljava/lang/String;", "getUserStatement", "()Ljava/util/List;", "getViewType", "()I", "setViewType", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class startScan {
    @NotNull
    private final stopBleScan accumulateAmount;
    @NotNull
    private final String statementType;
    @NotNull
    private final List<getDistinctPacketsDetectedPerScan> userStatement;
    private int viewType;

    public static /* synthetic */ startScan copy$default(startScan startscan, stopBleScan stopblescan, List<getDistinctPacketsDetectedPerScan> list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            stopblescan = startscan.accumulateAmount;
        }
        if ((i2 & 2) != 0) {
            list = startscan.userStatement;
        }
        if ((i2 & 4) != 0) {
            str = startscan.statementType;
        }
        if ((i2 & 8) != 0) {
            i = startscan.viewType;
        }
        return startscan.copy(stopblescan, list, str, i);
    }

    @NotNull
    public final stopBleScan component1() {
        return this.accumulateAmount;
    }

    @NotNull
    public final List<getDistinctPacketsDetectedPerScan> component2() {
        return this.userStatement;
    }

    @NotNull
    public final String component3() {
        return this.statementType;
    }

    public final int component4() {
        return this.viewType;
    }

    @NotNull
    public final startScan copy(@NotNull stopBleScan stopblescan, @NotNull List<getDistinctPacketsDetectedPerScan> list, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(stopblescan, "accumulateAmount");
        Intrinsics.checkNotNullParameter(list, "userStatement");
        Intrinsics.checkNotNullParameter(str, "statementType");
        return new startScan(stopblescan, list, str, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof startScan)) {
            return false;
        }
        startScan startscan = (startScan) obj;
        return Intrinsics.areEqual((Object) this.accumulateAmount, (Object) startscan.accumulateAmount) && Intrinsics.areEqual((Object) this.userStatement, (Object) startscan.userStatement) && Intrinsics.areEqual((Object) this.statementType, (Object) startscan.statementType) && this.viewType == startscan.viewType;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatement(accumulateAmount=");
        sb.append(this.accumulateAmount);
        sb.append(", userStatement=");
        sb.append(this.userStatement);
        sb.append(", statementType=");
        sb.append(this.statementType);
        sb.append(", viewType=");
        sb.append(this.viewType);
        sb.append(")");
        return sb.toString();
    }

    public startScan(@NotNull stopBleScan stopblescan, @NotNull List<getDistinctPacketsDetectedPerScan> list, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(stopblescan, "accumulateAmount");
        Intrinsics.checkNotNullParameter(list, "userStatement");
        Intrinsics.checkNotNullParameter(str, "statementType");
        this.accumulateAmount = stopblescan;
        this.userStatement = list;
        this.statementType = str;
        this.viewType = i;
    }

    @NotNull
    public final stopBleScan getAccumulateAmount() {
        return this.accumulateAmount;
    }

    @NotNull
    public final List<getDistinctPacketsDetectedPerScan> getUserStatement() {
        return this.userStatement;
    }

    @NotNull
    public final String getStatementType() {
        return this.statementType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ startScan(stopBleScan stopblescan, List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(stopblescan, list, str, (i2 & 8) != 0 ? 1 : i);
    }

    public final int getViewType() {
        return this.viewType;
    }

    public final void setViewType(int i) {
        this.viewType = i;
    }

    public final int hashCode() {
        stopBleScan stopblescan = this.accumulateAmount;
        int i = 0;
        int hashCode = (stopblescan != null ? stopblescan.hashCode() : 0) * 31;
        List<getDistinctPacketsDetectedPerScan> list = this.userStatement;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.statementType;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.valueOf(this.viewType).hashCode();
    }
}
