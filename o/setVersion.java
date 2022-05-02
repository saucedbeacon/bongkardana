package o;

import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.MoneyView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00060\u0004\u001a\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0006¨\u0006\b"}, d2 = {"toCurrencyAmount", "Lid/dana/domain/user/CurrencyAmount;", "Lcom/alipay/ap/mobileprod/service/facade/uniresultpage/model/MoneyView;", "toListOfStatementSummary", "", "Lid/dana/domain/statement/model/StatementSummary;", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateSummary;", "toStatementSummary", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setVersion {
    @NotNull
    public static final List<getDistinctPacketsDetectedPerScan> getMax(@NotNull List<setFilePath> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListOfStatementSummary");
        Iterable<setFilePath> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (setFilePath setfilepath : iterable) {
            Intrinsics.checkNotNullParameter(setfilepath, "$this$toStatementSummary");
            MoneyView amount = setfilepath.getAmount();
            Intrinsics.checkNotNullParameter(amount, "$this$toCurrencyAmount");
            arrayList.add(new getDistinctPacketsDetectedPerScan(new stopBleScan(isOriginHasAppInfo.getCleanSpaceAndDash(amount.amount), amount.currency), setfilepath.getBizType(), setfilepath.getDescription()));
        }
        return CollectionsKt.sortedWith((List) arrayList, new getMin());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class getMin<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String cleanDot = isOriginHasAppInfo.getCleanDot(((getDistinctPacketsDetectedPerScan) t2).getAmount().getAmount());
            Intrinsics.checkNotNullExpressionValue(cleanDot, "NumberUtils.getCleanDot(it.amount.amount)");
            String cleanDot2 = isOriginHasAppInfo.getCleanDot(((getDistinctPacketsDetectedPerScan) t).getAmount().getAmount());
            Intrinsics.checkNotNullExpressionValue(cleanDot2, "NumberUtils.getCleanDot(it.amount.amount)");
            return ComparisonsKt.compareValues(StringsKt.toLongOrNull(cleanDot), StringsKt.toLongOrNull(cleanDot2));
        }
    }
}
