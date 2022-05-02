package com.google.firebase.ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzux;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionOnDeviceImageLabelerOptions {
    private final float zzbfl;

    public float getConfidenceThreshold() {
        return this.zzbfl;
    }

    private FirebaseVisionOnDeviceImageLabelerOptions(float f) {
        this.zzbfl = f;
    }

    public static class Builder {
        private float zzbfl = 0.5f;

        @NonNull
        public Builder setConfidenceThreshold(float f) {
            Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.zzbfl = f;
            return this;
        }

        @NonNull
        public FirebaseVisionOnDeviceImageLabelerOptions build() {
            return new FirebaseVisionOnDeviceImageLabelerOptions(this.zzbfl);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FirebaseVisionOnDeviceImageLabelerOptions) && this.zzbfl == ((FirebaseVisionOnDeviceImageLabelerOptions) obj).zzbfl;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzbfl));
    }

    public final zzmn.zzal zzpl() {
        return (zzmn.zzal) ((zzux) zzmn.zzal.zzlw().zzo(this.zzbfl).zzte());
    }
}
