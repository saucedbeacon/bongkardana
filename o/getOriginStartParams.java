package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, d2 = {"Lid/dana/data/util/NetworkUtils;", "", "()V", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "isWifiEnable", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getOriginStartParams {
    @NotNull
    public static final getOriginStartParams INSTANCE = new getOriginStartParams();

    private getOriginStartParams() {
    }

    @JvmStatic
    @SuppressLint({"MissingPermission"})
    public static final boolean isNetworkAvailable(@NotNull Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                if (Build.VERSION.SDK_INT > 22) {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                        return false;
                    }
                    return networkCapabilities.hasCapability(12);
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return false;
                }
                Intrinsics.checkNotNullExpressionValue(activeNetworkInfo, "cm.activeNetworkInfo ?: return false");
                return activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        } catch (Exception unused) {
            return false;
        }
    }

    @JvmStatic
    public static final boolean isWifiEnable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        try {
            Object systemService = context.getApplicationContext().getSystemService("wifi");
            if (systemService != null) {
                WifiManager wifiManager = (WifiManager) systemService;
                if (wifiManager.isWifiEnabled()) {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    Intrinsics.checkNotNullExpressionValue(connectionInfo, "wifiInfo");
                    if (connectionInfo.getNetworkId() != -1) {
                        return true;
                    }
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        } catch (Exception unused) {
            return false;
        }
    }
}
