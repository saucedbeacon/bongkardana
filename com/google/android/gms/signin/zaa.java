package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.signin.internal.SignInClientImpl;

public final class zaa {
    public static final Api.AbstractClientBuilder<SignInClientImpl, SignInOptions> zaa = new zac();
    public static final Api<SignInOptions> zab = new Api<>("SignIn.API", zaa, zac);
    private static final Api.ClientKey<SignInClientImpl> zac = new Api.ClientKey<>();
    @ShowFirstParty
    private static final Api.ClientKey<SignInClientImpl> zad = new Api.ClientKey<>();
    private static final Api.AbstractClientBuilder<SignInClientImpl, zae> zae = new zab();
    private static final Scope zaf = new Scope("profile");
    private static final Scope zag = new Scope("email");
    private static final Api<zae> zah = new Api<>("SignIn.INTERNAL_API", zae, zad);
}
