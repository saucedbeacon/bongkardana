package com.google.firebase.ml.vision.cloud.landmark;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzjn;
import com.google.android.gms.internal.firebase_ml.zzjx;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzpz;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirebaseVisionCloudLandmarkDetector extends zzpz<List<FirebaseVisionCloudLandmark>> {
    private static final Map<zzos<FirebaseVisionCloudDetectorOptions>, FirebaseVisionCloudLandmarkDetector> zzaya = new HashMap();

    public static synchronized FirebaseVisionCloudLandmarkDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        FirebaseVisionCloudLandmarkDetector firebaseVisionCloudLandmarkDetector;
        synchronized (FirebaseVisionCloudLandmarkDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDetectorOptions, "Options must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudDetectorOptions);
            firebaseVisionCloudLandmarkDetector = zzaya.get(zzj);
            if (firebaseVisionCloudLandmarkDetector == null) {
                firebaseVisionCloudLandmarkDetector = new FirebaseVisionCloudLandmarkDetector(firebaseApp, firebaseVisionCloudDetectorOptions);
                zzaya.put(zzj, firebaseVisionCloudLandmarkDetector);
            }
        }
        return firebaseVisionCloudLandmarkDetector;
    }

    public final int zzpc() {
        return 640;
    }

    public final int zzpd() {
        return 480;
    }

    private FirebaseVisionCloudLandmarkDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(firebaseApp, "LANDMARK_DETECTION", firebaseVisionCloudDetectorOptions);
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_LANDMARK_CREATE);
    }

    @NonNull
    public Task<List<FirebaseVisionCloudLandmark>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzov.zza(this.firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_LANDMARK_DETECT);
        return super.zza(firebaseVisionImage);
    }

    public final /* synthetic */ Object zza(@NonNull zzjn zzjn, float f) {
        if (zzjn.zzhx() == null) {
            return new ArrayList();
        }
        float f2 = 1.0f / f;
        List<zzjx> zzhx = zzjn.zzhx();
        ArrayList arrayList = new ArrayList();
        for (zzjx zza : zzhx) {
            FirebaseVisionCloudLandmark zza2 = FirebaseVisionCloudLandmark.zza(zza, f2);
            if (zza2 != null) {
                arrayList.add(zza2);
            }
        }
        return arrayList;
    }
}
