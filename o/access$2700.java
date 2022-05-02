package o;

import id.dana.domain.bank.model.UserBank;
import id.dana.requestmoney.model.UserBankModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0002*\u00020\u0007\u001a\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n*\b\u0012\u0004\u0012\u00020\u00070\n\u001a\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n*\b\u0012\u0004\u0012\u00020\u00020\n¨\u0006\f"}, d2 = {"toGetBankTransferQrParams", "Lid/dana/domain/qrbarcode/interactor/GetBankTransferQr$Params;", "Lid/dana/requestmoney/model/UserBankModel;", "amount", "", "remarks", "toUserBank", "Lid/dana/domain/bank/model/UserBank;", "toUserBankModel", "toUserBankModels", "", "toUserBanks", "app_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class access$2700 {
    @NotNull
    public static final UserBank getMax(@NotNull UserBankModel userBankModel) {
        Intrinsics.checkNotNullParameter(userBankModel, "$this$toUserBank");
        return new UserBank(userBankModel.setMax, userBankModel.getMax, userBankModel.getMin, userBankModel.setMin, userBankModel.length, userBankModel.toFloatRange, userBankModel.equals);
    }
}
