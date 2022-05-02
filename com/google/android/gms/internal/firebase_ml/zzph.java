package com.google.android.gms.internal.firebase_ml;

import android.content.SharedPreferences;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.ml.common.internal.modeldownload.zzp;
import com.google.firebase.ml.common.internal.modeldownload.zzy;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import id.dana.data.profilemenu.MyProfileMenuAction;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class zzph {
    @GuardedBy("instances")
    private static final Map<String, zzph> zzaya = new HashMap();
    private static final GmsLogger zzayb = new GmsLogger("SharedPrefManager", "");
    private final FirebaseApp firebaseApp;

    private zzph(@NonNull FirebaseApp firebaseApp2) {
        this.firebaseApp = firebaseApp2;
    }

    public static zzph zzc(@NonNull FirebaseApp firebaseApp2) {
        zzph zzph;
        Preconditions.checkNotNull(firebaseApp2, "FirebaseApp can not be null");
        String persistenceKey = firebaseApp2.getPersistenceKey();
        synchronized (zzaya) {
            if (!zzaya.containsKey(persistenceKey)) {
                zzaya.put(persistenceKey, new zzph(firebaseApp2));
                firebaseApp2.addLifecycleEventListener(new zzpg(persistenceKey));
            }
            zzph = zzaya.get(persistenceKey);
        }
        return zzph;
    }

    public final synchronized boolean zzng() {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", new Object[]{"vision", this.firebaseApp.getPersistenceKey()}), true);
    }

    public final synchronized void zzav(boolean z) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", new Object[]{"vision", this.firebaseApp.getPersistenceKey()}), z).apply();
    }

    public final synchronized boolean zznh() {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getBoolean(String.format("logging_%s_%s", new Object[]{H5GetLogInfoBridge.RESULT_MODEL, this.firebaseApp.getPersistenceKey()}), true);
    }

    public final synchronized void zzaw(boolean z) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putBoolean(String.format("logging_%s_%s", new Object[]{H5GetLogInfoBridge.RESULT_MODEL, this.firebaseApp.getPersistenceKey()}), z).apply();
    }

    @Nullable
    public final synchronized Long zza(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        long j = this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_model_id_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), -1);
        if (j < 0) {
            return null;
        }
        return Long.valueOf(j);
    }

    public final synchronized zzp zzbt(@NonNull String str) {
        return zzbu(this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("downloading_model_type_%s", new Object[]{str}), ""));
    }

    @Nullable
    public final synchronized String zzb(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("downloading_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), (String) null);
    }

    @Nullable
    public final synchronized String zzc(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("current_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), (String) null);
    }

    public final synchronized zzp zzd(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return zzbu(this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("current_model_type_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), zzp.UNKNOWN.name()));
    }

    @Nullable
    public final synchronized String zze(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(String.format("bad_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), (String) null);
    }

    @Nullable
    public final synchronized String zzni() {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString(MyProfileMenuAction.APP_VERSION, (String) null);
    }

    public final synchronized long zzf(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("downloading_begin_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), 0);
    }

    public final synchronized long zzg(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        return this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getLong(String.format("model_first_use_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), 0);
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, long j) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putLong(String.format("model_first_use_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), j).apply();
    }

    public final synchronized void zzh(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        String zzb = zzb(firebaseRemoteModel);
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("downloading_model_id_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).remove(String.format("downloading_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).remove(String.format("downloading_model_type_%s", new Object[]{zzb})).remove(String.format("downloading_begin_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).remove(String.format("model_first_use_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).apply();
    }

    @WorkerThread
    public final synchronized void zzi(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().remove(String.format("current_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).remove(String.format("current_model_type_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()})).commit();
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull String str, @NonNull zzp zzp) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("current_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), str).putString(String.format("current_model_type_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), zzp.name()).apply();
    }

    public final synchronized void zza(long j, @NonNull zzy zzy) {
        String zzob = zzy.zzob();
        String modelHash = zzy.getModelHash();
        zzp zzoc = zzy.zzoc();
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("downloading_model_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), zzob}), modelHash).putLong(String.format("downloading_model_id_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), zzob}), j).putString(String.format("downloading_model_type_%s", new Object[]{modelHash}), zzoc.name()).putLong(String.format("downloading_begin_time_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), zzob}), SystemClock.elapsedRealtime()).apply();
    }

    public final synchronized void zza(@NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull String str, @NonNull String str2) {
        this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).edit().putString(String.format("bad_hash_%s_%s", new Object[]{this.firebaseApp.getPersistenceKey(), firebaseRemoteModel.getUniqueModelNameForPersist()}), str).putString(MyProfileMenuAction.APP_VERSION, str2).apply();
    }

    public final synchronized String zznj() {
        String string = this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0).getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        SharedPreferences sharedPreferences = this.firebaseApp.getApplicationContext().getSharedPreferences("com.google.firebase.ml.internal", 0);
        String uuid = UUID.randomUUID().toString();
        sharedPreferences.edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    private static zzp zzbu(String str) {
        if (str == null) {
            return zzp.UNKNOWN;
        }
        try {
            return zzp.zzbv(str);
        } catch (IllegalArgumentException unused) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(str);
            gmsLogger.e("SharedPrefManager", valueOf.length() != 0 ? "Invalid model type ".concat(valueOf) : new String("Invalid model type "));
            return zzp.UNKNOWN;
        }
    }

    static final /* synthetic */ void zza(String str, String str2, FirebaseOptions firebaseOptions) {
        synchronized (zzaya) {
            zzaya.remove(str);
        }
    }
}
