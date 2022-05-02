package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.statement.model.StatementViewModel;
import java.util.List;
import kotlin.Metadata;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/appwidget/DanaAppWidgetContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface ViewBoundsCheck$ViewBounds {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getAllDanaStatementDetail", "", "fromDate", "", "toDate", "getAllDanaStatementSummary", "getBalance", "getCurrentMonthChartData", "getStatementSummaryForEveryMonthFromNMonthAgo", "monthCount", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface getMin extends parentColumns.setMin {
        void getMax();

        void getMin();

        void length();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lid/dana/appwidget/DanaAppWidgetContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onAuthorizedAccess", "", "onGetAllStatementSummary", "listStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "onGetBalance", "balance", "Lid/dana/model/CurrencyAmountModel;", "onGetStatementDetailExpense", "userStatementDetailModelExpense", "Lid/dana/statement/model/UserStatementDetailModel;", "onGetStatementDetailIncome", "userStatementDetailModelIncome", "onShowChart", "incomeAndExpenseEntryChartModel", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "onUnauthorizedAccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin extends parentColumns.getMax {
        void getMax(@NotNull List<StatementViewModel> list);

        void getMin();

        void length(@NotNull CurrencyAmountModel currencyAmountModel);

        void length(@NotNull chooseSizeAndMargin choosesizeandmargin);

        void setMax();

        void setMax(@NotNull autoMigrations automigrations);

        void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin);
    }
}
