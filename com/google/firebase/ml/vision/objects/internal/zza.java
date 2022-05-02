package com.google.firebase.ml.vision.objects.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.firebase_ml.zzb;
import com.google.android.gms.internal.firebase_ml.zzd;
import com.google.android.gms.internal.firebase_ml.zzqj;

public final class zza extends zzb implements IObjectDetector {
    zza(IBinder iBinder) {
        super(iBinder, "com.google.firebase.ml.vision.objects.internal.IObjectDetector");
    }

    public final zzj[] zzc(IObjectWrapper iObjectWrapper, zzqj zzqj) throws RemoteException {
        Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        zzd.zza(obtainAndWriteInterfaceToken, (IInterface) iObjectWrapper);
        zzd.zza(obtainAndWriteInterfaceToken, (Parcelable) zzqj);
        Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
        zzj[] zzjArr = (zzj[]) transactAndReadException.createTypedArray(zzj.CREATOR);
        transactAndReadException.recycle();
        return zzjArr;
    }

    public final void start() throws RemoteException {
        transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken());
    }

    public final void stop() throws RemoteException {
        transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken());
    }
}
