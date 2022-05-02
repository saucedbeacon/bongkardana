package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zai;
import com.google.android.gms.common.internal.zaj;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaar extends GoogleApiClient implements zabn {
    @VisibleForTesting
    final Queue<BaseImplementation.ApiMethodImpl<?, ?>> zaa = new LinkedList();
    final Map<Api.AnyClientKey<?>, Api.Client> zab;
    Set<Scope> zac;
    @Nullable
    Set<zaci> zad;
    final zacn zae;
    private final Lock zaf;
    private final zaj zag;
    @Nullable
    private zabm zah = null;
    private final int zai;
    /* access modifiers changed from: private */
    public final Context zaj;
    private final Looper zak;
    private volatile boolean zal;
    private long zam;
    private long zan;
    private final zaau zao;
    private final GoogleApiAvailability zap;
    @Nullable
    @VisibleForTesting
    private zabl zaq;
    private final ClientSettings zar;
    private final Map<Api<?>, Boolean> zas;
    private final Api.AbstractClientBuilder<? extends zad, SignInOptions> zat;
    private final ListenerHolders zau;
    private final ArrayList<zaq> zav;
    private Integer zaw;
    private final zai zax;

    public zaar(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends zad, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zaq> arrayList) {
        Looper looper2 = looper;
        int i3 = i;
        this.zam = ClientLibraryUtils.isPackageSide() ? 10000 : 120000;
        this.zan = 5000;
        this.zac = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zad = null;
        zaaq zaaq = new zaaq(this);
        this.zax = zaaq;
        this.zaj = context;
        this.zaf = lock;
        this.zag = new zaj(looper, zaaq);
        this.zak = looper2;
        this.zao = new zaau(this, looper);
        this.zap = googleApiAvailability;
        this.zai = i3;
        if (i3 >= 0) {
            this.zaw = Integer.valueOf(i2);
        }
        this.zas = map;
        this.zab = map2;
        this.zav = arrayList;
        this.zae = new zacn();
        for (GoogleApiClient.ConnectionCallbacks zaa2 : list) {
            this.zag.zaa(zaa2);
        }
        for (GoogleApiClient.OnConnectionFailedListener zaa3 : list2) {
            this.zag.zaa(zaa3);
        }
        this.zar = clientSettings;
        this.zat = abstractClientBuilder;
    }

    private static String zab(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean containsKey = this.zab.containsKey(t.getClientKey());
        String zad2 = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(zad2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad2);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaf.lock();
        try {
            if (this.zah == null) {
                this.zaa.add(t);
                return t;
            }
            T zaa2 = this.zah.zaa(t);
            this.zaf.unlock();
            return zaa2;
        } finally {
            this.zaf.unlock();
        }
    }

    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean containsKey = this.zab.containsKey(t.getClientKey());
        String zad2 = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(zad2).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(zad2);
        sb.append(" required for this call.");
        Preconditions.checkArgument(containsKey, sb.toString());
        this.zaf.lock();
        try {
            zabm zabm = this.zah;
            if (zabm == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.zal) {
                this.zaa.add(t);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl remove = this.zaa.remove();
                    this.zae.zaa(remove);
                    remove.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                return t;
            } else {
                T zab2 = zabm.zab(t);
                this.zaf.unlock();
                return zab2;
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.zaf.lock();
        try {
            return this.zau.zaa(l, this.zak, "NO_TYPE");
        } finally {
            this.zaf.unlock();
        }
    }

    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (Api.Client) this.zab.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    public final boolean hasApi(@NonNull Api<?> api) {
        return this.zab.containsKey(api.zac());
    }

    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        if (isConnected() && (client = this.zab.get(api.zac())) != null && client.isConnected()) {
            return true;
        }
        return false;
    }

    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        this.zaf.lock();
        try {
            if (!isConnected()) {
                if (!this.zal) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.zab.containsKey(api.zac())) {
                ConnectionResult zaa2 = ((zabm) Preconditions.checkNotNull(this.zah)).zaa(api);
                if (zaa2 != null) {
                    this.zaf.unlock();
                    return zaa2;
                } else if (this.zal) {
                    return ConnectionResult.RESULT_SUCCESS;
                } else {
                    Log.w("GoogleApiClientImpl", zac());
                    Log.wtf("GoogleApiClientImpl", String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                    ConnectionResult connectionResult = new ConnectionResult(8, (PendingIntent) null);
                    this.zaf.unlock();
                    return connectionResult;
                }
            } else {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final void connect() {
        this.zaf.lock();
        try {
            boolean z = false;
            if (this.zai >= 0) {
                if (this.zaw != null) {
                    z = true;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zaw == null) {
                this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
            } else if (this.zaw.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            connect(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
        } finally {
            this.zaf.unlock();
        }
    }

    public final void connect(int i) {
        this.zaf.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            zaa(i);
            zad();
        } finally {
            this.zaf.unlock();
        }
    }

    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaf.lock();
        try {
            if (this.zai >= 0) {
                if (this.zaw == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.zaw == null) {
                this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
            } else if (this.zaw.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zaa(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zag.zab();
            return ((zabm) Preconditions.checkNotNull(this.zah)).zab();
        } finally {
            this.zaf.unlock();
        }
    }

    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaf.lock();
        try {
            if (this.zaw == null) {
                this.zaw = Integer.valueOf(zaa((Iterable<Api.Client>) this.zab.values(), false));
            } else if (this.zaw.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zaa(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zag.zab();
            return ((zabm) Preconditions.checkNotNull(this.zah)).zaa(j, timeUnit);
        } finally {
            this.zaf.unlock();
        }
    }

    public final void disconnect() {
        this.zaf.lock();
        try {
            this.zae.zaa();
            if (this.zah != null) {
                this.zah.zac();
            }
            this.zau.zaa();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zaa((zaco) null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zah != null) {
                zab();
                this.zag.zaa();
                this.zaf.unlock();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    public final void reconnect() {
        disconnect();
        connect();
    }

    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        Preconditions.checkState(num == null || num.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult((GoogleApiClient) this);
        if (this.zab.containsKey(Common.CLIENT_KEY)) {
            zaa(this, statusPendingResult, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            GoogleApiClient build = new GoogleApiClient.Builder(this.zaj).addApi(Common.API).addConnectionCallbacks(new zaat(this, atomicReference, statusPendingResult)).addOnConnectionFailedListener(new zaas(this, statusPendingResult)).setHandler(this.zao).build();
            atomicReference.set(build);
            build.connect();
        }
        return statusPendingResult;
    }

    /* access modifiers changed from: private */
    public final void zaa(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zaav(this, statusPendingResult, z, googleApiClient));
    }

    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zai >= 0) {
            zai.zaa(lifecycleActivity).zaa(this.zai);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final boolean isConnected() {
        zabm zabm = this.zah;
        return zabm != null && zabm.zad();
    }

    public final boolean isConnecting() {
        zabm zabm = this.zah;
        return zabm != null && zabm.zae();
    }

    private final void zaa(int i) {
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String zab2 = zab(i);
            String zab3 = zab(this.zaw.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(zab2).length() + 51 + String.valueOf(zab3).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(zab2);
            sb.append(". Mode was already set to ");
            sb.append(zab3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.zah == null) {
            boolean z = false;
            boolean z2 = false;
            for (Api.Client next : this.zab.values()) {
                if (next.requiresSignIn()) {
                    z = true;
                }
                if (next.providesSignIn()) {
                    z2 = true;
                }
            }
            int intValue = this.zaw.intValue();
            if (intValue != 1) {
                if (intValue == 2 && z) {
                    this.zah = zas.zaa(this.zaj, this, this.zaf, this.zak, this.zap, this.zab, this.zar, this.zas, this.zat, this.zav);
                    return;
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            this.zah = new zaaz(this.zaj, this, this.zaf, this.zak, this.zap, this.zab, this.zar, this.zas, this.zat, this.zav, this);
        }
    }

    @GuardedBy("mLock")
    private final void zad() {
        this.zag.zab();
        ((zabm) Preconditions.checkNotNull(this.zah)).zaa();
    }

    /* access modifiers changed from: private */
    public final void zae() {
        this.zaf.lock();
        try {
            if (this.zal) {
                zad();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    /* access modifiers changed from: private */
    public final void zaf() {
        this.zaf.lock();
        try {
            if (zab()) {
                zad();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    @GuardedBy("mLock")
    public final boolean zab() {
        if (!this.zal) {
            return false;
        }
        this.zal = false;
        this.zao.removeMessages(2);
        this.zao.removeMessages(1);
        zabl zabl = this.zaq;
        if (zabl != null) {
            zabl.zaa();
            this.zaq = null;
        }
        return true;
    }

    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zag.zaa(connectionCallbacks);
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zag.zab(connectionCallbacks);
    }

    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zag.zac(connectionCallbacks);
    }

    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zag.zaa(onConnectionFailedListener);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zag.zab(onConnectionFailedListener);
    }

    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zag.zac(onConnectionFailedListener);
    }

    @GuardedBy("mLock")
    public final void zaa(@Nullable Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute(this.zaa.remove());
        }
        this.zag.zaa(bundle);
    }

    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zap.isPlayServicesPossiblyUpdating(this.zaj, connectionResult.getErrorCode())) {
            zab();
        }
        if (!this.zal) {
            this.zag.zaa(connectionResult);
            this.zag.zaa();
        }
    }

    @GuardedBy("mLock")
    public final void zaa(int i, boolean z) {
        if (i == 1 && !z && !this.zal) {
            this.zal = true;
            if (this.zaq == null && !ClientLibraryUtils.isPackageSide()) {
                try {
                    this.zaq = this.zap.zaa(this.zaj.getApplicationContext(), (zabk) new zaax(this));
                } catch (SecurityException unused) {
                }
            }
            zaau zaau = this.zao;
            zaau.sendMessageDelayed(zaau.obtainMessage(1), this.zam);
            zaau zaau2 = this.zao;
            zaau2.sendMessageDelayed(zaau2.obtainMessage(2), this.zan);
        }
        for (BasePendingResult forceFailureUnlessReady : (BasePendingResult[]) this.zae.zab.toArray(new BasePendingResult[0])) {
            forceFailureUnlessReady.forceFailureUnlessReady(zacn.zaa);
        }
        this.zag.zaa(i);
        this.zag.zaa();
        if (i == 2) {
            zad();
        }
    }

    public final Context getContext() {
        return this.zaj;
    }

    public final Looper getLooper() {
        return this.zak;
    }

    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zabm zabm = this.zah;
        return zabm != null && zabm.zaa(signInConnectionListener);
    }

    public final void maybeSignOut() {
        zabm zabm = this.zah;
        if (zabm != null) {
            zabm.zag();
        }
    }

    public final void zaa(zaci zaci) {
        this.zaf.lock();
        try {
            if (this.zad == null) {
                this.zad = new HashSet();
            }
            this.zad.add(zaci);
        } finally {
            this.zaf.unlock();
        }
    }

    public final void zab(zaci zaci) {
        this.zaf.lock();
        try {
            if (this.zad == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (!this.zad.remove(zaci)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            } else if (!zag() && this.zah != null) {
                this.zah.zaf();
            }
        } finally {
            this.zaf.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    private final boolean zag() {
        this.zaf.lock();
        try {
            if (this.zad == null) {
                this.zaf.unlock();
                return false;
            }
            boolean z = !this.zad.isEmpty();
            this.zaf.unlock();
            return z;
        } catch (Throwable th) {
            this.zaf.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final String zac() {
        StringWriter stringWriter = new StringWriter();
        dump("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.zaj);
        printWriter.append(str).append("mResuming=").print(this.zal);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zae.zab.size());
        zabm zabm = this.zah;
        if (zabm != null) {
            zabm.zaa(str, fileDescriptor, printWriter, strArr);
        }
    }

    public static int zaa(Iterable<Api.Client> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (Api.Client next : iterable) {
            if (next.requiresSignIn()) {
                z2 = true;
            }
            if (next.providesSignIn()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
