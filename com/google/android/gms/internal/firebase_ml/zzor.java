package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import java.util.concurrent.Callable;

public final class zzor {
    private static final GmsLogger zzaym = new GmsLogger("MLTaskManager", "");
    @GuardedBy("MLTaskManager.class")
    private static zzor zzayn;
    private final zzpc zzayo;

    private zzor(FirebaseApp firebaseApp) {
        this.zzayo = zzpc.zzb(firebaseApp);
    }

    public static synchronized zzor zza(FirebaseApp firebaseApp) {
        zzor zzor;
        synchronized (zzor.class) {
            if (zzayn == null) {
                zzayn = new zzor(firebaseApp);
            }
            zzor = zzayn;
        }
        return zzor;
    }

    public final <T, S extends zzoo> void zza(zzok<T, S> zzok) {
        zzpd zzmv = zzok.zzmv();
        if (zzmv != null) {
            this.zzayo.zza(zzmv);
        }
    }

    public final <T, S extends zzoo> void zzb(zzok<T, S> zzok) {
        zzpd zzmv = zzok.zzmv();
        if (zzmv != null) {
            this.zzayo.zzd(zzmv);
        }
    }

    public final synchronized <TResult> Task<TResult> zza(@NonNull zzpd zzpd, @NonNull Callable<TResult> callable) {
        Preconditions.checkNotNull(callable, "Operation can not be null");
        Preconditions.checkNotNull(zzpd, "Model resource can not be null");
        zzaym.d("MLTaskManager", "Execute task");
        this.zzayo.zzb(zzpd);
        return zzon.zzmy().zza(new zzoq(this, zzpd, callable));
    }

    public final synchronized <T, S extends zzoo> Task<T> zza(@NonNull zzok<T, S> zzok, @NonNull S s) {
        zzpd zzmv;
        Preconditions.checkNotNull(zzok, "Operation can not be null");
        Preconditions.checkNotNull(s, "Input can not be null");
        zzaym.d("MLTaskManager", "Execute task");
        zzmv = zzok.zzmv();
        if (zzmv != null) {
            this.zzayo.zzb(zzmv);
        }
        return zzon.zzmy().zza(new zzot(this, zzmv, zzok, s));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zza(zzpd zzpd, zzok zzok, zzoo zzoo) throws Exception {
        if (zzpd != null) {
            this.zzayo.zzf(zzpd);
        }
        return zzok.zza(zzoo);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object zzb(zzpd zzpd, Callable callable) throws Exception {
        this.zzayo.zzf(zzpd);
        return callable.call();
    }
}
