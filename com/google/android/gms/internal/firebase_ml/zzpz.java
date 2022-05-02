package com.google.android.gms.internal.firebase_ml;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;

public abstract class zzpz<ResultType> implements Closeable {
    protected final FirebaseApp firebaseApp;
    private final zzkb imageContext;
    private final zzor zzbde;
    private final zzqc zzbgo;
    private final zzka zzbgp;

    public zzpz(@NonNull FirebaseApp firebaseApp2, @NonNull String str, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        this(firebaseApp2, new zzka().zza(Integer.valueOf(firebaseVisionCloudDetectorOptions.getMaxResults())).zzav(str).zzau(zzpy.zzbr(firebaseVisionCloudDetectorOptions.getModelType())), (zzkb) null, firebaseVisionCloudDetectorOptions.isEnforceCertFingerprintMatch());
    }

    public void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    public abstract ResultType zza(@NonNull zzjn zzjn, float f);

    /* access modifiers changed from: protected */
    public abstract int zzpc();

    /* access modifiers changed from: protected */
    public abstract int zzpd();

    public zzpz(@NonNull FirebaseApp firebaseApp2, @NonNull String str, @NonNull zzkb zzkb, boolean z) {
        this(firebaseApp2, new zzka().zzav(str).zzau(zzpy.zzbr(1)), (zzkb) Preconditions.checkNotNull(zzkb, "ImageContext must not be null"), z);
    }

    private zzpz(@NonNull FirebaseApp firebaseApp2, @NonNull zzka zzka, @Nullable zzkb zzkb, boolean z) {
        Preconditions.checkNotNull(firebaseApp2, "FirebaseApp must not be null");
        Preconditions.checkNotNull(firebaseApp2.getPersistenceKey(), "Firebase app name must not be null");
        this.zzbgp = (zzka) Preconditions.checkNotNull(zzka);
        this.zzbde = zzor.zza(firebaseApp2);
        this.zzbgo = new zzqc(this, firebaseApp2, z);
        this.firebaseApp = firebaseApp2;
        this.imageContext = zzkb;
    }

    public final Task<ResultType> zza(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkNotNull(firebaseVisionImage, "Input image can not be null");
        Pair<byte[], Float> zze = firebaseVisionImage.zze(zzpc(), zzpd());
        if (zze.first == null) {
            return Tasks.forException(new FirebaseMLException("Can not convert the image format", 3));
        }
        return this.zzbde.zza(this.zzbgo, new zzqa((byte[]) zze.first, ((Float) zze.second).floatValue(), Collections.singletonList(this.zzbgp), this.imageContext));
    }
}
