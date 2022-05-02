package com.google.firebase.ml.vision.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzra;
import com.google.android.gms.internal.firebase_ml.zzrc;
import com.google.android.gms.tasks.Task;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseVisionTextRecognizer implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;
    @GuardedBy("FirebaseVisionTextRecognizer.class")
    private static final Map<zzrc, FirebaseVisionTextRecognizer> zzbje = new HashMap();
    @GuardedBy("FirebaseVisionTextRecognizer.class")
    private static final Map<zzra, FirebaseVisionTextRecognizer> zzbjf = new HashMap();
    private final zzrc zzbkk;
    private final zzra zzbkl;
    @RecognizerType
    private final int zzbkm;

    @Retention(RetentionPolicy.CLASS)
    public @interface RecognizerType {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer zza(@androidx.annotation.NonNull com.google.firebase.FirebaseApp r3, @androidx.annotation.Nullable com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions r4, boolean r5) {
        /*
            java.lang.Class<com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r0 = com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer.class
            monitor-enter(r0)
            java.lang.String r1 = "FirebaseApp must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r1)     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = r3.getPersistenceKey()     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = "Firebase app name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1, r2)     // Catch:{ all -> 0x0051 }
            if (r5 != 0) goto L_0x0018
            java.lang.String r1 = "Options must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r1)     // Catch:{ all -> 0x0051 }
        L_0x0018:
            r1 = 0
            if (r5 == 0) goto L_0x0036
            com.google.android.gms.internal.firebase_ml.zzrc r3 = com.google.android.gms.internal.firebase_ml.zzrc.zze(r3)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzrc, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r4 = zzbje     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0051 }
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = (com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer) r4     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x0034
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = new com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer     // Catch:{ all -> 0x0051 }
            r5 = 1
            r4.<init>(r3, r1, r5)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzrc, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r5 = zzbje     // Catch:{ all -> 0x0051 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0051 }
        L_0x0034:
            monitor-exit(r0)
            return r4
        L_0x0036:
            com.google.android.gms.internal.firebase_ml.zzra r3 = com.google.android.gms.internal.firebase_ml.zzra.zza((com.google.firebase.FirebaseApp) r3, (com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions) r4)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzra, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r4 = zzbjf     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0051 }
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = (com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer) r4     // Catch:{ all -> 0x0051 }
            if (r4 != 0) goto L_0x004f
            com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer r4 = new com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer     // Catch:{ all -> 0x0051 }
            r5 = 2
            r4.<init>(r1, r3, r5)     // Catch:{ all -> 0x0051 }
            java.util.Map<com.google.android.gms.internal.firebase_ml.zzra, com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer> r5 = zzbjf     // Catch:{ all -> 0x0051 }
            r5.put(r3, r4)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer.zza(com.google.firebase.FirebaseApp, com.google.firebase.ml.vision.text.FirebaseVisionCloudTextRecognizerOptions, boolean):com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer");
    }

    private FirebaseVisionTextRecognizer(@Nullable zzrc zzrc, @Nullable zzra zzra, @RecognizerType int i) {
        this.zzbkm = i;
        this.zzbkk = zzrc;
        this.zzbkl = zzra;
    }

    @NonNull
    public Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkArgument((this.zzbkk == null && this.zzbkl == null) ? false : true, "Either on-device or cloud text recognizer should be enabled.");
        zzrc zzrc = this.zzbkk;
        if (zzrc != null) {
            return zzrc.processImage(firebaseVisionImage);
        }
        return this.zzbkl.processImage(firebaseVisionImage);
    }

    @RecognizerType
    public int getRecognizerType() {
        return this.zzbkm;
    }

    public void close() throws IOException {
        zzrc zzrc = this.zzbkk;
        if (zzrc != null) {
            zzrc.close();
        }
        zzra zzra = this.zzbkl;
        if (zzra != null) {
            zzra.close();
        }
    }
}
