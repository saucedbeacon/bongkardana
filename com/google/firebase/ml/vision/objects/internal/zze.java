package com.google.firebase.ml.vision.objects.internal;

import android.os.RemoteException;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzok;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzpa;
import com.google.android.gms.internal.firebase_ml.zzpb;
import com.google.android.gms.internal.firebase_ml.zzpd;
import com.google.android.gms.internal.firebase_ml.zzqi;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.objects.FirebaseVisionObject;
import com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zze implements zzok<List<FirebaseVisionObject>, zzqn>, zzpd {
    private static final AtomicBoolean zzbdt = new AtomicBoolean(true);
    private final FirebaseApp firebaseApp;
    private final zzov zzbbg;
    private final FirebaseVisionObjectDetectorOptions zzbjw;
    private long zzbjx = -1;
    @VisibleForTesting
    private final zzmn.zzao zzbjy;
    @GuardedBy("this")
    private IObjectDetector zzbjz;

    public zze(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        zzmn.zzao.zzb zzb;
        Preconditions.checkNotNull(firebaseApp2, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionObjectDetectorOptions, "FirebaseVisionObjectDetectorOptions can not be null");
        this.zzbjw = firebaseVisionObjectDetectorOptions;
        this.firebaseApp = firebaseApp2;
        this.zzbbg = zzov.zza(firebaseApp2, 1);
        zzmn.zzao.zza zzme = zzmn.zzao.zzme();
        int zzpm = firebaseVisionObjectDetectorOptions.zzpm();
        if (zzpm == 1) {
            zzb = zzmn.zzao.zzb.STREAM;
        } else if (zzpm != 2) {
            zzb = zzmn.zzao.zzb.MODE_UNSPECIFIED;
        } else {
            zzb = zzmn.zzao.zzb.SINGLE_IMAGE;
        }
        this.zzbjy = (zzmn.zzao) ((zzux) zzme.zza(zzb).zzaq(firebaseVisionObjectDetectorOptions.zzpo()).zzar(firebaseVisionObjectDetectorOptions.zzpn()).zzte());
        this.zzbbg.zza(zzmn.zzaa.zzky().zzb(zzmn.zzan.zzmc().zzc(this.zzbjy).zzm(zzmy.NO_ERROR)), zznc.ON_DEVICE_OBJECT_CREATE);
    }

    @NonNull
    public final zzpd zzmv() {
        return this;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        zza(com.google.android.gms.internal.firebase_ml.zzmy.UNKNOWN_ERROR, r19, (java.util.List<com.google.firebase.ml.vision.objects.FirebaseVisionObject>) com.google.android.gms.internal.firebase_ml.zzmb.zziy(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        throw new com.google.firebase.ml.common.FirebaseMLException("Cannot run object detector.", 14);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x009f */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.google.firebase.ml.vision.objects.FirebaseVisionObject> zza(com.google.android.gms.internal.firebase_ml.zzqn r19) throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            monitor-enter(r18)
            java.lang.String r1 = "Mobile vision input can not bu null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)     // Catch:{ all -> 0x00b7 }
            com.google.firebase.ml.vision.common.FirebaseVisionImage r1 = r0.zzbhx     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "Input image can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.vision.Frame r1 = r0.zzbhi     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "Input frame can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch:{ all -> 0x00b7 }
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00b7 }
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r1 = r7.zzbjz     // Catch:{ RemoteException -> 0x009f }
            if (r1 != 0) goto L_0x0026
            com.google.android.gms.internal.firebase_ml.zzmb r0 = com.google.android.gms.internal.firebase_ml.zzmb.zziy()     // Catch:{ RemoteException -> 0x009f }
            monitor-exit(r18)
            return r0
        L_0x0026:
            com.google.firebase.ml.vision.objects.FirebaseVisionObjectDetectorOptions r1 = r7.zzbjw     // Catch:{ RemoteException -> 0x009f }
            int r1 = r1.zzpm()     // Catch:{ RemoteException -> 0x009f }
            r10 = 0
            r2 = 1
            if (r1 != r2) goto L_0x0049
            long r3 = r7.zzbjx     // Catch:{ RemoteException -> 0x009f }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0049
            long r3 = r7.zzbjx     // Catch:{ RemoteException -> 0x009f }
            long r3 = r8 - r3
            r5 = 300(0x12c, double:1.48E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 0
        L_0x0044:
            if (r2 == 0) goto L_0x0049
            r18.zzpq()     // Catch:{ RemoteException -> 0x009f }
        L_0x0049:
            r7.zzbjx = r8     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.vision.Frame r1 = r0.zzbhi     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r1)     // Catch:{ RemoteException -> 0x009f }
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r2 = r7.zzbjz     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.vision.Frame r3 = r0.zzbhi     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.vision.Frame$Metadata r3 = r3.getMetadata()     // Catch:{ RemoteException -> 0x009f }
            com.google.android.gms.internal.firebase_ml.zzqj r4 = new com.google.android.gms.internal.firebase_ml.zzqj     // Catch:{ RemoteException -> 0x009f }
            int r12 = r3.getWidth()     // Catch:{ RemoteException -> 0x009f }
            int r13 = r3.getHeight()     // Catch:{ RemoteException -> 0x009f }
            int r14 = r3.getId()     // Catch:{ RemoteException -> 0x009f }
            long r15 = r3.getTimestampMillis()     // Catch:{ RemoteException -> 0x009f }
            int r17 = r3.getRotation()     // Catch:{ RemoteException -> 0x009f }
            r11 = r4
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ RemoteException -> 0x009f }
            com.google.firebase.ml.vision.objects.internal.zzj[] r1 = r2.zzc(r1, r4)     // Catch:{ RemoteException -> 0x009f }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ RemoteException -> 0x009f }
            r11.<init>()     // Catch:{ RemoteException -> 0x009f }
            int r2 = r1.length     // Catch:{ RemoteException -> 0x009f }
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x008d
            r4 = r1[r3]     // Catch:{ RemoteException -> 0x009f }
            com.google.firebase.ml.vision.objects.FirebaseVisionObject r5 = new com.google.firebase.ml.vision.objects.FirebaseVisionObject     // Catch:{ RemoteException -> 0x009f }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x009f }
            r11.add(r5)     // Catch:{ RemoteException -> 0x009f }
            int r3 = r3 + 1
            goto L_0x007e
        L_0x008d:
            com.google.android.gms.internal.firebase_ml.zzmy r2 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR     // Catch:{ RemoteException -> 0x009f }
            r1 = r18
            r3 = r19
            r4 = r11
            r5 = r8
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmy) r2, (com.google.android.gms.internal.firebase_ml.zzqn) r3, (java.util.List<com.google.firebase.ml.vision.objects.FirebaseVisionObject>) r4, (long) r5)     // Catch:{ RemoteException -> 0x009f }
            java.util.concurrent.atomic.AtomicBoolean r1 = zzbdt     // Catch:{ RemoteException -> 0x009f }
            r1.set(r10)     // Catch:{ RemoteException -> 0x009f }
            monitor-exit(r18)
            return r11
        L_0x009f:
            com.google.android.gms.internal.firebase_ml.zzmy r2 = com.google.android.gms.internal.firebase_ml.zzmy.UNKNOWN_ERROR     // Catch:{ all -> 0x00b7 }
            com.google.android.gms.internal.firebase_ml.zzmb r4 = com.google.android.gms.internal.firebase_ml.zzmb.zziy()     // Catch:{ all -> 0x00b7 }
            r1 = r18
            r3 = r19
            r5 = r8
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmy) r2, (com.google.android.gms.internal.firebase_ml.zzqn) r3, (java.util.List<com.google.firebase.ml.vision.objects.FirebaseVisionObject>) r4, (long) r5)     // Catch:{ all -> 0x00b7 }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "Cannot run object detector."
            r2 = 14
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r18)
            goto L_0x00bb
        L_0x00ba:
            throw r0
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.objects.internal.zze.zza(com.google.android.gms.internal.firebase_ml.zzqn):java.util.List");
    }

    @WorkerThread
    public final synchronized void zzne() throws FirebaseMLException {
        try {
            if (this.zzbjz == null) {
                zzc zzpp = zzpp();
                if (zzpp != null) {
                    IObjectWrapper wrap = ObjectWrapper.wrap(this.firebaseApp.getApplicationContext());
                    FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = this.zzbjw;
                    this.zzbjz = zzpp.newObjectDetector(wrap, new ObjectDetectorOptionsParcel(firebaseVisionObjectDetectorOptions.zzpm(), firebaseVisionObjectDetectorOptions.zzpo(), firebaseVisionObjectDetectorOptions.zzpn()));
                    zzq(zzmy.NO_ERROR);
                } else {
                    zzq(zzmy.UNKNOWN_ERROR);
                    throw new FirebaseMLException("Cannot load object detector module.", 14);
                }
            }
            this.zzbjz.start();
        } catch (RemoteException e) {
            zzq(zzmy.UNKNOWN_ERROR);
            throw new FirebaseMLException("Can not create ObjectDetector", 14, e);
        }
    }

    @VisibleForTesting
    @Nullable
    private final zzc zzpp() throws FirebaseMLException {
        try {
            return zzb.asInterface(DynamiteModule.load(this.firebaseApp.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.objects").instantiate("com.google.firebase.ml.vision.objects.ObjectDetectorCreator"));
        } catch (DynamiteModule.LoadingException e) {
            throw new FirebaseMLException("Cannot load object detector module.", 14, e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|(1:4)|6|7|(1:9)|10|11|12) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000d */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0011 A[Catch:{ RemoteException -> 0x0016 }] */
    @androidx.annotation.VisibleForTesting
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzpq() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r2.zzbjz     // Catch:{ RemoteException -> 0x000d }
            if (r0 == 0) goto L_0x000d
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r2.zzbjz     // Catch:{ RemoteException -> 0x000d }
            r0.stop()     // Catch:{ RemoteException -> 0x000d }
            goto L_0x000d
        L_0x000b:
            r0 = move-exception
            goto L_0x001e
        L_0x000d:
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r2.zzbjz     // Catch:{ RemoteException -> 0x0016 }
            if (r0 == 0) goto L_0x0016
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r2.zzbjz     // Catch:{ RemoteException -> 0x0016 }
            r0.start()     // Catch:{ RemoteException -> 0x0016 }
        L_0x0016:
            java.util.concurrent.atomic.AtomicBoolean r0 = zzbdt     // Catch:{ all -> 0x000b }
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x000b }
            monitor-exit(r2)
            return
        L_0x001e:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.objects.internal.zze.zzpq():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r3.zzbjz     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            if (r0 == 0) goto L_0x000a
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r0 = r3.zzbjz     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            r0.stop()     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
        L_0x000a:
            java.util.concurrent.atomic.AtomicBoolean r0 = zzbdt     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            r1 = 1
            r0.set(r1)     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            com.google.android.gms.internal.firebase_ml.zzov r0 = r3.zzbbg     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            com.google.android.gms.internal.firebase_ml.zzmn$zzaa$zza r1 = com.google.android.gms.internal.firebase_ml.zzmn.zzaa.zzky()     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            com.google.android.gms.internal.firebase_ml.zznc r2 = com.google.android.gms.internal.firebase_ml.zznc.ON_DEVICE_OBJECT_CLOSE     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            r0.zza((com.google.android.gms.internal.firebase_ml.zzmn.zzaa.zza) r1, (com.google.android.gms.internal.firebase_ml.zznc) r2)     // Catch:{ RemoteException -> 0x0020, all -> 0x001d }
            monitor-exit(r3)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0020:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.objects.internal.zze.release():void");
    }

    private final void zzq(zzmy zzmy) {
        this.zzbbg.zza(zzmn.zzaa.zzky().zzb(zzmn.zzaq.zzmi().zze(this.zzbjy).zzn(zzmy)), zznc.ON_DEVICE_OBJECT_LOAD);
    }

    @WorkerThread
    private final void zza(zzmy zzmy, zzqn zzqn, List<FirebaseVisionObject> list, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzbbg.zza((zzpb) new zzh(this, list, elapsedRealtime, zzmy, zzqn), zznc.ON_DEVICE_OBJECT_INFERENCE);
        zzpa zzpa = zzg.zzbeb;
        this.zzbbg.zza((zzmn.zzf.zza) ((zzux) zzmn.zzf.zza.zzjq().zzb(this.zzbjy).zzg(zzmy).zzu(zzbdt.get()).zzf(zzqi.zzc(zzqn)).zzt(!list.isEmpty()).zzte()), elapsedRealtime, zznc.AGGREGATED_ON_DEVICE_OBJECT_INFERENCE, zzpa);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmn.zzaa.zza zza(List list, long j, zzmy zzmy, zzqn zzqn) {
        zzmn.zzah.zza zza;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FirebaseVisionObject firebaseVisionObject = (FirebaseVisionObject) it.next();
            zzmn.zzah.zzb zzlo = zzmn.zzah.zzlo();
            int classificationCategory = firebaseVisionObject.getClassificationCategory();
            if (classificationCategory == 0) {
                zza = zzmn.zzah.zza.CATEGORY_UNKNOWN;
            } else if (classificationCategory == 1) {
                zza = zzmn.zzah.zza.CATEGORY_HOME_GOOD;
            } else if (classificationCategory == 2) {
                zza = zzmn.zzah.zza.CATEGORY_FASHION_GOOD;
            } else if (classificationCategory == 3) {
                zza = zzmn.zzah.zza.CATEGORY_FOOD;
            } else if (classificationCategory == 4) {
                zza = zzmn.zzah.zza.CATEGORY_PLACE;
            } else if (classificationCategory != 5) {
                zza = zzmn.zzah.zza.CATEGORY_UNKNOWN;
            } else {
                zza = zzmn.zzah.zza.CATEGORY_PLANT;
            }
            zzmn.zzah.zzb zzb = zzlo.zzb(zza);
            if (firebaseVisionObject.getClassificationConfidence() != null) {
                zzb.zzn(firebaseVisionObject.getClassificationConfidence().floatValue());
            }
            if (firebaseVisionObject.getTrackingId() != null) {
                zzb.zzbh(firebaseVisionObject.getTrackingId().intValue());
            }
            arrayList.add((zzmn.zzah) ((zzux) zzb.zzte()));
        }
        return zzmn.zzaa.zzky().zzb(zzmn.zzap.zzmg().zzg(zzmn.zzac.zzlc().zzj(j).zzk(zzmy).zzac(zzbdt.get()).zzad(true).zzae(true)).zzl(zzqi.zzc(zzqn)).zzd(this.zzbjy).zzv(arrayList));
    }
}
