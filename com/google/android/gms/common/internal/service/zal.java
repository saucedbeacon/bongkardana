package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;

public abstract class zal extends zaa implements zai {
    public zal() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zaa(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
