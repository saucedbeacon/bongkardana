package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2036639145, oncanceled);
            onCancelLoad.getMin(-2036639145, oncanceled);
        }
        if (i == 1) {
            zza((ProxyResponse) zzc.zza(parcel, ProxyResponse.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzb(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
