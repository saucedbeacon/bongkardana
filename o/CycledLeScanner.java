package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lid/dana/domain/statement/model/IncomeAndExpenseStatementSummary;", "", "incomes", "", "Lid/dana/domain/statement/model/UserStatement;", "expenses", "(Ljava/util/List;Ljava/util/List;)V", "getExpenses", "()Ljava/util/List;", "setExpenses", "(Ljava/util/List;)V", "getIncomes", "setIncomes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class CycledLeScanner {
    @NotNull
    private List<startScan> expenses;
    @NotNull
    private List<startScan> incomes;

    public static /* synthetic */ CycledLeScanner copy$default(CycledLeScanner cycledLeScanner, List<startScan> list, List<startScan> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cycledLeScanner.incomes;
        }
        if ((i & 2) != 0) {
            list2 = cycledLeScanner.expenses;
        }
        return cycledLeScanner.copy(list, list2);
    }

    @NotNull
    public final List<startScan> component1() {
        return this.incomes;
    }

    @NotNull
    public final List<startScan> component2() {
        return this.expenses;
    }

    @NotNull
    public final CycledLeScanner copy(@NotNull List<startScan> list, @NotNull List<startScan> list2) {
        Intrinsics.checkNotNullParameter(list, "incomes");
        Intrinsics.checkNotNullParameter(list2, "expenses");
        return new CycledLeScanner(list, list2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CycledLeScanner)) {
            return false;
        }
        CycledLeScanner cycledLeScanner = (CycledLeScanner) obj;
        return Intrinsics.areEqual((Object) this.incomes, (Object) cycledLeScanner.incomes) && Intrinsics.areEqual((Object) this.expenses, (Object) cycledLeScanner.expenses);
    }

    public final int hashCode() {
        List<startScan> list = this.incomes;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<startScan> list2 = this.expenses;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomeAndExpenseStatementSummary(incomes=");
        sb.append(this.incomes);
        sb.append(", expenses=");
        sb.append(this.expenses);
        sb.append(")");
        return sb.toString();
    }

    public CycledLeScanner(@NotNull List<startScan> list, @NotNull List<startScan> list2) {
        Intrinsics.checkNotNullParameter(list, "incomes");
        Intrinsics.checkNotNullParameter(list2, "expenses");
        this.incomes = list;
        this.expenses = list2;
    }

    @NotNull
    public final List<startScan> getIncomes() {
        return this.incomes;
    }

    public final void setIncomes(@NotNull List<startScan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.incomes = list;
    }

    @NotNull
    public final List<startScan> getExpenses() {
        return this.expenses;
    }

    public final void setExpenses(@NotNull List<startScan> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.expenses = list;
    }
}
