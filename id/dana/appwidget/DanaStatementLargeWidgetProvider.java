package id.dana.appwidget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.widget.RelativeLayout;
import android.widget.RemoteViews;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.appwidget.collectionview.StatementDataProvider;
import id.dana.appwidget.collectionview.StatementExpenseListWidgetService;
import id.dana.appwidget.collectionview.StatementWidgetService;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.onboarding.splash.SplashActivity;
import id.dana.richview.statement.StatementWidgetChartView;
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
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUAbsTheme;
import o.ColumnInfo;
import o.ConfirmPopup;
import o.PrepareException;
import o.ViewBoundsCheck$ViewBounds;
import o.autoMigrations;
import o.chooseSizeAndMargin;
import o.dispatchOnCancelled;
import o.getPresetPackage;
import o.onCancelLoad;
import o.onCanceled;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 X2\u00020\u0001:\u0001XB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0002J\u0018\u00103\u001a\u00020*2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00104\u001a\u000205H\u0002J\b\u00106\u001a\u00020(H\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\b\u0010<\u001a\u00020(H\u0002J\b\u0010=\u001a\u00020(H\u0002J\u0010\u0010>\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010?\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010@\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020BH\u0016J \u0010C\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010D\u001a\u00020E2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010F\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010G\u001a\u00020(H\u0002J\u001f\u0010H\u001a\u0004\u0018\u00010(2\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010JH\u0002¢\u0006\u0002\u0010KJ\u0010\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020NH\u0002J\b\u0010O\u001a\u00020(H\u0002J\u0010\u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u000208H\u0002J\u0010\u0010R\u001a\u00020(2\u0006\u0010S\u001a\u000208H\u0002J\u0010\u0010T\u001a\u00020(2\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u00020(2\u0006\u0010U\u001a\u00020VH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b!\u0010\n\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%¨\u0006Y"}, d2 = {"Lid/dana/appwidget/DanaStatementLargeWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetIds", "", "chartHeight", "", "getChartHeight", "()F", "chartHeight$delegate", "Lkotlin/Lazy;", "chartWidth", "getChartWidth", "chartWidth$delegate", "context", "Landroid/content/Context;", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "dataObserver", "Lid/dana/appwidget/collectionview/StatementDataProviderObserver;", "lineChartView", "Lid/dana/richview/statement/StatementWidgetChartView;", "getLineChartView", "()Lid/dana/richview/statement/StatementWidgetChartView;", "lineChartView$delegate", "workerQueue", "Landroid/os/Handler;", "getWorkerQueue", "()Landroid/os/Handler;", "workerQueue$delegate", "workerThread", "Landroid/os/HandlerThread;", "getWorkerThread", "()Landroid/os/HandlerThread;", "workerThread$delegate", "beginWidgetUpdateAll", "", "remoteViews", "Landroid/widget/RemoteViews;", "beginWidgetUpdatePartially", "createLoginIntent", "Landroid/app/PendingIntent;", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getPendingSelfIntentReload", "initChartView", "initComponent", "initListViewService", "appWidgetId", "", "initWidgetData", "isTypeExpense", "", "item", "Lid/dana/statement/model/StatementViewModel;", "isTypeIncome", "loadChartData", "loadStatementData", "onDisabled", "onEnabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "parseWidgetLoginViewToggle", "setOnClickListener", "setStatementSummary", "viewModels", "", "(Ljava/util/List;)Lkotlin/Unit;", "setupChartView", "incomeAndExpenseEntryChartModel", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "setupStatementDate", "toggleLoadingIndicator", "shouldShowLoading", "toggleWidgetLoginView", "shouldShowLoginView", "updateExpenseBalance", "balance", "", "updateIncomeBalance", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaStatementLargeWidgetProvider extends AppWidgetProvider {
    @NotNull
    public static final getMin Companion = new getMin((byte) 0);
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    private final Lazy equals = LazyKt.lazy(new getMax(this));
    private final Lazy getMax = LazyKt.lazy(IsOverlapping.INSTANCE);
    private final Lazy getMin = LazyKt.lazy(new isInside(this));
    private int[] isInside;
    private final Lazy length = LazyKt.lazy(new setMax(this));
    private ColumnInfo.SQLiteTypeAffinity setMax;
    private final Lazy setMin = LazyKt.lazy(new setMin(this));
    /* access modifiers changed from: private */
    public Context toIntRange;

    @JvmStatic
    public static final void toggleLoginView(@NotNull Context context, boolean z) {
        getMin.setMin(context, z);
    }

    public static final /* synthetic */ Context access$getContext$p(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
        Context context = danaStatementLargeWidgetProvider.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        return context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/HandlerThread;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function0<HandlerThread> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(0);
        }

        @NotNull
        public final HandlerThread invoke() {
            return new HandlerThread("DanaStatementLargeWidgetProvider-worker");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<Handler> {
        final /* synthetic */ DanaStatementLargeWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
            super(0);
            this.this$0 = danaStatementLargeWidgetProvider;
        }

        @NotNull
        public final Handler invoke() {
            DanaStatementLargeWidgetProvider.access$getWorkerThread$p(this.this$0).start();
            return new Handler(DanaStatementLargeWidgetProvider.access$getWorkerThread$p(this.this$0).getLooper());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/richview/statement/StatementWidgetChartView;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<StatementWidgetChartView> {
        final /* synthetic */ DanaStatementLargeWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
            super(0);
            this.this$0 = danaStatementLargeWidgetProvider;
        }

        @NotNull
        public final StatementWidgetChartView invoke() {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((Number) this.this$0.length.getValue()).floatValue(), (int) ((Number) this.this$0.equals.getValue()).floatValue());
            StatementWidgetChartView statementWidgetChartView = new StatementWidgetChartView(DanaStatementLargeWidgetProvider.access$getContext$p(this.this$0));
            statementWidgetChartView.setLayoutParams(layoutParams);
            statementWidgetChartView.getLayoutParams().width = (int) ((Number) this.this$0.length.getValue()).floatValue();
            statementWidgetChartView.getLayoutParams().height = (int) ((Number) this.this$0.equals.getValue()).floatValue();
            statementWidgetChartView.measure((int) ((Number) this.this$0.length.getValue()).floatValue(), (int) ((Number) this.this$0.equals.getValue()).floatValue());
            statementWidgetChartView.layout(statementWidgetChartView.getLeft(), statementWidgetChartView.getTop(), (int) ((Number) this.this$0.length.getValue()).floatValue(), (int) ((Number) this.this$0.equals.getValue()).floatValue());
            return statementWidgetChartView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Float> {
        final /* synthetic */ DanaStatementLargeWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
            super(0);
            this.this$0 = danaStatementLargeWidgetProvider;
        }

        public final float invoke() {
            return DanaStatementLargeWidgetProvider.access$getContext$p(this.this$0).getResources().getDimension(R.dimen.f33102131166101);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Float> {
        final /* synthetic */ DanaStatementLargeWidgetProvider this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
            super(0);
            this.this$0 = danaStatementLargeWidgetProvider;
        }

        public final float invoke() {
            return DanaStatementLargeWidgetProvider.access$getContext$p(this.this$0).getResources().getDimension(R.dimen.f33092131166100);
        }
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

    public final void onEnabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        ContentResolver contentResolver = context.getContentResolver();
        if (this.setMax == null) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            ComponentName componentName = new ComponentName(context, StatementDataProvider.class);
            Intrinsics.checkNotNullExpressionValue(instance, "appWidgetManager");
            this.setMax = new ColumnInfo.SQLiteTypeAffinity(instance, componentName, (Handler) this.getMin.getValue());
            StatementDataProvider.length length2 = StatementDataProvider.Companion;
            Uri max = StatementDataProvider.length.setMax();
            ColumnInfo.SQLiteTypeAffinity sQLiteTypeAffinity = this.setMax;
            if (sQLiteTypeAffinity != null) {
                contentResolver.registerContentObserver(max, true, sQLiteTypeAffinity);
            } else {
                return;
            }
        }
        super.onEnabled(context);
    }

    public final void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Context context2;
        int min;
        int length2;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(iArr, "appWidgetIds");
        this.isInside = iArr;
        getMax();
        ((StatementWidgetChartView) this.setMin.getValue()).setStartPosition(Calendar.getInstance().get(5) - 2);
        ((StatementWidgetChartView) this.setMin.getValue()).build();
        getMin();
        setMax();
        setMin();
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin.length();
        for (int i : iArr) {
            Context context3 = null;
            if (context != null) {
                context2 = context.getApplicationContext();
            } else {
                context2 = null;
            }
            if (!(context2 == null || i == (length2 = dispatchOnCancelled.length(context2, i)))) {
                onCanceled oncanceled = new onCanceled(i, length2, 4);
                onCancelLoad.setMax(-26649527, oncanceled);
                onCancelLoad.getMin(-26649527, oncanceled);
            }
            if (context != null) {
                context3 = context.getApplicationContext();
            }
            if (!(context3 == null || i == (min = dispatchOnCancelled.setMin(context3, i)))) {
                onCanceled oncanceled2 = new onCanceled(i, min, 8);
                onCancelLoad.setMax(-26649527, oncanceled2);
                onCancelLoad.getMin(-26649527, oncanceled2);
            }
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
            Intent intent = new Intent(context, StatementWidgetService.class);
            intent.putExtra("appWidgetId", i);
            intent.setData(Uri.parse(intent.toUri(1)));
            remoteViews.setRemoteAdapter(R.id.f54192131363977, intent);
            Intent intent2 = new Intent(context, StatementExpenseListWidgetService.class);
            intent2.putExtra("appWidgetId", i);
            intent2.setData(Uri.parse(intent2.toUri(1)));
            remoteViews.setRemoteAdapter(R.id.f54182131363976, intent2);
            getMin(remoteViews);
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }

    public final void onDisabled(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        if (this.danaAppWidgetPresenter != null) {
            ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
            }
            getmin.setMax();
        }
    }

    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        int[] iArr;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        this.toIntRange = context;
        if (intent.hasExtra("STATEMENT_LARGE_WIDGET_IDS_KEY")) {
            Bundle extras = intent.getExtras();
            if (extras == null || (iArr = extras.getIntArray("STATEMENT_LARGE_WIDGET_IDS_KEY")) == null) {
                iArr = new int[0];
            }
            this.isInside = iArr;
            if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "REFRESH_BUTTON_ACTION_TAG_STATEMENT_STATEMENT_LARGE")) {
                if (this.danaAppWidgetPresenter != null) {
                    setMin();
                    ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
                    if (getmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin.length();
                } else {
                    getMax();
                    ((StatementWidgetChartView) this.setMin.getValue()).setStartPosition(Calendar.getInstance().get(5) - 2);
                    ((StatementWidgetChartView) this.setMin.getValue()).build();
                    getMin();
                    setMax();
                    setMin();
                    ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin2.length();
                }
            }
            getMax(intent.getBooleanExtra("STATEMENT_LARGE_WIDGET_DATA_LOGIN_VIEW_KEY", false));
            return;
        }
        super.onReceive(context, intent);
    }

    private final void setMin() {
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin.setMin();
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        ((Handler) this.getMin.getValue()).removeMessages(0);
        ((Handler) this.getMin.getValue()).postDelayed(new toIntRange(context), 1000);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange implements Runnable {
        final /* synthetic */ Context length;

        toIntRange(Context context) {
            this.length = context;
        }

        public final void run() {
            AppWidgetManager instance = AppWidgetManager.getInstance(this.length);
            ComponentName componentName = new ComponentName(this.length, DanaStatementLargeWidgetProvider.class);
            instance.notifyAppWidgetViewDataChanged(instance.getAppWidgetIds(componentName), R.id.f54192131363977);
            instance.notifyAppWidgetViewDataChanged(instance.getAppWidgetIds(componentName), R.id.f54182131363976);
        }
    }

    private final void getMax() {
        Context context = this.toIntRange;
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
                getmin.getMin().getMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"id/dana/appwidget/DanaStatementLargeWidgetProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "dismissProgress", "", "onAuthorizedAccess", "onGetAllStatementSummary", "listStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "onShowChart", "incomeAndExpenseEntryChartModel", "Lid/dana/appwidget/model/IncomeAndExpenseEntryChartModel;", "onUnauthorizedAccess", "showProgress", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ DanaStatementLargeWidgetProvider setMax;

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

        length(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
            this.setMax = danaStatementLargeWidgetProvider;
        }

        public final void showProgress() {
            DanaStatementLargeWidgetProvider.access$toggleLoadingIndicator(this.setMax, true);
        }

        public final void dismissProgress() {
            DanaStatementLargeWidgetProvider.access$toggleLoadingIndicator(this.setMax, false);
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "listStatementViewModel");
            DanaStatementLargeWidgetProvider.access$setStatementSummary(this.setMax, list);
            this.setMax.getMin();
        }

        public final void getMin() {
            this.setMax.getMax(true);
        }

        public final void setMax() {
            this.setMax.getMax(false);
        }

        public final void setMax(@NotNull autoMigrations automigrations) {
            Intrinsics.checkNotNullParameter(automigrations, "incomeAndExpenseEntryChartModel");
            DanaStatementLargeWidgetProvider.access$setupChartView(this.setMax, automigrations);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
        remoteViews.setDisplayedChild(R.id.f71302131365763, z ? 1 : 0);
        setMin(remoteViews);
    }

    private static boolean setMin(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.INCOME.name(), (Object) statementViewModel.setMin.setMin);
    }

    private static boolean getMax(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) statementViewModel.setMin.setMin);
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    private final PendingIntent setMax(Context context) {
        Intent intent = new Intent(context, getClass());
        intent.setAction("REFRESH_BUTTON_ACTION_TAG_STATEMENT_STATEMENT_LARGE");
        int[] iArr = this.isInside;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        intent.putExtra("STATEMENT_LARGE_WIDGET_IDS_KEY", iArr);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…_UPDATE_CURRENT\n        )");
        return broadcast;
    }

    /* access modifiers changed from: private */
    public final void getMin() {
        String str;
        String concat = "1-".concat(String.valueOf(ConfirmPopup.AnonymousClass1.setMax("d MMM yyyy")));
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
        remoteViews.setTextViewText(R.id.f65482131365173, concat);
        int i = Calendar.getInstance().get(2);
        String[] months = new DateFormatSymbols().getMonths();
        if (i < 0 || i > 11) {
            str = "";
        } else {
            str = months[i];
        }
        remoteViews.setTextViewText(R.id.f65532131365178, str);
        getMin(remoteViews);
    }

    private final void setMin(RemoteViews remoteViews) {
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.isInside;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.updateAppWidget(iArr, remoteViews);
    }

    private final void getMin(RemoteViews remoteViews) {
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.isInside;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.partiallyUpdateAppWidget(iArr, remoteViews);
    }

    private final void setMax() {
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
        Context context2 = this.toIntRange;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        remoteViews.setOnClickPendingIntent(R.id.f45982131363143, setMax(context2));
        remoteViews.setOnClickPendingIntent(R.id.f71452131365778, length());
        getMin(remoteViews);
    }

    private final PendingIntent length() {
        Context context = this.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("CATEGORY_LOGIN_STATEMENT_LARGE_WIDGET");
        intent.setFlags(268468224);
        intent.addCategory("android.shortcut.conversation");
        Context context2 = this.toIntRange;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        PendingIntent activity = PendingIntent.getActivity(context2, 0, intent, 0);
        Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit… splashActivityIntent, 0)");
        return activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/appwidget/DanaStatementLargeWidgetProvider$Companion;", "", "()V", "INTENT_CATEGORY_LOGIN", "", "MAX_MONTH_SUMMARY_CHART_COUNT", "", "REFRESH_BUTTTON_ACTION_TAG", "RELOAD_STATEMENT_LIST_DELAY", "", "VIEW_INDEX_CONTENT", "VIEW_INDEX_LOGIN", "WIDGET_DATA_LOGIN_VIEW_KEY", "WIDGET_ID_KEY", "WIDGET_LAYOUT", "toggleLoginView", "", "context", "Landroid/content/Context;", "showLoginView", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }

        @JvmStatic
        public static void setMin(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaStatementLargeWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("STATEMENT_LARGE_WIDGET_IDS_KEY", appWidgetIds);
            intent.putExtra("STATEMENT_LARGE_WIDGET_DATA_LOGIN_VIEW_KEY", z);
            context.sendBroadcast(intent);
        }
    }

    public static final /* synthetic */ void access$toggleLoadingIndicator(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider, boolean z) {
        Context context = danaStatementLargeWidgetProvider.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
        remoteViews.setViewVisibility(R.id.f48552131363409, z ? 0 : 4);
        danaStatementLargeWidgetProvider.getMin(remoteViews);
    }

    public static final /* synthetic */ Unit access$setStatementSummary(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider, List list) {
        String max;
        String max2;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementViewModel statementViewModel = (StatementViewModel) it.next();
            String str = "";
            if (1 == statementViewModel.setMax && setMin(statementViewModel)) {
                CurrencyAmountModel currencyAmountModel = statementViewModel.setMin.setMax;
                if (!(currencyAmountModel == null || (max2 = currencyAmountModel.setMax()) == null)) {
                    str = max2;
                }
                Context context = danaStatementLargeWidgetProvider.toIntRange;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
                remoteViews.setTextViewText(R.id.f65512131365176, str);
                danaStatementLargeWidgetProvider.getMin(remoteViews);
            } else if (1 == statementViewModel.setMax && getMax(statementViewModel)) {
                CurrencyAmountModel currencyAmountModel2 = statementViewModel.setMin.setMax;
                if (!(currencyAmountModel2 == null || (max = currencyAmountModel2.setMax()) == null)) {
                    str = max;
                }
                Context context2 = danaStatementLargeWidgetProvider.toIntRange;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
                }
                RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), R.layout.widget_dana_statement_large);
                remoteViews2.setTextViewText(R.id.f65492131365174, str);
                danaStatementLargeWidgetProvider.getMin(remoteViews2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$setupChartView(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider, autoMigrations automigrations) {
        StatementWidgetChartView statementWidgetChartView = (StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue();
        statementWidgetChartView.invalidate();
        statementWidgetChartView.clear();
        Calendar instance = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "calendarInstance");
        ArrayList<String> min = ConfirmPopup.AnonymousClass1.getMin(instance.getTimeInMillis(), 3, StatementDateView.SHORT_MONTH, Boolean.TRUE);
        instance.add(2, 1);
        min.addAll(ConfirmPopup.AnonymousClass1.getMin(instance.getTimeInMillis(), 3, StatementDateView.SHORT_MONTH, Boolean.FALSE));
        Intrinsics.checkNotNullExpressionValue(min, "everyMonthsFromThreeMonthsAgo");
        ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).setMonths(min);
        AUAbsTheme aUAbsTheme = AUAbsTheme.getMin;
        ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).setLineDataSet1(new LineDataSet(automigrations.length, AUAbsTheme.setMax()));
        AUAbsTheme aUAbsTheme2 = AUAbsTheme.getMin;
        ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).setLineDataSet2(new LineDataSet(automigrations.getMin, AUAbsTheme.getMin()));
        ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).setMaxXAxisRange(3);
        ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).build();
        Context context = danaStatementLargeWidgetProvider.toIntRange;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement_large);
        remoteViews.setImageViewBitmap(R.id.f48542131363408, ((StatementWidgetChartView) danaStatementLargeWidgetProvider.setMin.getValue()).getChartBitmap());
        danaStatementLargeWidgetProvider.getMin(remoteViews);
    }

    public static final /* synthetic */ HandlerThread access$getWorkerThread$p(DanaStatementLargeWidgetProvider danaStatementLargeWidgetProvider) {
        return (HandlerThread) danaStatementLargeWidgetProvider.getMax.getValue();
    }
}
