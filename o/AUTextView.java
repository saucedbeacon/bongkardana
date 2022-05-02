package o;

import android.graphics.Bitmap;
import com.google.firebase.analytics.FirebaseAnalytics;
import dagger.internal.InjectedFieldSignature;
import id.dana.splitbill.view.SplitBillShareQrActivity;
import id.dana.statement.StatementActivity;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.model.UserStatementModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.getSelectedIndex;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AUTextView implements RedDotManager {
    private final SplitBillShareQrActivity setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/statement/StatementMenuListener;", "", "onClickExpense", "", "onClickIncome", "onMonthRolled", "date", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface OnTextViewTextChangeListener {
        void getMax(long j);

        void getMin();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0016\u0010\u0007\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001b"}, d2 = {"Lid/dana/statement/UserStatementListener;", "Lid/dana/statement/UserStatementContract$View;", "()V", "onCheckFeatureDownloadStatementEnable", "", "downloadStatementEnable", "", "onGetAllStatementSummary", "viewModels", "", "Lid/dana/statement/model/StatementViewModel;", "onGetDetailError", "onGetStatementDetailExpense", "userStatementDetailModelExpense", "Lid/dana/statement/model/UserStatementDetailModel;", "onGetStatementDetailIncome", "userStatementDetailModelIncome", "onGetStatementSummaryExpense", "userStatementModelExpense", "Lid/dana/statement/model/UserStatementModel;", "onGetStatementSummaryIncome", "userStatementModelIncome", "onGetTotalStatementExpense", "amount", "", "currency", "onGetTotalStatementIncome", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public abstract class OnTvGlobalLayoutListener implements OnVisibilityChangeListener.getMax {
        @JvmDefault
        public void dismissProgress() {
        }

        public void getMax(@NotNull UserStatementModel userStatementModel) {
            Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModelIncome");
        }

        public void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "viewModels");
        }

        public void getMax(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelExpense");
        }

        public void getMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        }

        public void length(@NotNull UserStatementModel userStatementModel) {
            Intrinsics.checkNotNullParameter(userStatementModel, "userStatementModelExpense");
        }

        public void length(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "amount");
            Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CURRENCY);
        }

        @JvmDefault
        public void onError(@Nullable String str) {
        }

        public void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelIncome");
        }

        public void setMin(boolean z) {
        }

        @JvmDefault
        public void showProgress() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/statement/UserStatementContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface OnVisibilityChangeListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0012H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lid/dana/statement/UserStatementContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onCheckFeatureDownloadStatementEnable", "", "downloadStatementEnable", "", "onGetAllStatementSummary", "viewModels", "", "Lid/dana/statement/model/StatementViewModel;", "onGetDetailError", "onGetStatementDetailExpense", "userStatementDetailModelExpense", "Lid/dana/statement/model/UserStatementDetailModel;", "onGetStatementDetailIncome", "userStatementDetailModelIncome", "onGetStatementSummaryExpense", "userStatementModelExpense", "Lid/dana/statement/model/UserStatementModel;", "onGetStatementSummaryIncome", "userStatementModelIncome", "onGetTotalStatementExpense", "amount", "", "currency", "onGetTotalStatementIncome", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface getMax extends parentColumns.getMax {
            void getMax(@NotNull UserStatementModel userStatementModel);

            void getMax(@NotNull List<StatementViewModel> list);

            void getMax(@NotNull chooseSizeAndMargin choosesizeandmargin);

            void getMin(@NotNull String str, @NotNull String str2);

            void length(@NotNull UserStatementModel userStatementModel);

            void length(@NotNull String str, @NotNull String str2);

            void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin);

            void setMin(boolean z);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lid/dana/statement/UserStatementContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "checkFeatureDownloadStatementEnable", "", "getAllStatementDetail", "fromDate", "", "toDate", "getAllStatementSummary", "summaryInit", "Lid/dana/statement/model/StatementSummaryInit;", "getCurrentMonthChartData", "getStatementDetail", "detailInit", "Lid/dana/statement/model/StatementDetailInit;", "getStatementSummary", "getTotalStatement", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface setMax extends parentColumns.setMin {
            void getMax(@NotNull getCurrentTheme getcurrenttheme);

            void getMin();

            void getMin(@NotNull getCurrentTheme getcurrenttheme);

            void setMin();

            void setMin(long j, long j2);

            void setMin(@NotNull getCurrentTheme getcurrenttheme);
        }
    }

    public AUTextView(SplitBillShareQrActivity splitBillShareQrActivity) {
        this.setMax = splitBillShareQrActivity;
    }

    public final void accept(Object obj) {
        this.setMax.qrView.getQrImageView().setImageBitmap((Bitmap) obj);
    }

    /* renamed from: o.AUTextView$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<StatementActivity> {
        @InjectedFieldSignature("id.dana.statement.StatementActivity.presenter")
        public static void getMax(StatementActivity statementActivity, OnVisibilityChangeListener.setMax setmax) {
            statementActivity.presenter = setmax;
        }

        @InjectedFieldSignature("id.dana.statement.StatementActivity.onBoardingPresenter")
        public static void length(StatementActivity statementActivity, getSelectedIndex.length length) {
            statementActivity.onBoardingPresenter = length;
        }
    }
}
