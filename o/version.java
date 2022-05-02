package o;

import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\nH\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00112\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\u0014"}, d2 = {"Lid/dana/appwidget/mapper/IncomeAndExpenseEntryChartModelMapper;", "Lid/dana/data/base/BaseMapper;", "Lid/dana/domain/statement/model/IncomeAndExpenseStatementSummary;", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "()V", "getDataValueEntryForChart", "Ljava/util/ArrayList;", "Lcom/github/mikephil/charting/data/Entry;", "Lkotlin/collections/ArrayList;", "amounts", "", "", "getListOfAmountFromUserStatementList", "", "userStatements", "Lid/dana/domain/statement/model/UserStatement;", "getListOfFloatAmountFromString", "", "map", "oldItem", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class version extends setSpeed<CycledLeScanner, autoMigrations> {
    public final /* synthetic */ Object map(Object obj) {
        CycledLeScanner cycledLeScanner = (CycledLeScanner) obj;
        if (cycledLeScanner == null) {
            return new autoMigrations(new ArrayList(), new ArrayList());
        }
        return new autoMigrations(length(setMin(getMin(cycledLeScanner.getIncomes()))), length(setMin(getMin(cycledLeScanner.getExpenses()))));
    }

    private static List<String> getMin(List<startScan> list) {
        List<String> arrayList = new ArrayList<>();
        for (startScan accumulateAmount : list) {
            String amount = accumulateAmount.getAccumulateAmount().getAmount();
            Intrinsics.checkNotNullExpressionValue(amount, "userStatement.accumulateAmount.amount");
            arrayList.add(amount);
        }
        return arrayList;
    }

    private static List<Float> setMin(List<String> list) {
        List<Float> arrayList = new ArrayList<>();
        for (String replace$default : list) {
            arrayList.add(Float.valueOf(Float.parseFloat(StringsKt.replace$default(replace$default, ".", "", false, 4, (Object) null))));
        }
        return arrayList;
    }

    private static ArrayList<Entry> length(List<Float> list) {
        ArrayList<Entry> arrayList = new ArrayList<>();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            float floatValue = list.get(i).floatValue();
            AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
            arrayList.add(new Entry((float) i, floatValue, AUAbsTheme.getMin()));
        }
        return arrayList;
    }
}
