package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;

public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = ((CredentialsOptions) new Builder().zzc());

    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public final Builder forceEnableSaveDialog() {
            this.zzn = Boolean.TRUE;
            return this;
        }

        /* renamed from: build */
        public final CredentialsOptions zzc() {
            return new CredentialsOptions(this);
        }
    }

    private CredentialsOptions(Builder builder) {
        super(builder);
    }
}
