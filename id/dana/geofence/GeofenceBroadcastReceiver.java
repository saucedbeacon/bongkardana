package id.dana.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.geofence.GeoFenceTransitionsJobIntentService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lid/dana/geofence/GeofenceBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GeofenceBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(intent, IpcMessageConstants.EXTRA_INTENT);
        if (Intrinsics.areEqual((Object) intent.getAction(), (Object) "dana.id.geofence.action.ACTION_GEOFENCE_EVENT")) {
            GeoFenceTransitionsJobIntentService.getMin getmin = GeoFenceTransitionsJobIntentService.Companion;
            GeoFenceTransitionsJobIntentService.getMin.setMin(context, intent);
        }
    }
}
