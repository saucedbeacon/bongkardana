package o;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import androidx.lifecycle.LiveData;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.connectivity.ConnectivityMonitor$networkReceiver$1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n*\u0002\t\u000f\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0014J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0003J\b\u0010\u0017\u001a\u00020\u0012H\u0003J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\b\u0010\u0019\u001a\u00020\u0012H\u0003J\b\u0010\u001a\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001c"}, d2 = {"Lid/dana/connectivity/ConnectivityMonitor;", "Landroidx/lifecycle/LiveData;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "connectivityManager", "Landroid/net/ConnectivityManager;", "networkCallback", "id/dana/connectivity/ConnectivityMonitor$networkCallback$2$1", "getNetworkCallback", "()Lid/dana/connectivity/ConnectivityMonitor$networkCallback$2$1;", "networkCallback$delegate", "Lkotlin/Lazy;", "networkReceiver", "id/dana/connectivity/ConnectivityMonitor$networkReceiver$1", "Lid/dana/connectivity/ConnectivityMonitor$networkReceiver$1;", "onActive", "", "onInactive", "register", "registerBroadcastReceiver", "registerNetworkCallbackForLollipop", "registerNetworkCallbackForNougat", "unregister", "unregisterNetworkCallback", "updateConnection", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class startScaleDownAnimation extends LiveData<Boolean> {
    @NotNull
    public static final length toIntRange = new length((byte) 0);
    private final Context FastBitmap$CoordinateSystem;
    private final ConnectivityManager IsOverlapping;
    private final Lazy isInside;
    private final ConnectivityMonitor$networkReceiver$1 toString;

    public startScaleDownAnimation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.FastBitmap$CoordinateSystem = context;
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            this.IsOverlapping = (ConnectivityManager) systemService;
            this.isInside = LazyKt.lazy(new setMin(this));
            this.toString = new ConnectivityMonitor$networkReceiver$1(this);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final void getMax() {
        super.getMax();
        NetworkInfo activeNetworkInfo = this.IsOverlapping.getActiveNetworkInfo();
        setMax(Boolean.valueOf(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false));
        if (CornerMarkingDataProvider.equals()) {
            this.IsOverlapping.registerDefaultNetworkCallback((setMin.AnonymousClass3) this.isInside.getValue());
        } else if (CornerMarkingDataProvider.length()) {
            this.IsOverlapping.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build(), (setMin.AnonymousClass3) this.isInside.getValue());
        } else {
            this.FastBitmap$CoordinateSystem.registerReceiver(this.toString, new IntentFilter("connectivity.ACTION_CONNECTIVITY"));
        }
    }

    public final void length() {
        super.length();
        if (CornerMarkingDataProvider.length()) {
            this.IsOverlapping.unregisterNetworkCallback((setMin.AnonymousClass3) this.isInside.getValue());
        } else {
            this.FastBitmap$CoordinateSystem.unregisterReceiver(this.toString);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "id/dana/connectivity/ConnectivityMonitor$networkCallback$2$1", "invoke", "()Lid/dana/connectivity/ConnectivityMonitor$networkCallback$2$1;"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function0<AnonymousClass3> {
        final /* synthetic */ startScaleDownAnimation this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(startScaleDownAnimation startscaledownanimation) {
            super(0);
            this.this$0 = startscaledownanimation;
        }

        @NotNull
        public final AnonymousClass3 invoke() {
            return new ConnectivityManager.NetworkCallback(this) {
                final /* synthetic */ setMin getMin;

                {
                    this.getMin = r1;
                }

                public final void onAvailable(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    this.getMin.this$0.setMax(Boolean.TRUE);
                }

                public final void onLost(@NotNull Network network) {
                    Intrinsics.checkNotNullParameter(network, "network");
                    this.getMin.this$0.setMax(Boolean.FALSE);
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/connectivity/ConnectivityMonitor$Companion;", "", "()V", "ACTION_CONNECTIVITY", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void length(startScaleDownAnimation startscaledownanimation) {
        NetworkInfo activeNetworkInfo = startscaledownanimation.IsOverlapping.getActiveNetworkInfo();
        startscaledownanimation.setMax(Boolean.valueOf(activeNetworkInfo != null ? activeNetworkInfo.isConnected() : false));
    }
}
