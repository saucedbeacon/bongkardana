package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zau;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.internal.zam;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaf implements zaaw {
    /* access modifiers changed from: private */
    public final zaaz zaa;
    /* access modifiers changed from: private */
    public final Lock zab;
    /* access modifiers changed from: private */
    public final Context zac;
    /* access modifiers changed from: private */
    public final GoogleApiAvailabilityLight zad;
    @Nullable
    private ConnectionResult zae;
    private int zaf;
    private int zag = 0;
    private int zah;
    private final Bundle zai = new Bundle();
    private final Set<Api.AnyClientKey> zaj = new HashSet();
    /* access modifiers changed from: private */
    @Nullable
    public zad zak;
    private boolean zal;
    /* access modifiers changed from: private */
    public boolean zam;
    private boolean zan;
    /* access modifiers changed from: private */
    @Nullable
    public IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    /* access modifiers changed from: private */
    @Nullable
    public final ClientSettings zar;
    private final Map<Api<?>, Boolean> zas;
    @Nullable
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zat;
    private ArrayList<Future<?>> zau = new ArrayList<>();

    public zaaf(zaaz zaaz, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.zaa = zaaz;
        this.zar = clientSettings;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    private static String zac(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public final void zac() {
    }

    @GuardedBy("mLock")
    public final void zaa() {
        this.zaa.zab.clear();
        this.zam = false;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (Api next : this.zas.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull(this.zaa.zaa.get(next.zac()));
            z |= next.zaa().getPriority() == 1;
            boolean booleanValue = this.zas.get(next).booleanValue();
            if (client.requiresSignIn()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(next.zac());
                } else {
                    this.zal = false;
                }
            }
            hashMap.put(client, new zaah(this, next, booleanValue));
        }
        if (z) {
            this.zam = false;
        }
        if (this.zam) {
            Preconditions.checkNotNull(this.zar);
            Preconditions.checkNotNull(this.zat);
            this.zar.zaa(Integer.valueOf(System.identityHashCode(this.zaa.zad)));
            zaam zaam = new zaam(this, (zaae) null);
            Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder = this.zat;
            Context context = this.zac;
            Looper looper = this.zaa.zad.getLooper();
            ClientSettings clientSettings = this.zar;
            this.zak = (zad) abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zac(), (GoogleApiClient.ConnectionCallbacks) zaam, (GoogleApiClient.OnConnectionFailedListener) zaam);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(zaba.zaa().submit(new zaag(this, hashMap)));
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zad() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.zaa.zad.zac());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            zab(new ConnectionResult(8, (PendingIntent) null));
            return false;
        } else if (this.zae == null) {
            return true;
        } else {
            this.zaa.zac = this.zaf;
            zab(this.zae);
            return false;
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zaa(zam zam2) {
        if (zab(0)) {
            ConnectionResult zaa2 = zam2.zaa();
            if (zaa2.isSuccess()) {
                zau zau2 = (zau) Preconditions.checkNotNull(zam2.zab());
                ConnectionResult zab2 = zau2.zab();
                if (!zab2.isSuccess()) {
                    String valueOf = String.valueOf(zab2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    Log.wtf("GACConnecting", sb.toString(), new Exception());
                    zab(zab2);
                    return;
                }
                this.zan = true;
                this.zao = (IAccountAccessor) Preconditions.checkNotNull(zau2.zaa());
                this.zap = zau2.zac();
                this.zaq = zau2.zad();
                zae();
            } else if (zaa(zaa2)) {
                zag();
                zae();
            } else {
                zab(zaa2);
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zae() {
        if (this.zah == 0) {
            if (!this.zam || this.zan) {
                ArrayList arrayList = new ArrayList();
                this.zag = 1;
                this.zah = this.zaa.zaa.size();
                for (Api.AnyClientKey next : this.zaa.zaa.keySet()) {
                    if (!this.zaa.zab.containsKey(next)) {
                        arrayList.add(this.zaa.zaa.get(next));
                    } else if (zad()) {
                        zaf();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.zau.add(zaba.zaa().submit(new zaal(this, arrayList)));
                }
            }
        }
    }

    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        if (zab(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zad()) {
                zaf();
            }
        }
    }

    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (zab(1)) {
            zab(connectionResult, api, z);
            if (zad()) {
                zaf();
            }
        }
    }

    @GuardedBy("mLock")
    private final void zaf() {
        this.zaa.zai();
        zaba.zaa().execute(new zaae(this));
        zad zad2 = this.zak;
        if (zad2 != null) {
            if (this.zap) {
                zad2.zaa((IAccountAccessor) Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaa(false);
        }
        for (Api.AnyClientKey<?> anyClientKey : this.zaa.zab.keySet()) {
            ((Api.Client) Preconditions.checkNotNull(this.zaa.zaa.get(anyClientKey))).disconnect();
        }
        this.zaa.zae.zaa(this.zai.isEmpty() ? null : this.zai);
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.zaa.zad.zaa.add(t);
        return t;
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @GuardedBy("mLock")
    public final boolean zab() {
        zah();
        zaa(true);
        this.zaa.zaa((ConnectionResult) null);
        return true;
    }

    @GuardedBy("mLock")
    public final void zaa(int i) {
        zab(new ConnectionResult(8, (PendingIntent) null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    @javax.annotation.concurrent.GuardedBy("mLock")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zab(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.Api<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.Api$BaseClientBuilder r0 = r6.zaa()
            int r0 = r0.getPriority()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.hasResolution()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.GoogleApiAvailabilityLight r7 = r4.zad
            int r3 = r5.getErrorCode()
            android.content.Intent r7 = r7.getErrorResolutionIntent(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.zae
            if (r7 == 0) goto L_0x002c
            int r7 = r4.zaf
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.zae = r5
            r4.zaf = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.zaaz r7 = r4.zaa
            java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.zab
            com.google.android.gms.common.api.Api$AnyClientKey r6 = r6.zac()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zaaf.zab(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.Api, boolean):void");
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zag() {
        this.zam = false;
        this.zaa.zad.zac = Collections.emptySet();
        for (Api.AnyClientKey next : this.zaj) {
            if (!this.zaa.zab.containsKey(next)) {
                this.zaa.zab.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zaa(ConnectionResult connectionResult) {
        return this.zal && !connectionResult.hasResolution();
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final void zab(ConnectionResult connectionResult) {
        zah();
        zaa(!connectionResult.hasResolution());
        this.zaa.zaa(connectionResult);
        this.zaa.zae.zaa(connectionResult);
    }

    @GuardedBy("mLock")
    private final void zaa(boolean z) {
        zad zad2 = this.zak;
        if (zad2 != null) {
            if (zad2.isConnected() && z) {
                zad2.zaa();
            }
            zad2.disconnect();
            if (((ClientSettings) Preconditions.checkNotNull(this.zar)).zae()) {
                this.zak = null;
            }
            this.zao = null;
        }
    }

    private final void zah() {
        ArrayList arrayList = this.zau;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.zau.clear();
    }

    /* access modifiers changed from: private */
    public final Set<Scope> zai() {
        if (this.zar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.zar.getRequiredScopes());
        Map<Api<?>, ClientSettings.zaa> zaa2 = this.zar.zaa();
        for (Api next : zaa2.keySet()) {
            if (!this.zaa.zab.containsKey(next.zac())) {
                hashSet.addAll(zaa2.get(next).zaa);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    @GuardedBy("mLock")
    public final boolean zab(int i) {
        if (this.zag == i) {
            return true;
        }
        Log.w("GACConnecting", this.zaa.zad.zac());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i2 = this.zah;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GACConnecting", sb2.toString());
        String zac2 = zac(this.zag);
        String zac3 = zac(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(zac2).length() + 70 + String.valueOf(zac3).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(zac2);
        sb3.append(" but received callback for step ");
        sb3.append(zac3);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        zab(new ConnectionResult(8, (PendingIntent) null));
        return false;
    }
}
