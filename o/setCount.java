package o;

import id.dana.sendmoney.model.BankModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"filterByTopBanks", "", "Lid/dana/sendmoney/model/BankModel;", "insIdFilters", "", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setCount {
    @NotNull
    public static final List<BankModel> getMin(@NotNull List<? extends BankModel> list, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "$this$filterByTopBanks");
        Intrinsics.checkNotNullParameter(list2, "insIdFilters");
        Iterable iterable = list;
        Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((BankModel) next).getMin, next);
        }
        Collection arrayList = new ArrayList();
        for (String str : list2) {
            BankModel bankModel = (BankModel) linkedHashMap.get(str);
            if (bankModel != null) {
                arrayList.add(bankModel);
            }
        }
        return (List) arrayList;
    }
}
