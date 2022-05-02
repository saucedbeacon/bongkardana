package com.google.firebase.ml.vision.objects;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FirebaseVisionObjectDetectorOptions {
    public static final int SINGLE_IMAGE_MODE = 2;
    public static final int STREAM_MODE = 1;
    private final int zzbjr;
    private final boolean zzbjs;
    private final boolean zzbjt;

    @Retention(RetentionPolicy.CLASS)
    public @interface DetectorMode {
    }

    private FirebaseVisionObjectDetectorOptions(@DetectorMode int i, boolean z, boolean z2) {
        this.zzbjr = i;
        this.zzbjs = z;
        this.zzbjt = z2;
    }

    public static class Builder {
        @DetectorMode
        private int zzbjr = 1;
        private boolean zzbjs = false;
        private boolean zzbjt = false;

        @NonNull
        public Builder setDetectorMode(@DetectorMode int i) {
            this.zzbjr = i;
            return this;
        }

        @NonNull
        public Builder enableMultipleObjects() {
            this.zzbjs = true;
            return this;
        }

        @NonNull
        public Builder enableClassification() {
            this.zzbjt = true;
            return this;
        }

        @NonNull
        public FirebaseVisionObjectDetectorOptions build() {
            return new FirebaseVisionObjectDetectorOptions(this.zzbjr, this.zzbjs, this.zzbjt);
        }
    }

    @DetectorMode
    public final int zzpm() {
        return this.zzbjr;
    }

    public final boolean zzpn() {
        return this.zzbjt;
    }

    public final boolean zzpo() {
        return this.zzbjs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionObjectDetectorOptions)) {
            return false;
        }
        FirebaseVisionObjectDetectorOptions firebaseVisionObjectDetectorOptions = (FirebaseVisionObjectDetectorOptions) obj;
        return firebaseVisionObjectDetectorOptions.zzbjr == this.zzbjr && firebaseVisionObjectDetectorOptions.zzbjt == this.zzbjt && firebaseVisionObjectDetectorOptions.zzbjs == this.zzbjs;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzbjr), Boolean.valueOf(this.zzbjt), Boolean.valueOf(this.zzbjs));
    }
}
