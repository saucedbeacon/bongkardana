package com.google.firebase.ml.vision.automl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.ml.common.modeldownload.BaseModel;
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;

@KeepForSdk
public class FirebaseAutoMLRemoteModel extends FirebaseRemoteModel {

    public static class Builder {
        @Nullable
        private final String zzazz = null;
        @Nullable
        private final BaseModel zzbcv;
        private boolean zzbcw = true;
        private FirebaseModelDownloadConditions zzbcx = new FirebaseModelDownloadConditions.Builder().build();
        private FirebaseModelDownloadConditions zzbcy = new FirebaseModelDownloadConditions.Builder().build();

        @KeepForSdk
        public Builder(@NonNull BaseModel baseModel) {
            this.zzbcv = baseModel;
        }
    }
}
