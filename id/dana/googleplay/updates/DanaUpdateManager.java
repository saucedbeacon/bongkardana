package id.dana.googleplay.updates;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateManagerFactory;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.tasks.OnFailureListener;
import com.google.android.play.core.tasks.OnSuccessListener;
import com.google.android.play.core.tasks.Task;
import id.dana.R;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import id.dana.home.HomeTabActivity;
import id.dana.home.tab.HomeTabFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import o.CornerMarkingDataProvider;
import o.DatePickerBridgeExtension;
import o.DeviceTokenClient;
import o.IntRange;
import o.OptIn;
import o.TMNTokenClient;
import o.drawHorizontalDivider;
import o.getVirtualChildAt;
import o.initToken;
import o.isBaselineAligned;
import o.showsIcon;
import o.xp4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0003DEFB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001a\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0018H\u0007J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\"J\b\u0010#\u001a\u00020\u001eH\u0007J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J \u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020(2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u0018H\u0002J\u0016\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u0010J\b\u0010,\u001a\u00020\u001eH\u0007J\b\u0010-\u001a\u00020\u001eH\u0007J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200H\u0017J\b\u00101\u001a\u00020\u001eH\u0002J\u0006\u00102\u001a\u00020\u001eJ.\u00103\u001a\u00020\u001e2\b\b\u0001\u00104\u001a\u00020\u00102\b\b\u0001\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0006\u00109\u001a\u00020\u001eJ\b\u0010:\u001a\u00020\u001eH\u0002J\u000e\u0010;\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\"J\b\u0010<\u001a\u00020\u001eH\u0002J\b\u0010=\u001a\u00020\u001eH\u0002J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020%H\u0002J\b\u0010@\u001a\u00020\u001eH\u0002J\u0010\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0002J\f\u0010B\u001a\u00020\u001e*\u00020CH\u0002R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006G"}, d2 = {"Lid/dana/googleplay/updates/DanaUpdateManager;", "Landroidx/lifecycle/LifecycleObserver;", "Lcom/google/android/play/core/install/InstallStateUpdatedListener;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "actionsQueue", "", "Ljava/lang/Runnable;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "homeTabFragmentRootView", "Landroid/view/View;", "getHomeTabFragmentRootView", "()Landroid/view/View;", "installStatus", "", "getInstallStatus$annotations", "()V", "isActivityInForeground", "", "isGooglePlayServiceAvailable", "()Z", "silentUpdateCallback", "Lid/dana/googleplay/updates/DanaUpdateManager$SilentUpdateCallback;", "getSilentUpdateCallback", "()Lid/dana/googleplay/updates/DanaUpdateManager$SilentUpdateCallback;", "setSilentUpdateCallback", "(Lid/dana/googleplay/updates/DanaUpdateManager$SilentUpdateCallback;)V", "checkUpdatesSilently", "", "forceUpdate", "callback", "checkUpdatesTriggeredByUser", "Lid/dana/googleplay/updates/DanaUpdateManager$ManualCheckUpdateCallback;", "destroy", "getStoreName", "", "handleSilentFlexibleUpdates", "info", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "onActivityResult", "requestCode", "resultCode", "onPause", "onResume", "onStateUpdate", "state", "Lcom/google/android/play/core/install/InstallState;", "openStore", "popupCheckUpdatesError", "popupNativeStyleSnackbar", "message", "actionText", "duration", "onActionClicked", "Landroid/view/View$OnClickListener;", "popupNoUpdatesFound", "popupSnackbarToCompleteUpdate", "popupSnackbarToRetryUpdate", "showDialogStore", "showDialogUninstall", "startActionView", "url", "startStoreApps", "updateWithoutGooglePlayServices", "applyActionButtonStyle", "Lcom/google/android/material/snackbar/Snackbar;", "Companion", "ManualCheckUpdateCallback", "SilentUpdateCallback", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DanaUpdateManager implements showsIcon, InstallStateUpdatedListener {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public static boolean toFloatRange;
    /* access modifiers changed from: private */
    public final FragmentActivity equals;
    public boolean getMin;
    public List<Runnable> length;
    @Nullable
    public setMin setMax;
    /* access modifiers changed from: private */
    public final AppUpdateManager setMin;
    private int toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/googleplay/updates/DanaUpdateManager$ManualCheckUpdateCallback;", "", "onCheckForUpdatesError", "", "onUpdatesNotFound", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax {
        void getMax();

        void setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0017J\b\u0010\u0006\u001a\u00020\u0003H\u0016ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lid/dana/googleplay/updates/DanaUpdateManager$SilentUpdateCallback;", "", "onUpdatesCancelled", "", "onUpdatesError", "onUpdating", "onUserWantsToUpdate", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMin {
        @JvmDefault
        void getMax();

        void length();

        void setMax();

        void setMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 2})
    static final class getMax<ResultT> implements OnSuccessListener<AppUpdateInfo> {
        final /* synthetic */ DanaUpdateManager getMax;
        final /* synthetic */ boolean getMin;
        final /* synthetic */ setMin setMin;

        getMax(DanaUpdateManager danaUpdateManager, boolean z, setMin setmin) {
            this.getMax = danaUpdateManager;
            this.getMin = z;
            this.setMin = setmin;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (appUpdateInfo.updateAvailability() != 2) {
                return;
            }
            if (this.getMin && appUpdateInfo.isUpdateTypeAllowed(1)) {
                this.getMax.setMin.startUpdateFlowForResult(appUpdateInfo, 1, (Activity) this.getMax.equals, 8);
            } else if (appUpdateInfo.isUpdateTypeAllowed(0)) {
                DanaUpdateManager danaUpdateManager = this.getMax;
                Intrinsics.checkNotNullExpressionValue(appUpdateInfo, "it");
                DanaUpdateManager.length(danaUpdateManager, appUpdateInfo, this.getMax.setMin, this.setMin);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invoke extends Lambda implements Function1<isBaselineAligned, Unit> {
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invoke(DanaUpdateManager danaUpdateManager) {
            super(1);
            this.this$0 = danaUpdateManager;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isBaselineAligned) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
            Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
            DanaUpdateManager.setMax(this.this$0);
            setMin setmin = this.this$0.setMax;
            if (setmin != null) {
                setmin.length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<isBaselineAligned, Unit> {
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(DanaUpdateManager danaUpdateManager) {
            super(1);
            this.this$0 = danaUpdateManager;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isBaselineAligned) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
            Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
            setMin setmin = this.this$0.setMax;
            if (setmin != null) {
                setmin.setMin();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<ResultT> implements OnSuccessListener<AppUpdateInfo> {
        final /* synthetic */ DanaUpdateManager getMax;

        toFloatRange(DanaUpdateManager danaUpdateManager) {
            this.getMax = danaUpdateManager;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (appUpdateInfo.installStatus() == 11) {
                DanaUpdateManager.setMin(this.getMax);
            } else if (DanaUpdateManager.toFloatRange && appUpdateInfo.isUpdateTypeAllowed(1) && appUpdateInfo.updateAvailability() == 3) {
                this.getMax.setMin.startUpdateFlowForResult(appUpdateInfo, 1, (Activity) this.getMax.equals, 8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<ResultT> implements OnSuccessListener<AppUpdateInfo> {
        final /* synthetic */ setMax setMax;
        final /* synthetic */ DanaUpdateManager setMin;

        toIntRange(DanaUpdateManager danaUpdateManager, setMax setmax) {
            this.setMin = danaUpdateManager;
            this.setMax = setmax;
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            AppUpdateInfo appUpdateInfo = (AppUpdateInfo) obj;
            if (appUpdateInfo.updateAvailability() != 2) {
                this.setMax.setMax();
            } else if (appUpdateInfo.isUpdateTypeAllowed(0)) {
                if (appUpdateInfo.installStatus() == 11) {
                    Intrinsics.checkNotNullExpressionValue(this.setMin.setMin.completeUpdate(), "appUpdateManager.completeUpdate()");
                } else {
                    this.setMin.setMin.startUpdateFlowForResult(appUpdateInfo, 0, (Activity) this.setMin.equals, 8);
                }
            } else if (appUpdateInfo.isUpdateTypeAllowed(1)) {
                this.setMin.setMin.startUpdateFlowForResult(appUpdateInfo, 1, (Activity) this.setMin.equals, 8);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<isBaselineAligned, Unit> {
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(DanaUpdateManager danaUpdateManager) {
            super(1);
            this.this$0 = danaUpdateManager;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isBaselineAligned) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
            Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
            DanaUpdateManager.setMax(this.this$0);
            setMin setmin = this.this$0.setMax;
            if (setmin != null) {
                setmin.length();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<isBaselineAligned, Unit> {
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(DanaUpdateManager danaUpdateManager) {
            super(1);
            this.this$0 = danaUpdateManager;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((isBaselineAligned) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
            Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
            setMin setmin = this.this$0.setMax;
            if (setmin != null) {
                setmin.length();
            }
        }
    }

    public DanaUpdateManager(@NotNull FragmentActivity fragmentActivity) {
        AppUpdateManager appUpdateManager;
        Intrinsics.checkNotNullParameter(fragmentActivity, AkuEventParamsKey.KEY_ACTIVITY);
        this.equals = fragmentActivity;
        if (!CornerMarkingDataProvider.length() || !getMin()) {
            appUpdateManager = null;
        } else {
            appUpdateManager = AppUpdateManagerFactory.create(this.equals);
            this.equals.getLifecycle().setMax(this);
            appUpdateManager.registerListener(this);
            Unit unit = Unit.INSTANCE;
        }
        this.setMin = appUpdateManager;
        this.length = new ArrayList();
    }

    public final /* synthetic */ void onStateUpdate(Object obj) {
        InstallState installState = (InstallState) obj;
        Intrinsics.checkNotNullParameter(installState, "state");
        this.toIntRange = installState.installStatus();
        int installStatus = installState.installStatus();
        if (installStatus == 5) {
            setMin setmin = this.setMax;
            if (setmin != null) {
                setmin.setMax();
            }
        } else if (installStatus == 6) {
            setMin setmin2 = this.setMax;
            if (setmin2 != null) {
                setmin2.setMin();
            }
        } else if (installStatus == 11) {
            Function2 isinside = new isInside(this, (Continuation) null);
            Intrinsics.checkNotNullParameter(isinside, "action");
            xp4.getMin(TMNTokenClient.InitResultListener.length, DeviceTokenClient.length(), (CoroutineStart) null, isinside, 2);
        }
    }

    private final boolean getMin() {
        return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.equals) == 0;
    }

    public final void length(@NotNull setMax setmax) {
        Task<AppUpdateInfo> appUpdateInfo;
        Task<AppUpdateInfo> addOnSuccessListener;
        Intrinsics.checkNotNullParameter(setmax, "callback");
        toFloatRange = false;
        AppUpdateManager appUpdateManager = this.setMin;
        if (appUpdateManager != null && (appUpdateInfo = appUpdateManager.getAppUpdateInfo()) != null && (addOnSuccessListener = appUpdateInfo.addOnSuccessListener(new toIntRange(this, setmax))) != null) {
            addOnSuccessListener.addOnFailureListener(new equals(setmax));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "kotlin.jvm.PlatformType", "onFailure"}, k = 3, mv = {1, 4, 2})
    static final class equals implements OnFailureListener {
        final /* synthetic */ setMax length;

        equals(setMax setmax) {
            this.length = setmax;
        }

        public final void onFailure(Exception exc) {
            this.length.getMax();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r1.equals(id.dana.googleplay.updates.StoreName.XIAOMI) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r1.equals(id.dana.googleplay.updates.StoreName.SAMSUNG) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (r1.equals(id.dana.googleplay.updates.StoreName.HUAWEI) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r1.equals(id.dana.googleplay.updates.StoreName.VIVO) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r1.equals(id.dana.googleplay.updates.StoreName.OPPO) != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        o.getVirtualChildAt.onCancel(o.isBaselineAligned.positiveButton$default(o.isBaselineAligned.message$default(new o.isBaselineAligned(r0.equals, (o.drawHorizontalDivider) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null).cancelOnTouchOutside(false), java.lang.Integer.valueOf(id.dana.R.string.force_update_uninstall), (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 6, (java.lang.Object) null), (java.lang.Integer) null, (java.lang.CharSequence) null, new id.dana.googleplay.updates.DanaUpdateManager.values(r0), 3, (java.lang.Object) null), new id.dana.googleplay.updates.DanaUpdateManager.invokeSuspend(r0)).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        return;
     */
    @kotlin.jvm.JvmOverloads
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(boolean r19, @org.jetbrains.annotations.NotNull id.dana.googleplay.updates.DanaUpdateManager.setMin r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "callback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            toFloatRange = r1
            r0.setMax = r2
            r3 = 0
            r0.toIntRange = r3
            com.google.android.play.core.appupdate.AppUpdateManager r4 = r0.setMin
            if (r4 == 0) goto L_0x0046
            androidx.fragment.app.FragmentActivity r3 = r0.equals
            android.content.Context r3 = (android.content.Context) r3
            boolean r3 = o.getOriginStartParams.isNetworkAvailable(r3)
            if (r3 != 0) goto L_0x0024
            r20.setMax()
            return
        L_0x0024:
            com.google.android.play.core.appupdate.AppUpdateManager r3 = r0.setMin
            com.google.android.play.core.tasks.Task r3 = r3.getAppUpdateInfo()
            id.dana.googleplay.updates.DanaUpdateManager$getMax r4 = new id.dana.googleplay.updates.DanaUpdateManager$getMax
            r4.<init>(r0, r1, r2)
            com.google.android.play.core.tasks.OnSuccessListener r4 = (com.google.android.play.core.tasks.OnSuccessListener) r4
            com.google.android.play.core.tasks.Task r1 = r3.addOnSuccessListener(r4)
            id.dana.googleplay.updates.DanaUpdateManager$length r3 = new id.dana.googleplay.updates.DanaUpdateManager$length
            r3.<init>(r2)
            com.google.android.play.core.tasks.OnFailureListener r3 = (com.google.android.play.core.tasks.OnFailureListener) r3
            com.google.android.play.core.tasks.Task r1 = r1.addOnFailureListener(r3)
            java.lang.String r2 = "appUpdateManager.appUpda…llback.onUpdatesError() }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return
        L_0x0046:
            r2 = 2
            r4 = 0
            if (r1 == 0) goto L_0x00d6
            java.lang.String r1 = r18.setMin()
            if (r1 != 0) goto L_0x0052
            goto L_0x00d2
        L_0x0052:
            int r5 = r1.hashCode()
            switch(r5) {
                case -1528916671: goto L_0x008d;
                case 55641643: goto L_0x0081;
                case 419088309: goto L_0x0077;
                case 849375066: goto L_0x006e;
                case 1755129127: goto L_0x0065;
                case 1973600518: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x00d2
        L_0x005b:
            java.lang.String r5 = "xiaomistore"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d2
            goto L_0x0095
        L_0x0065:
            java.lang.String r5 = "samsungstore"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d2
            goto L_0x0095
        L_0x006e:
            java.lang.String r5 = "huaweistore"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d2
            goto L_0x0095
        L_0x0077:
            java.lang.String r5 = "vivostore"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d2
            goto L_0x0095
        L_0x0081:
            java.lang.String r2 = "9apps"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d2
            r18.setMax()
            return
        L_0x008d:
            java.lang.String r5 = "oppostore"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x00d2
        L_0x0095:
            o.isBaselineAligned r1 = new o.isBaselineAligned
            androidx.fragment.app.FragmentActivity r5 = r0.equals
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5, r4, r2, r4)
            o.isBaselineAligned r6 = r1.cancelOnTouchOutside(r3)
            r1 = 2131887115(0x7f12040b, float:1.9408828E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            o.isBaselineAligned r12 = o.isBaselineAligned.message$default(r6, r7, r8, r9, r10, r11)
            r13 = 0
            r14 = 0
            id.dana.googleplay.updates.DanaUpdateManager$values r1 = new id.dana.googleplay.updates.DanaUpdateManager$values
            r1.<init>(r0)
            r15 = r1
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r16 = 3
            r17 = 0
            o.isBaselineAligned r1 = o.isBaselineAligned.positiveButton$default(r12, r13, r14, r15, r16, r17)
            id.dana.googleplay.updates.DanaUpdateManager$invokeSuspend r2 = new id.dana.googleplay.updates.DanaUpdateManager$invokeSuspend
            r2.<init>(r0)
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            o.isBaselineAligned r1 = o.getVirtualChildAt.onCancel(r1, r2)
            r1.show()
            return
        L_0x00d2:
            r18.setMax()
            return
        L_0x00d6:
            o.isBaselineAligned r1 = new o.isBaselineAligned
            androidx.fragment.app.FragmentActivity r5 = r0.equals
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5, r4, r2, r4)
            o.isBaselineAligned r6 = r1.cancelable(r3)
            r1 = 2131889312(0x7f120ca0, float:1.9413284E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            o.isBaselineAligned r12 = o.isBaselineAligned.message$default(r6, r7, r8, r9, r10, r11)
            r1 = 2131887607(0x7f1205f7, float:1.9409826E38)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            r14 = 0
            id.dana.googleplay.updates.DanaUpdateManager$invoke r1 = new id.dana.googleplay.updates.DanaUpdateManager$invoke
            r1.<init>(r0)
            r15 = r1
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15
            r16 = 2
            r17 = 0
            o.isBaselineAligned r1 = o.isBaselineAligned.positiveButton$default(r12, r13, r14, r15, r16, r17)
            r2 = 2131887703(0x7f120657, float:1.941002E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            id.dana.googleplay.updates.DanaUpdateManager$Grayscale$Algorithm r4 = new id.dana.googleplay.updates.DanaUpdateManager$Grayscale$Algorithm
            r4.<init>(r0)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 2
            r6 = 0
            o.isBaselineAligned r1 = o.isBaselineAligned.negativeButton$default(r1, r2, r3, r4, r5, r6)
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.googleplay.updates.DanaUpdateManager.getMin(boolean, id.dana.googleplay.updates.DanaUpdateManager$setMin):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "kotlin.jvm.PlatformType", "onFailure"}, k = 3, mv = {1, 4, 2})
    static final class length implements OnFailureListener {
        final /* synthetic */ setMin setMin;

        length(setMin setmin) {
            this.setMin = setmin;
        }

        public final void onFailure(Exception exc) {
            this.setMin.setMax();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @DebugMetadata(c = "id.dana.googleplay.updates.DanaUpdateManager$popupSnackbarToCompleteUpdate$1", f = "DanaUpdateManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class isInside extends SuspendLambda implements Function2<initToken, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(DanaUpdateManager danaUpdateManager, Continuation continuation) {
            super(2, continuation);
            this.this$0 = danaUpdateManager;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            Intrinsics.checkNotNullParameter(continuation, "completion");
            return new isInside(this.this$0, continuation);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((isInside) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getMin(R.string.updates_ready_to_install, R.string.update, -2, new View.OnClickListener(this) {
                    final /* synthetic */ isInside getMin;

                    {
                        this.getMin = r1;
                    }

                    public final void onClick(View view) {
                        AppUpdateManager min = this.getMin.this$0.setMin;
                        if (min != null) {
                            min.completeUpdate();
                        }
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class toDoubleRange extends Lambda implements Function0<Unit> {
        final /* synthetic */ setMax $callback;
        final /* synthetic */ DanaUpdateManager this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public toDoubleRange(DanaUpdateManager danaUpdateManager, setMax setmax) {
            super(0);
            this.this$0 = danaUpdateManager;
            this.$callback = setmax;
        }

        public final void invoke() {
            this.this$0.getMin(R.string.error_updating_app_snackbar, R.string.try_again, 0, new View.OnClickListener(this) {
                final /* synthetic */ toDoubleRange getMax;

                {
                    this.getMax = r1;
                }

                public final void onClick(View view) {
                    this.getMax.this$0.length(this.getMax.$callback);
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    public static final class hashCode implements Runnable {
        final /* synthetic */ Function0 length;

        public hashCode(Function0 function0) {
            this.length = function0;
        }

        public final void run() {
            this.length.invoke();
        }
    }

    public final void getMin(@StringRes int i, @StringRes int i2, int i3, View.OnClickListener onClickListener) {
        FragmentActivity fragmentActivity = this.equals;
        if (fragmentActivity instanceof HomeTabActivity) {
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
            List<Fragment> min = supportFragmentManager.getMin.getMin();
            Intrinsics.checkNotNullExpressionValue(min, "activity.supportFragmentManager.fragments");
            Collection arrayList = new ArrayList();
            for (Object next : min) {
                if (next instanceof HomeTabFragment) {
                    arrayList.add(next);
                }
            }
            HomeTabFragment homeTabFragment = (HomeTabFragment) CollectionsKt.firstOrNull((List) arrayList);
            View view = homeTabFragment != null ? homeTabFragment.getView() : null;
            if (view != null) {
                Snackbar make = Snackbar.make(view, i, i3);
                Typeface length2 = OptIn.length(make.getContext(), R.font.f33542131296264);
                View findViewById = make.getView().findViewById(R.id.f60872131364678);
                Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById<TextView>(R.id.snackbar_action)");
                ((TextView) findViewById).setTypeface(length2);
                make.setActionTextColor(IntRange.setMax(make.getContext(), R.color.f19022131099797));
                if (onClickListener == null) {
                    onClickListener = new IsOverlapping(make);
                }
                make.setAction(i2, onClickListener);
                make.show();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping implements View.OnClickListener {
        final /* synthetic */ Snackbar getMin;

        IsOverlapping(Snackbar snackbar) {
            this.getMin = snackbar;
        }

        public final void onClick(View view) {
            this.getMin.dismiss();
        }
    }

    public final void getMin(int i, int i2) {
        setMin setmin;
        setMin setmin2;
        if (i == 8) {
            if (i2 == -1) {
                setMin setmin3 = this.setMax;
                if (setmin3 != null) {
                    setmin3.length();
                }
            } else if (i2 != 0) {
                if (i2 == 1 && (setmin2 = this.setMax) != null) {
                    setmin2.setMax();
                }
            } else if (this.toIntRange != 5 && (setmin = this.setMax) != null) {
                setmin.setMin();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.getMin = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        Task<AppUpdateInfo> appUpdateInfo;
        this.getMin = true;
        AppUpdateManager appUpdateManager = this.setMin;
        if (!(appUpdateManager == null || (appUpdateInfo = appUpdateManager.getAppUpdateInfo()) == null)) {
            appUpdateInfo.addOnSuccessListener(new toFloatRange(this));
        }
        List<Runnable> list = this.length;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
        }
        List<Runnable> list2 = this.length;
        if (list2 != null) {
            list2.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy() {
        AppUpdateManager appUpdateManager = this.setMin;
        if (appUpdateManager != null) {
            appUpdateManager.unregisterListener(this);
        }
    }

    private final String setMin() {
        try {
            ApplicationInfo applicationInfo = this.equals.getPackageManager().getApplicationInfo(this.equals.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "activity.packageManager\n…ageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("CHANNEL");
            if (string == null) {
                return null;
            }
            if (string != null) {
                String lowerCase = string.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void getMax(String str) {
        Context context = this.equals;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Intrinsics.checkNotNullParameter(context, "$this$startActivitySafely");
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        if (DatePickerBridgeExtension.AnonymousClass8.length(intent, context)) {
            context.startActivity(intent);
        }
    }

    private final void setMax() {
        getVirtualChildAt.onCancel(isBaselineAligned.positiveButton$default(isBaselineAligned.message$default(new isBaselineAligned(this.equals, (drawHorizontalDivider) null, 2, (DefaultConstructorMarker) null).cancelOnTouchOutside(false), Integer.valueOf(R.string.force_update_content), (CharSequence) null, (Function1) null, 6, (Object) null), Integer.valueOf(R.string.install), (CharSequence) null, new toString(this), 2, (Object) null), new DanaUpdateManager$FastBitmap$CoordinateSystem(this)).show();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/googleplay/updates/DanaUpdateManager$Companion;", "", "()V", "DEEPLINK_GOOGLE_PLAY", "", "KEY_CHANNEL", "REQUEST_CODE_UPDATE_APP", "", "isForceUpdates", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(DanaUpdateManager danaUpdateManager, AppUpdateInfo appUpdateInfo, AppUpdateManager appUpdateManager, setMin setmin) {
        int installStatus = appUpdateInfo.installStatus();
        if (installStatus == 1 || installStatus == 2 || installStatus == 3) {
            setmin.getMax();
        } else if (installStatus != 11) {
            appUpdateManager.startUpdateFlowForResult(appUpdateInfo, 0, (Activity) danaUpdateManager.equals, 8);
        } else {
            Intrinsics.checkNotNullExpressionValue(appUpdateManager.completeUpdate(), "appUpdateManager.completeUpdate()");
        }
    }

    public static final /* synthetic */ void setMax(DanaUpdateManager danaUpdateManager) {
        String min = danaUpdateManager.setMin();
        if (min != null) {
            switch (min.hashCode()) {
                case -1528916671:
                    if (min.equals(StoreName.OPPO)) {
                        return;
                    }
                    break;
                case 55641643:
                    if (min.equals(StoreName.NINEAPPS)) {
                        danaUpdateManager.getMax(StoreLink.DANA_IN_9APPS);
                        return;
                    }
                    break;
                case 419088309:
                    if (min.equals(StoreName.VIVO)) {
                        return;
                    }
                    break;
                case 849375066:
                    if (min.equals(StoreName.HUAWEI)) {
                        return;
                    }
                    break;
                case 1755129127:
                    if (min.equals(StoreName.SAMSUNG)) {
                        return;
                    }
                    break;
                case 1973600518:
                    if (min.equals(StoreName.XIAOMI)) {
                        return;
                    }
                    break;
            }
        }
        String packageName = danaUpdateManager.equals.getPackageName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=".concat(String.valueOf(packageName))));
        if (DatePickerBridgeExtension.AnonymousClass8.length(intent, danaUpdateManager.equals)) {
            danaUpdateManager.equals.startActivity(intent);
        } else {
            danaUpdateManager.getMax(StoreLink.DANA_IN_GOOGLE_PLAY.concat(String.valueOf(packageName)));
        }
    }

    public static final /* synthetic */ void setMin(DanaUpdateManager danaUpdateManager) {
        Function2 isinside = new isInside(danaUpdateManager, (Continuation) null);
        Intrinsics.checkNotNullParameter(isinside, "action");
        xp4.getMin(TMNTokenClient.InitResultListener.length, DeviceTokenClient.length(), (CoroutineStart) null, isinside, 2);
    }
}
