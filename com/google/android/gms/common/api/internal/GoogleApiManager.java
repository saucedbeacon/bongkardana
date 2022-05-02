package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import id.dana.data.constant.BranchLinkConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import o.MediaSessionCompat$Token;
import o.PlaybackStateCompat;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

@KeepForSdk
public class GoogleApiManager implements Handler.Callback {
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */
    public static final Status zab = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */
    public static final Object zaf = new Object();
    @GuardedBy("lock")
    @Nullable
    private static GoogleApiManager zag;
    /* access modifiers changed from: private */
    public long zac = 5000;
    /* access modifiers changed from: private */
    public long zad = 120000;
    /* access modifiers changed from: private */
    public long zae = 10000;
    /* access modifiers changed from: private */
    public final Context zah;
    /* access modifiers changed from: private */
    public final GoogleApiAvailability zai;
    /* access modifiers changed from: private */
    public final zal zaj;
    private final AtomicInteger zak = new AtomicInteger(1);
    private final AtomicInteger zal = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public final Map<ApiKey<?>, zaa<?>> zam = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    @Nullable
    public zay zan = null;
    /* access modifiers changed from: private */
    @GuardedBy("lock")
    public final Set<ApiKey<?>> zao = new MediaSessionCompat$Token();
    private final Set<ApiKey<?>> zap = new MediaSessionCompat$Token();
    /* access modifiers changed from: private */
    @NotOnlyInitialized
    public final Handler zaq;
    /* access modifiers changed from: private */
    public volatile boolean zar = true;

