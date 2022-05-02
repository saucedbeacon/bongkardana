package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.statement.model.StatementSummaryModel;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007*\b\u0012\u0004\u0012\u00020\r0\u0007\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\r¨\u0006\u000f"}, d2 = {"toCreateStatementFeed", "Lid/dana/statement/model/StatementViewModel;", "Lid/dana/statement/model/UserStatementModel;", "toCurrencyAmountModel", "Lid/dana/model/CurrencyAmountModel;", "Lid/dana/domain/user/CurrencyAmount;", "toListOfStatementSummaryModel", "", "Lid/dana/statement/model/StatementSummaryModel;", "Lid/dana/domain/statement/model/StatementSummary;", "totalAmount", "", "toListUserStatementModel", "Lid/dana/domain/statement/model/UserStatement;", "toUserStatementModel", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class adptApMinMax {
    @NotNull
    private static List<StatementSummaryModel> length(@NotNull List<getDistinctPacketsDetectedPerScan> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "$this$toListOfStatementSummaryModel");
        Intrinsics.checkNotNullParameter(str, "totalAmount");
        Iterable<getDistinctPacketsDetectedPerScan> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (getDistinctPacketsDetectedPerScan getdistinctpacketsdetectedperscan : iterable) {
            Intrinsics.checkNotNullParameter(getdistinctpacketsdetectedperscan, "$this$toStatementSummaryModel");
            Intrinsics.checkNotNullParameter(str, "totalAmount");
            String cleanDot = isOriginHasAppInfo.getCleanDot(getdistinctpacketsdetectedperscan.getAmount().getAmount());
            Intrinsics.checkNotNullExpressionValue(cleanDot, "NumberUtils.getCleanDot(amount.amount)");
            float parseFloat = Float.parseFloat(cleanDot);
            String cleanDot2 = isOriginHasAppInfo.getCleanDot(str);
            Intrinsics.checkNotNullExpressionValue(cleanDot2, "NumberUtils.getCleanDot(totalAmount)");
            String format = new DecimalFormat().format(Float.valueOf((parseFloat / Float.parseFloat(cleanDot2)) * 100.0f));
            Intrinsics.checkNotNullExpressionValue(format, "DecimalFormat()\n        .format(percentProgress)");
            float parseFloat2 = Float.parseFloat(StringsKt.replace$default(format, ",", ".", false, 4, (Object) null));
            stopBleScan amount = getdistinctpacketsdetectedperscan.getAmount();
            Intrinsics.checkNotNullParameter(amount, "$this$toCurrencyAmountModel");
            arrayList.add(new StatementSummaryModel(new CurrencyAmountModel(amount.getAmount(), amount.getCurrency()), getdistinctpacketsdetectedperscan.getBizType(), getdistinctpacketsdetectedperscan.getDescription(), parseFloat2));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final UserStatementModel setMin(@NotNull startScan startscan) {
        Intrinsics.checkNotNullParameter(startscan, "$this$toUserStatementModel");
        stopBleScan accumulateAmount = startscan.getAccumulateAmount();
        Intrinsics.checkNotNullParameter(accumulateAmount, "$this$toCurrencyAmountModel");
        CurrencyAmountModel currencyAmountModel = new CurrencyAmountModel(accumulateAmount.getAmount(), accumulateAmount.getCurrency());
        List<getDistinctPacketsDetectedPerScan> userStatement = startscan.getUserStatement();
        String amount = startscan.getAccumulateAmount().getAmount();
        Intrinsics.checkNotNullExpressionValue(amount, "accumulateAmount.amount");
        return new UserStatementModel(currencyAmountModel, length(userStatement, amount), startscan.getViewType(), startscan.getStatementType(), (String) null, (String) null, (String) null, (String) null, 240);
    }

    @NotNull
    public static final StatementViewModel setMax(@NotNull UserStatementModel userStatementModel) {
        Intrinsics.checkNotNullParameter(userStatementModel, "$this$toCreateStatementFeed");
        return new StatementViewModel(userStatementModel.getMax, new UserStatementModel(userStatementModel.setMax, userStatementModel.getMin, userStatementModel.getMax, userStatementModel.setMin, (String) null, (String) null, (String) null, (String) null, 240));
    }

    @NotNull
    public static final List<UserStatementModel> length(@NotNull List<startScan> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListUserStatementModel");
        Iterable<startScan> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (startScan min : iterable) {
            arrayList.add(setMin(min));
        }
        return (List) arrayList;
    }
}
