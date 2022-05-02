package com.google.firebase.ml.vision.label;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzjx;
import com.google.android.gms.internal.firebase_ml.zzlx;
import com.google.android.gms.internal.firebase_ml.zzpy;
import com.google.android.gms.vision.label.ImageLabel;
import com.google.firebase.ml.vision.automl.internal.zzh;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionImageLabel {
    private final String text;
    private final String zzbfj;
    private final float zzbfk;

    public FirebaseVisionImageLabel(@NonNull ImageLabel imageLabel) {
        this(imageLabel.getLabel(), imageLabel.getConfidence(), imageLabel.getMid());
    }

    @Nullable
    public static FirebaseVisionImageLabel zza(@Nullable zzjx zzjx) {
        if (zzjx == null) {
            return null;
        }
        return new FirebaseVisionImageLabel(zzjx.getDescription(), zzpy.zza(zzjx.zzie()), zzjx.getMid());
    }

    public static FirebaseVisionImageLabel zza(@NonNull zzh zzh) {
        Preconditions.checkNotNull(zzh, "Returned image label parcel can not be null");
        return new FirebaseVisionImageLabel(zzh.text, zzh.zzbfk, zzh.zzbfj);
    }

    @VisibleForTesting
    private FirebaseVisionImageLabel(@Nullable String str, float f, @Nullable String str2) {
        this.text = zzlx.zzay(str);
        this.zzbfj = str2;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.zzbfk = f;
    }

    @Nullable
    public String getEntityId() {
        return this.zzbfj;
    }

    @NonNull
    public String getText() {
        return this.text;
    }

    public float getConfidence() {
        return this.zzbfk;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionImageLabel)) {
            return false;
        }
        FirebaseVisionImageLabel firebaseVisionImageLabel = (FirebaseVisionImageLabel) obj;
        return Objects.equal(this.zzbfj, firebaseVisionImageLabel.getEntityId()) && Objects.equal(this.text, firebaseVisionImageLabel.getText()) && Float.compare(this.zzbfk, firebaseVisionImageLabel.getConfidence()) == 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbfj, this.text, Float.valueOf(this.zzbfk));
    }
}
