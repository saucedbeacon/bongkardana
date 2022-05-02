package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;

@WorkerThread
public final class zzaf {
    private static final GmsLogger zzayb = new GmsLogger("RmModelInfoRetriever", "");

    @WorkerThread
    @Nullable
    static zzy zzb(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzu zzu) throws FirebaseMLException {
        zzy zzy;
        if (firebaseRemoteModel.isBaseModel()) {
            zzy = zzd.zza(firebaseRemoteModel, zzu);
        } else {
            zzy = zzs.zza(firebaseApp, firebaseRemoteModel, zzu);
        }
        if (zzy != null) {
            zzu.zza(zzmy.NO_ERROR, false, zzy.zzoc(), zzmn.zzae.zzb.MODEL_INFO_RETRIEVAL_SUCCEEDED);
        }
        return zzy;
    }

    @Nullable
    static HttpsURLConnection zza(@Nullable String str, @NonNull zzu zzu) throws FirebaseMLException {
        String str2;
        zzmy zzmy;
        String str3;
        if (str == null) {
            return null;
        }
        try {
            zzah zzah = new zzah(str);
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(str);
            gmsLogger.d("RmModelInfoRetriever", valueOf.length() != 0 ? "Checking model URL: ".concat(valueOf) : new String("Checking model URL: "));
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) zzah.openConnection();
            httpsURLConnection.setConnectTimeout(2000);
            httpsURLConnection.connect();
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode == 200 || responseCode == 304) {
                return httpsURLConnection;
            }
            if (responseCode == 408) {
                zzmy = zzmy.TIME_OUT_FETCHING_MODEL_METADATA;
            } else {
                zzmy = zzmy.MODEL_INFO_DOWNLOAD_UNSUCCESSFUL_HTTP_STATUS;
            }
            zzu.zza(zzmy, httpsURLConnection.getResponseCode());
            InputStream errorStream = httpsURLConnection.getErrorStream();
            if (errorStream == null) {
                str3 = "";
            } else {
                str3 = new String(IOUtils.readInputStreamFully(errorStream));
            }
            throw new FirebaseMLException(String.format(Locale.getDefault(), "Failed to connect to Firebase ML console server with HTTP status code: %d and error message: %s", new Object[]{Integer.valueOf(httpsURLConnection.getResponseCode()), str3}), 13);
        } catch (SocketTimeoutException e) {
            zzu.zzo(zzmy.TIME_OUT_FETCHING_MODEL_METADATA);
            throw new FirebaseMLException("Failed to get model URL due to time out", 13, e);
        } catch (IOException e2) {
            zzmy zzmy2 = zzmy.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
            if (e2 instanceof UnknownHostException) {
                zzmy2 = zzmy.NO_NETWORK_CONNECTION;
                str2 = "Failed to retrieve model info due to no internet connection.";
            } else {
                str2 = "Failed to get model URL";
            }
            zzu.zzo(zzmy2);
            throw new FirebaseMLException(str2, 13, e2);
        }
    }
}
