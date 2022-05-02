package com.google.firebase.ml.vision.label;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzos;
import com.google.android.gms.internal.firebase_ml.zzqr;
import com.google.android.gms.internal.firebase_ml.zzqt;
import com.google.android.gms.internal.firebase_ml.zzqx;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseVisionImageLabeler implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;
    public static final int ON_DEVICE_AUTOML = 3;
    @GuardedBy("FirebaseVisionImageLabeler.class")
    private static final Map<zzos<FirebaseVisionOnDeviceImageLabelerOptions>, FirebaseVisionImageLabeler> zzbje = new HashMap();
    @GuardedBy("FirebaseVisionImageLabeler.class")
    private static final Map<zzos<FirebaseVisionCloudImageLabelerOptions>, FirebaseVisionImageLabeler> zzbjf = new HashMap();
    @GuardedBy("FirebaseVisionImageLabeler.class")
    private static final Map<zzos<FirebaseVisionOnDeviceAutoMLImageLabelerOptions>, FirebaseVisionImageLabeler> zzbjg = new HashMap();
    private final zzqr zzbiz;
    private final zzqt zzbja;
    private final zzqx zzbjb;
    /* access modifiers changed from: private */
    public final FirebaseVisionCloudImageLabelerOptions zzbjc;
    @ImageLabelerType
    private final int zzbjd;

    @Retention(RetentionPolicy.CLASS)
    public @interface ImageLabelerType {
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionOnDeviceImageLabelerOptions);
            firebaseVisionImageLabeler = zzbje.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionImageLabeler firebaseVisionImageLabeler2 = new FirebaseVisionImageLabeler(new zzqt(firebaseApp, firebaseVisionOnDeviceImageLabelerOptions));
                zzbje.put(zzj, firebaseVisionImageLabeler2);
                firebaseVisionImageLabeler = firebaseVisionImageLabeler2;
            }
        }
        return firebaseVisionImageLabeler;
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionOnDeviceAutoMLImageLabelerOptions);
            firebaseVisionImageLabeler = zzbjg.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionImageLabeler firebaseVisionImageLabeler2 = new FirebaseVisionImageLabeler(new zzqx(firebaseApp, firebaseVisionOnDeviceAutoMLImageLabelerOptions));
                zzbjg.put(zzj, firebaseVisionImageLabeler2);
                firebaseVisionImageLabeler = firebaseVisionImageLabeler2;
            }
        }
        return firebaseVisionImageLabeler;
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zzos zzj = zzos.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudImageLabelerOptions);
            firebaseVisionImageLabeler = zzbjf.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionCloudDetectorOptions.Builder maxResults = new FirebaseVisionCloudDetectorOptions.Builder().setMaxResults(20);
                if (firebaseVisionCloudImageLabelerOptions.isEnforceCertFingerprintMatch()) {
                    maxResults.enforceCertFingerprintMatch();
                }
                firebaseVisionImageLabeler = new FirebaseVisionImageLabeler(new zzqr(firebaseApp, maxResults.build()), firebaseVisionCloudImageLabelerOptions);
                zzbjf.put(zzj, firebaseVisionImageLabeler);
            }
        }
        return firebaseVisionImageLabeler;
    }

    @NonNull
    public Task<List<FirebaseVisionImageLabel>> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkState((this.zzbja == null && this.zzbiz == null && this.zzbjb == null) ? false : true, "One of on-device, cloud, or on-device AutoML image labeler should be set.");
        zzqt zzqt = this.zzbja;
        if (zzqt != null) {
            return zzqt.detectInImage(firebaseVisionImage);
        }
        zzqx zzqx = this.zzbjb;
        if (zzqx != null) {
            return zzqx.detectInImage(firebaseVisionImage);
        }
        return this.zzbiz.detectInImage(firebaseVisionImage).continueWith(new zzb(this));
    }

    @ImageLabelerType
    public int getImageLabelerType() {
        return this.zzbjd;
    }

    public void close() throws IOException {
        zzqt zzqt = this.zzbja;
        if (zzqt != null) {
            zzqt.close();
        }
        zzqr zzqr = this.zzbiz;
        if (zzqr != null) {
            zzqr.close();
        }
        zzqx zzqx = this.zzbjb;
        if (zzqx != null) {
            zzqx.close();
        }
    }

    private FirebaseVisionImageLabeler(@Nullable zzqt zzqt) {
        this(zzqt, (zzqr) null, (zzqx) null, (FirebaseVisionCloudImageLabelerOptions) null);
    }

    private FirebaseVisionImageLabeler(@Nullable zzqr zzqr, @Nullable FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        this((zzqt) null, zzqr, (zzqx) null, firebaseVisionCloudImageLabelerOptions);
    }

    private FirebaseVisionImageLabeler(@NonNull zzqx zzqx) {
        this((zzqt) null, (zzqr) null, zzqx, (FirebaseVisionCloudImageLabelerOptions) null);
    }

    private FirebaseVisionImageLabeler(@Nullable zzqt zzqt, @Nullable zzqr zzqr, @Nullable zzqx zzqx, @Nullable FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        Preconditions.checkArgument((zzqt == null && zzqr == null && zzqx == null) ? false : true, "One of on-device, cloud or on-device AutoML image labeler should be set.");
        this.zzbja = zzqt;
        this.zzbiz = zzqr;
        this.zzbjc = firebaseVisionCloudImageLabelerOptions;
        this.zzbjb = zzqx;
        if (zzqr != null) {
            this.zzbjd = 2;
        } else if (zzqt != null) {
            this.zzbjd = 1;
        } else {
            this.zzbjd = 3;
        }
    }
}
