package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import id.dana.DanaLocalBroadcastReceiver;

public final class getUnmodifiedPayloads implements DialogInterface.OnDismissListener {
    private final Context getMin;
    private final Activity length;
    private final DanaLocalBroadcastReceiver setMax;

    public getUnmodifiedPayloads(DanaLocalBroadcastReceiver danaLocalBroadcastReceiver, Context context, Activity activity) {
        this.setMax = danaLocalBroadcastReceiver;
        this.getMin = context;
        this.length = activity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.setMax.setMax(this.getMin, this.length);
    }
}
