package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.zzh  reason: invalid package */
public final class zzh implements CredentialRequestResult {
    private final Status mStatus;
    private final Credential zzal;

    public zzh(Status status, Credential credential) {
        this.mStatus = status;
        this.zzal = credential;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final Credential getCredential() {
        return this.zzal;
    }

    public static zzh zzd(Status status) {
        return new zzh(status, (Credential) null);
    }
}
