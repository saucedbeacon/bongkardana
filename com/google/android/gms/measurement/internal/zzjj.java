package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzjj implements ServiceConnection, BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzjk zza;
    /* access modifiers changed from: private */
    public volatile boolean zzb;
    private volatile zzei zzc;

    protected zzjj(zzjk zzjk) {
        this.zza = zzjk;
    }

    @MainThread
    public final void onConnected(Bundle bundle) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                Preconditions.checkNotNull(this.zzc);
                this.zza.zzs.zzav().zzh(new zzjg(this, (zzed) this.zzc.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.zzc = null;
                this.zzb = false;
            }
        }
    }

    @MainThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzem zzf = this.zza.zzs.zzf();
        if (zzf != null) {
            zzf.zze().zzb("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.zzb = false;
            this.zzc = null;
        }
        this.zza.zzs.zzav().zzh(new zzji(this));
    }

    @MainThread
    public final void onConnectionSuspended(int i) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zza.zzs.zzau().zzj().zza("Service connection suspended");
        this.zza.zzs.zzav().zzh(new zzjh(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.zza.zzs.zzau().zzb().zza("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0065 */
    @androidx.annotation.MainThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001e
            r3.zzb = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzjk r4 = r3.zza     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfu r4 = r4.zzs     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzau()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzek r4 = r4.zzb()     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = "Service connected with null binder"
            r4.zza(r5)     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x001e:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0051
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0065 }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.zzed     // Catch:{ RemoteException -> 0x0065 }
            if (r2 == 0) goto L_0x0039
            com.google.android.gms.measurement.internal.zzed r1 = (com.google.android.gms.measurement.internal.zzed) r1     // Catch:{ RemoteException -> 0x0065 }
        L_0x0037:
            r0 = r1
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.measurement.internal.zzeb r1 = new com.google.android.gms.measurement.internal.zzeb     // Catch:{ RemoteException -> 0x0065 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0037
        L_0x003f:
            com.google.android.gms.measurement.internal.zzjk r5 = r3.zza     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzfu r5 = r5.zzs     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzk()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.zza(r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0051:
            com.google.android.gms.measurement.internal.zzjk r5 = r3.zza     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzfu r5 = r5.zzs     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ RemoteException -> 0x0065 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ RemoteException -> 0x0065 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.zzb(r2, r1)     // Catch:{ RemoteException -> 0x0065 }
            goto L_0x0076
        L_0x0063:
            r4 = move-exception
            goto L_0x00a2
        L_0x0065:
            com.google.android.gms.measurement.internal.zzjk r5 = r3.zza     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfu r5 = r5.zzs     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.zza(r1)     // Catch:{ all -> 0x0063 }
        L_0x0076:
            if (r0 != 0) goto L_0x0090
            r3.zzb = r4     // Catch:{ all -> 0x0063 }
            com.google.android.gms.common.stats.ConnectionTracker r4 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjk r5 = r3.zza     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzfu r5 = r5.zzs     // Catch:{ IllegalArgumentException -> 0x00a0 }
            android.content.Context r5 = r5.zzax()     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjk r0 = r3.zza     // Catch:{ IllegalArgumentException -> 0x00a0 }
            com.google.android.gms.measurement.internal.zzjj r0 = r0.zza     // Catch:{ IllegalArgumentException -> 0x00a0 }
            r4.unbindService(r5, r0)     // Catch:{ IllegalArgumentException -> 0x00a0 }
            goto L_0x00a0
        L_0x0090:
            com.google.android.gms.measurement.internal.zzjk r4 = r3.zza     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfu r4 = r4.zzs     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzfr r4 = r4.zzav()     // Catch:{ all -> 0x0063 }
            com.google.android.gms.measurement.internal.zzje r5 = new com.google.android.gms.measurement.internal.zzje     // Catch:{ all -> 0x0063 }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x0063 }
            r4.zzh(r5)     // Catch:{ all -> 0x0063 }
        L_0x00a0:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            return
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x0063 }
            goto L_0x00a5
        L_0x00a4:
            throw r4
        L_0x00a5:
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjj.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zza.zzs.zzau().zzj().zza("Service disconnected");
        this.zza.zzs.zzav().zzh(new zzjf(this, componentName));
    }

    @WorkerThread
    public final void zza(Intent intent) {
        this.zza.zzg();
        Context zzax = this.zza.zzs.zzax();
        ConnectionTracker instance = ConnectionTracker.getInstance();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzau().zzk().zza("Connection attempt already in progress");
                return;
            }
            this.zza.zzs.zzau().zzk().zza("Using local app measurement service");
            this.zzb = true;
            instance.bindService(zzax, intent, this.zza.zza, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    @WorkerThread
    public final void zzb() {
        if (this.zzc != null && (this.zzc.isConnected() || this.zzc.isConnecting())) {
            this.zzc.disconnect();
        }
        this.zzc = null;
    }

    @WorkerThread
    public final void zzc() {
        this.zza.zzg();
        Context zzax = this.zza.zzs.zzax();
        synchronized (this) {
            if (this.zzb) {
                this.zza.zzs.zzau().zzk().zza("Connection attempt already in progress");
            } else if (this.zzc == null || (!this.zzc.isConnecting() && !this.zzc.isConnected())) {
                this.zzc = new zzei(zzax, Looper.getMainLooper(), this, this);
                this.zza.zzs.zzau().zzk().zza("Connecting to remote service");
                this.zzb = true;
                Preconditions.checkNotNull(this.zzc);
                this.zzc.checkAvailabilityAndConnect();
            } else {
                this.zza.zzs.zzau().zzk().zza("Already awaiting connection attempt");
            }
        }
    }
}
