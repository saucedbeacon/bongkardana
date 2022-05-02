package o;

import id.dana.domain.statement.StatementType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J%\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lid/dana/domain/statement/model/UserStatementDetail;", "", "statementDetails", "", "Lid/dana/domain/statement/model/StatementDetail;", "statementType", "Lid/dana/domain/statement/StatementType;", "(Ljava/util/List;Lid/dana/domain/statement/StatementType;)V", "getStatementDetails", "()Ljava/util/List;", "getStatementType", "()Lid/dana/domain/statement/StatementType;", "setStatementType", "(Lid/dana/domain/statement/StatementType;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class deferScanIfNeeded {
    @Nullable
    private final List<CycledLeScanCallback> statementDetails;
    @NotNull
    private StatementType statementType;

    public static /* synthetic */ deferScanIfNeeded copy$default(deferScanIfNeeded deferscanifneeded, List<CycledLeScanCallback> list, StatementType statementType2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deferscanifneeded.statementDetails;
        }
        if ((i & 2) != 0) {
            statementType2 = deferscanifneeded.statementType;
        }
        return deferscanifneeded.copy(list, statementType2);
    }

    @Nullable
    public final List<CycledLeScanCallback> component1() {
        return this.statementDetails;
    }

    @NotNull
    public final StatementType component2() {
        return this.statementType;
    }

    @NotNull
    public final deferScanIfNeeded copy(@Nullable List<CycledLeScanCallback> list, @NotNull StatementType statementType2) {
        Intrinsics.checkNotNullParameter(statementType2, "statementType");
        return new deferScanIfNeeded(list, statementType2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deferScanIfNeeded)) {
            return false;
        }
        deferScanIfNeeded deferscanifneeded = (deferScanIfNeeded) obj;
        return Intrinsics.areEqual((Object) this.statementDetails, (Object) deferscanifneeded.statementDetails) && Intrinsics.areEqual((Object) this.statementType, (Object) deferscanifneeded.statementType);
    }

    public final int hashCode() {
        List<CycledLeScanCallback> list = this.statementDetails;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        StatementType statementType2 = this.statementType;
        if (statementType2 != null) {
            i = statementType2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("UserStatementDetail(statementDetails=");
        sb.append(this.statementDetails);
        sb.append(", statementType=");
        sb.append(this.statementType);
        sb.append(")");
        return sb.toString();
    }

    public deferScanIfNeeded(@Nullable List<CycledLeScanCallback> list, @NotNull StatementType statementType2) {
        Intrinsics.checkNotNullParameter(statementType2, "statementType");
        this.statementDetails = list;
        this.statementType = statementType2;
    }

    @Nullable
    public final List<CycledLeScanCallback> getStatementDetails() {
        return this.statementDetails;
    }

    @NotNull
    public final StatementType getStatementType() {
        return this.statementType;
    }

    public final void setStatementType(@NotNull StatementType statementType2) {
        Intrinsics.checkNotNullParameter(statementType2, "<set-?>");
        this.statementType = statementType2;
    }
}
