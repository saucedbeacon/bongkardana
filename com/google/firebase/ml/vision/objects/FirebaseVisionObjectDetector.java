package com.google.firebase.ml.vision.objects;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzqh;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.objects.internal.zze;
import java.io.Closeable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirebaseVisionObjectDetector extends zzqh<List<FirebaseVisionObject>> implements Closeable {
    private static final Map<zzos<FirebaseVisionObjectDetectorOptions>, FirebaseVisionObjectDetector> zzaya = new HashMap();

    public static synchronized FirebaseVisionObjectDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        FirebaseVisionObjectDetector firebaseVisionObjectDetector;
        synchronized (FirebaseVisionObjectDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "You must provide a valid FirebaseApp.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseApp.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionObjectDetectorOptions, "You must provide a valid FirebaseVisionObjectDetectorOptions.");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionObjectDetectorOptions);
            firebaseVisionObjectDetector = zzaya.get(zzj);
            if (firebaseVisionObjectDetector == null) {
                firebaseVisionObjectDetector = new FirebaseVisionObjectDetector(firebaseApp, firebaseVisionObjectDetectorOptions);
                zzaya.put(zzj, firebaseVisionObjectDetector);
            }
        }
        return firebaseVisionObjectDetector;
    }

    private FirebaseVisionObjectDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions) {
        super(firebaseApp, new zze(firebaseApp, firebaseVisionObjectDetectorOptions));
    }

    @NonNull
    public Task<List<FirebaseVisionObject>> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        firebaseVisionImage.zzpf();
        return super.zza(firebaseVisionImage, false, true);
    }
}
