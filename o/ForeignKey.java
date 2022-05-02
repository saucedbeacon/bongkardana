package o;

import id.dana.base.BaseActivity;
import id.dana.sendmoney.model.BankModel;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/bank/contract/BankSelectorContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface ForeignKey {

    public final class Action implements RedDotManager {
        private final BaseActivity getMin;

        public Action(BaseActivity baseActivity) {
            this.getMin = baseActivity;
        }

        public final void accept(Object obj) {
            this.getMin.lambda$onNewIntent$4((String) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lid/dana/bank/contract/BankSelectorContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetNameCheckConfig", "", "bankSelectorConfigModel", "Lid/dana/requestmoney/model/BankSelectorConfigModel;", "onNameCheck", "withdrawNameCheckModel", "Lid/dana/sendmoney/model/WithdrawNameCheckModel;", "onNameCheckCount", "count", "", "onNameCheckFreezeTime", "onSavedBankExist", "showGeneralError", "message", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends parentColumns.getMax {
        void getMin(@NotNull getProxy getproxy);

        void length(@NotNull x xVar);

        void setMax();

        void setMax(int i);

        void setMax(@NotNull String str);

        void setMax(@NotNull getProxy getproxy);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/bank/contract/BankSelectorContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "doNameCheck", "", "bankModel", "Lid/dana/sendmoney/model/BankModel;", "nameCheckConfigModel", "Lid/dana/requestmoney/model/BankSelectorConfigModel;", "init", "defaultFromRecent", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.setMin {
        void setMax(@NotNull BankModel bankModel, @NotNull x xVar);

        void setMax(boolean z);
    }
}
