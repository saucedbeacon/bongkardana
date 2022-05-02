package o;

import id.dana.nearbyme.merchantdetail.model.MoneyViewModel;
import id.dana.savings.model.SavingModel;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingCreateContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface notifyMicError {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingCreateContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "createSaving", "", "categoryCode", "", "title", "targetAmount", "getKycStatus", "initCreateSaving", "validateGoal", "Lid/dana/nearbyme/merchantdetail/model/MoneyViewModel;", "maxTargetAmount", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.setMin {
        void getMin(@NotNull String str, @NotNull String str2, @NotNull MoneyViewModel moneyViewModel, @NotNull MoneyViewModel moneyViewModel2);

        void length();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/savings/contract/SavingCreateContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCreateSaving", "", "savingModel", "Lid/dana/savings/model/SavingModel;", "onGetKycStatus", "isKyc", "", "onGoalReachLimit", "onInitCreateSaving", "savingCreateInitModel", "Lid/dana/savings/model/SavingCreateInitModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.getMax {
        void getMax(@NotNull SavingModel savingModel);

        void getMax(boolean z);

        void getMin(@NotNull setViewType setviewtype);

        void setMax();
    }
}
