package com.alibaba.griver.bluetooth.altbeacon.beacon.startup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.ScanJobScheduler;

public class StartupBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        LogManager.d("StartupBroadcastReceiver", "onReceive called in startup broadcast receiver", new Object[0]);
        if (Build.VERSION.SDK_INT < 18) {
            LogManager.w("StartupBroadcastReceiver", "Not starting up beacon service because we do not have API version 18 (Android 4.3).  We have: %s", Integer.valueOf(Build.VERSION.SDK_INT));
            return;
        }
        BeaconManager instanceForApplication = BeaconManager.getInstanceForApplication(context.getApplicationContext());
        if (instanceForApplication.isAnyConsumerBound() || instanceForApplication.getScheduledScanJobsEnabled()) {
            int intExtra = intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", -1);
            if (intExtra != -1) {
                LogManager.d("StartupBroadcastReceiver", "Passive background scan callback type: ".concat(String.valueOf(intExtra)), new Object[0]);
                LogManager.d("StartupBroadcastReceiver", "got Android O background scan via intent", new Object[0]);
                int intExtra2 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", -1);
                if (intExtra2 != -1) {
                    LogManager.w("StartupBroadcastReceiver", "Passive background scan failed.  Code; ".concat(String.valueOf(intExtra2)), new Object[0]);
                }
                ScanJobScheduler.getInstance().scheduleAfterBackgroundWakeup(context, intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT"));
            } else if (intent.getBooleanExtra("wakeup", false)) {
                LogManager.d("StartupBroadcastReceiver", "got wake up intent", new Object[0]);
            } else {
                LogManager.d("StartupBroadcastReceiver", "Already started.  Ignoring intent: %s of type: %s", intent, intent.getStringExtra("wakeup"));
            }
        } else {
            LogManager.d("StartupBroadcastReceiver", "No consumers are bound.  Ignoring broadcast receiver.", new Object[0]);
        }
    }
}
