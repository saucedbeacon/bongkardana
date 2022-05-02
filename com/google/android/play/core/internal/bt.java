package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class bt extends j implements bu {
    public static bu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return queryLocalInterface instanceof bu ? (bu) queryLocalInterface : new bs(iBinder);
    }
}
