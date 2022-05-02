package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.statement.model.StatementDetailModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006¨\u0006\u0007"}, d2 = {"toListStatementDetailModels", "", "Lid/dana/statement/model/StatementDetailModel;", "Lid/dana/domain/statement/model/StatementDetail;", "toUserStatementDetailModel", "Lid/dana/statement/model/UserStatementDetailModel;", "Lid/dana/domain/statement/model/UserStatementDetail;", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class handleAttrs {
    @NotNull
    public static final List<StatementDetailModel> setMin(@NotNull List<CycledLeScanCallback> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListStatementDetailModels");
        Iterable<CycledLeScanCallback> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (CycledLeScanCallback cycledLeScanCallback : iterable) {
            Intrinsics.checkNotNullParameter(cycledLeScanCallback, "$this$toStatementDetailModel");
            long date = cycledLeScanCallback.getDate();
            stopBleScan amount = cycledLeScanCallback.getAmount();
            Intrinsics.checkNotNullParameter(amount, "$this$toCurrencyAmountModel");
            arrayList.add(new StatementDetailModel(date, new CurrencyAmountModel(amount.getAmount(), amount.getCurrency())));
        }
        return (List) arrayList;
    }
}
