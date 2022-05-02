package com.google.firebase.ml.common.internal.modeldownload;

import android.os.ParcelFileDescriptor;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.internal.firebase_ml.zzph;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public final class zzae {
    private static final GmsLogger zzayb = new GmsLogger("RemoteModelLoader", "");
    @GuardedBy("RemoteModelLoader.class")
    private static final Map<String, zzae> zzbbi = new HashMap();
    private final FirebaseApp firebaseApp;
    private final FirebaseRemoteModel zzbbh;
    private final zzu zzbbm;
    private final zzp zzbbr;
    private final zzx zzbbx;
    private final zzab zzbby;
    private final zzag zzbbz;
    private boolean zzbca = true;

    private zzae(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzr zzr, @NonNull zzag zzag, @NonNull zzp zzp) {
        this.zzbby = new zzab(firebaseApp2, firebaseRemoteModel, zzr, zzp);
        this.zzbbm = new zzu(firebaseApp2, firebaseRemoteModel);
        this.zzbbx = zzx.zza(firebaseApp2, firebaseRemoteModel, new zzg(firebaseApp2), this.zzbbm);
        this.zzbbz = zzag;
        this.firebaseApp = firebaseApp2;
        this.zzbbh = firebaseRemoteModel;
        this.zzbbr = zzp;
    }

    public static synchronized zzae zza(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzr zzr, zzag zzag, zzp zzp) {
        zzae zzae;
        synchronized (zzae.class) {
            String uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
            if (!zzbbi.containsKey(uniqueModelNameForPersist)) {
                zzbbi.put(uniqueModelNameForPersist, new zzae(firebaseApp2, firebaseRemoteModel, zzr, zzag, zzp));
            }
            zzae = zzbbi.get(uniqueModelNameForPersist);
        }
        return zzae;
    }

    @WorkerThread
    @Nullable
    public final synchronized MappedByteBuffer load() throws FirebaseMLException {
        MappedByteBuffer zzax;
        zzayb.d("RemoteModelLoader", "Try to load newly downloaded model file.");
        zzax = zzax(this.zzbca);
        if (zzax == null) {
            zzayb.d("RemoteModelLoader", "Loading existing model file.");
            zzax = zzof();
        }
        if (this.zzbca || !this.zzbbx.zzny()) {
            this.zzbca = false;
            zzayb.d("RemoteModelLoader", "Initial loading, check for model updates.");
            this.zzbbm.zza(zzmy.NO_ERROR, false, this.zzbbr, zzmn.zzae.zzb.IMPLICITLY_REQUESTED);
            this.zzbbx.zznq();
        }
        return zzax;
    }

    public final FirebaseRemoteModel zzoe() {
        return this.zzbbh;
    }

    @WorkerThread
    @Nullable
    private final MappedByteBuffer zzax(boolean z) throws FirebaseMLException {
        Long zznr = this.zzbbx.zznr();
        String zzns = this.zzbbx.zzns();
        if (zznr == null || zzns == null) {
            zzayb.d("RemoteModelLoader", "No new model is downloading.");
            this.zzbbx.zznt();
            return null;
        }
        Integer zznu = this.zzbbx.zznu();
        if (zznu == null) {
            this.zzbbx.zznt();
            return null;
        }
        GmsLogger gmsLogger = zzayb;
        String valueOf = String.valueOf(zznu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Download Status code: ");
        sb.append(valueOf);
        gmsLogger.d("RemoteModelLoader", sb.toString());
        if (zznu.intValue() == 8) {
            zzayb.d("RemoteModelLoader", "Model downloaded successfully");
            this.zzbbm.zza(zzmy.NO_ERROR, true, this.zzbbr, zzmn.zzae.zzb.SUCCEEDED);
            ParcelFileDescriptor zznv = this.zzbbx.zznv();
            if (zznv == null) {
                this.zzbbx.zznt();
                return null;
            }
            zzayb.d("RemoteModelLoader", "moving downloaded model from external storage to private folder.");
            try {
                File zza = this.zzbby.zza(zznv, zzns, this.zzbbm);
                if (zza == null) {
                    return null;
                }
                MappedByteBuffer zzg = zzg(zza);
                GmsLogger gmsLogger2 = zzayb;
                String valueOf2 = String.valueOf(zza.getParent());
                gmsLogger2.d("RemoteModelLoader", valueOf2.length() != 0 ? "Moved the downloaded model to private folder successfully: ".concat(valueOf2) : new String("Moved the downloaded model to private folder successfully: "));
                this.zzbbx.zze(zzns, this.zzbbr);
                if (!z || !this.zzbby.zzd(zza)) {
                    return zzg;
                }
                zzayb.d("RemoteModelLoader", "All old models are deleted.");
                return zzg(this.zzbby.zzf(zza));
            } finally {
                this.zzbbx.zznt();
            }
        } else {
            if (zznu.intValue() == 16) {
                this.zzbbm.zza(false, this.zzbbr, this.zzbbx.zza(zznr));
                this.zzbbx.zznt();
            }
            return null;
        }
    }

    private final MappedByteBuffer zzg(File file) throws FirebaseMLException {
        try {
            return zzbw(file.getAbsolutePath());
        } catch (Exception e) {
            this.zzbby.zze(file);
            throw new FirebaseMLException("Failed to load newly downloaded model.", 14, e);
        }
    }

    @WorkerThread
    @Nullable
    private final MappedByteBuffer zzof() throws FirebaseMLException {
        String zzod = this.zzbby.zzod();
        if (zzod == null) {
            zzayb.d("RemoteModelLoader", "No existing model file");
            return null;
        }
        try {
            return zzbw(zzod);
        } catch (Exception e) {
            this.zzbby.zze(new File(zzod));
            zzph.zzc(this.firebaseApp).zzi(this.zzbbh);
            throw new FirebaseMLException("Failed to load an already downloaded model.", 14, e);
        }
    }

    @WorkerThread
    @NonNull
    private final MappedByteBuffer zzbw(@NonNull String str) throws FirebaseMLException {
        return this.zzbbz.zzbx(str);
    }
}
