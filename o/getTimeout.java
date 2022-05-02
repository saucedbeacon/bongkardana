package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingTopUpInit", "Lid/dana/domain/saving/model/SavingTopUpInit;", "Lid/dana/data/saving/repository/source/network/response/GoalTopUpInitResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getTimeout {
    @NotNull
    public static final getDistanceModelUpdateUrl toSavingTopUpInit(@NotNull rpcV2 rpcv2) {
        Intrinsics.checkNotNullParameter(rpcv2, "$this$toSavingTopUpInit");
        return new getDistanceModelUpdateUrl(isReady.toMoneyView(rpcv2.getMaxAmount()), isReady.toMoneyView(rpcv2.getCurrentAmount()), isReady.toMoneyView(rpcv2.getTargetAmount()));
    }
}
