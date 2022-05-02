package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfv;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzov;
import com.google.android.gms.internal.measurement.zzpt;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.PlaybackStateCompat;

public final class zzkn implements zzgp {
    private static volatile zzkn zzb;
    private final Map<String, zzaf> zzA;
    private final zzkt zzB = new zzkl(this);
    @VisibleForTesting
    long zza;
    private final zzfl zzc;
    private final zzes zzd;
    private zzai zze;
    private zzeu zzf;
    private zzkc zzg;
    private zzy zzh;
    private final zzkp zzi;
    private zzib zzj;
    private zzjl zzk;
    private final zzkf zzl;
    /* access modifiers changed from: private */
    public final zzfu zzm;
    private boolean zzn = false;
    private boolean zzo;
    private List<Runnable> zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private FileLock zzv;
    private FileChannel zzw;
    private List<Long> zzx;
    private List<Long> zzy;
    private long zzz;

    zzkn(zzko zzko, zzfu zzfu) {
        Preconditions.checkNotNull(zzko);
        this.zzm = zzfu.zzC(zzko.zza, (zzcl) null, (Long) null);
        this.zzz = -1;
        this.zzl = new zzkf(this);
        zzkp zzkp = new zzkp(this);
        zzkp.zzaa();
        this.zzi = zzkp;
        zzes zzes = new zzes(this);
        zzes.zzaa();
        this.zzd = zzes;
        zzfl zzfl = new zzfl(this);
        zzfl.zzaa();
        this.zzc = zzfl;
        this.zzA = new HashMap();
        zzav().zzh(new zzkg(this, zzko));
    }

    static /* synthetic */ void zzW(zzkn zzkn, zzko zzko) {
        zzkn.zzav().zzg();
        zzai zzai = new zzai(zzkn);
        zzai.zzaa();
        zzkn.zze = zzai;
        zzkn.zzd().zza((zzad) Preconditions.checkNotNull(zzkn.zzc));
        zzjl zzjl = new zzjl(zzkn);
        zzjl.zzaa();
        zzkn.zzk = zzjl;
        zzy zzy2 = new zzy(zzkn);
        zzy2.zzaa();
        zzkn.zzh = zzy2;
        zzib zzib = new zzib(zzkn);
        zzib.zzaa();
        zzkn.zzj = zzib;
        zzkc zzkc = new zzkc(zzkn);
        zzkc.zzaa();
        zzkn.zzg = zzkc;
        zzkn.zzf = new zzeu(zzkn);
        if (zzkn.zzq != zzkn.zzr) {
            zzkn.zzau().zzb().zzc("Not all upload components initialized", Integer.valueOf(zzkn.zzq), Integer.valueOf(zzkn.zzr));
        }
        zzkn.zzn = true;
    }

    @VisibleForTesting
    static final void zzY(zzfn zzfn, int i, String str) {
        List<zzfs> zza2 = zzfn.zza();
        int i2 = 0;
        while (i2 < zza2.size()) {
            if (!"_err".equals(zza2.get(i2).zzb())) {
                i2++;
            } else {
                return;
            }
        }
        zzfr zzn2 = zzfs.zzn();
        zzn2.zza("_err");
        zzn2.zzd(Long.valueOf((long) i).longValue());
        zzfr zzn3 = zzfs.zzn();
        zzn3.zza("_ev");
        zzn3.zzb(str);
        zzfn.zzf((zzfs) zzn2.zzaA());
        zzfn.zzf((zzfs) zzn3.zzaA());
    }

    @VisibleForTesting
    static final void zzZ(zzfn zzfn, @NonNull String str) {
        List<zzfs> zza2 = zzfn.zza();
        for (int i = 0; i < zza2.size(); i++) {
            if (str.equals(zza2.get(i).zzb())) {
                zzfn.zzj(i);
                return;
            }
        }
    }

