package com.google.firebase.ml.vision.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzlg;

public final class FirebaseVisionPoint {
    private final Float zzbhp;
    private final Float zzbhq;
    private final Float zzbhr = null;

    @NonNull
    public final Float getX() {
        return this.zzbhp;
    }

    @Nullable
    public final Float getZ() {
        return null;
    }

    @NonNull
    public final Float getY() {
        return this.zzbhq;
    }

    public FirebaseVisionPoint(@NonNull Float f, @NonNull Float f2, @Nullable Float f3) {
        this.zzbhp = f;
        this.zzbhq = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionPoint)) {
            return false;
        }
        FirebaseVisionPoint firebaseVisionPoint = (FirebaseVisionPoint) obj;
        return Objects.equal(this.zzbhp, firebaseVisionPoint.zzbhp) && Objects.equal(this.zzbhq, firebaseVisionPoint.zzbhq) && Objects.equal((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbhp, this.zzbhq, null);
    }

    public final String toString() {
        return zzlg.zzaw("FirebaseVisionPoint").zzh("x", this.zzbhp).zzh("y", this.zzbhq).zzh("z", (Object) null).toString();
    }
}
