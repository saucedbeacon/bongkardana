package com.google.firebase.ml.vision.automl.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zza;
import com.google.android.gms.internal.firebase_ml.zzd;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class zzf extends zza implements zzc {
    public zzf() {
        super("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabelerCreator");
    }

    public static zzc asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabelerCreator");
        if (queryLocalInterface instanceof zzc) {
            return (zzc) queryLocalInterface;
        }
        return new zze(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-412407350, oncanceled);
            onCancelLoad.getMin(-412407350, oncanceled);
        }
        if (i != 1) {
            return false;
        }
        IOnDeviceAutoMLImageLabeler newOnDeviceAutoMLImageLabeler = newOnDeviceAutoMLImageLabeler(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (OnDeviceAutoMLImageLabelerOptionsParcel) zzd.zza(parcel, OnDeviceAutoMLImageLabelerOptionsParcel.CREATOR));
        parcel2.writeNoException();
        zzd.zza(parcel2, (IInterface) newOnDeviceAutoMLImageLabeler);
        return true;
    }
}