    public static GoogleApiManager zaa(Context context) {
        GoogleApiManager googleApiManager;
        synchronized (zaf) {
            if (zag == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                zag = new GoogleApiManager(context.getApplicationContext(), handlerThread.getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = zag;
        }
        return googleApiManager;
    }

    static class zac {
        /* access modifiers changed from: private */
        public final ApiKey<?> zaa;
        /* access modifiers changed from: private */
        public final Feature zab;

        private zac(ApiKey<?> apiKey, Feature feature) {
            this.zaa = apiKey;
            this.zab = feature;
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj != null && (obj instanceof zac)) {
                zac zac = (zac) obj;
                if (!Objects.equal(this.zaa, zac.zaa) || !Objects.equal(this.zab, zac.zab)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(this.zaa, this.zab);
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaa).add(BranchLinkConstant.PathTarget.FEATURE, this.zab).toString();
        }

        /* synthetic */ zac(ApiKey apiKey, Feature feature, zabc zabc) {
            this(apiKey, feature);
        }
    }

    class zab implements zacd, BaseGmsClient.ConnectionProgressReportCallbacks {
        /* access modifiers changed from: private */
        public final Api.Client zab;
        /* access modifiers changed from: private */
        public final ApiKey<?> zac;
        @Nullable
        private IAccountAccessor zad = null;
        @Nullable
        private Set<Scope> zae = null;
        /* access modifiers changed from: private */
        public boolean zaf = false;

        public zab(Api.Client client, ApiKey<?> apiKey) {
            this.zab = client;
            this.zac = apiKey;
        }

        public final void onReportServiceBinding(@NonNull ConnectionResult connectionResult) {
            GoogleApiManager.this.zaq.post(new zabj(this, connectionResult));
        }

        @WorkerThread
        public final void zaa(ConnectionResult connectionResult) {
            zaa zaa2 = (zaa) GoogleApiManager.this.zam.get(this.zac);
            if (zaa2 != null) {
                zaa2.zaa(connectionResult);
            }
        }

        @WorkerThread
        public final void zaa(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set<Scope> set) {
            if (iAccountAccessor == null || set == null) {
                zaa(new ConnectionResult(4));
                return;
            }
            this.zad = iAccountAccessor;
            this.zae = set;
            zaa();
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zaa() {
            IAccountAccessor iAccountAccessor;
            if (this.zaf && (iAccountAccessor = this.zad) != null) {
                this.zab.getRemoteService(iAccountAccessor, this.zae);
            }
        }
    }

    public static GoogleApiManager zaa() {
        GoogleApiManager googleApiManager;
        synchronized (zaf) {
            Preconditions.checkNotNull(zag, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = zag;
        }
        return googleApiManager;
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (zaf) {
            if (zag != null) {
                GoogleApiManager googleApiManager = zag;
                googleApiManager.zal.incrementAndGet();
                googleApiManager.zaq.sendMessageAtFrontOfQueue(googleApiManager.zaq.obtainMessage(10));
            }
        }
    }

    public class zaa<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zap {
        private final Queue<zab> zab = new LinkedList();
        /* access modifiers changed from: private */
        @NotOnlyInitialized
        public final Api.Client zac;
        /* access modifiers changed from: private */
        public final Api.AnyClient zad;
        private final ApiKey<O> zae;
        private final zav zaf;
        private final Set<zaj> zag = new HashSet();
        private final Map<ListenerHolder.ListenerKey<?>, zabs> zah = new HashMap();
        private final int zai;
        @Nullable
        private final zacc zaj;
        private boolean zak;
        private final List<zac> zal = new ArrayList();
        @Nullable
        private ConnectionResult zam = null;

        @WorkerThread
        public zaa(GoogleApi<O> googleApi) {
            Api.Client zaa2 = googleApi.zaa(GoogleApiManager.this.zaq.getLooper(), (zaa<O>) this);
            this.zac = zaa2;
            if (zaa2 instanceof zaz) {
                this.zad = zaz.zaa();
            } else {
                this.zad = zaa2;
            }
            this.zae = googleApi.getApiKey();
            this.zaf = new zav();
            this.zai = googleApi.zaa();
            if (this.zac.requiresSignIn()) {
                this.zaj = googleApi.zaa(GoogleApiManager.this.zah, GoogleApiManager.this.zaq);
            } else {
                this.zaj = null;
            }
        }

        public final void onConnected(@Nullable Bundle bundle) {
            if (Looper.myLooper() == GoogleApiManager.this.zaq.getLooper()) {
                zam();
            } else {
                GoogleApiManager.this.zaq.post(new zabd(this));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zam() {
            zad();
            zac(ConnectionResult.RESULT_SUCCESS);
            zao();
            Iterator<zabs> it = this.zah.values().iterator();
            while (it.hasNext()) {
                zabs next = it.next();
                if (zaa(next.zaa.getRequiredFeatures()) != null) {
                    it.remove();
                } else {
                    try {
                        next.zaa.registerListener(this.zad, new TaskCompletionSource());
                    } catch (DeadObjectException unused) {
                        onConnectionSuspended(3);
                        this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            zan();
            zap();
        }

        public final void onConnectionSuspended(int i) {
            if (Looper.myLooper() == GoogleApiManager.this.zaq.getLooper()) {
                zaa(i);
            } else {
                GoogleApiManager.this.zaq.post(new zabf(this, i));
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zaa(int i) {
            zad();
            this.zak = true;
            this.zaf.zaa(i, this.zac.getLastDisconnectMessage());
            GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 9, this.zae), GoogleApiManager.this.zac);
            GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 11, this.zae), GoogleApiManager.this.zad);
            GoogleApiManager.this.zaj.zaa();
            for (zabs zabs : this.zah.values()) {
                zabs.zac.run();
            }
        }

        @WorkerThread
        public final void zaa(@NonNull ConnectionResult connectionResult) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            Api.Client client = this.zac;
            String name = this.zad.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            client.disconnect(sb.toString());
            onConnectionFailed(connectionResult);
        }

        @WorkerThread
        private final boolean zab(@NonNull ConnectionResult connectionResult) {
            synchronized (GoogleApiManager.zaf) {
                if (GoogleApiManager.this.zan == null || !GoogleApiManager.this.zao.contains(this.zae)) {
                    return false;
                }
                GoogleApiManager.this.zan.zab(connectionResult, this.zai);
                return true;
            }
        }

        public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
            if (Looper.myLooper() == GoogleApiManager.this.zaq.getLooper()) {
                onConnectionFailed(connectionResult);
            } else {
                GoogleApiManager.this.zaq.post(new zabe(this, connectionResult));
            }
        }

        @WorkerThread
        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            zaa(connectionResult, (Exception) null);
        }

        @WorkerThread
        private final void zaa(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            zacc zacc = this.zaj;
            if (zacc != null) {
                zacc.zaa();
            }
            zad();
            GoogleApiManager.this.zaj.zaa();
            zac(connectionResult);
            if (connectionResult.getErrorCode() == 4) {
                zaa(GoogleApiManager.zab);
            } else if (this.zab.isEmpty()) {
                this.zam = connectionResult;
            } else if (exc != null) {
                Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
                zaa((Status) null, exc, false);
            } else if (!GoogleApiManager.this.zar) {
                zaa(zad(connectionResult));
            } else {
                zaa(zad(connectionResult), (Exception) null, true);
                if (!this.zab.isEmpty() && !zab(connectionResult) && !GoogleApiManager.this.zaa(connectionResult, this.zai)) {
                    if (connectionResult.getErrorCode() == 18) {
                        this.zak = true;
                    }
                    if (this.zak) {
                        GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 9, this.zae), GoogleApiManager.this.zac);
                    } else {
                        zaa(zad(connectionResult));
                    }
                }
            }
        }

        @WorkerThread
        private final void zan() {
            ArrayList arrayList = new ArrayList(this.zab);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                zab zab2 = (zab) obj;
                if (!this.zac.isConnected()) {
                    return;
                }
                if (zab(zab2)) {
                    this.zab.remove(zab2);
                }
            }
        }

        @WorkerThread
        public final void zaa(zab zab2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            if (!this.zac.isConnected()) {
                this.zab.add(zab2);
                ConnectionResult connectionResult = this.zam;
                if (connectionResult == null || !connectionResult.hasResolution()) {
                    zai();
                } else {
                    onConnectionFailed(this.zam);
                }
            } else if (zab(zab2)) {
                zap();
            } else {
                this.zab.add(zab2);
            }
        }

        @WorkerThread
        public final void zaa() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            zaa(GoogleApiManager.zaa);
            this.zaf.zab();
            for (ListenerHolder.ListenerKey zag2 : (ListenerHolder.ListenerKey[]) this.zah.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
                zaa((zab) new zag(zag2, new TaskCompletionSource()));
            }
            zac(new ConnectionResult(4));
            if (this.zac.isConnected()) {
                this.zac.onUserSignOut(new zabh(this));
            }
        }

        public final Api.Client zab() {
            return this.zac;
        }

        public final Map<ListenerHolder.ListenerKey<?>, zabs> zac() {
            return this.zah;
        }

        @WorkerThread
        public final void zad() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            this.zam = null;
        }

