package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

final class zae extends zaa {
    private final BaseImplementation.ResultHolder<Status> zaa;

    public zae(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.zaa = resultHolder;
    }

    public final void zaa(int i) throws RemoteException {
        this.zaa.setResult(new Status(i));
    }
}
