package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import o.FullLifecycleObserverAdapter;

public final class InactivityTimer {
    private static final long INACTIVITY_DELAY_MS = 300000;
    private static final String TAG = InactivityTimer.class.getSimpleName();
    private Runnable callback;
    private final Context context;
    /* access modifiers changed from: private */
    public Handler handler;
    private boolean onBattery;
    private final BroadcastReceiver powerStatusReceiver;
    private boolean registered = false;

    public InactivityTimer(Context context2, Runnable runnable) {
        this.context = context2;
        this.callback = runnable;
        this.powerStatusReceiver = new PowerStatusReceiver();
        this.handler = new Handler();
    }

    public final void activity() {
        cancelCallback();
        if (this.onBattery) {
            this.handler.postDelayed(this.callback, 300000);
        }
    }

    public final void start() {
        registerReceiver();
        activity();
    }

    public final void cancel() {
        cancelCallback();
        unregisterReceiver();
    }

    private void unregisterReceiver() {
        if (this.registered) {
            this.context.unregisterReceiver(this.powerStatusReceiver);
            this.registered = false;
        }
    }

    private void registerReceiver() {
        if (!this.registered) {
            this.context.registerReceiver(this.powerStatusReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.registered = true;
        }
    }

    private void cancelCallback() {
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: private */
    public void onBattery(boolean z) {
        this.onBattery = z;
        if (this.registered) {
            activity();
        }
    }

    public final class PowerStatusReceiver extends BroadcastReceiver {
        private PowerStatusReceiver() {
        }

        public final void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                InactivityTimer.this.handler.post(new FullLifecycleObserverAdapter(this, intent.getIntExtra("plugged", -1) <= 0));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(boolean z) {
            InactivityTimer.this.onBattery(z);
        }
    }
}
