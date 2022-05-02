package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.ml.vision.text.FirebaseVisionText;
import java.util.HashMap;
import java.util.Map;

public final class zzra extends zzpz<FirebaseVisionText> {
    @GuardedBy("CloudTextRecognizer.class")
    private static final Map<zzos<FirebaseVisionCloudTextRecognizerOptions>, zzra> zzaya = new HashMap();
    private final FirebaseVisionCloudTextRecognizerOptions zzbkn;

    public static synchronized zzra zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        zzra zzra;
        synchronized (zzra.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudTextRecognizerOptions, "Options must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudTextRecognizerOptions);
            zzra = zzaya.get(zzj);
            if (zzra == null) {
                zzra = new zzra(firebaseApp, firebaseVisionCloudTextRecognizerOptions);
                zzaya.put(zzj, zzra);
            }
        }
        return zzra;
    }

    /* access modifiers changed from: protected */
    public final int zzpc() {
        return 1024;
    }

    /* access modifiers changed from: protected */
    public final int zzpd() {
        return 768;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private zzra(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        super(firebaseApp, firebaseVisionCloudTextRecognizerOptions.getModelType() == 1 ? "TEXT_DETECTION" : "DOCUMENT_TEXT_DETECTION", new zzkb(), firebaseVisionCloudTextRecognizerOptions.isEnforceCertFingerprintMatch());
        this.zzbkn = firebaseVisionCloudTextRecognizerOptions;
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky(), firebaseVisionCloudTextRecognizerOptions.getModelType() == 2 ? zznc.CLOUD_DOCUMENT_TEXT_CREATE : zznc.CLOUD_TEXT_CREATE);
    }

    public final Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zznc zznc = zznc.CLOUD_TEXT_DETECT;
        if (this.zzbkn.getModelType() == 2) {
            zznc = zznc.CLOUD_DOCUMENT_TEXT_DETECT;
        }
        zzov.zza(this.firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc);
        return super.zza(firebaseVisionImage);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza(@NonNull zzjn zzjn, float f) {
        return zzrg.zzb(zzjn.zzhv(), 1.0f / f);
    }
}
