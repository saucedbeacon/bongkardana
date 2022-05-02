package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseModelManager;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceAutoMLImageLabelerOptions;
import java.io.Closeable;
import java.util.List;

public final class zzqx extends zzqh<List<FirebaseVisionImageLabel>> implements Closeable {
    private final zzov zzbbg;

    public zzqx(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceAutoMLImageLabelerOptions firebaseVisionOnDeviceAutoMLImageLabelerOptions) throws FirebaseMLException {
        super(firebaseApp, new zzqw(firebaseApp, firebaseVisionOnDeviceAutoMLImageLabelerOptions));
        this.zzbbg = zzov.zza(firebaseApp, 5);
        if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo() != null) {
            FirebaseRemoteModel nonBaseRemoteModel = FirebaseModelManager.getInstance().getNonBaseRemoteModel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo());
            if (nonBaseRemoteModel == null) {
                zzp(zzmy.MODEL_NOT_REGISTERED);
                String valueOf = String.valueOf(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzoo());
                throw new FirebaseMLException(valueOf.length() != 0 ? "Remote model is not registered: ".concat(valueOf) : new String("Remote model is not registered: "), 3);
            } else if (nonBaseRemoteModel.isBaseModel()) {
                zzp(zzmy.MODEL_TYPE_MISUSE);
                throw new FirebaseMLException("You are trying to use a Base Model as an AutoML model. Please make sure you passed in the correct model name.", 3);
            }
        }
        if (firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon() == null || FirebaseModelManager.getInstance().getLocalModel(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon()) != null) {
            zzp(zzmy.NO_ERROR);
            return;
        }
        zzp(zzmy.MODEL_NOT_REGISTERED);
        String valueOf2 = String.valueOf(firebaseVisionOnDeviceAutoMLImageLabelerOptions.zzon());
        throw new FirebaseMLException(valueOf2.length() != 0 ? "Local model is not registered: ".concat(valueOf2) : new String("Local model is not registered: "), 3);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return zza(firebaseVisionImage, true, false);
    }

    private final void zzp(zzmy zzmy) {
        this.zzbbg.zza(zzmn.zzaa.zzky().zzb((zzmn.zzh) ((zzux) zzmn.zzh.zzjv().zzi(zzmy).zzte())), zznc.AUTOML_IMAGE_LABELING_CREATE);
    }
}
