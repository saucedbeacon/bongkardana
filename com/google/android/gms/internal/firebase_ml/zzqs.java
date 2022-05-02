package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.vision.label.ImageLabeler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.util.List;

public final class zzqs implements zzok<List<FirebaseVisionImageLabel>, zzqn>, zzpd {
    @VisibleForTesting
    private static boolean zzbgf = true;
    private static volatile Boolean zzbjh;
    private final Context zzbae;
    private final zzov zzbbg;
    private final FirebaseVisionOnDeviceImageLabelerOptions zzbji;
    @GuardedBy("this")
    private ImageLabeler zzbjj;

    zzqs(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        Preconditions.checkNotNull(firebaseApp, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "FirebaseVisionOnDeviceImageLabelerOptions can not be null");
        this.zzbae = firebaseApp.getApplicationContext();
        this.zzbji = firebaseVisionOnDeviceImageLabelerOptions;
        this.zzbbg = zzov.zza(firebaseApp, 1);
    }

    public final zzpd zzmv() {
        return this;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.google.firebase.ml.vision.label.FirebaseVisionImageLabel> zza(com.google.android.gms.internal.firebase_ml.zzqn r9) throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Boolean r0 = zzbjh     // Catch:{ all -> 0x0099 }
            r1 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r8.zzbae     // Catch:{ all -> 0x0099 }
            java.lang.String r2 = "com.google.android.gms.vision.dynamite.ica"
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r0, r2)     // Catch:{ all -> 0x0099 }
            r3 = 1
            if (r2 > 0) goto L_0x001c
            java.lang.String r2 = "com.google.android.gms.vision.dynamite.imagelabel"
            int r0 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r0, r2)     // Catch:{ all -> 0x0099 }
            if (r0 <= 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r0 = 0
            goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            if (r0 != 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0099 }
            zzbjh = r0     // Catch:{ all -> 0x0099 }
        L_0x0027:
            java.lang.Boolean r0 = zzbjh     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0099 }
            r2 = 14
            if (r0 != 0) goto L_0x0091
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0099 }
            com.google.android.gms.vision.label.ImageLabeler r0 = r8.zzbjj     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0082
            com.google.android.gms.vision.label.ImageLabeler r0 = r8.zzbjj     // Catch:{ all -> 0x0099 }
            boolean r0 = r0.isOperational()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0075
            com.google.android.gms.vision.label.ImageLabeler r0 = r8.zzbjj     // Catch:{ all -> 0x0099 }
            com.google.android.gms.vision.Frame r2 = r9.zzbhi     // Catch:{ all -> 0x0099 }
            android.util.SparseArray r0 = r0.detect(r2)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x006c
            r5 = 0
        L_0x0051:
            int r6 = r0.size()     // Catch:{ all -> 0x0099 }
            if (r5 >= r6) goto L_0x006c
            int r6 = r0.keyAt(r5)     // Catch:{ all -> 0x0099 }
            com.google.firebase.ml.vision.label.FirebaseVisionImageLabel r7 = new com.google.firebase.ml.vision.label.FirebaseVisionImageLabel     // Catch:{ all -> 0x0099 }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0099 }
            com.google.android.gms.vision.label.ImageLabel r6 = (com.google.android.gms.vision.label.ImageLabel) r6     // Catch:{ all -> 0x0099 }
            r7.<init>(r6)     // Catch:{ all -> 0x0099 }
            r2.add(r7)     // Catch:{ all -> 0x0099 }
            int r5 = r5 + 1
            goto L_0x0051
        L_0x006c:
            com.google.android.gms.internal.firebase_ml.zzmy r0 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR     // Catch:{ all -> 0x0099 }
            r8.zza((com.google.android.gms.internal.firebase_ml.zzmy) r0, (long) r3, (com.google.android.gms.internal.firebase_ml.zzqn) r9)     // Catch:{ all -> 0x0099 }
            zzbgf = r1     // Catch:{ all -> 0x0099 }
            monitor-exit(r8)
            return r2
        L_0x0075:
            com.google.android.gms.internal.firebase_ml.zzmy r0 = com.google.android.gms.internal.firebase_ml.zzmy.MODEL_NOT_DOWNLOADED     // Catch:{ all -> 0x0099 }
            r8.zza((com.google.android.gms.internal.firebase_ml.zzmy) r0, (long) r3, (com.google.android.gms.internal.firebase_ml.zzqn) r9)     // Catch:{ all -> 0x0099 }
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Waiting for the label detection model to be downloaded. Please wait."
            r9.<init>(r0, r2)     // Catch:{ all -> 0x0099 }
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0082:
            com.google.android.gms.internal.firebase_ml.zzmy r0 = com.google.android.gms.internal.firebase_ml.zzmy.UNKNOWN_ERROR     // Catch:{ all -> 0x0099 }
            r8.zza((com.google.android.gms.internal.firebase_ml.zzmy) r0, (long) r3, (com.google.android.gms.internal.firebase_ml.zzqn) r9)     // Catch:{ all -> 0x0099 }
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "Model source is unavailable. Please load the model resource first."
            r1 = 13
            r9.<init>(r0, r1)     // Catch:{ all -> 0x0099 }
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0091:
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "No model is bundled. Please check your app setup to includefirebase-ml-vision-image-label-model dependency."
            r9.<init>(r0, r2)     // Catch:{ all -> 0x0099 }
            throw r9     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x009d
        L_0x009c:
            throw r9
        L_0x009d:
            goto L_0x009c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqs.zza(com.google.android.gms.internal.firebase_ml.zzqn):java.util.List");
    }

    @WorkerThread
    public final synchronized void zzne() {
        if (this.zzbjj == null) {
            this.zzbjj = new ImageLabeler.Builder(this.zzbae).setScoreThreshold(this.zzbji.getConfidenceThreshold()).build();
        }
    }

    @WorkerThread
    public final synchronized void release() {
        if (this.zzbjj != null) {
            this.zzbjj.release();
            this.zzbjj = null;
        }
        zzbgf = true;
    }

    private final void zza(zzmy zzmy, long j, zzqn zzqn) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzbbg.zza((zzpb) new zzqv(this, elapsedRealtime, zzmy, zzqn), zznc.ON_DEVICE_IMAGE_LABEL_DETECT);
        zzpa zzpa = zzqu.zzbeb;
        this.zzbbg.zza((zzmn.zze.zza) ((zzux) zzmn.zze.zza.zzjn().zzf(zzmy).zzr(zzbgf).zze(zzqi.zzc(zzqn)).zzb(this.zzbji.zzpl()).zzte()), elapsedRealtime, zznc.AGGREGATED_ON_DEVICE_IMAGE_LABEL_DETECTION, zzpa);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmn.zzaa.zza zza(long j, zzmy zzmy, zzqn zzqn) {
        return zzmn.zzaa.zzky().zzb((zzmn.zzak) ((zzux) zzmn.zzak.zzlu().zzf(zzmn.zzac.zzlc().zzj(j).zzk(zzmy).zzac(zzbgf).zzad(true).zzae(true)).zzc(this.zzbji.zzpl()).zzk(zzqi.zzc(zzqn)).zzte()));
    }
}
