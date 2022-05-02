package com.google.firebase.ml.common.internal.modeldownload;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.common.net.HttpHeaders;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@WorkerThread
final class zzs {
    private static final GmsLogger zzayb = new GmsLogger("ModelInfoRetriever", "");

    @Nullable
    static zzy zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzu zzu) throws FirebaseMLException {
        JSONObject jSONObject;
        HttpsURLConnection zza = zzaf.zza(zza(firebaseApp, firebaseRemoteModel.getModelNameForBackend(), zzu), zzu);
        if (zza == null) {
            return null;
        }
        String headerField = zza.getHeaderField(HttpHeaders.CONTENT_LOCATION);
        String headerField2 = zza.getHeaderField("ETag");
        GmsLogger gmsLogger = zzayb;
        String valueOf = String.valueOf(headerField);
        gmsLogger.d("ModelInfoRetriever", valueOf.length() != 0 ? "Received download URL: ".concat(valueOf) : new String("Received download URL: "));
        if (headerField == null) {
            return null;
        }
        if (headerField2 != null) {
            firebaseRemoteModel.setModelHash(headerField2);
            try {
                String str = new String(IOUtils.readInputStreamFully(zza.getInputStream()));
                if (TextUtils.isEmpty(str)) {
                    str = "{}";
                }
                JSONObject jSONObject2 = new JSONObject(str);
                zzp zzp = jSONObject2.has("inferenceInfo") ? zzp.AUTOML : zzp.CUSTOM;
                if (zzp.equals(zzp.AUTOML) && (jSONObject = jSONObject2.getJSONObject("inferenceInfo")) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("labels");
                    if (jSONArray == null || jSONArray.length() == 0) {
                        throw new FirebaseMLException("Cannot parse AutoML model's labels from model downloading backend.", 13);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    zza.zza(firebaseApp, firebaseRemoteModel.getUniqueModelNameForPersist(), arrayList);
                }
                return new zzy(firebaseRemoteModel.getUniqueModelNameForPersist(), Uri.parse(headerField), headerField2, zzp);
            } catch (IOException | JSONException e) {
                throw new FirebaseMLException("Failed to parse the model backend response message", 13, e);
            }
        } else {
            zzu.zza(zzmy.MODEL_INFO_DOWNLOAD_NO_HASH, false, zzp.UNKNOWN, zzmn.zzae.zzb.MODEL_INFO_RETRIEVAL_FAILED);
            throw new FirebaseMLException("No hash value for the custom model", 13);
        }
    }

    @VisibleForTesting
    @Nullable
    private static String zza(FirebaseApp firebaseApp, String str, @NonNull zzu zzu) throws FirebaseMLException {
        String str2;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            FirebaseInstanceId instance = FirebaseInstanceId.getInstance(firebaseApp);
            if (instance == null) {
                zzayb.w("ModelInfoRetriever", "Cannot get a valid instance of FirebaseInstanceId. Cannot retrieve model info.");
                return null;
            }
            String id2 = instance.getId();
            if (id2 == null) {
                zzayb.w("ModelInfoRetriever", "Firebase instance id is null. Cannot retrieve model info.");
                return null;
            }
            try {
                String token = instance.getToken(gcmSenderId, "*");
                if (token == null) {
                    zzayb.w("ModelInfoRetriever", "Firebase instance token is null. Cannot retrieve model info.");
                    return null;
                }
                return String.format("https://mlkit.googleapis.com/v1beta1/projects/%s/models/%s/versions/active?key=%s&app_instance_id=%s&app_instance_token=%s", new Object[]{firebaseApp.getOptions().getProjectId(), str, firebaseApp.getOptions().getApiKey(), id2, token});
            } catch (IOException e) {
                zzmy zzmy = zzmy.MODEL_INFO_DOWNLOAD_CONNECTION_FAILED;
                if (e instanceof UnknownHostException) {
                    zzmy = zzmy.NO_NETWORK_CONNECTION;
                    str2 = "Failed to retrieve model info due to no internet connection.";
                } else {
                    str2 = "Failed to get model URL";
                }
                zzu.zza(zzmy, false, zzp.UNKNOWN, zzmn.zzae.zzb.MODEL_INFO_RETRIEVAL_FAILED);
                throw new FirebaseMLException(str2, 13, e);
            }
        } else {
            throw new FirebaseMLException("GCM sender id cannot be null in FirebaseOptions. Please configure FirebaseApp properly.", 9);
        }
    }
}
