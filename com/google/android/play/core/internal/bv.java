package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class bv extends j implements bw {
    public bv() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(1994743624, oncanceled);
            onCancelLoad.getMin(1994743624, oncanceled);
        }
        switch (i) {
            case 2:
                c(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 3:
                int readInt = parcel.readInt();
                k.a(parcel, Bundle.CREATOR);
                a(readInt);
                break;
            case 4:
                a(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 5:
                b(parcel.readInt(), (Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 6:
                e((Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 7:
                a((List<Bundle>) parcel.createTypedArrayList(Bundle.CREATOR));
                break;
            case 8:
                d((Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 9:
                a((Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                k.a(parcel, Bundle.CREATOR);
                b();
                break;
            case 11:
                k.a(parcel, Bundle.CREATOR);
                a();
                break;
            case 12:
                b((Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            case 13:
                c((Bundle) k.a(parcel, Bundle.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
