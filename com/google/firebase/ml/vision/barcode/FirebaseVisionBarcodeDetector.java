package com.google.firebase.ml.vision.barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzqh;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.barcode.internal.zzc;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirebaseVisionBarcodeDetector extends zzqh<List<FirebaseVisionBarcode>> implements Closeable {
    private static final Map<zzos<FirebaseVisionBarcodeDetectorOptions>, FirebaseVisionBarcodeDetector> zzaya = new HashMap();

    public static synchronized FirebaseVisionBarcodeDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        FirebaseVisionBarcodeDetector firebaseVisionBarcodeDetector;
        synchronized (FirebaseVisionBarcodeDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "You must provide a valid FirebaseApp.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseApp.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "You must provide a valid FirebaseVisionBarcodeDetectorOptions.");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionBarcodeDetectorOptions);
            firebaseVisionBarcodeDetector = zzaya.get(zzj);
            if (firebaseVisionBarcodeDetector == null) {
                firebaseVisionBarcodeDetector = new FirebaseVisionBarcodeDetector(firebaseApp, firebaseVisionBarcodeDetectorOptions);
                zzaya.put(zzj, firebaseVisionBarcodeDetector);
            }
        }
        return firebaseVisionBarcodeDetector;
    }

    private FirebaseVisionBarcodeDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        super(firebaseApp, new zzc(firebaseApp, firebaseVisionBarcodeDetectorOptions));
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky().zzb((zzmn.zzai) ((zzux) zzmn.zzai.zzlq().zzc(firebaseVisionBarcodeDetectorOptions.zzpa()).zzte())), zznc.ON_DEVICE_BARCODE_CREATE);
    }

    @NonNull
    public Task<List<FirebaseVisionBarcode>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, false);
    }

    public void close() throws IOException {
        super.close();
    }
}
