package com.google.firebase.ml.vision.automl.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzqj;

public interface IOnDeviceAutoMLImageLabeler extends IInterface {
    void close() throws RemoteException;

    zzh[] zza(IObjectWrapper iObjectWrapper, zzqj zzqj) throws RemoteException;

    void zzne() throws RemoteException;

    boolean zznl() throws RemoteException;

    public static abstract class zza extends com.google.android.gms.internal.firebase_ml.zza implements IOnDeviceAutoMLImageLabeler {
        public zza() {
            super("com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
        }

        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                zzh[] zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzqj) zzd.zza(parcel, zzqj.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedArray(zza, 1);
            } else if (i == 2) {
                zzne();
                parcel2.writeNoException();
            } else if (i == 3) {
                close();
                parcel2.writeNoException();
            } else if (i != 4) {
                return false;
            } else {
                boolean zznl = zznl();
                parcel2.writeNoException();
                zzd.writeBoolean(parcel2, zznl);
            }
            return true;
        }
    }
}
