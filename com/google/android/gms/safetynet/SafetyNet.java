package com.google.android.gms.safetynet;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.safetynet.zzk;
import com.google.android.gms.internal.safetynet.zzx;
import com.google.android.gms.internal.safetynet.zzy;

public final class SafetyNet {
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>("SafetyNet.API", CLIENT_BUILDER, CLIENT_KEY);
    private static final Api.AbstractClientBuilder<zzx, Api.ApiOptions.NoOptions> CLIENT_BUILDER = new zzk();
    private static final Api.ClientKey<zzx> CLIENT_KEY = new Api.ClientKey<>();
    @Deprecated
    public static final SafetyNetApi SafetyNetApi = new zzk();
    private static final zzo zzu = new zzy();

    private SafetyNet() {
    }

    public static SafetyNetClient getClient(@NonNull Activity activity) {
        return new SafetyNetClient(activity);
    }

    public static SafetyNetClient getClient(@NonNull Context context) {
        return new SafetyNetClient(context);
    }
}
