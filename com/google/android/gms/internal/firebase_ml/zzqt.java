package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.io.Closeable;
import java.util.List;

public final class zzqt extends zzqh<List<FirebaseVisionImageLabel>> implements Closeable {
    public zzqt(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        super(firebaseApp, new zzqs(firebaseApp, firebaseVisionOnDeviceImageLabelerOptions));
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.ON_DEVICE_IMAGE_LABEL_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return zza(firebaseVisionImage, true, false);
    }
}
