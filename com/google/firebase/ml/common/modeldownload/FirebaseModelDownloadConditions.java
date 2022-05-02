package com.google.firebase.ml.common.modeldownload;

import android.annotation.TargetApi;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;

public class FirebaseModelDownloadConditions {
    private final boolean zzbch;
    private final boolean zzbci;
    private final boolean zzbcj;

    private FirebaseModelDownloadConditions(boolean z, boolean z2, boolean z3) {
        this.zzbch = z;
        this.zzbci = z2;
        this.zzbcj = z3;
    }

    public static class Builder {
        private boolean zzbch = false;
        private boolean zzbci = false;
        private boolean zzbcj = false;

        @RequiresApi(24)
        @TargetApi(24)
        @NonNull
        public Builder requireCharging() {
            this.zzbch = true;
            return this;
        }

        @NonNull
        public Builder requireWifi() {
            this.zzbci = true;
            return this;
        }

        @RequiresApi(24)
        @TargetApi(24)
        @NonNull
        public Builder requireDeviceIdle() {
            this.zzbcj = true;
            return this;
        }

        @NonNull
        public FirebaseModelDownloadConditions build() {
            return new FirebaseModelDownloadConditions(this.zzbch, this.zzbci, this.zzbcj);
        }
    }

    public boolean isChargingRequired() {
        return this.zzbch;
    }

    public boolean isWifiRequired() {
        return this.zzbci;
    }

    public boolean isDeviceIdleRequired() {
        return this.zzbcj;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseModelDownloadConditions)) {
            return false;
        }
        FirebaseModelDownloadConditions firebaseModelDownloadConditions = (FirebaseModelDownloadConditions) obj;
        return this.zzbch == firebaseModelDownloadConditions.zzbch && this.zzbcj == firebaseModelDownloadConditions.zzbcj && this.zzbci == firebaseModelDownloadConditions.zzbci;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zzbch), Boolean.valueOf(this.zzbci), Boolean.valueOf(this.zzbcj));
    }
}
