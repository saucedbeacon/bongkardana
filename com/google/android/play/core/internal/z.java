package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class z extends i implements ab {
    z(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    public final void a(String str, Bundle bundle, ad adVar) throws RemoteException {
        Parcel a2 = a();
        a2.writeString(str);
        k.a(a2, (Parcelable) bundle);
        k.a(a2, (IInterface) adVar);
        a(2, a2);
    }
}
