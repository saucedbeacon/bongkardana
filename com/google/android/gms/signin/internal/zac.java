package com.google.android.gms.signin.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

public interface zac extends IInterface {
    void zaa(ConnectionResult connectionResult, zab zab) throws RemoteException;

    void zaa(Status status) throws RemoteException;

    void zaa(Status status, GoogleSignInAccount googleSignInAccount) throws RemoteException;

    void zaa(zag zag) throws RemoteException;

    void zaa(zam zam) throws RemoteException;

    void zab(Status status) throws RemoteException;
}
