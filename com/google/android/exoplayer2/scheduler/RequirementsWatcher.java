package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class RequirementsWatcher {
    private static final String TAG = "RequirementsWatcher";
    private final Context context;
    private final Listener listener;
    private CapabilityValidatedCallback networkCallback;
    private DeviceStatusChangeReceiver receiver;
    private final Requirements requirements;
    private boolean requirementsWereMet;

    public interface Listener {
        void requirementsMet(RequirementsWatcher requirementsWatcher);

        void requirementsNotMet(RequirementsWatcher requirementsWatcher);
    }

    /* access modifiers changed from: private */
    public static void logd(String str) {
    }

    public RequirementsWatcher(Context context2, Listener listener2, Requirements requirements2) {
        this.requirements = requirements2;
        this.listener = listener2;
        this.context = context2.getApplicationContext();
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" created");
        logd(sb.toString());
    }

    public final void start() {
        Assertions.checkNotNull(Looper.myLooper());
        this.requirementsWereMet = this.requirements.checkRequirements(this.context);
        IntentFilter intentFilter = new IntentFilter();
        if (this.requirements.getRequiredNetworkType() != 0) {
            if (Util.SDK_INT >= 23) {
                registerNetworkCallbackV23();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.requirements.isChargingRequired()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.requirements.isIdleRequired()) {
            if (Util.SDK_INT >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.receiver = deviceStatusChangeReceiver;
        this.context.registerReceiver(deviceStatusChangeReceiver, intentFilter, (String) null, new Handler());
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" started");
        logd(sb.toString());
    }

    public final void stop() {
        this.context.unregisterReceiver(this.receiver);
        this.receiver = null;
        if (this.networkCallback != null) {
            unregisterNetworkCallback();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append(" stopped");
        logd(sb.toString());
    }

    public final Requirements getRequirements() {
        return this.requirements;
    }

    public final String toString() {
        return super.toString();
    }

    @TargetApi(23)
    private void registerNetworkCallbackV23() {
        NetworkRequest build = new NetworkRequest.Builder().addCapability(16).build();
        CapabilityValidatedCallback capabilityValidatedCallback = new CapabilityValidatedCallback();
        this.networkCallback = capabilityValidatedCallback;
        ((ConnectivityManager) this.context.getSystemService("connectivity")).registerNetworkCallback(build, capabilityValidatedCallback);
    }

    private void unregisterNetworkCallback() {
        if (Util.SDK_INT >= 21) {
            ((ConnectivityManager) this.context.getSystemService("connectivity")).unregisterNetworkCallback(this.networkCallback);
            this.networkCallback = null;
        }
    }

    /* access modifiers changed from: private */
    public void checkRequirements() {
        boolean checkRequirements = this.requirements.checkRequirements(this.context);
        if (checkRequirements == this.requirementsWereMet) {
            logd("requirementsAreMet is still ".concat(String.valueOf(checkRequirements)));
            return;
        }
        this.requirementsWereMet = checkRequirements;
        if (checkRequirements) {
            logd("start job");
            this.listener.requirementsMet(this);
            return;
        }
        logd("stop job");
        this.listener.requirementsNotMet(this);
    }

    class DeviceStatusChangeReceiver extends BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            int max;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
                onCanceled oncanceled = new onCanceled(0, max, 2);
                onCancelLoad.setMax(507001100, oncanceled);
                onCancelLoad.getMin(507001100, oncanceled);
            }
            if (!isInitialStickyBroadcast()) {
                StringBuilder sb = new StringBuilder();
                sb.append(RequirementsWatcher.this);
                sb.append(" received ");
                sb.append(intent.getAction());
                RequirementsWatcher.logd(sb.toString());
                RequirementsWatcher.this.checkRequirements();
            }
        }
    }

    @RequiresApi(api = 21)
    final class CapabilityValidatedCallback extends ConnectivityManager.NetworkCallback {
        private CapabilityValidatedCallback() {
        }

        public final void onAvailable(Network network) {
            super.onAvailable(network);
            StringBuilder sb = new StringBuilder();
            sb.append(RequirementsWatcher.this);
            sb.append(" NetworkCallback.onAvailable");
            RequirementsWatcher.logd(sb.toString());
            RequirementsWatcher.this.checkRequirements();
        }

        public final void onLost(Network network) {
            super.onLost(network);
            StringBuilder sb = new StringBuilder();
            sb.append(RequirementsWatcher.this);
            sb.append(" NetworkCallback.onLost");
            RequirementsWatcher.logd(sb.toString());
            RequirementsWatcher.this.checkRequirements();
        }
    }
}
