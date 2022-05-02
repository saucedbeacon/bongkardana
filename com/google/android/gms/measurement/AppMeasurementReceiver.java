package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzff;

public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzff.zza {
    private zzff zza;

    @NonNull
    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @MainThread
    public final void doStartService(@NonNull Context context, @NonNull Intent intent) {
        startWakefulService(context, intent);
    }

    @MainThread
    public final void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (this.zza == null) {
            this.zza = new zzff(this);
        }
        this.zza.zza(context, intent);
    }
}
