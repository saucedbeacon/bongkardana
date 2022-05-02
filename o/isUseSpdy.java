package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingWithdrawInitResult", "Lid/dana/domain/saving/model/SavingWithdrawInitResult;", "Lid/dana/data/saving/repository/source/network/response/SavingWithdrawInitEntityResult;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class isUseSpdy {
    @NotNull
    public static final setUseTrackingCache toSavingWithdrawInitResult(@NotNull needSignature needsignature) {
        Intrinsics.checkNotNullParameter(needsignature, "$this$toSavingWithdrawInitResult");
        ArrayList arrayList = new ArrayList();
        for (RVHttpResponse savingGoalWithdrawMethodView : needsignature.getWithdrawMethodViews()) {
            arrayList.add(setPackageRequest.toSavingGoalWithdrawMethodView(savingGoalWithdrawMethodView));
        }
        return new setUseTrackingCache(access$802.toSavingGoalView(needsignature.getSavingView()), arrayList);
    }
}
