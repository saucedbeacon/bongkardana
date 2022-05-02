package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.vision.text.FirebaseVisionText;

public final class zzrb implements zzok<FirebaseVisionText, zzqn>, zzpd {
    @VisibleForTesting
    static boolean zzbgf = true;
    private final Context zzbae;
    private final zzov zzbbg;
    private final zzqg zzbgh = new zzqg();
    @GuardedBy("this")
    private TextRecognizer zzbko;

    zzrb(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp, "Firebase App can not be null");
        this.zzbae = firebaseApp.getApplicationContext();
        this.zzbbg = zzov.zza(firebaseApp, 1);
    }

    public final zzpd zzmv() {
        return this;
    }

    @WorkerThread
    public final synchronized void zzne() {
        if (this.zzbko == null) {
            this.zzbko = new TextRecognizer.Builder(this.zzbae).build();
        }
    }

    @WorkerThread
    public final synchronized void release() {
        if (this.zzbko != null) {
            this.zzbko.release();
            this.zzbko = null;
        }
        zzbgf = true;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    /* renamed from: zzd */
    public final synchronized FirebaseVisionText zza(@NonNull zzqn zzqn) throws FirebaseMLException {
        SparseArray<TextBlock> detect;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzbko == null) {
            zza(zzmy.UNKNOWN_ERROR, elapsedRealtime, zzqn);
            throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
        } else if (this.zzbko.isOperational()) {
            this.zzbgh.zzb(zzqn);
            detect = this.zzbko.detect(zzqn.zzbhi);
            zza(zzmy.NO_ERROR, elapsedRealtime, zzqn);
            zzbgf = false;
        } else {
            zza(zzmy.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzqn);
            throw new FirebaseMLException("Waiting for the text recognition model to be downloaded. Please wait.", 14);
        }
        return new FirebaseVisionText(detect);
    }

    @WorkerThread
    private final void zza(zzmy zzmy, long j, zzqn zzqn) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzbbg.zza((zzpb) new zzre(elapsedRealtime, zzmy, zzqn), zznc.ON_DEVICE_TEXT_DETECT);
        zzpa zzpa = zzrd.zzbeb;
        this.zzbbg.zza((zzmn.zzg.zza) ((zzux) zzmn.zzg.zza.zzjt().zzh(zzmy).zzv(zzbgf).zzg(zzqi.zzc(zzqn)).zzte()), elapsedRealtime, zznc.AGGREGATED_ON_DEVICE_TEXT_DETECTION, zzpa);
    }
}
