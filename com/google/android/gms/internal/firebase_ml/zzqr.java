package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.ml.vision.common.FirebaseVisionImage;
import com.google.firebase.ml.vision.label.FirebaseVisionImageLabel;
import java.util.ArrayList;
import java.util.List;

public final class zzqr extends zzpz<List<FirebaseVisionImageLabel>> {
    public zzqr(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(firebaseApp, "LABEL_DETECTION", firebaseVisionCloudDetectorOptions);
        zzov.zza(firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_IMAGE_LABEL_CREATE);
    }

    /* access modifiers changed from: protected */
    public final int zzpc() {
        return 640;
    }

    /* access modifiers changed from: protected */
    public final int zzpd() {
        return 480;
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zzov.zza(this.firebaseApp, 1).zza(zzmn.zzaa.zzky(), zznc.CLOUD_IMAGE_LABEL_DETECT);
        return super.zza(firebaseVisionImage);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza(@NonNull zzjn zzjn, float f) {
        if (zzjn.zzhw() == null) {
            return new ArrayList();
        }
        List<zzjx> zzhw = zzjn.zzhw();
        ArrayList arrayList = new ArrayList();
        for (zzjx zza : zzhw) {
            FirebaseVisionImageLabel zza2 = FirebaseVisionImageLabel.zza(zza);
            if (zza2 != null) {
                arrayList.add(zza2);
            }
        }
        return arrayList;
    }
}
