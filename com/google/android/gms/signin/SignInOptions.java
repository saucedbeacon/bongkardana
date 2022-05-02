package com.google.android.gms.signin;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions zaa = new SignInOptions(false, false, (String) null, false, (String) null, (String) null, false, (Long) null, (Long) null);
    private final boolean zab = false;
    private final boolean zac = false;
    @Nullable
    private final String zad = null;
    private final boolean zae = false;
    @Nullable
    private final String zaf = null;
    @Nullable
    private final String zag = null;
    private final boolean zah = false;
    @Nullable
    private final Long zai = null;
    @Nullable
    private final Long zaj = null;

    public static final class zaa {
    }

    private SignInOptions(boolean z, boolean z2, @Nullable String str, boolean z3, @Nullable String str2, @Nullable String str3, boolean z4, @Nullable Long l, @Nullable Long l2) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SignInOptions)) {
            return false;
        }
        SignInOptions signInOptions = (SignInOptions) obj;
        return this.zab == signInOptions.zab && this.zac == signInOptions.zac && Objects.equal(this.zad, signInOptions.zad) && this.zae == signInOptions.zae && this.zah == signInOptions.zah && Objects.equal(this.zaf, signInOptions.zaf) && Objects.equal(this.zag, signInOptions.zag) && Objects.equal(this.zai, signInOptions.zai) && Objects.equal(this.zaj, signInOptions.zaj);
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zab), Boolean.valueOf(this.zac), this.zad, Boolean.valueOf(this.zae), Boolean.valueOf(this.zah), this.zaf, this.zag, this.zai, this.zaj);
    }

    public final boolean zaa() {
        return this.zab;
    }

    public final boolean zab() {
        return this.zac;
    }

    @Nullable
    public final String zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }

    @Nullable
    public final String zae() {
        return this.zaf;
    }

    @Nullable
    public final String zaf() {
        return this.zag;
    }

    public final boolean zag() {
        return this.zah;
    }

    @Nullable
    public final Long zah() {
        return this.zai;
    }

    @Nullable
    public final Long zai() {
        return this.zaj;
    }

    static {
        new zaa();
    }
}
