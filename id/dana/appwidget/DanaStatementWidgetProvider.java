package id.dana.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.domain.statement.StatementType;
import id.dana.model.CurrencyAmountModel;
import id.dana.onboarding.splash.SplashActivity;
import id.dana.statement.model.StatementViewModel;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.ConfirmPopup;
import o.PrepareException;
import o.ViewBoundsCheck$ViewBounds;
import o.autoMigrations;
import o.chooseSizeAndMargin;
import o.getPresetPackage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010&\u001a\u00020\u000eH\u0002J\u001f\u0010'\u001a\u0004\u0018\u00010\u000e2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010)H\u0002¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010/\u001a\u000200H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u00062"}, d2 = {"Lid/dana/appwidget/DanaStatementWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetIds", "", "context", "Landroid/content/Context;", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "beginWidgetUpdate", "", "remoteViews", "Landroid/widget/RemoteViews;", "createLoginIntent", "Landroid/app/PendingIntent;", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getPendingSelfIntentReload", "initComponent", "initWidgetData", "isTypeExpense", "", "item", "Lid/dana/statement/model/StatementViewModel;", "loadStatementExpenseData", "onDisabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "parseWidgetData", "parseWidgetLoginViewToggle", "setOnClickListener", "setStatementSummary", "viewModels", "", "(Ljava/util/List;)Lkotlin/Unit;", "setupStatementDate", "toggleWidgetLoginView", "shouldShowLoginView", "updateBalance", "balance", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaStatementWidgetProvider extends AppWidgetProvider {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    private Context getMax;
    private int[] length;

    @JvmStatic
    public static final void toggleLoginView(@NotNull Context context, boolean z) {
        length.getMin(context, z);
    }

    @JvmStatic
    public static final void updateExpenseBalance(@NotNull Context context, @Nullable String str) {
        length.length(context, str);
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

    public final void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(iArr, "appWidgetIds");
        this.length = iArr;
        getMin();
        setMax();
        setMin();
        getMax();
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
        this.getMax = context;
        if (intent.hasExtra("EXPENSE_WIDGET_IDS_KEY")) {
            Bundle extras = intent.getExtras();
            if (extras == null || (iArr = extras.getIntArray("EXPENSE_WIDGET_IDS_KEY")) == null) {
                iArr = new int[0];
            }
            this.length = iArr;
            if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "REFRESH_BUTTON_ACTION_TAG_STATEMENT_EXPENSE")) {
                if (this.danaAppWidgetPresenter != null) {
                    getMax();
                } else {
                    getMin();
                    setMax();
                    setMin();
                    getMax();
                }
            }
            String stringExtra = intent.getStringExtra("EXPENSE_WIDGET_DATA_KEY");
            if (stringExtra != null) {
                Intrinsics.checkNotNullExpressionValue(stringExtra, "intent.getStringExtra(WIDGET_DATA_KEY) ?: return");
                setMax(stringExtra);
            }
            setMin(intent.getBooleanExtra("EXPENSE_WIDGET_DATA_LOGIN_VIEW_KEY", false));
            return;
        }
        super.onReceive(context, intent);
    }

    private final void getMax() {
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin.setMin();
        ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
        if (getmin2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin2.getMin();
    }

    private final void getMin() {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            getPresetPackage.getMin getmin = new getPresetPackage.getMin((byte) 0);
            if (applicationComponent != null) {
                getmin.length = applicationComponent;
                getmin.setMin = new DanaAppWidgetModule(new setMin(this));
                getmin.getMin().setMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"id/dana/appwidget/DanaStatementWidgetProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "onAuthorizedAccess", "", "onGetAllStatementSummary", "listStatementViewModel", "", "Lid/dana/statement/model/StatementViewModel;", "onUnauthorizedAccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ DanaStatementWidgetProvider setMax;

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

        public final void setMax(@NotNull autoMigrations automigrations) {
            Intrinsics.checkNotNullParameter(automigrations, "incomeAndExpenseEntryChartModel");
        }

        public final void setMin(@NotNull chooseSizeAndMargin choosesizeandmargin) {
            Intrinsics.checkNotNullParameter(choosesizeandmargin, "userStatementDetailModelIncome");
        }

        @JvmDefault
        public final void showProgress() {
        }

        setMin(DanaStatementWidgetProvider danaStatementWidgetProvider) {
            this.setMax = danaStatementWidgetProvider;
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "listStatementViewModel");
            DanaStatementWidgetProvider.access$setStatementSummary(this.setMax, list);
            this.setMax.setMax();
        }

        public final void getMin() {
            this.setMax.setMin(true);
        }

        public final void setMax() {
            this.setMax.setMin(false);
        }
    }

    private static boolean length(StatementViewModel statementViewModel) {
        return Intrinsics.areEqual((Object) StatementType.EXPENSE.name(), (Object) statementViewModel.setMin.setMin);
    }

    private final PendingIntent setMax(Context context) {
        Intent intent = new Intent(context, getClass());
        intent.setAction("REFRESH_BUTTON_ACTION_TAG_STATEMENT_EXPENSE");
        int[] iArr = this.length;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        intent.putExtra("EXPENSE_WIDGET_IDS_KEY", iArr);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…_UPDATE_CURRENT\n        )");
        return broadcast;
    }

    private final void setMax(String str) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement);
        remoteViews.setTextViewText(R.id.f65442131365169, str);
        setMax(remoteViews);
    }

    /* access modifiers changed from: private */
    public final void setMin(boolean z) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement);
        remoteViews.setDisplayedChild(R.id.f71282131365761, z ? 1 : 0);
        setMax(remoteViews);
    }

    /* access modifiers changed from: private */
    public final void setMax() {
        String concat = "1-".concat(String.valueOf(ConfirmPopup.AnonymousClass1.setMax("d MMM yyyy")));
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement);
        remoteViews.setTextViewText(R.id.f65452131365170, concat);
        setMax(remoteViews);
    }

    private final void setMax(RemoteViews remoteViews) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.length;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.updateAppWidget(iArr, remoteViews);
    }

    private final void setMin() {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_dana_statement);
        Context context2 = this.getMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        remoteViews.setOnClickPendingIntent(R.id.f46002131363145, setMax(context2));
        remoteViews.setOnClickPendingIntent(R.id.f71452131365778, length());
        setMax(remoteViews);
    }

    private final PendingIntent length() {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("CATEGORY_LOGIN_EXPENSE_WIDGET");
        intent.setFlags(268468224);
        intent.addCategory("android.shortcut.conversation");
        Context context2 = this.getMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        PendingIntent activity = PendingIntent.getActivity(context2, 0, intent, 0);
        Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit… splashActivityIntent, 0)");
        return activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lid/dana/appwidget/DanaStatementWidgetProvider$Companion;", "", "()V", "INTENT_CATEGORY_LOGIN", "", "REFRESH_BUTTTON_ACTION_TAG", "VIEW_INDEX_CONTENT", "", "VIEW_INDEX_LOGIN", "WIDGET_DATA_KEY", "WIDGET_DATA_LOGIN_VIEW_KEY", "WIDGET_ID_KEY", "WIDGET_LAYOUT", "toggleLoginView", "", "context", "Landroid/content/Context;", "showLoginView", "", "updateExpenseBalance", "balance", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @JvmStatic
        public static void length(@NotNull Context context, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaStatementWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("EXPENSE_WIDGET_IDS_KEY", appWidgetIds);
            CharSequence charSequence = str;
            if (!(charSequence == null || charSequence.length() == 0)) {
                intent.putExtra("EXPENSE_WIDGET_DATA_KEY", str);
            }
            context.sendBroadcast(intent);
        }

        @JvmStatic
        public static void getMin(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaStatementWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("EXPENSE_WIDGET_IDS_KEY", appWidgetIds);
            intent.putExtra("EXPENSE_WIDGET_DATA_LOGIN_VIEW_KEY", z);
            context.sendBroadcast(intent);
        }
    }

    public static final /* synthetic */ Unit access$setStatementSummary(DanaStatementWidgetProvider danaStatementWidgetProvider, List list) {
        String str;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatementViewModel statementViewModel = (StatementViewModel) it.next();
            if (1 == statementViewModel.setMax && length(statementViewModel)) {
                CurrencyAmountModel currencyAmountModel = statementViewModel.setMin.setMax;
                if (currencyAmountModel == null || (str = currencyAmountModel.setMax()) == null) {
                    str = "";
                }
                danaStatementWidgetProvider.setMax(str);
            }
        }
        return Unit.INSTANCE;
    }
}
