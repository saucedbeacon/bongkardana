package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.statement.StatementType;
import id.dana.statement.model.StatementDetailModel;
import java.util.Calendar;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUTextView;
import o.ConfirmPopup;
import o.getCallbackPackageName;
import o.setLoggingEnabled;
import o.setLongScanForcingEnabled;
import o.setSampleIntervalMillis;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0010\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u0012H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lid/dana/statement/UserStatementPresenter;", "Lid/dana/statement/UserStatementContract$Presenter;", "view", "Lid/dana/statement/UserStatementContract$View;", "getStatementSummary", "Lid/dana/domain/statement/interactor/GetStatementSummary;", "getStatementDetail", "Lid/dana/domain/statement/interactor/GetStatementDetail;", "getAllStatementSummary", "Lid/dana/domain/statement/interactor/GetAllStatementSummary;", "getTotalStatements", "Lid/dana/domain/statement/interactor/GetTotalStatements;", "getAllStatementDetail", "Lid/dana/domain/statement/interactor/GetAllStatementDetail;", "checkFeatureDownloadStatement", "Lid/dana/domain/statement/interactor/CheckFeatureDownloadStatement;", "(Lid/dana/statement/UserStatementContract$View;Lid/dana/domain/statement/interactor/GetStatementSummary;Lid/dana/domain/statement/interactor/GetStatementDetail;Lid/dana/domain/statement/interactor/GetAllStatementSummary;Lid/dana/domain/statement/interactor/GetTotalStatements;Lid/dana/domain/statement/interactor/GetAllStatementDetail;Lid/dana/domain/statement/interactor/CheckFeatureDownloadStatement;)V", "checkFeatureDownloadStatementEnable", "", "fromDate", "", "toDate", "summaryInit", "Lid/dana/statement/model/StatementSummaryInit;", "getCurrentMonthChartData", "detailInit", "Lid/dana/statement/model/StatementDetailInit;", "getTotalStatement", "isStatementTypeExpense", "", "statementType", "Lid/dana/domain/statement/StatementType;", "isStatementTypeIncome", "onDestroy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class AUDefaultTheme implements AUTextView.OnVisibilityChangeListener.setMax {
    private final getBetweenScanPeriod equals;
    private final setLoggingEnabled getMax;
    private final setLongScanForcingEnabled getMin;
    private final clearSamples length;
    private final setSampleIntervalMillis setMax;
    /* access modifiers changed from: private */
    public final AUTextView.OnVisibilityChangeListener.getMax setMin;
    private final getCallbackPackageName toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/statement/model/UserStatement;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<startScan, Unit> {
        final /* synthetic */ getCurrentTheme $summaryInit;
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(AUDefaultTheme aUDefaultTheme, getCurrentTheme getcurrenttheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
            this.$summaryInit = getcurrenttheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((startScan) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull startScan startscan) {
            Intrinsics.checkNotNullParameter(startscan, "it");
            this.this$0.setMin.dismissProgress();
            if (AUDefaultTheme.setMin(this.$summaryInit.setMin)) {
                this.this$0.setMin.getMax(adptApMinMax.setMin(startscan));
            } else if (AUDefaultTheme.getMin(this.$summaryInit.setMin)) {
                this.this$0.setMin.length(adptApMinMax.setMin(startscan));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
            this.this$0.setMin.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "userStatement", "", "Lid/dana/domain/statement/model/UserStatement;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function1<List<? extends startScan>, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<startScan>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<startScan> list) {
            Intrinsics.checkNotNullParameter(list, "userStatement");
            this.this$0.setMin.dismissProgress();
            this.this$0.setMin.getMax(AUAttrsUtils.setMax(adptApMinMax.length(list)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
            this.this$0.setMin.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "statements", "", "Lid/dana/domain/statement/model/TotalStatement;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<List<? extends stopScan>, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<stopScan>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<stopScan> list) {
            Intrinsics.checkNotNullParameter(list, "statements");
            this.this$0.setMin.dismissProgress();
            for (stopScan stopscan : list) {
                int i = getDimensionPixelOffset.length[stopscan.getType().ordinal()];
                if (i == 1) {
                    this.this$0.setMin.getMin(stopscan.getAmount(), stopscan.getCurrency());
                } else if (i == 2) {
                    this.this$0.setMin.length(stopscan.getAmount(), stopscan.getCurrency());
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "statements", "", "Lid/dana/domain/statement/model/UserStatementDetail;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function1<List<? extends deferScanIfNeeded>, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<deferScanIfNeeded>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<deferScanIfNeeded> list) {
            Intrinsics.checkNotNullParameter(list, "statements");
            this.this$0.setMin.dismissProgress();
            for (deferScanIfNeeded deferscanifneeded : list) {
                int i = getDimensionPixelOffset.setMin[deferscanifneeded.getStatementType().ordinal()];
                List<StatementDetailModel> list2 = null;
                if (i == 1) {
                    AUTextView.OnVisibilityChangeListener.getMax length = this.this$0.setMin;
                    Intrinsics.checkNotNullParameter(deferscanifneeded, "$this$toUserStatementDetailModel");
                    List<CycledLeScanCallback> statementDetails = deferscanifneeded.getStatementDetails();
                    if (statementDetails != null) {
                        list2 = handleAttrs.setMin(statementDetails);
                    }
                    length.setMin(new chooseSizeAndMargin(list2));
                } else if (i == 2) {
                    AUTextView.OnVisibilityChangeListener.getMax length2 = this.this$0.setMin;
                    Intrinsics.checkNotNullParameter(deferscanifneeded, "$this$toUserStatementDetailModel");
                    List<CycledLeScanCallback> statementDetails2 = deferscanifneeded.getStatementDetails();
                    if (statementDetails2 != null) {
                        list2 = handleAttrs.setMin(statementDetails2);
                    }
                    length2.getMax(new chooseSizeAndMargin(list2));
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Throwable, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.setMin.setMin(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
            this.this$0.setMin.dismissProgress();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ AUDefaultTheme this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(AUDefaultTheme aUDefaultTheme) {
            super(1);
            this.this$0 = aUDefaultTheme;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.w(DanaLogConstants.TAG.STATEMENT, th.getMessage());
            this.this$0.setMin.dismissProgress();
        }
    }

    @Inject
    public AUDefaultTheme(@NotNull AUTextView.OnVisibilityChangeListener.getMax getmax, @NotNull setSampleIntervalMillis setsampleintervalmillis, @NotNull clearSamples clearsamples, @NotNull setLoggingEnabled setloggingenabled, @NotNull setLongScanForcingEnabled setlongscanforcingenabled, @NotNull getCallbackPackageName getcallbackpackagename, @NotNull getBetweenScanPeriod getbetweenscanperiod) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        Intrinsics.checkNotNullParameter(setsampleintervalmillis, "getStatementSummary");
        Intrinsics.checkNotNullParameter(clearsamples, "getStatementDetail");
        Intrinsics.checkNotNullParameter(setloggingenabled, "getAllStatementSummary");
        Intrinsics.checkNotNullParameter(setlongscanforcingenabled, "getTotalStatements");
        Intrinsics.checkNotNullParameter(getcallbackpackagename, "getAllStatementDetail");
        Intrinsics.checkNotNullParameter(getbetweenscanperiod, "checkFeatureDownloadStatement");
        this.setMin = getmax;
        this.setMax = setsampleintervalmillis;
        this.length = clearsamples;
        this.getMax = setloggingenabled;
        this.getMin = setlongscanforcingenabled;
        this.toIntRange = getcallbackpackagename;
        this.equals = getbetweenscanperiod;
    }

    public final void setMin(@NotNull getCurrentTheme getcurrenttheme) {
        Intrinsics.checkNotNullParameter(getcurrenttheme, "summaryInit");
        this.setMin.showProgress();
        this.setMax.execute(new setSampleIntervalMillis.setMin(getcurrenttheme.setMin(), getcurrenttheme.length.name(), getcurrenttheme.setMin.name()), new IsOverlapping(this, getcurrenttheme), new toFloatRange(this));
    }

    public final void setMin(long j, long j2) {
        this.setMin.showProgress();
        this.toIntRange.execute(new getCallbackPackageName.setMax(j, j2), new length(this), new getMin(this));
    }

    public final void getMax(@NotNull getCurrentTheme getcurrenttheme) {
        Intrinsics.checkNotNullParameter(getcurrenttheme, "summaryInit");
        this.setMin.showProgress();
        this.getMax.execute(new setLoggingEnabled.getMax(getcurrenttheme.setMin(), getcurrenttheme.length.name()), new getMax(this), new equals(this));
    }

    public final void getMin(@NotNull getCurrentTheme getcurrenttheme) {
        Intrinsics.checkNotNullParameter(getcurrenttheme, "summaryInit");
        this.setMin.showProgress();
        this.getMin.execute(new setLongScanForcingEnabled.setMin(getcurrenttheme.setMin(), getcurrenttheme.length.name()), new isInside(this), new toIntRange(this));
    }

    public final void setMin() {
        this.equals.execute(onReceivedIcon.INSTANCE, new setMin(this), setMax.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static boolean getMin(StatementType statementType) {
        return StatementType.EXPENSE == statementType;
    }

    /* access modifiers changed from: private */
    public static boolean setMin(StatementType statementType) {
        return StatementType.INCOME == statementType;
    }

    public final void setMax() {
        this.setMax.dispose();
        this.length.dispose();
        this.getMax.dispose();
        this.getMin.dispose();
        this.equals.dispose();
    }

    public final void getMin() {
        int i = Calendar.getInstance().get(1);
        Calendar instance = Calendar.getInstance();
        instance.setTime(ConfirmPopup.AnonymousClass1.setMin(1, Calendar.getInstance().get(2) + 1, i));
        instance.set(5, instance.getActualMinimum(5));
        setMin(instance.getTimeInMillis(), ConfirmPopup.AnonymousClass1.getMin());
    }
}
