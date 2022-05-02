package com.google.android.gms.internal.firebase_ml;

import android.annotation.TargetApi;
import android.os.Build;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions;

public final class zzqi {
    public static int zzbs(@FirebaseVisionFaceDetectorOptions.LandmarkMode int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid landmark type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbt(@FirebaseVisionFaceDetectorOptions.PerformanceMode int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Invalid mode type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int zzbu(@FirebaseVisionFaceDetectorOptions.ClassificationMode int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Invalid classification type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @TargetApi(19)
    public static zzmn.zzab zzc(zzqn zzqn) {
        int i;
        zzmn.zzab.zza zza;
        if (zzqn.zzbhi.getBitmap() != null) {
            zza = zzmn.zzab.zza.BITMAP;
            if (Build.VERSION.SDK_INT >= 19) {
                i = zzqn.zzbhi.getBitmap().getAllocationByteCount();
            } else {
                i = zzqn.zzbhi.getBitmap().getByteCount();
            }
        } else {
            int format = zzqn.zzbhi.getMetadata().getFormat();
            if (format == 16) {
                zza = zzmn.zzab.zza.NV16;
            } else if (format == 17) {
                zza = zzmn.zzab.zza.NV21;
            } else if (format != 842094169) {
                zza = zzmn.zzab.zza.UNKNOWN_FORMAT;
            } else {
                zza = zzmn.zzab.zza.YV12;
            }
            i = zzqn.zzbhi.getGrayscaleImageData().capacity();
        }
        return (zzmn.zzab) ((zzux) zzmn.zzab.zzla().zzb(zza).zzbb(i).zzte());
    }
}
