package com.google.firebase.ml.vision.document;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirebaseVisionCloudDocumentRecognizerOptions {
    private final boolean zzbgn;
    private final List<String> zzbhw;

    @NonNull
    public List<String> getHintedLanguages() {
        return this.zzbhw;
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzbgn;
    }

    public static class Builder {
        private boolean zzbgn = false;
        private List<String> zzbhw = new ArrayList();

        @NonNull
        public Builder setLanguageHints(@NonNull List<String> list) {
            Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
            this.zzbhw = list;
            Collections.sort(list);
            return this;
        }

        @NonNull
        public Builder enforceCertFingerprintMatch() {
            this.zzbgn = true;
            return this;
        }

        @NonNull
        public FirebaseVisionCloudDocumentRecognizerOptions build() {
            return new FirebaseVisionCloudDocumentRecognizerOptions(this.zzbhw, this.zzbgn);
        }
    }

    private FirebaseVisionCloudDocumentRecognizerOptions(@NonNull List<String> list, boolean z) {
        Preconditions.checkNotNull(list, "Provided hinted languages can not be null");
        this.zzbhw = list;
        this.zzbgn = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDocumentRecognizerOptions)) {
            return false;
        }
        FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions = (FirebaseVisionCloudDocumentRecognizerOptions) obj;
        return this.zzbhw.equals(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages()) && this.zzbgn == firebaseVisionCloudDocumentRecognizerOptions.zzbgn;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzbhw, Boolean.valueOf(this.zzbgn));
    }
}
