package com.google.firebase.ml.vision.objects.internal;

import android.os.IBinder;
import com.google.android.gms.internal.firebase_ml.zzb;

public final class zzd extends zzb implements zzc {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.objects.internal.IObjectDetectorCreator");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.ml.vision.objects.internal.IObjectDetector newObjectDetector(com.google.android.gms.dynamic.IObjectWrapper r3, com.google.firebase.ml.vision.objects.internal.ObjectDetectorOptionsParcel r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.obtainAndWriteInterfaceToken()
            com.google.android.gms.internal.firebase_ml.zzd.zza((android.os.Parcel) r0, (android.os.IInterface) r3)
            com.google.android.gms.internal.firebase_ml.zzd.zza((android.os.Parcel) r0, (android.os.Parcelable) r4)
            r3 = 1
            android.os.Parcel r3 = r2.transactAndReadException(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0017
            r4 = 0
            goto L_0x002b
        L_0x0017:
            java.lang.String r0 = "com.google.firebase.ml.vision.objects.internal.IObjectDetector"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.firebase.ml.vision.objects.internal.IObjectDetector
            if (r1 == 0) goto L_0x0025
            r4 = r0
            com.google.firebase.ml.vision.objects.internal.IObjectDetector r4 = (com.google.firebase.ml.vision.objects.internal.IObjectDetector) r4
            goto L_0x002b
        L_0x0025:
            com.google.firebase.ml.vision.objects.internal.zza r0 = new com.google.firebase.ml.vision.objects.internal.zza
            r0.<init>(r4)
            r4 = r0
        L_0x002b:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.objects.internal.zzd.newObjectDetector(com.google.android.gms.dynamic.IObjectWrapper, com.google.firebase.ml.vision.objects.internal.ObjectDetectorOptionsParcel):com.google.firebase.ml.vision.objects.internal.IObjectDetector");
    }
}
