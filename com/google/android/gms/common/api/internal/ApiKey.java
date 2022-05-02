package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

public final class ApiKey<O extends Api.ApiOptions> {
    private final boolean zaa = false;
    private final int zab;
    private final Api<O> zac;
    @Nullable
    private final O zad;

    private ApiKey(Api<O> api, @Nullable O o2) {
        this.zac = api;
        this.zad = o2;
        this.zab = Objects.hashCode(api, o2);
    }

    public final boolean isUnique() {
        return false;
    }

    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(Api<O> api, @Nullable O o2) {
        return new ApiKey<>(api, o2);
    }

    public final Api.AnyClientKey<?> getClientKey() {
        return this.zac.zac();
    }

    public final String getApiName() {
        return this.zac.zad();
    }

    public final int hashCode() {
        return this.zab;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
    }
}
