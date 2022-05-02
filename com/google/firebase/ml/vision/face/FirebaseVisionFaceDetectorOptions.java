package com.google.firebase.ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzlg;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzux;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class FirebaseVisionFaceDetectorOptions {
    public static final int ACCURATE = 2;
    public static final int ALL_CLASSIFICATIONS = 2;
    public static final int ALL_CONTOURS = 2;
    public static final int ALL_LANDMARKS = 2;
    public static final int FAST = 1;
    public static final int NO_CLASSIFICATIONS = 1;
    public static final int NO_CONTOURS = 1;
    public static final int NO_LANDMARKS = 1;
    private final boolean trackingEnabled;
    @LandmarkMode
    private final int zzbil;
    @ContourMode
    private final int zzbim;
    @ClassificationMode
    private final int zzbin;
    @PerformanceMode
    private final int zzbio;
    private final float zzbip;

    @Retention(RetentionPolicy.CLASS)
    public @interface ClassificationMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ContourMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface LandmarkMode {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface PerformanceMode {
    }

    @LandmarkMode
    public int getLandmarkMode() {
        return this.zzbil;
    }

    @ContourMode
    public int getContourMode() {
        return this.zzbim;
    }

    @ClassificationMode
    public int getClassificationMode() {
        return this.zzbin;
    }

    @PerformanceMode
    public int getPerformanceMode() {
        return this.zzbio;
    }

    public boolean isTrackingEnabled() {
        return this.trackingEnabled;
    }

    public float getMinFaceSize() {
        return this.zzbip;
    }

    private FirebaseVisionFaceDetectorOptions(@LandmarkMode int i, @ContourMode int i2, @ClassificationMode int i3, @PerformanceMode int i4, boolean z, float f) {
        this.zzbil = i;
        this.zzbim = i2;
        this.zzbin = i3;
        this.zzbio = i4;
        this.trackingEnabled = z;
        this.zzbip = f;
    }

    public static class Builder {
        private boolean trackingEnabled = false;
        @LandmarkMode
        private int zzbil = 1;
        @ContourMode
        private int zzbim = 1;
        @ClassificationMode
        private int zzbin = 1;
        @PerformanceMode
        private int zzbio = 1;
        private float zzbip = 0.1f;

        @NonNull
        public Builder setLandmarkMode(@LandmarkMode int i) {
            this.zzbil = i;
            return this;
        }

        @NonNull
        public Builder setContourMode(@ContourMode int i) {
            this.zzbim = i;
            return this;
        }

        @NonNull
        public Builder setClassificationMode(@ClassificationMode int i) {
            this.zzbin = i;
            return this;
        }

        @NonNull
        public Builder enableTracking() {
            this.trackingEnabled = true;
            return this;
        }

        @NonNull
        public Builder setPerformanceMode(@PerformanceMode int i) {
            this.zzbio = i;
            return this;
        }

        @NonNull
        public Builder setMinFaceSize(float f) {
            this.zzbip = f;
            return this;
        }

        @NonNull
        public FirebaseVisionFaceDetectorOptions build() {
            return new FirebaseVisionFaceDetectorOptions(this.zzbil, this.zzbim, this.zzbin, this.zzbio, this.trackingEnabled, this.zzbip);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionFaceDetectorOptions)) {
            return false;
        }
        FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions = (FirebaseVisionFaceDetectorOptions) obj;
        return Float.floatToIntBits(this.zzbip) == Float.floatToIntBits(firebaseVisionFaceDetectorOptions.zzbip) && this.zzbil == firebaseVisionFaceDetectorOptions.zzbil && this.zzbim == firebaseVisionFaceDetectorOptions.zzbim && this.zzbio == firebaseVisionFaceDetectorOptions.zzbio && this.trackingEnabled == firebaseVisionFaceDetectorOptions.trackingEnabled && this.zzbin == firebaseVisionFaceDetectorOptions.zzbin;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.zzbip)), Integer.valueOf(this.zzbil), Integer.valueOf(this.zzbim), Integer.valueOf(this.zzbio), Boolean.valueOf(this.trackingEnabled), Integer.valueOf(this.zzbin));
    }

    public String toString() {
        return zzlg.zzaw("FaceDetectorOptions").zzb("landmarkMode", this.zzbil).zzb("contourMode", this.zzbim).zzb("classificationMode", this.zzbin).zzb("performanceMode", this.zzbio).zza("trackingEnabled", this.trackingEnabled).zza("minFaceSize", this.zzbip).toString();
    }

    public final zzmn.zzz zzpk() {
        zzmn.zzz.zzd zzd;
        zzmn.zzz.zza zza;
        zzmn.zzz.zze zze;
        zzmn.zzz.zzc zzc;
        zzmn.zzz.zzb zzkv = zzmn.zzz.zzkv();
        int i = this.zzbil;
        if (i == 1) {
            zzd = zzmn.zzz.zzd.NO_LANDMARKS;
        } else if (i != 2) {
            zzd = zzmn.zzz.zzd.UNKNOWN_LANDMARKS;
        } else {
            zzd = zzmn.zzz.zzd.ALL_LANDMARKS;
        }
        zzmn.zzz.zzb zzb = zzkv.zzb(zzd);
        int i2 = this.zzbin;
        if (i2 == 1) {
            zza = zzmn.zzz.zza.NO_CLASSIFICATIONS;
        } else if (i2 != 2) {
            zza = zzmn.zzz.zza.UNKNOWN_CLASSIFICATIONS;
        } else {
            zza = zzmn.zzz.zza.ALL_CLASSIFICATIONS;
        }
        zzmn.zzz.zzb zzb2 = zzb.zzb(zza);
        int i3 = this.zzbio;
        if (i3 == 1) {
            zze = zzmn.zzz.zze.FAST;
        } else if (i3 != 2) {
            zze = zzmn.zzz.zze.UNKNOWN_PERFORMANCE;
        } else {
            zze = zzmn.zzz.zze.ACCURATE;
        }
        zzmn.zzz.zzb zzb3 = zzb2.zzb(zze);
        int i4 = this.zzbim;
        if (i4 == 1) {
            zzc = zzmn.zzz.zzc.NO_CONTOURS;
        } else if (i4 != 2) {
            zzc = zzmn.zzz.zzc.UNKNOWN_CONTOURS;
        } else {
            zzc = zzmn.zzz.zzc.ALL_CONTOURS;
        }
        return (zzmn.zzz) ((zzux) zzb3.zzb(zzc).zzz(isTrackingEnabled()).zzl(this.zzbip).zzte());
    }
}
