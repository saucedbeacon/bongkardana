package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zad;

public abstract class zaf extends zaa implements zac {
    public zaf() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                zaa((ConnectionResult) zad.zaa(parcel, ConnectionResult.CREATOR), (zab) zad.zaa(parcel, zab.CREATOR));
                break;
            case 4:
                zaa((Status) zad.zaa(parcel, Status.CREATOR));
                break;
            case 6:
                zab((Status) zad.zaa(parcel, Status.CREATOR));
                break;
            case 7:
                zaa((Status) zad.zaa(parcel, Status.CREATOR), (GoogleSignInAccount) zad.zaa(parcel, GoogleSignInAccount.CREATOR));
                break;
            case 8:
                zaa((zam) zad.zaa(parcel, zam.CREATOR));
                break;
            case 9:
                zaa((zag) zad.zaa(parcel, zag.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
