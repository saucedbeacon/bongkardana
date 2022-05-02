package o;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.alibaba.griver.core.ui.activity.GriverBaseActivity;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.google.android.exoplayer2.C;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/GriverH5ActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "activities", "", "Lcom/alibaba/griver/core/ui/activity/GriverBaseActivity;", "Lid/dana/lib/gcontainer/ContainerLifecycleCallback;", "nfcAdapter", "Landroid/nfc/NfcAdapter;", "pendingIntent", "Landroid/app/PendingIntent;", "checkIfOpeningH5", "", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onShouldFinishAllSessions", "event", "Lid/dana/lib/gcontainer/app/bridge/core/GriverH5ActivityLifecycleCallbacks$FinishAllSessionsMessageEvent;", "Companion", "FinishAllSessionsMessageEvent", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public final class popWindow implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: private */
    @NotNull
    public static final List<closeCurrentWindow> IsOverlapping = new ArrayList();
    /* access modifiers changed from: private */
    public static boolean getMax;
    @NotNull
    public static final length getMin = new length((byte) 0);
    private PendingIntent length;
    private final Map<GriverBaseActivity, closeCurrentWindow> setMax = new LinkedHashMap();
    private NfcAdapter setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/GriverH5ActivityLifecycleCallbacks$FinishAllSessionsMessageEvent;", "", "()V", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
    }

    public final void onActivitySaveInstanceState(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
    }

    public popWindow() {
        onInput.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onShouldFinishAllSessions(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "event");
        Map<GriverBaseActivity, closeCurrentWindow> map = this.setMax;
        for (Map.Entry key : CollectionsKt.reversed(map.entrySet())) {
            ((GriverBaseActivity) key.getKey()).finish();
        }
        map.clear();
        getMax = false;
    }

    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        if (activity instanceof GriverBaseActivity) {
            try {
                NfcAdapter nfcAdapter = this.setMin;
                if (nfcAdapter != null) {
                    nfcAdapter.disableForegroundDispatch(activity);
                }
            } catch (IllegalStateException e) {
                LoggerWrapper.e("NFC - Griver", e.getMessage());
            }
            closeCurrentWindow closecurrentwindow = this.setMax.get(activity);
            if (closecurrentwindow != null) {
                closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            }
        }
    }

    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        if (activity instanceof GriverBaseActivity) {
            try {
                NfcAdapter nfcAdapter = this.setMin;
                if (nfcAdapter != null) {
                    nfcAdapter.enableForegroundDispatch(activity, this.length, (IntentFilter[]) null, (String[][]) null);
                }
            } catch (IllegalStateException e) {
                LoggerWrapper.e("NFC - Griver", e.getMessage());
            }
            closeCurrentWindow closecurrentwindow = this.setMax.get(activity);
            if (closecurrentwindow != null) {
                closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
        }
    }

    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        closeCurrentWindow closecurrentwindow = this.setMax.get(activity);
        if (closecurrentwindow != null) {
            closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_START);
        }
    }

    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        Map<GriverBaseActivity, closeCurrentWindow> map = this.setMax;
        if (map != null) {
            closeCurrentWindow closecurrentwindow = (closeCurrentWindow) TypeIntrinsics.asMutableMap(map).remove(activity);
            if (closecurrentwindow != null) {
                closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            }
            getMax = !this.setMax.isEmpty();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
    }

    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        if (activity instanceof GriverBaseActivity) {
            Map<GriverBaseActivity, closeCurrentWindow> map = this.setMax;
            closeCurrentWindow closecurrentwindow = (closeCurrentWindow) CollectionsKt.removeLastOrNull(IsOverlapping);
            if (closecurrentwindow != null) {
                closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_CREATE);
                Unit unit = Unit.INSTANCE;
            } else {
                closecurrentwindow = null;
            }
            map.put(activity, closecurrentwindow);
            Context context = activity;
            NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
            this.setMin = defaultAdapter;
            if (defaultAdapter != null) {
                this.length = PendingIntent.getActivity(context, 0, new Intent(context, ((GriverBaseActivity) activity).getClass()).addFlags(C.ENCODING_PCM_A_LAW), 0);
            }
        }
        getMax = !this.setMax.isEmpty();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/GriverH5ActivityLifecycleCallbacks$Companion;", "", "()V", "containerLifecycleCallbacks", "", "Lid/dana/lib/gcontainer/ContainerLifecycleCallback;", "getContainerLifecycleCallbacks", "()Ljava/util/List;", "<set-?>", "", "isOpeningH5", "()Z", "setOpeningH5", "(Z)V", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }

        public static boolean getMax() {
            return popWindow.getMax;
        }
    }

    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, AkuEventParamsKey.KEY_ACTIVITY);
        getMax = !this.setMax.isEmpty();
        closeCurrentWindow closecurrentwindow = this.setMax.get(activity);
        if (closecurrentwindow != null) {
            closecurrentwindow.onContainerActivityLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
    }
}
