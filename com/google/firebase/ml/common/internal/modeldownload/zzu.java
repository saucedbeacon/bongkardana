package com.google.firebase.ml.common.internal.modeldownload;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.internal.firebase_ml.zznc;
import com.google.android.gms.internal.firebase_ml.zzov;
import com.google.android.gms.internal.firebase_ml.zzph;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;

public final class zzu {
    private static final GmsLogger zzayb = new GmsLogger("ModelDownloadLogger", "");
    private final zzph zzazb;
    private final zzov zzbbg;
    private final FirebaseRemoteModel zzbbh;

    public zzu(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel) {
        this.zzbbg = zzov.zza(firebaseApp, 4);
        this.zzbbh = firebaseRemoteModel;
        this.zzazb = zzph.zzc(firebaseApp);
    }

    public final void zza(zzmy zzmy, String str, boolean z, zzp zzp) {
        zza(zzmy, str, false, false, zzp, zzmn.zzae.zzb.UNKNOWN_STATUS, 0);
    }

    private final void zza(zzmy zzmy, String str, boolean z, boolean z2, zzp zzp, zzmn.zzae.zzb zzb, int i) {
        zzmn.zzae.zza zzk = zzmn.zzae.zzlf().zzl(zzmy).zza(zzb).zzn((long) i).zzk(zzv.zza(this.zzbbh, zzp));
        if (z) {
            long zzf = this.zzazb.zzf(this.zzbbh);
            if (zzf == 0) {
                zzayb.w("ModelDownloadLogger", "Model downloaded without its beginning time recorded.");
            } else {
                long zzg = this.zzazb.zzg(this.zzbbh);
                if (zzg == 0) {
                    zzg = SystemClock.elapsedRealtime();
                    this.zzazb.zza(this.zzbbh, zzg);
                }
                zzk.zzl(zzg - zzf);
            }
        }
        if (z2) {
            long zzf2 = this.zzazb.zzf(this.zzbbh);
            if (zzf2 == 0) {
                zzayb.w("ModelDownloadLogger", "Model downloaded without its beginning time recorded.");
            } else {
                zzk.zzm(SystemClock.elapsedRealtime() - zzf2);
            }
        }
        this.zzbbg.zza(zzmn.zzaa.zzky().zzb(zzmn.zzau.zzmr().zzbq(str)).zzb(zzk), zznc.MODEL_DOWNLOAD);
    }

    public final void zza(zzmy zzmy, boolean z, zzp zzp, zzmn.zzae.zzb zzb) {
        zza(zzmy, "NA", z, false, zzp, zzb, 0);
    }

    public final void zza(zzmy zzmy, zzp zzp, zzmn.zzae.zzb zzb) {
        zza(zzmy, "NA", false, true, zzp, zzb, 0);
    }

    public final void zza(boolean z, zzp zzp, int i) {
        zza(zzmy.DOWNLOAD_FAILED, "NA", false, false, zzp, zzmn.zzae.zzb.FAILED, i);
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzmy zzmy) {
        zza(zzmy, 0);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzmy zzmy, int i) {
        zza(zzmy, "NA", false, false, zzp.UNKNOWN, zzmn.zzae.zzb.MODEL_INFO_RETRIEVAL_FAILED, i);
    }
}
