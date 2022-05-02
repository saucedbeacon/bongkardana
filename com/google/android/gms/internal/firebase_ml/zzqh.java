package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.vision.Frame;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;

public class zzqh<TDetectionResult> implements Closeable {
    private final zzor zzbde;
    private final zzok<TDetectionResult, zzqn> zzbhs;

    public zzqh(@NonNull FirebaseApp firebaseApp, zzok<TDetectionResult, zzqn> zzok) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
        Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
        this.zzbhs = zzok;
        zzor zza = zzor.zza(firebaseApp);
        this.zzbde = zza;
        zza.zza(zzok);
    }

    public final Task<TDetectionResult> zza(@NonNull FirebaseVisionImage firebaseVisionImage, boolean z, boolean z2) {
        Preconditions.checkNotNull(firebaseVisionImage, "FirebaseVisionImage can not be null");
        Frame zza = firebaseVisionImage.zza(z, z2);
        if (zza.getMetadata().getWidth() < 32 || zza.getMetadata().getHeight() < 32) {
            return Tasks.forException(new FirebaseMLException("Image width and height should be at least 32!", 3));
        }
        return this.zzbde.zza(this.zzbhs, new zzqn(firebaseVisionImage, zza));
    }

    public void close() throws IOException {
        this.zzbde.zzb(this.zzbhs);
    }
}
