package com.google.firebase.ml.vision.label;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionCloudImageLabelerOptions {
    private final float zzbfl;
    private final boolean zzbgn;

    private FirebaseVisionCloudImageLabelerOptions(float f, boolean z) {
        this.zzbfl = f;
        this.zzbgn = z;
    }

    public static class Builder {
        private float zzbfl = 0.5f;
        private boolean zzbgn = false;

        @NonNull
        public Builder setConfidenceThreshold(float f) {
            Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.zzbfl = f;
            return this;
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.zzbgn = true;
            return this;
        }

        @NonNull
        public FirebaseVisionCloudImageLabelerOptions build() {
            return new FirebaseVisionCloudImageLabelerOptions(this.zzbfl, this.zzbgn);
        }
    }

    public float getConfidenceThreshold() {
        return this.zzbfl;
    }

    public boolean isEnforceCertFingerprintMatch() {
        return this.zzbgn;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions = (FirebaseVisionCloudImageLabelerOptions) obj;
        return Float.compare(this.zzbfl, firebaseVisionCloudImageLabelerOptions.zzbfl) == 0 && this.zzbgn == firebaseVisionCloudImageLabelerOptions.zzbgn;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzbfl), Boolean.valueOf(this.zzbgn));
    }
}
