package com.google.firebase.ml.vision.objects.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zza;
import com.google.android.gms.internal.firebase_ml.zzd;

public abstract class zzb extends zza implements zzc {
    public zzb() {
        super("com.google.firebase.ml.vision.objects.internal.IObjectDetectorCreator");
    }

    public static zzc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.ml.vision.objects.internal.IObjectDetectorCreator");
        if (queryLocalInterface instanceof zzc) {
            return (zzc) queryLocalInterface;
        }
        return new zzd(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        IObjectDetector newObjectDetector = newObjectDetector(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (ObjectDetectorOptionsParcel) zzd.zza(parcel, ObjectDetectorOptionsParcel.CREATOR));
        parcel2.writeNoException();
        zzd.zza(parcel2, (IInterface) newObjectDetector);
        return true;
    }
}
