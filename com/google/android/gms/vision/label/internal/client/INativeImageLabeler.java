package com.google.android.gms.vision.label.internal.client;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzb;
import com.google.android.gms.internal.vision.zzc;

public interface INativeImageLabeler extends IInterface {
    zze[] zza(IObjectWrapper iObjectWrapper, LabelOptions labelOptions) throws RemoteException;

    void zzs() throws RemoteException;

    public static abstract class zza extends zzb implements INativeImageLabeler {
        public zza() {
            super("com.google.android.gms.vision.label.internal.client.INativeImageLabeler");
        }

        public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                zze[] zza = zza(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (LabelOptions) zzc.zza(parcel, LabelOptions.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedArray(zza, 1);
            } else if (i != 2) {
                return false;
            } else {
                zzs();
                parcel2.writeNoException();
            }
            return true;
        }
    }
}
