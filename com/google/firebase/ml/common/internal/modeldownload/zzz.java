package com.google.firebase.ml.common.internal.modeldownload;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.ml.common.FirebaseMLException;

@WorkerThread
final class zzz extends BroadcastReceiver {
    private final long zzbbs;
    private final TaskCompletionSource<Void> zzbbt;
    private final /* synthetic */ zzx zzbbu;

    private zzz(zzx zzx, long j, TaskCompletionSource<Void> taskCompletionSource) {
        this.zzbbu = zzx;
        this.zzbbs = j;
        this.zzbbt = taskCompletionSource;
    }

    public final void onReceive(Context context, Intent intent) {
        long longExtra = intent.getLongExtra("extra_download_id", -1);
        if (longExtra == this.zzbbs) {
            Integer zznu = this.zzbbu.zznu();
            synchronized (this.zzbbu) {
                try {
                    this.zzbbu.firebaseApp.getApplicationContext().unregisterReceiver(this);
                } catch (IllegalArgumentException e) {
                    zzx.zzayb.w("ModelDownloadManager", "Exception thrown while trying to unregister the broadcast receiver for the download", e);
                }
                this.zzbbu.zzbbj.remove(this.zzbbs);
                this.zzbbu.zzbbk.remove(this.zzbbs);
            }
            if (zznu != null) {
                if (zznu.intValue() == 16) {
                    this.zzbbu.zzbbm.zza(false, this.zzbbu.zznz(), this.zzbbu.zza(Long.valueOf(longExtra)));
                    this.zzbbt.setException(this.zzbbu.zzb(Long.valueOf(longExtra)));
                    return;
                } else if (zznu.intValue() == 8) {
                    this.zzbbu.zzbbm.zza(zzmy.NO_ERROR, this.zzbbu.zznz(), zzmn.zzae.zzb.SUCCEEDED);
                    this.zzbbt.setResult(null);
                    return;
                }
            }
            this.zzbbu.zzbbm.zza(false, this.zzbbu.zznz(), 0);
            this.zzbbt.setException(new FirebaseMLException("Model downloading failed", 13));
        }
    }
}
