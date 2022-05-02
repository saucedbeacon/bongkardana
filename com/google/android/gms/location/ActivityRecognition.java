package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.internal.location.zze;

public class ActivityRecognition {
    public static final Api<Api.ApiOptions.NoOptions> API = new Api<>("ActivityRecognition.API", CLIENT_BUILDER, CLIENT_KEY);
    @Deprecated
    public static final ActivityRecognitionApi ActivityRecognitionApi = new zze();
    private static final Api.AbstractClientBuilder<zzaz, Api.ApiOptions.NoOptions> CLIENT_BUILDER = new zza();
    private static final Api.ClientKey<zzaz> CLIENT_KEY = new Api.ClientKey<>();
    public static final String CLIENT_NAME = "activity_recognition";

    public static abstract class zza<R extends Result> extends BaseImplementation.ApiMethodImpl<R, zzaz> {
        public zza(GoogleApiClient googleApiClient) {
            super((Api<?>) ActivityRecognition.API, googleApiClient);
        }
    }

    private ActivityRecognition() {
    }

    public static ActivityRecognitionClient getClient(Activity activity) {
        return new ActivityRecognitionClient(activity);
    }

    public static ActivityRecognitionClient getClient(Context context) {
        return new ActivityRecognitionClient(context);
    }
}
