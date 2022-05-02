package com.google.android.gms.internal.firebase_ml;

import android.app.Application;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class zzpc {
    /* access modifiers changed from: private */
    public static final GmsLogger zzaym = new GmsLogger("ModelResourceManager", "");
    @GuardedBy("ModelResourceManager.class")
    private static zzpc zzazt;
    private final zzon zzazo = zzon.zzmy();
    private final AtomicLong zzazp = new AtomicLong(300000);
    @GuardedBy("this")
    private final Set<zzpd> zzazq = new HashSet();
    /* access modifiers changed from: private */
    public final Set<zzpd> zzazr = new HashSet();
    private final ConcurrentHashMap<zzpd, zzpe> zzazs = new ConcurrentHashMap<>();

    public static synchronized zzpc zzb(FirebaseApp firebaseApp) {
        zzpc zzpc;
        synchronized (zzpc.class) {
            if (zzazt == null) {
                zzazt = new zzpc(firebaseApp);
            }
            zzpc = zzazt;
        }
        return zzpc;
    }

    private zzpc(FirebaseApp firebaseApp) {
        if (firebaseApp.getApplicationContext() instanceof Application) {
            BackgroundDetector.initialize((Application) firebaseApp.getApplicationContext());
        } else {
            zzaym.e("ModelResourceManager", "No valid Application available and auto-manage cannot work");
        }
        BackgroundDetector.getInstance().addListener(new zzpf(this));
        if (BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
            this.zzazp.set(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zza(@androidx.annotation.NonNull com.google.android.gms.internal.firebase_ml.zzpd r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "Model source can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)     // Catch:{ all -> 0x003a }
            com.google.android.gms.common.internal.GmsLogger r0 = zzaym     // Catch:{ all -> 0x003a }
            java.lang.String r1 = "ModelResourceManager"
            java.lang.String r2 = "Add auto-managed model resource"
            r0.d(r1, r2)     // Catch:{ all -> 0x003a }
            java.util.Set<com.google.android.gms.internal.firebase_ml.zzpd> r0 = r3.zzazq     // Catch:{ all -> 0x003a }
            boolean r0 = r0.contains(r4)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.common.internal.GmsLogger r4 = zzaym     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "ModelResourceManager"
            java.lang.String r1 = "The model resource is already registered."
            r4.i(r0, r1)     // Catch:{ all -> 0x003a }
            monitor-exit(r3)
            return
        L_0x0022:
            java.util.Set<com.google.android.gms.internal.firebase_ml.zzpd> r0 = r3.zzazq     // Catch:{ all -> 0x003a }
            r0.add(r4)     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0038
            com.google.android.gms.internal.firebase_ml.zzon r0 = r3.zzazo     // Catch:{ all -> 0x003a }
            com.google.android.gms.internal.firebase_ml.zzpe r1 = new com.google.android.gms.internal.firebase_ml.zzpe     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "OPERATION_LOAD"
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x003a }
            r0.zza(r1)     // Catch:{ all -> 0x003a }
            r3.zzb((com.google.android.gms.internal.firebase_ml.zzpd) r4)     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r3)
            return
        L_0x003a:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzpc.zza(com.google.android.gms.internal.firebase_ml.zzpd):void");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzb(zzpd zzpd) {
        if (this.zzazq.contains(zzpd)) {
            zzc(zzpd);
        }
    }

    private final synchronized void zznc() {
        for (zzpd zzc : this.zzazq) {
            zzc(zzc);
        }
    }

    @GuardedBy("this")
    private final void zzc(zzpd zzpd) {
        zzpe zze = zze(zzpd);
        this.zzazo.zzb(zze);
        long j = this.zzazp.get();
        GmsLogger gmsLogger = zzaym;
        StringBuilder sb = new StringBuilder(62);
        sb.append("Rescheduling modelResource release after: ");
        sb.append(j);
        gmsLogger.v("ModelResourceManager", sb.toString());
        this.zzazo.zza(zze, j);
    }

    public final synchronized void zzd(@Nullable zzpd zzpd) {
        if (zzpd != null) {
            zzpe zze = zze(zzpd);
            this.zzazo.zzb(zze);
            this.zzazo.zza(zze, 0);
        }
    }

    private final zzpe zze(zzpd zzpd) {
        this.zzazs.putIfAbsent(zzpd, new zzpe(this, zzpd, "OPERATION_RELEASE"));
        return this.zzazs.get(zzpd);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final void zzf(zzpd zzpd) throws FirebaseMLException {
        if (!this.zzazr.contains(zzpd)) {
            try {
                zzpd.zzne();
                this.zzazr.add(zzpd);
            } catch (RuntimeException e) {
                throw new FirebaseMLException("The load task failed", 13, e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzau(boolean z) {
        GmsLogger gmsLogger = zzaym;
        StringBuilder sb = new StringBuilder(34);
        sb.append("Background state changed to: ");
        sb.append(z);
        gmsLogger.v("ModelResourceManager", sb.toString());
        this.zzazp.set(z ? AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS : 300000);
        zznc();
    }
}
