package id.dana.appwidget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.di.modules.DanaAppWidgetModule;
import id.dana.model.CurrencyAmountModel;
import id.dana.onboarding.splash.SplashActivity;
import id.dana.statement.model.StatementViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.PrepareException;
import o.ViewBoundsCheck$ViewBounds;
import o.autoMigrations;
import o.chooseSizeAndMargin;
import o.getPresetPackage;
import o.setLineVisible;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J \u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020+H\u0002J\f\u0010,\u001a\u00020-*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006/"}, d2 = {"Lid/dana/appwidget/DanaQuickActionMediumWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetIds", "", "context", "Landroid/content/Context;", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "beginWidgetUpdate", "", "remoteViews", "Landroid/widget/RemoteViews;", "createLoginIntent", "Landroid/app/PendingIntent;", "createPendingIntent", "intentTarget", "", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getPendingSelfIntentReload", "initComponent", "initWidgetData", "loadBalanceData", "onDisabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "parseWidgetData", "parseWidgetLoginViewToggle", "setupQuickActionButtonClickListener", "toggleWidgetLoginView", "shouldShowLoginView", "", "updateBalance", "balance", "Lid/dana/model/CurrencyAmountModel;", "getIntentActionByTargetId", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaQuickActionMediumWidgetProvider extends AppWidgetProvider {
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    private Context getMin;
    private int[] setMin;

    private static String getMin(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "android.intent.action.VIEW" : "QUICK_ACTION_M_OPEN_WALLET" : "QUICK_ACTION_M_OPEN_REQUEST" : "QUICK_ACTION_M_OPEN_SEND" : "QUICK_ACTION_M_OPEN_TOP_UP";
    }

    @JvmStatic
    @JvmOverloads
    public static final void refreshQuickActionMediumWidgets(@NotNull Context context) {
        setMin.getMax(context, (Parcelable) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void refreshQuickActionMediumWidgets(@NotNull Context context, @Nullable Parcelable parcelable) {
        setMin.getMax(context, parcelable);
    }

    @JvmStatic
    public static final void toggleLoginView(@NotNull Context context, boolean z) {
        setMin.length(context, z);
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
        this.setMin = iArr;
        length();
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin.getMax();
        for (int i : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action_medium);
            remoteViews.setOnClickPendingIntent(R.id.f71552131365788, setMin(2));
            remoteViews.setOnClickPendingIntent(R.id.f71562131365789, setMin(5));
            remoteViews.setOnClickPendingIntent(R.id.f71542131365787, setMin(3));
            remoteViews.setOnClickPendingIntent(R.id.f71532131365786, setMin(4));
            Intent intent = new Intent(context, getClass());
            intent.setAction("REFRESH_BUTTON_ACTION_TAG_QUICK_ACTION_MEDIUM");
            int[] iArr2 = this.setMin;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
            }
            intent.putExtra("QUICK_ACTION_MEDIUM_WIDGET_IDS_KEY", iArr2);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
            Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…tent.FLAG_UPDATE_CURRENT)");
            remoteViews.setOnClickPendingIntent(R.id.f46032131363148, broadcast);
            Context context2 = this.getMin;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            Intent intent2 = new Intent(context2, SplashActivity.class);
            intent2.setAction("android.intent.action.VIEW");
            intent2.addCategory("CATEGORY_LOGIN_QUICK_ACTION_M");
            intent2.setFlags(268468224);
            intent2.addCategory("android.shortcut.conversation");
            Context context3 = this.getMin;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            PendingIntent activity = PendingIntent.getActivity(context3, 0, intent2, 0);
            Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit… splashActivityIntent, 0)");
            remoteViews.setOnClickPendingIntent(R.id.f71452131365778, activity);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
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
        this.getMin = context;
        if (intent.hasExtra("QUICK_ACTION_MEDIUM_WIDGET_IDS_KEY")) {
            Bundle extras = intent.getExtras();
            if (extras == null || (iArr = extras.getIntArray("QUICK_ACTION_MEDIUM_WIDGET_IDS_KEY")) == null) {
                iArr = new int[0];
            }
            this.setMin = iArr;
            if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "REFRESH_BUTTON_ACTION_TAG_QUICK_ACTION_MEDIUM")) {
                if (this.danaAppWidgetPresenter != null) {
                    ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
                    if (getmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin.getMax();
                } else {
                    length();
                    ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin2.getMax();
                }
            }
            CurrencyAmountModel currencyAmountModel = (CurrencyAmountModel) intent.getParcelableExtra("QUICK_ACTION_MEDIUM_WIDGET_DATA_KEY");
            if (currencyAmountModel != null) {
                Intrinsics.checkNotNullExpressionValue(currencyAmountModel, "intent.getParcelableExtr…IDGET_DATA_KEY) ?: return");
                getMin(currencyAmountModel);
            }
            getMin(intent.getBooleanExtra("QUICK_ACTION_MEDIUM_WIDGET_DATA_LOGIN_VIEW_KEY", false));
            return;
        }
        super.onReceive(context, intent);
    }

    private final void length() {
        Context context = this.getMin;
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
                getmin.getMin().setMin(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"id/dana/appwidget/DanaQuickActionMediumWidgetProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "onAuthorizedAccess", "", "onGetBalance", "balance", "Lid/dana/model/CurrencyAmountModel;", "onUnauthorizedAccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ DanaQuickActionMediumWidgetProvider length;

        @JvmDefault
        public final void dismissProgress() {
        }

        public final void getMax(@NotNull List<StatementViewModel> list) {
            Intrinsics.checkNotNullParameter(list, "listStatementViewModel");
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

        length(DanaQuickActionMediumWidgetProvider danaQuickActionMediumWidgetProvider) {
            this.length = danaQuickActionMediumWidgetProvider;
        }

        public final void length(@NotNull CurrencyAmountModel currencyAmountModel) {
            Intrinsics.checkNotNullParameter(currencyAmountModel, "balance");
            this.length.getMin(currencyAmountModel);
        }

        public final void getMin() {
            this.length.getMin(true);
        }

        public final void setMax() {
            this.length.getMin(false);
        }
    }

    private final PendingIntent setMin(int i) {
        Context context = this.getMin;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory(getMin(i));
        intent.setFlags(268468224);
        intent.addCategory("android.shortcut.conversation");
        intent.putExtra("APP_SHORTCUT_ACTION", true);
        intent.putExtra("APP_SHORTCUT_ACTION_TARGET", i);
        Context context2 = this.getMin;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        PendingIntent activity = PendingIntent.getActivity(context2, 0, intent, 0);
        Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivit… splashActivityIntent, 0)");
        return activity;
    }

    /* access modifiers changed from: private */
    public final void getMin(CurrencyAmountModel currencyAmountModel) {
        Context context = this.getMin;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action_medium);
        String length2 = setLineVisible.length(new CurrencyAmountModel(currencyAmountModel.getMax));
        CharSequence charSequence = length2;
        if (charSequence == null || charSequence.length() == 0) {
            Context context2 = this.getMin;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            length2 = context2.getString(R.string.widget_balance_amount_placeholder);
        }
        remoteViews.setTextViewText(R.id.f68562131365483, length2);
        beginWidgetUpdate$default(this, (Context) null, remoteViews, (int[]) null, 5, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void getMin(boolean z) {
        Context context = this.getMin;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action_medium);
        remoteViews.setDisplayedChild(R.id.f71332131365766, z ? 1 : 0);
        beginWidgetUpdate$default(this, (Context) null, remoteViews, (int[]) null, 5, (Object) null);
    }

    static /* synthetic */ void beginWidgetUpdate$default(DanaQuickActionMediumWidgetProvider danaQuickActionMediumWidgetProvider, Context context, RemoteViews remoteViews, int[] iArr, int i, Object obj) {
        if ((i & 1) != 0 && (context = danaQuickActionMediumWidgetProvider.getMin) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        if ((i & 4) != 0 && (iArr = danaQuickActionMediumWidgetProvider.setMin) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        AppWidgetManager.getInstance(context).updateAppWidget(iArr, remoteViews);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/appwidget/DanaQuickActionMediumWidgetProvider$Companion;", "", "()V", "INTENT_CATEGORY_LOGIN", "", "QUICK_ACTION_M_OPEN_REQUEST", "QUICK_ACTION_M_OPEN_SEND", "QUICK_ACTION_M_OPEN_TOP_UP", "QUICK_ACTION_M_OPEN_WALLET", "REFRESH_BUTTTON_ACTION_TAG", "VIEW_INDEX_CONTENT", "", "VIEW_INDEX_LOGIN", "WIDGET_DATA_KEY", "WIDGET_DATA_LOGIN_VIEW_KEY", "WIDGET_ID_KEY", "WIDGET_LAYOUT", "refreshQuickActionMediumWidgets", "", "context", "Landroid/content/Context;", "data", "Landroid/os/Parcelable;", "toggleLoginView", "showLoginView", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public static void getMax(@NotNull Context context, @Nullable Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaQuickActionMediumWidgetProvider.class));
            Intent intent = new Intent();
            intent.setAction("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("QUICK_ACTION_MEDIUM_WIDGET_IDS_KEY", appWidgetIds);
            if (parcelable != null) {
                intent.putExtra("QUICK_ACTION_MEDIUM_WIDGET_DATA_KEY", parcelable);
            }
            context.sendBroadcast(intent);
        }

        @JvmStatic
        public static void length(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaQuickActionMediumWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("QUICK_ACTION_MEDIUM_WIDGET_IDS_KEY", appWidgetIds);
            intent.putExtra("QUICK_ACTION_MEDIUM_WIDGET_DATA_LOGIN_VIEW_KEY", z);
            context.sendBroadcast(intent);
        }
    }
}
