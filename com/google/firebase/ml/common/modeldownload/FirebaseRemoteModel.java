package com.google.firebase.ml.common.modeldownload;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions;
import java.util.EnumMap;
import java.util.Map;

public class FirebaseRemoteModel {
    private static final Map<BaseModel, String> zzbcz = new EnumMap(BaseModel.class);
    @VisibleForTesting
    private static final Map<BaseModel, String> zzbda;
    @Nullable
    private final String zzazz;
    private String zzbbq;
    @Nullable
    private final BaseModel zzbcv;
    private final boolean zzbcw;
    private final FirebaseModelDownloadConditions zzbcx;
    private final FirebaseModelDownloadConditions zzbcy;

    @KeepForSdk
    protected FirebaseRemoteModel(@Nullable String str, @Nullable BaseModel baseModel, boolean z, @NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions, @NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions2) {
        this.zzazz = str;
        this.zzbcv = baseModel;
        this.zzbcw = z;
        this.zzbcx = firebaseModelDownloadConditions;
        this.zzbcy = firebaseModelDownloadConditions2;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    public Object getPluginIdentifier() {
        return null;
    }

    public static class Builder {
        @Nullable
        private final String zzazz;
        @Nullable
        private final BaseModel zzbcv;
        private boolean zzbcw;
        private FirebaseModelDownloadConditions zzbcx;
        private FirebaseModelDownloadConditions zzbcy;

        public Builder(@NonNull String str) {
            this.zzbcw = true;
            this.zzbcx = new FirebaseModelDownloadConditions.Builder().build();
            this.zzbcy = new FirebaseModelDownloadConditions.Builder().build();
            this.zzazz = str;
            this.zzbcv = null;
        }

        @KeepForSdk
        public Builder(@NonNull BaseModel baseModel) {
            this.zzbcw = true;
            this.zzbcx = new FirebaseModelDownloadConditions.Builder().build();
            this.zzbcy = new FirebaseModelDownloadConditions.Builder().build();
            this.zzazz = null;
            this.zzbcv = baseModel;
        }

        @NonNull
        public Builder enableModelUpdates(boolean z) {
            this.zzbcw = z;
            return this;
        }

        @NonNull
        public Builder setInitialDownloadConditions(@NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
            this.zzbcx = firebaseModelDownloadConditions;
            return this;
        }

        @NonNull
        public Builder setUpdatesDownloadConditions(@NonNull FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
            this.zzbcy = firebaseModelDownloadConditions;
            return this;
        }

        @NonNull
        public FirebaseRemoteModel build() {
            boolean z = true;
            if (TextUtils.isEmpty(this.zzazz) != (this.zzbcv != null)) {
                z = false;
            }
            Preconditions.checkArgument(z, "One of cloud model name and base model cannot be empty");
            Preconditions.checkNotNull(this.zzbcx, "Initial download condition cannot be null");
            Preconditions.checkNotNull(this.zzbcy, "Update download condition cannot be null");
            return new FirebaseRemoteModel(this.zzazz, this.zzbcv, this.zzbcw, this.zzbcx, this.zzbcy);
        }
    }

    @KeepForSdk
    protected FirebaseRemoteModel(FirebaseRemoteModel firebaseRemoteModel) {
        this(firebaseRemoteModel.getModelName(), firebaseRemoteModel.zzbcv, firebaseRemoteModel.isModelUpdatesEnabled(), firebaseRemoteModel.getInitialDownloadConditions(), firebaseRemoteModel.getUpdatesDownloadConditions());
        this.zzbbq = firebaseRemoteModel.zzbbq;
    }

    @KeepForSdk
    public String getModelNameForBackend() {
        String str = this.zzazz;
        if (str != null) {
            return str;
        }
        return zzbda.get(this.zzbcv);
    }

    @KeepForSdk
    public String getUniqueModelNameForPersist() {
        String str = this.zzazz;
        if (str != null) {
            return str;
        }
        String valueOf = String.valueOf(zzbda.get(this.zzbcv));
        return valueOf.length() != 0 ? "COM.GOOGLE.BASE_".concat(valueOf) : new String("COM.GOOGLE.BASE_");
    }

    @KeepForSdk
    public boolean isBaseModel() {
        return this.zzbcv != null;
    }

    @KeepForSdk
    @Nullable
    public String getModelName() {
        return this.zzazz;
    }

    @KeepForSdk
    public boolean isModelUpdatesEnabled() {
        return this.zzbcw;
    }

    @KeepForSdk
    public FirebaseModelDownloadConditions getInitialDownloadConditions() {
        return this.zzbcx;
    }

    @KeepForSdk
    public FirebaseModelDownloadConditions getUpdatesDownloadConditions() {
        return this.zzbcy;
    }

    @KeepForSdk
    public boolean baseModelHashMatches(@NonNull String str) {
        BaseModel baseModel = this.zzbcv;
        if (baseModel == null) {
            return false;
        }
        return str.equals(zzbcz.get(baseModel));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseRemoteModel)) {
            return false;
        }
        FirebaseRemoteModel firebaseRemoteModel = (FirebaseRemoteModel) obj;
        return Objects.equal(this.zzazz, firebaseRemoteModel.zzazz) && Objects.equal(this.zzbcv, firebaseRemoteModel.zzbcv) && this.zzbcw == firebaseRemoteModel.zzbcw && this.zzbcx.equals(firebaseRemoteModel.zzbcx) && this.zzbcy.equals(firebaseRemoteModel.zzbcy);
    }

    public int hashCode() {
        return Objects.hashCode(this.zzazz, this.zzbcv, Boolean.valueOf(this.zzbcw), Integer.valueOf(Objects.hashCode(this.zzbcx)), Integer.valueOf(Objects.hashCode(this.zzbcy)));
    }

    @KeepForSdk
    public void setModelHash(@NonNull String str) {
        this.zzbbq = str;
    }

    @KeepForSdk
    public String getModelHash() {
        return this.zzbbq;
    }

    static {
        EnumMap enumMap = new EnumMap(BaseModel.class);
        zzbda = enumMap;
        enumMap.put(BaseModel.FACE_DETECTION, "face_detector_model_m41");
        zzbda.put(BaseModel.SMART_REPLY, "smart_reply_model_m41");
        zzbda.put(BaseModel.TRANSLATE, "translate_model_m41");
        zzbcz.put(BaseModel.FACE_DETECTION, "modelHash");
        zzbcz.put(BaseModel.SMART_REPLY, "smart_reply_model_hash");
        zzbcz.put(BaseModel.TRANSLATE, "modelHash");
    }
}
