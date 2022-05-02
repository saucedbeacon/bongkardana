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
import id.dana.appshortcut.DanaAppShortcut;
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
import o.dispatchOnCancelled;
import o.getPresetPackage;
import o.onCancelLoad;
import o.onCanceled;
import o.setLineVisible;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 *2\u00020\u0001:\u0001*B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J \u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010!\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u000eH\u0002J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006+"}, d2 = {"Lid/dana/appwidget/DanaQuickActionWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "()V", "appWidgetIds", "", "context", "Landroid/content/Context;", "danaAppWidgetPresenter", "Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "getDanaAppWidgetPresenter", "()Lid/dana/appwidget/DanaAppWidgetContract$Presenter;", "setDanaAppWidgetPresenter", "(Lid/dana/appwidget/DanaAppWidgetContract$Presenter;)V", "beginWidgetUpdate", "", "remoteViews", "Landroid/widget/RemoteViews;", "createLoginIntent", "Landroid/app/PendingIntent;", "createPayIntent", "getDanaWidgetModule", "Lid/dana/di/modules/DanaAppWidgetModule;", "getPendingSelfIntentReload", "initComponent", "initWidgetData", "loadBalanceData", "onDisabled", "onReceive", "intent", "Landroid/content/Intent;", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "parseWidgetData", "parseWidgetLoginViewToggle", "setOnClickListener", "toggleWidgetLoginView", "shouldShowLoginView", "", "updateBalance", "balance", "Lid/dana/model/CurrencyAmountModel;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaQuickActionWidgetProvider extends AppWidgetProvider {
    @NotNull
    public static final length Companion = new length((byte) 0);
    @Inject
    public ViewBoundsCheck$ViewBounds.getMin danaAppWidgetPresenter;
    private Context getMax;
    private int[] setMax;

    @JvmStatic
    @JvmOverloads
    public static final void refreshQuickActionWidgets(@NotNull Context context) {
        length.getMin(context, (Parcelable) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final void refreshQuickActionWidgets(@NotNull Context context, @Nullable Parcelable parcelable) {
        length.getMin(context, parcelable);
    }

    @JvmStatic
    public static final void toggleLoginView(@NotNull Context context, boolean z) {
        length.getMin(context, z);
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
        this.setMax = iArr;
        setMax();
        getMin();
        ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
        if (getmin == null) {
            Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
        }
        getmin.getMax();
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
        if (intent.hasExtra("QUICK_ACTION_WIDGET_IDS_KEY")) {
            Bundle extras = intent.getExtras();
            if (extras == null || (iArr = extras.getIntArray("QUICK_ACTION_WIDGET_IDS_KEY")) == null) {
                iArr = new int[0];
            }
            this.setMax = iArr;
            if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "REFRESH_BUTTON_ACTION_TAG_QUICK_ACTION")) {
                if (this.danaAppWidgetPresenter != null) {
                    ViewBoundsCheck$ViewBounds.getMin getmin = this.danaAppWidgetPresenter;
                    if (getmin == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin.getMax();
                } else {
                    setMax();
                    getMin();
                    ViewBoundsCheck$ViewBounds.getMin getmin2 = this.danaAppWidgetPresenter;
                    if (getmin2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("danaAppWidgetPresenter");
                    }
                    getmin2.getMax();
                }
            }
            CurrencyAmountModel currencyAmountModel = (CurrencyAmountModel) intent.getParcelableExtra("QUICK_ACTION_WIDGET_DATA_KEY");
            if (currencyAmountModel != null) {
                Intrinsics.checkNotNullExpressionValue(currencyAmountModel, "intent.getParcelableExtr…IDGET_DATA_KEY) ?: return");
                setMax(currencyAmountModel);
            }
            setMin(intent.getBooleanExtra("QUICK_ACTION_WIDGET_DATA_LOGIN_VIEW_KEY", false));
            return;
        }
        super.onReceive(context, intent);
    }

    private final void setMax() {
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
                getmin.setMin = new DanaAppWidgetModule(new getMin(this));
                getmin.getMin().setMax(this);
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"id/dana/appwidget/DanaQuickActionWidgetProvider$getDanaWidgetModule$1", "Lid/dana/appwidget/DanaAppWidgetContract$View;", "onAuthorizedAccess", "", "onGetBalance", "balance", "Lid/dana/model/CurrencyAmountModel;", "onUnauthorizedAccess", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements ViewBoundsCheck$ViewBounds.setMin {
        final /* synthetic */ DanaQuickActionWidgetProvider setMin;

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

        getMin(DanaQuickActionWidgetProvider danaQuickActionWidgetProvider) {
            this.setMin = danaQuickActionWidgetProvider;
        }

        public final void length(@NotNull CurrencyAmountModel currencyAmountModel) {
            Intrinsics.checkNotNullParameter(currencyAmountModel, "balance");
            this.setMin.setMax(currencyAmountModel);
        }

        public final void getMin() {
            this.setMin.setMin(true);
        }

        public final void setMax() {
            this.setMin.setMin(false);
        }
    }

    private final PendingIntent length() {
        DanaAppShortcut.length length2 = DanaAppShortcut.getMin;
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intent max = DanaAppShortcut.length.setMax(context, 1);
        Context context2 = this.getMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        PendingIntent activity = PendingIntent.getActivity(context2, 0, max, 0);
        Intrinsics.checkNotNullExpressionValue(activity, "PendingIntent.getActivity(context, 0, intent, 0)");
        return activity;
    }

    /* access modifiers changed from: private */
    public final void setMax(CurrencyAmountModel currencyAmountModel) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action);
        String length2 = setLineVisible.length(new CurrencyAmountModel(currencyAmountModel.getMax));
        CharSequence charSequence = length2;
        if (charSequence == null || charSequence.length() == 0) {
            Context context2 = this.getMax;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
            }
            length2 = context2.getString(R.string.widget_balance_amount_placeholder);
        }
        remoteViews.setTextViewText(R.id.f68532131365480, length2);
        setMin(remoteViews);
    }

    /* access modifiers changed from: private */
    public final void setMin(boolean z) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action);
        remoteViews.setDisplayedChild(R.id.f71322131365765, z ? 1 : 0);
        setMin(remoteViews);
    }

    private final void setMin(RemoteViews remoteViews) {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        int[] iArr = this.setMax;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        instance.updateAppWidget(iArr, remoteViews);
    }

    private final PendingIntent getMin(Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(-216433845, oncanceled);
            onCancelLoad.getMin(-216433845, oncanceled);
        }
        Intent intent = new Intent(context, getClass());
        intent.setAction("REFRESH_BUTTON_ACTION_TAG_QUICK_ACTION");
        int[] iArr = this.setMax;
        if (iArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appWidgetIds");
        }
        intent.putExtra("QUICK_ACTION_WIDGET_IDS_KEY", iArr);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 134217728);
        Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…_UPDATE_CURRENT\n        )");
        return broadcast;
    }

    private final void getMin() {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_quick_action);
        remoteViews.setOnClickPendingIntent(R.id.f36662131362118, length());
        Context context2 = this.getMax;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        remoteViews.setOnClickPendingIntent(R.id.f46042131363149, getMin(context2));
        remoteViews.setOnClickPendingIntent(R.id.f71452131365778, setMin());
        setMin(remoteViews);
    }

    private final PendingIntent setMin() {
        Context context = this.getMax;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(HummerConstants.CONTEXT);
        }
        Intent intent = new Intent(context, SplashActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("CATEGORY_LOGIN_QUICK_ACTION_WIDGET");
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/appwidget/DanaQuickActionWidgetProvider$Companion;", "", "()V", "INTENT_CATEGORY_LOGIN", "", "REFRESH_BUTTTON_ACTION_TAG", "VIEW_INDEX_CONTENT", "", "VIEW_INDEX_LOGIN", "WIDGET_DATA_KEY", "WIDGET_DATA_LOGIN_VIEW_KEY", "WIDGET_ID_KEY", "WIDGET_LAYOUT", "refreshQuickActionWidgets", "", "context", "Landroid/content/Context;", "data", "Landroid/os/Parcelable;", "toggleLoginView", "showLoginView", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        @JvmStatic
        @JvmOverloads
        public static void getMin(@NotNull Context context, @Nullable Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaQuickActionWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("QUICK_ACTION_WIDGET_IDS_KEY", appWidgetIds);
            if (parcelable != null) {
                intent.putExtra("QUICK_ACTION_WIDGET_DATA_KEY", parcelable);
            }
            context.sendBroadcast(intent);
        }

        @JvmStatic
        public static void getMin(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, DanaQuickActionWidgetProvider.class));
            Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
            intent.putExtra("QUICK_ACTION_WIDGET_IDS_KEY", appWidgetIds);
            intent.putExtra("QUICK_ACTION_WIDGET_DATA_LOGIN_VIEW_KEY", z);
            context.sendBroadcast(intent);
        }
    }
}
