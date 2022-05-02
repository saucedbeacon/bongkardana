package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.firebase.analytics.FirebaseAnalytics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setImageURI extends setSupportImageTintList<Boolean> {
    private static final String setMin = setSupportBackgroundTintList.length("BatteryNotLowTracker");

    public setImageURI(@NonNull Context context, @NonNull getMinWidthMinor getminwidthminor) {
        super(context, getminwidthminor);
    }

    public final IntentFilter getMax() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public final void setMin(@NonNull Intent intent) {
        if (intent.getAction() != null) {
            setSupportBackgroundTintList.getMax();
            intent.getAction();
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c == 0) {
                getMax(Boolean.TRUE);
            } else if (c == 1) {
                getMax(Boolean.FALSE);
            }
        }
    }

    public final /* synthetic */ Object length() {
        Intent registerReceiver = this.getMin.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            setSupportBackgroundTintList.getMax();
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
