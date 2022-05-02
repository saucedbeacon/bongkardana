package com.google.firebase.ml.vision.cloud;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionCloudDetectorOptions {
    public static final FirebaseVisionCloudDetectorOptions DEFAULT = new Builder().build();
    public static final int LATEST_MODEL = 2;
    public static final int STABLE_MODEL = 1;
    private final int zzbgl;
    @ModelType
    private final int zzbgm;
    private final boolean zzbgn;

    @Retention(RetentionPolicy.CLASS)
    public @interface ModelType {
    }

    private FirebaseVisionCloudDetectorOptions(int i, @ModelType int i2, boolean z) {
        this.zzbgl = i;
        this.zzbgm = i2;
        this.zzbgn = z;
    }

    public static class Builder {
        private int zzbgl = 10;
        @ModelType
        private int zzbgm = 1;
        private boolean zzbgn = false;

        @NonNull
        public Builder setMaxResults(int i) {
            this.zzbgl = i;
            return this;
        }

        @NonNull
        public Builder setModelType(@ModelType int i) {
            this.zzbgm = i;
            return this;
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.zzbgn = true;
            return this;
        }

        @NonNull
        public FirebaseVisionCloudDetectorOptions build() {
            return new FirebaseVisionCloudDetectorOptions(this.zzbgl, this.zzbgm, this.zzbgn);
        }
    }

    public int getMaxResults() {
        return this.zzbgl;
    }

    @ModelType
    public int getModelType() {
        return this.zzbgm;
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzbgn;
    }

    @NonNull
    public Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDetectorOptions)) {
            return false;
        }
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = (FirebaseVisionCloudDetectorOptions) obj;
        return this.zzbgl == firebaseVisionCloudDetectorOptions.zzbgl && this.zzbgm == firebaseVisionCloudDetectorOptions.zzbgm && this.zzbgn == firebaseVisionCloudDetectorOptions.zzbgn;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzbgl), Integer.valueOf(this.zzbgm), Boolean.valueOf(this.zzbgn));
    }
}
