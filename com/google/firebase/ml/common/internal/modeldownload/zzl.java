package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.firebase.ml.common.FirebaseMLException;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.List;

@WorkerThread
public class zzl {
    private static final GmsLogger zzayb = new GmsLogger("ModelLoader", "");
    @VisibleForTesting
    @Nullable
    private final zzae zzbal;
    @VisibleForTesting
    @Nullable
    public final zzf zzbam;
    @NonNull
    private final zzn zzban;
    protected int zzbao = zzm.zzbap;

    public zzl(@Nullable zzae zzae, @Nullable zzf zzf, @NonNull zzn zzn) {
        Preconditions.checkArgument((zzae == null && zzf == null) ? false : true, "At least one of RemoteModelLoader or LocalModelLoader must be non-null.");
        Preconditions.checkNotNull(zzn);
        this.zzbal = zzae;
        this.zzbam = zzf;
        this.zzban = zzn;
    }

    public final synchronized void zza(zzk zzk) throws FirebaseMLException {
        Exception exc;
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        Exception e = null;
        try {
            z = zza(zzk, arrayList);
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            z = false;
        }
        if (z) {
            this.zzban.zze(arrayList);
            this.zzbao = zzm.zzbaq;
            return;
        }
        try {
            z2 = zzb(zzk, arrayList);
        } catch (Exception e3) {
            e = e3;
        }
        if (z2) {
            this.zzban.zze(arrayList);
            this.zzbao = zzm.zzbar;
            return;
        }
        arrayList.add(zzmy.NO_VALID_MODEL);
        this.zzban.zze(arrayList);
        this.zzbao = zzm.zzbap;
        if (exc != null) {
            String valueOf = String.valueOf(zznm());
            throw new FirebaseMLException(valueOf.length() != 0 ? "Remote model load failed with the model options: ".concat(valueOf) : new String("Remote model load failed with the model options: "), 14, exc);
        } else if (e != null) {
            String valueOf2 = String.valueOf(zznm());
            throw new FirebaseMLException(valueOf2.length() != 0 ? "Local model load failed with the model options: ".concat(valueOf2) : new String("Local model load failed with the model options: "), 14, e);
        } else {
            String valueOf3 = String.valueOf(zznm());
            throw new FirebaseMLException(valueOf3.length() != 0 ? "Cannot load any model with the model options: ".concat(valueOf3) : new String("Cannot load any model with the model options: "), 14);
        }
    }

    public final synchronized boolean zznl() {
        return this.zzbao == zzm.zzbaq;
    }

    private final synchronized boolean zza(zzk zzk, List<zzmy> list) throws FirebaseMLException {
        if (this.zzbal != null) {
            try {
                MappedByteBuffer load = this.zzbal.load();
                if (load != null) {
                    zzk.zza(load);
                    zzayb.d("ModelLoader", "Remote model source is loaded successfully");
                    return true;
                }
                zzayb.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzmy.REMOTE_MODEL_LOADER_LOADS_NO_MODEL);
            } catch (FirebaseMLException e) {
                zzayb.d("ModelLoader", "Remote model source can NOT be loaded, try local model.");
                list.add(zzmy.REMOTE_MODEL_LOADER_ERROR);
                throw e;
            } catch (RuntimeException e2) {
                list.add(zzmy.REMOTE_MODEL_INVALID);
                throw e2;
            }
        }
        return false;
    }

    private final synchronized boolean zzb(zzk zzk, List<zzmy> list) throws FirebaseMLException {
        MappedByteBuffer load;
        if (this.zzbam == null || (load = this.zzbam.load()) == null) {
            return false;
        }
        try {
            zzk.zza(load);
            zzayb.d("ModelLoader", "Local model source is loaded successfully");
            return true;
        } catch (RuntimeException e) {
            list.add(zzmy.LOCAL_MODEL_INVALID);
            throw e;
        }
    }

    private final String zznm() {
        zzf zzf = this.zzbam;
        String str = "unspecified";
        String modelName = zzf == null ? str : zzf.zznk().getModelName();
        zzae zzae = this.zzbal;
        if (zzae != null) {
            str = zzae.zzoe().getUniqueModelNameForPersist();
        }
        return String.format("Local model name: %s. Remote model name: %s. ", new Object[]{modelName, str});
    }
}
