package id.dana.data.risk.riskevent.sharetextbroadcast;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import o.RVDownloadRequest;

public abstract class ShareTextBroadcastReceiver extends BroadcastReceiver {
    public static final String BIZ_CODE = "bizCode";
    public static final String URL = "URL";
    private RVDownloadRequest shareTextBroadcastReceiverListener;

    public abstract void doAction(RVDownloadRequest rVDownloadRequest, @NonNull ComponentName componentName, @NonNull String str, String str2);

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        String stringExtra = intent.getStringExtra("URL");
        String stringExtra2 = intent.getStringExtra("bizCode");
        if (componentName != null && !stringExtra.isEmpty()) {
            doAction(this.shareTextBroadcastReceiverListener, componentName, stringExtra, stringExtra2);
        }
    }

    public void setListener(RVDownloadRequest rVDownloadRequest) {
        this.shareTextBroadcastReceiverListener = rVDownloadRequest;
    }
}
