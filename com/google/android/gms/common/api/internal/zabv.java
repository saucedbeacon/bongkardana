package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;

final /* synthetic */ class zabv implements RemoteCall {
    private final RegistrationMethods.Builder zaa;

    zabv(RegistrationMethods.Builder builder) {
        this.zaa = builder;
    }

    public final void accept(Object obj, Object obj2) {
        this.zaa.zaa((Api.AnyClient) obj, (TaskCompletionSource) obj2);
    }
}
