package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class zzaj extends zzam {
    public void zza(ProxyResponse proxyResponse) throws RemoteException {
        throw new UnsupportedOperationException();
    }

    public void zzb(String str) throws RemoteException {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1068370254, oncanceled);
            onCancelLoad.getMin(1068370254, oncanceled);
        }
        throw new UnsupportedOperationException();
    }
}
