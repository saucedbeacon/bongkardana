package o;

import id.dana.requestmoney.model.UserBankModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/requestmoney/bank/UserBankContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface publishImageAction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lid/dana/requestmoney/bank/UserBankContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "()V", "onAddUserBank", "", "success", "", "onDeleteUserBank", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "onGetMaxBankAccountSuccess", "maxBankAccount", "", "onGetSavedUserBanksSuccess", "userBanks", "", "onSaveUserBanksSuccess", "onUserBankExist", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static abstract class length implements parentColumns.getMax {
        @JvmDefault
        public void dismissProgress() {
        }

        @JvmDefault
        public void onError(@Nullable String str) {
        }

        public void setMax() {
        }

        public void setMax(boolean z, @NotNull UserBankModel userBankModel) {
            Intrinsics.checkNotNullParameter(userBankModel, "userBankModel");
        }

        public void setMin(int i) {
        }

        public void setMin(@NotNull List<UserBankModel> list) {
            Intrinsics.checkNotNullParameter(list, "userBanks");
        }

        public void setMin(boolean z) {
        }

        @JvmDefault
        public void showProgress() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/requestmoney/bank/UserBankContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "addUserBank", "", "userBankModel", "Lid/dana/requestmoney/model/UserBankModel;", "deleteUserBank", "getMaxBankAccount", "getSavedUserBanks", "init", "saveUserBanks", "userBankModels", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.setMin {
        void getMax();

        void getMin();

        void length(@NotNull UserBankModel userBankModel);

        void setMin(@NotNull UserBankModel userBankModel);
    }
}
