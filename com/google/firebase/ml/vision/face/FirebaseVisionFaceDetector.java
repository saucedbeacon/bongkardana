package com.google.firebase.ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzqh;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirebaseVisionFaceDetector extends zzqh<List<FirebaseVisionFace>> implements Closeable {
    private static final Map<zzos<FirebaseVisionFaceDetectorOptions>, FirebaseVisionFaceDetector> zzaya = new HashMap();

    public static synchronized FirebaseVisionFaceDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        FirebaseVisionFaceDetector firebaseVisionFaceDetector;
        synchronized (FirebaseVisionFaceDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "You must provide a valid FirebaseApp.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseApp.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "You must provide a valid FirebaseVisionFaceDetectorOptions.");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionFaceDetectorOptions);
            firebaseVisionFaceDetector = zzaya.get(zzj);
            if (firebaseVisionFaceDetector == null) {
                firebaseVisionFaceDetector = new FirebaseVisionFaceDetector(firebaseApp, firebaseVisionFaceDetectorOptions);
                zzaya.put(zzj, firebaseVisionFaceDetector);
            }
        }
        return firebaseVisionFaceDetector;
    }

    private FirebaseVisionFaceDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        super(firebaseApp, new zzqo(firebaseApp, firebaseVisionFaceDetectorOptions));
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky().zzb((zzmn.zzaj) ((zzux) zzmn.zzaj.zzls().zzc(firebaseVisionFaceDetectorOptions.zzpk()).zzte())), zznc.ON_DEVICE_FACE_CREATE);
    }

    @NonNull
    public Task<List<FirebaseVisionFace>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, true);
    }

    public void close() throws IOException {
        super.close();
    }
}