        @WorkerThread
        @Nullable
        public final ConnectionResult zae() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            return this.zam;
        }

        @WorkerThread
        private final boolean zab(zab zab2) {
            if (!(zab2 instanceof zad)) {
                zac(zab2);
                return true;
            }
            zad zad2 = (zad) zab2;
            Feature zaa2 = zaa(zad2.zac(this));
            if (zaa2 == null) {
                zac(zab2);
                return true;
            }
            zaa2.getName();
            zaa2.getVersion();
            if (!GoogleApiManager.this.zar || !zad2.zad(this)) {
                zad2.zaa((Exception) new UnsupportedApiCallException(zaa2));
                return true;
            }
            zac zac2 = new zac(this.zae, zaa2, (zabc) null);
            int indexOf = this.zal.indexOf(zac2);
            if (indexOf >= 0) {
                zac zac3 = this.zal.get(indexOf);
                GoogleApiManager.this.zaq.removeMessages(15, zac3);
                GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 15, zac3), GoogleApiManager.this.zac);
                return false;
            }
            this.zal.add(zac2);
            GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 15, zac2), GoogleApiManager.this.zac);
            GoogleApiManager.this.zaq.sendMessageDelayed(Message.obtain(GoogleApiManager.this.zaq, 16, zac2), GoogleApiManager.this.zad);
            ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
            if (zab(connectionResult)) {
                return false;
            }
            GoogleApiManager.this.zaa(connectionResult, this.zai);
            return false;
        }

        @WorkerThread
        private final void zac(zab zab2) {
            zab2.zaa(this.zaf, zak());
            try {
                zab2.zaa((zaa<?>) this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            } catch (Throwable th) {
                throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.zad.getClass().getName()}), th);
            }
        }

        @WorkerThread
        private final void zaa(@Nullable Status status, @Nullable Exception exc, boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            boolean z2 = true;
            boolean z3 = status == null;
            if (exc != null) {
                z2 = false;
            }
            if (z3 != z2) {
                Iterator it = this.zab.iterator();
                while (it.hasNext()) {
                    zab zab2 = (zab) it.next();
                    if (!z || zab2.zaa == 2) {
                        if (status != null) {
                            zab2.zaa(status);
                        } else {
                            zab2.zaa(exc);
                        }
                        it.remove();
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Status XOR exception should be null");
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zaa(Status status) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            zaa(status, (Exception) null, false);
        }

        @WorkerThread
        public final void zaf() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            if (this.zak) {
                zai();
            }
        }

        @WorkerThread
        private final void zao() {
            if (this.zak) {
                GoogleApiManager.this.zaq.removeMessages(11, this.zae);
                GoogleApiManager.this.zaq.removeMessages(9, this.zae);
                this.zak = false;
            }
        }

        @WorkerThread
        public final void zag() {
            Status status;
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            if (this.zak) {
                zao();
                if (GoogleApiManager.this.zai.isGooglePlayServicesAvailable(GoogleApiManager.this.zah) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                zaa(status);
                this.zac.disconnect("Timing out connection while resuming.");
            }
        }

        private final void zap() {
            GoogleApiManager.this.zaq.removeMessages(12, this.zae);
            GoogleApiManager.this.zaq.sendMessageDelayed(GoogleApiManager.this.zaq.obtainMessage(12, this.zae), GoogleApiManager.this.zae);
        }

        @WorkerThread
        public final boolean zah() {
            return zaa(true);
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final boolean zaa(boolean z) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            if (!this.zac.isConnected() || this.zah.size() != 0) {
                return false;
            }
            if (this.zaf.zaa()) {
                if (z) {
                    zap();
                }
                return false;
            }
            this.zac.disconnect("Timing out service connection.");
            return true;
        }

        @WorkerThread
        public final void zai() {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            if (!this.zac.isConnected() && !this.zac.isConnecting()) {
                try {
                    int zaa2 = GoogleApiManager.this.zaj.zaa(GoogleApiManager.this.zah, this.zac);
                    if (zaa2 != 0) {
                        onConnectionFailed(new ConnectionResult(zaa2, (PendingIntent) null));
                        return;
                    }
                    zab zab2 = new zab(this.zac, this.zae);
                    if (this.zac.requiresSignIn()) {
                        ((zacc) Preconditions.checkNotNull(this.zaj)).zaa((zacd) zab2);
                    }
                    try {
                        this.zac.connect(zab2);
                    } catch (SecurityException e) {
                        zaa(new ConnectionResult(10), (Exception) e);
                    }
                } catch (IllegalStateException e2) {
                    zaa(new ConnectionResult(10), (Exception) e2);
                }
            }
        }

        @WorkerThread
        public final void zaa(zaj zaj2) {
            Preconditions.checkHandlerThread(GoogleApiManager.this.zaq);
            this.zag.add(zaj2);
        }

        @WorkerThread
        private final void zac(ConnectionResult connectionResult) {
            for (zaj next : this.zag) {
                String str = null;
                if (Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS)) {
                    str = this.zac.getEndpointPackageName();
                }
                next.zaa(this.zae, connectionResult, str);
            }
            this.zag.clear();
        }

        /* access modifiers changed from: package-private */
        public final boolean zaj() {
            return this.zac.isConnected();
        }

        public final boolean zak() {
            return this.zac.requiresSignIn();
        }

        public final int zal() {
            return this.zai;
        }

        @WorkerThread
        @Nullable
        private final Feature zaa(@Nullable Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] availableFeatures = this.zac.getAvailableFeatures();
                if (availableFeatures == null) {
                    availableFeatures = new Feature[0];
                }
                PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(availableFeatures.length);
                for (Feature feature : availableFeatures) {
                    playbackStateCompat.put(feature.getName(), Long.valueOf(feature.getVersion()));
                }
                for (Feature feature2 : featureArr) {
                    Long l = (Long) playbackStateCompat.get(feature2.getName());
                    if (l == null || l.longValue() < feature2.getVersion()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zaa(zac zac2) {
            if (!this.zal.contains(zac2) || this.zak) {
                return;
            }
            if (!this.zac.isConnected()) {
                zai();
            } else {
                zan();
            }
        }

        /* access modifiers changed from: private */
        @WorkerThread
        public final void zab(zac zac2) {
            Feature[] zac3;
            if (this.zal.remove(zac2)) {
                GoogleApiManager.this.zaq.removeMessages(15, zac2);
                GoogleApiManager.this.zaq.removeMessages(16, zac2);
                Feature zab2 = zac2.zab;
                ArrayList arrayList = new ArrayList(this.zab.size());
                for (zab zab3 : this.zab) {
                    if ((zab3 instanceof zad) && (zac3 = ((zad) zab3).zac(this)) != null && ArrayUtils.contains((T[]) zac3, zab2)) {
                        arrayList.add(zab3);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    zab zab4 = (zab) obj;
                    this.zab.remove(zab4);
                    zab4.zaa((Exception) new UnsupportedApiCallException(zab2));
                }
            }
        }

        private final Status zad(ConnectionResult connectionResult) {
            String apiName = this.zae.getApiName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(apiName).length() + 63 + String.valueOf(valueOf).length());
            sb.append("API: ");
            sb.append(apiName);
            sb.append(" is not available on this device. Connection failed with: ");
            sb.append(valueOf);
            return new Status(17, sb.toString());
        }
    }

    @KeepForSdk
    private GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.zah = context;
        this.zaq = new zap(looper, this);
        this.zai = googleApiAvailability;
        this.zaj = new zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.zar = false;
        }
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final int zab() {
        return this.zak.getAndIncrement();
    }

    public final void zaa(GoogleApi<?> googleApi) {
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(7, googleApi));
    }

    @WorkerThread
    private final zaa<?> zac(GoogleApi<?> googleApi) {
        ApiKey<?> apiKey = googleApi.getApiKey();
        zaa<?> zaa2 = this.zam.get(apiKey);
        if (zaa2 == null) {
            zaa2 = new zaa<>(googleApi);
            this.zam.put(apiKey, zaa2);
        }
        if (zaa2.zak()) {
            this.zap.add(apiKey);
        }
        zaa2.zai();
        return zaa2;
    }

    public final void zaa(@NonNull zay zay) {
        synchronized (zaf) {
            if (this.zan != zay) {
                this.zan = zay;
                this.zao.clear();
            }
            this.zao.addAll(zay.zac());
        }
    }

    /* access modifiers changed from: package-private */
    public final void zab(@NonNull zay zay) {
        synchronized (zaf) {
            if (this.zan == zay) {
                this.zan = null;
                this.zao.clear();
            }
        }
    }

    public final Task<Map<ApiKey<?>, String>> zaa(Iterable<? extends HasApiKey<?>> iterable) {
        zaj zaj2 = new zaj(iterable);
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(2, zaj2));
        return zaj2.zab();
    }

    public final void zac() {
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final Task<Boolean> zab(GoogleApi<?> googleApi) {
        zaz zaz = new zaz(googleApi.getApiKey());
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(14, zaz));
        return zaz.zab().getTask();
    }

    public final <O extends Api.ApiOptions> void zaa(GoogleApi<O> googleApi, int i, BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zaf zaf2 = new zaf(i, apiMethodImpl);
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(4, new zabr(zaf2, this.zal.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zaa(GoogleApi<O> googleApi, int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        zah zah2 = new zah(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(4, new zabr(zah2, this.zal.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions> Task<Void> zaa(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zae zae2 = new zae(new zabs(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(8, new zabr(zae2, this.zal.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> Task<Boolean> zaa(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey<?> listenerKey) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zag zag2 = new zag(listenerKey, taskCompletionSource);
        Handler handler = this.zaq;
        handler.sendMessage(handler.obtainMessage(13, new zabr(zag2, this.zal.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @WorkerThread
    public boolean handleMessage(Message message) {
        long j = 300000;
        zaa zaa2 = null;
        switch (message.what) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.zae = j;
                this.zaq.removeMessages(12);
                for (ApiKey<?> obtainMessage : this.zam.keySet()) {
                    Handler handler = this.zaq;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.zae);
                }
                break;
            case 2:
                zaj zaj2 = (zaj) message.obj;
                Iterator<ApiKey<?>> it = zaj2.zaa().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        ApiKey next = it.next();
                        zaa zaa3 = this.zam.get(next);
                        if (zaa3 == null) {
                            zaj2.zaa(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zaa3.zaj()) {
                            zaj2.zaa(next, ConnectionResult.RESULT_SUCCESS, zaa3.zab().getEndpointPackageName());
                        } else {
                            ConnectionResult zae2 = zaa3.zae();
                            if (zae2 != null) {
                                zaj2.zaa(next, zae2, (String) null);
                            } else {
                                zaa3.zaa(zaj2);
                                zaa3.zai();
                            }
                        }
                    }
                }
            case 3:
                for (zaa next2 : this.zam.values()) {
                    next2.zad();
                    next2.zai();
                }
                break;
            case 4:
            case 8:
            case 13:
                zabr zabr = (zabr) message.obj;
                zaa<?> zaa4 = this.zam.get(zabr.zac.getApiKey());
                if (zaa4 == null) {
                    zaa4 = zac(zabr.zac);
                }
                if (zaa4.zak() && this.zal.get() != zabr.zab) {
                    zabr.zaa.zaa(zaa);
                    zaa4.zaa();
                    break;
                } else {
                    zaa4.zaa(zabr.zaa);
                    break;
                }
                break;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<zaa<?>> it2 = this.zam.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        zaa next3 = it2.next();
                        if (next3.zal() == i) {
                            zaa2 = next3;
                        }
                    }
                }
                if (zaa2 != null) {
                    String errorString = this.zai.getErrorString(connectionResult.getErrorCode());
                    String errorMessage = connectionResult.getErrorMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                    sb.append("Error resolution was canceled by the user, original error message: ");
                    sb.append(errorString);
                    sb.append(": ");
                    sb.append(errorMessage);
                    zaa2.zaa(new Status(17, sb.toString()));
                    break;
                }
                break;
            case 6:
                if (this.zah.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.zah.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new zabc(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.zae = 300000;
                        break;
                    }
                }
                break;
            case 7:
                zac((GoogleApi<?>) (GoogleApi) message.obj);
                break;
            case 9:
                if (this.zam.containsKey(message.obj)) {
                    this.zam.get(message.obj).zaf();
                    break;
                }
                break;
            case 10:
                for (ApiKey<?> remove : this.zap) {
                    zaa remove2 = this.zam.remove(remove);
                    if (remove2 != null) {
                        remove2.zaa();
                    }
                }
                this.zap.clear();
                break;
            case 11:
                if (this.zam.containsKey(message.obj)) {
                    this.zam.get(message.obj).zag();
                    break;
                }
                break;
            case 12:
                if (this.zam.containsKey(message.obj)) {
                    this.zam.get(message.obj).zah();
                    break;
                }
                break;
            case 14:
                zaz zaz = (zaz) message.obj;
                ApiKey<?> zaa5 = zaz.zaa();
                if (this.zam.containsKey(zaa5)) {
                    zaz.zab().setResult(Boolean.valueOf(this.zam.get(zaa5).zaa(false)));
                    break;
                } else {
                    zaz.zab().setResult(Boolean.FALSE);
                    break;
                }
            case 15:
                zac zac2 = (zac) message.obj;
                if (this.zam.containsKey(zac2.zaa)) {
                    this.zam.get(zac2.zaa).zaa(zac2);
                    break;
                }
                break;
            case 16:
                zac zac3 = (zac) message.obj;
                if (this.zam.containsKey(zac3.zaa)) {
                    this.zam.get(zac3.zaa).zab(zac3);
                    break;
                }
                break;
            default:
                int i2 = message.what;
                return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean zaa(ConnectionResult connectionResult, int i) {
        return this.zai.zaa(this.zah, connectionResult, i);
    }

    public final void zab(ConnectionResult connectionResult, int i) {
        if (!zaa(connectionResult, i)) {
            Handler handler = this.zaq;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
