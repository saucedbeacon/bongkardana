package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import o.setSupportBackgroundTintList;
import o.setSupportButtonTintList;
import o.setSupportCompoundDrawablesTintList;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String getMax = setSupportBackgroundTintList.length("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        setSupportBackgroundTintList.getMax();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                setSupportCompoundDrawablesTintList.length(context).getMin(goAsync());
            } catch (IllegalStateException e) {
                setSupportBackgroundTintList.getMax();
                new Throwable[1][0] = e;
            }
        } else {
            context.startService(setSupportButtonTintList.length(context));
        }
    }
}
