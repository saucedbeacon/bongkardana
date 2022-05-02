package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zach extends TaskApiCall<A, ResultT> {
    private final /* synthetic */ TaskApiCall.Builder zaa;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zach(TaskApiCall.Builder builder, Feature[] featureArr, boolean z) {
        super(featureArr, z);
        this.zaa = builder;
    }

    /* access modifiers changed from: protected */
    public final void doExecute(A a2, TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException {
        this.zaa.zaa.accept(a2, taskCompletionSource);
    }
}
