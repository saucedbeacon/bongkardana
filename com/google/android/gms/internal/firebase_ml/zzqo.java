package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.face.FirebaseVisionFace;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzqo implements zzok<List<FirebaseVisionFace>, zzqn>, zzpd {
    @VisibleForTesting
    private static AtomicBoolean zzbdt = new AtomicBoolean(true);
    private static volatile Boolean zzbir;
    private final Context zzbae;
    private final zzov zzbbg;
    private final zzqg zzbgh = new zzqg();
    private final FirebaseVisionFaceDetectorOptions zzbis;
    @GuardedBy("this")
    private FaceDetector zzbit;
    @GuardedBy("this")
    private FaceDetector zzbiu;

    public zzqo(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "FirebaseVisionFaceDetectorOptions can not be null");
        this.zzbae = firebaseApp.getApplicationContext();
        this.zzbis = firebaseVisionFaceDetectorOptions;
        this.zzbbg = zzov.zza(firebaseApp, 1);
    }

    public final zzpd zzmv() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e6, code lost:
        return;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzne() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getContourMode()     // Catch:{ all -> 0x00e7 }
            r1 = 2
            if (r0 != r1) goto L_0x0096
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzbiu     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x002d
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r2 = r3.zzbae     // Catch:{ all -> 0x00e7 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            r2 = 0
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r2)     // Catch:{ all -> 0x00e7 }
            r2 = 1
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setProminentFaceOnly(r2)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzbiu = r0     // Catch:{ all -> 0x00e7 }
        L_0x002d:
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            if (r0 == r1) goto L_0x0045
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            if (r0 == r1) goto L_0x0045
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r0 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r0 = r0.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            if (r0 != r1) goto L_0x00e5
        L_0x0045:
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzbit     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e5
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r1 = r3.zzbae     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbs(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbu(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setClassificationType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbt(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            float r1 = r1.getMinFaceSize()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMinFaceSize(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            boolean r1 = r1.isTrackingEnabled()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzbit = r0     // Catch:{ all -> 0x00e7 }
            monitor-exit(r3)
            return
        L_0x0096:
            com.google.android.gms.vision.face.FaceDetector r0 = r3.zzbit     // Catch:{ all -> 0x00e7 }
            if (r0 != 0) goto L_0x00e5
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = new com.google.android.gms.vision.face.FaceDetector$Builder     // Catch:{ all -> 0x00e7 }
            android.content.Context r1 = r3.zzbae     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getLandmarkMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbs(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setLandmarkType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getClassificationMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbu(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setClassificationType(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            int r1 = r1.getPerformanceMode()     // Catch:{ all -> 0x00e7 }
            int r1 = com.google.android.gms.internal.firebase_ml.zzqi.zzbt(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMode(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            float r1 = r1.getMinFaceSize()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setMinFaceSize(r1)     // Catch:{ all -> 0x00e7 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r1 = r3.zzbis     // Catch:{ all -> 0x00e7 }
            boolean r1 = r1.isTrackingEnabled()     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector$Builder r0 = r0.setTrackingEnabled(r1)     // Catch:{ all -> 0x00e7 }
            com.google.android.gms.vision.face.FaceDetector r0 = r0.build()     // Catch:{ all -> 0x00e7 }
            r3.zzbit = r0     // Catch:{ all -> 0x00e7 }
        L_0x00e5:
            monitor-exit(r3)
            return
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqo.zzne():void");
    }

    @WorkerThread
    public final synchronized void release() {
        if (this.zzbit != null) {
            this.zzbit.release();
            this.zzbit = null;
        }
        if (this.zzbiu != null) {
            this.zzbiu.release();
            this.zzbiu = null;
        }
        zzbdt.set(true);
    }

    @WorkerThread
    @VisibleForTesting
    private final synchronized List<FirebaseVisionFace> zza(@NonNull FaceDetector faceDetector, @NonNull zzqn zzqn, long j) throws FirebaseMLException {
        ArrayList arrayList;
        if (this.zzbiu != null) {
            if (zzbir == null) {
                zzbir = Boolean.valueOf(DynamiteModule.getLocalVersion(this.zzbae, "com.google.android.gms.vision.dynamite.face") > 0);
            }
            if (!zzbir.booleanValue()) {
                throw new FirebaseMLException("No Face Contour model is bundled. Please check your app setup to include firebase-ml-vision-face-model dependency.", 14);
            }
        }
        if (faceDetector.isOperational()) {
            SparseArray<Face> detect = faceDetector.detect(zzqn.zzbhi);
            arrayList = new ArrayList();
            for (int i = 0; i < detect.size(); i++) {
                arrayList.add(new FirebaseVisionFace(detect.get(detect.keyAt(i))));
            }
        } else {
            zza(zzmy.MODEL_NOT_DOWNLOADED, j, zzqn, 0, 0);
            throw new FirebaseMLException("Waiting for the face detection model to be downloaded. Please wait.", 14);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[SYNTHETIC, Splitter:B:49:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011b A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.google.firebase.ml.vision.face.FirebaseVisionFace> zza(@androidx.annotation.NonNull com.google.android.gms.internal.firebase_ml.zzqn r22) throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r21 = this;
            r8 = r21
            r0 = r22
            monitor-enter(r21)
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0166 }
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzbit     // Catch:{ all -> 0x0166 }
            r9 = 13
            if (r1 != 0) goto L_0x0027
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzbiu     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            com.google.android.gms.internal.firebase_ml.zzmy r2 = com.google.android.gms.internal.firebase_ml.zzmy.UNKNOWN_ERROR     // Catch:{ all -> 0x0166 }
            r6 = 0
            r7 = 0
            r1 = r21
            r5 = r22
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmy) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzqn) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0166 }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "Face detector wasn't initialized correctly. This is most likely caused by invalid face detector options."
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0027:
            com.google.android.gms.internal.firebase_ml.zzqg r1 = r8.zzbgh     // Catch:{ all -> 0x0166 }
            r1.zzb(r0)     // Catch:{ all -> 0x0166 }
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzbit     // Catch:{ all -> 0x0166 }
            r2 = 0
            if (r1 == 0) goto L_0x0043
            com.google.android.gms.vision.face.FaceDetector r1 = r8.zzbit     // Catch:{ all -> 0x0166 }
            java.util.List r1 = r8.zza(r1, r0, r3)     // Catch:{ all -> 0x0166 }
            com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions r5 = r8.zzbis     // Catch:{ all -> 0x0166 }
            boolean r5 = r5.isTrackingEnabled()     // Catch:{ all -> 0x0166 }
            if (r5 != 0) goto L_0x0044
            zzh(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0044
        L_0x0043:
            r1 = r2
        L_0x0044:
            com.google.android.gms.vision.face.FaceDetector r5 = r8.zzbiu     // Catch:{ all -> 0x0166 }
            if (r5 == 0) goto L_0x0051
            com.google.android.gms.vision.face.FaceDetector r2 = r8.zzbiu     // Catch:{ all -> 0x0166 }
            java.util.List r2 = r8.zza(r2, r0, r3)     // Catch:{ all -> 0x0166 }
            zzh(r2)     // Catch:{ all -> 0x0166 }
        L_0x0051:
            if (r1 != 0) goto L_0x005e
            if (r2 == 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = "No detector is enabled"
            r0.<init>(r1, r9)     // Catch:{ all -> 0x0166 }
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x005e:
            if (r1 != 0) goto L_0x0065
            r0 = r2
        L_0x0061:
            r19 = r3
            goto L_0x0140
        L_0x0065:
            if (r2 != 0) goto L_0x0069
            r0 = r1
            goto L_0x0061
        L_0x0069:
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0166 }
            r5.<init>()     // Catch:{ all -> 0x0166 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0166 }
        L_0x0072:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0166 }
            if (r7 == 0) goto L_0x0139
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0166 }
            com.google.firebase.ml.vision.face.FirebaseVisionFace r7 = (com.google.firebase.ml.vision.face.FirebaseVisionFace) r7     // Catch:{ all -> 0x0166 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x0166 }
            r11 = 0
        L_0x0083:
            boolean r12 = r10.hasNext()     // Catch:{ all -> 0x0166 }
            if (r12 == 0) goto L_0x0128
            java.lang.Object r12 = r10.next()     // Catch:{ all -> 0x0166 }
            com.google.firebase.ml.vision.face.FirebaseVisionFace r12 = (com.google.firebase.ml.vision.face.FirebaseVisionFace) r12     // Catch:{ all -> 0x0166 }
            android.graphics.Rect r13 = r7.getBoundingBox()     // Catch:{ all -> 0x0166 }
            if (r13 == 0) goto L_0x010a
            android.graphics.Rect r13 = r12.getBoundingBox()     // Catch:{ all -> 0x0166 }
            if (r13 != 0) goto L_0x009c
            goto L_0x010a
        L_0x009c:
            android.graphics.Rect r13 = r7.getBoundingBox()     // Catch:{ all -> 0x0166 }
            android.graphics.Rect r15 = r12.getBoundingBox()     // Catch:{ all -> 0x0166 }
            boolean r16 = r13.intersect(r15)     // Catch:{ all -> 0x0166 }
            if (r16 == 0) goto L_0x010a
            int r14 = r13.right     // Catch:{ all -> 0x0166 }
            int r9 = r15.right     // Catch:{ all -> 0x0166 }
            int r9 = java.lang.Math.min(r14, r9)     // Catch:{ all -> 0x0166 }
            int r14 = r13.left     // Catch:{ all -> 0x0166 }
            int r0 = r15.left     // Catch:{ all -> 0x0166 }
            int r0 = java.lang.Math.max(r14, r0)     // Catch:{ all -> 0x0166 }
            int r9 = r9 - r0
            int r0 = r13.bottom     // Catch:{ all -> 0x0166 }
            int r14 = r15.bottom     // Catch:{ all -> 0x0166 }
            int r0 = java.lang.Math.min(r0, r14)     // Catch:{ all -> 0x0166 }
            int r14 = r13.top     // Catch:{ all -> 0x0166 }
            r17 = r6
            int r6 = r15.top     // Catch:{ all -> 0x0166 }
            int r6 = java.lang.Math.max(r14, r6)     // Catch:{ all -> 0x0166 }
            int r0 = r0 - r6
            int r9 = r9 * r0
            r0 = r10
            double r9 = (double) r9     // Catch:{ all -> 0x0166 }
            int r6 = r13.right     // Catch:{ all -> 0x0166 }
            int r14 = r13.left     // Catch:{ all -> 0x0166 }
            int r6 = r6 - r14
            int r14 = r13.bottom     // Catch:{ all -> 0x0166 }
            int r13 = r13.top     // Catch:{ all -> 0x0166 }
            int r14 = r14 - r13
            int r6 = r6 * r14
            double r13 = (double) r6     // Catch:{ all -> 0x0166 }
            int r6 = r15.right     // Catch:{ all -> 0x0166 }
            r18 = r0
            int r0 = r15.left     // Catch:{ all -> 0x0166 }
            int r6 = r6 - r0
            int r0 = r15.bottom     // Catch:{ all -> 0x0166 }
            int r15 = r15.top     // Catch:{ all -> 0x0166 }
            int r0 = r0 - r15
            int r6 = r6 * r0
            r19 = r3
            double r3 = (double) r6
            java.lang.Double.isNaN(r13)
            java.lang.Double.isNaN(r3)
            double r13 = r13 + r3
            java.lang.Double.isNaN(r9)
            double r13 = r13 - r9
            java.lang.Double.isNaN(r9)
            double r9 = r9 / r13
            r3 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x010a:
            r19 = r3
            r17 = r6
            r18 = r10
        L_0x0110:
            r0 = 0
        L_0x0111:
            if (r0 == 0) goto L_0x011b
            android.util.SparseArray r0 = r7.zzpj()     // Catch:{ all -> 0x0166 }
            r12.zza(r0)     // Catch:{ all -> 0x0166 }
            r11 = 1
        L_0x011b:
            r5.add(r12)     // Catch:{ all -> 0x0166 }
            r0 = r22
            r6 = r17
            r10 = r18
            r3 = r19
            goto L_0x0083
        L_0x0128:
            r19 = r3
            r17 = r6
            if (r11 != 0) goto L_0x0131
            r5.add(r7)     // Catch:{ all -> 0x0166 }
        L_0x0131:
            r0 = r22
            r6 = r17
            r3 = r19
            goto L_0x0072
        L_0x0139:
            r19 = r3
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0166 }
            r0.<init>(r5)     // Catch:{ all -> 0x0166 }
        L_0x0140:
            com.google.android.gms.internal.firebase_ml.zzmy r3 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR     // Catch:{ all -> 0x0166 }
            if (r2 != 0) goto L_0x0146
            r6 = 0
            goto L_0x014b
        L_0x0146:
            int r2 = r2.size()     // Catch:{ all -> 0x0166 }
            r6 = r2
        L_0x014b:
            if (r1 != 0) goto L_0x014f
            r7 = 0
            goto L_0x0154
        L_0x014f:
            int r1 = r1.size()     // Catch:{ all -> 0x0166 }
            r7 = r1
        L_0x0154:
            r1 = r21
            r2 = r3
            r3 = r19
            r5 = r22
            r1.zza((com.google.android.gms.internal.firebase_ml.zzmy) r2, (long) r3, (com.google.android.gms.internal.firebase_ml.zzqn) r5, (int) r6, (int) r7)     // Catch:{ all -> 0x0166 }
            java.util.concurrent.atomic.AtomicBoolean r1 = zzbdt     // Catch:{ all -> 0x0166 }
            r2 = 0
            r1.set(r2)     // Catch:{ all -> 0x0166 }
            monitor-exit(r21)
            return r0
        L_0x0166:
            r0 = move-exception
            monitor-exit(r21)
            goto L_0x016a
        L_0x0169:
            throw r0
        L_0x016a:
            goto L_0x0169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqo.zza(com.google.android.gms.internal.firebase_ml.zzqn):java.util.List");
    }

    private static void zzh(@NonNull List<FirebaseVisionFace> list) {
        for (FirebaseVisionFace zzbf : list) {
            zzbf.zzbf(-1);
        }
    }

    @WorkerThread
    private final synchronized void zza(zzmy zzmy, long j, zzqn zzqn, int i, int i2) {
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            this.zzbbg.zza((zzpb) new zzqq(this, elapsedRealtime, zzmy, i, i2, zzqn), zznc.ON_DEVICE_FACE_DETECT);
            zzmy zzmy2 = zzmy;
            zzpa zzpa = zzqp.zzbeb;
            this.zzbbg.zza((zzmn.zzd.zza) ((zzux) zzmn.zzd.zza.zzjk().zze(zzmy).zzq(zzbdt.get()).zzd(zzqi.zzc(zzqn)).zzap(i).zzaq(i2).zzb(this.zzbis.zzpk()).zzte()), elapsedRealtime, zznc.AGGREGATED_ON_DEVICE_FACE_DETECTION, zzpa);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmn.zzaa.zza zza(long j, zzmy zzmy, int i, int i2, zzqn zzqn) {
        return zzmn.zzaa.zzky().zzb((zzmn.zzaj) ((zzux) zzmn.zzaj.zzls().zze(zzmn.zzac.zzlc().zzj(j).zzk(zzmy).zzac(zzbdt.get()).zzad(true).zzae(true)).zzc(this.zzbis.zzpk()).zzbk(i).zzbl(i2).zzj(zzqi.zzc(zzqn)).zzte()));
    }
}
