package o;

import com.alipay.ap.mobileprod.service.facade.uniresultpage.model.MoneyView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.DownloadInstallCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"toListOfStatementDetails", "", "Lid/dana/domain/statement/model/StatementDetail;", "Lid/dana/data/statement/repository/source/network/response/UserAccumulateDetail;", "toUserStatementDetail", "Lid/dana/domain/statement/model/UserStatementDetail;", "Lid/dana/data/statement/repository/source/network/response/StatementDetailResult;", "statementType", "Lid/dana/domain/statement/StatementType;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class PackageDownloadCallback {
    @NotNull
    public static final List<CycledLeScanCallback> setMin(@NotNull List<DownloadInstallCallback.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toListOfStatementDetails");
        Iterable<DownloadInstallCallback.AnonymousClass1> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (DownloadInstallCallback.AnonymousClass1 r1 : iterable) {
            Intrinsics.checkNotNullParameter(r1, "$this$toStatementDetail");
            long date = r1.getDate();
            MoneyView amount = r1.getAmount();
            Intrinsics.checkNotNullParameter(amount, "$this$toCurrencyAmount");
            arrayList.add(new CycledLeScanCallback(date, new stopBleScan(isOriginHasAppInfo.getCleanSpaceAndDash(amount.amount), amount.currency)));
        }
        return (List) arrayList;
    }
}
