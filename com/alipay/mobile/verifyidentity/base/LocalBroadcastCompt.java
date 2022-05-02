package com.alipay.mobile.verifyidentity.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o.restorePresenterStates;

public class LocalBroadcastCompt {
    public static void sendBroadcast(Context context, Intent intent) {
        try {
            Class.forName("o.restorePresenterStates");
            restorePresenterStates.length(context).setMin(intent);
        } catch (Throwable unused) {
        }
    }

    public static void registerBroadcast(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            Class.forName("o.restorePresenterStates");
            restorePresenterStates.length(context).setMax(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
        }
    }

    public static void unregisterBroadcast(Context context, BroadcastReceiver broadcastReceiver) {
        try {
            Class.forName("o.restorePresenterStates");
            restorePresenterStates.length(context).setMax(broadcastReceiver);
        } catch (Throwable unused) {
        }
    }
}
