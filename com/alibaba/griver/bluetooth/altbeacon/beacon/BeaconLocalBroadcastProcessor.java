package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import o.restorePresenterStates;

public class BeaconLocalBroadcastProcessor {
    public static final String MONITOR_NOTIFICATION = "org.com.alibaba.griver.bluetooth.altbeacon.beacon.monitor_notification";
    public static final String RANGE_NOTIFICATION = "org.com.alibaba.griver.bluetooth.altbeacon.beacon.range_notification";
    static int registerCallCount;
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private Context f10244a;
    private BroadcastReceiver b = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            new IntentHandler().convertIntentsToCallbacks(context, intent);
        }
    };
    int registerCallCountForInstnace = 0;

    private BeaconLocalBroadcastProcessor() {
    }

    public BeaconLocalBroadcastProcessor(Context context) {
        this.f10244a = context;
    }

    public void register() {
        registerCallCount++;
        this.registerCallCountForInstnace++;
        StringBuilder sb = new StringBuilder("Register calls: global=");
        sb.append(registerCallCount);
        sb.append(" instance=");
        sb.append(this.registerCallCountForInstnace);
        LogManager.d("BeaconLocalBroadcastProcessor", sb.toString(), new Object[0]);
        unregister();
        restorePresenterStates.length(this.f10244a).setMax(this.b, new IntentFilter(RANGE_NOTIFICATION));
        restorePresenterStates.length(this.f10244a).setMax(this.b, new IntentFilter(MONITOR_NOTIFICATION));
    }

    public void unregister() {
        restorePresenterStates.length(this.f10244a).setMax(this.b);
    }
}
