package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

public abstract class zzht<T> {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    @Nullable
    private static volatile zzhs zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicReference<Collection<zzht<?>>> zzg = new AtomicReference<>();
    private static final zzhv zzh = new zzhv(zzhm.zza);
    private static final AtomicInteger zzj = new AtomicInteger();
    final zzhr zza;
    final String zzb;
    private final T zzi;
    private volatile int zzk = -1;
    private volatile T zzl;
    private final boolean zzm;

    /* synthetic */ zzht(zzhr zzhr, String str, Object obj, boolean z, zzhn zzhn) {
        if (zzhr.zzb != null) {
            this.zza = zzhr;
            this.zzb = str;
            this.zzi = obj;
            this.zzm = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    @Deprecated
    public static void zzb(Context context) {
        synchronized (zzd) {
            zzhs zzhs = zze;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (zzhs == null || zzhs.zza() != context) {
                zzha.zzd();
                zzhu.zzb();
                zzhh.zzc();
                zze = new zzgx(context, zzif.zza(new zzhl(context)));
                zzj.incrementAndGet();
            }
        }
    }

    static void zzc() {
        zzj.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public abstract T zza(Object obj);

    public final String zzd() {
        String str = this.zza.zzd;
        return this.zzb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T zze() {
        /*
            r7 = this;
            boolean r0 = r7.zzm
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = r7.zzb
            if (r0 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "flagName must not be null"
            r0.<init>(r1)
            throw r0
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = zzj
            int r0 = r0.get()
            int r1 = r7.zzk
            if (r1 >= r0) goto L_0x0121
            monitor-enter(r7)
            int r1 = r7.zzk     // Catch:{ all -> 0x011e }
            if (r1 >= r0) goto L_0x011c
            com.google.android.gms.internal.measurement.zzhs r1 = zze     // Catch:{ all -> 0x011e }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x0116
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011e }
            boolean r3 = r2.zzf     // Catch:{ all -> 0x011e }
            boolean r2 = r2.zzg     // Catch:{ all -> 0x011e }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhh r2 = com.google.android.gms.internal.measurement.zzhh.zza(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.zze(r3)     // Catch:{ all -> 0x011e }
            r3 = 0
            if (r2 == 0) goto L_0x0074
            java.util.regex.Pattern r4 = com.google.android.gms.internal.measurement.zzgv.zzc     // Catch:{ all -> 0x011e }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x011e }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0072
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.zzd()     // Catch:{ all -> 0x011e }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x011e }
            int r6 = r5.length()     // Catch:{ all -> 0x011e }
            if (r6 == 0) goto L_0x0069
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x011e }
            goto L_0x006f
        L_0x0069:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x011e }
            r5.<init>(r4)     // Catch:{ all -> 0x011e }
            r4 = r5
        L_0x006f:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x011e }
        L_0x0072:
            r2 = r3
            goto L_0x00bb
        L_0x0074:
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011e }
            android.net.Uri r2 = r2.zzb     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x009f
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011e }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x011e }
            boolean r2 = com.google.android.gms.internal.measurement.zzhj.zza(r2, r4)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x009d
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011e }
            boolean r2 = r2.zzh     // Catch:{ all -> 0x011e }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011e }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011e }
            android.net.Uri r4 = r4.zzb     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzha r2 = com.google.android.gms.internal.measurement.zzha.zza(r2, r4)     // Catch:{ all -> 0x011e }
            goto L_0x00ab
        L_0x009d:
            r2 = r3
            goto L_0x00ab
        L_0x009f:
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011e }
            java.lang.String r4 = r4.zza     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhu r2 = com.google.android.gms.internal.measurement.zzhu.zza(r2, r3)     // Catch:{ all -> 0x011e }
        L_0x00ab:
            if (r2 == 0) goto L_0x0072
            java.lang.String r4 = r7.zzd()     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r2.zze(r4)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x0072
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x011e }
        L_0x00bb:
            if (r2 == 0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011e }
            boolean r4 = r2.zze     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhy<android.content.Context, java.lang.Boolean> r2 = r2.zzi     // Catch:{ all -> 0x011e }
            android.content.Context r2 = r1.zza()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhh r2 = com.google.android.gms.internal.measurement.zzhh.zza(r2)     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhr r4 = r7.zza     // Catch:{ all -> 0x011e }
            boolean r5 = r4.zze     // Catch:{ all -> 0x011e }
            java.lang.String r4 = r4.zzc     // Catch:{ all -> 0x011e }
            java.lang.String r4 = r7.zzb     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r2.zze(r4)     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x00df
            java.lang.Object r2 = r7.zza(r2)     // Catch:{ all -> 0x011e }
            goto L_0x00e0
        L_0x00df:
            r2 = r3
        L_0x00e0:
            if (r2 != 0) goto L_0x00e4
            T r2 = r7.zzi     // Catch:{ all -> 0x011e }
        L_0x00e4:
            com.google.android.gms.internal.measurement.zzib r1 = r1.zzb()     // Catch:{ all -> 0x011e }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhz r1 = (com.google.android.gms.internal.measurement.zzhz) r1     // Catch:{ all -> 0x011e }
            boolean r4 = r1.zza()     // Catch:{ all -> 0x011e }
            if (r4 == 0) goto L_0x0111
            java.lang.Object r1 = r1.zzb()     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhi r1 = (com.google.android.gms.internal.measurement.zzhi) r1     // Catch:{ all -> 0x011e }
            com.google.android.gms.internal.measurement.zzhr r2 = r7.zza     // Catch:{ all -> 0x011e }
            android.net.Uri r4 = r2.zzb     // Catch:{ all -> 0x011e }
            java.lang.String r5 = r2.zza     // Catch:{ all -> 0x011e }
            java.lang.String r2 = r2.zzd     // Catch:{ all -> 0x011e }
            java.lang.String r5 = r7.zzb     // Catch:{ all -> 0x011e }
            java.lang.String r1 = r1.zza(r4, r3, r2, r5)     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x010d
            T r2 = r7.zzi     // Catch:{ all -> 0x011e }
            goto L_0x0111
        L_0x010d:
            java.lang.Object r2 = r7.zza(r1)     // Catch:{ all -> 0x011e }
        L_0x0111:
            r7.zzl = r2     // Catch:{ all -> 0x011e }
            r7.zzk = r0     // Catch:{ all -> 0x011e }
            goto L_0x011c
        L_0x0116:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x011e }
            r0.<init>(r2)     // Catch:{ all -> 0x011e }
            throw r0     // Catch:{ all -> 0x011e }
        L_0x011c:
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            goto L_0x0121
        L_0x011e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011e }
            throw r0
        L_0x0121:
            T r0 = r7.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzht.zze():java.lang.Object");
    }
}
