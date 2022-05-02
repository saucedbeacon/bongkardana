package com.google.firebase.ml.vision.objects.internal;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzqj;

public interface IObjectDetector extends IInterface {
    void start() throws RemoteException;

    void stop() throws RemoteException;

    zzj[] zzc(IObjectWrapper iObjectWrapper, zzqj zzqj) throws RemoteException;

    public static abstract class zza extends com.google.android.gms.internal.firebase_ml.zza implements IObjectDetector {
        public zza() {
            super("com.google.firebase.ml.vision.objects.internal.IObjectDetector");
        }

        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                zzj[] zzc = zzc(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzqj) zzd.zza(parcel, zzqj.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedArray(zzc, 1);
            } else if (i == 2) {
                start();
                parcel2.writeNoException();
            } else if (i != 3) {
                return false;
            } else {
                stop();
                parcel2.writeNoException();
            }
            return true;
        }
    }
}
