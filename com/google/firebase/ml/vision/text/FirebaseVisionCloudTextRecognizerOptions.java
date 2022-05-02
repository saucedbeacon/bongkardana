package com.google.firebase.ml.vision.text;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirebaseVisionCloudTextRecognizerOptions {
    public static final int DENSE_MODEL = 2;
    public static final int SPARSE_MODEL = 1;
    private final boolean zzbgn;
    private final List<String> zzbhw;
    private final int zzbkf;

    @Retention(RetentionPolicy.CLASS)
    public @interface CloudTextModelType {
    }

    @NonNull
    public List<String> getHintedLanguages() {
        return this.zzbhw;
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzbgn;
    }

    @CloudTextModelType
    public int getModelType() {
        return this.zzbkf;
    }

    public static class Builder {
        private boolean zzbgn = false;
        private List<String> zzbhw = new ArrayList();
        private int zzbkf = 1;

        @NonNull
        public Builder setLanguageHints(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
            this.zzbhw = list;
            Collections.sort(list);
            return this;
        }

        @NonNull
        public Builder setModelType(@CloudTextModelType int i) {
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                z = false;
            }
            Preconditions.checkArgument(z, "modelType should be either SPARSE_MODEL or DENSE_MODEL");
            this.zzbkf = i;
            return this;
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.zzbgn = true;
            return this;
        }

        @NonNull
        public FirebaseVisionCloudTextRecognizerOptions build() {
            return new FirebaseVisionCloudTextRecognizerOptions(this.zzbhw, this.zzbkf, this.zzbgn);
        }
    }

    private FirebaseVisionCloudTextRecognizerOptions(@NonNull List<String> list, @CloudTextModelType int i, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzbhw = list;
        this.zzbkf = i;
        this.zzbgn = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudTextRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions = (FirebaseVisionCloudTextRecognizerOptions) obj;
        return this.zzbhw.equals(firebaseVisionCloudTextRecognizerOptions.getHintedLanguages()) && this.zzbkf == firebaseVisionCloudTextRecognizerOptions.zzbkf && this.zzbgn == firebaseVisionCloudTextRecognizerOptions.zzbgn;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbhw, Integer.valueOf(this.zzbkf), Boolean.valueOf(this.zzbgn));
    }
}
