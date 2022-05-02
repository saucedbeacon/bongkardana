package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;
import o.setTextMetricsParamsCompat;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String ACTION = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final String KEY_BATTERY_CHARGING_PROXY_ENABLED = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final String KEY_BATTERY_NOT_LOW_PROXY_ENABLED = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final String KEY_NETWORK_STATE_PROXY_ENABLED = "KEY_NETWORK_STATE_PROXY_ENABLED";
    static final String KEY_STORAGE_NOT_LOW_PROXY_ENABLED = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    static final String TAG = setSupportBackgroundTintList.length("ConstrntProxyUpdtRecvr");

    public static Intent newConstraintProxyUpdateIntent(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent(ACTION);
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra(KEY_BATTERY_NOT_LOW_PROXY_ENABLED, z).putExtra(KEY_BATTERY_CHARGING_PROXY_ENABLED, z2).putExtra(KEY_STORAGE_NOT_LOW_PROXY_ENABLED, z3).putExtra(KEY_NETWORK_STATE_PROXY_ENABLED, z4);
        return intent;
    }

    public void onReceive(@NonNull final Context context, @Nullable final Intent intent) {
        if (!ACTION.equals(intent != null ? intent.getAction() : null)) {
            setSupportBackgroundTintList.getMax();
            return;
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        setSupportCompoundDrawablesTintList.length(context).length.length(new Runnable() {
            public final void run() {
                try {
                    boolean booleanExtra = intent.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_NOT_LOW_PROXY_ENABLED, false);
                    boolean booleanExtra2 = intent.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_BATTERY_CHARGING_PROXY_ENABLED, false);
                    boolean booleanExtra3 = intent.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_STORAGE_NOT_LOW_PROXY_ENABLED, false);
                    boolean booleanExtra4 = intent.getBooleanExtra(ConstraintProxyUpdateReceiver.KEY_NETWORK_STATE_PROXY_ENABLED, false);
                    setSupportBackgroundTintList.getMax();
                    String str = ConstraintProxyUpdateReceiver.TAG;
                    Boolean.valueOf(booleanExtra);
                    Boolean.valueOf(booleanExtra2);
                    Boolean.valueOf(booleanExtra3);
                    Boolean.valueOf(booleanExtra4);
                    setTextMetricsParamsCompat.setMax(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                    setTextMetricsParamsCompat.setMax(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                    setTextMetricsParamsCompat.setMax(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                    setTextMetricsParamsCompat.setMax(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
                } finally {
                    goAsync.finish();
                }
            }
        });
    }
}
