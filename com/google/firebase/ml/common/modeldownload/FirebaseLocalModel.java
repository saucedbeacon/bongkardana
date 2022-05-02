package com.google.firebase.ml.common.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.firebase.ml.common.internal.modeldownload.zzp;

public class FirebaseLocalModel {
    private final String zzazz;
    private final String zzbcc;
    private final String zzbcd;

    public final String getModelName() {
        return this.zzazz;
    }

    @KeepForSdk
    @Nullable
    public String getFilePath() {
        return this.zzbcc;
    }

    @KeepForSdk
    @Nullable
    public String getAssetFilePath() {
        return this.zzbcd;
    }

    @KeepForSdk
    protected FirebaseLocalModel(@NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.zzazz = str;
        this.zzbcc = str2;
        this.zzbcd = str3;
    }

    public static class Builder {
        private final String zzazz;
        private String zzbcc = null;
        private String zzbck = null;

        public Builder(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model name can not be empty");
            this.zzazz = str;
        }

        @NonNull
        public Builder setFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            Preconditions.checkArgument(this.zzbck == null, "A local model source is either from local file or for asset, you can not set both.");
            this.zzbcc = str;
            return this;
        }

        @NonNull
        public Builder setAssetFilePath(@NonNull String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            Preconditions.checkArgument(this.zzbcc == null, "A local model source is either from local file or for asset, you can not set both.");
            this.zzbck = str;
            return this;
        }

        @NonNull
        public FirebaseLocalModel build() {
            Preconditions.checkArgument((this.zzbcc != null && this.zzbck == null) || (this.zzbcc == null && this.zzbck != null), "Set either filePath or assetFilePath.");
            return new FirebaseLocalModel(this.zzazz, this.zzbcc, this.zzbck);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseLocalModel)) {
            return false;
        }
        FirebaseLocalModel firebaseLocalModel = (FirebaseLocalModel) obj;
        return Objects.equal(this.zzazz, firebaseLocalModel.zzazz) && Objects.equal(this.zzbcc, firebaseLocalModel.zzbcc) && Objects.equal(this.zzbcd, firebaseLocalModel.zzbcd);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzazz, this.zzbcc, this.zzbcd);
    }

    public final zzmn.zzag zza(zzp zzp) {
        zzmn.zzaf.zzc zzc;
        zzmn.zzag.zzb zzlj = zzmn.zzag.zzlj();
        zzmn.zzaf.zzb zzb = zzmn.zzaf.zzlh().zzb(zzp.zzno());
        String str = this.zzbcc;
        if (str == null) {
            str = this.zzbcd;
        }
        zzmn.zzaf.zzb zzbd = zzb.zzbd(str);
        if (this.zzbcc != null) {
            zzc = zzmn.zzaf.zzc.zzasa;
        } else if (this.zzbcd != null) {
            zzc = zzmn.zzaf.zzc.APP_ASSET;
        } else {
            zzc = zzmn.zzaf.zzc.SOURCE_UNKNOWN;
        }
        return (zzmn.zzag) ((zzux) zzlj.zzb(zzbd.zzb(zzc)).zzte());
    }
}
