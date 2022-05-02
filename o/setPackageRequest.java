package o;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSavingGoalWithdrawMethodView", "Lid/dana/domain/saving/model/SavingGoalWithdrawMethod;", "Lid/dana/data/saving/model/WithdrawMethodView;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class setPackageRequest {
    @NotNull
    public static final getRssiFilterImplClass toSavingGoalWithdrawMethodView(@NotNull RVHttpResponse rVHttpResponse) {
        Intrinsics.checkNotNullParameter(rVHttpResponse, "$this$toSavingGoalWithdrawMethodView");
        String withdrawMethod = rVHttpResponse.getWithdrawMethod();
        boolean enableWithdrawSaveAccount = rVHttpResponse.getEnableWithdrawSaveAccount();
        boolean success = rVHttpResponse.getSuccess();
        String errorCode = rVHttpResponse.getErrorCode();
        String str = errorCode == null ? "" : errorCode;
        String errorMsg = rVHttpResponse.getErrorMsg();
        if (errorMsg == null) {
            errorMsg = "";
        }
        return new getRssiFilterImplClass(withdrawMethod, enableWithdrawSaveAccount, success, str, errorMsg);
    }
}
