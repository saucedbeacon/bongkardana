package o;

import id.dana.sendmoney.model.RecipientModel;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface setUnit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "removeRecentBankName", "", "recipientModel", "Lid/dana/sendmoney/model/RecipientModel;", "updateRecentBankName", "aliasBankNameUpdated", "", "isUndo", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.setMin {
        void getMax(@NotNull RecipientModel recipientModel);

        void getMin(@NotNull RecipientModel recipientModel, @Nullable String str, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/sendmoney_v2/landing/contract/ManageRecentBankAccountContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onRemoveRecentBankNameSuccess", "", "onUndoRemove", "onUpdateRecentBankNameSuccess", "showSnackbarError", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.getMax {
        void equals();

        void isInside();

        void toFloatRange();

        void toIntRange();
    }
}
