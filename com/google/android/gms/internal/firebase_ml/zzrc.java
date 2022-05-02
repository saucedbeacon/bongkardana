package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

public final class zzrc extends zzqh<FirebaseVisionText> implements Closeable {
    @GuardedBy("OnDeviceTextRecognizer.class")
    private static final Map<String, zzrc> zzaya = new HashMap();

    public static synchronized zzrc zze(@NonNull FirebaseApp firebaseApp) {
        zzrc zzrc;
        synchronized (zzrc.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zzrc = zzaya.get(firebaseApp.getPersistenceKey());
            if (zzrc == null) {
                zzrc = new zzrc(firebaseApp);
                zzaya.put(firebaseApp.getPersistenceKey(), zzrc);
            }
        }
        return zzrc;
    }

    private zzrc(@NonNull FirebaseApp firebaseApp) {
        super(firebaseApp, new zzrb(firebaseApp));
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky().zzb(zzmn.zzas.zzmn()), zznc.ON_DEVICE_TEXT_CREATE);
    }

    public final Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, true);
    }
}
