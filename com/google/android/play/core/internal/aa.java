package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class aa extends j implements ab {
    public static ab a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        return queryLocalInterface instanceof ab ? (ab) queryLocalInterface : new z(iBinder);
    }
}
