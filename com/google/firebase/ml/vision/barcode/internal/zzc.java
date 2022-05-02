package com.google.firebase.ml.vision.barcode.internal;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.SparseArray;
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
import com.google.android.gms.internal.firebase_ml.zzpb;
import com.google.android.gms.internal.firebase_ml.zzpd;
import com.google.android.gms.internal.firebase_ml.zzqg;
import com.google.android.gms.internal.firebase_ml.zzqi;
import com.google.android.gms.internal.firebase_ml.zzqj;
import com.google.android.gms.internal.firebase_ml.zzqn;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcode;
import com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import java.util.ArrayList;
import java.util.List;

public final class zzc implements zzok<List<FirebaseVisionBarcode>, zzqn>, zzpd {
    @VisibleForTesting
    private static boolean zzbgf = true;
    private final Context zzbae;
    private final zzov zzbbg;
    private final FirebaseVisionBarcodeDetectorOptions zzbgg;
    private final zzqg zzbgh = new zzqg();
    @Nullable
    private IBarcodeDetector zzbgi;
    @Nullable
    private BarcodeDetector zzbgj;

    public zzc(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "FirebaseVisionBarcodeDetectorOptions can not be null");
        this.zzbae = firebaseApp.getApplicationContext();
        this.zzbgg = firebaseVisionBarcodeDetectorOptions;
        this.zzbbg = zzov.zza(firebaseApp, 1);
    }

    public final zzpd zzmv() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return;
     */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzne() throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r4.zzbgi     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x000b
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r4.zzpb()     // Catch:{ all -> 0x003e }
            r4.zzbgi = r0     // Catch:{ all -> 0x003e }
        L_0x000b:
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r4.zzbgi     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r4.zzbgi     // Catch:{ RemoteException -> 0x0016 }
            r0.start()     // Catch:{ RemoteException -> 0x0016 }
            monitor-exit(r4)
            return
        L_0x0016:
            r0 = move-exception
            com.google.firebase.ml.common.FirebaseMLException r1 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "Failed to start barcode detector pipeline."
            r3 = 14
            r1.<init>(r2, r3, r0)     // Catch:{ all -> 0x003e }
            throw r1     // Catch:{ all -> 0x003e }
        L_0x0021:
            com.google.android.gms.vision.barcode.BarcodeDetector r0 = r4.zzbgj     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x003c
            com.google.android.gms.vision.barcode.BarcodeDetector$Builder r0 = new com.google.android.gms.vision.barcode.BarcodeDetector$Builder     // Catch:{ all -> 0x003e }
            android.content.Context r1 = r4.zzbae     // Catch:{ all -> 0x003e }
            r0.<init>(r1)     // Catch:{ all -> 0x003e }
            com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions r1 = r4.zzbgg     // Catch:{ all -> 0x003e }
            int r1 = r1.zzoz()     // Catch:{ all -> 0x003e }
            com.google.android.gms.vision.barcode.BarcodeDetector$Builder r0 = r0.setBarcodeFormats(r1)     // Catch:{ all -> 0x003e }
            com.google.android.gms.vision.barcode.BarcodeDetector r0 = r0.build()     // Catch:{ all -> 0x003e }
            r4.zzbgj = r0     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r4)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.barcode.internal.zzc.zzne():void");
    }

    @VisibleForTesting
    @Nullable
    private final IBarcodeDetector zzpb() throws FirebaseMLException {
        if (DynamiteModule.getLocalVersion(this.zzbae, "com.google.firebase.ml.vision.dynamite.barcode") <= 0) {
            return null;
        }
        try {
            return zzh.asInterface(DynamiteModule.load(this.zzbae, DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.barcode").instantiate("com.google.firebase.ml.vision.barcode.BarcodeDetectorCreator")).newBarcodeDetector(new BarcodeDetectorOptionsParcel(this.zzbgg.zzoz()));
        } catch (RemoteException | DynamiteModule.LoadingException e) {
            throw new FirebaseMLException("Failed to load barcode detector module.", 14, e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000b */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void release() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r2.zzbgi     // Catch:{ all -> 0x001d }
            r1 = 0
            if (r0 == 0) goto L_0x000d
            com.google.firebase.ml.vision.barcode.internal.IBarcodeDetector r0 = r2.zzbgi     // Catch:{ RemoteException -> 0x000b }
            r0.stop()     // Catch:{ RemoteException -> 0x000b }
        L_0x000b:
            r2.zzbgi = r1     // Catch:{ all -> 0x001d }
        L_0x000d:
            com.google.android.gms.vision.barcode.BarcodeDetector r0 = r2.zzbgj     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0018
            com.google.android.gms.vision.barcode.BarcodeDetector r0 = r2.zzbgj     // Catch:{ all -> 0x001d }
            r0.release()     // Catch:{ all -> 0x001d }
            r2.zzbgj = r1     // Catch:{ all -> 0x001d }
        L_0x0018:
            r0 = 1
            zzbgf = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.barcode.internal.zzc.release():void");
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final synchronized List<FirebaseVisionBarcode> zza(@NonNull zzqn zzqn) throws FirebaseMLException {
        ArrayList arrayList;
        zzqn zzqn2 = zzqn;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzbgh.zzb(zzqn2);
            arrayList = new ArrayList();
            if (this.zzbgi != null) {
                try {
                    IObjectWrapper wrap = ObjectWrapper.wrap(zzqn2.zzbhi);
                    Frame.Metadata metadata = zzqn2.zzbhi.getMetadata();
                    for (zzd firebaseVisionBarcode : (List) ObjectWrapper.unwrap(this.zzbgi.zzb(wrap, new zzqj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation())))) {
                        arrayList.add(new FirebaseVisionBarcode(firebaseVisionBarcode));
                    }
                } catch (RemoteException e) {
                    throw new FirebaseMLException("Failed to run barcode detector.", 14, e);
                }
            } else if (this.zzbgj == null) {
                zza(zzmy.UNKNOWN_ERROR, elapsedRealtime, zzqn, (List<FirebaseVisionBarcode>) null);
                throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 14);
            } else if (this.zzbgj.isOperational()) {
                SparseArray detect = this.zzbgj.detect(zzqn2.zzbhi);
                for (int i = 0; i < detect.size(); i++) {
                    arrayList.add(new FirebaseVisionBarcode(new zzf((Barcode) detect.get(detect.keyAt(i)))));
                }
            } else {
                zza(zzmy.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzqn, (List<FirebaseVisionBarcode>) null);
                throw new FirebaseMLException("Waiting for the barcode detection model to be downloaded. Please wait.", 14);
            }
            zza(zzmy.NO_ERROR, elapsedRealtime, zzqn, arrayList);
            zzbgf = false;
        }
        return arrayList;
    }

    @WorkerThread
    private final void zza(zzmy zzmy, long j, @NonNull zzqn zzqn, @Nullable List<FirebaseVisionBarcode> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            for (FirebaseVisionBarcode next : list) {
                arrayList.add(next.zzox());
                arrayList2.add(next.zzoy());
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzbbg.zza((zzpb) new zzb(this, elapsedRealtime, zzmy, arrayList, arrayList2, zzqn), zznc.ON_DEVICE_BARCODE_DETECT);
        zze zze = new zze(this);
        this.zzbbg.zza((zzmn.zzc.zza) ((zzux) zzmn.zzc.zza.zzjh().zzd(zzmy).zzp(zzbgf).zzc(zzqi.zzc(zzqn)).zzb(this.zzbgg.zzpa()).zzj(arrayList).zzk(arrayList2).zzte()), elapsedRealtime, zznc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION, zze);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmn.zzaa.zza zza(long j, zzmy zzmy, List list, List list2, zzqn zzqn) {
        boolean z = true;
        zzmn.zzai.zzc zzi = zzmn.zzai.zzlq().zzd(zzmn.zzac.zzlc().zzj(j).zzk(zzmy).zzac(zzbgf).zzad(true).zzae(true)).zzc(this.zzbgg.zzpa()).zzs(list).zzt(list2).zzi(zzqi.zzc(zzqn));
        zzmn.zzaa.zza zzky = zzmn.zzaa.zzky();
        if (this.zzbgi == null) {
            z = false;
        }
        return zzky.zzab(z).zzb(zzi);
    }
}
