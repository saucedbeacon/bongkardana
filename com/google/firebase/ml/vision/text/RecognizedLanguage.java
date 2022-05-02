package com.google.firebase.ml.vision.text;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzjv;

public class RecognizedLanguage {
    private final String languageCode;

    @Nullable
    public String getLanguageCode() {
        return this.languageCode;
    }

    private RecognizedLanguage(@Nullable String str) {
        this.languageCode = str;
    }

    @Nullable
    public static RecognizedLanguage zza(@Nullable zzjv zzjv) {
        if (zzjv == null || zzjv.getLanguageCode() == null || zzjv.getLanguageCode().isEmpty()) {
            return null;
        }
        return new RecognizedLanguage(zzjv.getLanguageCode());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecognizedLanguage)) {
            return false;
        }
        RecognizedLanguage recognizedLanguage = (RecognizedLanguage) obj;
        String str = this.languageCode;
        if (str == null) {
            return recognizedLanguage.languageCode == null;
        }
        return str.equals(recognizedLanguage.languageCode);
    }

    public int hashCode() {
        return Objects.hashCode(this.languageCode);
    }
}
