package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingUpdateInit", "Lid/dana/domain/saving/model/SavingUpdateInit;", "Lid/dana/data/saving/repository/source/network/response/GoalUpdateInitResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getMethod {
    @NotNull
    public static final setDistanceModelUpdateUrl toSavingUpdateInit(@NotNull rpcLoggerLevel rpcloggerlevel) {
        Intrinsics.checkNotNullParameter(rpcloggerlevel, "$this$toSavingUpdateInit");
        return new setDistanceModelUpdateUrl(rpcloggerlevel.getCategoryCodes(), new ArrayList(), isReady.toMoneyView(rpcloggerlevel.getMaxTargetAmount()), access$802.toSavingGoalView(rpcloggerlevel.getSavingView()));
    }
}
