package com.google.android.gms.internal.firebase_ml;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.vision.Frame;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.internal.modeldownload.zzp;
import com.google.firebase.ml.common.internal.modeldownload.zzv;
import com.google.firebase.ml.common.modeldownload.FirebaseLocalModel;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler;
import com.google.firebase.ml.vision.automl.internal.OnDeviceAutoMLImageLabelerOptionsParcel;
import com.google.firebase.ml.vision.automl.internal.zzc;
import com.google.firebase.ml.vision.automl.internal.zzf;
import com.google.firebase.ml.vision.automl.internal.zzh;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzqw implements zzok<List<FirebaseVisionImageLabel>, zzqn>, zzpd {
    @VisibleForTesting
    private static final AtomicBoolean zzbdt = new AtomicBoolean(true);
    private final FirebaseApp firebaseApp;
    private final FirebaseLocalModel zzbaf;
    private final zzov zzbbg;
    private final FirebaseRemoteModel zzbbh;
    private final AtomicBoolean zzbdw = new AtomicBoolean(false);
    private final FirebaseVisionOnDeviceAutoMLImageLabelerOptions zzbjm;
    private IOnDeviceAutoMLImageLabeler zzbjn;

    zzqw(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) {
        this.firebaseApp = firebaseApp2;
        this.zzbjm = firebaseVisionOnDeviceAutoMLImageLabelerOptions;
        this.zzbbg = zzov.zza(firebaseApp2, 5);
        FirebaseModelManager instance = FirebaseModelManager.getInstance();
        if (!TextUtils.isEmpty(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo())) {
            this.zzbbh = instance.getNonBaseRemoteModel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo());
        } else {
            this.zzbbh = null;
        }
        if (!TextUtils.isEmpty(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon())) {
            this.zzbaf = instance.getLocalModel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon());
        } else {
            this.zzbaf = null;
        }
    }

    public final zzpd zzmv() {
        return this;
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final synchronized List<FirebaseVisionImageLabel> zza(zzqn zzqn) throws FirebaseMLException {
        zzqn zzqn2 = zzqn;
        synchronized (this) {
            Preconditions.checkNotNull(zzqn2, "Mobile vision input can not be null");
            Preconditions.checkNotNull(zzqn2.zzbhi, "Input frame can not be null");
            boolean z = this.zzbdw.get();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.zzbjn == null) {
                zza(zzmy.UNKNOWN_ERROR, elapsedRealtime, z, zzqn);
                Log.e("ODAutoMLImgLabelerTask", "On device AutoML Image Labeler is not initialized.");
                throw new FirebaseMLException("Image labeler not initialized.", 13);
            } else if (zzqn2.zzbhi.getBitmap() != null) {
                try {
                    IObjectWrapper wrap = ObjectWrapper.wrap(zzqn2.zzbhi.getBitmap());
                    IOnDeviceAutoMLImageLabeler iOnDeviceAutoMLImageLabeler = this.zzbjn;
                    Frame.Metadata metadata = zzqn2.zzbhi.getMetadata();
                    zzqj zzqj = r9;
                    zzqj zzqj2 = new zzqj(metadata.getWidth(), metadata.getHeight(), metadata.getId(), metadata.getTimestampMillis(), metadata.getRotation());
                    zzh[] zza = iOnDeviceAutoMLImageLabeler.zza(wrap, zzqj);
                    zza(zzmy.NO_ERROR, elapsedRealtime, z, zzqn);
                    if (zza == null) {
                        zzmb zziy = zzmb.zziy();
                        return zziy;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (zzh zza2 : zza) {
                        arrayList.add(FirebaseVisionImageLabel.zza(zza2));
                    }
                    zzbdt.set(false);
                    return arrayList;
                } catch (RemoteException e) {
                    zza(zzmy.UNKNOWN_ERROR, elapsedRealtime, z, zzqn);
                    Log.e("ODAutoMLImgLabelerTask", "Error calling on device auto ml inference.", e);
                    throw new FirebaseMLException("Cannot run on device automl image labeler.", 13, e);
                }
            } else {
                Log.e("ODAutoMLImgLabelerTask", "No image data found.");
                throw new FirebaseMLException("No image data found.", 3);
            }
        }
    }

    @WorkerThread
    public final synchronized void zzne() throws FirebaseMLException {
        try {
            if (this.zzbjn == null) {
                zzc asInterface = zzf.asInterface(DynamiteModule.load(this.firebaseApp.getApplicationContext(), DynamiteModule.PREFER_LOCAL, "com.google.firebase.ml.vision.dynamite.automl").instantiate("com.google.firebase.ml.vision.automl.OnDeviceAutoMLImageLabelerCreator"));
                if (asInterface != null) {
                    IObjectWrapper wrap = ObjectWrapper.wrap(this.firebaseApp);
                    FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions = this.zzbjm;
                    this.zzbjn = asInterface.newOnDeviceAutoMLImageLabeler(wrap, new OnDeviceAutoMLImageLabelerOptionsParcel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.getConfidenceThreshold(), firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon(), firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo()));
                } else {
                    Log.e("ODAutoMLImgLabelerTask", "Error when creating on device AutoML Image Labeler creator.");
                    throw new FirebaseMLException("Can not create on device AutoML Image Labeler.", 14);
                }
            }
            this.zzbjn.zzne();
            this.zzbdw.set(this.zzbjn.zznl());
        } catch (DynamiteModule.LoadingException e) {
            Log.e("ODAutoMLImgLabelerTask", "Error when loading automl module.", e);
            throw new FirebaseMLException("Cannot load automl module. Please add dependency firebase-ml-vision-automl.", 14);
        } catch (RemoteException e2) {
            Log.e("ODAutoMLImgLabelerTask", "Error when creating on device AutoML Image Labeler.", e2);
            throw new FirebaseMLException("Can not create on device AutoML Image Labeler.", 14, e2);
        } catch (RemoteException e3) {
            Log.e("ODAutoMLImgLabelerTask", "Error while loading the AutoML image labeling model.", e3);
            throw new FirebaseMLException("Cannot load the AutoML image labeling model.", 14, e3);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void release() {
        try {
            if (this.zzbjn != null) {
                this.zzbjn.close();
            }
            zzbdt.set(true);
        } catch (RemoteException e) {
            Log.e("ODAutoMLImgLabelerTask", "Error closing on device AutoML Image Labeler", e);
        }
    }

    @WorkerThread
    private final void zza(zzmy zzmy, long j, boolean z, zzqn zzqn) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.zzbbg.zza((zzpb) new zzqz(this, elapsedRealtime, zzmy, zzqn, z), zznc.AUTOML_IMAGE_LABELING_RUN);
        zzpa zzpa = zzqy.zzbeb;
        this.zzbbg.zza((zzmn.zza.C0082zza) ((zzux) zzmn.zza.C0082zza.zzjb().zzb(zzmy).zzn(zzbdt.get()).zzb(zzqi.zzc(zzqn)).zzte()), elapsedRealtime, zznc.AGGREGATED_AUTO_ML_IMAGE_LABELING_INFERENCE, zzpa);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzmn.zzaa.zza zza(long j, zzmy zzmy, zzqn zzqn, boolean z) {
        FirebaseRemoteModel firebaseRemoteModel;
        zzmn.zzi.zza zzh = zzmn.zzi.zzjx().zzb(zzmn.zzac.zzlc().zzj(j).zzk(zzmy).zzac(zzbdt.get()).zzad(true).zzae(true)).zzh(zzqi.zzc(zzqn));
        if (!z || (firebaseRemoteModel = this.zzbbh) == null) {
            FirebaseLocalModel firebaseLocalModel = this.zzbaf;
            if (firebaseLocalModel != null) {
                zzh.zzd(firebaseLocalModel.zza(zzp.AUTOML));
            }
        } else {
            zzh.zzd(zzv.zza(firebaseRemoteModel, zzp.AUTOML));
        }
        return zzmn.zzaa.zzky().zzb(zzh);
    }
}
