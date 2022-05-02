package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzfm;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzic;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzee {
    private static volatile zzee zzc;
    protected final Clock zza;
    protected final ExecutorService zzb;
    /* access modifiers changed from: private */
    public final String zzd;
    private final AppMeasurementSdk zze;
    @GuardedBy("listenerList")
    private final List<Pair<zzgv, zzdv>> zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public boolean zzh;
    private final String zzi;
    /* access modifiers changed from: private */
    public volatile zzcc zzj;

    protected zzee(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !zzV(str2, str3)) {
            this.zzd = "FA";
        } else {
            this.zzd = str;
        }
        this.zza = DefaultClock.getInstance();
        boolean z = true;
        this.zzb = zzbx.zza().zzb(new zzdi(this), 1);
        this.zze = new AppMeasurementSdk(this);
        this.zzf = new ArrayList();
        try {
            if (zzic.zza(context, "google_app_id", zzfm.zza(context)) != null && !zzR()) {
                this.zzi = null;
                this.zzh = true;
                Log.w(this.zzd, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (!zzV(str2, str3)) {
            this.zzi = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 != null ? false : z)) {
                    Log.w(this.zzd, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.zzd, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        } else {
            this.zzi = str2;
        }
        zzS(new zzcx(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.zzd, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new zzed(this));
        }
    }

    protected static final boolean zzR() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public final void zzS(zzdt zzdt) {
        this.zzb.execute(zzdt);
    }

    /* access modifiers changed from: private */
    public final void zzT(Exception exc, boolean z, boolean z2) {
        this.zzh |= z;
        if (z) {
            Log.w(this.zzd, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            zzC(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.zzd, "Error with data collection. Data lost.", exc);
    }

    private final void zzU(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l) {
        zzS(new zzdr(this, l, str, str2, bundle, z, z2));
    }

    /* access modifiers changed from: private */
    public static final boolean zzV(String str, String str2) {
        return (str2 == null || str == null || zzR()) ? false : true;
    }

    public static zzee zza(Context context, String str, String str2, String str3, Bundle bundle) {
        Preconditions.checkNotNull(context);
        if (zzc == null) {
            synchronized (zzee.class) {
                if (zzc == null) {
                    zzc = new zzee(context, str, str2, str3, bundle);
                }
            }
        }
        return zzc;
    }

    public final String zzA() {
        zzbz zzbz = new zzbz();
        zzS(new zzde(this, zzbz));
        return zzbz.zzc(500);
    }

    public final Map<String, Object> zzB(String str, String str2, boolean z) {
        zzbz zzbz = new zzbz();
        zzS(new zzdf(this, str, str2, z, zzbz));
        Bundle zzd2 = zzbz.zzd(5000);
        if (zzd2 == null || zzd2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zzd2.size());
        for (String str3 : zzd2.keySet()) {
            Object obj = zzd2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void zzC(int i, String str, Object obj, Object obj2, Object obj3) {
        zzS(new zzdg(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final Bundle zzD(Bundle bundle, boolean z) {
        zzbz zzbz = new zzbz();
        zzS(new zzdh(this, bundle, zzbz));
        if (z) {
            return zzbz.zzd(5000);
        }
        return null;
    }

    public final int zzE(String str) {
        zzbz zzbz = new zzbz();
        zzS(new zzdj(this, str, zzbz));
        Integer num = (Integer) zzbz.zze(zzbz.zzd(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @WorkerThread
    public final String zzF() {
        zzbz zzbz = new zzbz();
        zzS(new zzdk(this, zzbz));
        return zzbz.zzc(120000);
    }

    public final String zzG() {
        return this.zzi;
    }

    public final Object zzH(int i) {
        zzbz zzbz = new zzbz();
        zzS(new zzdl(this, zzbz, i));
        return zzbz.zze(zzbz.zzd(15000), Object.class);
    }

    public final void zzI(boolean z) {
        zzS(new zzdm(this, z));
    }

    public final void zzJ(Bundle bundle) {
        zzS(new zzdn(this, bundle));
    }

    public final AppMeasurementSdk zzb() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final zzcc zzc(Context context, boolean z) {
        try {
            return zzcb.asInterface(DynamiteModule.load(context, DynamiteModule.PREFER_HIGHEST_OR_REMOTE_VERSION, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e) {
            zzT(e, true, false);
            return null;
        }
    }

    public final void zzd(zzgu zzgu) {
        zzdu zzdu = new zzdu(zzgu);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzdu);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.zzd, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        zzS(new zzdo(this, zzdu));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.zzj == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.zzj.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.zzd, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        zzS(new com.google.android.gms.internal.measurement.zzdp(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.measurement.internal.zzgv r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r0 = r4.zzf
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r2 = r4.zzf     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r2 = r4.zzf     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.zzd     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.google.android.gms.internal.measurement.zzdv r1 = new com.google.android.gms.internal.measurement.zzdv     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r2 = r4.zzf     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.measurement.zzcc r5 = r4.zzj
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.zzcc r5 = r4.zzj     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.zzd
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.google.android.gms.internal.measurement.zzdp r5 = new com.google.android.gms.internal.measurement.zzdp
            r5.<init>(r4, r1)
            r4.zzS(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0059
        L_0x0058:
            throw r5
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzee.zze(com.google.android.gms.measurement.internal.zzgv):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3.zzj == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.zzj.unregisterOnMeasurementEventListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        android.util.Log.w(r3.zzd, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        zzS(new com.google.android.gms.internal.measurement.zzdq(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzf(com.google.android.gms.measurement.internal.zzgv r4) {
        /*
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r2 = r3.zzf     // Catch:{ all -> 0x005b }
            int r2 = r2.size()     // Catch:{ all -> 0x005b }
            if (r1 >= r2) goto L_0x002b
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r2 = r3.zzf     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x005b }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x005b }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x005b }
            if (r2 == 0) goto L_0x0028
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r4 = r3.zzf     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x005b }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x005b }
            goto L_0x002c
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0037
            java.lang.String r4 = r3.zzd     // Catch:{ all -> 0x005b }
            java.lang.String r1 = "OnEventListener had not been registered."
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0037:
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.zzgv, com.google.android.gms.internal.measurement.zzdv>> r1 = r3.zzf     // Catch:{ all -> 0x005b }
            r1.remove(r4)     // Catch:{ all -> 0x005b }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.measurement.zzdv r4 = (com.google.android.gms.internal.measurement.zzdv) r4     // Catch:{ all -> 0x005b }
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            com.google.android.gms.internal.measurement.zzcc r0 = r3.zzj
            if (r0 == 0) goto L_0x0052
            com.google.android.gms.internal.measurement.zzcc r0 = r3.zzj     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            r0.unregisterOnMeasurementEventListener(r4)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x004b }
            return
        L_0x004b:
            java.lang.String r0 = r3.zzd
            java.lang.String r1 = "Failed to unregister event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r0, r1)
        L_0x0052:
            com.google.android.gms.internal.measurement.zzdq r0 = new com.google.android.gms.internal.measurement.zzdq
            r0.<init>(r3, r4)
            r3.zzS(r0)
            return
        L_0x005b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005f
        L_0x005e:
            throw r4
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzee.zzf(com.google.android.gms.measurement.internal.zzgv):void");
    }

    public final void zzg(@NonNull String str, Bundle bundle) {
        zzU((String) null, str, bundle, false, true, (Long) null);
    }

    public final void zzh(String str, String str2, Bundle bundle) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-2040682415, oncanceled);
            onCancelLoad.getMin(-2040682415, oncanceled);
        }
        zzU(str, str2, bundle, true, true, (Long) null);
    }

    public final void zzi(String str, String str2, Bundle bundle, long j) {
        zzU(str, str2, bundle, true, false, Long.valueOf(j));
    }

    public final void zzj(String str, String str2, Object obj, boolean z) {
        zzS(new zzds(this, str, str2, obj, z));
    }

    public final void zzk(Bundle bundle) {
        zzS(new zzcn(this, bundle));
    }

    public final void zzl(String str, String str2, Bundle bundle) {
        zzS(new zzco(this, str, str2, bundle));
    }

    public final List<Bundle> zzm(String str, String str2) {
        zzbz zzbz = new zzbz();
        zzS(new zzcp(this, str, str2, zzbz));
        List<Bundle> list = (List) zzbz.zze(zzbz.zzd(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void zzn(String str) {
        zzS(new zzcq(this, str));
    }

    public final void zzo(Activity activity, String str, String str2) {
        zzS(new zzcr(this, activity, str, str2));
    }

    public final void zzp(Boolean bool) {
        zzS(new zzcs(this, bool));
    }

    public final void zzq(Bundle bundle) {
        zzS(new zzct(this, bundle));
    }

    public final void zzr(Bundle bundle) {
        zzS(new zzcu(this, bundle));
    }

    public final void zzs() {
        zzS(new zzcv(this));
    }

    public final void zzt(long j) {
        zzS(new zzcw(this, j));
    }

    public final void zzu(String str) {
        zzS(new zzcy(this, str));
    }

    public final void zzv(String str) {
        zzS(new zzcz(this, str));
    }

    public final String zzw() {
        zzbz zzbz = new zzbz();
        zzS(new zzda(this, zzbz));
        return zzbz.zzc(500);
    }

    public final String zzx() {
        zzbz zzbz = new zzbz();
        zzS(new zzdb(this, zzbz));
        return zzbz.zzc(50);
    }

    public final long zzy() {
        zzbz zzbz = new zzbz();
        zzS(new zzdc(this, zzbz));
        Long l = (Long) zzbz.zze(zzbz.zzd(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.zza.currentTimeMillis()).nextLong();
        int i = this.zzg + 1;
        this.zzg = i;
        return nextLong + ((long) i);
    }

    public final String zzz() {
        zzbz zzbz = new zzbz();
        zzS(new zzdd(this, zzbz));
        return zzbz.zzc(500);
    }
}
