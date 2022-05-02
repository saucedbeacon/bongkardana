package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.NetworkType;
import java.util.List;
import o.getInternalPopup;
import o.setDefaultActionButtonContentDescription;
import o.setSupportBackgroundTintList;
import o.setSupportButtonTintList;

public abstract class ConstraintProxy extends BroadcastReceiver {
    private static final String length = setSupportBackgroundTintList.length("ConstraintProxy");

    ConstraintProxy() {
    }

    public void onReceive(Context context, Intent intent) {
        setSupportBackgroundTintList.getMax();
        context.startService(setSupportButtonTintList.getMax(context));
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class BatteryChargingProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            ConstraintProxy.super.onReceive(context, intent);
        }
    }

    public static void updateAll(Context context, List<getInternalPopup> list) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (getInternalPopup getinternalpopup : list) {
            setDefaultActionButtonContentDescription setdefaultactionbuttoncontentdescription = getinternalpopup.toFloatRange;
            z |= setdefaultactionbuttoncontentdescription.getMin();
            z2 |= setdefaultactionbuttoncontentdescription.length();
            z3 |= setdefaultactionbuttoncontentdescription.getMax();
            z4 |= setdefaultactionbuttoncontentdescription.length != NetworkType.NOT_REQUIRED;
            if (z && z2 && z3 && z4) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.newConstraintProxyUpdateIntent(context, z, z2, z3, z4));
    }
}