    public static zzkn zza(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzkn.class) {
                if (zzb == null) {
                    zzb = new zzkn((zzko) Preconditions.checkNotNull(new zzko(context)), (zzfu) null);
                }
            }
        }
        return zzb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x03c7 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x048b A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04e5 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0630 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0648 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x097e A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x09c7 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x09ea A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0a61 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a63 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0a6b A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x0a97 A[Catch:{ NumberFormatException -> 0x0945, all -> 0x0d57 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:440:0x0d45=Splitter:B:440:0x0d45, B:69:0x0209=Splitter:B:69:0x0209} */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzaa(java.lang.String r46, long r47) {
        /*
            r45 = this;
            r1 = r45
            java.lang.String r2 = "_sc"
            java.lang.String r3 = "_sn"
            java.lang.String r4 = "_npa"
            java.lang.String r5 = "_ai"
            com.google.android.gms.measurement.internal.zzai r6 = r1.zze
            zzak(r6)
            r6.zzb()
            com.google.android.gms.measurement.internal.zzkm r6 = new com.google.android.gms.measurement.internal.zzkm     // Catch:{ all -> 0x0d57 }
            r14 = 0
            r6.<init>(r1, r14)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r7 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r7)     // Catch:{ all -> 0x0d57 }
            r8 = 0
            long r11 = r1.zzz     // Catch:{ all -> 0x0d57 }
            r9 = r47
            r13 = r6
            r7.zzW(r8, r9, r11, r13)     // Catch:{ all -> 0x0d57 }
            java.util.List<com.google.android.gms.internal.measurement.zzfo> r7 = r6.zzc     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x0d45
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x0032
            goto L_0x0d45
        L_0x0032:
            com.google.android.gms.internal.measurement.zzfw r7 = r6.zza     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzjz r7 = r7.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfv r7 = (com.google.android.gms.internal.measurement.zzfv) r7     // Catch:{ all -> 0x0d57 }
            r7.zzh()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzae r9 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r10 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = r10.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzea.zzT     // Catch:{ all -> 0x0d57 }
            boolean r9 = r9.zzn(r10, r11)     // Catch:{ all -> 0x0d57 }
            r18 = r14
            r20 = r18
            r8 = -1
            r10 = -1
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
        L_0x005a:
            java.util.List<com.google.android.gms.internal.measurement.zzfo> r11 = r6.zzc     // Catch:{ all -> 0x0d57 }
            int r11 = r11.size()     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = "_fr"
            java.lang.String r14 = "_et"
            r23 = r4
            java.lang.String r4 = "_e"
            r24 = r2
            r25 = r3
            if (r13 >= r11) goto L_0x069e
            java.util.List<com.google.android.gms.internal.measurement.zzfo> r3 = r6.zzc     // Catch:{ all -> 0x0d57 }
            java.lang.Object r3 = r3.get(r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r3 = (com.google.android.gms.internal.measurement.zzfo) r3     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzjz r3 = r3.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfn r3 = (com.google.android.gms.internal.measurement.zzfn) r3     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfl r11 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r2 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r2 = r2.zzA()     // Catch:{ all -> 0x0d57 }
            r28 = r13
            java.lang.String r13 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r11.zzj(r2, r13)     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = "_err"
            if (r2 == 0) goto L_0x011c
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "Dropping blacklisted raw event. appId"
            com.google.android.gms.internal.measurement.zzfw r12 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = r12.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzem.zzl(r12)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfu r13 = r1.zzm     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.zzm()     // Catch:{ all -> 0x0d57 }
            java.lang.String r14 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r13.zzc(r14)     // Catch:{ all -> 0x0d57 }
            r2.zzc(r4, r12, r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfl r2 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r4 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = r4.zzA()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.zzm(r4)     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzfl r2 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r4 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = r4.zzA()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.zzn(r4)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x00dd
            goto L_0x010d
        L_0x00dd:
            java.lang.String r2 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r11.equals(r2)     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x010d
            com.google.android.gms.measurement.internal.zzku r29 = r45.zzq()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkt r2 = r1.zzB     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r4 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r31 = r4.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r33 = "_ev"
            java.lang.String r34 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzae r3 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzea.zzav     // Catch:{ all -> 0x0d57 }
            r11 = 0
            boolean r36 = r3.zzn(r11, r4)     // Catch:{ all -> 0x0d57 }
            r32 = 11
            r35 = 0
            r30 = r2
            r29.zzM(r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0d57 }
        L_0x010d:
            r30 = r5
            r5 = r7
            r31 = r15
            r14 = r24
            r11 = r25
            r7 = r28
            r16 = r9
            goto L_0x068e
        L_0x011c:
            java.lang.String r2 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = com.google.android.gms.measurement.internal.zzgr.zza(r5)     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.equals(r13)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x0192
            r3.zzl(r5)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = "Renaming ad_impression to _ai"
            r2.zza(r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            java.lang.String r2 = r2.zzn()     // Catch:{ all -> 0x0d57 }
            r13 = 5
            boolean r2 = android.util.Log.isLoggable(r2, r13)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x0192
            r2 = 0
        L_0x014a:
            int r13 = r3.zzb()     // Catch:{ all -> 0x0d57 }
            if (r2 >= r13) goto L_0x0192
            java.lang.String r13 = "ad_platform"
            com.google.android.gms.internal.measurement.zzfs r29 = r3.zzc(r2)     // Catch:{ all -> 0x0d57 }
            r30 = r5
            java.lang.String r5 = r29.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r5 = r13.equals(r5)     // Catch:{ all -> 0x0d57 }
            if (r5 == 0) goto L_0x018d
            com.google.android.gms.internal.measurement.zzfs r5 = r3.zzc(r2)     // Catch:{ all -> 0x0d57 }
            java.lang.String r5 = r5.zzd()     // Catch:{ all -> 0x0d57 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d57 }
            if (r5 != 0) goto L_0x018d
            java.lang.String r5 = "admob"
            com.google.android.gms.internal.measurement.zzfs r13 = r3.zzc(r2)     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r13.zzd()     // Catch:{ all -> 0x0d57 }
            boolean r5 = r5.equalsIgnoreCase(r13)     // Catch:{ all -> 0x0d57 }
            if (r5 == 0) goto L_0x018d
            com.google.android.gms.measurement.internal.zzem r5 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzh()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = "AdMob ad impression logged from app. Potentially duplicative."
            r5.zza(r13)     // Catch:{ all -> 0x0d57 }
        L_0x018d:
            int r2 = r2 + 1
            r5 = r30
            goto L_0x014a
        L_0x0192:
            r30 = r5
            com.google.android.gms.measurement.internal.zzfl r2 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r5 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r5 = r5.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.zzk(r5, r13)     // Catch:{ all -> 0x0d57 }
            java.lang.String r5 = "_c"
            if (r2 != 0) goto L_0x0200
            com.google.android.gms.measurement.internal.zzkp r13 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r13)     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r13)     // Catch:{ all -> 0x0d57 }
            r31 = r15
            int r15 = r13.hashCode()     // Catch:{ all -> 0x0d57 }
            r16 = r9
            r9 = 94660(0x171c4, float:1.32647E-40)
            if (r15 == r9) goto L_0x01e3
            r9 = 95025(0x17331, float:1.33158E-40)
            if (r15 == r9) goto L_0x01d9
            r9 = 95027(0x17333, float:1.33161E-40)
            if (r15 == r9) goto L_0x01cf
            goto L_0x01ed
        L_0x01cf:
            java.lang.String r9 = "_ui"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 1
            goto L_0x01ee
        L_0x01d9:
            java.lang.String r9 = "_ug"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 2
            goto L_0x01ee
        L_0x01e3:
            java.lang.String r9 = "_in"
            boolean r9 = r13.equals(r9)
            if (r9 == 0) goto L_0x01ed
            r9 = 0
            goto L_0x01ee
        L_0x01ed:
            r9 = -1
        L_0x01ee:
            if (r9 == 0) goto L_0x0204
            r13 = 1
            if (r9 == r13) goto L_0x0204
            r13 = 2
            if (r9 == r13) goto L_0x0204
            r33 = r7
            r22 = r8
            r13 = r10
            r29 = r14
            r2 = 0
            goto L_0x03c5
        L_0x0200:
            r31 = r15
            r16 = r9
        L_0x0204:
            r22 = r8
            r9 = 0
            r13 = 0
            r15 = 0
        L_0x0209:
            int r8 = r3.zzb()     // Catch:{ all -> 0x0d57 }
            r29 = r14
            java.lang.String r14 = "_r"
            if (r9 >= r8) goto L_0x0267
            com.google.android.gms.internal.measurement.zzfs r8 = r3.zzc(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = r8.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x023b
            com.google.android.gms.internal.measurement.zzfs r8 = r3.zzc(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzjz r8 = r8.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r8 = (com.google.android.gms.internal.measurement.zzfr) r8     // Catch:{ all -> 0x0d57 }
            r13 = 1
            r8.zzd(r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r8 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r8 = (com.google.android.gms.internal.measurement.zzfs) r8     // Catch:{ all -> 0x0d57 }
            r3.zzd(r9, r8)     // Catch:{ all -> 0x0d57 }
            r13 = 1
            goto L_0x0262
        L_0x023b:
            com.google.android.gms.internal.measurement.zzfs r8 = r3.zzc(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = r8.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r8 = r14.equals(r8)     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x0262
            com.google.android.gms.internal.measurement.zzfs r8 = r3.zzc(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzjz r8 = r8.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r8 = (com.google.android.gms.internal.measurement.zzfr) r8     // Catch:{ all -> 0x0d57 }
            r14 = 1
            r8.zzd(r14)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r8 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r8 = (com.google.android.gms.internal.measurement.zzfs) r8     // Catch:{ all -> 0x0d57 }
            r3.zzd(r9, r8)     // Catch:{ all -> 0x0d57 }
            r15 = 1
        L_0x0262:
            int r9 = r9 + 1
            r14 = r29
            goto L_0x0209
        L_0x0267:
            if (r13 != 0) goto L_0x0298
            if (r2 == 0) goto L_0x0298
            com.google.android.gms.measurement.internal.zzem r8 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r8 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = "Marking event as conversion"
            com.google.android.gms.measurement.internal.zzfu r13 = r1.zzm     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzeh r13 = r13.zzm()     // Catch:{ all -> 0x0d57 }
            r33 = r7
            java.lang.String r7 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r13.zzc(r7)     // Catch:{ all -> 0x0d57 }
            r8.zzb(r9, r7)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zzn()     // Catch:{ all -> 0x0d57 }
            r7.zza(r5)     // Catch:{ all -> 0x0d57 }
            r8 = 1
            r7.zzd(r8)     // Catch:{ all -> 0x0d57 }
            r3.zzg(r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x029a
        L_0x0298:
            r33 = r7
        L_0x029a:
            if (r15 != 0) goto L_0x02c6
            com.google.android.gms.measurement.internal.zzem r7 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = "Marking event as real-time"
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzeh r9 = r9.zzm()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r9.zzc(r13)     // Catch:{ all -> 0x0d57 }
            r7.zzb(r8, r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r7 = com.google.android.gms.internal.measurement.zzfs.zzn()     // Catch:{ all -> 0x0d57 }
            r7.zza(r14)     // Catch:{ all -> 0x0d57 }
            r8 = 1
            r7.zzd(r8)     // Catch:{ all -> 0x0d57 }
            r3.zzg(r7)     // Catch:{ all -> 0x0d57 }
        L_0x02c6:
            com.google.android.gms.measurement.internal.zzai r7 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r7)     // Catch:{ all -> 0x0d57 }
            long r35 = r45.zzu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r8 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r37 = r8.zzA()     // Catch:{ all -> 0x0d57 }
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 1
            r34 = r7
            com.google.android.gms.measurement.internal.zzag r7 = r34.zzu(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0d57 }
            long r7 = r7.zze     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzae r9 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r13 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = r13.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r15 = com.google.android.gms.measurement.internal.zzea.zzn     // Catch:{ all -> 0x0d57 }
            int r9 = r9.zzk(r13, r15)     // Catch:{ all -> 0x0d57 }
            r13 = r10
            long r9 = (long) r9     // Catch:{ all -> 0x0d57 }
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x0301
            zzZ(r3, r14)     // Catch:{ all -> 0x0d57 }
            goto L_0x0303
        L_0x0301:
            r19 = 1
        L_0x0303:
            java.lang.String r7 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r7 = com.google.android.gms.measurement.internal.zzku.zzh(r7)     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x03c5
            if (r2 == 0) goto L_0x03c5
            com.google.android.gms.measurement.internal.zzai r7 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r7)     // Catch:{ all -> 0x0d57 }
            long r35 = r45.zzu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r8 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r37 = r8.zzA()     // Catch:{ all -> 0x0d57 }
            r38 = 0
            r39 = 0
            r40 = 1
            r41 = 0
            r42 = 0
            r34 = r7
            com.google.android.gms.measurement.internal.zzag r7 = r34.zzu(r35, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0d57 }
            long r7 = r7.zzc     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzae r9 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r10 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = r10.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzea.zzm     // Catch:{ all -> 0x0d57 }
            int r9 = r9.zzk(r10, r14)     // Catch:{ all -> 0x0d57 }
            long r9 = (long) r9     // Catch:{ all -> 0x0d57 }
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L_0x03c5
            com.google.android.gms.measurement.internal.zzem r7 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = "Too many conversions. Not logging as conversion. appId"
            com.google.android.gms.internal.measurement.zzfw r9 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r9.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzem.zzl(r9)     // Catch:{ all -> 0x0d57 }
            r7.zzb(r8, r9)     // Catch:{ all -> 0x0d57 }
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
        L_0x0360:
            int r14 = r3.zzb()     // Catch:{ all -> 0x0d57 }
            if (r7 >= r14) goto L_0x038b
            com.google.android.gms.internal.measurement.zzfs r14 = r3.zzc(r7)     // Catch:{ all -> 0x0d57 }
            java.lang.String r15 = r14.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r15 = r5.equals(r15)     // Catch:{ all -> 0x0d57 }
            if (r15 == 0) goto L_0x037d
            com.google.android.gms.internal.measurement.zzjz r9 = r14.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r9 = (com.google.android.gms.internal.measurement.zzfr) r9     // Catch:{ all -> 0x0d57 }
            r10 = r9
            r9 = r7
            goto L_0x0388
        L_0x037d:
            java.lang.String r14 = r14.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r14 = r11.equals(r14)     // Catch:{ all -> 0x0d57 }
            if (r14 == 0) goto L_0x0388
            r8 = 1
        L_0x0388:
            int r7 = r7 + 1
            goto L_0x0360
        L_0x038b:
            if (r8 == 0) goto L_0x0394
            if (r10 == 0) goto L_0x0393
            r3.zzj(r9)     // Catch:{ all -> 0x0d57 }
            goto L_0x03c5
        L_0x0393:
            r10 = 0
        L_0x0394:
            if (r10 == 0) goto L_0x03ae
            com.google.android.gms.internal.measurement.zzjz r7 = r10.zzaq()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfr r7 = (com.google.android.gms.internal.measurement.zzfr) r7     // Catch:{ all -> 0x0d57 }
            r7.zza(r11)     // Catch:{ all -> 0x0d57 }
            r10 = 10
            r7.zzd(r10)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r7 = r7.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d57 }
            r3.zzd(r9, r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x03c5
        L_0x03ae:
            com.google.android.gms.measurement.internal.zzem r7 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zzb()     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = "Did not find conversion parameter. appId"
            com.google.android.gms.internal.measurement.zzfw r9 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r9.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzem.zzl(r9)     // Catch:{ all -> 0x0d57 }
            r7.zzb(r8, r9)     // Catch:{ all -> 0x0d57 }
        L_0x03c5:
            if (r2 == 0) goto L_0x047e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0d57 }
            java.util.List r7 = r3.zza()     // Catch:{ all -> 0x0d57 }
            r2.<init>(r7)     // Catch:{ all -> 0x0d57 }
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x03d3:
            int r10 = r2.size()     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = "currency"
            java.lang.String r14 = "value"
            if (r7 >= r10) goto L_0x0403
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r10 = (com.google.android.gms.internal.measurement.zzfs) r10     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = r10.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r10 = r14.equals(r10)     // Catch:{ all -> 0x0d57 }
            if (r10 == 0) goto L_0x03ef
            r8 = r7
            goto L_0x0400
        L_0x03ef:
            java.lang.Object r10 = r2.get(r7)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r10 = (com.google.android.gms.internal.measurement.zzfs) r10     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = r10.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r10 = r11.equals(r10)     // Catch:{ all -> 0x0d57 }
            if (r10 == 0) goto L_0x0400
            r9 = r7
        L_0x0400:
            int r7 = r7 + 1
            goto L_0x03d3
        L_0x0403:
            r7 = -1
            if (r8 != r7) goto L_0x0408
            goto L_0x047f
        L_0x0408:
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d57 }
            boolean r7 = r7.zze()     // Catch:{ all -> 0x0d57 }
            if (r7 != 0) goto L_0x0439
            java.lang.Object r7 = r2.get(r8)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r7 = (com.google.android.gms.internal.measurement.zzfs) r7     // Catch:{ all -> 0x0d57 }
            boolean r7 = r7.zzi()     // Catch:{ all -> 0x0d57 }
            if (r7 != 0) goto L_0x0439
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzh()     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = "Value must be specified with a numeric type."
            r2.zza(r7)     // Catch:{ all -> 0x0d57 }
            r3.zzj(r8)     // Catch:{ all -> 0x0d57 }
            zzZ(r3, r5)     // Catch:{ all -> 0x0d57 }
            r2 = 18
            zzY(r3, r2, r14)     // Catch:{ all -> 0x0d57 }
            goto L_0x047e
        L_0x0439:
            r7 = -1
            if (r9 != r7) goto L_0x043d
            goto L_0x0465
        L_0x043d:
            java.lang.Object r2 = r2.get(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r2 = (com.google.android.gms.internal.measurement.zzfs) r2     // Catch:{ all -> 0x0d57 }
            java.lang.String r2 = r2.zzd()     // Catch:{ all -> 0x0d57 }
            int r9 = r2.length()     // Catch:{ all -> 0x0d57 }
            r10 = 3
            if (r9 != r10) goto L_0x0465
            r9 = 0
        L_0x044f:
            int r10 = r2.length()     // Catch:{ all -> 0x0d57 }
            if (r9 >= r10) goto L_0x047f
            int r10 = r2.codePointAt(r9)     // Catch:{ all -> 0x0d57 }
            boolean r14 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x0d57 }
            if (r14 == 0) goto L_0x0465
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x0d57 }
            int r9 = r9 + r10
            goto L_0x044f
        L_0x0465:
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzh()     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r2.zza(r9)     // Catch:{ all -> 0x0d57 }
            r3.zzj(r8)     // Catch:{ all -> 0x0d57 }
            zzZ(r3, r5)     // Catch:{ all -> 0x0d57 }
            r2 = 19
            zzY(r3, r2, r11)     // Catch:{ all -> 0x0d57 }
            goto L_0x047f
        L_0x047e:
            r7 = -1
        L_0x047f:
            java.lang.String r2 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0d57 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x04e5
            com.google.android.gms.measurement.internal.zzkp r2 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r2 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.zzkp.zzA(r2, r12)     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x04df
            if (r20 == 0) goto L_0x04d0
            long r10 = r20.zzn()     // Catch:{ all -> 0x0d57 }
            long r14 = r3.zzn()     // Catch:{ all -> 0x0d57 }
            long r10 = r10 - r14
            long r10 = java.lang.Math.abs(r10)     // Catch:{ all -> 0x0d57 }
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x04d0
            com.google.android.gms.internal.measurement.zzjz r2 = r20.zzaq()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d57 }
            boolean r5 = r1.zzac(r3, r2)     // Catch:{ all -> 0x0d57 }
            if (r5 == 0) goto L_0x04c7
            r12 = r13
            r5 = r33
            r5.zze(r12, r2)     // Catch:{ all -> 0x0d57 }
            r8 = r22
            r2 = 0
            r20 = 0
            goto L_0x04cd
        L_0x04c7:
            r12 = r13
            r5 = r33
            r2 = r3
            r8 = r17
        L_0x04cd:
            r18 = r2
            goto L_0x04d7
        L_0x04d0:
            r12 = r13
            r5 = r33
            r18 = r3
            r8 = r17
        L_0x04d7:
            r14 = r24
            r11 = r25
            r10 = r29
            goto L_0x061e
        L_0x04df:
            r12 = r13
            r5 = r33
            r8 = r22
            goto L_0x04d7
        L_0x04e5:
            r12 = r13
            r5 = r33
            java.lang.String r2 = "_vs"
            java.lang.String r10 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.equals(r10)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x0547
            com.google.android.gms.measurement.internal.zzkp r2 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r2 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d57 }
            r10 = r29
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.zzkp.zzA(r2, r10)     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x0544
            if (r18 == 0) goto L_0x0538
            long r13 = r18.zzn()     // Catch:{ all -> 0x0d57 }
            long r20 = r3.zzn()     // Catch:{ all -> 0x0d57 }
            long r13 = r13 - r20
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d57 }
            int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r2 > 0) goto L_0x0538
            com.google.android.gms.internal.measurement.zzjz r2 = r18.zzaq()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d57 }
            boolean r8 = r1.zzac(r2, r3)     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x0530
            r8 = r22
            r5.zze(r8, r2)     // Catch:{ all -> 0x0d57 }
            r2 = 0
            r18 = 0
            goto L_0x0535
        L_0x0530:
            r8 = r22
            r2 = r3
            r12 = r17
        L_0x0535:
            r20 = r2
            goto L_0x053e
        L_0x0538:
            r8 = r22
            r20 = r3
            r12 = r17
        L_0x053e:
            r14 = r24
            r11 = r25
            goto L_0x061e
        L_0x0544:
            r8 = r22
            goto L_0x053e
        L_0x0547:
            r8 = r22
            r10 = r29
            com.google.android.gms.measurement.internal.zzae r2 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r9 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r9.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzea.zzaj     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.zzn(r9, r11)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x053e
            java.lang.String r2 = "_ab"
            java.lang.String r9 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.equals(r9)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x053e
            com.google.android.gms.measurement.internal.zzkp r2 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r2 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r2 = com.google.android.gms.measurement.internal.zzkp.zzA(r2, r10)     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x053e
            if (r18 == 0) goto L_0x053e
            long r13 = r18.zzn()     // Catch:{ all -> 0x0d57 }
            long r26 = r3.zzn()     // Catch:{ all -> 0x0d57 }
            long r13 = r13 - r26
            long r13 = java.lang.Math.abs(r13)     // Catch:{ all -> 0x0d57 }
            r26 = 4000(0xfa0, double:1.9763E-320)
            int r2 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            if (r2 > 0) goto L_0x053e
            com.google.android.gms.internal.measurement.zzjz r2 = r18.zzaq()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfn r2 = (com.google.android.gms.internal.measurement.zzfn) r2     // Catch:{ all -> 0x0d57 }
            r1.zzad(r2, r3)     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r2.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r9 = r4.equals(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r9 = r2.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r11 = r25
            com.google.android.gms.internal.measurement.zzfs r9 = com.google.android.gms.measurement.internal.zzkp.zzA(r9, r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp r13 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r13 = r2.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r13 = (com.google.android.gms.internal.measurement.zzfo) r13     // Catch:{ all -> 0x0d57 }
            r14 = r24
            com.google.android.gms.internal.measurement.zzfs r13 = com.google.android.gms.measurement.internal.zzkp.zzA(r13, r14)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp r15 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r15)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r15 = r2.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r15 = (com.google.android.gms.internal.measurement.zzfo) r15     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = "_si"
            com.google.android.gms.internal.measurement.zzfs r7 = com.google.android.gms.measurement.internal.zzkp.zzA(r15, r7)     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x05de
            java.lang.String r9 = r9.zzd()     // Catch:{ all -> 0x0d57 }
            goto L_0x05e0
        L_0x05de:
            java.lang.String r9 = ""
        L_0x05e0:
            boolean r15 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d57 }
            if (r15 != 0) goto L_0x05ee
            com.google.android.gms.measurement.internal.zzkp r15 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r15)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r3, r11, r9)     // Catch:{ all -> 0x0d57 }
        L_0x05ee:
            if (r13 == 0) goto L_0x05f5
            java.lang.String r9 = r13.zzd()     // Catch:{ all -> 0x0d57 }
            goto L_0x05f7
        L_0x05f5:
            java.lang.String r9 = ""
        L_0x05f7:
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0d57 }
            if (r13 != 0) goto L_0x0605
            com.google.android.gms.measurement.internal.zzkp r13 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r3, r14, r9)     // Catch:{ all -> 0x0d57 }
        L_0x0605:
            if (r7 == 0) goto L_0x0619
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = "_si"
            long r24 = r7.zzf()     // Catch:{ all -> 0x0d57 }
            java.lang.Long r7 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r3, r9, r7)     // Catch:{ all -> 0x0d57 }
        L_0x0619:
            r5.zze(r8, r2)     // Catch:{ all -> 0x0d57 }
            r18 = 0
        L_0x061e:
            if (r16 != 0) goto L_0x067b
            java.lang.String r2 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x067b
            int r2 = r3.zzb()     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x0648
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "Engagement event does not contain any parameters. appId"
            com.google.android.gms.internal.measurement.zzfw r7 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r7.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r7)     // Catch:{ all -> 0x0d57 }
            r2.zzb(r4, r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x067b
        L_0x0648:
            com.google.android.gms.measurement.internal.zzkp r2 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r2 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r2 = (com.google.android.gms.internal.measurement.zzfo) r2     // Catch:{ all -> 0x0d57 }
            java.lang.Object r2 = com.google.android.gms.measurement.internal.zzkp.zzB(r2, r10)     // Catch:{ all -> 0x0d57 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0d57 }
            if (r2 != 0) goto L_0x0673
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "Engagement event does not include duration. appId"
            com.google.android.gms.internal.measurement.zzfw r7 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r7.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r7)     // Catch:{ all -> 0x0d57 }
            r2.zzb(r4, r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x067b
        L_0x0673:
            long r9 = r2.longValue()     // Catch:{ all -> 0x0d57 }
            long r9 = r31 + r9
            r31 = r9
        L_0x067b:
            java.util.List<com.google.android.gms.internal.measurement.zzfo> r2 = r6.zzc     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r4 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r4 = (com.google.android.gms.internal.measurement.zzfo) r4     // Catch:{ all -> 0x0d57 }
            r7 = r28
            r2.set(r7, r4)     // Catch:{ all -> 0x0d57 }
            int r17 = r17 + 1
            r5.zzf(r3)     // Catch:{ all -> 0x0d57 }
            r10 = r12
        L_0x068e:
            int r13 = r7 + 1
            r7 = r5
            r3 = r11
            r2 = r14
            r9 = r16
            r4 = r23
            r5 = r30
            r15 = r31
            r14 = 0
            goto L_0x005a
        L_0x069e:
            r5 = r7
            r10 = r14
            r31 = r15
            r16 = r9
            if (r16 == 0) goto L_0x06ff
            r3 = r17
            r15 = r31
            r2 = 0
        L_0x06ab:
            if (r2 >= r3) goto L_0x06fd
            com.google.android.gms.internal.measurement.zzfo r7 = r5.zzd(r2)     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = r7.zzd()     // Catch:{ all -> 0x0d57 }
            boolean r8 = r4.equals(r8)     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x06ce
            com.google.android.gms.measurement.internal.zzkp r8 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r8)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r8 = com.google.android.gms.measurement.internal.zzkp.zzA(r7, r12)     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x06ce
            r5.zzi(r2)     // Catch:{ all -> 0x0d57 }
            int r3 = r3 + -1
            int r2 = r2 + -1
            goto L_0x06fa
        L_0x06ce:
            com.google.android.gms.measurement.internal.zzkp r8 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r8)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r7 = com.google.android.gms.measurement.internal.zzkp.zzA(r7, r10)     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x06fa
            boolean r8 = r7.zze()     // Catch:{ all -> 0x0d57 }
            if (r8 == 0) goto L_0x06e8
            long r7 = r7.zzf()     // Catch:{ all -> 0x0d57 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x06e9
        L_0x06e8:
            r7 = 0
        L_0x06e9:
            if (r7 == 0) goto L_0x06fa
            long r8 = r7.longValue()     // Catch:{ all -> 0x0d57 }
            r13 = 0
            int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x06fa
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d57 }
            long r15 = r15 + r7
        L_0x06fa:
            r7 = 1
            int r2 = r2 + r7
            goto L_0x06ab
        L_0x06fd:
            r2 = r15
            goto L_0x0701
        L_0x06ff:
            r2 = r31
        L_0x0701:
            r4 = 0
            r1.zzab(r5, r2, r4)     // Catch:{ all -> 0x0d57 }
            java.util.List r4 = r5.zzb()     // Catch:{ all -> 0x0d57 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0d57 }
        L_0x070d:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = "_se"
            if (r7 == 0) goto L_0x0733
            java.lang.String r7 = "_s"
            java.lang.Object r9 = r4.next()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r9.zzd()     // Catch:{ all -> 0x0d57 }
            boolean r7 = r7.equals(r9)     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x070d
            com.google.android.gms.measurement.internal.zzai r4 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r4)     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r5.zzG()     // Catch:{ all -> 0x0d57 }
            r4.zzi(r7, r8)     // Catch:{ all -> 0x0d57 }
        L_0x0733:
            java.lang.String r4 = "_sid"
            int r4 = com.google.android.gms.measurement.internal.zzkp.zzu(r5, r4)     // Catch:{ all -> 0x0d57 }
            if (r4 < 0) goto L_0x0740
            r4 = 1
            r1.zzab(r5, r2, r4)     // Catch:{ all -> 0x0d57 }
            goto L_0x0760
        L_0x0740:
            int r2 = com.google.android.gms.measurement.internal.zzkp.zzu(r5, r8)     // Catch:{ all -> 0x0d57 }
            if (r2 < 0) goto L_0x0760
            r5.zzq(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r2 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0d57 }
            java.lang.String r3 = "Session engagement user property is in the bundle without session ID. appId"
            com.google.android.gms.internal.measurement.zzfw r4 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = r4.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r4)     // Catch:{ all -> 0x0d57 }
            r2.zzb(r3, r4)     // Catch:{ all -> 0x0d57 }
        L_0x0760:
            com.google.android.gms.measurement.internal.zzkp r2 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfu r3 = r2.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "Checking account type status for ad personalization signals"
            r3.zza(r4)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkn r3 = r2.zzf     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfl r3 = r3.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r3)     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = r5.zzG()     // Catch:{ all -> 0x0d57 }
            boolean r3 = r3.zzf(r4)     // Catch:{ all -> 0x0d57 }
            if (r3 == 0) goto L_0x07f7
            com.google.android.gms.measurement.internal.zzkn r3 = r2.zzf     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r3 = r3.zze     // Catch:{ all -> 0x0d57 }
            zzak(r3)     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = r5.zzG()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzg r3 = r3.zzs(r4)     // Catch:{ all -> 0x0d57 }
            if (r3 == 0) goto L_0x07f7
            boolean r3 = r3.zzaf()     // Catch:{ all -> 0x0d57 }
            if (r3 == 0) goto L_0x07f7
            com.google.android.gms.measurement.internal.zzfu r3 = r2.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzam r3 = r3.zzz()     // Catch:{ all -> 0x0d57 }
            boolean r3 = r3.zzf()     // Catch:{ all -> 0x0d57 }
            if (r3 == 0) goto L_0x07f7
            com.google.android.gms.measurement.internal.zzfu r3 = r2.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzj()     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "Turning off ad personalization due to account type"
            r3.zza(r4)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzgg r3 = com.google.android.gms.internal.measurement.zzgh.zzj()     // Catch:{ all -> 0x0d57 }
            r4 = r23
            r3.zzb(r4)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzam r2 = r2.zzz()     // Catch:{ all -> 0x0d57 }
            long r7 = r2.zzd()     // Catch:{ all -> 0x0d57 }
            r3.zza(r7)     // Catch:{ all -> 0x0d57 }
            r7 = 1
            r3.zze(r7)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r2 = r3.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzgh r2 = (com.google.android.gms.internal.measurement.zzgh) r2     // Catch:{ all -> 0x0d57 }
            r3 = 0
        L_0x07d9:
            int r7 = r5.zzk()     // Catch:{ all -> 0x0d57 }
            if (r3 >= r7) goto L_0x07f4
            com.google.android.gms.internal.measurement.zzgh r7 = r5.zzl(r3)     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r7.zzc()     // Catch:{ all -> 0x0d57 }
            boolean r7 = r4.equals(r7)     // Catch:{ all -> 0x0d57 }
            if (r7 == 0) goto L_0x07f1
            r5.zzm(r3, r2)     // Catch:{ all -> 0x0d57 }
            goto L_0x07f7
        L_0x07f1:
            int r3 = r3 + 1
            goto L_0x07d9
        L_0x07f4:
            r5.zzn(r2)     // Catch:{ all -> 0x0d57 }
        L_0x07f7:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5.zzt(r2)     // Catch:{ all -> 0x0d57 }
            r2 = -9223372036854775808
            r5.zzv(r2)     // Catch:{ all -> 0x0d57 }
            r2 = 0
        L_0x0805:
            int r3 = r5.zzc()     // Catch:{ all -> 0x0d57 }
            if (r2 >= r3) goto L_0x0838
            com.google.android.gms.internal.measurement.zzfo r3 = r5.zzd(r2)     // Catch:{ all -> 0x0d57 }
            long r7 = r3.zzf()     // Catch:{ all -> 0x0d57 }
            long r9 = r5.zzs()     // Catch:{ all -> 0x0d57 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0822
            long r7 = r3.zzf()     // Catch:{ all -> 0x0d57 }
            r5.zzt(r7)     // Catch:{ all -> 0x0d57 }
        L_0x0822:
            long r7 = r3.zzf()     // Catch:{ all -> 0x0d57 }
            long r9 = r5.zzu()     // Catch:{ all -> 0x0d57 }
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x0835
            long r3 = r3.zzf()     // Catch:{ all -> 0x0d57 }
            r5.zzv(r3)     // Catch:{ all -> 0x0d57 }
        L_0x0835:
            int r2 = r2 + 1
            goto L_0x0805
        L_0x0838:
            r5.zzac()     // Catch:{ all -> 0x0d57 }
            r5.zzZ()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzy r7 = r1.zzh     // Catch:{ all -> 0x0d57 }
            zzak(r7)     // Catch:{ all -> 0x0d57 }
            java.lang.String r8 = r5.zzG()     // Catch:{ all -> 0x0d57 }
            java.util.List r9 = r5.zzb()     // Catch:{ all -> 0x0d57 }
            java.util.List r10 = r5.zzj()     // Catch:{ all -> 0x0d57 }
            long r2 = r5.zzs()     // Catch:{ all -> 0x0d57 }
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d57 }
            long r2 = r5.zzu()     // Catch:{ all -> 0x0d57 }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0d57 }
            java.util.List r2 = r7.zzb(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0d57 }
            r5.zzY(r2)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzae r2 = r45.zzd()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r3 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r3 = r3.zzA()     // Catch:{ all -> 0x0d57 }
            boolean r2 = r2.zzx(r3)     // Catch:{ all -> 0x0d57 }
            if (r2 == 0) goto L_0x0bb1
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d57 }
            r2.<init>()     // Catch:{ all -> 0x0d57 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0d57 }
            r3.<init>()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzku r4 = r45.zzq()     // Catch:{ all -> 0x0d57 }
            java.security.SecureRandom r4 = r4.zzf()     // Catch:{ all -> 0x0d57 }
            r7 = 0
        L_0x0889:
            int r8 = r5.zzc()     // Catch:{ all -> 0x0d57 }
            if (r7 >= r8) goto L_0x0b78
            com.google.android.gms.internal.measurement.zzfo r8 = r5.zzd(r7)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzjz r8 = r8.zzbu()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfn r8 = (com.google.android.gms.internal.measurement.zzfn) r8     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = "_ep"
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d57 }
            java.lang.String r10 = "_sr"
            if (r9 == 0) goto L_0x0929
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = "_en"
            java.lang.Object r9 = com.google.android.gms.measurement.internal.zzkp.zzB(r9, r11)     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0d57 }
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r11 = (com.google.android.gms.measurement.internal.zzao) r11     // Catch:{ all -> 0x0d57 }
            if (r11 != 0) goto L_0x08dc
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r12 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = r12.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r13 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r11 = r11.zzf(r12, r13)     // Catch:{ all -> 0x0d57 }
            if (r11 == 0) goto L_0x08dc
            r2.put(r9, r11)     // Catch:{ all -> 0x0d57 }
        L_0x08dc:
            if (r11 == 0) goto L_0x091d
            java.lang.Long r9 = r11.zzi     // Catch:{ all -> 0x0d57 }
            if (r9 != 0) goto L_0x091d
            java.lang.Long r9 = r11.zzj     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x08fa
            long r12 = r9.longValue()     // Catch:{ all -> 0x0d57 }
            r14 = 1
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto L_0x08fa
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.Long r9 = r11.zzj     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r8, r10, r9)     // Catch:{ all -> 0x0d57 }
        L_0x08fa:
            java.lang.Boolean r9 = r11.zzk     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x0914
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x0914
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = "_efs"
            r10 = 1
            java.lang.Long r12 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r8, r9, r12)     // Catch:{ all -> 0x0d57 }
        L_0x0914:
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r3.add(r9)     // Catch:{ all -> 0x0d57 }
        L_0x091d:
            r5.zze(r7, r8)     // Catch:{ all -> 0x0d57 }
        L_0x0920:
            r16 = r4
            r4 = r5
            r20 = r6
            r5 = 1
            goto L_0x0b6f
        L_0x0929:
            com.google.android.gms.measurement.internal.zzfl r9 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r11 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = r11.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = "measurement.account.time_zone_offset_minutes"
            java.lang.String r12 = r9.zza(r11, r12)     // Catch:{ all -> 0x0d57 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d57 }
            if (r13 != 0) goto L_0x095a
            long r11 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x0945 }
            goto L_0x095c
        L_0x0945:
            r0 = move-exception
            r12 = r0
            com.google.android.gms.measurement.internal.zzfu r9 = r9.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r9 = r9.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = "Unable to parse timezone offset. appId"
            java.lang.Object r11 = com.google.android.gms.measurement.internal.zzem.zzl(r11)     // Catch:{ all -> 0x0d57 }
            r9.zzc(r13, r11, r12)     // Catch:{ all -> 0x0d57 }
        L_0x095a:
            r11 = 0
        L_0x095c:
            com.google.android.gms.measurement.internal.zzku r9 = r45.zzq()     // Catch:{ all -> 0x0d57 }
            long r13 = r8.zzn()     // Catch:{ all -> 0x0d57 }
            long r13 = r9.zzab(r13, r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r17 = r11
            r15 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = "_dbg"
            boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0d57 }
            if (r15 != 0) goto L_0x09b2
            java.util.List r9 = r9.zza()     // Catch:{ all -> 0x0d57 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0d57 }
        L_0x0986:
            boolean r15 = r9.hasNext()     // Catch:{ all -> 0x0d57 }
            if (r15 == 0) goto L_0x09b2
            java.lang.Object r15 = r9.next()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfs r15 = (com.google.android.gms.internal.measurement.zzfs) r15     // Catch:{ all -> 0x0d57 }
            r16 = r9
            java.lang.String r9 = r15.zzb()     // Catch:{ all -> 0x0d57 }
            boolean r9 = r12.equals(r9)     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x09af
            long r15 = r15.zzf()     // Catch:{ all -> 0x0d57 }
            java.lang.Long r9 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0d57 }
            boolean r9 = r11.equals(r9)     // Catch:{ all -> 0x0d57 }
            if (r9 != 0) goto L_0x09ad
            goto L_0x09b2
        L_0x09ad:
            r9 = 1
            goto L_0x09c5
        L_0x09af:
            r9 = r16
            goto L_0x0986
        L_0x09b2:
            com.google.android.gms.measurement.internal.zzfl r9 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r11 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = r11.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            int r9 = r9.zzl(r11, r12)     // Catch:{ all -> 0x0d57 }
        L_0x09c5:
            if (r9 > 0) goto L_0x09ea
            com.google.android.gms.measurement.internal.zzem r10 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r10 = r10.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r11 = "Sample rate must be positive. event, rate"
            java.lang.String r12 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0d57 }
            r10.zzc(r11, r12, r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r3.add(r9)     // Catch:{ all -> 0x0d57 }
            r5.zze(r7, r8)     // Catch:{ all -> 0x0d57 }
            goto L_0x0920
        L_0x09ea:
            java.lang.String r11 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r11 = r2.get(r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r11 = (com.google.android.gms.measurement.internal.zzao) r11     // Catch:{ all -> 0x0d57 }
            if (r11 != 0) goto L_0x0a4a
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r12 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = r12.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r15 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r11 = r11.zzf(r12, r15)     // Catch:{ all -> 0x0d57 }
            if (r11 != 0) goto L_0x0a4a
            com.google.android.gms.measurement.internal.zzem r11 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r11 = r11.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r12 = "Event being bundled has no eventAggregate. appId, eventName"
            com.google.android.gms.internal.measurement.zzfw r15 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r15 = r15.zzA()     // Catch:{ all -> 0x0d57 }
            r20 = r13
            java.lang.String r13 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            r11.zzc(r12, r15, r13)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r11 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r12 = r6.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r29 = r12.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.String r30 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            r31 = 1
            r33 = 1
            r35 = 1
            long r37 = r8.zzn()     // Catch:{ all -> 0x0d57 }
            r39 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r11
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r41, r42, r43, r44)     // Catch:{ all -> 0x0d57 }
            goto L_0x0a4c
        L_0x0a4a:
            r20 = r13
        L_0x0a4c:
            com.google.android.gms.measurement.internal.zzkp r12 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r12)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r12 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r12 = (com.google.android.gms.internal.measurement.zzfo) r12     // Catch:{ all -> 0x0d57 }
            java.lang.String r13 = "_eid"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzkp.zzB(r12, r13)     // Catch:{ all -> 0x0d57 }
            java.lang.Long r12 = (java.lang.Long) r12     // Catch:{ all -> 0x0d57 }
            if (r12 == 0) goto L_0x0a63
            r13 = 1
            goto L_0x0a64
        L_0x0a63:
            r13 = 0
        L_0x0a64:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0d57 }
            r14 = 1
            if (r9 != r14) goto L_0x0a97
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r3.add(r9)     // Catch:{ all -> 0x0d57 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x0a92
            java.lang.Long r9 = r11.zzi     // Catch:{ all -> 0x0d57 }
            if (r9 != 0) goto L_0x0a86
            java.lang.Long r9 = r11.zzj     // Catch:{ all -> 0x0d57 }
            if (r9 != 0) goto L_0x0a86
            java.lang.Boolean r9 = r11.zzk     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x0a92
        L_0x0a86:
            r9 = 0
            com.google.android.gms.measurement.internal.zzao r10 = r11.zzc(r9, r9, r9)     // Catch:{ all -> 0x0d57 }
            java.lang.String r9 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d57 }
        L_0x0a92:
            r5.zze(r7, r8)     // Catch:{ all -> 0x0d57 }
            goto L_0x0920
        L_0x0a97:
            int r14 = r4.nextInt(r9)     // Catch:{ all -> 0x0d57 }
            if (r14 != 0) goto L_0x0ad8
            com.google.android.gms.measurement.internal.zzkp r12 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r12)     // Catch:{ all -> 0x0d57 }
            long r14 = (long) r9     // Catch:{ all -> 0x0d57 }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r8, r10, r9)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r10 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r10 = (com.google.android.gms.internal.measurement.zzfo) r10     // Catch:{ all -> 0x0d57 }
            r3.add(r10)     // Catch:{ all -> 0x0d57 }
            boolean r10 = r13.booleanValue()     // Catch:{ all -> 0x0d57 }
            if (r10 == 0) goto L_0x0abe
            r10 = 0
            com.google.android.gms.measurement.internal.zzao r11 = r11.zzc(r10, r9, r10)     // Catch:{ all -> 0x0d57 }
        L_0x0abe:
            java.lang.String r9 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            long r12 = r8.zzn()     // Catch:{ all -> 0x0d57 }
            r14 = r20
            com.google.android.gms.measurement.internal.zzao r10 = r11.zzb(r12, r14)     // Catch:{ all -> 0x0d57 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0d57 }
            r16 = r4
            r4 = r5
            r20 = r6
            r5 = 1
            goto L_0x0b6c
        L_0x0ad8:
            r16 = r4
            r14 = r20
            java.lang.Long r4 = r11.zzh     // Catch:{ all -> 0x0d57 }
            if (r4 == 0) goto L_0x0aed
            long r17 = r4.longValue()     // Catch:{ all -> 0x0d57 }
            r33 = r5
            r20 = r6
            r23 = r11
            r21 = r12
            goto L_0x0b03
        L_0x0aed:
            com.google.android.gms.measurement.internal.zzku r4 = r45.zzq()     // Catch:{ all -> 0x0d57 }
            r33 = r5
            r20 = r6
            long r5 = r8.zzp()     // Catch:{ all -> 0x0d57 }
            r23 = r11
            r21 = r12
            r11 = r17
            long r17 = r4.zzab(r5, r11)     // Catch:{ all -> 0x0d57 }
        L_0x0b03:
            int r4 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r4 == 0) goto L_0x0b52
            com.google.android.gms.measurement.internal.zzkp r4 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r4)     // Catch:{ all -> 0x0d57 }
            java.lang.String r4 = "_efs"
            r5 = 1
            java.lang.Long r11 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r8, r4, r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp r4 = r1.zzi     // Catch:{ all -> 0x0d57 }
            zzak(r4)     // Catch:{ all -> 0x0d57 }
            long r11 = (long) r9     // Catch:{ all -> 0x0d57 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzkp.zzy(r8, r10, r4)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r9 = r8.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfo r9 = (com.google.android.gms.internal.measurement.zzfo) r9     // Catch:{ all -> 0x0d57 }
            r3.add(r9)     // Catch:{ all -> 0x0d57 }
            boolean r9 = r13.booleanValue()     // Catch:{ all -> 0x0d57 }
            if (r9 == 0) goto L_0x0b40
            r9 = 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x0d57 }
            r11 = r23
            r9 = 0
            com.google.android.gms.measurement.internal.zzao r11 = r11.zzc(r9, r4, r10)     // Catch:{ all -> 0x0d57 }
            goto L_0x0b42
        L_0x0b40:
            r11 = r23
        L_0x0b42:
            java.lang.String r4 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            long r9 = r8.zzn()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r9 = r11.zzb(r9, r14)     // Catch:{ all -> 0x0d57 }
            r2.put(r4, r9)     // Catch:{ all -> 0x0d57 }
            goto L_0x0b6a
        L_0x0b52:
            r11 = r23
            r5 = 1
            boolean r4 = r13.booleanValue()     // Catch:{ all -> 0x0d57 }
            if (r4 == 0) goto L_0x0b6a
            java.lang.String r4 = r8.zzk()     // Catch:{ all -> 0x0d57 }
            r12 = r21
            r9 = 0
            com.google.android.gms.measurement.internal.zzao r10 = r11.zzc(r12, r9, r9)     // Catch:{ all -> 0x0d57 }
            r2.put(r4, r10)     // Catch:{ all -> 0x0d57 }
        L_0x0b6a:
            r4 = r33
        L_0x0b6c:
            r4.zze(r7, r8)     // Catch:{ all -> 0x0d57 }
        L_0x0b6f:
            int r7 = r7 + 1
            r5 = r4
            r4 = r16
            r6 = r20
            goto L_0x0889
        L_0x0b78:
            r4 = r5
            r20 = r6
            int r5 = r3.size()     // Catch:{ all -> 0x0d57 }
            int r6 = r4.zzc()     // Catch:{ all -> 0x0d57 }
            if (r5 >= r6) goto L_0x0b8b
            r4.zzh()     // Catch:{ all -> 0x0d57 }
            r4.zzg(r3)     // Catch:{ all -> 0x0d57 }
        L_0x0b8b:
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0d57 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0d57 }
        L_0x0b93:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0d57 }
            if (r3 == 0) goto L_0x0bae
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0d57 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r5 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r5)     // Catch:{ all -> 0x0d57 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzao r3 = (com.google.android.gms.measurement.internal.zzao) r3     // Catch:{ all -> 0x0d57 }
            r5.zzh(r3)     // Catch:{ all -> 0x0d57 }
            goto L_0x0b93
        L_0x0bae:
            r2 = r20
            goto L_0x0bb3
        L_0x0bb1:
            r4 = r5
            r2 = r6
        L_0x0bb3:
            com.google.android.gms.internal.measurement.zzfw r3 = r2.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r3 = r3.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r5 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r5)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzg r5 = r5.zzs(r3)     // Catch:{ all -> 0x0d57 }
            if (r5 != 0) goto L_0x0bdc
            com.google.android.gms.measurement.internal.zzem r5 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zzb()     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            com.google.android.gms.internal.measurement.zzfw r7 = r2.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r7.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r7)     // Catch:{ all -> 0x0d57 }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d57 }
            goto L_0x0c38
        L_0x0bdc:
            int r6 = r4.zzc()     // Catch:{ all -> 0x0d57 }
            if (r6 <= 0) goto L_0x0c38
            long r6 = r5.zzr()     // Catch:{ all -> 0x0d57 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0bf0
            r4.zzy(r6)     // Catch:{ all -> 0x0d57 }
            goto L_0x0bf3
        L_0x0bf0:
            r4.zzz()     // Catch:{ all -> 0x0d57 }
        L_0x0bf3:
            long r8 = r5.zzp()     // Catch:{ all -> 0x0d57 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0bfe
            goto L_0x0bff
        L_0x0bfe:
            r6 = r8
        L_0x0bff:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c07
            r4.zzw(r6)     // Catch:{ all -> 0x0d57 }
            goto L_0x0c0a
        L_0x0c07:
            r4.zzx()     // Catch:{ all -> 0x0d57 }
        L_0x0c0a:
            r5.zzN()     // Catch:{ all -> 0x0d57 }
            long r6 = r5.zzI()     // Catch:{ all -> 0x0d57 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d57 }
            r4.zzS(r7)     // Catch:{ all -> 0x0d57 }
            long r6 = r4.zzs()     // Catch:{ all -> 0x0d57 }
            r5.zzq(r6)     // Catch:{ all -> 0x0d57 }
            long r6 = r4.zzu()     // Catch:{ all -> 0x0d57 }
            r5.zzs(r6)     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = r5.zzab()     // Catch:{ all -> 0x0d57 }
            if (r6 == 0) goto L_0x0c2d
            r4.zzT(r6)     // Catch:{ all -> 0x0d57 }
            goto L_0x0c30
        L_0x0c2d:
            r4.zzU()     // Catch:{ all -> 0x0d57 }
        L_0x0c30:
            com.google.android.gms.measurement.internal.zzai r6 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r6)     // Catch:{ all -> 0x0d57 }
            r6.zzt(r5)     // Catch:{ all -> 0x0d57 }
        L_0x0c38:
            int r5 = r4.zzc()     // Catch:{ all -> 0x0d57 }
            if (r5 <= 0) goto L_0x0c9c
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzm     // Catch:{ all -> 0x0d57 }
            r5.zzat()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzfl r5 = r1.zzc     // Catch:{ all -> 0x0d57 }
            zzak(r5)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r6 = r2.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = r6.zzA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfc r5 = r5.zzb(r6)     // Catch:{ all -> 0x0d57 }
            if (r5 == 0) goto L_0x0c63
            boolean r6 = r5.zza()     // Catch:{ all -> 0x0d57 }
            if (r6 != 0) goto L_0x0c5b
            goto L_0x0c63
        L_0x0c5b:
            long r5 = r5.zzb()     // Catch:{ all -> 0x0d57 }
            r4.zzad(r5)     // Catch:{ all -> 0x0d57 }
            goto L_0x0c8c
        L_0x0c63:
            com.google.android.gms.internal.measurement.zzfw r5 = r2.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r5 = r5.zzP()     // Catch:{ all -> 0x0d57 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0d57 }
            if (r5 == 0) goto L_0x0c75
            r5 = -1
            r4.zzad(r5)     // Catch:{ all -> 0x0d57 }
            goto L_0x0c8c
        L_0x0c75:
            com.google.android.gms.measurement.internal.zzem r5 = r45.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r5 = r5.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            com.google.android.gms.internal.measurement.zzfw r7 = r2.zza     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = r7.zzA()     // Catch:{ all -> 0x0d57 }
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r7)     // Catch:{ all -> 0x0d57 }
            r5.zzb(r6, r7)     // Catch:{ all -> 0x0d57 }
        L_0x0c8c:
            com.google.android.gms.measurement.internal.zzai r5 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r5)     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzkd r4 = r4.zzaA()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.internal.measurement.zzfw r4 = (com.google.android.gms.internal.measurement.zzfw) r4     // Catch:{ all -> 0x0d57 }
            r8 = r19
            r5.zzx(r4, r8)     // Catch:{ all -> 0x0d57 }
        L_0x0c9c:
            com.google.android.gms.measurement.internal.zzai r4 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r4)     // Catch:{ all -> 0x0d57 }
            java.util.List<java.lang.Long> r2 = r2.zzb     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch:{ all -> 0x0d57 }
            r4.zzg()     // Catch:{ all -> 0x0d57 }
            r4.zzZ()     // Catch:{ all -> 0x0d57 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = "rowid in ("
            r5.<init>(r6)     // Catch:{ all -> 0x0d57 }
            r6 = 0
        L_0x0cb4:
            int r7 = r2.size()     // Catch:{ all -> 0x0d57 }
            if (r6 >= r7) goto L_0x0cd1
            if (r6 == 0) goto L_0x0cc1
            java.lang.String r7 = ","
            r5.append(r7)     // Catch:{ all -> 0x0d57 }
        L_0x0cc1:
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0d57 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d57 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d57 }
            r5.append(r7)     // Catch:{ all -> 0x0d57 }
            int r6 = r6 + 1
            goto L_0x0cb4
        L_0x0cd1:
            java.lang.String r6 = ")"
            r5.append(r6)     // Catch:{ all -> 0x0d57 }
            android.database.sqlite.SQLiteDatabase r6 = r4.zze()     // Catch:{ all -> 0x0d57 }
            java.lang.String r7 = "raw_events"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0d57 }
            r8 = 0
            int r5 = r6.delete(r7, r5, r8)     // Catch:{ all -> 0x0d57 }
            int r6 = r2.size()     // Catch:{ all -> 0x0d57 }
            if (r5 == r6) goto L_0x0d06
            com.google.android.gms.measurement.internal.zzfu r4 = r4.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r4 = r4.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r4 = r4.zzb()     // Catch:{ all -> 0x0d57 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0d57 }
            int r2 = r2.size()     // Catch:{ all -> 0x0d57 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0d57 }
            r4.zzc(r6, r5, r2)     // Catch:{ all -> 0x0d57 }
        L_0x0d06:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            android.database.sqlite.SQLiteDatabase r4 = r2.zze()     // Catch:{ all -> 0x0d57 }
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x0d1e }
            r6 = 0
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d1e }
            r6 = 1
            r5[r6] = r3     // Catch:{ SQLiteException -> 0x0d1e }
            java.lang.String r6 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r4.execSQL(r6, r5)     // Catch:{ SQLiteException -> 0x0d1e }
            goto L_0x0d33
        L_0x0d1e:
            r0 = move-exception
            r4 = r0
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0d57 }
            java.lang.String r5 = "Failed to remove unused event metadata. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzem.zzl(r3)     // Catch:{ all -> 0x0d57 }
            r2.zzc(r5, r3, r4)     // Catch:{ all -> 0x0d57 }
        L_0x0d33:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            r2.zzc()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            r2 = 1
            return r2
        L_0x0d45:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0d57 }
            zzak(r2)     // Catch:{ all -> 0x0d57 }
            r2.zzc()     // Catch:{ all -> 0x0d57 }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            r2 = 0
            return r2
        L_0x0d57:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzai r3 = r1.zze
            zzak(r3)
            r3.zzd()
            goto L_0x0d63
        L_0x0d62:
            throw r2
        L_0x0d63:
            goto L_0x0d62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzaa(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    private final void zzab(zzfv zzfv, long j, boolean z) {
        zzks zzks;
        String str = true != z ? "_lte" : "_se";
        zzai zzai = this.zze;
        zzak(zzai);
        zzks zzk2 = zzai.zzk(zzfv.zzG(), str);
        if (zzk2 == null || zzk2.zze == null) {
            zzks = new zzks(zzfv.zzG(), "auto", str, zzay().currentTimeMillis(), Long.valueOf(j));
        } else {
            zzks = new zzks(zzfv.zzG(), "auto", str, zzay().currentTimeMillis(), Long.valueOf(((Long) zzk2.zze).longValue() + j));
        }
        zzgg zzj2 = zzgh.zzj();
        zzj2.zzb(str);
        zzj2.zza(zzay().currentTimeMillis());
        zzj2.zze(((Long) zzks.zze).longValue());
        zzgh zzgh = (zzgh) zzj2.zzaA();
        int zzu2 = zzkp.zzu(zzfv, str);
        if (zzu2 >= 0) {
            zzfv.zzm(zzu2, zzgh);
        } else {
            zzfv.zzn(zzgh);
        }
        if (j > 0) {
            zzai zzai2 = this.zze;
            zzak(zzai2);
            zzai2.zzj(zzks);
            zzau().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", zzks.zze);
        }
    }

    private final boolean zzac(zzfn zzfn, zzfn zzfn2) {
        String str;
        Preconditions.checkArgument("_e".equals(zzfn.zzk()));
        zzak(this.zzi);
        zzfs zzA2 = zzkp.zzA((zzfo) zzfn.zzaA(), "_sc");
        String str2 = null;
        if (zzA2 == null) {
            str = null;
        } else {
            str = zzA2.zzd();
        }
        zzak(this.zzi);
        zzfs zzA3 = zzkp.zzA((zzfo) zzfn2.zzaA(), "_pc");
        if (zzA3 != null) {
            str2 = zzA3.zzd();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        zzad(zzfn, zzfn2);
        return true;
    }

    private final void zzad(zzfn zzfn, zzfn zzfn2) {
        Preconditions.checkArgument("_e".equals(zzfn.zzk()));
        zzak(this.zzi);
        zzfs zzA2 = zzkp.zzA((zzfo) zzfn.zzaA(), "_et");
        if (zzA2 != null && zzA2.zze() && zzA2.zzf() > 0) {
            long zzf2 = zzA2.zzf();
            zzak(this.zzi);
            zzfs zzA3 = zzkp.zzA((zzfo) zzfn2.zzaA(), "_et");
            if (zzA3 != null && zzA3.zzf() > 0) {
                zzf2 += zzA3.zzf();
            }
            zzak(this.zzi);
            zzkp.zzy(zzfn2, "_et", Long.valueOf(zzf2));
            zzak(this.zzi);
            zzkp.zzy(zzfn, "_fr", 1L);
        }
    }

    private final boolean zzae() {
        zzav().zzg();
        zzr();
        zzai zzai = this.zze;
        zzak(zzai);
        if (zzai.zzG()) {
            return true;
        }
        zzai zzai2 = this.zze;
        zzak(zzai2);
        return !TextUtils.isEmpty(zzai2.zzy());
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0238  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaf() {
        /*
            r20 = this;
            r0 = r20
            com.google.android.gms.measurement.internal.zzfr r1 = r20.zzav()
            r1.zzg()
            r20.zzr()
            long r1 = r0.zza
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004e
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            com.google.android.gms.common.util.Clock r5 = r20.zzay()
            long r5 = r5.elapsedRealtime()
            long r7 = r0.zza
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)
            long r1 = r1 - r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x004c
            com.google.android.gms.measurement.internal.zzem r3 = r20.zzau()
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzk()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r3.zzb(r2, r1)
            com.google.android.gms.measurement.internal.zzeu r1 = r20.zzj()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkc r1 = r0.zzg
            zzak(r1)
            r1.zzd()
            return
        L_0x004c:
            r0.zza = r3
        L_0x004e:
            com.google.android.gms.measurement.internal.zzfu r1 = r0.zzm
            boolean r1 = r1.zzL()
            if (r1 == 0) goto L_0x0255
            boolean r1 = r20.zzae()
            if (r1 != 0) goto L_0x005e
            goto L_0x0255
        L_0x005e:
            com.google.android.gms.common.util.Clock r1 = r20.zzay()
            long r1 = r1.currentTimeMillis()
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzz
            r6 = 0
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r7 = r5.longValue()
            long r7 = java.lang.Math.max(r3, r7)
            com.google.android.gms.measurement.internal.zzai r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzH()
            r10 = 1
            if (r5 != 0) goto L_0x0093
            com.google.android.gms.measurement.internal.zzai r5 = r0.zze
            zzak(r5)
            boolean r5 = r5.zzz()
            if (r5 == 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            if (r10 == 0) goto L_0x00d3
            com.google.android.gms.measurement.internal.zzae r5 = r20.zzd()
            java.lang.String r5 = r5.zzu()
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = ".none."
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L_0x00bf
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzu
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00bf:
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzt
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            goto L_0x00e6
        L_0x00d3:
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzs
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r11 = r5.longValue()
            long r11 = java.lang.Math.max(r3, r11)
        L_0x00e6:
            com.google.android.gms.measurement.internal.zzjl r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzc
            long r13 = r5.zza()
            com.google.android.gms.measurement.internal.zzjl r5 = r0.zzk
            com.google.android.gms.measurement.internal.zzey r5 = r5.zzd
            long r15 = r5.zza()
            com.google.android.gms.measurement.internal.zzai r5 = r0.zze
            zzak(r5)
            r17 = r10
            long r9 = r5.zzD()
            com.google.android.gms.measurement.internal.zzai r5 = r0.zze
            zzak(r5)
            r18 = r7
            long r6 = r5.zzF()
            long r5 = java.lang.Math.max(r9, r6)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0117
        L_0x0114:
            r7 = r3
            goto L_0x018f
        L_0x0117:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r13 = r13 - r1
            long r7 = java.lang.Math.abs(r13)
            long r15 = r15 - r1
            long r9 = java.lang.Math.abs(r15)
            long r9 = r1 - r9
            long r1 = r1 - r7
            long r1 = java.lang.Math.max(r1, r9)
            long r7 = r5 + r18
            if (r17 == 0) goto L_0x013c
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x013c
            long r7 = java.lang.Math.min(r5, r1)
            long r7 = r7 + r11
        L_0x013c:
            com.google.android.gms.measurement.internal.zzkp r13 = r0.zzi
            zzak(r13)
            boolean r13 = r13.zzq(r1, r11)
            if (r13 != 0) goto L_0x0149
            long r7 = r1 + r11
        L_0x0149:
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018f
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018f
            r1 = 0
        L_0x0152:
            r20.zzd()
            r2 = 20
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r5 = com.google.android.gms.measurement.internal.zzea.zzB
            r6 = 0
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r11 = 0
            int r5 = java.lang.Math.max(r11, r5)
            int r2 = java.lang.Math.min(r2, r5)
            if (r1 >= r2) goto L_0x0114
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r2 = com.google.android.gms.measurement.internal.zzea.zzA
            java.lang.Object r2 = r2.zzb(r6)
            java.lang.Long r2 = (java.lang.Long) r2
            long r5 = r2.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            r12 = 1
            long r12 = r12 << r1
            long r5 = r5 * r12
            long r7 = r7 + r5
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x018f
            int r1 = r1 + 1
            goto L_0x0152
        L_0x018f:
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0238
            com.google.android.gms.measurement.internal.zzes r1 = r0.zzd
            zzak(r1)
            boolean r1 = r1.zzb()
            if (r1 == 0) goto L_0x021b
            com.google.android.gms.measurement.internal.zzjl r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzb
            long r1 = r1.zza()
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzq
            r6 = 0
            java.lang.Object r5 = r5.zzb(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            com.google.android.gms.measurement.internal.zzkp r9 = r0.zzi
            zzak(r9)
            boolean r9 = r9.zzq(r1, r5)
            if (r9 != 0) goto L_0x01ca
            long r1 = r1 + r5
            long r7 = java.lang.Math.max(r7, r1)
        L_0x01ca:
            com.google.android.gms.measurement.internal.zzeu r1 = r20.zzj()
            r1.zzb()
            com.google.android.gms.common.util.Clock r1 = r20.zzay()
            long r1 = r1.currentTimeMillis()
            long r7 = r7 - r1
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0201
            r20.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r1 = com.google.android.gms.measurement.internal.zzea.zzv
            r2 = 0
            java.lang.Object r1 = r1.zzb(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r7 = java.lang.Math.max(r3, r1)
            com.google.android.gms.measurement.internal.zzjl r1 = r0.zzk
            com.google.android.gms.measurement.internal.zzey r1 = r1.zzc
            com.google.android.gms.common.util.Clock r2 = r20.zzay()
            long r2 = r2.currentTimeMillis()
            r1.zzb(r2)
        L_0x0201:
            com.google.android.gms.measurement.internal.zzem r1 = r20.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.zzb(r3, r2)
            com.google.android.gms.measurement.internal.zzkc r1 = r0.zzg
            zzak(r1)
            r1.zzc(r7)
            return
        L_0x021b:
            com.google.android.gms.measurement.internal.zzem r1 = r20.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.String r2 = "No network"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzeu r1 = r20.zzj()
            r1.zza()
            com.google.android.gms.measurement.internal.zzkc r1 = r0.zzg
            zzak(r1)
            r1.zzd()
            return
        L_0x0238:
            com.google.android.gms.measurement.internal.zzem r1 = r20.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.String r2 = "Next upload time is 0"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzeu r1 = r20.zzj()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkc r1 = r0.zzg
            zzak(r1)
            r1.zzd()
            return
        L_0x0255:
            com.google.android.gms.measurement.internal.zzem r1 = r20.zzau()
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.zza(r2)
            com.google.android.gms.measurement.internal.zzeu r1 = r20.zzj()
            r1.zzb()
            com.google.android.gms.measurement.internal.zzkc r1 = r0.zzg
            zzak(r1)
            r1.zzd()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzaf():void");
    }

    @WorkerThread
    private final void zzag() {
        zzav().zzg();
        if (this.zzs || this.zzt || this.zzu) {
            zzau().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzs), Boolean.valueOf(this.zzt), Boolean.valueOf(this.zzu));
            return;
        }
        zzau().zzk().zza("Stopping uploading service(s)");
        List<Runnable> list = this.zzp;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            ((List) Preconditions.checkNotNull(this.zzp)).clear();
        }
    }

    @WorkerThread
    private final Boolean zzah(zzg zzg2) {
        try {
            if (zzg2.zzv() != -2147483648L) {
                if (zzg2.zzv() == ((long) Wrappers.packageManager(this.zzm.zzax()).getPackageInfo(zzg2.zzc(), 0).versionCode)) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzm.zzax()).getPackageInfo(zzg2.zzc(), 0).versionName;
                String zzt2 = zzg2.zzt();
                if (zzt2 != null && zzt2.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final zzp zzai(String str) {
        String str2 = str;
        zzai zzai = this.zze;
        zzak(zzai);
        zzg zzs2 = zzai.zzs(str2);
        if (zzs2 == null || TextUtils.isEmpty(zzs2.zzt())) {
            zzau().zzj().zzb("No app data available; dropping", str2);
            return null;
        }
        Boolean zzah = zzah(zzs2);
        if (zzah == null || zzah.booleanValue()) {
            String zzf2 = zzs2.zzf();
            String zzt2 = zzs2.zzt();
            long zzv2 = zzs2.zzv();
            String zzx2 = zzs2.zzx();
            long zzz2 = zzs2.zzz();
            long zzB2 = zzs2.zzB();
            boolean zzF = zzs2.zzF();
            String zzn2 = zzs2.zzn();
            long zzad = zzs2.zzad();
            boolean zzaf = zzs2.zzaf();
            String zzh2 = zzs2.zzh();
            Boolean zzah2 = zzs2.zzah();
            long zzD = zzs2.zzD();
            List<String> zzaj = zzs2.zzaj();
            zzov.zzb();
            return new zzp(str, zzf2, zzt2, zzv2, zzx2, zzz2, zzB2, (String) null, zzF, false, zzn2, zzad, 0, 0, zzaf, false, zzh2, zzah2, zzD, zzaj, zzd().zzn(str2, zzea.zzag) ? zzs2.zzj() : null, zzt(str).zzd());
        }
        zzau().zzb().zzb("App version does not match; dropping. appId", zzem.zzl(str));
        return null;
    }

    private final boolean zzaj(zzp zzp2) {
        zzov.zzb();
        return zzd().zzn(zzp2.zza, zzea.zzag) ? !TextUtils.isEmpty(zzp2.zzb) || !TextUtils.isEmpty(zzp2.zzu) || !TextUtils.isEmpty(zzp2.zzq) : !TextUtils.isEmpty(zzp2.zzb) || !TextUtils.isEmpty(zzp2.zzq);
    }

    private static final zzke zzak(zzke zzke) {
        if (zzke == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (zzke.zzY()) {
            return zzke;
        } else {
            String valueOf = String.valueOf(zzke.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final String zzA(zzaf zzaf) {
        if (!zzaf.zzh()) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzq().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:203|204) */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0217, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0218, code lost:
        r8.zzs.zzau().zzb().zzc("Failed to merge queued bundle. appId", com.google.android.gms.measurement.internal.zzem.zzl(r6), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        zzau().zzb().zzc("Failed to parse upload URL. Not uploading. appId", com.google.android.gms.measurement.internal.zzem.zzl(r6), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04c9, code lost:
        if (r3 != null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:?, code lost:
        r3.close();
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04d4, code lost:
        if (r3 != null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04ec, code lost:
        if (r3 != null) goto L_0x04cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04f3, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04f5, code lost:
        r0 = r1.zze;
        zzak(r0);
        r0 = r0.zzs(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04fe, code lost:
        if (r0 == null) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0500, code lost:
        zzD(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0108, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0112, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        if (r11 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1.zzz = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:203:0x046e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x029c A[SYNTHETIC, Splitter:B:146:0x029c] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a5 A[Catch:{ all -> 0x0130, all -> 0x0510 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0485 A[Catch:{ all -> 0x0130, all -> 0x0510 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x050c A[SYNTHETIC, Splitter:B:241:0x050c] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0134 A[Catch:{ all -> 0x0130, all -> 0x0510 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:194:0x03f0=Splitter:B:194:0x03f0, B:143:0x0283=Splitter:B:143:0x0283, B:48:0x010a=Splitter:B:48:0x010a, B:57:0x011b=Splitter:B:57:0x011b, B:218:0x04cb=Splitter:B:218:0x04cb, B:60:0x012d=Splitter:B:60:0x012d, B:231:0x04ef=Splitter:B:231:0x04ef} */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzB() {
        /*
            r22 = this;
            r1 = r22
            com.google.android.gms.measurement.internal.zzfr r0 = r22.zzav()
            r0.zzg()
            r22.zzr()
            r2 = 1
            r1.zzu = r2
            r3 = 0
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ all -> 0x0510 }
            r0.zzat()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzjk r0 = r0.zzy()     // Catch:{ all -> 0x0510 }
            java.lang.Boolean r0 = r0.zzC()     // Catch:{ all -> 0x0510 }
            if (r0 != 0) goto L_0x0034
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zze()     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.zza(r2)     // Catch:{ all -> 0x0510 }
            r1.zzu = r3
        L_0x0030:
            r22.zzag()
            return
        L_0x0034:
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x004a
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.zza(r2)     // Catch:{ all -> 0x0510 }
            r1.zzu = r3
            goto L_0x0030
        L_0x004a:
            long r4 = r1.zza     // Catch:{ all -> 0x0510 }
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0058
            r22.zzaf()     // Catch:{ all -> 0x0510 }
            r1.zzu = r3
            goto L_0x0030
        L_0x0058:
            com.google.android.gms.measurement.internal.zzfr r0 = r22.zzav()     // Catch:{ all -> 0x0510 }
            r0.zzg()     // Catch:{ all -> 0x0510 }
            java.util.List<java.lang.Long> r0 = r1.zzx     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0073
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.zza(r2)     // Catch:{ all -> 0x0510 }
            r1.zzu = r3
            goto L_0x0030
        L_0x0073:
            com.google.android.gms.measurement.internal.zzes r0 = r1.zzd     // Catch:{ all -> 0x0510 }
            zzak(r0)     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.zzb()     // Catch:{ all -> 0x0510 }
            if (r0 != 0) goto L_0x0091
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.zza(r2)     // Catch:{ all -> 0x0510 }
            r22.zzaf()     // Catch:{ all -> 0x0510 }
            r1.zzu = r3
            goto L_0x0030
        L_0x0091:
            com.google.android.gms.common.util.Clock r0 = r22.zzay()     // Catch:{ all -> 0x0510 }
            long r4 = r0.currentTimeMillis()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzae r0 = r22.zzd()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzea.zzP     // Catch:{ all -> 0x0510 }
            r9 = 0
            int r0 = r0.zzk(r9, r8)     // Catch:{ all -> 0x0510 }
            r22.zzd()     // Catch:{ all -> 0x0510 }
            long r10 = com.google.android.gms.measurement.internal.zzae.zzz()     // Catch:{ all -> 0x0510 }
            long r10 = r4 - r10
            r8 = 0
        L_0x00ae:
            if (r8 >= r0) goto L_0x00b9
            boolean r12 = r1.zzaa(r9, r10)     // Catch:{ all -> 0x0510 }
            if (r12 == 0) goto L_0x00b9
            int r8 = r8 + 1
            goto L_0x00ae
        L_0x00b9:
            com.google.android.gms.measurement.internal.zzjl r0 = r1.zzk     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzey r0 = r0.zzc     // Catch:{ all -> 0x0510 }
            long r10 = r0.zza()     // Catch:{ all -> 0x0510 }
            int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzj()     // Catch:{ all -> 0x0510 }
            java.lang.String r6 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r7 = r4 - r10
            long r7 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x0510 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0510 }
            r0.zzb(r6, r7)     // Catch:{ all -> 0x0510 }
        L_0x00dc:
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x0510 }
            zzak(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r6 = r0.zzy()     // Catch:{ all -> 0x0510 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0510 }
            r7 = -1
            if (r0 != 0) goto L_0x0489
            long r10 = r1.zzz     // Catch:{ all -> 0x0510 }
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0138
            com.google.android.gms.measurement.internal.zzai r10 = r1.zze     // Catch:{ all -> 0x0510 }
            zzak(r10)     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r10.zze()     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            java.lang.String r11 = "select rowid from raw_events order by rowid desc limit 1;"
            android.database.Cursor r11 = r0.rawQuery(r11, r9)     // Catch:{ SQLiteException -> 0x0119, all -> 0x0117 }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0115 }
            if (r0 != 0) goto L_0x010e
            if (r11 == 0) goto L_0x012d
        L_0x010a:
            r11.close()     // Catch:{ all -> 0x0510 }
            goto L_0x012d
        L_0x010e:
            long r7 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0115 }
            if (r11 == 0) goto L_0x012d
            goto L_0x010a
        L_0x0115:
            r0 = move-exception
            goto L_0x011b
        L_0x0117:
            r0 = move-exception
            goto L_0x0132
        L_0x0119:
            r0 = move-exception
            r11 = r9
        L_0x011b:
            com.google.android.gms.measurement.internal.zzfu r10 = r10.zzs     // Catch:{ all -> 0x0130 }
            com.google.android.gms.measurement.internal.zzem r10 = r10.zzau()     // Catch:{ all -> 0x0130 }
            com.google.android.gms.measurement.internal.zzek r10 = r10.zzb()     // Catch:{ all -> 0x0130 }
            java.lang.String r12 = "Error querying raw events"
            r10.zzb(r12, r0)     // Catch:{ all -> 0x0130 }
            if (r11 == 0) goto L_0x012d
            goto L_0x010a
        L_0x012d:
            r1.zzz = r7     // Catch:{ all -> 0x0510 }
            goto L_0x0138
        L_0x0130:
            r0 = move-exception
            r9 = r11
        L_0x0132:
            if (r9 == 0) goto L_0x0137
            r9.close()     // Catch:{ all -> 0x0510 }
        L_0x0137:
            throw r0     // Catch:{ all -> 0x0510 }
        L_0x0138:
            com.google.android.gms.measurement.internal.zzae r0 = r22.zzd()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r7 = com.google.android.gms.measurement.internal.zzea.zzf     // Catch:{ all -> 0x0510 }
            int r0 = r0.zzk(r6, r7)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzae r7 = r22.zzd()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r8 = com.google.android.gms.measurement.internal.zzea.zzg     // Catch:{ all -> 0x0510 }
            int r7 = r7.zzk(r6, r8)     // Catch:{ all -> 0x0510 }
            int r7 = java.lang.Math.max(r3, r7)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzai r8 = r1.zze     // Catch:{ all -> 0x0510 }
            zzak(r8)     // Catch:{ all -> 0x0510 }
            r8.zzg()     // Catch:{ all -> 0x0510 }
            r8.zzZ()     // Catch:{ all -> 0x0510 }
            if (r0 <= 0) goto L_0x015f
            r10 = 1
            goto L_0x0160
        L_0x015f:
            r10 = 0
        L_0x0160:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0510 }
            if (r7 <= 0) goto L_0x0167
            r10 = 1
            goto L_0x0168
        L_0x0167:
            r10 = 0
        L_0x0168:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r10)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r6)     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r11 = r8.zze()     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            java.lang.String r12 = "rowid"
            java.lang.String r13 = "data"
            java.lang.String r14 = "retry_count"
            java.lang.String[] r13 = new java.lang.String[]{r12, r13, r14}     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            r15[r3] = r6     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            java.lang.String r12 = "queue"
            java.lang.String r14 = "app_id=?"
            r16 = 0
            r17 = 0
            java.lang.String r18 = "rowid"
            java.lang.String r19 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ SQLiteException -> 0x027f, all -> 0x027b }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0277 }
            if (r0 != 0) goto L_0x01a5
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ SQLiteException -> 0x0277 }
            if (r11 == 0) goto L_0x01a1
            r11.close()     // Catch:{ all -> 0x0510 }
        L_0x01a1:
            r20 = r4
            goto L_0x029f
        L_0x01a5:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0277 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0277 }
            r13 = 0
        L_0x01ab:
            long r14 = r11.getLong(r3)     // Catch:{ SQLiteException -> 0x0277 }
            byte[] r0 = r11.getBlob(r2)     // Catch:{ IOException -> 0x0248 }
            com.google.android.gms.measurement.internal.zzkn r2 = r8.zzf     // Catch:{ IOException -> 0x0248 }
            com.google.android.gms.measurement.internal.zzkp r2 = r2.zzi     // Catch:{ IOException -> 0x0248 }
            zzak(r2)     // Catch:{ IOException -> 0x0248 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x0233 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x0233 }
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0233 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x0233 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0233 }
            r3.<init>()     // Catch:{ IOException -> 0x0233 }
            r10 = 1024(0x400, float:1.435E-42)
            byte[] r10 = new byte[r10]     // Catch:{ IOException -> 0x0233 }
            r20 = r4
        L_0x01cf:
            int r4 = r0.read(r10)     // Catch:{ IOException -> 0x0231 }
            if (r4 > 0) goto L_0x022c
            r0.close()     // Catch:{ IOException -> 0x0231 }
            r9.close()     // Catch:{ IOException -> 0x0231 }
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x0231 }
            boolean r2 = r12.isEmpty()     // Catch:{ SQLiteException -> 0x0275 }
            if (r2 != 0) goto L_0x01eb
            int r2 = r0.length     // Catch:{ SQLiteException -> 0x0275 }
            int r2 = r2 + r13
            if (r2 <= r7) goto L_0x01eb
            goto L_0x026e
        L_0x01eb:
            com.google.android.gms.internal.measurement.zzfv r2 = com.google.android.gms.internal.measurement.zzfw.zzaj()     // Catch:{ IOException -> 0x0217 }
            com.google.android.gms.internal.measurement.zzlh r2 = com.google.android.gms.measurement.internal.zzkp.zzt(r2, r0)     // Catch:{ IOException -> 0x0217 }
            com.google.android.gms.internal.measurement.zzfv r2 = (com.google.android.gms.internal.measurement.zzfv) r2     // Catch:{ IOException -> 0x0217 }
            r3 = 2
            boolean r4 = r11.isNull(r3)     // Catch:{ SQLiteException -> 0x0275 }
            if (r4 != 0) goto L_0x0203
            int r4 = r11.getInt(r3)     // Catch:{ SQLiteException -> 0x0275 }
            r2.zzah(r4)     // Catch:{ SQLiteException -> 0x0275 }
        L_0x0203:
            int r0 = r0.length     // Catch:{ SQLiteException -> 0x0275 }
            int r13 = r13 + r0
            com.google.android.gms.internal.measurement.zzkd r0 = r2.zzaA()     // Catch:{ SQLiteException -> 0x0275 }
            com.google.android.gms.internal.measurement.zzfw r0 = (com.google.android.gms.internal.measurement.zzfw) r0     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.Long r2 = java.lang.Long.valueOf(r14)     // Catch:{ SQLiteException -> 0x0275 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ SQLiteException -> 0x0275 }
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0275 }
            goto L_0x025e
        L_0x0217:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzs     // Catch:{ SQLiteException -> 0x0275 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ SQLiteException -> 0x0275 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.String r3 = "Failed to merge queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r6)     // Catch:{ SQLiteException -> 0x0275 }
            r2.zzc(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0275 }
            goto L_0x025e
        L_0x022c:
            r5 = 0
            r3.write(r10, r5, r4)     // Catch:{ IOException -> 0x0231 }
            goto L_0x01cf
        L_0x0231:
            r0 = move-exception
            goto L_0x0236
        L_0x0233:
            r0 = move-exception
            r20 = r4
        L_0x0236:
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs     // Catch:{ IOException -> 0x0246 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ IOException -> 0x0246 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ IOException -> 0x0246 }
            java.lang.String r3 = "Failed to ungzip content"
            r2.zzb(r3, r0)     // Catch:{ IOException -> 0x0246 }
            throw r0     // Catch:{ IOException -> 0x0246 }
        L_0x0246:
            r0 = move-exception
            goto L_0x024b
        L_0x0248:
            r0 = move-exception
            r20 = r4
        L_0x024b:
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzs     // Catch:{ SQLiteException -> 0x0275 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ SQLiteException -> 0x0275 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ SQLiteException -> 0x0275 }
            java.lang.String r3 = "Failed to unzip queued bundle. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r6)     // Catch:{ SQLiteException -> 0x0275 }
            r2.zzc(r3, r4, r0)     // Catch:{ SQLiteException -> 0x0275 }
        L_0x025e:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x0275 }
            if (r0 == 0) goto L_0x026e
            if (r13 <= r7) goto L_0x0267
            goto L_0x026e
        L_0x0267:
            r4 = r20
            r2 = 1
            r3 = 0
            r9 = 0
            goto L_0x01ab
        L_0x026e:
            if (r11 == 0) goto L_0x0273
            r11.close()     // Catch:{ all -> 0x0510 }
        L_0x0273:
            r0 = r12
            goto L_0x029f
        L_0x0275:
            r0 = move-exception
            goto L_0x0283
        L_0x0277:
            r0 = move-exception
            r20 = r4
            goto L_0x0283
        L_0x027b:
            r0 = move-exception
            r9 = 0
            goto L_0x0483
        L_0x027f:
            r0 = move-exception
            r20 = r4
            r11 = 0
        L_0x0283:
            com.google.android.gms.measurement.internal.zzfu r2 = r8.zzs     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ all -> 0x0481 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0481 }
            java.lang.String r3 = "Error querying bundles. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r6)     // Catch:{ all -> 0x0481 }
            r2.zzc(r3, r4, r0)     // Catch:{ all -> 0x0481 }
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0481 }
            if (r11 == 0) goto L_0x029f
            r11.close()     // Catch:{ all -> 0x0510 }
        L_0x029f:
            boolean r2 = r0.isEmpty()     // Catch:{ all -> 0x0510 }
            if (r2 != 0) goto L_0x0503
            com.google.android.gms.measurement.internal.zzaf r2 = r1.zzt(r6)     // Catch:{ all -> 0x0510 }
            boolean r2 = r2.zzf()     // Catch:{ all -> 0x0510 }
            if (r2 == 0) goto L_0x0304
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0510 }
        L_0x02b3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0510 }
            if (r3 == 0) goto L_0x02d2
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0510 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0510 }
            java.lang.Object r3 = r3.first     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfw r3 = (com.google.android.gms.internal.measurement.zzfw) r3     // Catch:{ all -> 0x0510 }
            java.lang.String r4 = r3.zzG()     // Catch:{ all -> 0x0510 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0510 }
            if (r4 != 0) goto L_0x02b3
            java.lang.String r2 = r3.zzG()     // Catch:{ all -> 0x0510 }
            goto L_0x02d3
        L_0x02d2:
            r2 = 0
        L_0x02d3:
            if (r2 == 0) goto L_0x0304
            r3 = 0
        L_0x02d6:
            int r4 = r0.size()     // Catch:{ all -> 0x0510 }
            if (r3 >= r4) goto L_0x0304
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0510 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0510 }
            java.lang.Object r4 = r4.first     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfw r4 = (com.google.android.gms.internal.measurement.zzfw) r4     // Catch:{ all -> 0x0510 }
            java.lang.String r5 = r4.zzG()     // Catch:{ all -> 0x0510 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0510 }
            if (r5 == 0) goto L_0x02f1
            goto L_0x0301
        L_0x02f1:
            java.lang.String r4 = r4.zzG()     // Catch:{ all -> 0x0510 }
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0510 }
            if (r4 != 0) goto L_0x0301
            r4 = 0
            java.util.List r0 = r0.subList(r4, r3)     // Catch:{ all -> 0x0510 }
            goto L_0x0304
        L_0x0301:
            int r3 = r3 + 1
            goto L_0x02d6
        L_0x0304:
            com.google.android.gms.internal.measurement.zzft r2 = com.google.android.gms.internal.measurement.zzfu.zzc()     // Catch:{ all -> 0x0510 }
            int r3 = r0.size()     // Catch:{ all -> 0x0510 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0510 }
            int r5 = r0.size()     // Catch:{ all -> 0x0510 }
            r4.<init>(r5)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzae r5 = r22.zzd()     // Catch:{ all -> 0x0510 }
            boolean r5 = r5.zzw(r6)     // Catch:{ all -> 0x0510 }
            if (r5 == 0) goto L_0x032b
            com.google.android.gms.measurement.internal.zzaf r5 = r1.zzt(r6)     // Catch:{ all -> 0x0510 }
            boolean r5 = r5.zzf()     // Catch:{ all -> 0x0510 }
            if (r5 == 0) goto L_0x032b
            r5 = 1
            goto L_0x032c
        L_0x032b:
            r5 = 0
        L_0x032c:
            com.google.android.gms.measurement.internal.zzaf r7 = r1.zzt(r6)     // Catch:{ all -> 0x0510 }
            boolean r7 = r7.zzf()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzaf r8 = r1.zzt(r6)     // Catch:{ all -> 0x0510 }
            boolean r8 = r8.zzh()     // Catch:{ all -> 0x0510 }
            r9 = 0
        L_0x033d:
            if (r9 >= r3) goto L_0x03b3
            java.lang.Object r10 = r0.get(r9)     // Catch:{ all -> 0x0510 }
            android.util.Pair r10 = (android.util.Pair) r10     // Catch:{ all -> 0x0510 }
            java.lang.Object r10 = r10.first     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfw r10 = (com.google.android.gms.internal.measurement.zzfw) r10     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzjz r10 = r10.zzbu()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfv r10 = (com.google.android.gms.internal.measurement.zzfv) r10     // Catch:{ all -> 0x0510 }
            java.lang.Object r11 = r0.get(r9)     // Catch:{ all -> 0x0510 }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x0510 }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x0510 }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0510 }
            r4.add(r11)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzae r11 = r22.zzd()     // Catch:{ all -> 0x0510 }
            r11.zzf()     // Catch:{ all -> 0x0510 }
            r11 = 42004(0xa414, double:2.07527E-319)
            r10.zzK(r11)     // Catch:{ all -> 0x0510 }
            r11 = r20
            r10.zzr(r11)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzfu r13 = r1.zzm     // Catch:{ all -> 0x0510 }
            r13.zzat()     // Catch:{ all -> 0x0510 }
            r13 = 0
            r10.zzX(r13)     // Catch:{ all -> 0x0510 }
            if (r5 != 0) goto L_0x037c
            r10.zzag()     // Catch:{ all -> 0x0510 }
        L_0x037c:
            if (r7 != 0) goto L_0x0384
            r10.zzM()     // Catch:{ all -> 0x0510 }
            r10.zzO()     // Catch:{ all -> 0x0510 }
        L_0x0384:
            if (r8 != 0) goto L_0x0389
            r10.zzQ()     // Catch:{ all -> 0x0510 }
        L_0x0389:
            com.google.android.gms.measurement.internal.zzae r13 = r22.zzd()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r14 = com.google.android.gms.measurement.internal.zzea.zzV     // Catch:{ all -> 0x0510 }
            boolean r13 = r13.zzn(r6, r14)     // Catch:{ all -> 0x0510 }
            if (r13 == 0) goto L_0x03ab
            com.google.android.gms.internal.measurement.zzkd r13 = r10.zzaA()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfw r13 = (com.google.android.gms.internal.measurement.zzfw) r13     // Catch:{ all -> 0x0510 }
            byte[] r13 = r13.zzbp()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzkp r14 = r1.zzi     // Catch:{ all -> 0x0510 }
            zzak(r14)     // Catch:{ all -> 0x0510 }
            long r13 = r14.zzr(r13)     // Catch:{ all -> 0x0510 }
            r10.zzam(r13)     // Catch:{ all -> 0x0510 }
        L_0x03ab:
            r2.zzb(r10)     // Catch:{ all -> 0x0510 }
            int r9 = r9 + 1
            r20 = r11
            goto L_0x033d
        L_0x03b3:
            r11 = r20
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r0.zzn()     // Catch:{ all -> 0x0510 }
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x03d4
            com.google.android.gms.measurement.internal.zzkp r0 = r1.zzi     // Catch:{ all -> 0x0510 }
            zzak(r0)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzkd r5 = r2.zzaA()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfu r5 = (com.google.android.gms.internal.measurement.zzfu) r5     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r0.zzh(r5)     // Catch:{ all -> 0x0510 }
            goto L_0x03d5
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            com.google.android.gms.measurement.internal.zzkp r5 = r1.zzi     // Catch:{ all -> 0x0510 }
            zzak(r5)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzkd r5 = r2.zzaA()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.internal.measurement.zzfu r5 = (com.google.android.gms.internal.measurement.zzfu) r5     // Catch:{ all -> 0x0510 }
            byte[] r14 = r5.zzbp()     // Catch:{ all -> 0x0510 }
            r22.zzd()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.String> r5 = com.google.android.gms.measurement.internal.zzea.zzp     // Catch:{ all -> 0x0510 }
            r9 = 0
            java.lang.Object r5 = r5.zzb(r9)     // Catch:{ all -> 0x0510 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0510 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x046e }
            r13.<init>(r5)     // Catch:{ MalformedURLException -> 0x046e }
            boolean r7 = r4.isEmpty()     // Catch:{ MalformedURLException -> 0x046e }
            r8 = 1
            r7 = r7 ^ r8
            com.google.android.gms.common.internal.Preconditions.checkArgument(r7)     // Catch:{ MalformedURLException -> 0x046e }
            java.util.List<java.lang.Long> r7 = r1.zzx     // Catch:{ MalformedURLException -> 0x046e }
            if (r7 == 0) goto L_0x0410
            com.google.android.gms.measurement.internal.zzem r4 = r22.zzau()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzek r4 = r4.zzb()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r4.zza(r7)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x0417
        L_0x0410:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x046e }
            r7.<init>(r4)     // Catch:{ MalformedURLException -> 0x046e }
            r1.zzx = r7     // Catch:{ MalformedURLException -> 0x046e }
        L_0x0417:
            com.google.android.gms.measurement.internal.zzjl r4 = r1.zzk     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzey r4 = r4.zzd     // Catch:{ MalformedURLException -> 0x046e }
            r4.zzb(r11)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = "?"
            if (r3 <= 0) goto L_0x042b
            r3 = 0
            com.google.android.gms.internal.measurement.zzfw r2 = r2.zza(r3)     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r4 = r2.zzA()     // Catch:{ MalformedURLException -> 0x046e }
        L_0x042b:
            com.google.android.gms.measurement.internal.zzem r2 = r22.zzau()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzk()     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.String r3 = "Uploading data. app, uncompressed size, data"
            int r7 = r14.length     // Catch:{ MalformedURLException -> 0x046e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ MalformedURLException -> 0x046e }
            r2.zzd(r3, r4, r7, r0)     // Catch:{ MalformedURLException -> 0x046e }
            r2 = 1
            r1.zzt = r2     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzes r11 = r1.zzd     // Catch:{ MalformedURLException -> 0x046e }
            zzak(r11)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzkh r0 = new com.google.android.gms.measurement.internal.zzkh     // Catch:{ MalformedURLException -> 0x046e }
            r0.<init>(r1, r6)     // Catch:{ MalformedURLException -> 0x046e }
            r11.zzg()     // Catch:{ MalformedURLException -> 0x046e }
            r11.zzZ()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r13)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r14)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzfu r2 = r11.zzs     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzav()     // Catch:{ MalformedURLException -> 0x046e }
            com.google.android.gms.measurement.internal.zzer r3 = new com.google.android.gms.measurement.internal.zzer     // Catch:{ MalformedURLException -> 0x046e }
            r15 = 0
            r10 = r3
            r12 = r6
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)     // Catch:{ MalformedURLException -> 0x046e }
            r2.zzk(r3)     // Catch:{ MalformedURLException -> 0x046e }
            goto L_0x0503
        L_0x046e:
            com.google.android.gms.measurement.internal.zzem r0 = r22.zzau()     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzem.zzl(r6)     // Catch:{ all -> 0x0510 }
            r0.zzc(r2, r3, r5)     // Catch:{ all -> 0x0510 }
            goto L_0x0503
        L_0x0481:
            r0 = move-exception
            r9 = r11
        L_0x0483:
            if (r9 == 0) goto L_0x0488
            r9.close()     // Catch:{ all -> 0x0510 }
        L_0x0488:
            throw r0     // Catch:{ all -> 0x0510 }
        L_0x0489:
            r11 = r4
            r1.zzz = r7     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0510 }
            zzak(r2)     // Catch:{ all -> 0x0510 }
            r22.zzd()     // Catch:{ all -> 0x0510 }
            long r3 = com.google.android.gms.measurement.internal.zzae.zzz()     // Catch:{ all -> 0x0510 }
            long r3 = r11 - r3
            r2.zzg()     // Catch:{ all -> 0x0510 }
            r2.zzZ()     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r2.zze()     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d9 }
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d9 }
            r4 = 0
            r5[r4] = r3     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d9 }
            java.lang.String r3 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            android.database.Cursor r3 = r0.rawQuery(r3, r5)     // Catch:{ SQLiteException -> 0x04db, all -> 0x04d9 }
            boolean r0 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x04d7 }
            if (r0 != 0) goto L_0x04cf
            com.google.android.gms.measurement.internal.zzfu r0 = r2.zzs     // Catch:{ SQLiteException -> 0x04d7 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteException -> 0x04d7 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()     // Catch:{ SQLiteException -> 0x04d7 }
            java.lang.String r4 = "No expired configs for apps with pending events"
            r0.zza(r4)     // Catch:{ SQLiteException -> 0x04d7 }
            if (r3 == 0) goto L_0x04ef
        L_0x04cb:
            r3.close()     // Catch:{ all -> 0x0510 }
            goto L_0x04ef
        L_0x04cf:
            r4 = 0
            java.lang.String r9 = r3.getString(r4)     // Catch:{ SQLiteException -> 0x04d7 }
            if (r3 == 0) goto L_0x04ef
            goto L_0x04cb
        L_0x04d7:
            r0 = move-exception
            goto L_0x04dd
        L_0x04d9:
            r0 = move-exception
            goto L_0x050a
        L_0x04db:
            r0 = move-exception
            r3 = r9
        L_0x04dd:
            com.google.android.gms.measurement.internal.zzfu r2 = r2.zzs     // Catch:{ all -> 0x0508 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ all -> 0x0508 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0508 }
            java.lang.String r4 = "Error selecting expired configs"
            r2.zzb(r4, r0)     // Catch:{ all -> 0x0508 }
            if (r3 == 0) goto L_0x04ef
            goto L_0x04cb
        L_0x04ef:
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0510 }
            if (r0 != 0) goto L_0x0503
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x0510 }
            zzak(r0)     // Catch:{ all -> 0x0510 }
            com.google.android.gms.measurement.internal.zzg r0 = r0.zzs(r9)     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0503
            r1.zzD(r0)     // Catch:{ all -> 0x0510 }
        L_0x0503:
            r2 = 0
            r1.zzu = r2
            goto L_0x0030
        L_0x0508:
            r0 = move-exception
            r9 = r3
        L_0x050a:
            if (r9 == 0) goto L_0x050f
            r9.close()     // Catch:{ all -> 0x0510 }
        L_0x050f:
            throw r0     // Catch:{ all -> 0x0510 }
        L_0x0510:
            r0 = move-exception
            r2 = 0
            r1.zzu = r2
            r22.zzag()
            goto L_0x0519
        L_0x0518:
            throw r0
        L_0x0519:
            goto L_0x0518
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzB():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    public final void zzC(int i, Throwable th, byte[] bArr, String str) {
        zzai zzai;
        zzav().zzg();
        zzr();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzt = false;
                zzag();
                throw th2;
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.zzx);
        this.zzx = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            zzau().zzk().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzk.zzd.zzb(zzay().currentTimeMillis());
            if (i == 503 || i == 429) {
                this.zzk.zzb.zzb(zzay().currentTimeMillis());
            }
            zzai zzai2 = this.zze;
            zzak(zzai2);
            zzai2.zzB(list);
            zzaf();
            this.zzt = false;
            zzag();
        }
        if (th == null) {
            try {
                this.zzk.zzc.zzb(zzay().currentTimeMillis());
                this.zzk.zzd.zzb(0);
                zzaf();
                zzau().zzk().zzc("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzai zzai3 = this.zze;
                zzak(zzai3);
                zzai3.zzb();
                try {
                    for (Long l : list) {
                        try {
                            zzai = this.zze;
                            zzak(zzai);
                            long longValue = l.longValue();
                            zzai.zzg();
                            zzai.zzZ();
                            if (zzai.zze().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e) {
                            zzai.zzs.zzau().zzb().zzb("Failed to delete a bundle in a queue table", e);
                            throw e;
                        } catch (SQLiteException e2) {
                            List<Long> list2 = this.zzy;
                            if (list2 == null || !list2.contains(l)) {
                                throw e2;
                            }
                        }
                    }
                    zzai zzai4 = this.zze;
                    zzak(zzai4);
                    zzai4.zzc();
                    zzai zzai5 = this.zze;
                    zzak(zzai5);
                    zzai5.zzd();
                    this.zzy = null;
                    zzes zzes = this.zzd;
                    zzak(zzes);
                    if (!zzes.zzb() || !zzae()) {
                        this.zzz = -1;
                        zzaf();
                    } else {
                        zzB();
                    }
                    this.zza = 0;
                } catch (Throwable th3) {
                    zzai zzai6 = this.zze;
                    zzak(zzai6);
                    zzai6.zzd();
                    throw th3;
                }
            } catch (SQLiteException e3) {
                zzau().zzb().zzb("Database error while trying to delete uploaded bundles", e3);
                this.zza = zzay().elapsedRealtime();
                zzau().zzk().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
            this.zzt = false;
            zzag();
        }
        zzau().zzk().zzc("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.zzk.zzd.zzb(zzay().currentTimeMillis());
        this.zzk.zzb.zzb(zzay().currentTimeMillis());
        zzai zzai22 = this.zze;
        zzak(zzai22);
        zzai22.zzB(list);
        zzaf();
        this.zzt = false;
        zzag();
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzD(zzg zzg2) {
        String str;
        zzav().zzg();
        zzov.zzb();
        if (zzd().zzn(zzg2.zzc(), zzea.zzag)) {
            if (TextUtils.isEmpty(zzg2.zzf()) && TextUtils.isEmpty(zzg2.zzj()) && TextUtils.isEmpty(zzg2.zzh())) {
                zzE((String) Preconditions.checkNotNull(zzg2.zzc()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
                return;
            }
        } else if (TextUtils.isEmpty(zzg2.zzf()) && TextUtils.isEmpty(zzg2.zzh())) {
            zzE((String) Preconditions.checkNotNull(zzg2.zzc()), 204, (Throwable) null, (byte[]) null, (Map<String, List<String>>) null);
            return;
        }
        zzkf zzkf = this.zzl;
        Uri.Builder builder = new Uri.Builder();
        String zzf2 = zzg2.zzf();
        if (TextUtils.isEmpty(zzf2)) {
            zzov.zzb();
            if (zzkf.zzs.zzc().zzn(zzg2.zzc(), zzea.zzag)) {
                zzf2 = zzg2.zzj();
                if (TextUtils.isEmpty(zzf2)) {
                    zzf2 = zzg2.zzh();
                }
            } else {
                zzf2 = zzg2.zzh();
            }
        }
        PlaybackStateCompat playbackStateCompat = null;
        Uri.Builder encodedAuthority = builder.scheme(zzea.zzd.zzb(null)).encodedAuthority(zzea.zze.zzb(null));
        String valueOf = String.valueOf(zzf2);
        if (valueOf.length() != 0) {
            str = "config/app/".concat(valueOf);
        } else {
            str = new String("config/app/");
        }
        Uri.Builder appendQueryParameter = encodedAuthority.path(str).appendQueryParameter("app_instance_id", zzg2.zzd()).appendQueryParameter(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_PLATFORM, "android");
        zzkf.zzs.zzc().zzf();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(42004));
        zzpt.zzb();
        if (zzkf.zzs.zzc().zzn(zzg2.zzc(), zzea.zzaD)) {
            builder.appendQueryParameter("runtime_version", "0");
        }
        String uri = builder.build().toString();
        try {
            String str2 = (String) Preconditions.checkNotNull(zzg2.zzc());
            URL url = new URL(uri);
            zzau().zzk().zzb("Fetching remote configuration", str2);
            zzfl zzfl = this.zzc;
            zzak(zzfl);
            zzfc zzb2 = zzfl.zzb(str2);
            zzfl zzfl2 = this.zzc;
            zzak(zzfl2);
            String zzc2 = zzfl2.zzc(str2);
            if (zzb2 != null && !TextUtils.isEmpty(zzc2)) {
                playbackStateCompat = new PlaybackStateCompat();
                playbackStateCompat.put("If-Modified-Since", zzc2);
            }
            this.zzs = true;
            zzes zzes = this.zzd;
            zzak(zzes);
            zzki zzki = new zzki(this);
            zzes.zzg();
            zzes.zzZ();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzki);
            zzes.zzs.zzav().zzk(new zzer(zzes, str2, url, (byte[]) null, playbackStateCompat, zzki));
        } catch (MalformedURLException unused) {
            zzau().zzb().zzc("Failed to parse config URL. Not fetching. appId", zzem.zzl(zzg2.zzc()), uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0127 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0135 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0157 A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015b A[Catch:{ all -> 0x016c, all -> 0x0176 }] */
    @androidx.annotation.WorkerThread
    @com.google.android.gms.common.util.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzE(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            com.google.android.gms.measurement.internal.zzfr r0 = r6.zzav()
            r0.zzg()
            r6.zzr()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r7)
            r0 = 0
            if (r10 != 0) goto L_0x0012
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0176 }
        L_0x0012:
            com.google.android.gms.measurement.internal.zzem r1 = r6.zzau()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.zzek r1 = r1.zzk()     // Catch:{ all -> 0x0176 }
            int r2 = r10.length     // Catch:{ all -> 0x0176 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0176 }
            java.lang.String r3 = "onConfigFetched. Response size"
            r1.zzb(r3, r2)     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.zzai r1 = r6.zze     // Catch:{ all -> 0x0176 }
            zzak(r1)     // Catch:{ all -> 0x0176 }
            r1.zzb()     // Catch:{ all -> 0x0176 }
            com.google.android.gms.measurement.internal.zzai r1 = r6.zze     // Catch:{ all -> 0x016c }
            zzak(r1)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzg r1 = r1.zzs(r7)     // Catch:{ all -> 0x016c }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 304(0x130, float:4.26E-43)
            if (r8 == r3) goto L_0x0043
            r3 = 204(0xcc, float:2.86E-43)
            if (r8 == r3) goto L_0x0043
            if (r8 != r4) goto L_0x0047
            r8 = 304(0x130, float:4.26E-43)
        L_0x0043:
            if (r9 != 0) goto L_0x0047
            r3 = 1
            goto L_0x0048
        L_0x0047:
            r3 = 0
        L_0x0048:
            if (r1 != 0) goto L_0x005d
            com.google.android.gms.measurement.internal.zzem r8 = r6.zzau()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzek r8 = r8.zze()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.zzem.zzl(r7)     // Catch:{ all -> 0x016c }
            r8.zzb(r9, r7)     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x005d:
            r5 = 404(0x194, float:5.66E-43)
            if (r3 != 0) goto L_0x00bb
            if (r8 != r5) goto L_0x0064
            goto L_0x00bb
        L_0x0064:
            com.google.android.gms.common.util.Clock r10 = r6.zzay()     // Catch:{ all -> 0x016c }
            long r10 = r10.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r1.zzM(r10)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzai r10 = r6.zze     // Catch:{ all -> 0x016c }
            zzak(r10)     // Catch:{ all -> 0x016c }
            r10.zzt(r1)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzem r10 = r6.zzau()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzek r10 = r10.zzk()     // Catch:{ all -> 0x016c }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016c }
            r10.zzc(r11, r1, r9)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzfl r9 = r6.zzc     // Catch:{ all -> 0x016c }
            zzak(r9)     // Catch:{ all -> 0x016c }
            r9.zzd(r7)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzjl r7 = r6.zzk     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzd     // Catch:{ all -> 0x016c }
            com.google.android.gms.common.util.Clock r9 = r6.zzay()     // Catch:{ all -> 0x016c }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r7.zzb(r9)     // Catch:{ all -> 0x016c }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a7
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00b6
        L_0x00a7:
            com.google.android.gms.measurement.internal.zzjl r7 = r6.zzk     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzey r7 = r7.zzb     // Catch:{ all -> 0x016c }
            com.google.android.gms.common.util.Clock r8 = r6.zzay()     // Catch:{ all -> 0x016c }
            long r8 = r8.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r7.zzb(r8)     // Catch:{ all -> 0x016c }
        L_0x00b6:
            r6.zzaf()     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x00bb:
            r9 = 0
            if (r11 == 0) goto L_0x00c7
            java.lang.String r3 = "Last-Modified"
            java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x016c }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x016c }
            goto L_0x00c8
        L_0x00c7:
            r11 = r9
        L_0x00c8:
            if (r11 == 0) goto L_0x00d7
            int r3 = r11.size()     // Catch:{ all -> 0x016c }
            if (r3 <= 0) goto L_0x00d7
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x016c }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x016c }
            goto L_0x00d8
        L_0x00d7:
            r11 = r9
        L_0x00d8:
            if (r8 == r5) goto L_0x00f6
            if (r8 != r4) goto L_0x00dd
            goto L_0x00f6
        L_0x00dd:
            com.google.android.gms.measurement.internal.zzfl r9 = r6.zzc     // Catch:{ all -> 0x016c }
            zzak(r9)     // Catch:{ all -> 0x016c }
            boolean r9 = r9.zzi(r7, r10, r11)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.zzai r7 = r6.zze     // Catch:{ all -> 0x0176 }
            zzak(r7)     // Catch:{ all -> 0x0176 }
        L_0x00ed:
            r7.zzd()     // Catch:{ all -> 0x0176 }
            r6.zzs = r0
            r6.zzag()
            return
        L_0x00f6:
            com.google.android.gms.measurement.internal.zzfl r10 = r6.zzc     // Catch:{ all -> 0x016c }
            zzak(r10)     // Catch:{ all -> 0x016c }
            com.google.android.gms.internal.measurement.zzfc r10 = r10.zzb(r7)     // Catch:{ all -> 0x016c }
            if (r10 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.zzfl r10 = r6.zzc     // Catch:{ all -> 0x016c }
            zzak(r10)     // Catch:{ all -> 0x016c }
            boolean r9 = r10.zzi(r7, r9, r9)     // Catch:{ all -> 0x016c }
            if (r9 != 0) goto L_0x0112
            com.google.android.gms.measurement.internal.zzai r7 = r6.zze     // Catch:{ all -> 0x0176 }
            zzak(r7)     // Catch:{ all -> 0x0176 }
            goto L_0x00ed
        L_0x0112:
            com.google.android.gms.common.util.Clock r9 = r6.zzay()     // Catch:{ all -> 0x016c }
            long r9 = r9.currentTimeMillis()     // Catch:{ all -> 0x016c }
            r1.zzK(r9)     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzai r9 = r6.zze     // Catch:{ all -> 0x016c }
            zzak(r9)     // Catch:{ all -> 0x016c }
            r9.zzt(r1)     // Catch:{ all -> 0x016c }
            if (r8 != r5) goto L_0x0135
            com.google.android.gms.measurement.internal.zzem r8 = r6.zzau()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzek r8 = r8.zzh()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.zzb(r9, r7)     // Catch:{ all -> 0x016c }
            goto L_0x0146
        L_0x0135:
            com.google.android.gms.measurement.internal.zzem r7 = r6.zzau()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zzk()     // Catch:{ all -> 0x016c }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x016c }
            r7.zzc(r9, r8, r2)     // Catch:{ all -> 0x016c }
        L_0x0146:
            com.google.android.gms.measurement.internal.zzes r7 = r6.zzd     // Catch:{ all -> 0x016c }
            zzak(r7)     // Catch:{ all -> 0x016c }
            boolean r7 = r7.zzb()     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x015b
            boolean r7 = r6.zzae()     // Catch:{ all -> 0x016c }
            if (r7 == 0) goto L_0x015b
            r6.zzB()     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x015b:
            r6.zzaf()     // Catch:{ all -> 0x016c }
        L_0x015e:
            com.google.android.gms.measurement.internal.zzai r7 = r6.zze     // Catch:{ all -> 0x016c }
            zzak(r7)     // Catch:{ all -> 0x016c }
            r7.zzc()     // Catch:{ all -> 0x016c }
            com.google.android.gms.measurement.internal.zzai r7 = r6.zze     // Catch:{ all -> 0x0176 }
            zzak(r7)     // Catch:{ all -> 0x0176 }
            goto L_0x00ed
        L_0x016c:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzai r8 = r6.zze     // Catch:{ all -> 0x0176 }
            zzak(r8)     // Catch:{ all -> 0x0176 }
            r8.zzd()     // Catch:{ all -> 0x0176 }
            throw r7     // Catch:{ all -> 0x0176 }
        L_0x0176:
            r7 = move-exception
            r6.zzs = r0
            r6.zzag()
            goto L_0x017e
        L_0x017d:
            throw r7
        L_0x017e:
            goto L_0x017d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzE(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzF(Runnable runnable) {
        zzav().zzg();
        if (this.zzp == null) {
            this.zzp = new ArrayList();
        }
        this.zzp.add(runnable);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    public final void zzG() {
        zzav().zzg();
        zzr();
        if (!this.zzo) {
            this.zzo = true;
            if (zzH()) {
                FileChannel fileChannel = this.zzw;
                zzav().zzg();
                int i = 0;
                if (fileChannel == null || !fileChannel.isOpen()) {
                    zzau().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0);
                        int read = fileChannel.read(allocate);
                        if (read == 4) {
                            allocate.flip();
                            i = allocate.getInt();
                        } else if (read != -1) {
                            zzau().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                        }
                    } catch (IOException e) {
                        zzau().zzb().zzb("Failed to read from channel", e);
                    }
                }
                int zzm2 = this.zzm.zzA().zzm();
                zzav().zzg();
                if (i > zzm2) {
                    zzau().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm2));
                } else if (i < zzm2) {
                    FileChannel fileChannel2 = this.zzw;
                    zzav().zzg();
                    if (fileChannel2 == null || !fileChannel2.isOpen()) {
                        zzau().zzb().zza("Bad channel to read from");
                    } else {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(zzm2);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0);
                            if (zzd().zzn((String) null, zzea.zzap) && Build.VERSION.SDK_INT <= 19) {
                                fileChannel2.position(0);
                            }
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                zzau().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            zzau().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm2));
                            return;
                        } catch (IOException e2) {
                            zzau().zzb().zzb("Failed to write to channel", e2);
                        }
                    }
                    zzau().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm2));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    public final boolean zzH() {
        FileLock fileLock;
        zzav().zzg();
        if (!zzd().zzn((String) null, zzea.zzaf) || (fileLock = this.zzv) == null || !fileLock.isValid()) {
            this.zze.zzs.zzc();
            try {
                FileChannel channel = new RandomAccessFile(new File(this.zzm.zzax().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
                this.zzw = channel;
                FileLock tryLock = channel.tryLock();
                this.zzv = tryLock;
                if (tryLock != null) {
                    zzau().zzk().zza("Storage concurrent access okay");
                    return true;
                }
                zzau().zzb().zza("Storage concurrent data access panic");
                return false;
            } catch (FileNotFoundException e) {
                zzau().zzb().zzb("Failed to acquire storage lock", e);
                return false;
            } catch (IOException e2) {
                zzau().zzb().zzb("Failed to access storage lock file", e2);
                return false;
            } catch (OverlappingFileLockException e3) {
                zzau().zze().zzb("Storage lock already acquired", e3);
                return false;
            }
        } else {
            zzau().zzk().zza("Storage concurrent access okay");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @VisibleForTesting
    public final void zzI(zzp zzp2) {
        if (this.zzx != null) {
            ArrayList arrayList = new ArrayList();
            this.zzy = arrayList;
            arrayList.addAll(this.zzx);
        }
        zzai zzai = this.zze;
        zzak(zzai);
        String str = (String) Preconditions.checkNotNull(zzp2.zza);
        Preconditions.checkNotEmpty(str);
        zzai.zzg();
        zzai.zzZ();
        try {
            SQLiteDatabase zze2 = zzai.zze();
            String[] strArr = {str};
            int delete = zze2.delete(GriverConfigConstants.KEY_APP_CONFIGURATION, "app_id=?", strArr) + zze2.delete("events", "app_id=?", strArr) + zze2.delete("user_attributes", "app_id=?", strArr) + zze2.delete("conditional_properties", "app_id=?", strArr) + zze2.delete("raw_events", "app_id=?", strArr) + zze2.delete("raw_events_metadata", "app_id=?", strArr) + zze2.delete("queue", "app_id=?", strArr) + zze2.delete("audience_filter_values", "app_id=?", strArr) + zze2.delete("main_event_params", "app_id=?", strArr) + zze2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzai.zzs.zzau().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzai.zzs.zzau().zzb().zzc("Error resetting analytics data. appId, error", zzem.zzl(str), e);
        }
        if (zzp2.zzh) {
            zzO(zzp2);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzJ(zzkq zzkq, zzp zzp2) {
        long j;
        zzkq zzkq2 = zzkq;
        zzp zzp3 = zzp2;
        zzav().zzg();
        zzr();
        if (zzaj(zzp3)) {
            if (!zzp3.zzh) {
                zzT(zzp3);
                return;
            }
            int zzo2 = zzq().zzo(zzkq2.zzb);
            if (zzo2 != 0) {
                zzku zzq2 = zzq();
                String str = zzkq2.zzb;
                zzd();
                String zzC = zzq2.zzC(str, 24, true);
                String str2 = zzkq2.zzb;
                zzq().zzM(this.zzB, zzp3.zza, zzo2, "_ev", zzC, str2 != null ? str2.length() : 0, zzd().zzn((String) null, zzea.zzav));
                return;
            }
            int zzJ = zzq().zzJ(zzkq2.zzb, zzkq.zza());
            if (zzJ != 0) {
                zzku zzq3 = zzq();
                String str3 = zzkq2.zzb;
                zzd();
                String zzC2 = zzq3.zzC(str3, 24, true);
                Object zza2 = zzkq.zza();
                zzq().zzM(this.zzB, zzp3.zza, zzJ, "_ev", zzC2, (zza2 == null || (!(zza2 instanceof String) && !(zza2 instanceof CharSequence))) ? 0 : String.valueOf(zza2).length(), zzd().zzn((String) null, zzea.zzav));
                return;
            }
            Object zzK = zzq().zzK(zzkq2.zzb, zzkq.zza());
            if (zzK != null) {
                if ("_sid".equals(zzkq2.zzb)) {
                    long j2 = zzkq2.zzc;
                    String str4 = zzkq2.zzf;
                    String str5 = (String) Preconditions.checkNotNull(zzp3.zza);
                    zzai zzai = this.zze;
                    zzak(zzai);
                    zzks zzk2 = zzai.zzk(str5, "_sno");
                    if (zzk2 != null) {
                        Object obj = zzk2.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            zzJ(new zzkq("_sno", j2, Long.valueOf(j + 1), str4), zzp3);
                        }
                    }
                    if (zzk2 != null) {
                        zzau().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzk2.zze);
                    }
                    zzai zzai2 = this.zze;
                    zzak(zzai2);
                    zzao zzf2 = zzai2.zzf(str5, "_s");
                    if (zzf2 != null) {
                        j = zzf2.zzc;
                        zzau().zzk().zzb("Backfill the session number. Last used session number", Long.valueOf(j));
                    } else {
                        j = 0;
                    }
                    zzJ(new zzkq("_sno", j2, Long.valueOf(j + 1), str4), zzp3);
                }
                zzks zzks = new zzks((String) Preconditions.checkNotNull(zzp3.zza), (String) Preconditions.checkNotNull(zzkq2.zzf), zzkq2.zzb, zzkq2.zzc, zzK);
                zzau().zzk().zzc("Setting user property", this.zzm.zzm().zze(zzks.zzc), zzK);
                zzai zzai3 = this.zze;
                zzak(zzai3);
                zzai3.zzb();
                try {
                    zzT(zzp3);
                    zzai zzai4 = this.zze;
                    zzak(zzai4);
                    boolean zzj2 = zzai4.zzj(zzks);
                    zzai zzai5 = this.zze;
                    zzak(zzai5);
                    zzai5.zzc();
                    if (!zzj2) {
                        zzau().zzb().zzc("Too many unique user properties are set. Ignoring user property", this.zzm.zzm().zze(zzks.zzc), zzks.zze);
                        zzq().zzM(this.zzB, zzp3.zza, 9, (String) null, (String) null, 0, zzd().zzn((String) null, zzea.zzav));
                    }
                } finally {
                    zzai zzai6 = this.zze;
                    zzak(zzai6);
                    zzai6.zzd();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzK(zzkq zzkq, zzp zzp2) {
        zzav().zzg();
        zzr();
        if (zzaj(zzp2)) {
            if (!zzp2.zzh) {
                zzT(zzp2);
            } else if (!"_npa".equals(zzkq.zzb) || zzp2.zzr == null) {
                zzau().zzj().zzb("Removing user property", this.zzm.zzm().zze(zzkq.zzb));
                zzai zzai = this.zze;
                zzak(zzai);
                zzai.zzb();
                try {
                    zzT(zzp2);
                    zzai zzai2 = this.zze;
                    zzak(zzai2);
                    zzai2.zzi((String) Preconditions.checkNotNull(zzp2.zza), zzkq.zzb);
                    zzai zzai3 = this.zze;
                    zzak(zzai3);
                    zzai3.zzc();
                    zzau().zzj().zzb("User property removed", this.zzm.zzm().zze(zzkq.zzb));
                } finally {
                    zzai zzai4 = this.zze;
                    zzak(zzai4);
                    zzai4.zzd();
                }
            } else {
                zzau().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzJ(new zzkq("_npa", zzay().currentTimeMillis(), Long.valueOf(true != zzp2.zzr.booleanValue() ? 0 : 1), "auto"), zzp2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzL() {
        this.zzq++;
    }

    /* access modifiers changed from: package-private */
    public final void zzM() {
        this.zzr++;
    }

    /* access modifiers changed from: package-private */
    public final zzfu zzN() {
        return this.zzm;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x03d8 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0404 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x041b A[SYNTHETIC, Splitter:B:129:0x041b] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04e1 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0578 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b8 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01e3 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x021b A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x023a A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0241 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0250 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0260 A[Catch:{ SQLiteException -> 0x01cc, all -> 0x05a6 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzO(com.google.android.gms.measurement.internal.zzp r25) {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "com.android.vending"
            java.lang.String r6 = "_pfo"
            java.lang.String r7 = "_uwa"
            java.lang.String r0 = "app_id=?"
            com.google.android.gms.measurement.internal.zzfr r8 = r24.zzav()
            r8.zzg()
            r24.zzr()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r25)
            java.lang.String r8 = r2.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            boolean r8 = r24.zzaj(r25)
            if (r8 == 0) goto L_0x05b0
            com.google.android.gms.measurement.internal.zzai r8 = r1.zze
            zzak(r8)
            java.lang.String r9 = r2.zza
            com.google.android.gms.measurement.internal.zzg r8 = r8.zzs(r9)
            r9 = 0
            if (r8 == 0) goto L_0x005e
            java.lang.String r11 = r8.zzf()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x005e
            java.lang.String r11 = r2.zzb
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x005e
            r8.zzK(r9)
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze
            zzak(r11)
            r11.zzt(r8)
            com.google.android.gms.measurement.internal.zzfl r8 = r1.zzc
            zzak(r8)
            java.lang.String r11 = r2.zza
            r8.zze(r11)
        L_0x005e:
            boolean r8 = r2.zzh
            if (r8 != 0) goto L_0x0066
            r24.zzT(r25)
            return
        L_0x0066:
            long r11 = r2.zzm
            int r8 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0074
            com.google.android.gms.common.util.Clock r8 = r24.zzay()
            long r11 = r8.currentTimeMillis()
        L_0x0074:
            com.google.android.gms.measurement.internal.zzfu r8 = r1.zzm
            com.google.android.gms.measurement.internal.zzam r8 = r8.zzz()
            r8.zze()
            int r8 = r2.zzn
            r15 = 1
            if (r8 == 0) goto L_0x009c
            if (r8 == r15) goto L_0x009c
            com.google.android.gms.measurement.internal.zzem r13 = r24.zzau()
            com.google.android.gms.measurement.internal.zzek r13 = r13.zze()
            java.lang.String r14 = r2.zza
            java.lang.Object r14 = com.google.android.gms.measurement.internal.zzem.zzl(r14)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Incorrect app type, assuming installed app. appId, appType"
            r13.zzc(r9, r14, r8)
            r8 = 0
        L_0x009c:
            com.google.android.gms.measurement.internal.zzai r9 = r1.zze
            zzak(r9)
            r9.zzb()
            com.google.android.gms.measurement.internal.zzai r9 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r9)     // Catch:{ all -> 0x05a6 }
            java.lang.String r10 = r2.zza     // Catch:{ all -> 0x05a6 }
            java.lang.String r13 = "_npa"
            com.google.android.gms.measurement.internal.zzks r9 = r9.zzk(r10, r13)     // Catch:{ all -> 0x05a6 }
            if (r9 == 0) goto L_0x00c4
            java.lang.String r10 = "auto"
            java.lang.String r13 = r9.zzb     // Catch:{ all -> 0x05a6 }
            boolean r10 = r10.equals(r13)     // Catch:{ all -> 0x05a6 }
            if (r10 == 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            r21 = r3
            r22 = r4
            r4 = 1
            goto L_0x0118
        L_0x00c4:
            java.lang.Boolean r10 = r2.zzr     // Catch:{ all -> 0x05a6 }
            if (r10 == 0) goto L_0x0101
            com.google.android.gms.measurement.internal.zzkq r14 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x05a6 }
            java.lang.String r19 = "_npa"
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x05a6 }
            if (r15 == r10) goto L_0x00d5
            r20 = 0
            goto L_0x00d7
        L_0x00d5:
            r20 = 1
        L_0x00d7:
            java.lang.Long r10 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x05a6 }
            java.lang.String r20 = "auto"
            r21 = r3
            r22 = r4
            r3 = 1
            r13 = r14
            r3 = r14
            r4 = 0
            r14 = r19
            r4 = 1
            r15 = r11
            r17 = r10
            r18 = r20
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x05a6 }
            if (r9 == 0) goto L_0x00fd
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x05a6 }
            java.lang.Long r10 = r3.zzd     // Catch:{ all -> 0x05a6 }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x05a6 }
            if (r9 != 0) goto L_0x0118
        L_0x00fd:
            r1.zzJ(r3, r2)     // Catch:{ all -> 0x05a6 }
            goto L_0x0118
        L_0x0101:
            r21 = r3
            r22 = r4
            r4 = 1
            if (r9 == 0) goto L_0x0118
            com.google.android.gms.measurement.internal.zzkq r3 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_npa"
            r17 = 0
            java.lang.String r18 = "auto"
            r13 = r3
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x05a6 }
            r1.zzK(r3, r2)     // Catch:{ all -> 0x05a6 }
        L_0x0118:
            com.google.android.gms.measurement.internal.zzai r3 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r3)     // Catch:{ all -> 0x05a6 }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x05a6 }
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)     // Catch:{ all -> 0x05a6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzg r3 = r3.zzs(r9)     // Catch:{ all -> 0x05a6 }
            if (r3 == 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.zzku r10 = r24.zzq()     // Catch:{ all -> 0x05a6 }
            java.lang.String r13 = r2.zzb     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = r3.zzf()     // Catch:{ all -> 0x05a6 }
            java.lang.String r15 = r2.zzq     // Catch:{ all -> 0x05a6 }
            java.lang.String r9 = r3.zzh()     // Catch:{ all -> 0x05a6 }
            boolean r9 = r10.zzB(r13, r14, r15, r9)     // Catch:{ all -> 0x05a6 }
            if (r9 == 0) goto L_0x01e1
            com.google.android.gms.measurement.internal.zzem r9 = r24.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r9 = r9.zze()     // Catch:{ all -> 0x05a6 }
            java.lang.String r10 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r3.zzc()     // Catch:{ all -> 0x05a6 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzem.zzl(r13)     // Catch:{ all -> 0x05a6 }
            r9.zzb(r10, r13)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzai r9 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r9)     // Catch:{ all -> 0x05a6 }
            java.lang.String r3 = r3.zzc()     // Catch:{ all -> 0x05a6 }
            r9.zzZ()     // Catch:{ all -> 0x05a6 }
            r9.zzg()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x05a6 }
            android.database.sqlite.SQLiteDatabase r10 = r9.zze()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String[] r13 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x01cc }
            r14 = 0
            r13[r14] = r3     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r14 = "events"
            int r14 = r10.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r15 = "user_attributes"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r15 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r15
            java.lang.String r15 = "consent_settings"
            int r0 = r10.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x01cc }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x01e0
            com.google.android.gms.measurement.internal.zzfu r0 = r9.zzs     // Catch:{ SQLiteException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ SQLiteException -> 0x01cc }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzk()     // Catch:{ SQLiteException -> 0x01cc }
            java.lang.String r10 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x01cc }
            r0.zzc(r10, r3, r13)     // Catch:{ SQLiteException -> 0x01cc }
            goto L_0x01e0
        L_0x01cc:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r9 = r9.zzs     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r9 = r9.zzb()     // Catch:{ all -> 0x05a6 }
            java.lang.String r10 = "Error deleting application data. appId, error"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzem.zzl(r3)     // Catch:{ all -> 0x05a6 }
            r9.zzc(r10, r3, r0)     // Catch:{ all -> 0x05a6 }
        L_0x01e0:
            r3 = 0
        L_0x01e1:
            if (r3 == 0) goto L_0x023a
            long r9 = r3.zzv()     // Catch:{ all -> 0x05a6 }
            r13 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x01fc
            long r9 = r3.zzv()     // Catch:{ all -> 0x05a6 }
            r23 = r5
            long r4 = r2.zzj     // Catch:{ all -> 0x05a6 }
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x01fe
            r15 = 1
            goto L_0x01ff
        L_0x01fc:
            r23 = r5
        L_0x01fe:
            r15 = 0
        L_0x01ff:
            java.lang.String r0 = r3.zzt()     // Catch:{ all -> 0x05a6 }
            long r3 = r3.zzv()     // Catch:{ all -> 0x05a6 }
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 != 0) goto L_0x0217
            if (r0 == 0) goto L_0x0217
            java.lang.String r3 = r2.zzc     // Catch:{ all -> 0x05a6 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x05a6 }
            if (r3 != 0) goto L_0x0217
            r3 = 1
            goto L_0x0218
        L_0x0217:
            r3 = 0
        L_0x0218:
            r3 = r3 | r15
            if (r3 == 0) goto L_0x023c
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x05a6 }
            r3.<init>()     // Catch:{ all -> 0x05a6 }
            java.lang.String r4 = "_pv"
            r3.putString(r4, r0)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzas r0 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x05a6 }
            r15.<init>(r3)     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_au"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x05a6 }
            r1.zzy(r0, r2)     // Catch:{ all -> 0x05a6 }
            goto L_0x023c
        L_0x023a:
            r23 = r5
        L_0x023c:
            r24.zzT(r25)     // Catch:{ all -> 0x05a6 }
            if (r8 != 0) goto L_0x0250
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r0)     // Catch:{ all -> 0x05a6 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x05a6 }
            java.lang.String r4 = "_f"
            com.google.android.gms.measurement.internal.zzao r0 = r0.zzf(r3, r4)     // Catch:{ all -> 0x05a6 }
            r15 = 0
            goto L_0x025e
        L_0x0250:
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r0)     // Catch:{ all -> 0x05a6 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x05a6 }
            java.lang.String r4 = "_v"
            com.google.android.gms.measurement.internal.zzao r0 = r0.zzf(r3, r4)     // Catch:{ all -> 0x05a6 }
            r15 = 1
        L_0x025e:
            if (r0 != 0) goto L_0x0578
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r11 / r3
            r13 = 1
            long r8 = r8 + r13
            long r8 = r8 * r3
            java.lang.String r3 = "_dac"
            java.lang.String r4 = "_r"
            java.lang.String r5 = "_c"
            java.lang.String r10 = "_et"
            if (r15 != 0) goto L_0x04fb
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x05a6 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x05a6 }
            r1.zzJ(r0, r2)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfr r0 = r24.zzav()     // Catch:{ all -> 0x05a6 }
            r0.zzg()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfe r0 = r0.zzi()     // Catch:{ all -> 0x05a6 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x05a6 }
            r8 = r0
            com.google.android.gms.measurement.internal.zzfe r8 = (com.google.android.gms.measurement.internal.zzfe) r8     // Catch:{ all -> 0x05a6 }
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x05a6 }
            if (r0 == 0) goto L_0x0397
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x05a6 }
            if (r9 == 0) goto L_0x02a6
            goto L_0x0397
        L_0x02a6:
            com.google.android.gms.measurement.internal.zzfu r9 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfr r9 = r9.zzav()     // Catch:{ all -> 0x05a6 }
            r9.zzg()     // Catch:{ all -> 0x05a6 }
            boolean r9 = r8.zza()     // Catch:{ all -> 0x05a6 }
            if (r9 != 0) goto L_0x02c6
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzi()     // Catch:{ all -> 0x05a6 }
            java.lang.String r8 = "Install Referrer Reporter is not available"
            r0.zza(r8)     // Catch:{ all -> 0x05a6 }
            goto L_0x03a6
        L_0x02c6:
            com.google.android.gms.measurement.internal.zzfd r9 = new com.google.android.gms.measurement.internal.zzfd     // Catch:{ all -> 0x05a6 }
            r9.<init>(r8, r0)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfr r0 = r0.zzav()     // Catch:{ all -> 0x05a6 }
            r0.zzg()     // Catch:{ all -> 0x05a6 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x05a6 }
            java.lang.String r13 = "com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE"
            r0.<init>(r13)     // Catch:{ all -> 0x05a6 }
            android.content.ComponentName r13 = new android.content.ComponentName     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "com.google.android.finsky.externalreferrer.GetInstallReferrerService"
            r15 = r23
            r13.<init>(r15, r14)     // Catch:{ all -> 0x05a6 }
            r0.setComponent(r13)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfu r13 = r8.zza     // Catch:{ all -> 0x05a6 }
            android.content.Context r13 = r13.zzax()     // Catch:{ all -> 0x05a6 }
            android.content.pm.PackageManager r13 = r13.getPackageManager()     // Catch:{ all -> 0x05a6 }
            if (r13 != 0) goto L_0x0304
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzf()     // Catch:{ all -> 0x05a6 }
            java.lang.String r8 = "Failed to obtain Package Manager to verify binding conditions for Install Referrer"
            r0.zza(r8)     // Catch:{ all -> 0x05a6 }
            goto L_0x03a6
        L_0x0304:
            r14 = 0
            java.util.List r13 = r13.queryIntentServices(r0, r14)     // Catch:{ all -> 0x05a6 }
            if (r13 == 0) goto L_0x0387
            boolean r16 = r13.isEmpty()     // Catch:{ all -> 0x05a6 }
            if (r16 != 0) goto L_0x0387
            java.lang.Object r13 = r13.get(r14)     // Catch:{ all -> 0x05a6 }
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch:{ all -> 0x05a6 }
            android.content.pm.ServiceInfo r14 = r13.serviceInfo     // Catch:{ all -> 0x05a6 }
            if (r14 == 0) goto L_0x03a6
            android.content.pm.ServiceInfo r14 = r13.serviceInfo     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = r14.packageName     // Catch:{ all -> 0x05a6 }
            android.content.pm.ServiceInfo r13 = r13.serviceInfo     // Catch:{ all -> 0x05a6 }
            java.lang.String r13 = r13.name     // Catch:{ all -> 0x05a6 }
            if (r13 == 0) goto L_0x0377
            boolean r13 = r15.equals(r14)     // Catch:{ all -> 0x05a6 }
            if (r13 == 0) goto L_0x0377
            boolean r13 = r8.zza()     // Catch:{ all -> 0x05a6 }
            if (r13 == 0) goto L_0x0377
            android.content.Intent r13 = new android.content.Intent     // Catch:{ all -> 0x05a6 }
            r13.<init>(r0)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ RuntimeException -> 0x0362 }
            com.google.android.gms.measurement.internal.zzfu r14 = r8.zza     // Catch:{ RuntimeException -> 0x0362 }
            android.content.Context r14 = r14.zzax()     // Catch:{ RuntimeException -> 0x0362 }
            r15 = 1
            boolean r0 = r0.bindService(r14, r13, r9, r15)     // Catch:{ RuntimeException -> 0x0362 }
            com.google.android.gms.measurement.internal.zzfu r9 = r8.zza     // Catch:{ RuntimeException -> 0x0362 }
            com.google.android.gms.measurement.internal.zzem r9 = r9.zzau()     // Catch:{ RuntimeException -> 0x0362 }
            com.google.android.gms.measurement.internal.zzek r9 = r9.zzk()     // Catch:{ RuntimeException -> 0x0362 }
            java.lang.String r13 = "Install Referrer Service is"
            java.lang.String r14 = "available"
            java.lang.String r15 = "not available"
            r16 = r14
            r14 = 1
            if (r14 == r0) goto L_0x035c
            r14 = r15
            goto L_0x035e
        L_0x035c:
            r14 = r16
        L_0x035e:
            r9.zzb(r13, r14)     // Catch:{ RuntimeException -> 0x0362 }
            goto L_0x03a6
        L_0x0362:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzfu r8 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r8 = r8.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r8 = r8.zzb()     // Catch:{ all -> 0x05a6 }
            java.lang.String r9 = "Exception occurred while binding to Install Referrer Service"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x05a6 }
            r8.zzb(r9, r0)     // Catch:{ all -> 0x05a6 }
            goto L_0x03a6
        L_0x0377:
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zze()     // Catch:{ all -> 0x05a6 }
            java.lang.String r8 = "Play Store version 8.3.73 or higher required for Install Referrer"
            r0.zza(r8)     // Catch:{ all -> 0x05a6 }
            goto L_0x03a6
        L_0x0387:
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzi()     // Catch:{ all -> 0x05a6 }
            java.lang.String r8 = "Play Service for fetching Install Referrer is unavailable on device"
            r0.zza(r8)     // Catch:{ all -> 0x05a6 }
            goto L_0x03a6
        L_0x0397:
            com.google.android.gms.measurement.internal.zzfu r0 = r8.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzem r0 = r0.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzf()     // Catch:{ all -> 0x05a6 }
            java.lang.String r8 = "Install Referrer Reporter was called with invalid app package name"
            r0.zza(r8)     // Catch:{ all -> 0x05a6 }
        L_0x03a6:
            com.google.android.gms.measurement.internal.zzfr r0 = r24.zzav()     // Catch:{ all -> 0x05a6 }
            r0.zzg()     // Catch:{ all -> 0x05a6 }
            r24.zzr()     // Catch:{ all -> 0x05a6 }
            android.os.Bundle r8 = new android.os.Bundle     // Catch:{ all -> 0x05a6 }
            r8.<init>()     // Catch:{ all -> 0x05a6 }
            r13 = 1
            r8.putLong(r5, r13)     // Catch:{ all -> 0x05a6 }
            r8.putLong(r4, r13)     // Catch:{ all -> 0x05a6 }
            r4 = 0
            r8.putLong(r7, r4)     // Catch:{ all -> 0x05a6 }
            r8.putLong(r6, r4)     // Catch:{ all -> 0x05a6 }
            r9 = r22
            r8.putLong(r9, r4)     // Catch:{ all -> 0x05a6 }
            r15 = r21
            r8.putLong(r15, r4)     // Catch:{ all -> 0x05a6 }
            r4 = 1
            r8.putLong(r10, r4)     // Catch:{ all -> 0x05a6 }
            boolean r0 = r2.zzp     // Catch:{ all -> 0x05a6 }
            if (r0 == 0) goto L_0x03db
            r8.putLong(r3, r4)     // Catch:{ all -> 0x05a6 }
        L_0x03db:
            java.lang.String r0 = r2.zza     // Catch:{ all -> 0x05a6 }
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch:{ all -> 0x05a6 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r0)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3)     // Catch:{ all -> 0x05a6 }
            r0.zzg()     // Catch:{ all -> 0x05a6 }
            r0.zzZ()     // Catch:{ all -> 0x05a6 }
            java.lang.String r4 = "first_open_count"
            long r4 = r0.zzE(r3, r4)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ all -> 0x05a6 }
            android.content.Context r0 = r0.zzax()     // Catch:{ all -> 0x05a6 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x05a6 }
            if (r0 != 0) goto L_0x041b
            com.google.android.gms.measurement.internal.zzem r0 = r24.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r0 = r0.zzb()     // Catch:{ all -> 0x05a6 }
            java.lang.String r7 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzem.zzl(r3)     // Catch:{ all -> 0x05a6 }
            r0.zzb(r7, r3)     // Catch:{ all -> 0x05a6 }
            r22 = r10
        L_0x0417:
            r9 = 0
            goto L_0x04dd
        L_0x041b:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ NameNotFoundException -> 0x042d }
            android.content.Context r0 = r0.zzax()     // Catch:{ NameNotFoundException -> 0x042d }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x042d }
            r13 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r13)     // Catch:{ NameNotFoundException -> 0x042d }
            r21 = r15
            goto L_0x0442
        L_0x042d:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzem r13 = r24.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r13 = r13.zzb()     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "Package info is null, first open report might be inaccurate. appId"
            r21 = r15
            java.lang.Object r15 = com.google.android.gms.measurement.internal.zzem.zzl(r3)     // Catch:{ all -> 0x05a6 }
            r13.zzc(r14, r15, r0)     // Catch:{ all -> 0x05a6 }
            r0 = 0
        L_0x0442:
            if (r0 == 0) goto L_0x0497
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x05a6 }
            r15 = 0
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 == 0) goto L_0x0497
            long r13 = r0.firstInstallTime     // Catch:{ all -> 0x05a6 }
            r23 = r9
            r22 = r10
            long r9 = r0.lastUpdateTime     // Catch:{ all -> 0x05a6 }
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0478
            com.google.android.gms.measurement.internal.zzae r0 = r24.zzd()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r9 = com.google.android.gms.measurement.internal.zzea.zzak     // Catch:{ all -> 0x05a6 }
            r10 = 0
            boolean r0 = r0.zzn(r10, r9)     // Catch:{ all -> 0x05a6 }
            if (r0 == 0) goto L_0x0472
            r13 = 0
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0470
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x05a6 }
        L_0x0470:
            r15 = 0
            goto L_0x047a
        L_0x0472:
            r13 = 1
            r8.putLong(r7, r13)     // Catch:{ all -> 0x05a6 }
            goto L_0x0470
        L_0x0478:
            r10 = 0
            r15 = 1
        L_0x047a:
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_fi"
            r7 = 1
            if (r7 == r15) goto L_0x0484
            r15 = 0
            goto L_0x0486
        L_0x0484:
            r15 = 1
        L_0x0486:
            java.lang.Long r17 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x05a6 }
            java.lang.String r18 = "auto"
            r13 = r0
            r7 = r21
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x05a6 }
            r1.zzJ(r0, r2)     // Catch:{ all -> 0x05a6 }
            goto L_0x049e
        L_0x0497:
            r23 = r9
            r22 = r10
            r7 = r21
            r10 = 0
        L_0x049e:
            com.google.android.gms.measurement.internal.zzfu r0 = r1.zzm     // Catch:{ NameNotFoundException -> 0x04ae }
            android.content.Context r0 = r0.zzax()     // Catch:{ NameNotFoundException -> 0x04ae }
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch:{ NameNotFoundException -> 0x04ae }
            r9 = 0
            android.content.pm.ApplicationInfo r9 = r0.getApplicationInfo(r3, r9)     // Catch:{ NameNotFoundException -> 0x04ae }
            goto L_0x04c1
        L_0x04ae:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzem r9 = r24.zzau()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzek r9 = r9.zzb()     // Catch:{ all -> 0x05a6 }
            java.lang.String r13 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.zzem.zzl(r3)     // Catch:{ all -> 0x05a6 }
            r9.zzc(r13, r3, r0)     // Catch:{ all -> 0x05a6 }
            r9 = r10
        L_0x04c1:
            if (r9 == 0) goto L_0x0417
            int r0 = r9.flags     // Catch:{ all -> 0x05a6 }
            r3 = 1
            r0 = r0 & r3
            if (r0 == 0) goto L_0x04d0
            r3 = r23
            r13 = 1
            r8.putLong(r3, r13)     // Catch:{ all -> 0x05a6 }
        L_0x04d0:
            int r0 = r9.flags     // Catch:{ all -> 0x05a6 }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0417
            r9 = 1
            r8.putLong(r7, r9)     // Catch:{ all -> 0x05a6 }
            goto L_0x0417
        L_0x04dd:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x04e4
            r8.putLong(r6, r4)     // Catch:{ all -> 0x05a6 }
        L_0x04e4:
            com.google.android.gms.measurement.internal.zzas r0 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x05a6 }
            r15.<init>(r8)     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_f"
            java.lang.String r16 = "auto"
            r13 = r0
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x05a6 }
            r1.zzx(r0, r2)     // Catch:{ all -> 0x05a6 }
            r4 = r22
            goto L_0x0546
        L_0x04fb:
            r22 = r10
            com.google.android.gms.measurement.internal.zzkq r0 = new com.google.android.gms.measurement.internal.zzkq     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_fvt"
            java.lang.Long r17 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x05a6 }
            java.lang.String r18 = "auto"
            r13 = r0
            r15 = r11
            r13.<init>(r14, r15, r17, r18)     // Catch:{ all -> 0x05a6 }
            r1.zzJ(r0, r2)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzfr r0 = r24.zzav()     // Catch:{ all -> 0x05a6 }
            r0.zzg()     // Catch:{ all -> 0x05a6 }
            r24.zzr()     // Catch:{ all -> 0x05a6 }
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x05a6 }
            r0.<init>()     // Catch:{ all -> 0x05a6 }
            r6 = 1
            r0.putLong(r5, r6)     // Catch:{ all -> 0x05a6 }
            r0.putLong(r4, r6)     // Catch:{ all -> 0x05a6 }
            r4 = r22
            r0.putLong(r4, r6)     // Catch:{ all -> 0x05a6 }
            boolean r5 = r2.zzp     // Catch:{ all -> 0x05a6 }
            if (r5 == 0) goto L_0x0532
            r0.putLong(r3, r6)     // Catch:{ all -> 0x05a6 }
        L_0x0532:
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x05a6 }
            r15.<init>(r0)     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_v"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x05a6 }
            r1.zzx(r3, r2)     // Catch:{ all -> 0x05a6 }
        L_0x0546:
            com.google.android.gms.measurement.internal.zzae r0 = r24.zzd()     // Catch:{ all -> 0x05a6 }
            java.lang.String r3 = r2.zza     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzea.zzT     // Catch:{ all -> 0x05a6 }
            boolean r0 = r0.zzn(r3, r5)     // Catch:{ all -> 0x05a6 }
            if (r0 != 0) goto L_0x0595
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x05a6 }
            r0.<init>()     // Catch:{ all -> 0x05a6 }
            r5 = 1
            r0.putLong(r4, r5)     // Catch:{ all -> 0x05a6 }
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r5)     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_e"
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x05a6 }
            r15.<init>(r0)     // Catch:{ all -> 0x05a6 }
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x05a6 }
            r1.zzx(r3, r2)     // Catch:{ all -> 0x05a6 }
            goto L_0x0595
        L_0x0578:
            boolean r0 = r2.zzi     // Catch:{ all -> 0x05a6 }
            if (r0 == 0) goto L_0x0595
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x05a6 }
            r0.<init>()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzas r3 = new com.google.android.gms.measurement.internal.zzas     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzaq r15 = new com.google.android.gms.measurement.internal.zzaq     // Catch:{ all -> 0x05a6 }
            r15.<init>(r0)     // Catch:{ all -> 0x05a6 }
            java.lang.String r14 = "_cd"
            java.lang.String r16 = "auto"
            r13 = r3
            r17 = r11
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x05a6 }
            r1.zzx(r3, r2)     // Catch:{ all -> 0x05a6 }
        L_0x0595:
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze     // Catch:{ all -> 0x05a6 }
            zzak(r0)     // Catch:{ all -> 0x05a6 }
            r0.zzc()     // Catch:{ all -> 0x05a6 }
            com.google.android.gms.measurement.internal.zzai r0 = r1.zze
            zzak(r0)
            r0.zzd()
            return
        L_0x05a6:
            r0 = move-exception
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            throw r0
        L_0x05b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzO(com.google.android.gms.measurement.internal.zzp):void");
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzP(zzaa zzaa) {
        zzp zzai = zzai((String) Preconditions.checkNotNull(zzaa.zza));
        if (zzai != null) {
            zzQ(zzaa, zzai);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzQ(zzaa zzaa, zzp zzp2) {
        zzas zzas;
        Preconditions.checkNotNull(zzaa);
        Preconditions.checkNotEmpty(zzaa.zza);
        Preconditions.checkNotNull(zzaa.zzb);
        Preconditions.checkNotNull(zzaa.zzc);
        Preconditions.checkNotEmpty(zzaa.zzc.zzb);
        zzav().zzg();
        zzr();
        if (zzaj(zzp2)) {
            if (!zzp2.zzh) {
                zzT(zzp2);
                return;
            }
            zzaa zzaa2 = new zzaa(zzaa);
            boolean z = false;
            zzaa2.zze = false;
            zzai zzai = this.zze;
            zzak(zzai);
            zzai.zzb();
            try {
                zzai zzai2 = this.zze;
                zzak(zzai2);
                zzaa zzo2 = zzai2.zzo((String) Preconditions.checkNotNull(zzaa2.zza), zzaa2.zzc.zzb);
                if (zzo2 != null && !zzo2.zzb.equals(zzaa2.zzb)) {
                    zzau().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzm.zzm().zze(zzaa2.zzc.zzb), zzaa2.zzb, zzo2.zzb);
                }
                if (zzo2 != null && zzo2.zze) {
                    zzaa2.zzb = zzo2.zzb;
                    zzaa2.zzd = zzo2.zzd;
                    zzaa2.zzh = zzo2.zzh;
                    zzaa2.zzf = zzo2.zzf;
                    zzaa2.zzi = zzo2.zzi;
                    zzaa2.zze = true;
                    zzkq zzkq = zzaa2.zzc;
                    zzaa2.zzc = new zzkq(zzkq.zzb, zzo2.zzc.zzc, zzkq.zza(), zzo2.zzc.zzf);
                } else if (TextUtils.isEmpty(zzaa2.zzf)) {
                    zzkq zzkq2 = zzaa2.zzc;
                    zzaa2.zzc = new zzkq(zzkq2.zzb, zzaa2.zzd, zzkq2.zza(), zzaa2.zzc.zzf);
                    zzaa2.zze = true;
                    z = true;
                }
                if (zzaa2.zze) {
                    zzkq zzkq3 = zzaa2.zzc;
                    zzks zzks = new zzks((String) Preconditions.checkNotNull(zzaa2.zza), zzaa2.zzb, zzkq3.zzb, zzkq3.zzc, Preconditions.checkNotNull(zzkq3.zza()));
                    zzai zzai3 = this.zze;
                    zzak(zzai3);
                    if (zzai3.zzj(zzks)) {
                        zzau().zzj().zzd("User property updated immediately", zzaa2.zza, this.zzm.zzm().zze(zzks.zzc), zzks.zze);
                    } else {
                        zzau().zzb().zzd("(2)Too many active user properties, ignoring", zzem.zzl(zzaa2.zza), this.zzm.zzm().zze(zzks.zzc), zzks.zze);
                    }
                    if (z && (zzas = zzaa2.zzi) != null) {
                        zzz(new zzas(zzas, zzaa2.zzd), zzp2);
                    }
                }
                zzai zzai4 = this.zze;
                zzak(zzai4);
                if (zzai4.zzn(zzaa2)) {
                    zzau().zzj().zzd("Conditional property added", zzaa2.zza, this.zzm.zzm().zze(zzaa2.zzc.zzb), zzaa2.zzc.zza());
                } else {
                    zzau().zzb().zzd("Too many conditional properties, ignoring", zzem.zzl(zzaa2.zza), this.zzm.zzm().zze(zzaa2.zzc.zzb), zzaa2.zzc.zza());
                }
                zzai zzai5 = this.zze;
                zzak(zzai5);
                zzai5.zzc();
            } finally {
                zzai zzai6 = this.zze;
                zzak(zzai6);
                zzai6.zzd();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzR(zzaa zzaa) {
        zzp zzai = zzai((String) Preconditions.checkNotNull(zzaa.zza));
        if (zzai != null) {
            zzS(zzaa, zzai);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzS(zzaa zzaa, zzp zzp2) {
        Preconditions.checkNotNull(zzaa);
        Preconditions.checkNotEmpty(zzaa.zza);
        Preconditions.checkNotNull(zzaa.zzc);
        Preconditions.checkNotEmpty(zzaa.zzc.zzb);
        zzav().zzg();
        zzr();
        if (zzaj(zzp2)) {
            if (zzp2.zzh) {
                zzai zzai = this.zze;
                zzak(zzai);
                zzai.zzb();
                try {
                    zzT(zzp2);
                    String str = (String) Preconditions.checkNotNull(zzaa.zza);
                    zzai zzai2 = this.zze;
                    zzak(zzai2);
                    zzaa zzo2 = zzai2.zzo(str, zzaa.zzc.zzb);
                    if (zzo2 != null) {
                        zzau().zzj().zzc("Removing conditional user property", zzaa.zza, this.zzm.zzm().zze(zzaa.zzc.zzb));
                        zzai zzai3 = this.zze;
                        zzak(zzai3);
                        zzai3.zzp(str, zzaa.zzc.zzb);
                        if (zzo2.zze) {
                            zzai zzai4 = this.zze;
                            zzak(zzai4);
                            zzai4.zzi(str, zzaa.zzc.zzb);
                        }
                        zzas zzas = zzaa.zzk;
                        if (zzas != null) {
                            zzaq zzaq = zzas.zzb;
                            zzz((zzas) Preconditions.checkNotNull(zzq().zzV(str, ((zzas) Preconditions.checkNotNull(zzaa.zzk)).zza, zzaq != null ? zzaq.zzf() : null, zzo2.zzb, zzaa.zzk.zzd, true, false)), zzp2);
                        }
                    } else {
                        zzau().zze().zzc("Conditional user property doesn't exist", zzem.zzl(zzaa.zza), this.zzm.zzm().zze(zzaa.zzc.zzb));
                    }
                    zzai zzai5 = this.zze;
                    zzak(zzai5);
                    zzai5.zzc();
                } finally {
                    zzai zzai6 = this.zze;
                    zzak(zzai6);
                    zzai6.zzd();
                }
            } else {
                zzT(zzp2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02eb, code lost:
        if (r8 != false) goto L_0x02ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x024c  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.zzg zzT(com.google.android.gms.measurement.internal.zzp r12) {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.zzfr r0 = r11.zzav()
            r0.zzg()
            r11.zzr()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r12)
            java.lang.String r0 = r12.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.measurement.internal.zzai r0 = r11.zze
            zzak(r0)
            java.lang.String r1 = r12.zza
            com.google.android.gms.measurement.internal.zzg r0 = r0.zzs(r1)
            java.lang.String r1 = r12.zza
            com.google.android.gms.measurement.internal.zzaf r1 = r11.zzt(r1)
            java.lang.String r2 = r12.zzv
            com.google.android.gms.measurement.internal.zzaf r2 = com.google.android.gms.measurement.internal.zzaf.zzc(r2)
            com.google.android.gms.measurement.internal.zzaf r1 = r1.zzk(r2)
            boolean r2 = r1.zzf()
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.zzjl r2 = r11.zzk
            java.lang.String r3 = r12.zza
            java.lang.String r2 = r2.zzf(r3)
            goto L_0x003e
        L_0x003c:
            java.lang.String r2 = ""
        L_0x003e:
            com.google.android.gms.internal.measurement.zzoj.zzb()
            com.google.android.gms.measurement.internal.zzae r3 = r11.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzea.zzal
            r5 = 0
            boolean r3 = r3.zzn(r5, r4)
            r6 = 0
            if (r3 == 0) goto L_0x013d
            if (r0 != 0) goto L_0x0072
            com.google.android.gms.measurement.internal.zzg r0 = new com.google.android.gms.measurement.internal.zzg
            com.google.android.gms.measurement.internal.zzfu r3 = r11.zzm
            java.lang.String r4 = r12.zza
            r0.<init>(r3, r4)
            boolean r3 = r1.zzh()
            if (r3 == 0) goto L_0x0068
            java.lang.String r3 = r11.zzA(r1)
            r0.zze(r3)
        L_0x0068:
            boolean r1 = r1.zzf()
            if (r1 == 0) goto L_0x00a6
            r0.zzm(r2)
            goto L_0x00a6
        L_0x0072:
            boolean r3 = r1.zzf()
            if (r3 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            java.lang.String r3 = r0.zzl()
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x008f
            r0.zzm(r2)
            java.lang.String r1 = r11.zzA(r1)
            r0.zze(r1)
            goto L_0x00a6
        L_0x008f:
            java.lang.String r2 = r0.zzd()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00a6
            boolean r2 = r1.zzh()
            if (r2 == 0) goto L_0x00a6
            java.lang.String r1 = r11.zzA(r1)
            r0.zze(r1)
        L_0x00a6:
            java.lang.String r1 = r12.zzb
            r0.zzg(r1)
            java.lang.String r1 = r12.zzq
            r0.zzi(r1)
            com.google.android.gms.internal.measurement.zzov.zzb()
            com.google.android.gms.measurement.internal.zzae r1 = r11.zzd()
            java.lang.String r2 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzea.zzag
            boolean r1 = r1.zzn(r2, r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r12.zzu
            r0.zzk(r1)
        L_0x00c8:
            java.lang.String r1 = r12.zzk
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d5
            java.lang.String r1 = r12.zzk
            r0.zzo(r1)
        L_0x00d5:
            long r1 = r12.zze
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00de
            r0.zzA(r1)
        L_0x00de:
            java.lang.String r1 = r12.zzc
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00eb
            java.lang.String r1 = r12.zzc
            r0.zzu(r1)
        L_0x00eb:
            long r1 = r12.zzj
            r0.zzw(r1)
            java.lang.String r1 = r12.zzd
            if (r1 == 0) goto L_0x00f7
            r0.zzy(r1)
        L_0x00f7:
            long r1 = r12.zzf
            r0.zzC(r1)
            boolean r1 = r12.zzh
            r0.zzG(r1)
            java.lang.String r1 = r12.zzg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x010e
            java.lang.String r1 = r12.zzg
            r0.zzac(r1)
        L_0x010e:
            com.google.android.gms.measurement.internal.zzae r1 = r11.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzea.zzat
            boolean r1 = r1.zzn(r5, r2)
            if (r1 != 0) goto L_0x011f
            long r1 = r12.zzl
            r0.zzae(r1)
        L_0x011f:
            boolean r1 = r12.zzo
            r0.zzag(r1)
            java.lang.Boolean r1 = r12.zzr
            r0.zzai(r1)
            long r1 = r12.zzs
            r0.zzE(r1)
            boolean r12 = r0.zza()
            if (r12 == 0) goto L_0x013c
            com.google.android.gms.measurement.internal.zzai r12 = r11.zze
            zzak(r12)
            r12.zzt(r0)
        L_0x013c:
            return r0
        L_0x013d:
            java.lang.String r1 = r12.zza
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            com.google.android.gms.measurement.internal.zzaf r3 = r11.zzt(r1)
            java.lang.String r4 = r12.zzv
            com.google.android.gms.measurement.internal.zzaf r4 = com.google.android.gms.measurement.internal.zzaf.zzc(r4)
            com.google.android.gms.measurement.internal.zzaf r3 = r3.zzk(r4)
            r4 = 0
            r8 = 1
            if (r0 != 0) goto L_0x0176
            com.google.android.gms.measurement.internal.zzg r0 = new com.google.android.gms.measurement.internal.zzg
            com.google.android.gms.measurement.internal.zzfu r4 = r11.zzm
            r0.<init>(r4, r1)
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L_0x016b
            java.lang.String r1 = r11.zzA(r3)
            r0.zze(r1)
        L_0x016b:
            boolean r1 = r3.zzf()
            if (r1 == 0) goto L_0x0174
            r0.zzm(r2)
        L_0x0174:
            r4 = 1
            goto L_0x01b1
        L_0x0176:
            boolean r1 = r3.zzf()
            if (r1 == 0) goto L_0x0199
            if (r2 == 0) goto L_0x0199
            java.lang.String r1 = r0.zzl()
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0199
            r0.zzm(r2)
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L_0x0174
            java.lang.String r1 = r11.zzA(r3)
            r0.zze(r1)
            goto L_0x0174
        L_0x0199:
            java.lang.String r1 = r0.zzd()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x01b1
            boolean r1 = r3.zzh()
            if (r1 == 0) goto L_0x01b1
            java.lang.String r1 = r11.zzA(r3)
            r0.zze(r1)
            goto L_0x0174
        L_0x01b1:
            java.lang.String r1 = r12.zzb
            java.lang.String r2 = r0.zzf()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01c3
            java.lang.String r1 = r12.zzb
            r0.zzg(r1)
            r4 = 1
        L_0x01c3:
            java.lang.String r1 = r12.zzq
            java.lang.String r2 = r0.zzh()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01d5
            java.lang.String r1 = r12.zzq
            r0.zzi(r1)
            r4 = 1
        L_0x01d5:
            com.google.android.gms.internal.measurement.zzov.zzb()
            com.google.android.gms.measurement.internal.zzae r1 = r11.zzd()
            java.lang.String r2 = r0.zzc()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzea.zzag
            boolean r1 = r1.zzn(r2, r3)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = r12.zzu
            java.lang.String r2 = r0.zzj()
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x01fa
            java.lang.String r1 = r12.zzu
            r0.zzk(r1)
            r4 = 1
        L_0x01fa:
            java.lang.String r1 = r12.zzk
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0214
            java.lang.String r1 = r12.zzk
            java.lang.String r2 = r0.zzn()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0214
            java.lang.String r1 = r12.zzk
            r0.zzo(r1)
            r4 = 1
        L_0x0214:
            long r1 = r12.zze
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0228
            long r9 = r0.zzz()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0228
            long r1 = r12.zze
            r0.zzA(r1)
            r4 = 1
        L_0x0228:
            java.lang.String r1 = r12.zzc
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0242
            java.lang.String r1 = r12.zzc
            java.lang.String r2 = r0.zzt()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0242
            java.lang.String r1 = r12.zzc
            r0.zzu(r1)
            r4 = 1
        L_0x0242:
            long r1 = r12.zzj
            long r9 = r0.zzv()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0252
            long r1 = r12.zzj
            r0.zzw(r1)
            r4 = 1
        L_0x0252:
            java.lang.String r1 = r12.zzd
            if (r1 == 0) goto L_0x0266
            java.lang.String r2 = r0.zzx()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0266
            java.lang.String r1 = r12.zzd
            r0.zzy(r1)
            r4 = 1
        L_0x0266:
            long r1 = r12.zzf
            long r9 = r0.zzB()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x0276
            long r1 = r12.zzf
            r0.zzC(r1)
            r4 = 1
        L_0x0276:
            boolean r1 = r12.zzh
            boolean r2 = r0.zzF()
            if (r1 == r2) goto L_0x0284
            boolean r1 = r12.zzh
            r0.zzG(r1)
            r4 = 1
        L_0x0284:
            java.lang.String r1 = r12.zzg
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x029e
            java.lang.String r1 = r12.zzg
            java.lang.String r2 = r0.zzaa()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x029e
            java.lang.String r1 = r12.zzg
            r0.zzac(r1)
            r4 = 1
        L_0x029e:
            com.google.android.gms.measurement.internal.zzae r1 = r11.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.zzea.zzat
            boolean r1 = r1.zzn(r5, r2)
            if (r1 != 0) goto L_0x02ba
            long r1 = r12.zzl
            long r9 = r0.zzad()
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 == 0) goto L_0x02ba
            long r1 = r12.zzl
            r0.zzae(r1)
            r4 = 1
        L_0x02ba:
            boolean r1 = r12.zzo
            boolean r2 = r0.zzaf()
            if (r1 == r2) goto L_0x02c8
            boolean r1 = r12.zzo
            r0.zzag(r1)
            r4 = 1
        L_0x02c8:
            java.lang.Boolean r1 = r12.zzr
            java.lang.Boolean r2 = r0.zzah()
            if (r1 == r2) goto L_0x02d6
            java.lang.Boolean r1 = r12.zzr
            r0.zzai(r1)
            goto L_0x02d7
        L_0x02d6:
            r8 = r4
        L_0x02d7:
            long r1 = r12.zzs
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x02eb
            long r3 = r0.zzD()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x02eb
            long r1 = r12.zzs
            r0.zzE(r1)
            goto L_0x02ed
        L_0x02eb:
            if (r8 == 0) goto L_0x02f5
        L_0x02ed:
            com.google.android.gms.measurement.internal.zzai r12 = r11.zze
            zzak(r12)
            r12.zzt(r0)
        L_0x02f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzT(com.google.android.gms.measurement.internal.zzp):com.google.android.gms.measurement.internal.zzg");
    }

    /* access modifiers changed from: package-private */
    public final String zzU(zzp zzp2) {
        try {
            return (String) zzav().zze(new zzkj(this, zzp2)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzau().zzb().zzc("Failed to get app instance id. appId", zzem.zzl(zzp2.zza), e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzV(boolean z) {
        zzaf();
    }

    public final zzz zzat() {
        throw null;
    }

    public final zzem zzau() {
        return ((zzfu) Preconditions.checkNotNull(this.zzm)).zzau();
    }

    public final zzfr zzav() {
        return ((zzfu) Preconditions.checkNotNull(this.zzm)).zzav();
    }

    public final Context zzax() {
        return this.zzm.zzax();
    }

    public final Clock zzay() {
        return ((zzfu) Preconditions.checkNotNull(this.zzm)).zzay();
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public final void zzc() {
        zzav().zzg();
        zzai zzai = this.zze;
        zzak(zzai);
        zzai.zzA();
        if (this.zzk.zzc.zza() == 0) {
            this.zzk.zzc.zzb(zzay().currentTimeMillis());
        }
        zzaf();
    }

    public final zzae zzd() {
        return ((zzfu) Preconditions.checkNotNull(this.zzm)).zzc();
    }

    public final zzfl zzf() {
        zzfl zzfl = this.zzc;
        zzak(zzfl);
        return zzfl;
    }

    public final zzes zzh() {
        zzes zzes = this.zzd;
        zzak(zzes);
        return zzes;
    }

    public final zzai zzi() {
        zzai zzai = this.zze;
        zzak(zzai);
        return zzai;
    }

    public final zzeu zzj() {
        zzeu zzeu = this.zzf;
        if (zzeu != null) {
            return zzeu;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzy zzk() {
        zzy zzy2 = this.zzh;
        zzak(zzy2);
        return zzy2;
    }

    public final zzib zzl() {
        zzib zzib = this.zzj;
        zzak(zzib);
        return zzib;
    }

    public final zzkp zzm() {
        zzkp zzkp = this.zzi;
        zzak(zzkp);
        return zzkp;
    }

    public final zzjl zzn() {
        return this.zzk;
    }

    public final zzeh zzo() {
        return this.zzm.zzm();
    }

    public final zzku zzq() {
        return ((zzfu) Preconditions.checkNotNull(this.zzm)).zzl();
    }

    /* access modifiers changed from: package-private */
    public final void zzr() {
        if (!this.zzn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzs(String str, zzaf zzaf) {
        zzav().zzg();
        zzr();
        this.zzA.put(str, zzaf);
        zzai zzai = this.zze;
        zzak(zzai);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzaf);
        zzai.zzg();
        zzai.zzZ();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", zzaf.zzd());
        try {
            if (zzai.zze().insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                zzai.zzs.zzau().zzb().zzb("Failed to insert/update consent setting (got -1). appId", zzem.zzl(str));
            }
        } catch (SQLiteException e) {
            zzai.zzs.zzau().zzb().zzc("Error storing consent setting. appId, error", zzem.zzl(str), e);
        }
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final zzaf zzt(String str) {
        String str2;
        zzav().zzg();
        zzr();
        zzaf zzaf = this.zzA.get(str);
        if (zzaf != null) {
            return zzaf;
        }
        zzai zzai = this.zze;
        zzak(zzai);
        Preconditions.checkNotNull(str);
        zzai.zzg();
        zzai.zzZ();
        Cursor cursor = null;
        try {
            Cursor rawQuery = zzai.zze().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
            if (rawQuery.moveToFirst()) {
                str2 = rawQuery.getString(0);
                if (rawQuery != null) {
                    rawQuery.close();
                }
            } else {
                if (rawQuery != null) {
                    rawQuery.close();
                }
                str2 = "G1";
            }
            zzaf zzc2 = zzaf.zzc(str2);
            zzs(str, zzc2);
            return zzc2;
        } catch (SQLiteException e) {
            zzai.zzs.zzau().zzb().zzc("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
            throw e;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final long zzu() {
        long currentTimeMillis = zzay().currentTimeMillis();
        zzjl zzjl = this.zzk;
        zzjl.zzZ();
        zzjl.zzg();
        long zza2 = zzjl.zze.zza();
        if (zza2 == 0) {
            zza2 = ((long) zzjl.zzs.zzl().zzf().nextInt(86400000)) + 1;
            zzjl.zze.zzb(zza2);
        }
        return ((((currentTimeMillis + zza2) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzv(zzas zzas, String str) {
        zzas zzas2 = zzas;
        String str2 = str;
        zzai zzai = this.zze;
        zzak(zzai);
        zzg zzs2 = zzai.zzs(str2);
        if (zzs2 == null || TextUtils.isEmpty(zzs2.zzt())) {
            zzau().zzj().zzb("No app data available; dropping event", str2);
            return;
        }
        Boolean zzah = zzah(zzs2);
        if (zzah == null) {
            if (!"_ui".equals(zzas2.zza)) {
                zzau().zze().zzb("Could not find package. appId", zzem.zzl(str));
            }
        } else if (!zzah.booleanValue()) {
            zzau().zzb().zzb("App version does not match; dropping event. appId", zzem.zzl(str));
            return;
        }
        String zzf2 = zzs2.zzf();
        String zzt2 = zzs2.zzt();
        long zzv2 = zzs2.zzv();
        String zzx2 = zzs2.zzx();
        long zzz2 = zzs2.zzz();
        long zzB2 = zzs2.zzB();
        boolean zzF = zzs2.zzF();
        String zzn2 = zzs2.zzn();
        long zzad = zzs2.zzad();
        boolean zzaf = zzs2.zzaf();
        String zzh2 = zzs2.zzh();
        Boolean zzah2 = zzs2.zzah();
        long zzD = zzs2.zzD();
        List<String> zzaj = zzs2.zzaj();
        zzov.zzb();
        zzp zzp2 = r2;
        zzp zzp3 = new zzp(str, zzf2, zzt2, zzv2, zzx2, zzz2, zzB2, (String) null, zzF, false, zzn2, zzad, 0, 0, zzaf, false, zzh2, zzah2, zzD, zzaj, zzd().zzn(zzs2.zzc(), zzea.zzag) ? zzs2.zzj() : null, zzt(str2).zzd());
        zzx(zzas, zzp2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzx(zzas zzas, zzp zzp2) {
        Preconditions.checkNotEmpty(zzp2.zza);
        zzen zza2 = zzen.zza(zzas);
        zzku zzq2 = zzq();
        Bundle bundle = zza2.zzd;
        zzai zzai = this.zze;
        zzak(zzai);
        zzq2.zzH(bundle, zzai.zzK(zzp2.zza));
        zzq().zzG(zza2, zzd().zzd(zzp2.zza));
        zzas zzb2 = zza2.zzb();
        if (zzd().zzn((String) null, zzea.zzab) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzb2.zza) && "referrer API v2".equals(zzb2.zzb.zzd("_cis"))) {
            String zzd2 = zzb2.zzb.zzd("gclid");
            if (!TextUtils.isEmpty(zzd2)) {
                zzJ(new zzkq("_lgclid", zzb2.zzd, zzd2, "auto"), zzp2);
            }
        }
        zzy(zzb2, zzp2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzy(zzas zzas, zzp zzp2) {
        List<zzaa> list;
        List<zzaa> list2;
        List<zzaa> list3;
        zzas zzas2 = zzas;
        zzp zzp3 = zzp2;
        Preconditions.checkNotNull(zzp2);
        Preconditions.checkNotEmpty(zzp3.zza);
        zzav().zzg();
        zzr();
        String str = zzp3.zza;
        long j = zzas2.zzd;
        zzak(this.zzi);
        if (zzkp.zzz(zzas, zzp2)) {
            if (!zzp3.zzh) {
                zzT(zzp3);
                return;
            }
            List<String> list4 = zzp3.zzt;
            if (list4 != null) {
                if (list4.contains(zzas2.zza)) {
                    Bundle zzf2 = zzas2.zzb.zzf();
                    zzf2.putLong("ga_safelisted", 1);
                    zzas2 = new zzas(zzas2.zza, new zzaq(zzf2), zzas2.zzc, zzas2.zzd);
                } else {
                    zzau().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str, zzas2.zza, zzas2.zzc);
                    return;
                }
            }
            zzai zzai = this.zze;
            zzak(zzai);
            zzai.zzb();
            try {
                zzai zzai2 = this.zze;
                zzak(zzai2);
                Preconditions.checkNotEmpty(str);
                zzai2.zzg();
                zzai2.zzZ();
                if (j < 0) {
                    zzai2.zzs.zzau().zze().zzc("Invalid time querying timed out conditional properties", zzem.zzl(str), Long.valueOf(j));
                    list = Collections.emptyList();
                } else {
                    list = zzai2.zzr("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j)});
                }
                for (zzaa next : list) {
                    if (next != null) {
                        zzau().zzk().zzd("User property timed out", next.zza, this.zzm.zzm().zze(next.zzc.zzb), next.zzc.zza());
                        zzas zzas3 = next.zzg;
                        if (zzas3 != null) {
                            zzz(new zzas(zzas3, j), zzp3);
                        }
                        zzai zzai3 = this.zze;
                        zzak(zzai3);
                        zzai3.zzp(str, next.zzc.zzb);
                    }
                }
                zzai zzai4 = this.zze;
                zzak(zzai4);
                Preconditions.checkNotEmpty(str);
                zzai4.zzg();
                zzai4.zzZ();
                if (j < 0) {
                    zzai4.zzs.zzau().zze().zzc("Invalid time querying expired conditional properties", zzem.zzl(str), Long.valueOf(j));
                    list2 = Collections.emptyList();
                } else {
                    list2 = zzai4.zzr("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j)});
                }
                ArrayList<zzas> arrayList = new ArrayList<>(list2.size());
                for (zzaa next2 : list2) {
                    if (next2 != null) {
                        zzau().zzk().zzd("User property expired", next2.zza, this.zzm.zzm().zze(next2.zzc.zzb), next2.zzc.zza());
                        zzai zzai5 = this.zze;
                        zzak(zzai5);
                        zzai5.zzi(str, next2.zzc.zzb);
                        zzas zzas4 = next2.zzk;
                        if (zzas4 != null) {
                            arrayList.add(zzas4);
                        }
                        zzai zzai6 = this.zze;
                        zzak(zzai6);
                        zzai6.zzp(str, next2.zzc.zzb);
                    }
                }
                for (zzas zzas5 : arrayList) {
                    zzz(new zzas(zzas5, j), zzp3);
                }
                zzai zzai7 = this.zze;
                zzak(zzai7);
                String str2 = zzas2.zza;
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotEmpty(str2);
                zzai7.zzg();
                zzai7.zzZ();
                if (j < 0) {
                    zzai7.zzs.zzau().zze().zzd("Invalid time querying triggered conditional properties", zzem.zzl(str), zzai7.zzs.zzm().zzc(str2), Long.valueOf(j));
                    list3 = Collections.emptyList();
                } else {
                    list3 = zzai7.zzr("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j)});
                }
                ArrayList<zzas> arrayList2 = new ArrayList<>(list3.size());
                for (zzaa next3 : list3) {
                    if (next3 != null) {
                        zzkq zzkq = next3.zzc;
                        zzks zzks = new zzks((String) Preconditions.checkNotNull(next3.zza), next3.zzb, zzkq.zzb, j, Preconditions.checkNotNull(zzkq.zza()));
                        zzai zzai8 = this.zze;
                        zzak(zzai8);
                        if (zzai8.zzj(zzks)) {
                            zzau().zzk().zzd("User property triggered", next3.zza, this.zzm.zzm().zze(zzks.zzc), zzks.zze);
                        } else {
                            zzau().zzb().zzd("Too many active user properties, ignoring", zzem.zzl(next3.zza), this.zzm.zzm().zze(zzks.zzc), zzks.zze);
                        }
                        zzas zzas6 = next3.zzi;
                        if (zzas6 != null) {
                            arrayList2.add(zzas6);
                        }
                        next3.zzc = new zzkq(zzks);
                        next3.zze = true;
                        zzai zzai9 = this.zze;
                        zzak(zzai9);
                        zzai9.zzn(next3);
                    }
                }
                zzz(zzas2, zzp3);
                for (zzas zzas7 : arrayList2) {
                    zzz(new zzas(zzas7, j), zzp3);
                }
                zzai zzai10 = this.zze;
                zzak(zzai10);
                zzai10.zzc();
            } finally {
                zzai zzai11 = this.zze;
                zzak(zzai11);
                zzai11.zzd();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07e7, code lost:
        if (r14.size() == 0) goto L_0x07e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x09fa, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0325 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x037c A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x037f A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03e1 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x040e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0578 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x05b6 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x063a A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0685 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0692 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x069f A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x06ad A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x06be A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x06f1 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x072a A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0749 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0764 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x07ec A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x080b A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x087b A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x0888 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x08a2 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x093c A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x095b A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x09f0 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0a9c A[Catch:{ SQLiteException -> 0x0ab7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0ab2  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x09fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01a7 A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be A[SYNTHETIC, Splitter:B:57:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x023c A[Catch:{ NumberFormatException -> 0x07d1, all -> 0x0b3b }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzz(com.google.android.gms.measurement.internal.zzas r33, com.google.android.gms.measurement.internal.zzp r34) {
        /*
            r32 = this;
            r1 = r32
            r2 = r33
            r3 = r34
            java.lang.String r4 = "metadata_fingerprint"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "raw_events"
            java.lang.String r7 = "_sno"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r34)
            java.lang.String r8 = r3.zza
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r8)
            long r8 = java.lang.System.nanoTime()
            com.google.android.gms.measurement.internal.zzfr r10 = r32.zzav()
            r10.zzg()
            r32.zzr()
            java.lang.String r10 = r3.zza
            com.google.android.gms.measurement.internal.zzkp r11 = r1.zzi
            zzak(r11)
            boolean r11 = com.google.android.gms.measurement.internal.zzkp.zzz(r33, r34)
            if (r11 != 0) goto L_0x0032
            return
        L_0x0032:
            boolean r11 = r3.zzh
            if (r11 == 0) goto L_0x0b46
            com.google.android.gms.measurement.internal.zzfl r11 = r1.zzc
            zzak(r11)
            java.lang.String r12 = r2.zza
            boolean r11 = r11.zzj(r10, r12)
            java.lang.String r15 = "_err"
            r14 = 0
            if (r11 == 0) goto L_0x00ea
            com.google.android.gms.measurement.internal.zzem r3 = r32.zzau()
            com.google.android.gms.measurement.internal.zzek r3 = r3.zze()
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r10)
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzm
            com.google.android.gms.measurement.internal.zzeh r5 = r5.zzm()
            java.lang.String r6 = r2.zza
            java.lang.String r5 = r5.zzc(r6)
            java.lang.String r6 = "Dropping blacklisted event. appId"
            r3.zzc(r6, r4, r5)
            com.google.android.gms.measurement.internal.zzfl r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzm(r10)
            if (r3 != 0) goto L_0x00a2
            com.google.android.gms.measurement.internal.zzfl r3 = r1.zzc
            zzak(r3)
            boolean r3 = r3.zzn(r10)
            if (r3 == 0) goto L_0x007a
            goto L_0x00a2
        L_0x007a:
            java.lang.String r3 = r2.zza
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()
            com.google.android.gms.measurement.internal.zzkt r12 = r1.zzB
            r3 = 11
            java.lang.String r2 = r2.zza
            r17 = 0
            com.google.android.gms.measurement.internal.zzae r4 = r32.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.zzea.zzav
            boolean r18 = r4.zzn(r14, r5)
            java.lang.String r15 = "_ev"
            r13 = r10
            r14 = r3
            r16 = r2
            r11.zzM(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00a2:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            com.google.android.gms.measurement.internal.zzg r2 = r2.zzs(r10)
            if (r2 == 0) goto L_0x00e9
            long r3 = r2.zzL()
            long r5 = r2.zzJ()
            long r3 = java.lang.Math.max(r3, r5)
            com.google.android.gms.common.util.Clock r5 = r32.zzay()
            long r5 = r5.currentTimeMillis()
            long r5 = r5 - r3
            long r3 = java.lang.Math.abs(r5)
            r32.zzd()
            com.google.android.gms.measurement.internal.zzdz<java.lang.Long> r5 = com.google.android.gms.measurement.internal.zzea.zzy
            java.lang.Object r5 = r5.zzb(r14)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.zzem r3 = r32.zzau()
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzj()
            java.lang.String r4 = "Fetching config for blacklisted app"
            r3.zza(r4)
            r1.zzD(r2)
        L_0x00e9:
            return
        L_0x00ea:
            com.google.android.gms.measurement.internal.zzen r2 = com.google.android.gms.measurement.internal.zzen.zza(r33)
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()
            com.google.android.gms.measurement.internal.zzae r12 = r32.zzd()
            int r12 = r12.zzd(r10)
            r11.zzG(r2, r12)
            com.google.android.gms.measurement.internal.zzas r2 = r2.zzb()
            com.google.android.gms.measurement.internal.zzem r11 = r32.zzau()
            java.lang.String r11 = r11.zzn()
            r13 = 2
            boolean r11 = android.util.Log.isLoggable(r11, r13)
            if (r11 == 0) goto L_0x0170
            com.google.android.gms.measurement.internal.zzem r11 = r32.zzau()
            com.google.android.gms.measurement.internal.zzek r11 = r11.zzk()
            com.google.android.gms.measurement.internal.zzfu r12 = r1.zzm
            com.google.android.gms.measurement.internal.zzeh r12 = r12.zzm()
            boolean r16 = r12.zzb()
            if (r16 != 0) goto L_0x0129
            java.lang.String r12 = r2.toString()
            goto L_0x016b
        L_0x0129:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "origin="
            r13.append(r14)
            java.lang.String r14 = r2.zzc
            r13.append(r14)
            java.lang.String r14 = ",name="
            r13.append(r14)
            java.lang.String r14 = r2.zza
            java.lang.String r14 = r12.zzc(r14)
            r13.append(r14)
            java.lang.String r14 = ",params="
            r13.append(r14)
            com.google.android.gms.measurement.internal.zzaq r14 = r2.zzb
            if (r14 != 0) goto L_0x0151
            r12 = 0
            goto L_0x0164
        L_0x0151:
            boolean r17 = r12.zzb()
            if (r17 != 0) goto L_0x015c
            java.lang.String r12 = r14.toString()
            goto L_0x0164
        L_0x015c:
            android.os.Bundle r14 = r14.zzf()
            java.lang.String r12 = r12.zzf(r14)
        L_0x0164:
            r13.append(r12)
            java.lang.String r12 = r13.toString()
        L_0x016b:
            java.lang.String r13 = "Logging event"
            r11.zzb(r13, r12)
        L_0x0170:
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze
            zzak(r11)
            r11.zzb()
            r1.zzT(r3)     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = "ecommerce_purchase"
            java.lang.String r12 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0b3b }
            java.lang.String r12 = "refund"
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = "purchase"
            java.lang.String r13 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x0b3b }
            if (r11 != 0) goto L_0x019c
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b3b }
            if (r11 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            r11 = 0
            goto L_0x019d
        L_0x019c:
            r11 = 1
        L_0x019d:
            java.lang.String r13 = "_iap"
            java.lang.String r14 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x0b3b }
            if (r13 != 0) goto L_0x01b2
            if (r11 == 0) goto L_0x01ab
            r11 = 1
            goto L_0x01b2
        L_0x01ab:
            r28 = r8
            r30 = r15
        L_0x01af:
            r8 = 2
            goto L_0x0367
        L_0x01b2:
            com.google.android.gms.measurement.internal.zzaq r13 = r2.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.String r14 = "currency"
            java.lang.String r13 = r13.zzd(r14)     // Catch:{ all -> 0x0b3b }
            java.lang.String r14 = "value"
            if (r11 == 0) goto L_0x022a
            com.google.android.gms.measurement.internal.zzaq r11 = r2.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.Double r11 = r11.zzc(r14)     // Catch:{ all -> 0x0b3b }
            double r19 = r11.doubleValue()     // Catch:{ all -> 0x0b3b }
            r21 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r19 = r19 * r21
            r23 = 0
            int r11 = (r19 > r23 ? 1 : (r19 == r23 ? 0 : -1))
            if (r11 != 0) goto L_0x01e8
            com.google.android.gms.measurement.internal.zzaq r11 = r2.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.Long r11 = r11.zzb(r14)     // Catch:{ all -> 0x0b3b }
            r23 = r15
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b3b }
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r19 = r14 * r21
            goto L_0x01ea
        L_0x01e8:
            r23 = r15
        L_0x01ea:
            r14 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 > 0) goto L_0x0204
            r14 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r11 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            if (r11 < 0) goto L_0x0204
            long r14 = java.lang.Math.round(r19)     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r11 = r12.equals(r11)     // Catch:{ all -> 0x0b3b }
            if (r11 == 0) goto L_0x0236
            long r14 = -r14
            goto L_0x0236
        L_0x0204:
            com.google.android.gms.measurement.internal.zzem r2 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zze()     // Catch:{ all -> 0x0b3b }
            java.lang.String r3 = "Data lost. Currency value is too big. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.Double r5 = java.lang.Double.valueOf(r19)     // Catch:{ all -> 0x0b3b }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            r2.zzc()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            return
        L_0x022a:
            r23 = r15
            com.google.android.gms.measurement.internal.zzaq r11 = r2.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.Long r11 = r11.zzb(r14)     // Catch:{ all -> 0x0b3b }
            long r14 = r11.longValue()     // Catch:{ all -> 0x0b3b }
        L_0x0236:
            boolean r11 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0b3b }
            if (r11 != 0) goto L_0x0361
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r13.toUpperCase(r11)     // Catch:{ all -> 0x0b3b }
            java.lang.String r12 = "[A-Z]{3}"
            boolean r12 = r11.matches(r12)     // Catch:{ all -> 0x0b3b }
            if (r12 == 0) goto L_0x0361
            java.lang.String r12 = "_ltv_"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0b3b }
            int r13 = r11.length()     // Catch:{ all -> 0x0b3b }
            if (r13 == 0) goto L_0x025c
            java.lang.String r11 = r12.concat(r11)     // Catch:{ all -> 0x0b3b }
        L_0x025a:
            r13 = r11
            goto L_0x0262
        L_0x025c:
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0b3b }
            r11.<init>(r12)     // Catch:{ all -> 0x0b3b }
            goto L_0x025a
        L_0x0262:
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r11)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r11 = r11.zzk(r10, r13)     // Catch:{ all -> 0x0b3b }
            if (r11 == 0) goto L_0x02a8
            java.lang.Object r11 = r11.zze     // Catch:{ all -> 0x0b3b }
            boolean r12 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b3b }
            if (r12 != 0) goto L_0x0274
            goto L_0x02a8
        L_0x0274:
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x0b3b }
            long r11 = r11.longValue()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r19 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0b3b }
            r20 = r13
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.util.Clock r21 = r32.zzay()     // Catch:{ all -> 0x0b3b }
            long r21 = r21.currentTimeMillis()     // Catch:{ all -> 0x0b3b }
            long r11 = r11 + r14
            java.lang.Long r24 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b3b }
            r11 = r19
            r12 = r10
            r17 = r20
            r14 = 1
            r15 = 2
            r28 = r8
            r8 = 0
            r9 = 1
            r14 = r17
            r30 = r23
            r15 = r21
            r17 = r24
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b3b }
            r9 = r19
            r8 = 2
            goto L_0x031a
        L_0x02a8:
            r28 = r8
            r17 = r13
            r30 = r23
            r8 = 0
            r9 = 1
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r11)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r12 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzea.zzD     // Catch:{ all -> 0x0b3b }
            int r12 = r12.zzk(r10, r13)     // Catch:{ all -> 0x0b3b }
            int r12 = r12 + -1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0b3b }
            r11.zzg()     // Catch:{ all -> 0x0b3b }
            r11.zzZ()     // Catch:{ all -> 0x0b3b }
            android.database.sqlite.SQLiteDatabase r13 = r11.zze()     // Catch:{ SQLiteException -> 0x02e6 }
            r9 = 3
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ SQLiteException -> 0x02e6 }
            r9[r8] = r10     // Catch:{ SQLiteException -> 0x02e6 }
            r16 = 1
            r9[r16] = r10     // Catch:{ SQLiteException -> 0x02e6 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ SQLiteException -> 0x02e6 }
            r8 = 2
            r9[r8] = r12     // Catch:{ SQLiteException -> 0x02e4 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13.execSQL(r12, r9)     // Catch:{ SQLiteException -> 0x02e4 }
            goto L_0x02fc
        L_0x02e4:
            r0 = move-exception
            goto L_0x02e8
        L_0x02e6:
            r0 = move-exception
            r8 = 2
        L_0x02e8:
            r9 = r0
            com.google.android.gms.measurement.internal.zzfu r11 = r11.zzs     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzem r11 = r11.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r11 = r11.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r12 = "Error pruning currencies. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            r11.zzc(r12, r13, r9)     // Catch:{ all -> 0x0b3b }
        L_0x02fc:
            com.google.android.gms.measurement.internal.zzks r19 = new com.google.android.gms.measurement.internal.zzks     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.util.Clock r9 = r32.zzay()     // Catch:{ all -> 0x0b3b }
            long r20 = r9.currentTimeMillis()     // Catch:{ all -> 0x0b3b }
            java.lang.Long r9 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0b3b }
            r11 = r19
            r12 = r10
            r14 = r17
            r15 = r20
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0b3b }
            r9 = r19
        L_0x031a:
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r11)     // Catch:{ all -> 0x0b3b }
            boolean r11 = r11.zzj(r9)     // Catch:{ all -> 0x0b3b }
            if (r11 != 0) goto L_0x0367
            com.google.android.gms.measurement.internal.zzem r11 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r11 = r11.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r12 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r14 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzeh r14 = r14.zzm()     // Catch:{ all -> 0x0b3b }
            java.lang.String r15 = r9.zzc     // Catch:{ all -> 0x0b3b }
            java.lang.String r14 = r14.zze(r15)     // Catch:{ all -> 0x0b3b }
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0b3b }
            r11.zzd(r12, r13, r14, r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkt r12 = r1.zzB     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r9 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r13 = com.google.android.gms.measurement.internal.zzea.zzav     // Catch:{ all -> 0x0b3b }
            r14 = 0
            boolean r18 = r9.zzn(r14, r13)     // Catch:{ all -> 0x0b3b }
            r14 = 9
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzM(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b3b }
            goto L_0x0367
        L_0x0361:
            r28 = r8
            r30 = r23
            goto L_0x01af
        L_0x0367:
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r9 = com.google.android.gms.measurement.internal.zzku.zzh(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0b3b }
            r12 = r30
            boolean r22 = r12.equals(r11)     // Catch:{ all -> 0x0b3b }
            r32.zzq()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaq r11 = r2.zzb     // Catch:{ all -> 0x0b3b }
            if (r11 != 0) goto L_0x037f
            r16 = 0
            goto L_0x039f
        L_0x037f:
            com.google.android.gms.measurement.internal.zzap r12 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x0b3b }
            r12.<init>(r11)     // Catch:{ all -> 0x0b3b }
            r16 = 0
        L_0x0386:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0b3b }
            if (r13 == 0) goto L_0x039f
            java.lang.String r13 = r12.next()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r13 = r11.zza(r13)     // Catch:{ all -> 0x0b3b }
            boolean r14 = r13 instanceof android.os.Parcelable[]     // Catch:{ all -> 0x0b3b }
            if (r14 == 0) goto L_0x0386
            android.os.Parcelable[] r13 = (android.os.Parcelable[]) r13     // Catch:{ all -> 0x0b3b }
            int r13 = r13.length     // Catch:{ all -> 0x0b3b }
            long r13 = (long) r13     // Catch:{ all -> 0x0b3b }
            long r16 = r16 + r13
            goto L_0x0386
        L_0x039f:
            r23 = 1
            long r16 = r16 + r23
            com.google.android.gms.measurement.internal.zzai r11 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r11)     // Catch:{ all -> 0x0b3b }
            long r12 = r32.zzu()     // Catch:{ all -> 0x0b3b }
            r20 = 1
            r21 = 0
            r25 = 0
            r14 = r10
            r15 = r16
            r17 = r20
            r18 = r9
            r19 = r21
            r20 = r22
            r21 = r25
            com.google.android.gms.measurement.internal.zzag r11 = r11.zzv(r12, r14, r15, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0b3b }
            long r12 = r11.zzb     // Catch:{ all -> 0x0b3b }
            r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzea.zzj     // Catch:{ all -> 0x0b3b }
            r15 = 0
            java.lang.Object r14 = r14.zzb(r15)     // Catch:{ all -> 0x0b3b }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b3b }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b3b }
            long r14 = (long) r14     // Catch:{ all -> 0x0b3b }
            long r12 = r12 - r14
            r14 = 1000(0x3e8, double:4.94E-321)
            r21 = r9
            r8 = 0
            int r16 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x040e
            long r12 = r12 % r14
            int r2 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x03fd
            com.google.android.gms.measurement.internal.zzem r2 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r3 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            long r5 = r11.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b3b }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0b3b }
        L_0x03fd:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            r2.zzc()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            return
        L_0x040e:
            if (r21 == 0) goto L_0x0476
            long r12 = r11.zza     // Catch:{ all -> 0x0b3b }
            r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r14 = com.google.android.gms.measurement.internal.zzea.zzl     // Catch:{ all -> 0x0b3b }
            r15 = 0
            java.lang.Object r14 = r14.zzb(r15)     // Catch:{ all -> 0x0b3b }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x0b3b }
            int r14 = r14.intValue()     // Catch:{ all -> 0x0b3b }
            long r14 = (long) r14     // Catch:{ all -> 0x0b3b }
            long r12 = r12 - r14
            int r14 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x0476
            r14 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 % r14
            int r3 = (r12 > r23 ? 1 : (r12 == r23 ? 0 : -1))
            if (r3 != 0) goto L_0x0446
            com.google.android.gms.measurement.internal.zzem r3 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            long r6 = r11.zza     // Catch:{ all -> 0x0b3b }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0b3b }
            r3.zzc(r4, r5, r6)     // Catch:{ all -> 0x0b3b }
        L_0x0446:
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkt r12 = r1.zzB     // Catch:{ all -> 0x0b3b }
            java.lang.String r15 = "_ev"
            java.lang.String r2 = r2.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r3 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.zzea.zzav     // Catch:{ all -> 0x0b3b }
            r5 = 0
            boolean r18 = r3.zzn(r5, r4)     // Catch:{ all -> 0x0b3b }
            r14 = 16
            r17 = 0
            r13 = r10
            r16 = r2
            r11.zzM(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            r2.zzc()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            return
        L_0x0476:
            r12 = 1000000(0xf4240, float:1.401298E-39)
            if (r22 == 0) goto L_0x04c6
            long r13 = r11.zzd     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r15 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.zzea.zzk     // Catch:{ all -> 0x0b3b }
            int r8 = r15.zzk(r8, r9)     // Catch:{ all -> 0x0b3b }
            int r8 = java.lang.Math.min(r12, r8)     // Catch:{ all -> 0x0b3b }
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)     // Catch:{ all -> 0x0b3b }
            long r8 = (long) r8     // Catch:{ all -> 0x0b3b }
            long r13 = r13 - r8
            r8 = 0
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x04c6
            int r2 = (r13 > r23 ? 1 : (r13 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x04b5
            com.google.android.gms.measurement.internal.zzem r2 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r3 = "Too many error events logged. appId, count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            long r5 = r11.zzd     // Catch:{ all -> 0x0b3b }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0b3b }
            r2.zzc(r3, r4, r5)     // Catch:{ all -> 0x0b3b }
        L_0x04b5:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            r2.zzc()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            return
        L_0x04c6:
            com.google.android.gms.measurement.internal.zzaq r8 = r2.zzb     // Catch:{ all -> 0x0b3b }
            android.os.Bundle r8 = r8.zzf()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzku r9 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = "_o"
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0b3b }
            r9.zzL(r8, r11, r13)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzku r9 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            boolean r9 = r9.zzT(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.String r15 = "_r"
            if (r9 == 0) goto L_0x04f7
            com.google.android.gms.measurement.internal.zzku r9 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            java.lang.Long r11 = java.lang.Long.valueOf(r23)     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = "_dbg"
            r9.zzL(r8, r13, r11)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzku r9 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            r9.zzL(r8, r15, r11)     // Catch:{ all -> 0x0b3b }
        L_0x04f7:
            java.lang.String r9 = "_s"
            java.lang.String r11 = r2.zza     // Catch:{ all -> 0x0b3b }
            boolean r9 = r9.equals(r11)     // Catch:{ all -> 0x0b3b }
            if (r9 == 0) goto L_0x051d
            com.google.android.gms.measurement.internal.zzai r9 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r9 = r9.zzk(r11, r7)     // Catch:{ all -> 0x0b3b }
            if (r9 == 0) goto L_0x051d
            java.lang.Object r11 = r9.zze     // Catch:{ all -> 0x0b3b }
            boolean r11 = r11 instanceof java.lang.Long     // Catch:{ all -> 0x0b3b }
            if (r11 == 0) goto L_0x051d
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r9 = r9.zze     // Catch:{ all -> 0x0b3b }
            r11.zzL(r8, r7, r9)     // Catch:{ all -> 0x0b3b }
        L_0x051d:
            com.google.android.gms.measurement.internal.zzai r7 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r7)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)     // Catch:{ all -> 0x0b3b }
            r7.zzg()     // Catch:{ all -> 0x0b3b }
            r7.zzZ()     // Catch:{ all -> 0x0b3b }
            android.database.sqlite.SQLiteDatabase r9 = r7.zze()     // Catch:{ SQLiteException -> 0x055a }
            com.google.android.gms.measurement.internal.zzfu r11 = r7.zzs     // Catch:{ SQLiteException -> 0x055a }
            com.google.android.gms.measurement.internal.zzae r11 = r11.zzc()     // Catch:{ SQLiteException -> 0x055a }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r13 = com.google.android.gms.measurement.internal.zzea.zzo     // Catch:{ SQLiteException -> 0x055a }
            int r11 = r11.zzk(r10, r13)     // Catch:{ SQLiteException -> 0x055a }
            int r11 = java.lang.Math.min(r12, r11)     // Catch:{ SQLiteException -> 0x055a }
            r14 = 0
            int r11 = java.lang.Math.max(r14, r11)     // Catch:{ SQLiteException -> 0x0558 }
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ SQLiteException -> 0x0558 }
            r12 = 2
            java.lang.String[] r12 = new java.lang.String[r12]     // Catch:{ SQLiteException -> 0x0558 }
            r12[r14] = r10     // Catch:{ SQLiteException -> 0x0558 }
            r13 = 1
            r12[r13] = r11     // Catch:{ SQLiteException -> 0x0558 }
            java.lang.String r11 = "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"
            int r7 = r9.delete(r6, r11, r12)     // Catch:{ SQLiteException -> 0x0558 }
            long r11 = (long) r7
            goto L_0x0572
        L_0x0558:
            r0 = move-exception
            goto L_0x055c
        L_0x055a:
            r0 = move-exception
            r14 = 0
        L_0x055c:
            r9 = r0
            com.google.android.gms.measurement.internal.zzfu r7 = r7.zzs     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzem r7 = r7.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = "Error deleting over the limit events. appId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            r7.zzc(r11, r12, r9)     // Catch:{ all -> 0x0b3b }
            r11 = 0
        L_0x0572:
            r16 = 0
            int r7 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x058d
            com.google.android.gms.measurement.internal.zzem r7 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r7 = r7.zze()     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0b3b }
            r7.zzc(r9, r13, r11)     // Catch:{ all -> 0x0b3b }
        L_0x058d:
            com.google.android.gms.measurement.internal.zzan r7 = new com.google.android.gms.measurement.internal.zzan     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r12 = r1.zzm     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = r2.zzc     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r2.zza     // Catch:{ all -> 0x0b3b }
            r30 = r4
            r31 = r5
            long r4 = r2.zzd     // Catch:{ all -> 0x0b3b }
            r18 = 0
            r11 = r7
            r2 = 0
            r14 = r10
            r2 = r15
            r15 = r9
            r16 = r4
            r20 = r8
            r11.<init>((com.google.android.gms.measurement.internal.zzfu) r12, (java.lang.String) r13, (java.lang.String) r14, (java.lang.String) r15, (long) r16, (long) r18, (android.os.Bundle) r20)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r4 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r4)     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r7.zzb     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzao r4 = r4.zzf(r10, r5)     // Catch:{ all -> 0x0b3b }
            if (r4 != 0) goto L_0x063a
            com.google.android.gms.measurement.internal.zzai r4 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r4)     // Catch:{ all -> 0x0b3b }
            long r4 = r4.zzI(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r8 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            int r8 = r8.zze(r10)     // Catch:{ all -> 0x0b3b }
            long r8 = (long) r8     // Catch:{ all -> 0x0b3b }
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x061c
            if (r21 == 0) goto L_0x061c
            com.google.android.gms.measurement.internal.zzem r2 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.zzem.zzl(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzeh r5 = r5.zzm()     // Catch:{ all -> 0x0b3b }
            java.lang.String r6 = r7.zzb     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r5.zzc(r6)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r6 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            int r6 = r6.zze(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0b3b }
            r2.zzd(r3, r4, r5, r6)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzku r11 = r32.zzq()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkt r12 = r1.zzB     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r2 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.zzea.zzav     // Catch:{ all -> 0x0b3b }
            r4 = 0
            boolean r18 = r2.zzn(r4, r3)     // Catch:{ all -> 0x0b3b }
            r14 = 8
            r15 = 0
            r16 = 0
            r17 = 0
            r13 = r10
            r11.zzM(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            return
        L_0x061c:
            com.google.android.gms.measurement.internal.zzao r4 = new com.google.android.gms.measurement.internal.zzao     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = r7.zzb     // Catch:{ all -> 0x0b3b }
            long r8 = r7.zzd     // Catch:{ all -> 0x0b3b }
            r14 = 0
            r16 = 0
            r18 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r11 = r4
            r12 = r10
            r20 = r8
            r11.<init>(r12, r13, r14, r16, r18, r20, r22, r24, r25, r26, r27)     // Catch:{ all -> 0x0b3b }
            goto L_0x0648
        L_0x063a:
            com.google.android.gms.measurement.internal.zzfu r5 = r1.zzm     // Catch:{ all -> 0x0b3b }
            long r8 = r4.zzf     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzan r7 = r7.zza(r5, r8)     // Catch:{ all -> 0x0b3b }
            long r8 = r7.zzd     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzao r4 = r4.zza(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0648:
            com.google.android.gms.measurement.internal.zzai r5 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r5)     // Catch:{ all -> 0x0b3b }
            r5.zzh(r4)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfr r4 = r32.zzav()     // Catch:{ all -> 0x0b3b }
            r4.zzg()     // Catch:{ all -> 0x0b3b }
            r32.zzr()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r34)     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = r7.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = r7.zza     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r3.zza     // Catch:{ all -> 0x0b3b }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.internal.measurement.zzfv r4 = com.google.android.gms.internal.measurement.zzfw.zzaj()     // Catch:{ all -> 0x0b3b }
            r5 = 1
            r4.zza(r5)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = "android"
            r4.zzA(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x068a
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0b3b }
            r4.zzH(r8)     // Catch:{ all -> 0x0b3b }
        L_0x068a:
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0697
            java.lang.String r8 = r3.zzd     // Catch:{ all -> 0x0b3b }
            r4.zzF(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0697:
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x06a4
            java.lang.String r8 = r3.zzc     // Catch:{ all -> 0x0b3b }
            r4.zzI(r8)     // Catch:{ all -> 0x0b3b }
        L_0x06a4:
            long r8 = r3.zzj     // Catch:{ all -> 0x0b3b }
            r10 = -2147483648(0xffffffff80000000, double:NaN)
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x06b1
            int r9 = (int) r8     // Catch:{ all -> 0x0b3b }
            r4.zzab(r9)     // Catch:{ all -> 0x0b3b }
        L_0x06b1:
            long r8 = r3.zze     // Catch:{ all -> 0x0b3b }
            r4.zzJ(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x06c3
            java.lang.String r8 = r3.zzb     // Catch:{ all -> 0x0b3b }
            r4.zzW(r8)     // Catch:{ all -> 0x0b3b }
        L_0x06c3:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0b3b }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r8 = r1.zzt(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r9 = com.google.android.gms.measurement.internal.zzaf.zzc(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r8 = r8.zzk(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = r8.zzd()     // Catch:{ all -> 0x0b3b }
            r4.zzap(r8)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.internal.measurement.zzov.zzb()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r8 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r3.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzea.zzag     // Catch:{ all -> 0x0b3b }
            boolean r8 = r8.zzn(r9, r10)     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x072a
            java.lang.String r8 = r4.zzV()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x0708
            java.lang.String r8 = r3.zzu     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0708
            java.lang.String r8 = r3.zzu     // Catch:{ all -> 0x0b3b }
            r4.zzao(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0708:
            java.lang.String r8 = r4.zzV()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x0741
            java.lang.String r8 = r4.zzan()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x0741
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0741
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0b3b }
            r4.zzai(r8)     // Catch:{ all -> 0x0b3b }
            goto L_0x0741
        L_0x072a:
            java.lang.String r8 = r4.zzV()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x0741
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0741
            java.lang.String r8 = r3.zzq     // Catch:{ all -> 0x0b3b }
            r4.zzai(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0741:
            long r8 = r3.zzf     // Catch:{ all -> 0x0b3b }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 == 0) goto L_0x074c
            r4.zzR(r8)     // Catch:{ all -> 0x0b3b }
        L_0x074c:
            long r8 = r3.zzs     // Catch:{ all -> 0x0b3b }
            r4.zzal(r8)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkp r8 = r1.zzi     // Catch:{ all -> 0x0b3b }
            zzak(r8)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkn r9 = r8.zzf     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r9 = r9.zzm     // Catch:{ all -> 0x0b3b }
            android.content.Context r9 = r9.zzax()     // Catch:{ all -> 0x0b3b }
            java.util.Map r9 = com.google.android.gms.measurement.internal.zzea.zza(r9)     // Catch:{ all -> 0x0b3b }
            if (r9 == 0) goto L_0x07e9
            int r10 = r9.size()     // Catch:{ all -> 0x0b3b }
            if (r10 != 0) goto L_0x076c
            goto L_0x07e9
        L_0x076c:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0b3b }
            r14.<init>()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r10 = com.google.android.gms.measurement.internal.zzea.zzO     // Catch:{ all -> 0x0b3b }
            r11 = 0
            java.lang.Object r10 = r10.zzb(r11)     // Catch:{ all -> 0x0b3b }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0b3b }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0b3b }
            java.util.Set r9 = r9.entrySet()     // Catch:{ all -> 0x0b3b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0b3b }
        L_0x0786:
            boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0b3b }
            if (r11 == 0) goto L_0x07e3
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0b3b }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0b3b }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x0b3b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = "measurement.id."
            boolean r12 = r12.startsWith(r13)     // Catch:{ all -> 0x0b3b }
            if (r12 == 0) goto L_0x0786
            java.lang.Object r11 = r11.getValue()     // Catch:{ NumberFormatException -> 0x07d1 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x07d1 }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x07d1 }
            if (r11 == 0) goto L_0x0786
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ NumberFormatException -> 0x07d1 }
            r14.add(r11)     // Catch:{ NumberFormatException -> 0x07d1 }
            int r11 = r14.size()     // Catch:{ NumberFormatException -> 0x07d1 }
            if (r11 < r10) goto L_0x0786
            com.google.android.gms.measurement.internal.zzfu r11 = r8.zzs     // Catch:{ NumberFormatException -> 0x07d1 }
            com.google.android.gms.measurement.internal.zzem r11 = r11.zzau()     // Catch:{ NumberFormatException -> 0x07d1 }
            com.google.android.gms.measurement.internal.zzek r11 = r11.zze()     // Catch:{ NumberFormatException -> 0x07d1 }
            java.lang.String r12 = "Too many experiment IDs. Number of IDs"
            int r13 = r14.size()     // Catch:{ NumberFormatException -> 0x07d1 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ NumberFormatException -> 0x07d1 }
            r11.zzb(r12, r13)     // Catch:{ NumberFormatException -> 0x07d1 }
            goto L_0x07e3
        L_0x07d1:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.measurement.internal.zzfu r12 = r8.zzs     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzem r12 = r12.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r12 = r12.zze()     // Catch:{ all -> 0x0b3b }
            java.lang.String r13 = "Experiment ID NumberFormatException"
            r12.zzb(r13, r11)     // Catch:{ all -> 0x0b3b }
            goto L_0x0786
        L_0x07e3:
            int r8 = r14.size()     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x07ea
        L_0x07e9:
            r14 = 0
        L_0x07ea:
            if (r14 == 0) goto L_0x07ef
            r4.zzak(r14)     // Catch:{ all -> 0x0b3b }
        L_0x07ef:
            java.lang.String r8 = r3.zza     // Catch:{ all -> 0x0b3b }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r8 = r1.zzt(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r3.zzv     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r9 = com.google.android.gms.measurement.internal.zzaf.zzc(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaf r8 = r8.zzk(r9)     // Catch:{ all -> 0x0b3b }
            boolean r9 = r8.zzf()     // Catch:{ all -> 0x0b3b }
            if (r9 == 0) goto L_0x0837
            com.google.android.gms.measurement.internal.zzjl r9 = r1.zzk     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0b3b }
            android.util.Pair r9 = r9.zzc(r10, r8)     // Catch:{ all -> 0x0b3b }
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b3b }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0b3b }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0b3b }
            if (r10 != 0) goto L_0x0837
            boolean r10 = r3.zzo     // Catch:{ all -> 0x0b3b }
            if (r10 == 0) goto L_0x0837
            java.lang.Object r10 = r9.first     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0b3b }
            r4.zzL(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.Object r10 = r9.second     // Catch:{ all -> 0x0b3b }
            if (r10 == 0) goto L_0x0837
            java.lang.Object r9 = r9.second     // Catch:{ all -> 0x0b3b }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0b3b }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0b3b }
            r4.zzN(r9)     // Catch:{ all -> 0x0b3b }
        L_0x0837:
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzam r9 = r9.zzz()     // Catch:{ all -> 0x0b3b }
            r9.zzv()     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ all -> 0x0b3b }
            r4.zzC(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzam r9 = r9.zzz()     // Catch:{ all -> 0x0b3b }
            r9.zzv()     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0b3b }
            r4.zzB(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzam r9 = r9.zzz()     // Catch:{ all -> 0x0b3b }
            long r9 = r9.zzb()     // Catch:{ all -> 0x0b3b }
            int r10 = (int) r9     // Catch:{ all -> 0x0b3b }
            r4.zzE(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzam r9 = r9.zzz()     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r9.zzc()     // Catch:{ all -> 0x0b3b }
            r4.zzD(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r9 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r10 = com.google.android.gms.measurement.internal.zzea.zzat     // Catch:{ all -> 0x0b3b }
            r11 = 0
            boolean r9 = r9.zzn(r11, r10)     // Catch:{ all -> 0x0b3b }
            if (r9 != 0) goto L_0x0880
            long r9 = r3.zzl     // Catch:{ all -> 0x0b3b }
            r4.zzae(r9)     // Catch:{ all -> 0x0b3b }
        L_0x0880:
            com.google.android.gms.measurement.internal.zzfu r9 = r1.zzm     // Catch:{ all -> 0x0b3b }
            boolean r9 = r9.zzF()     // Catch:{ all -> 0x0b3b }
            if (r9 == 0) goto L_0x0895
            r4.zzG()     // Catch:{ all -> 0x0b3b }
            r9 = 0
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x0b3b }
            if (r10 != 0) goto L_0x0895
            r4.zzaf(r9)     // Catch:{ all -> 0x0b3b }
        L_0x0895:
            com.google.android.gms.measurement.internal.zzai r9 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzg r9 = r9.zzs(r10)     // Catch:{ all -> 0x0b3b }
            if (r9 != 0) goto L_0x0915
            com.google.android.gms.measurement.internal.zzg r9 = new com.google.android.gms.measurement.internal.zzg     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzfu r10 = r1.zzm     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0b3b }
            r9.<init>(r10, r11)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r1.zzA(r8)     // Catch:{ all -> 0x0b3b }
            r9.zze(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zzk     // Catch:{ all -> 0x0b3b }
            r9.zzo(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zzb     // Catch:{ all -> 0x0b3b }
            r9.zzg(r10)     // Catch:{ all -> 0x0b3b }
            boolean r10 = r8.zzf()     // Catch:{ all -> 0x0b3b }
            if (r10 == 0) goto L_0x08cd
            com.google.android.gms.measurement.internal.zzjl r10 = r1.zzk     // Catch:{ all -> 0x0b3b }
            java.lang.String r11 = r3.zza     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r10.zzf(r11)     // Catch:{ all -> 0x0b3b }
            r9.zzm(r10)     // Catch:{ all -> 0x0b3b }
        L_0x08cd:
            r10 = 0
            r9.zzH(r10)     // Catch:{ all -> 0x0b3b }
            r9.zzq(r10)     // Catch:{ all -> 0x0b3b }
            r9.zzs(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zzc     // Catch:{ all -> 0x0b3b }
            r9.zzu(r10)     // Catch:{ all -> 0x0b3b }
            long r10 = r3.zzj     // Catch:{ all -> 0x0b3b }
            r9.zzw(r10)     // Catch:{ all -> 0x0b3b }
            java.lang.String r10 = r3.zzd     // Catch:{ all -> 0x0b3b }
            r9.zzy(r10)     // Catch:{ all -> 0x0b3b }
            long r10 = r3.zze     // Catch:{ all -> 0x0b3b }
            r9.zzA(r10)     // Catch:{ all -> 0x0b3b }
            long r10 = r3.zzf     // Catch:{ all -> 0x0b3b }
            r9.zzC(r10)     // Catch:{ all -> 0x0b3b }
            boolean r10 = r3.zzh     // Catch:{ all -> 0x0b3b }
            r9.zzG(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r10 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.zzea.zzat     // Catch:{ all -> 0x0b3b }
            r12 = 0
            boolean r10 = r10.zzn(r12, r11)     // Catch:{ all -> 0x0b3b }
            if (r10 != 0) goto L_0x0908
            long r10 = r3.zzl     // Catch:{ all -> 0x0b3b }
            r9.zzae(r10)     // Catch:{ all -> 0x0b3b }
        L_0x0908:
            long r10 = r3.zzs     // Catch:{ all -> 0x0b3b }
            r9.zzE(r10)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r10 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r10)     // Catch:{ all -> 0x0b3b }
            r10.zzt(r9)     // Catch:{ all -> 0x0b3b }
        L_0x0915:
            boolean r8 = r8.zzh()     // Catch:{ all -> 0x0b3b }
            if (r8 == 0) goto L_0x0932
            java.lang.String r8 = r9.zzd()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0932
            java.lang.String r8 = r9.zzd()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b3b }
            r4.zzP(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0932:
            java.lang.String r8 = r9.zzn()     // Catch:{ all -> 0x0b3b }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x0b3b }
            if (r8 != 0) goto L_0x0949
            java.lang.String r8 = r9.zzn()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r8 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0b3b }
            r4.zzaa(r8)     // Catch:{ all -> 0x0b3b }
        L_0x0949:
            com.google.android.gms.measurement.internal.zzai r8 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r3 = r3.zza     // Catch:{ all -> 0x0b3b }
            java.util.List r3 = r8.zzl(r3)     // Catch:{ all -> 0x0b3b }
            r14 = 0
        L_0x0955:
            int r8 = r3.size()     // Catch:{ all -> 0x0b3b }
            if (r14 >= r8) goto L_0x098b
            com.google.android.gms.internal.measurement.zzgg r8 = com.google.android.gms.internal.measurement.zzgh.zzj()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r9 = r3.get(r14)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r9 = (com.google.android.gms.measurement.internal.zzks) r9     // Catch:{ all -> 0x0b3b }
            java.lang.String r9 = r9.zzc     // Catch:{ all -> 0x0b3b }
            r8.zzb(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.Object r9 = r3.get(r14)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r9 = (com.google.android.gms.measurement.internal.zzks) r9     // Catch:{ all -> 0x0b3b }
            long r9 = r9.zzd     // Catch:{ all -> 0x0b3b }
            r8.zza(r9)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkp r9 = r1.zzi     // Catch:{ all -> 0x0b3b }
            zzak(r9)     // Catch:{ all -> 0x0b3b }
            java.lang.Object r10 = r3.get(r14)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzks r10 = (com.google.android.gms.measurement.internal.zzks) r10     // Catch:{ all -> 0x0b3b }
            java.lang.Object r10 = r10.zze     // Catch:{ all -> 0x0b3b }
            r9.zzc(r8, r10)     // Catch:{ all -> 0x0b3b }
            r4.zzo(r8)     // Catch:{ all -> 0x0b3b }
            int r14 = r14 + 1
            goto L_0x0955
        L_0x098b:
            com.google.android.gms.measurement.internal.zzai r3 = r1.zze     // Catch:{ IOException -> 0x0aef }
            zzak(r3)     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.internal.measurement.zzkd r8 = r4.zzaA()     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.internal.measurement.zzfw r8 = (com.google.android.gms.internal.measurement.zzfw) r8     // Catch:{ IOException -> 0x0aef }
            r3.zzg()     // Catch:{ IOException -> 0x0aef }
            r3.zzZ()     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8)     // Catch:{ IOException -> 0x0aef }
            java.lang.String r9 = r8.zzA()     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)     // Catch:{ IOException -> 0x0aef }
            byte[] r9 = r8.zzbp()     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.measurement.internal.zzkn r10 = r3.zzf     // Catch:{ IOException -> 0x0aef }
            com.google.android.gms.measurement.internal.zzkp r10 = r10.zzi     // Catch:{ IOException -> 0x0aef }
            zzak(r10)     // Catch:{ IOException -> 0x0aef }
            long r10 = r10.zzr(r9)     // Catch:{ IOException -> 0x0aef }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ IOException -> 0x0aef }
            r12.<init>()     // Catch:{ IOException -> 0x0aef }
            java.lang.String r13 = r8.zzA()     // Catch:{ IOException -> 0x0aef }
            r14 = r31
            r12.put(r14, r13)     // Catch:{ IOException -> 0x0aef }
            java.lang.Long r13 = java.lang.Long.valueOf(r10)     // Catch:{ IOException -> 0x0aef }
            r15 = r30
            r12.put(r15, r13)     // Catch:{ IOException -> 0x0aef }
            java.lang.String r13 = "metadata"
            r12.put(r13, r9)     // Catch:{ IOException -> 0x0aef }
            android.database.sqlite.SQLiteDatabase r9 = r3.zze()     // Catch:{ SQLiteException -> 0x0ad3 }
            java.lang.String r13 = "raw_events_metadata"
            r5 = 4
            r16 = r4
            r4 = 0
            r9.insertWithOnConflict(r13, r4, r12, r5)     // Catch:{ SQLiteException -> 0x0ad1 }
            com.google.android.gms.measurement.internal.zzai r3 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r3)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzaq r4 = r7.zzf     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzap r5 = new com.google.android.gms.measurement.internal.zzap     // Catch:{ all -> 0x0b3b }
            r5.<init>(r4)     // Catch:{ all -> 0x0b3b }
        L_0x09ea:
            boolean r4 = r5.hasNext()     // Catch:{ all -> 0x0b3b }
            if (r4 == 0) goto L_0x09fd
            java.lang.String r4 = r5.next()     // Catch:{ all -> 0x0b3b }
            boolean r4 = r2.equals(r4)     // Catch:{ all -> 0x0b3b }
            if (r4 == 0) goto L_0x09ea
        L_0x09fa:
            r17 = 1
            goto L_0x0a3f
        L_0x09fd:
            com.google.android.gms.measurement.internal.zzfl r2 = r1.zzc     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = r7.zza     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r7.zzb     // Catch:{ all -> 0x0b3b }
            boolean r2 = r2.zzk(r4, r5)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r4 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r4)     // Catch:{ all -> 0x0b3b }
            long r19 = r32.zzu()     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r7.zza     // Catch:{ all -> 0x0b3b }
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r18 = r4
            r21 = r5
            com.google.android.gms.measurement.internal.zzag r4 = r18.zzu(r19, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x0b3b }
            if (r2 == 0) goto L_0x0a3d
            long r4 = r4.zze     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzae r2 = r32.zzd()     // Catch:{ all -> 0x0b3b }
            java.lang.String r8 = r7.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzdz<java.lang.Integer> r9 = com.google.android.gms.measurement.internal.zzea.zzn     // Catch:{ all -> 0x0b3b }
            int r2 = r2.zzk(r8, r9)     // Catch:{ all -> 0x0b3b }
            long r8 = (long) r2     // Catch:{ all -> 0x0b3b }
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0a3d
            goto L_0x09fa
        L_0x0a3d:
            r17 = 0
        L_0x0a3f:
            r3.zzg()     // Catch:{ all -> 0x0b3b }
            r3.zzZ()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)     // Catch:{ all -> 0x0b3b }
            java.lang.String r2 = r7.zza     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkn r2 = r3.zzf     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzkp r2 = r2.zzi     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.internal.measurement.zzfo r2 = r2.zzf(r7)     // Catch:{ all -> 0x0b3b }
            byte[] r2 = r2.zzbp()     // Catch:{ all -> 0x0b3b }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0b3b }
            r4.<init>()     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = r7.zza     // Catch:{ all -> 0x0b3b }
            r4.put(r14, r5)     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = "name"
            java.lang.String r8 = r7.zzb     // Catch:{ all -> 0x0b3b }
            r4.put(r5, r8)     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = "timestamp"
            long r8 = r7.zzd     // Catch:{ all -> 0x0b3b }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b3b }
            r4.put(r5, r8)     // Catch:{ all -> 0x0b3b }
            java.lang.Long r5 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0b3b }
            r4.put(r15, r5)     // Catch:{ all -> 0x0b3b }
            java.lang.String r5 = "data"
            r4.put(r5, r2)     // Catch:{ all -> 0x0b3b }
            java.lang.String r2 = "realtime"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0b3b }
            r4.put(r2, r5)     // Catch:{ all -> 0x0b3b }
            android.database.sqlite.SQLiteDatabase r2 = r3.zze()     // Catch:{ SQLiteException -> 0x0ab7 }
            r5 = 0
            long r4 = r2.insert(r6, r5, r4)     // Catch:{ SQLiteException -> 0x0ab7 }
            r8 = -1
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0ab2
            com.google.android.gms.measurement.internal.zzfu r2 = r3.zzs     // Catch:{ SQLiteException -> 0x0ab7 }
            com.google.android.gms.measurement.internal.zzem r2 = r2.zzau()     // Catch:{ SQLiteException -> 0x0ab7 }
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzb()     // Catch:{ SQLiteException -> 0x0ab7 }
            java.lang.String r4 = "Failed to insert raw event (got -1). appId"
            java.lang.String r5 = r7.zza     // Catch:{ SQLiteException -> 0x0ab7 }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r5)     // Catch:{ SQLiteException -> 0x0ab7 }
            r2.zzb(r4, r5)     // Catch:{ SQLiteException -> 0x0ab7 }
            goto L_0x0b08
        L_0x0ab2:
            r4 = 0
            r1.zza = r4     // Catch:{ all -> 0x0b3b }
            goto L_0x0b08
        L_0x0ab7:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzfu r3 = r3.zzs     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = "Error storing raw event. appId"
            java.lang.String r5 = r7.zza     // Catch:{ all -> 0x0b3b }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r5)     // Catch:{ all -> 0x0b3b }
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0b3b }
            goto L_0x0b08
        L_0x0acf:
            r0 = move-exception
            goto L_0x0af2
        L_0x0ad1:
            r0 = move-exception
            goto L_0x0ad6
        L_0x0ad3:
            r0 = move-exception
            r16 = r4
        L_0x0ad6:
            r2 = r0
            com.google.android.gms.measurement.internal.zzfu r3 = r3.zzs     // Catch:{ IOException -> 0x0acf }
            com.google.android.gms.measurement.internal.zzem r3 = r3.zzau()     // Catch:{ IOException -> 0x0acf }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzb()     // Catch:{ IOException -> 0x0acf }
            java.lang.String r4 = "Error storing raw event metadata. appId"
            java.lang.String r5 = r8.zzA()     // Catch:{ IOException -> 0x0acf }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r5)     // Catch:{ IOException -> 0x0acf }
            r3.zzc(r4, r5, r2)     // Catch:{ IOException -> 0x0acf }
            throw r2     // Catch:{ IOException -> 0x0acf }
        L_0x0aef:
            r0 = move-exception
            r16 = r4
        L_0x0af2:
            r2 = r0
            com.google.android.gms.measurement.internal.zzem r3 = r32.zzau()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzek r3 = r3.zzb()     // Catch:{ all -> 0x0b3b }
            java.lang.String r4 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r16.zzG()     // Catch:{ all -> 0x0b3b }
            java.lang.Object r5 = com.google.android.gms.measurement.internal.zzem.zzl(r5)     // Catch:{ all -> 0x0b3b }
            r3.zzc(r4, r5, r2)     // Catch:{ all -> 0x0b3b }
        L_0x0b08:
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze     // Catch:{ all -> 0x0b3b }
            zzak(r2)     // Catch:{ all -> 0x0b3b }
            r2.zzc()     // Catch:{ all -> 0x0b3b }
            com.google.android.gms.measurement.internal.zzai r2 = r1.zze
            zzak(r2)
            r2.zzd()
            r32.zzaf()
            com.google.android.gms.measurement.internal.zzem r2 = r32.zzau()
            com.google.android.gms.measurement.internal.zzek r2 = r2.zzk()
            long r3 = java.lang.System.nanoTime()
            long r3 = r3 - r28
            r5 = 500000(0x7a120, double:2.47033E-318)
            long r3 = r3 + r5
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r5
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Background event processing time, ms"
            r2.zzb(r4, r3)
            return
        L_0x0b3b:
            r0 = move-exception
            r2 = r0
            com.google.android.gms.measurement.internal.zzai r3 = r1.zze
            zzak(r3)
            r3.zzd()
            throw r2
        L_0x0b46:
            r1.zzT(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzkn.zzz(com.google.android.gms.measurement.internal.zzas, com.google.android.gms.measurement.internal.zzp):void");
    }
}
