package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zzn;
import com.google.android.gms.internal.common.zzo;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class ConnectionTracker {
    private static final Object zza = new Object();
    private static volatile ConnectionTracker zzb;
    @VisibleForTesting
    private static boolean zzc = false;
    private static zzo<Boolean> zzd = zzn.zza(zza.zza);
    @VisibleForTesting
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> zze = new ConcurrentHashMap<>();

    @KeepForSdk
    public static ConnectionTracker getInstance() {
        if (zzb == null) {
            synchronized (zza) {
                if (zzb == null) {
                    zzb = new ConnectionTracker();
                }
            }
        }
        return zzb;
    }

    static final /* synthetic */ boolean zza() {
        return false;
    }

    private ConnectionTracker() {
    }

    public final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, str, intent, serviceConnection, i, true);
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean zza(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        boolean z2;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z2 = false;
        } else {
            z2 = ClientLibraryUtils.zza(context, component.getPackageName());
        }
        if (z2) {
            return false;
        }
        if (!zza(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        }
        ServiceConnection putIfAbsent = this.zze.putIfAbsent(serviceConnection, serviceConnection);
        if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
            intent.getAction();
        }
        try {
            boolean bindService = context.bindService(intent, serviceConnection, i);
            return !bindService ? bindService : bindService;
        } finally {
            this.zze.remove(serviceConnection, serviceConnection);
        }
    }

    @KeepForSdk
    public boolean bindService(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return zza(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    public void unbindService(Context context, ServiceConnection serviceConnection) {
        if (!zza(serviceConnection) || !this.zze.containsKey(serviceConnection)) {
            zza(context, serviceConnection);
            return;
        }
        try {
            zza(context, this.zze.get(serviceConnection));
        } finally {
            this.zze.remove(serviceConnection);
        }
    }

    private static boolean zza(ServiceConnection serviceConnection) {
        return zzd.zza().booleanValue() && !(serviceConnection instanceof zzj);
    }

    @SuppressLint({"UntrackedBindService"})
    private static void zza(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    @SuppressLint({"UntrackedBindService"})
    @KeepForSdk
    public void unbindServiceSafe(Context context, ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (IllegalArgumentException unused) {
        }
    }
}
