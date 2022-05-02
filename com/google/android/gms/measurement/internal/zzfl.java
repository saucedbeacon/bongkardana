package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzgm;
import com.google.android.gms.internal.measurement.zzgo;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzpn;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.android.gms.internal.measurement.zzr;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;
import o.PlaybackStateCompat;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class zzfl extends zzke implements zzad {
    @VisibleForTesting
    final PlaybackStateCompat.ErrorCode<String, zzc> zza = new zzfi(this, 20);
    final zzr zzb = new zzfj(this);
    /* access modifiers changed from: private */
    public final Map<String, Map<String, String>> zzc = new PlaybackStateCompat();
    private final Map<String, Map<String, Boolean>> zzd = new PlaybackStateCompat();
    private final Map<String, Map<String, Boolean>> zze = new PlaybackStateCompat();
    private final Map<String, zzfc> zzg = new PlaybackStateCompat();
    private final Map<String, Map<String, Integer>> zzh = new PlaybackStateCompat();
    private final Map<String, String> zzi = new PlaybackStateCompat();

    zzfl(zzkn zzkn) {
        super(zzkn);
    }

    static /* synthetic */ zzc zzo(zzfl zzfl, String str) {
        zzfl.zzZ();
        Preconditions.checkNotEmpty(str);
        zzpt.zzb();
        if (!zzfl.zzs.zzc().zzn((String) null, zzea.zzaD) || !zzfl.zzh(str)) {
            return null;
        }
        if (!zzfl.zzg.containsKey(str) || zzfl.zzg.get(str) == null) {
            zzfl.zzq(str);
        } else {
            zzfl.zzs(str, zzfl.zzg.get(str));
        }
        return zzfl.zza.snapshot().get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r2 != null) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0124  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzq(java.lang.String r13) {
        /*
            r12 = this;
            r12.zzZ()
            r12.zzg()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzfc> r0 = r12.zzg
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x0128
            com.google.android.gms.measurement.internal.zzkn r0 = r12.zzf
            com.google.android.gms.measurement.internal.zzai r0 = r0.zzi()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)
            r0.zzg()
            r0.zzZ()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.zze()     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String[] r4 = new java.lang.String[]{r3, r4}     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r10 = 1
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            r11 = 0
            r6[r11] = r13     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x007d, all -> 0x007a }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0078 }
            if (r3 != 0) goto L_0x0047
            if (r2 == 0) goto L_0x0098
            goto L_0x0095
        L_0x0047:
            byte[] r3 = r2.getBlob(r11)     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r4 = r2.getString(r10)     // Catch:{ SQLiteException -> 0x0078 }
            boolean r5 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0078 }
            if (r5 == 0) goto L_0x0068
            com.google.android.gms.measurement.internal.zzfu r5 = r0.zzs     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.zzem r5 = r5.zzau()     // Catch:{ SQLiteException -> 0x0078 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ SQLiteException -> 0x0078 }
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r13)     // Catch:{ SQLiteException -> 0x0078 }
            r5.zzb(r6, r7)     // Catch:{ SQLiteException -> 0x0078 }
        L_0x0068:
            if (r3 != 0) goto L_0x006d
            if (r2 == 0) goto L_0x0098
            goto L_0x0095
        L_0x006d:
            android.util.Pair r5 = new android.util.Pair     // Catch:{ SQLiteException -> 0x0078 }
            r5.<init>(r3, r4)     // Catch:{ SQLiteException -> 0x0078 }
            if (r2 == 0) goto L_0x0099
            r2.close()
            goto L_0x0099
        L_0x0078:
            r3 = move-exception
            goto L_0x0080
        L_0x007a:
            r13 = move-exception
            goto L_0x0122
        L_0x007d:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0080:
            com.google.android.gms.measurement.internal.zzfu r0 = r0.zzs     // Catch:{ all -> 0x0120 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x0120 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r13)     // Catch:{ all -> 0x0120 }
            r0.zzc(r4, r5, r3)     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0098
        L_0x0095:
            r2.close()
        L_0x0098:
            r5 = r1
        L_0x0099:
            if (r5 != 0) goto L_0x00ba
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.zzc
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.zzd
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.zze
            r0.put(r13, r1)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzfc> r0 = r12.zzg
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.zzi
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.zzh
            r0.put(r13, r1)
            return
        L_0x00ba:
            java.lang.Object r0 = r5.first
            byte[] r0 = (byte[]) r0
            com.google.android.gms.internal.measurement.zzfc r0 = r12.zzt(r13, r0)
            com.google.android.gms.internal.measurement.zzjz r0 = r0.zzbu()
            com.google.android.gms.internal.measurement.zzfb r0 = (com.google.android.gms.internal.measurement.zzfb) r0
            r12.zzr(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.zzc
            com.google.android.gms.internal.measurement.zzkd r3 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r3 = (com.google.android.gms.internal.measurement.zzfc) r3
            java.util.Map r3 = zzu(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.zzfc> r2 = r12.zzg
            com.google.android.gms.internal.measurement.zzkd r3 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r3 = (com.google.android.gms.internal.measurement.zzfc) r3
            r2.put(r13, r3)
            com.google.android.gms.internal.measurement.zzpt.zzb()
            com.google.android.gms.measurement.internal.zzfu r2 = r12.zzs
            com.google.android.gms.measurement.internal.zzae r2 = r2.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzea.zzaD
            boolean r2 = r2.zzn(r1, r3)
            if (r2 == 0) goto L_0x00ff
            com.google.android.gms.internal.measurement.zzkd r0 = r0.zzaA()
            com.google.android.gms.internal.measurement.zzfc r0 = (com.google.android.gms.internal.measurement.zzfc) r0
            r12.zzs(r13, r0)
        L_0x00ff:
            com.google.android.gms.internal.measurement.zzpn.zzb()
            com.google.android.gms.measurement.internal.zzfu r0 = r12.zzs
            com.google.android.gms.measurement.internal.zzae r0 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzea.zzaB
            boolean r0 = r0.zzn(r1, r2)
            if (r0 == 0) goto L_0x011a
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.zzi
            java.lang.Object r1 = r5.second
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r13, r1)
            return
        L_0x011a:
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.zzi
            r0.put(r13, r1)
            return
        L_0x0120:
            r13 = move-exception
            r1 = r2
        L_0x0122:
            if (r1 == 0) goto L_0x0127
            r1.close()
        L_0x0127:
            throw r13
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfl.zzq(java.lang.String):void");
    }

    private final void zzr(String str, zzfb zzfb) {
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
        PlaybackStateCompat playbackStateCompat2 = new PlaybackStateCompat();
        PlaybackStateCompat playbackStateCompat3 = new PlaybackStateCompat();
        if (zzfb != null) {
            for (int i = 0; i < zzfb.zza(); i++) {
                zzez zzez = (zzez) zzfb.zzb(i).zzbu();
                if (TextUtils.isEmpty(zzez.zza())) {
                    this.zzs.zzau().zze().zza("EventConfig contained null event name");
                } else {
                    String zza2 = zzez.zza();
                    String zzb2 = zzgr.zzb(zzez.zza());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzez.zzb(zzb2);
                        zzfb.zzc(i, zzez);
                    }
                    playbackStateCompat.put(zza2, Boolean.valueOf(zzez.zzc()));
                    playbackStateCompat2.put(zzez.zza(), Boolean.valueOf(zzez.zzd()));
                    if (zzez.zze()) {
                        if (zzez.zzf() < 2 || zzez.zzf() > 65535) {
                            this.zzs.zzau().zze().zzc("Invalid sampling rate. Event name, sample rate", zzez.zza(), Integer.valueOf(zzez.zzf()));
                        } else {
                            playbackStateCompat3.put(zzez.zza(), Integer.valueOf(zzez.zzf()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, playbackStateCompat);
        this.zze.put(str, playbackStateCompat2);
        this.zzh.put(str, playbackStateCompat3);
    }

    @WorkerThread
    private final void zzs(String str, zzfc zzfc) {
        if (zzfc.zzk() != 0) {
            this.zzs.zzau().zzk().zzb("EES programs found", Integer.valueOf(zzfc.zzk()));
            zzgo zzgo = zzfc.zzj().get(0);
            try {
                zzc zzc2 = new zzc();
                zzc2.zza("internal.remoteConfig", new zzfg(this, str));
                zzc2.zza("internal.logger", new zzfh(this));
                zzc2.zzf(zzgo);
                this.zza.put(str, zzc2);
                this.zzs.zzau().zzk().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgo.zzb().zzb()));
                for (zzgm zza2 : zzgo.zzb().zza()) {
                    this.zzs.zzau().zzk().zzb("EES program activity", zza2.zza());
                }
            } catch (zzd unused) {
                this.zzs.zzau().zzb().zzb("Failed to load EES program. appId", str);
            }
        } else {
            this.zza.remove(str);
        }
    }

    @WorkerThread
    private final zzfc zzt(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzn();
        }
        try {
            zzfc zzfc = (zzfc) ((zzfb) zzkp.zzt(zzfc.zzm(), bArr)).zzaA();
            zzek zzk = this.zzs.zzau().zzk();
            String str2 = null;
            Long valueOf = zzfc.zza() ? Long.valueOf(zzfc.zzb()) : null;
            if (zzfc.zzc()) {
                str2 = zzfc.zzd();
            }
            zzk.zzc("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzfc;
        } catch (zzkn e) {
            this.zzs.zzau().zze().zzc("Unable to merge remote config. appId", zzem.zzl(str), e);
            return zzfc.zzn();
        } catch (RuntimeException e2) {
            this.zzs.zzau().zze().zzc("Unable to merge remote config. appId", zzem.zzl(str), e2);
            return zzfc.zzn();
        }
    }

    private static final Map<String, String> zzu(zzfc zzfc) {
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat();
        if (zzfc != null) {
            for (zzfe next : zzfc.zze()) {
                playbackStateCompat.put(next.zza(), next.zzb());
            }
        }
        return playbackStateCompat;
    }

    @WorkerThread
    public final String zza(String str, String str2) {
        zzg();
        zzq(str);
        Map map = this.zzc.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean zzaA() {
        return false;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final zzfc zzb(String str) {
        zzZ();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzq(str);
        return this.zzg.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final String zzc(String str) {
        zzg();
        return this.zzi.get(str);
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final void zzd(String str) {
        zzg();
        this.zzi.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zze(String str) {
        zzg();
        this.zzg.remove(str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zzf(String str) {
        zzg();
        zzfc zzb2 = zzb(str);
        if (zzb2 == null) {
            return false;
        }
        return zzb2.zzi();
    }

    public final boolean zzh(String str) {
        zzfc zzfc;
        zzpt.zzb();
        if (!this.zzs.zzc().zzn((String) null, zzea.zzaD) || TextUtils.isEmpty(str) || (zzfc = this.zzg.get(str)) == null || zzfc.zzk() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final boolean zzi(String str, byte[] bArr, String str2) {
        zzZ();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzfb zzfb = (zzfb) zzt(str, bArr).zzbu();
        if (zzfb == null) {
            return false;
        }
        zzr(str, zzfb);
        zzpt.zzb();
        if (this.zzs.zzc().zzn((String) null, zzea.zzaD)) {
            zzs(str, (zzfc) zzfb.zzaA());
        }
        this.zzg.put(str, (zzfc) zzfb.zzaA());
        this.zzi.put(str, str2);
        this.zzc.put(str, zzu((zzfc) zzfb.zzaA()));
        this.zzf.zzi().zzL(str, new ArrayList(zzfb.zzd()));
        try {
            zzfb.zze();
            bArr = ((zzfc) zzfb.zzaA()).zzbp();
        } catch (RuntimeException e) {
            this.zzs.zzau().zze().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzem.zzl(str), e);
        }
        zzpn.zzb();
        if (this.zzs.zzc().zzn((String) null, zzea.zzaB)) {
            this.zzf.zzi().zzw(str, bArr, str2);
        } else {
            this.zzf.zzi().zzw(str, bArr, (String) null);
        }
        this.zzg.put(str, (zzfc) zzfb.zzaA());
        return true;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zzj(String str, String str2) {
        Boolean bool;
        zzg();
        zzq(str);
        if (zzm(str) && zzku.zzR(str2)) {
            return true;
        }
        if (zzn(str) && zzku.zzh(str2)) {
            return true;
        }
        Map map = this.zzd.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final boolean zzk(String str, String str2) {
        Boolean bool;
        zzg();
        zzq(str);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map map = this.zze.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final int zzl(String str, String str2) {
        Integer num;
        zzg();
        zzq(str);
        Map map = this.zzh.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean zzm(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(434625250, oncanceled);
            onCancelLoad.getMin(434625250, oncanceled);
        }
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzn(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }
}
