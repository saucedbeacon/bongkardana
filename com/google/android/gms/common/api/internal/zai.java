package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zai extends zal {
    private final SparseArray<zaa> zad = new SparseArray<>();

    public static zai zaa(LifecycleActivity lifecycleActivity) {
        LifecycleFragment fragment = getFragment(lifecycleActivity);
        zai zai = (zai) fragment.getCallbackOrNull("AutoManageHelper", zai.class);
        if (zai != null) {
            return zai;
        }
        return new zai(fragment);
    }

    class zaa implements GoogleApiClient.OnConnectionFailedListener {
        public final int zaa;
        public final GoogleApiClient zab;
        @Nullable
        public final GoogleApiClient.OnConnectionFailedListener zac;

        public zaa(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
            this.zaa = i;
            this.zab = googleApiClient;
            this.zac = onConnectionFailedListener;
        }

        public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("beginFailureResolution for ");
            sb.append(valueOf);
            Log.d("AutoManageHelper", sb.toString());
            zai.this.zab(connectionResult, this.zaa);
        }
    }

    private zai(LifecycleFragment lifecycleFragment) {
        super(lifecycleFragment);
        this.mLifecycleFragment.addCallback("AutoManageHelper", this);
    }

    public final void zaa(int i, GoogleApiClient googleApiClient, @Nullable GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Preconditions.checkNotNull(googleApiClient, "GoogleApiClient instance cannot be null");
        boolean z = this.zad.indexOfKey(i) < 0;
        StringBuilder sb = new StringBuilder(54);
        sb.append("Already managing a GoogleApiClient with id ");
        sb.append(i);
        Preconditions.checkState(z, sb.toString());
        zak zak = (zak) this.zab.get();
        boolean z2 = this.zaa;
        String valueOf = String.valueOf(zak);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb2.append("starting AutoManage for client ");
        sb2.append(i);
        sb2.append(" ");
        sb2.append(z2);
        sb2.append(" ");
        sb2.append(valueOf);
        Log.d("AutoManageHelper", sb2.toString());
        zaa zaa2 = new zaa(i, googleApiClient, onConnectionFailedListener);
        googleApiClient.registerConnectionFailedListener(zaa2);
        this.zad.put(i, zaa2);
        if (this.zaa && zak == null) {
            String valueOf2 = String.valueOf(googleApiClient);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 11);
            sb3.append("connecting ");
            sb3.append(valueOf2);
            Log.d("AutoManageHelper", sb3.toString());
            googleApiClient.connect();
        }
    }

    public final void zaa(int i) {
        zaa zaa2 = this.zad.get(i);
        this.zad.remove(i);
        if (zaa2 != null) {
            zaa2.zab.unregisterConnectionFailedListener(zaa2);
            zaa2.zab.disconnect();
        }
    }

    public void onStart() {
        super.onStart();
        boolean z = this.zaa;
        String valueOf = String.valueOf(this.zad);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("onStart ");
        sb.append(z);
        sb.append(" ");
        sb.append(valueOf);
        Log.d("AutoManageHelper", sb.toString());
        if (this.zab.get() == null) {
            for (int i = 0; i < this.zad.size(); i++) {
                zaa zab = zab(i);
                if (zab != null) {
                    zab.zab.connect();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        for (int i = 0; i < this.zad.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zab.disconnect();
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.zad.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                printWriter.append(str).append("GoogleApiClient #").print(zab.zaa);
                printWriter.println(":");
                zab.zab.dump(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zaa(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        zaa zaa2 = this.zad.get(i);
        if (zaa2 != null) {
            zaa(i);
            GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener = zaa2.zac;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void zaa() {
        for (int i = 0; i < this.zad.size(); i++) {
            zaa zab = zab(i);
            if (zab != null) {
                zab.zab.connect();
            }
        }
    }

    @Nullable
    private final zaa zab(int i) {
        if (this.zad.size() <= i) {
            return null;
        }
        SparseArray<zaa> sparseArray = this.zad;
        return sparseArray.get(sparseArray.keyAt(i));
    }
}
