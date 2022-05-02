package o;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0007J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J=\u0010\u0010\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "", "incomes", "Ljava/util/ArrayList;", "Lcom/github/mikephil/charting/data/Entry;", "Lkotlin/collections/ArrayList;", "expenses", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getExpenses", "()Ljava/util/ArrayList;", "setExpenses", "(Ljava/util/ArrayList;)V", "getIncomes", "setIncomes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class autoMigrations {
    @NotNull
    public ArrayList<Entry> getMin;
    @NotNull
    public ArrayList<Entry> length;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof autoMigrations)) {
            return false;
        }
        autoMigrations automigrations = (autoMigrations) obj;
        return Intrinsics.areEqual((Object) this.length, (Object) automigrations.length) && Intrinsics.areEqual((Object) this.getMin, (Object) automigrations.getMin);
    }

    public final int hashCode() {
        ArrayList<Entry> arrayList = this.length;
        int i = 0;
        int hashCode = (arrayList != null ? arrayList.hashCode() : 0) * 31;
        ArrayList<Entry> arrayList2 = this.getMin;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("IncomeAndExpenseEntryChartModel(incomes=");
        sb.append(this.length);
        sb.append(", expenses=");
        sb.append(this.getMin);
        sb.append(")");
        return sb.toString();
    }

    public autoMigrations(@NotNull ArrayList<Entry> arrayList, @NotNull ArrayList<Entry> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "incomes");
        Intrinsics.checkNotNullParameter(arrayList2, "expenses");
        this.length = arrayList;
        this.getMin = arrayList2;
    }
}
