package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getSupportImageTintMode extends setSupportImageTintList<Boolean> {
    private static final String setMin = setSupportBackgroundTintList.length("BatteryChrgTracker");

    public getSupportImageTintMode(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        super(context, getminwidthminor);
    }

    public final IntentFilter getMax() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    public final void setMin(@NonNull Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            setSupportBackgroundTintList.getMax();
            char c = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                getMax(Boolean.TRUE);
            } else if (c == 1) {
                getMax(Boolean.FALSE);
            } else if (c == 2) {
                getMax(Boolean.TRUE);
            } else if (c == 3) {
                getMax(Boolean.FALSE);
            }
        }
    }

    private static boolean length(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object length() {
        Intent registerReceiver = this.getMin.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(length(registerReceiver));
        }
        setSupportBackgroundTintList.getMax();
        return null;
    }
}
