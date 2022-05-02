package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o.StringDef;
import o.TransitionRes;

public final class zzov {
    private static final GmsLogger zzayb = new GmsLogger("MlStatsLogger", "");
    @Nullable
    private static List<String> zzayu;
    private static boolean zzazg = false;
    private static boolean zzazh = false;
    public static final Component<?> zzazj = Component.builder(zza.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(zzb.class)).factory(zzoz.zzaxz).build();
    private final String zzayv;
    private final String zzayw;
    private final String zzayx;
    private final String zzayy;
    private final String zzayz;
    private final zzb zzaza;
    private final zzph zzazb;
    private final Task<String> zzazc;
    private final Task<String> zzazd;
    private final Map<zznc, Long> zzaze;
    private final Map<zznc, Object> zzazf;
    private final int zzazi;

    public interface zzb {
        void zza(zzmn.zzaa zzaa);
    }

    private zzov(FirebaseApp firebaseApp, int i, zzb zzb2) {
        this.zzaze = new HashMap();
        this.zzazf = new HashMap();
        this.zzazi = i;
        String projectId = firebaseApp.getOptions().getProjectId();
        String str = "";
        this.zzayx = projectId == null ? str : projectId;
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        this.zzayy = gcmSenderId == null ? str : gcmSenderId;
        String apiKey = firebaseApp.getOptions().getApiKey();
        this.zzayz = apiKey != null ? apiKey : str;
        Context applicationContext = firebaseApp.getApplicationContext();
        this.zzayv = applicationContext.getPackageName();
        this.zzayw = zzoj.zza(applicationContext);
        this.zzaza = zzb2;
        this.zzazb = zzph.zzc(firebaseApp);
        this.zzazc = zzon.zzmy().zza(zzou.zzayt);
        zzon zzmy = zzon.zzmy();
        zzph zzph = this.zzazb;
        zzph.getClass();
        this.zzazd = zzmy.zza(zzox.zza(zzph));
    }

    public static class zza extends zzoi<Integer, zzov> {
        private final FirebaseApp firebaseApp;
        private final zzb zzaza;

        private zza(FirebaseApp firebaseApp2, zzb zzb) {
            this.firebaseApp = firebaseApp2;
            this.zzaza = zzb;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object create(Object obj) {
            return new zzov(this.firebaseApp, ((Integer) obj).intValue(), this.zzaza);
        }
    }

    public static zzov zza(@NonNull FirebaseApp firebaseApp, int i) {
        Preconditions.checkNotNull(firebaseApp);
        return (zzov) ((zza) firebaseApp.get(zza.class)).get(Integer.valueOf(i));
    }

    public final void zza(@NonNull zzmn.zzaa.zza zza2, @NonNull zznc zznc) {
        zzon.zzmx().execute(new zzow(this, zza2, zznc));
    }

    @WorkerThread
    public final void zza(@NonNull zzpb zzpb, @NonNull zznc zznc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = true;
        if (!zzfl() || (this.zzaze.get(zznc) != null && elapsedRealtime - this.zzaze.get(zznc).longValue() <= TimeUnit.SECONDS.toMillis(30))) {
            z = false;
        }
        if (z) {
            this.zzaze.put(zznc, Long.valueOf(elapsedRealtime));
            zza(zzpb.zznb(), zznc);
        }
    }

    @WorkerThread
    public final <K> void zza(@NonNull K k, long j, @NonNull zznc zznc, @NonNull zzpa<K> zzpa) {
        zzfl();
    }

    @WorkerThread
    private final boolean zzfl() {
        int i = this.zzazi;
        if (i == 1) {
            return this.zzazb.zzng();
        }
        if (i != 2) {
            return i == 3 || i == 4 || i == 5;
        }
        return this.zzazb.zznh();
    }

    @NonNull
    private static synchronized List<String> zzmz() {
        synchronized (zzov.class) {
            if (zzayu != null) {
                List<String> list = zzayu;
                return list;
            }
            TransitionRes min = StringDef.getMin(Resources.getSystem().getConfiguration());
            zzayu = new ArrayList(min.setMax());
            for (int i = 0; i < min.setMax(); i++) {
                zzayu.add(zzoj.zza(min.getMin(i)));
            }
            List<String> list2 = zzayu;
            return list2;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzmn.zzaa.zza zza2, zznc zznc) {
        String str;
        if (!zzfl()) {
            zzayb.d("MlStatsLogger", "Logging is disabled.");
            return;
        }
        String zzmq = zza2.zzkx().zzmq();
        if ("NA".equals(zzmq) || "".equals(zzmq)) {
            zzmq = "NA";
        }
        zzmn.zzau.zza zzx = zzmn.zzau.zzmr().zzbm(this.zzayv).zzbn(this.zzayw).zzbo(this.zzayx).zzbr(this.zzayy).zzbs(this.zzayz).zzbq(zzmq).zzx(zzmz());
        if (this.zzazc.isSuccessful()) {
            str = this.zzazc.getResult();
        } else {
            str = zzol.zzmw().getVersion("firebase-ml-common");
        }
        zza2.zzb(zznc).zzb(zzx.zzbp(str));
        try {
            this.zzaza.zza((zzmn.zzaa) ((zzux) zza2.zzte()));
        } catch (RuntimeException e) {
            zzayb.e("MlStatsLogger", "Exception thrown from the logging side", e);
        }
    }

    static final /* synthetic */ zza zza(ComponentContainer componentContainer) {
        return new zza((FirebaseApp) componentContainer.get(FirebaseApp.class), (zzb) componentContainer.get(zzb.class));
    }
}
