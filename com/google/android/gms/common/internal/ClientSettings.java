package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import o.MediaSessionCompat$Token;

@KeepForSdk
@VisibleForTesting
public final class ClientSettings {
    @Nullable
    private final Account zaa;
    private final Set<Scope> zab;
    private final Set<Scope> zac;
    private final Map<Api<?>, zaa> zad;
    private final int zae;
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private final boolean zaj;
    private Integer zak;

    public static final class zaa {
        public final Set<Scope> zaa;

        public zaa(Set<Scope> set) {
            Preconditions.checkNotNull(set);
            this.zaa = Collections.unmodifiableSet(set);
        }
    }

    @KeepForSdk
    public static ClientSettings createDefault(Context context) {
        return new GoogleApiClient.Builder(context).buildClientSettings();
    }

    @KeepForSdk
    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, zaa> map, int i, View view, String str, String str2, SignInOptions signInOptions) {
        this(account, set, map, i, view, str, str2, signInOptions, false);
    }

    @KeepForSdk
    public static final class Builder {
        @Nullable
        private Account zaa;
        private MediaSessionCompat$Token<Scope> zab;
        private int zac = 0;
        private String zad;
        private String zae;
        private SignInOptions zaf = SignInOptions.zaa;

        public final Builder zaa(@Nullable Account account) {
            this.zaa = account;
            return this;
        }

        public final Builder zaa(Collection<Scope> collection) {
            if (this.zab == null) {
                this.zab = new MediaSessionCompat$Token<>();
            }
            this.zab.addAll(collection);
            return this;
        }

        @KeepForSdk
        public final Builder setRealClientPackageName(String str) {
            this.zad = str;
            return this;
        }

        public final Builder zaa(String str) {
            this.zae = str;
            return this;
        }

        @KeepForSdk
        public final ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, (Map<Api<?>, zaa>) null, 0, (View) null, this.zad, this.zae, this.zaf, false);
        }
    }

    public ClientSettings(@Nullable Account account, Set<Scope> set, Map<Api<?>, zaa> map, int i, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.zaa = account;
        this.zab = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zad = map == null ? Collections.emptyMap() : map;
        this.zaf = view;
        this.zae = i;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions;
        this.zaj = false;
        HashSet hashSet = new HashSet(this.zab);
        for (zaa zaa2 : this.zad.values()) {
            hashSet.addAll(zaa2.zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }

    @KeepForSdk
    @Deprecated
    @Nullable
    public final String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    @Nullable
    public final Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
    public final Account getAccountOrDefault() {
        Account account = this.zaa;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    @KeepForSdk
    public final int getGravityForPopups() {
        return this.zae;
    }

    @KeepForSdk
    public final Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @KeepForSdk
    public final Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    public final Map<Api<?>, zaa> zaa() {
        return this.zad;
    }

    @KeepForSdk
    @Nullable
    public final String getRealClientPackageName() {
        return this.zag;
    }

    @Nullable
    public final String zab() {
        return this.zah;
    }

    @KeepForSdk
    @Nullable
    public final View getViewForPopups() {
        return this.zaf;
    }

    public final SignInOptions zac() {
        return this.zai;
    }

    @Nullable
    public final Integer zad() {
        return this.zak;
    }

    public final void zaa(Integer num) {
        this.zak = num;
    }

    @KeepForSdk
    public final Set<Scope> getApplicableScopes(Api<?> api) {
        zaa zaa2 = this.zad.get(api);
        if (zaa2 == null || zaa2.zaa.isEmpty()) {
            return this.zab;
        }
        HashSet hashSet = new HashSet(this.zab);
        hashSet.addAll(zaa2.zaa);
        return hashSet;
    }

    public final boolean zae() {
        return this.zaj;
    }
}
