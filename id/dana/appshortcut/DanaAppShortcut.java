package id.dana.appshortcut;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.DanaApplication;
import id.dana.R;
import id.dana.di.modules.DanaAppShortcutModule;
import id.dana.onboarding.splash.SplashActivity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import o.Keep;
import o.PrepareException;
import o.dispatchOnCancelled;
import o.doesTransientStatePreventRecycling;
import o.isForceUse;
import o.onCancelLoad;
import o.onCanceled;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J=\u0010\u0011\u001a\u00020\u0012*\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aH\u0002¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lid/dana/appshortcut/DanaAppShortcut;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "danaAppShortcutPresenter", "Lid/dana/appshortcut/DanaAppShortcutContract$Presenter;", "getDanaAppShortcutPresenter", "()Lid/dana/appshortcut/DanaAppShortcutContract$Presenter;", "setDanaAppShortcutPresenter", "(Lid/dana/appshortcut/DanaAppShortcutContract$Presenter;)V", "deleteAppShortcuts", "", "generateAppShortcut", "getDanaAppShortcutModule", "Lid/dana/di/modules/DanaAppShortcutModule;", "setupComponent", "createShortcut", "Landroidx/core/content/pm/ShortcutInfoCompat;", "id", "", "shortLabel", "", "longLabel", "icon", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/Integer;ILandroid/content/Intent;)Landroidx/core/content/pm/ShortcutInfoCompat;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaAppShortcut {
    @NotNull
    public static final length getMin = new length((byte) 0);
    @Inject
    public doesTransientStatePreventRecycling.getMin danaAppShortcutPresenter;
    private final Context setMax;

    @JvmStatic
    public static final boolean setMax(@Nullable Bundle bundle) {
        return length.length(bundle);
    }

    private DanaAppShortcut(Context context) {
        this.setMax = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            PrepareException.AnonymousClass1 applicationComponent = ((DanaApplication) applicationContext).getApplicationComponent();
            isForceUse.getMin getmin = new isForceUse.getMin((byte) 0);
            if (applicationComponent != null) {
                getmin.getMin = applicationComponent;
                getmin.setMax = new DanaAppShortcutModule(new getMax(this));
                stopIgnoring.setMin(getmin.setMax, DanaAppShortcutModule.class);
                stopIgnoring.setMin(getmin.getMin, PrepareException.AnonymousClass1.class);
                new isForceUse(getmin.setMax, getmin.getMin, (byte) 0).setMax(this);
                doesTransientStatePreventRecycling.getMin getmin2 = this.danaAppShortcutPresenter;
                if (getmin2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("danaAppShortcutPresenter");
                }
                getmin2.setMin();
                return;
            }
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.DanaApplication");
    }

    private /* synthetic */ DanaAppShortcut(Context context, byte b) {
        this(context);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/appshortcut/DanaAppShortcut$getDanaAppShortcutModule$1", "Lid/dana/appshortcut/DanaAppShortcutContract$View;", "onGetAppShortcutEnabledFlag", "", "appShortcutEnabled", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements doesTransientStatePreventRecycling.length {
        final /* synthetic */ DanaAppShortcut length;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
            int length2 = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(1091200661, oncanceled);
                onCancelLoad.getMin(1091200661, oncanceled);
            }
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(DanaAppShortcut danaAppShortcut) {
            this.length = danaAppShortcut;
        }

        public final void getMax(boolean z) {
            if (z) {
                DanaAppShortcut.getMin(this.length);
            } else {
                ShortcutManagerCompat.setMax(this.length.setMax);
            }
        }
    }

    private final Keep getMax(Context context, String str, int i, int i2, Intent intent) {
        int length2;
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = str.length()) == (min = dispatchOnCancelled.setMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1759647397, oncanceled);
            onCancelLoad.getMin(-1759647397, oncanceled);
        }
        Keep min2 = new Keep.getMax(this.setMax, str).setMax((CharSequence) context.getString(i)).getMin((CharSequence) context.getString(i)).getMin(IconCompat.getMax(context, i2)).getMin(intent).getMin();
        Intrinsics.checkNotNullExpressionValue(min2, "ShortcutInfoCompat.Build…ent)\n            .build()");
        return min2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u0016\u0010\u001e\u001a\u00020\u000e*\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lid/dana/appshortcut/DanaAppShortcut$Companion;", "", "()V", "APP_SHORTCUT_ACTION", "", "APP_SHORTCUT_ACTION_TARGET", "APP_SHORTCUT_ACTION_TARGET_REQUEST", "", "APP_SHORTCUT_ACTION_TARGET_SCAN", "APP_SHORTCUT_ACTION_TARGET_SEND", "APP_SHORTCUT_ACTION_TARGET_TOPUP", "APP_SHORTCUT_ACTION_TARGET_WALLET", "APP_SHORTCUT_INTENT_CATEGORY", "create", "", "context", "Landroid/content/Context;", "createIntent", "Landroid/content/Intent;", "intentRouteType", "createRequestMoneyIntent", "createScanQRIntent", "createSendMoneyIntent", "createTopUpIntent", "getOneTimeShortcutAction", "bundle", "Landroid/os/Bundle;", "getShortcutAction", "isAppShortcutAction", "", "copyShortcutAction", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static Intent setMax(Context context, int i) {
            int min;
            int max;
            Context context2 = null;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
                onCanceled oncanceled = new onCanceled(i, max, 512);
                onCancelLoad.setMax(1586804430, oncanceled);
                onCancelLoad.getMin(1586804430, oncanceled);
            }
            if (context != null) {
                context2 = context.getApplicationContext();
            }
            if (!(context2 == null || i == (min = dispatchOnCancelled.setMin(context2, i)))) {
                onCanceled oncanceled2 = new onCanceled(i, min, 8);
                onCancelLoad.setMax(1586804430, oncanceled2);
                onCancelLoad.getMin(1586804430, oncanceled2);
            }
            Intent intent = new Intent(context, SplashActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.setFlags(268468224);
            intent.addCategory("android.shortcut.conversation");
            intent.putExtra("APP_SHORTCUT_ACTION", true);
            intent.putExtra("APP_SHORTCUT_ACTION_TARGET", i);
            return intent;
        }

        @JvmStatic
        public static boolean length(@Nullable Bundle bundle) {
            if (bundle == null) {
                return false;
            }
            return bundle.getBoolean("APP_SHORTCUT_ACTION", false);
        }
    }

    public static final /* synthetic */ void getMin(DanaAppShortcut danaAppShortcut) {
        if (Build.VERSION.SDK_INT >= 25) {
            Context context = danaAppShortcut.setMax;
            Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
            DanaAppShortcut danaAppShortcut2 = danaAppShortcut;
            Keep max = danaAppShortcut2.getMax(context, "id1", R.string.lbl_shortcut_pay, R.drawable.ic_shortcut_scan_48dp, length.setMax(context, 1));
            Context context2 = danaAppShortcut.setMax;
            Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
            Keep max2 = danaAppShortcut2.getMax(context2, "id2", R.string.lbl_shortcut_topup, R.drawable.ic_shortcut_top_up_48dp, length.setMax(context2, 2));
            Context context3 = danaAppShortcut.setMax;
            Intrinsics.checkNotNullParameter(context3, HummerConstants.CONTEXT);
            Keep max3 = danaAppShortcut2.getMax(context3, "id3", R.string.lbl_shortcut_send_money, R.drawable.ic_shortcut_send_money_48dp, length.setMax(context3, 3));
            Context context4 = danaAppShortcut.setMax;
            Intrinsics.checkNotNullParameter(context4, HummerConstants.CONTEXT);
            Keep max4 = danaAppShortcut2.getMax(context4, "id4", R.string.lbl_shortcut_request_money, R.drawable.ic_shortcut_request_money_48dp, length.setMax(context4, 4));
            ShortcutManagerCompat.setMax(danaAppShortcut.setMax, CollectionsKt.listOf(max, max2, max3, max4));
        }
    }

    @JvmStatic
    public static final int getMax(@Nullable Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt("APP_SHORTCUT_ACTION_TARGET", 0);
    }

    @JvmStatic
    public static final int getMin(@Nullable Bundle bundle) {
        if (bundle == null) {
            return 0;
        }
        int i = bundle.getInt("APP_SHORTCUT_ACTION_TARGET", 0);
        bundle.remove("APP_SHORTCUT_ACTION_TARGET");
        return i;
    }

    @JvmStatic
    public static final void getMax(@NotNull Intent intent, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "$this$copyShortcutAction");
        int i = 0;
        if (bundle != null) {
            i = bundle.getInt("APP_SHORTCUT_ACTION_TARGET", 0);
        }
        intent.putExtra("APP_SHORTCUT_ACTION_TARGET", i);
    }

    @JvmStatic
    public static final void getMin(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        new DanaAppShortcut(context, (byte) 0);
    }
}
