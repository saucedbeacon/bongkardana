package id.dana.lib.gcontainer.app.bridge.core;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.CallSuper;
import com.alibaba.ariver.kernel.api.extension.bridge.SimpleBridgeExtension;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DeviceTokenClient;
import o.DictionaryKeys;
import o.IntRange;
import o.getAD102;
import o.getApkKeyHashBytes;
import o.initToken;
import o.onInput;
import o.pushWindow;
import o.setConfiguration;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001d\u001e\u001fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0010\u001a\u00020\u000fH\u0017J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0015H\u0017J\u001f\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0004¢\u0006\u0002\u0010\u001cR\u001b\u0010\u0003\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\u00048DX\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\f\u0010\u0006¨\u0006 "}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge;", "Lcom/alibaba/ariver/kernel/api/extension/bridge/SimpleBridgeExtension;", "()V", "ioScope", "Lkotlinx/coroutines/CoroutineScope;", "getIoScope", "()Lkotlinx/coroutines/CoroutineScope;", "ioScope$delegate", "Lkotlin/Lazy;", "job", "Lkotlinx/coroutines/CompletableJob;", "uiScope", "getUiScope", "uiScope$delegate", "onFinalized", "", "onInitialized", "onReceiveActivityResult", "event", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "onReceivePermissionResult", "Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$PermissionResultMessageEvent;", "arePermissionsGranted", "", "Landroid/content/Context;", "permissions", "", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "ActivityResultMessageEvent", "Companion", "PermissionResultMessageEvent", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
public class BaseBridge extends SimpleBridgeExtension {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private static final String TAG;
    @NotNull
    private final Lazy ioScope$delegate = LazyKt.lazy(new length(this));
    /* access modifiers changed from: private */
    public final getAD102 job = new getApkKeyHashBytes((DictionaryKeys) null);
    @NotNull
    private final Lazy uiScope$delegate = LazyKt.lazy(new getMax(this));

    @NotNull
    public final initToken getIoScope() {
        return (initToken) this.ioScope$delegate.getValue();
    }

    @NotNull
    public final initToken getUiScope() {
        return (initToken) this.uiScope$delegate.getValue();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceiveActivityResult(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "event");
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onReceivePermissionResult(@NotNull getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "event");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<initToken> {
        final /* synthetic */ BaseBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(BaseBridge baseBridge) {
            super(0);
            this.this$0 = baseBridge;
        }

        @NotNull
        public final initToken invoke() {
            return setConfiguration.length(DeviceTokenClient.setMax().plus(this.this$0.job));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineScope;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<initToken> {
        final /* synthetic */ BaseBridge this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(BaseBridge baseBridge) {
            super(0);
            this.this$0 = baseBridge;
        }

        @NotNull
        public final initToken invoke() {
            return setConfiguration.length(DeviceTokenClient.length().plus(this.this$0.job));
        }
    }

    @CallSuper
    public void onInitialized() {
        onInput.getDefault().register(this);
    }

    @CallSuper
    public void onFinalized() {
        onInput.getDefault().unregister(this);
        this.job.getMin((CancellationException) null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$ActivityResultMessageEvent;", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getRequestCode", "()I", "getResultCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        public final int getMax;
        public final int getMin;
        @Nullable
        public final Intent length;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof setMin)) {
                return false;
            }
            setMin setmin = (setMin) obj;
            return this.getMax == setmin.getMax && this.getMin == setmin.getMin && Intrinsics.areEqual((Object) this.length, (Object) setmin.length);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("ActivityResultMessageEvent(requestCode=");
            sb.append(this.getMax);
            sb.append(", resultCode=");
            sb.append(this.getMin);
            sb.append(", data=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        public setMin(int i, int i2, @Nullable Intent intent) {
            this.getMax = i;
            this.getMin = i2;
            this.length = intent;
        }

        public final int hashCode() {
            int hashCode = ((Integer.valueOf(this.getMax).hashCode() * 31) + Integer.valueOf(this.getMin).hashCode()) * 31;
            Intent intent = this.length;
            return hashCode + (intent != null ? intent.hashCode() : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$PermissionResultMessageEvent;", "", "requestCode", "", "results", "", "Lid/dana/lib/gcontainer/app/bridge/core/PermissionResult;", "(ILjava/util/List;)V", "getRequestCode", "()I", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        public final int getMin;
        @NotNull
        public final List<pushWindow> length;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof getMin)) {
                return false;
            }
            getMin getmin = (getMin) obj;
            return this.getMin == getmin.getMin && Intrinsics.areEqual((Object) this.length, (Object) getmin.length);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("PermissionResultMessageEvent(requestCode=");
            sb.append(this.getMin);
            sb.append(", results=");
            sb.append(this.length);
            sb.append(")");
            return sb.toString();
        }

        public getMin(int i, @NotNull List<pushWindow> list) {
            Intrinsics.checkNotNullParameter(list, "results");
            this.getMin = i;
            this.length = list;
        }

        public final int hashCode() {
            int hashCode = Integer.valueOf(this.getMin).hashCode() * 31;
            List<pushWindow> list = this.length;
            return hashCode + (list != null ? list.hashCode() : 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/lib/gcontainer/app/bridge/core/BaseBridge$Companion;", "", "()V", "TAG", "", "gcontainer_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    static {
        String simpleName = BaseBridge.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "BaseBridge::class.java.simpleName");
        TAG = simpleName;
    }

    /* access modifiers changed from: protected */
    public final boolean arePermissionsGranted(@NotNull Context context, @NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(context, "$this$arePermissionsGranted");
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        for (String length2 : strArr) {
            if (IntRange.length(context, length2) != 0) {
                return false;
            }
        }
        return true;
    }
}
