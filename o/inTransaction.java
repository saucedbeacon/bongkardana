package o;

import kotlin.Metadata;
import o.onDelete;
import o.parentColumns;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/challenge/pin/LogoutContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface inTransaction {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/challenge/pin/LogoutContract$Presenter;", "Lid/dana/base/AbstractContract$AbstractPresenter;", "logout", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMax extends onDelete.getMin {
        void length();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/challenge/pin/LogoutContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "dismissLoadingLogoutProgress", "", "onFinishLogout", "showLoadingLogoutProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.getMax {
        void getMax();

        void getMin();

        void setMax();
    }
}
