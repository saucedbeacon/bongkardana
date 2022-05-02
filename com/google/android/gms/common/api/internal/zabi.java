package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

public final class zabi<O extends Api.ApiOptions> extends zaab {
    @NotOnlyInitialized
    private final GoogleApi<O> zaa;

    public zabi(GoogleApi<O> googleApi) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zaa = googleApi;
    }

    public final void zaa(zaci zaci) {
    }

    public final void zab(zaci zaci) {
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        return this.zaa.doRead(t);
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        return this.zaa.doWrite(t);
    }

    public final Looper getLooper() {
        return this.zaa.getLooper();
    }

    public final Context getContext() {
        return this.zaa.getApplicationContext();
    }
}
