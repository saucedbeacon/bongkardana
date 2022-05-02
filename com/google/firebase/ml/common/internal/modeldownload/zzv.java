package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzux;
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;

public final class zzv {
    public static zzmn.zzag zza(FirebaseRemoteModel firebaseRemoteModel, zzp zzp) {
        String modelHash = firebaseRemoteModel.getModelHash();
        zzmn.zzaf.zza zzno = zzp.zzno();
        zzmn.zzag.zzb zzd = zzmn.zzag.zzlj().zzc(zza(firebaseRemoteModel.getInitialDownloadConditions())).zzd(zza(firebaseRemoteModel.getUpdatesDownloadConditions()));
        zzmn.zzaf.zzb zzb = zzmn.zzaf.zzlh().zzbc(firebaseRemoteModel.getModelNameForBackend()).zzb(zzmn.zzaf.zzc.CLOUD);
        if (modelHash == null) {
            modelHash = "";
        }
        return (zzmn.zzag) ((zzux) zzd.zzb(zzb.zzbe(modelHash).zzb(zzno)).zzam(firebaseRemoteModel.isModelUpdatesEnabled()).zzte());
    }

    @VisibleForTesting
    private static zzmn.zzag.zza zza(FirebaseModelDownloadConditions firebaseModelDownloadConditions) {
        return (zzmn.zzag.zza) ((zzux) zzmn.zzag.zza.zzlm().zzan(firebaseModelDownloadConditions.isChargingRequired()).zzap(firebaseModelDownloadConditions.isDeviceIdleRequired()).zzao(firebaseModelDownloadConditions.isWifiRequired()).zzte());
    }
}
