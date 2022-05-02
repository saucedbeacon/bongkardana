package com.google.firebase.ml.common.internal.modeldownload;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.iap.ac.android.common.BuildConfig;
import io.reactivex.annotations.SchedulerSupport;
import java.io.File;

public final class zzh {
    private static final GmsLogger zzayb = new GmsLogger("ModelFileHelper", "");
    @VisibleForTesting
    private static final String zzbag = String.format("com.google.firebase.ml.%s.models", new Object[]{SchedulerSupport.CUSTOM});
    @VisibleForTesting
    private static final String zzbah = String.format("com.google.firebase.ml.%s.models", new Object[]{"automl"});
    @VisibleForTesting
    private static final String zzbai = String.format("com.google.firebase.ml.%s.models", new Object[]{BuildConfig.FLAVOR});
    @VisibleForTesting
    private static final String zzbaj = String.format("com.google.firebase.ml.%s.models", new Object[]{"translate"});
    private final FirebaseApp firebaseApp;

    public zzh(FirebaseApp firebaseApp2) {
        this.firebaseApp = firebaseApp2;
    }

    public final void zza(String str, zzp zzp) throws FirebaseMLException {
        if (zzp == zzp.AUTOML) {
            File zza = zza.zza(this.firebaseApp, str);
            if (!zzc(zza.getParentFile())) {
                GmsLogger gmsLogger = zzayb;
                String valueOf = String.valueOf(zza.getParentFile().getAbsolutePath());
                gmsLogger.e("ModelFileHelper", valueOf.length() != 0 ? "Failed to delete the temp labels file directory: ".concat(valueOf) : new String("Failed to delete the temp labels file directory: "));
            }
        }
    }

    public final boolean zzb(String str, zzp zzp) throws FirebaseMLException {
        String str2;
        if (zzp == zzp.UNKNOWN) {
            return false;
        }
        File zza = zza(str, zzp, false);
        int zzb = zzb(zza);
        if (zzb == -1) {
            str2 = null;
        } else {
            String absolutePath = zza.getAbsolutePath();
            StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
            sb.append(absolutePath);
            sb.append("/");
            sb.append(zzb);
            str2 = sb.toString();
        }
        if (str2 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final File zzc(@NonNull String str, zzp zzp) throws FirebaseMLException {
        return zza(str, zzp, false);
    }

    @WorkerThread
    private final File zza(@NonNull String str, @NonNull zzp zzp, boolean z) throws FirebaseMLException {
        File zzb = zzb(str, zzp, z);
        if (!zzb.exists()) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(zzb.getAbsolutePath());
            gmsLogger.d("ModelFileHelper", valueOf.length() != 0 ? "model folder does not exist, creating one: ".concat(valueOf) : new String("model folder does not exist, creating one: "));
            zzb.mkdirs();
        } else if (!zzb.isDirectory()) {
            String valueOf2 = String.valueOf(zzb);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 71);
            sb.append("Can not create model folder, since an existing file has the same name: ");
            sb.append(valueOf2);
            throw new FirebaseMLException(sb.toString(), 6);
        }
        return zzb;
    }

    public final File zzb(@NonNull String str, @NonNull zzp zzp, boolean z) {
        String str2;
        File file;
        int i = zzj.zzbak[zzp.ordinal()];
        if (i == 1) {
            str2 = zzbag;
        } else if (i == 2) {
            str2 = zzbai;
        } else if (i == 3) {
            str2 = zzbah;
        } else if (i == 4) {
            str2 = zzbaj;
        } else {
            String name = zzp.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 69);
            sb.append("Unknown model type ");
            sb.append(name);
            sb.append(". Cannot find a dir to store the downloaded model.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            file = new File(this.firebaseApp.getApplicationContext().getNoBackupFilesDir(), str2);
        } else {
            file = this.firebaseApp.getApplicationContext().getDir(str2, 0);
        }
        if (z) {
            file = new File(file, "temp");
        }
        return new File(new File(file, this.firebaseApp.getPersistenceKey()), str);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    public final File zzd(@NonNull String str, @NonNull zzp zzp) throws FirebaseMLException {
        return zza(str, zzp, true);
    }

    @WorkerThread
    static int zzb(@NonNull File file) {
        File[] listFiles = file.listFiles();
        int i = -1;
        if (listFiles.length == 0) {
            return -1;
        }
        for (File file2 : listFiles) {
            try {
                i = Math.max(i, Integer.parseInt(file2.getName()));
            } catch (NumberFormatException unused) {
                GmsLogger gmsLogger = zzayb;
                String valueOf = String.valueOf(file2.getName());
                gmsLogger.d("ModelFileHelper", valueOf.length() != 0 ? "Contains non-integer file name ".concat(valueOf) : new String("Contains non-integer file name "));
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzc(File file) {
        boolean z;
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            z = true;
            for (File zzc : file.listFiles()) {
                z = z && zzc(zzc);
            }
        } else {
            z = true;
        }
        return z && file.delete();
    }
}
