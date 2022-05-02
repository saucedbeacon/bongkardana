package com.google.firebase.ml.vision.document;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzjn;
import com.google.android.gms.internal.firebase_ml.zzkb;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzpz;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.util.HashMap;
import java.util.Map;

public class FirebaseVisionDocumentTextRecognizer extends zzpz<FirebaseVisionDocumentText> {
    private static final Map<zzos<FirebaseVisionCloudDocumentRecognizerOptions>, FirebaseVisionDocumentTextRecognizer> zzaya = new HashMap();

    public static synchronized FirebaseVisionDocumentTextRecognizer zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer;
        synchronized (FirebaseVisionDocumentTextRecognizer.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDocumentRecognizerOptions, "Options must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudDocumentRecognizerOptions);
            firebaseVisionDocumentTextRecognizer = zzaya.get(zzj);
            if (firebaseVisionDocumentTextRecognizer == null) {
                zzkb zzkb = new zzkb();
                zzkb.zzd(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages());
                FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer2 = new FirebaseVisionDocumentTextRecognizer(firebaseApp, zzkb, firebaseVisionCloudDocumentRecognizerOptions.isEnforceCertFingerprintMatch());
                zzaya.put(zzj, firebaseVisionDocumentTextRecognizer2);
                firebaseVisionDocumentTextRecognizer = firebaseVisionDocumentTextRecognizer2;
            }
        }
        return firebaseVisionDocumentTextRecognizer;
    }

    public final int zzpc() {
        return 1024;
    }

    public final int zzpd() {
        return 768;
    }

    private FirebaseVisionDocumentTextRecognizer(@NonNull FirebaseApp firebaseApp, @NonNull zzkb zzkb, boolean z) {
        super(firebaseApp, "DOCUMENT_TEXT_DETECTION", zzkb, z);
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_DOCUMENT_TEXT_CREATE);
    }

    @NonNull
    public Task<FirebaseVisionDocumentText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzov.zza(this.firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_DOCUMENT_TEXT_DETECT);
        return super.zza(firebaseVisionImage);
    }

    public final /* synthetic */ Object zza(@NonNull zzjn zzjn, float f) {
        return FirebaseVisionDocumentText.zza(zzjn.zzhv(), 1.0f / f);
    }
}
