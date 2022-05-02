package id.dana.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.onboarding.splash.SplashActivity;
import id.dana.richview.statement.StatementWidgetChartView;
import id.dana.statement.StatementTransactionType;
import id.dana.statement.model.StatementSummaryModel;
import id.dana.statement.model.StatementViewModel;
import id.dana.statement.view.StatementDateView;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUAbsTheme;
import o.ConfirmPopup;
import o.PrepareException;
import o.ViewBoundsCheck$ViewBounds;
import o.autoMigrations;
import o.chooseSizeAndMargin;
import o.getPresetPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 M2\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020 H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020 H\u0002J\b\u0010/\u001a\u00020 H\u0002J\b\u00100\u001a\u00020 H\u0002J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u0002022\u0006\u00103\u001a\u000204H\u0002J\u0010\u00106\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u00107\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00108\u001a\u000209H\u0016J \u0010:\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u001f\u0010=\u001a\u0004\u0018\u00010 2\u000e\u0010>\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010?J\u0010\u0010@\u001a\u00020 2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020 H\u0002J\u0010\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u000202H\u0002J,\u0010F\u001a\u00020 2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00180I2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u0002042\u0006\u0010L\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001d¨\u0006N"}, d2 = {"Lid/dana/appwidget/DanaStatementMediumWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetIds", "", "chartHeight", "", "getChartHeight", "()F", "chartHeight$delegate", "Lkotlin/Lazy;", "chartWidth", "getChartWidth", "chartWidth$delegate", "context", "Landroid/content/Context;", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "expenseIcons", "", "", "incomeIcons", "lineChartView", "Lid/dana/richview/statement/StatementWidgetChartView;", "getLineChartView", "()Lid/dana/richview/statement/StatementWidgetChartView;", "lineChartView$delegate", "beginWidgetUpdateAll", "", "remoteViews", "Landroid/widget/RemoteViews;", "beginWidgetUpdatePartially", "createLoginIntent", "Landroid/app/PendingIntent;", "getChartData", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getPendingSelfIntentReload", "getStatementTransactionType", "Lid/dana/statement/StatementTransactionType;", "bizType", "", "initChartView", "initComponent", "initOnClickListener", "isTypeExpense", "", "item", "Lid/dana/statement/model/StatementViewModel;", "isTypeIncome", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "setStatementSummary", "viewModels", "(Ljava/util/List;)Lkotlin/Unit;", "setupChartView", "incomeAndExpenseEntryChartModel", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "setupStatementDate", "toggleWidgetLoginView", "shouldShowLoginView", "updateListOfImageView", "listOfImageView", "listOfImage", "", "updateSummariesListAndBalanceLabelSection", "viewModel", "isIncome", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaStatementMediumWidgetProvider extends AppWidgetProvider {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    public static final int MAX_MONTH_SUMMARY_CHART_COUNT = 3;
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    /* access modifiers changed from: private */
    public Context getMax;
    private int[] getMin;
    private List<Integer> length = CollectionsKt.listOf(Integer.valueOf(R.id.f49582131363513), Integer.valueOf(R.id.f49592131363514), Integer.valueOf(R.id.f49602131363515), Integer.valueOf(R.id.f49612131363516));
    private List<Integer> setMax = CollectionsKt.listOf(Integer.valueOf(R.id.f49532131363508), Integer.valueOf(R.id.f49542131363509), Integer.valueOf(R.id.f49552131363510), Integer.valueOf(R.id.f49562131363511));
    private final Lazy setMin = LazyKt.lazy(new setMin(this));
    private final Lazy toFloatRange = LazyKt.lazy(new getMax(this));
    private final Lazy toIntRange = LazyKt.lazy(new getMin(this));

    public static final /* synthetic */ Context access$getContext$p(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider) {
        Context context = danaStatementMediumWidgetProvider.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        return context;
    }

    @NotNull
    public final ViewBoundsCheck$ViewBounds.getMin getDanaAppWidgetPresenter() {
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        return getmin;
    }

    public final void setDanaAppWidgetPresenter(@NotNull ViewBoundsCheck$ViewBounds.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "<set-?>");
        this.danaAppWidgetPresenter = getmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<Float> {
        final /* synthetic */ DanaStatementMediumWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider) {
            super(0);
            this.this$0 = danaStatementMediumWidgetProvider;
        }

        public final float invoke() {
            return DanaStatementMediumWidgetProvider.access$getContext$p(this.this$0).getResources().getDimension(R.dimen.f33122131166103);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function0<Float> {
        final /* synthetic */ DanaStatementMediumWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMin(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider) {
            super(0);
            this.this$0 = danaStatementMediumWidgetProvider;
        }

        public final float invoke() {
            return DanaStatementMediumWidgetProvider.access$getContext$p(this.this$0).getResources().getDimension(R.dimen.f33112131166102);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/richview/statement/StatementWidgetChartView;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<StatementWidgetChartView> {
        final /* synthetic */ DanaStatementMediumWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider) {
            super(0);
            this.this$0 = danaStatementMediumWidgetProvider;
        }

        @NotNull
        public final StatementWidgetChartView invoke() {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((Number) this.this$0.setMin.getValue()).floatValue(), (int) ((Number) this.this$0.toIntRange.getValue()).floatValue());
            StatementWidgetChartView statementWidgetChartView = new StatementWidgetChartView(DanaStatementMediumWidgetProvider.access$getContext$p(this.this$0));
            statementWidgetChartView.setLayoutParams(layoutParams);
            statementWidgetChartView.getLayoutParams().width = (int) ((Number) this.this$0.setMin.getValue()).floatValue();
            statementWidgetChartView.getLayoutParams().height = (int) ((Number) this.this$0.toIntRange.getValue()).floatValue();
            statementWidgetChartView.measure((int) ((Number) this.this$0.setMin.getValue()).floatValue(), (int) ((Number) this.this$0.toIntRange.getValue()).floatValue());
            statementWidgetChartView.layout(statementWidgetChartView.getLeft(), statementWidgetChartView.getTop(), (int) ((Number) this.this$0.setMin.getValue()).floatValue(), (int) ((Number) this.this$0.toIntRange.getValue()).floatValue());
            return statementWidgetChartView;
        }
    }

    public final void onEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMax = context;
        super.onEnabled(context);
    }

    public final void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        String str;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(iArr, "appWidgetIds");
        this.getMin = iArr;
        this.getMax = context;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            getPresetPackage.getMin getmin = new getPresetPackage.getMin((byte) 0);
            if (applicationComponent != null) {
                getmin.length = applicationComponent;
                getmin.setMin = new DanaAppWidgetModule(new length(this));
                getmin.getMin().length(this);
                Context context2 = this.getMax;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), R.layout.widget_dana_statement_medium);
                Context context3 = this.getMax;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                Intent intent = new Intent(context3, getClass());
                intent.setAction("REFRESH_BUTTON_ACTION_TAG_STATEMENT_STATEMENT_MEDIUM");
                int[] iArr2 = this.getMin;
                if (iArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
                }
                intent.putExtra("STATEMENT_MEDIUM_WIDGET_IDS_KEY", iArr2);
                PendingIntent broadcast = PendingIntent.getBroadcast(context3, 0, intent, 268435456);
                Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…_CANCEL_CURRENT\n        )");
                remoteViews.setOnClickPendingIntent(R.id.f45992131363144, broadcast);
                Context context4 = this.getMax;
                if (context4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                Intent intent2 = new Intent(context4, SplashActivity.class);
                intent2.setAction("android.intent.action.VIEW");
                intent2.addCategory("CATEGORY_LOGIN_STATEMENT_ACTION_M");
                intent2.setFlags(268468224);
                intent2.addCategory("android.shortcut.conversation");
                Context context5 = this.getMax;
                if (context5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                PendingIntent activity = PendingIntent.getActivity(context5, 0, intent2, 0);
                Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit… splashActivityIntent, 0)");
                remoteViews.setOnClickPendingIntent(R.id.f71452131365778, activity);
                length(remoteViews);
                String max = ConfirmPopup.AnonymousClass1.setMax("d MMM yyyy");
                int i = Calendar.getInstance().get(2);
                String[] months = new DateFormatSymbols().getMonths();
                if (i < 0 || i > 11) {
                    str = "";
                } else {
                    str = months[i];
                }
                if (Calendar.getInstance().get(5) == 1) {
                    Intrinsics.checkNotNullExpressionValue(max, "currentDate");
                } else {
                    max = "1-".concat(String.valueOf(max));
                }
                Context context6 = this.getMax;
                if (context6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                RemoteViews remoteViews2 = new RemoteViews(context6.getPackageName(), R.layout.widget_dana_statement_medium);
                remoteViews2.setTextViewText(R.id.f65542131365179, max);
                remoteViews2.setTextViewText(R.id.f65592131365184, str);
                length(remoteViews2);
                ((StatementWidgetChartView) this.toFloatRange.getValue()).setStartPosition(Calendar.getInstance().get(5) - 2);
                ((StatementWidgetChartView) this.toFloatRange.getValue()).build();
                ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
                if (getmin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                }
                getmin2.setMin();
                Calendar instance = Calendar.getInstance();
                instance.add(2, -3);
                int i2 = instance.get(2);
                int i3 = instance.get(1);
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(ConfirmPopup.AnonymousClass1.setMin(1, i2, i3));
                instance2.set(5, instance2.getActualMinimum(5));
                instance2.getTimeInMillis();
                Calendar instance3 = Calendar.getInstance();
                Intrinsics.checkNotNullExpressionValue(instance3, "Calendar.getInstance()");
                instance3.getTimeInMillis();
                ViewBoundsCheck$ViewBounds.getMin getmin3 = this.danaAppWidgetPresenter;
                if (getmin3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                }
                getmin3.length();
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        this.getMax = context;
        if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "REFRESH_BUTTON_ACTION_TAG_STATEMENT_STATEMENT_MEDIUM")) {
            Bundle extras = intent.getExtras();
            if (extras == null || (iArr = extras.getIntArray("STATEMENT_MEDIUM_WIDGET_IDS_KEY")) == null) {
                iArr = new int[0];
            }
            this.getMin = iArr;
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(instance, "AppWidgetManager.getInstance(context)");
            int[] iArr2 = this.getMin;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
            }
            onUpdate(context, instance, iArr2);
        }
        super.onReceive(context, intent);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"id/dana/appwidget/DanaStatementMediumWidgetProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "onAuthorizedAccess", "", "onGetAllStatementSummary", "listStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "onShowChart", "incomeAndExpenseEntryChartModel", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "onUnauthorizedAccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ DanaStatementMediumWidgetProvider length;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void length(@NotNull CurrencyAmountModel currencyAmountModel) {
            Intrinsics.checkNotNullParameter(currencyAmountModel, "balance");
        }

        public final void length(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelExpense");
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        public final void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelIncome");
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider) {
            this.length = danaStatementMediumWidgetProvider;
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "listStatementViewModel");
            DanaStatementMediumWidgetProvider.access$setStatementSummary(this.length, list);
        }

        public final void getMin() {
            DanaStatementMediumWidgetProvider.access$toggleWidgetLoginView(this.length, true);
        }

        public final void setMax() {
            DanaStatementMediumWidgetProvider.access$toggleWidgetLoginView(this.length, false);
        }

        public final void setMax(@NotNull autoMigrations automigrations) {
            Intrinsics.checkNotNullParameter(automigrations, "incomeAndExpenseEntryChartModel");
            DanaStatementMediumWidgetProvider.access$setupChartView(this.length, automigrations);
        }
    }

    private final void setMin(StatementViewModel statementViewModel, boolean z) {
        List<Integer> list;
        StatementTransactionType statementTransactionType;
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_medium);
        List<StatementSummaryModel> list2 = statementViewModel.setMin.getMin;
        List arrayList = new ArrayList();
        String str = null;
        if (z) {
            list = this.length;
            CurrencyAmountModel currencyAmountModel = statementViewModel.setMin.setMax;
            if (currencyAmountModel != null) {
                str = currencyAmountModel.setMax();
            }
            remoteViews.setTextViewText(R.id.f65572131365182, str);
        } else {
            list = this.setMax;
            CurrencyAmountModel currencyAmountModel2 = statementViewModel.setMin.setMax;
            if (currencyAmountModel2 != null) {
                str = currencyAmountModel2.setMax();
            }
            remoteViews.setTextViewText(R.id.f65552131365180, str);
        }
        if (list2 != null) {
            int i = 0;
            int size = list2.size();
            while (i < size && i <= 4) {
                String str2 = list2.get(i).setMax;
                if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.TOPUP.getBizType())) {
                    statementTransactionType = StatementTransactionType.TOPUP;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.CASHBACK.getBizType())) {
                    statementTransactionType = StatementTransactionType.CASHBACK;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.RECEIVEMONEY.getBizType())) {
                    statementTransactionType = StatementTransactionType.RECEIVEMONEY;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.DANAKAGET.getBizType())) {
                    statementTransactionType = StatementTransactionType.DANAKAGET;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.SERVICES.getBizType())) {
                    statementTransactionType = StatementTransactionType.SERVICES;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.MERCHANT.getBizType())) {
                    statementTransactionType = StatementTransactionType.MERCHANT;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.SENDMONEY.getBizType())) {
                    statementTransactionType = StatementTransactionType.SENDMONEY;
                } else if (Intrinsics.areEqual((Object) str2, (Object) StatementTransactionType.CASHOUT.getBizType())) {
                    statementTransactionType = StatementTransactionType.CASHOUT;
                } else {
                    statementTransactionType = StatementTransactionType.DEFAULT;
                }
                arrayList.add(Integer.valueOf(statementTransactionType.getDrawableIcon()));
                i++;
            }
            setMax(list, arrayList, remoteViews);
        }
    }

    private static boolean getMax(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.INCOME.name(), (Object) statementViewModel.setMin.setMin);
    }

    private static boolean length(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) statementViewModel.setMin.setMin);
    }

    private final void setMax(List<Integer> list, List<Integer> list2, RemoteViews remoteViews) {
        if (list2.size() <= 4) {
            int size = 4 - list2.size();
            int i = 0;
            for (Object next : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                remoteViews.setImageViewResource(list.get(i).intValue(), ((Number) next).intValue());
                remoteViews.setViewVisibility(list.get(i).intValue(), 0);
                i = i2;
            }
            int i3 = 4 - size;
            int i4 = 3;
            if (3 >= i3) {
                while (true) {
                    remoteViews.setViewVisibility(list.get(i4).intValue(), 4);
                    if (i4 == i3) {
                        break;
                    }
                    i4--;
                }
            }
            length(remoteViews);
        }
    }

    private final void length(RemoteViews remoteViews) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.getMin;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.partiallyUpdateAppWidget(iArr, remoteViews);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/appwidget/DanaStatementMediumWidgetProvider$Companion;", "", "()V", "ICONS_MAX_COUNT", "", "INTENT_CATEGORY_LOGIN", "", "MAX_MONTH_SUMMARY_CHART_COUNT", "REFRESH_BUTTTON_ACTION_TAG", "VIEW_INDEX_CONTENT", "VIEW_INDEX_LOGIN", "WIDGET_ID_KEY", "WIDGET_LAYOUT", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ Unit access$setStatementSummary(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider, List list) {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementViewModel statementViewModel = (StatementViewModel) it.next();
            if (1 == statementViewModel.setMax && getMax(statementViewModel)) {
                danaStatementMediumWidgetProvider.setMin(statementViewModel, true);
            } else if (1 == statementViewModel.setMax && length(statementViewModel)) {
                danaStatementMediumWidgetProvider.setMin(statementViewModel, false);
            }
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$toggleWidgetLoginView(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider, boolean z) {
        Context context = danaStatementMediumWidgetProvider.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_medium);
        remoteViews.setDisplayedChild(R.id.f71312131365764, z ? 1 : 0);
        Context context2 = danaStatementMediumWidgetProvider.getMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context2);
        int[] iArr = danaStatementMediumWidgetProvider.getMin;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.updateAppWidget(iArr, remoteViews);
    }

    public static final /* synthetic */ void access$setupChartView(DanaStatementMediumWidgetProvider danaStatementMediumWidgetProvider, autoMigrations automigrations) {
        StatementWidgetChartView statementWidgetChartView = (StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue();
        statementWidgetChartView.invalidate();
        statementWidgetChartView.clear();
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendarInstance");
        ArrayList<String> min = ConfirmPopup.AnonymousClass1.getMin(instance.getTimeInMillis(), 3, StatementDateView.SHORT_MONTH, Boolean.TRUE);
        instance.add(2, 1);
        min.addAll(ConfirmPopup.AnonymousClass1.getMin(instance.getTimeInMillis(), 3, StatementDateView.SHORT_MONTH, Boolean.FALSE));
        Intrinsics.checkNotNullExpressionValue(min, "everyMonthsFromThreeMonthsAgo");
        ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).setMonths(min);
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).setLineDataSet1(new LineDataSet(automigrations.length, AUAbsTheme.setMax()));
        AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
        ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).setLineDataSet2(new LineDataSet(automigrations.getMin, AUAbsTheme.getMin()));
        ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).setMaxXAxisRange(3);
        ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).build();
        Context context = danaStatementMediumWidgetProvider.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_medium);
        remoteViews.setImageViewBitmap(R.id.f48572131363411, ((StatementWidgetChartView) danaStatementMediumWidgetProvider.toFloatRange.getValue()).getChartBitmap());
        danaStatementMediumWidgetProvider.length(remoteViews);
    }
}
