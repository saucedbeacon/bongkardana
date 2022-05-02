package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingCreateInit", "Lid/dana/domain/saving/model/SavingCreateInit;", "Lid/dana/data/saving/repository/source/network/response/GoalCreateInitResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class switchUserLoginRpc {
    @NotNull
    public static final getRegionExitPeriod toSavingCreateInit(@NotNull disableEncrypt disableencrypt) {
        Intrinsics.checkNotNullParameter(disableencrypt, "$this$toSavingCreateInit");
        if (disableencrypt.getCategoryCodes() != null) {
            return new getRegionExitPeriod(disableencrypt.getCategoryCodes(), new ArrayList(), isReady.toMoneyView(disableencrypt.getMaxTargetAmount()));
        }
        throw new Exception(disableencrypt.errorCode);
    }
}
