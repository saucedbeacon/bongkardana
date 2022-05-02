package com.google.firebase.ml.vision.automl.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzqj;

public final class zzd extends zzb implements IOnDeviceAutoMLImageLabeler {
    zzd(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.automl.internal.IOnDeviceAutoMLImageLabeler");
    }

    public final zzh[] zza(IObjectWrapper iObjectWrapper, zzqj zzqj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.firebase_ml.zzd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        com.google.android.gms.internal.firebase_ml.zzd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzqj);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzh[] zzhArr = (zzh[]) transactAndReadException.createTypedArray(zzh.CREATOR);
        transactAndReadException.recycle();
        return zzhArr;
    }

    public final void zzne() throws RemoteException {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    public final void close() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }

    public final boolean zznl() throws RemoteException {
        Parcel transactAndReadException = transactAndReadException(4, obtainAndWriteInterfaceToken());
        boolean zza = com.google.android.gms.internal.firebase_ml.zzd.zza(transactAndReadException);
        transactAndReadException.recycle();
        return zza;
    }
}
