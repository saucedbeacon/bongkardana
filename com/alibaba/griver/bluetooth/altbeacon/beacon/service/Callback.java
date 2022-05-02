package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconIntentProcessor;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconLocalBroadcastProcessor;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.io.ObjectInputStream;
import java.io.Serializable;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.restorePresenterStates;

public class Callback implements Serializable {
    private static final String TAG = "Callback";
    private BeaconIntentProcessor beaconIntentProcessor = new BeaconIntentProcessor();

    public Callback(String str) {
    }

    public boolean call(Context context, String str, Bundle bundle) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1278576918, oncanceled);
                onCancelLoad.getMin(1278576918, oncanceled);
            }
        }
        if (BeaconManager.getInstanceForApplication(context).getScheduledScanJobsEnabled()) {
            String str2 = "rangingData".equals(str) ? BeaconLocalBroadcastProcessor.RANGE_NOTIFICATION : BeaconLocalBroadcastProcessor.MONITOR_NOTIFICATION;
            Intent intent = new Intent(str2);
            intent.putExtra(str, bundle);
            LogManager.d(TAG, "attempting callback via local broadcast intent: %s", str2);
            return restorePresenterStates.length(context).setMin(intent);
        }
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context.getPackageName(), "org.com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconIntentProcessor"));
        intent2.putExtra(str, bundle);
        LogManager.d(TAG, "attempting callback via global broadcast intent: %s", intent2.getComponent());
        try {
            this.beaconIntentProcessor.handleIntent(context, intent2);
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed attempting to start service: ");
            sb.append(intent2.getComponent().flattenToString());
            LogManager.e(TAG, sb.toString(), e);
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }
}
