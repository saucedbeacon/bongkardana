package o;

import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.model.rpc.response.LoginResponse;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.statement.TimeUnitInterval;
import id.dana.statement.model.StatementDetailModel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.ConfirmPopup;
import o.PhotoContext;
import o.ViewBoundsCheck$ViewBounds;
import o.getCallbackPackageName;
import o.getSamples;
import o.setLoggingEnabled;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016J\b\u0010\u0004\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/appwidget/DanaAppWidgetPresenter;", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "view", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "getBalance", "Lid/dana/domain/user/interactor/GetBalance;", "holdLogin", "Lid/dana/domain/login/interactor/HoldLogin;", "currencyAmountModelMapper", "Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;", "getAllStatementSummary", "Lid/dana/domain/statement/interactor/GetAllStatementSummary;", "getAllStatementDetail", "Lid/dana/domain/statement/interactor/GetAllStatementDetail;", "getCustomStatementSummary", "Lid/dana/domain/statement/interactor/GetCustomStatementSummary;", "incomeAndExpenseEntryChartModelMapper", "Lid/dana/appwidget/mapper/IncomeAndExpenseEntryChartModelMapper;", "(Lid/dana/appwidget/DanaAppWidgetContract$View;Lid/dana/domain/user/interactor/GetBalance;Lid/dana/domain/login/interactor/HoldLogin;Lid/dana/sendmoney/mapper/CurrencyAmountModelMapper;Lid/dana/domain/statement/interactor/GetAllStatementSummary;Lid/dana/domain/statement/interactor/GetAllStatementDetail;Lid/dana/domain/statement/interactor/GetCustomStatementSummary;Lid/dana/appwidget/mapper/IncomeAndExpenseEntryChartModelMapper;)V", "getAllDanaStatementDetail", "", "fromDate", "", "toDate", "getAllDanaStatementSummary", "getCurrentMonthChartData", "getStatementSummaryForEveryMonthFromNMonthAgo", "monthCount", "", "loadLoginStatus", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class collate implements ViewBoundsCheck$ViewBounds.getMin {
    /* access modifiers changed from: private */
    public final version equals;
    /* access modifiers changed from: private */
    public final PhotoContext.AnonymousClass2 getMax;
    private final setLoggingEnabled getMin;
    private final getSamples isInside;
    private final GriverRVLoggerProxyImpl length;
    private final getBluetoothServices setMax;
    /* access modifiers changed from: private */
    public final ViewBoundsCheck$ViewBounds.setMin setMin;
    private final getCallbackPackageName toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<Throwable, Unit> {
        public static final length INSTANCE = new length();

        length() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userStatement", "", "Lid/dana/domain/statement/model/UserStatement;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends startScan>, Unit> {
        final /* synthetic */ collate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(collate collate) {
            super(1);
            this.this$0 = collate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<startScan>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<startScan> list) {
            Intrinsics.checkNotNullParameter(list, "userStatement");
            this.this$0.setMin.getMax(AUAttrsUtils.setMax(adptApMinMax.length(list)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "statements", "", "Lid/dana/domain/statement/model/UserStatementDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<List<? extends deferScanIfNeeded>, Unit> {
        final /* synthetic */ collate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(collate collate) {
            super(1);
            this.this$0 = collate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<deferScanIfNeeded>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<deferScanIfNeeded> list) {
            Intrinsics.checkNotNullParameter(list, "statements");
            for (deferScanIfNeeded deferscanifneeded : list) {
                int i = index.getMax[deferscanifneeded.getStatementType().ordinal()];
                List<StatementDetailModel> list2 = null;
                if (i == 1) {
                    ViewBoundsCheck$ViewBounds.setMin length = this.this$0.setMin;
                    Intrinsics.checkNotNullParameter(deferscanifneeded, "$this$toUserStatementDetailModel");
                    List<CycledLeScanCallback> statementDetails = deferscanifneeded.getStatementDetails();
                    if (statementDetails != null) {
                        list2 = handleAttrs.setMin(statementDetails);
                    }
                    length.setMin(new chooseSizeAndMargin(list2));
                } else if (i == 2) {
                    ViewBoundsCheck$ViewBounds.setMin length2 = this.this$0.setMin;
                    Intrinsics.checkNotNullParameter(deferscanifneeded, "$this$toUserStatementDetailModel");
                    List<CycledLeScanCallback> statementDetails2 = deferscanifneeded.getStatementDetails();
                    if (statementDetails2 != null) {
                        list2 = handleAttrs.setMin(statementDetails2);
                    }
                    length2.length(new chooseSizeAndMargin(list2));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "incomeAndExpenseStatementSummary", "Lid/dana/domain/statement/model/IncomeAndExpenseStatementSummary;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<CycledLeScanner, Unit> {
        final /* synthetic */ collate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(collate collate) {
            super(1);
            this.this$0 = collate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CycledLeScanner) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull CycledLeScanner cycledLeScanner) {
            Intrinsics.checkNotNullParameter(cycledLeScanner, "incomeAndExpenseStatementSummary");
            this.this$0.setMin.dismissProgress();
            ViewBoundsCheck$ViewBounds.setMin length = this.this$0.setMin;
            Object apply = this.this$0.equals.apply(cycledLeScanner);
            Intrinsics.checkNotNullExpressionValue(apply, "incomeAndExpenseEntryCha…dExpenseStatementSummary)");
            length.setMax((autoMigrations) apply);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ collate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(collate collate) {
            super(1);
            this.this$0 = collate;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.setMin.dismissProgress();
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
        }
    }

    @Inject
    public collate(@NotNull ViewBoundsCheck$ViewBounds.setMin setmin, @NotNull getBluetoothServices getbluetoothservices, @NotNull GriverRVLoggerProxyImpl griverRVLoggerProxyImpl, @NotNull PhotoContext.AnonymousClass2 r5, @NotNull setLoggingEnabled setloggingenabled, @NotNull getCallbackPackageName getcallbackpackagename, @NotNull getSamples getsamples, @NotNull version version) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        Intrinsics.checkNotNullParameter(getbluetoothservices, "getBalance");
        Intrinsics.checkNotNullParameter(griverRVLoggerProxyImpl, "holdLogin");
        Intrinsics.checkNotNullParameter(r5, "currencyAmountModelMapper");
        Intrinsics.checkNotNullParameter(setloggingenabled, "getAllStatementSummary");
        Intrinsics.checkNotNullParameter(getcallbackpackagename, "getAllStatementDetail");
        Intrinsics.checkNotNullParameter(getsamples, "getCustomStatementSummary");
        Intrinsics.checkNotNullParameter(version, "incomeAndExpenseEntryChartModelMapper");
        this.setMin = setmin;
        this.setMax = getbluetoothservices;
        this.length = griverRVLoggerProxyImpl;
        this.getMax = r5;
        this.getMin = setloggingenabled;
        this.toIntRange = getcallbackpackagename;
        this.isInside = getsamples;
        this.equals = version;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"id/dana/appwidget/DanaAppWidgetPresenter$getBalance$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/user/CurrencyAmount;", "onNext", "", "currencyAmount", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends GriverAppVirtualHostProxy<stopBleScan> {
        final /* synthetic */ collate setMax;

        getMax(collate collate) {
            this.setMax = collate;
        }

        public final /* synthetic */ void onNext(Object obj) {
            stopBleScan stopblescan = (stopBleScan) obj;
            Intrinsics.checkNotNullParameter(stopblescan, "currencyAmount");
            ViewBoundsCheck$ViewBounds.setMin length = this.setMax.setMin;
            Object apply = this.setMax.getMax.apply(stopblescan);
            Intrinsics.checkNotNullExpressionValue(apply, "currencyAmountModelMapper.apply(currencyAmount)");
            length.length((CurrencyAmountModel) apply);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/appwidget/DanaAppWidgetPresenter$loadLoginStatus$1", "Lid/dana/domain/DefaultObserver;", "Lid/dana/domain/model/rpc/response/LoginResponse;", "onError", "", "e", "", "onNext", "loginResponse", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class isInside extends GriverAppVirtualHostProxy<LoginResponse> {
        final /* synthetic */ collate getMax;

        isInside(collate collate) {
            this.getMax = collate;
        }

        public final /* synthetic */ void onNext(Object obj) {
            LoginResponse loginResponse = (LoginResponse) obj;
            Intrinsics.checkNotNullParameter(loginResponse, ChallengePinWithFaceActivity.LOGIN_RESPONSE);
            if (loginResponse.isSuccess()) {
                this.getMax.setMin.setMax();
            } else {
                this.getMax.setMin.getMin();
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.setMin.getMin();
        }
    }

    public final void setMax() {
        this.setMax.dispose();
        this.getMin.dispose();
        this.toIntRange.dispose();
        this.length.dispose();
        this.isInside.dispose();
    }

    public final void getMax() {
        this.length.execute(new isInside(this));
        this.setMax.execute(new getMax(this));
    }

    public final void setMin() {
        this.length.execute(new isInside(this));
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "Calendar.getInstance()");
        getCurrentTheme getcurrenttheme = new getCurrentTheme(instance.getTimeInMillis(), TimeUnitInterval.MONTH, StatementType.EXPENSE);
        this.getMin.execute(new setLoggingEnabled.getMax(getcurrenttheme.setMin(), getcurrenttheme.length.name()), new setMax(this), getMin.INSTANCE);
    }

    public final void length() {
        this.length.execute(new isInside(this));
        ArrayList<String> min = ConfirmPopup.AnonymousClass1.getMin(System.currentTimeMillis(), 3, "MMyyyy", Boolean.TRUE);
        this.setMin.showProgress();
        getSamples getsamples = this.isInside;
        Intrinsics.checkNotNullExpressionValue(min, "dates");
        getsamples.execute(new getSamples.setMax(min, TimeUnitInterval.MONTH.name()), new toFloatRange(this), new toIntRange(this));
    }

    public final void getMin() {
        int i = Calendar.getInstance().get(1);
        Calendar instance = Calendar.getInstance();
        instance.setTime(ConfirmPopup.AnonymousClass1.setMin(1, Calendar.getInstance().get(2) + 1, i));
        instance.set(5, instance.getActualMinimum(5));
        long timeInMillis = instance.getTimeInMillis();
        long min = ConfirmPopup.AnonymousClass1.getMin();
        this.length.execute(new isInside(this));
        this.toIntRange.execute(new getCallbackPackageName.setMax(timeInMillis, min), new setMin(this), length.INSTANCE);
    }
}
