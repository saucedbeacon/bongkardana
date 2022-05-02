package o;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingSummary", "Lid/dana/domain/saving/model/SavingSummary;", "Lid/dana/data/saving/repository/source/network/response/UserSavingSummaryConsultResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class access$2200 {
    @NotNull
    public static final logDebug toSavingSummary(@NotNull access$2100 access_2100) {
        List<BeaconManager> list;
        Intrinsics.checkNotNullParameter(access_2100, "$this$toSavingSummary");
        getAppDir moneyView = isReady.toMoneyView(access_2100.getSavingBalanceAmount());
        getAppDir moneyView2 = isReady.toMoneyView(access_2100.getMaxSavingAmount());
        long maxSavingCount = access_2100.getMaxSavingCount();
        getAppDir moneyView3 = isReady.toMoneyView(access_2100.getRemainingAmount());
        long remainingCount = access_2100.getRemainingCount();
        List<headers> savingViews = access_2100.getSavingViews();
        if (savingViews == null || (list = access$802.toSortedSavingViews(savingViews)) == null) {
            list = CollectionsKt.emptyList();
        }
        return new logDebug(moneyView, moneyView2, maxSavingCount, moneyView3, remainingCount, list, access_2100.getHasNext());
    }
}
