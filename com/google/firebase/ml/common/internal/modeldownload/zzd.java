package com.google.firebase.ml.common.internal.modeldownload;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.common.net.HttpHeaders;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import javax.net.ssl.HttpsURLConnection;

@WorkerThread
final class zzd {
    private static final GmsLogger zzayb = new GmsLogger("BaseModelInfoRetriever", "");

    @Nullable
    static zzy zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzu zzu) throws FirebaseMLException {
        HttpsURLConnection zza = zzaf.zza(String.format("https://mlkit.googleapis.com/_i/v1/1p/m?n=%s", new Object[]{firebaseRemoteModel.getModelNameForBackend()}), zzu);
        if (zza == null) {
            return null;
        }
        String headerField = zza.getHeaderField(HttpHeaders.CONTENT_LOCATION);
        String headerField2 = zza.getHeaderField("ETag");
        GmsLogger gmsLogger = zzayb;
        String valueOf = String.valueOf(headerField);
        gmsLogger.d("BaseModelInfoRetriever", valueOf.length() != 0 ? "Received download URL: ".concat(valueOf) : new String("Received download URL: "));
        if (headerField == null) {
            return null;
        }
        if (headerField2 == null) {
            zzu.zza(zzmy.MODEL_INFO_DOWNLOAD_NO_HASH, false, zzp.BASE, zzmn.zzae.zzb.MODEL_INFO_RETRIEVAL_FAILED);
            throw new FirebaseMLException("No hash value for the base model", 13);
        } else if (firebaseRemoteModel.baseModelHashMatches(headerField2)) {
            firebaseRemoteModel.setModelHash(headerField2);
            return new zzy(firebaseRemoteModel.getUniqueModelNameForPersist(), Uri.parse(headerField), headerField2, zzp.BASE);
        } else {
            throw new FirebaseMLException("Downloaded model hash doesn't match the expected. ", 13);
        }
    }
}
