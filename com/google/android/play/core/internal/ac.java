package com.google.android.play.core.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

public abstract class ac extends j implements ad {
    public ac() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        a((Bundle) k.a(parcel, Bundle.CREATOR));
        return true;
    }
}
