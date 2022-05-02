package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.internal.auth.zzr;

public class WorkAccount {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>("WorkAccount.API", CLIENT_BUILDER, CLIENT_KEY);
    private static final Api.AbstractClientBuilder<zzr, Api.ApiOptions.NoOptions> CLIENT_BUILDER = new zzf();
    private static final Api.ClientKey<zzr> CLIENT_KEY = new Api.ClientKey<>();
    @Deprecated
    public static final WorkAccountApi WorkAccountApi = new zzh();

    public static WorkAccountClient getClient(@NonNull Activity activity) {
        return new WorkAccountClient(activity);
    }

    public static WorkAccountClient getClient(@NonNull Context context) {
        return new WorkAccountClient(context);
    }

    private WorkAccount() {
    }
}
