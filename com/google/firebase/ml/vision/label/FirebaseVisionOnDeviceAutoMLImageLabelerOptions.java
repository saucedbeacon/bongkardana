package com.google.firebase.ml.vision.label;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class FirebaseVisionOnDeviceAutoMLImageLabelerOptions {
    @Nullable
    private final String zzbdj;
    @Nullable
    private final String zzbdk;
    private final float zzbfl;

    public final float getConfidenceThreshold() {
        return this.zzbfl;
    }

    public final String zzon() {
        return this.zzbdj;
    }

    public static class Builder {
        @Nullable
        private String zzbdj;
        @Nullable
        private String zzbdk;
        private float zzbfl = 0.5f;

        @Nonnull
        public Builder setConfidenceThreshold(float f) {
            Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.zzbfl = f;
            return this;
        }

        @Nonnull
        public Builder setLocalModelName(@Nonnull String str) {
            Preconditions.checkNotEmpty(str, "Local model name cannot be null or empty.");
            this.zzbdj = str;
            return this;
        }

        @Nonnull
        public Builder setRemoteModelName(@Nonnull String str) {
            Preconditions.checkNotEmpty(str, "Remote model name cannot be null or empty.");
            this.zzbdk = str;
            return this;
        }

        @Nonnull
        public FirebaseVisionOnDeviceAutoMLImageLabelerOptions build() {
            Preconditions.checkArgument(!TextUtils.isEmpty(this.zzbdj) || !TextUtils.isEmpty(this.zzbdk), "At least one of local model name or remote model name must be set.");
            return new FirebaseVisionOnDeviceAutoMLImageLabelerOptions(this.zzbfl, this.zzbdj, this.zzbdk);
        }
    }

    public final String zzoo() {
        return this.zzbdk;
    }

    private FirebaseVisionOnDeviceAutoMLImageLabelerOptions(float f, @Nullable String str, @Nullable String str2) {
        this.zzbfl = f;
        this.zzbdj = str;
        this.zzbdk = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionOnDeviceAutoMLImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions = (FirebaseVisionOnDeviceAutoMLImageLabelerOptions) obj;
        return Float.compare(this.zzbfl, firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzbfl) == 0 && Objects.equal(this.zzbdj, firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzbdj) && Objects.equal(this.zzbdk, firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzbdk);
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzbfl), this.zzbdj, this.zzbdk);
    }
}
