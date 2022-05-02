package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Result;

public class Response<T extends Result> {
    private T zza;

    public Response() {
    }

    protected Response(@NonNull T t) {
        this.zza = t;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public T getResult() {
        return this.zza;
    }

    public void setResult(@NonNull T t) {
        this.zza = t;
    }
}
