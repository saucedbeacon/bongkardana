package com.google.android.gms.vision.label.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.vision.zzb;

public abstract class zzc extends zzb implements zzb {
    public zzc() {
        super("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
    }

    public static zzb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
        if (queryLocalInterface instanceof zzb) {
            return (zzb) queryLocalInterface;
        }
        return new zzd(iBinder);
    }

    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        INativeImageLabeler newImageLabeler = newImageLabeler(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (ImageLabelerOptions) com.google.android.gms.internal.vision.zzc.zza(parcel, ImageLabelerOptions.CREATOR));
        parcel2.writeNoException();
        com.google.android.gms.internal.vision.zzc.zza(parcel2, (IInterface) newImageLabeler);
        return true;
    }
}
