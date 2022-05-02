package com.google.firebase.ml.common.modeldownload;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.ml.common.internal.modeldownload.LocalModelManagerInterface;
import com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirebaseModelManager {
    private static final GmsLogger zzayb = new GmsLogger("FirebaseModelManager", "");
    @GuardedBy("FirebaseModelManager.class")
    private static final Map<Object, ModelManagerPluginForRemoteModels> zzbcr = new HashMap();
    @KeepForSdk
    private final FirebaseApp firebaseApp;
    private final Map<Class<?>, Provider<RemoteModelManagerInterface>> zzbcm;
    private final Map<Class<?>, Provider<LocalModelManagerInterface>> zzbcn;
    @GuardedBy("this")
    private final Map<String, FirebaseRemoteModel> zzbco;
    @GuardedBy("this")
    private final Map<String, FirebaseRemoteModel> zzbcp;
    @GuardedBy("this")
    private final Map<String, FirebaseLocalModel> zzbcq;

    @NonNull
    public static synchronized FirebaseModelManager getInstance() {
        FirebaseModelManager instance;
        synchronized (FirebaseModelManager.class) {
            instance = getInstance(FirebaseApp.getInstance());
        }
        return instance;
    }

    @NonNull
    @KeepForSdk
    public static synchronized FirebaseModelManager getInstance(@NonNull FirebaseApp firebaseApp2) {
        FirebaseModelManager firebaseModelManager;
        Class cls = FirebaseModelManager.class;
        synchronized (cls) {
            Preconditions.checkNotNull(firebaseApp2, "Please provide a valid FirebaseApp");
            firebaseModelManager = (FirebaseModelManager) firebaseApp2.get(cls);
        }
        return firebaseModelManager;
    }

    @KeepForSdk
    public static class LocalModelManagerRegistration<TLocal extends FirebaseLocalModel> {
        private final Provider<? extends LocalModelManagerInterface<TLocal>> zzbct;
        private final Class<TLocal> zzbcu;

        public LocalModelManagerRegistration(Class<TLocal> cls, Provider<? extends LocalModelManagerInterface<TLocal>> provider) {
            this.zzbcu = cls;
            this.zzbct = provider;
        }

        /* access modifiers changed from: package-private */
        public final Class<TLocal> zzoi() {
            return this.zzbcu;
        }

        /* access modifiers changed from: package-private */
        public final Provider<? extends LocalModelManagerInterface<TLocal>> zzoh() {
            return this.zzbct;
        }
    }

    @KeepForSdk
    public static class RemoteModelManagerRegistration<TRemote extends FirebaseRemoteModel> {
        private final Class<TRemote> zzbcs;
        private final Provider<? extends RemoteModelManagerInterface<TRemote>> zzbct;

        public RemoteModelManagerRegistration(Class<TRemote> cls, Provider<? extends RemoteModelManagerInterface<TRemote>> provider) {
            this.zzbcs = cls;
            this.zzbct = provider;
        }

        /* access modifiers changed from: package-private */
        public final Class<TRemote> zzog() {
            return this.zzbcs;
        }

        /* access modifiers changed from: package-private */
        public final Provider<? extends RemoteModelManagerInterface<TRemote>> zzoh() {
            return this.zzbct;
        }
    }

    @KeepForSdk
    protected FirebaseModelManager(FirebaseApp firebaseApp2) {
        this(firebaseApp2, Collections.emptySet(), Collections.emptySet());
    }

    @KeepForSdk
    public FirebaseModelManager(FirebaseApp firebaseApp2, Set<RemoteModelManagerRegistration> set, Set<LocalModelManagerRegistration> set2) {
        this.zzbcm = new HashMap();
        this.zzbcn = new HashMap();
        this.zzbco = new HashMap();
        this.zzbcp = new HashMap();
        this.zzbcq = new HashMap();
        this.firebaseApp = firebaseApp2;
        for (RemoteModelManagerRegistration next : set) {
            this.zzbcm.put(next.zzog(), next.zzoh());
        }
        for (LocalModelManagerRegistration next2 : set2) {
            this.zzbcn.put(next2.zzoi(), next2.zzoh());
        }
    }

    public synchronized boolean registerRemoteModel(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        Preconditions.checkNotNull(firebaseRemoteModel, "FirebaseRemoteModel can not be null");
        Provider provider = this.zzbcm.get(firebaseRemoteModel.getClass());
        if (provider != null) {
            return ((RemoteModelManagerInterface) provider.get()).registerRemoteModel(firebaseRemoteModel);
        }
        ModelManagerPluginForRemoteModels zzj = zzj(firebaseRemoteModel);
        if (zzj != null) {
            return zzj.registerRemoteModel(firebaseRemoteModel);
        }
        if (firebaseRemoteModel.isBaseModel()) {
            if (this.zzbcp.containsKey(firebaseRemoteModel.getModelNameForBackend())) {
                GmsLogger gmsLogger = zzayb;
                String valueOf = String.valueOf(firebaseRemoteModel.getModelNameForBackend());
                gmsLogger.w("FirebaseModelManager", valueOf.length() != 0 ? "The base model is already registered: ".concat(valueOf) : new String("The base model is already registered: "));
                return false;
            }
            this.zzbcp.put(firebaseRemoteModel.getModelNameForBackend(), firebaseRemoteModel);
        } else if (this.zzbco.containsKey(firebaseRemoteModel.getModelNameForBackend())) {
            GmsLogger gmsLogger2 = zzayb;
            String valueOf2 = String.valueOf(firebaseRemoteModel.getModelNameForBackend());
            gmsLogger2.w("FirebaseModelManager", valueOf2.length() != 0 ? "The remote model name is already registered: ".concat(valueOf2) : new String("The remote model name is already registered: "));
            return false;
        } else {
            this.zzbco.put(firebaseRemoteModel.getModelNameForBackend(), firebaseRemoteModel);
        }
        return true;
    }

    public synchronized boolean registerLocalModel(@NonNull FirebaseLocalModel firebaseLocalModel) {
        Preconditions.checkNotNull(firebaseLocalModel, "FirebaseLocalModel can not be null");
        Provider provider = this.zzbcn.get(firebaseLocalModel.getClass());
        if (provider != null) {
            return ((LocalModelManagerInterface) provider.get()).registerLocalModel(firebaseLocalModel);
        } else if (this.zzbcq.containsKey(firebaseLocalModel.getModelName())) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(firebaseLocalModel.getModelName());
            gmsLogger.w("FirebaseModelManager", valueOf.length() != 0 ? "The local model name is already registered: ".concat(valueOf) : new String("The local model name is already registered: "));
            return false;
        } else {
            this.zzbcq.put(firebaseLocalModel.getModelName(), firebaseLocalModel);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        r6 = r5.firebaseApp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        return com.google.android.gms.tasks.Tasks.forResult(null).onSuccessTask(com.google.android.gms.internal.firebase_ml.zzon.zzmx(), new com.google.firebase.ml.common.modeldownload.zzb(com.google.firebase.ml.common.internal.modeldownload.zzx.zza(r6, r0, new com.google.firebase.ml.common.internal.modeldownload.zzg(r6), new com.google.firebase.ml.common.internal.modeldownload.zzu(r5.firebaseApp, r0))));
     */
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.tasks.Task<java.lang.Void> downloadRemoteModelIfNeeded(@androidx.annotation.NonNull com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseRemoteModel cannot be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.util.Map<java.lang.Class<?>, com.google.firebase.inject.Provider<com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface>> r0 = r5.zzbcm
            java.lang.Class r1 = r6.getClass()
            java.lang.Object r0 = r0.get(r1)
            com.google.firebase.inject.Provider r0 = (com.google.firebase.inject.Provider) r0
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r0.get()
            com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface r0 = (com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface) r0
            com.google.android.gms.tasks.Task r6 = r0.downloadRemoteModelIfNeeded(r6)
            return r6
        L_0x001e:
            com.google.firebase.ml.common.modeldownload.ModelManagerPluginForRemoteModels r0 = zzj(r6)
            if (r0 == 0) goto L_0x0029
            com.google.android.gms.tasks.Task r6 = r0.downloadRemoteModelIfNeeded(r6)
            return r6
        L_0x0029:
            monitor-enter(r5)
            boolean r0 = r6.isBaseModel()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x003d
            java.util.Map<java.lang.String, com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel> r0 = r5.zzbcp     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r6.getModelNameForBackend()     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00c2 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r0 = (com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel) r0     // Catch:{ all -> 0x00c2 }
            goto L_0x0049
        L_0x003d:
            java.util.Map<java.lang.String, com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel> r0 = r5.zzbco     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = r6.getModelNameForBackend()     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00c2 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r0 = (com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel) r0     // Catch:{ all -> 0x00c2 }
        L_0x0049:
            if (r0 != 0) goto L_0x008d
            com.google.firebase.ml.common.internal.modeldownload.zzu r0 = new com.google.firebase.ml.common.internal.modeldownload.zzu     // Catch:{ all -> 0x00c2 }
            com.google.firebase.FirebaseApp r1 = r5.firebaseApp     // Catch:{ all -> 0x00c2 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.internal.firebase_ml.zzmy r1 = com.google.android.gms.internal.firebase_ml.zzmy.MODEL_NOT_REGISTERED     // Catch:{ all -> 0x00c2 }
            r2 = 0
            com.google.firebase.ml.common.internal.modeldownload.zzp r3 = com.google.firebase.ml.common.internal.modeldownload.zzp.UNKNOWN     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r4 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.EXPLICITLY_REQUESTED     // Catch:{ all -> 0x00c2 }
            r0.zza((com.google.android.gms.internal.firebase_ml.zzmy) r1, (boolean) r2, (com.google.firebase.ml.common.internal.modeldownload.zzp) r3, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r4)     // Catch:{ all -> 0x00c2 }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r6.getModelName()     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x00c2 }
            int r1 = r1.length()     // Catch:{ all -> 0x00c2 }
            int r1 = r1 + 62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c2 }
            r2.<init>(r1)     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "Remote model "
            r2.append(r1)     // Catch:{ all -> 0x00c2 }
            r2.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = " must be registered before requesting a download."
            r2.append(r6)     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00c2 }
            r1 = 9
            r0.<init>(r6, r1)     // Catch:{ all -> 0x00c2 }
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            return r6
        L_0x008d:
            boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x00c2 }
            if (r6 != 0) goto L_0x009c
            com.google.android.gms.common.internal.GmsLogger r6 = zzayb     // Catch:{ all -> 0x00c2 }
            java.lang.String r1 = "FirebaseModelManager"
            java.lang.String r2 = "Attempted to download the model with different download conditions than registered.\n The new download conditions will be ignored and the registered download conditions will be used."
            r6.w(r1, r2)     // Catch:{ all -> 0x00c2 }
        L_0x009c:
            monitor-exit(r5)     // Catch:{ all -> 0x00c2 }
            com.google.firebase.FirebaseApp r6 = r5.firebaseApp
            com.google.firebase.ml.common.internal.modeldownload.zzg r1 = new com.google.firebase.ml.common.internal.modeldownload.zzg
            r1.<init>(r6)
            com.google.firebase.ml.common.internal.modeldownload.zzu r2 = new com.google.firebase.ml.common.internal.modeldownload.zzu
            com.google.firebase.FirebaseApp r3 = r5.firebaseApp
            r2.<init>(r3, r0)
            com.google.firebase.ml.common.internal.modeldownload.zzx r6 = com.google.firebase.ml.common.internal.modeldownload.zzx.zza(r6, r0, r1, r2)
            r0 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)
            java.util.concurrent.Executor r1 = com.google.android.gms.internal.firebase_ml.zzon.zzmx()
            com.google.firebase.ml.common.modeldownload.zzb r2 = new com.google.firebase.ml.common.modeldownload.zzb
            r2.<init>(r6)
            com.google.android.gms.tasks.Task r6 = r0.onSuccessTask(r1, r2)
            return r6
        L_0x00c2:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.modeldownload.FirebaseModelManager.downloadRemoteModelIfNeeded(com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel):com.google.android.gms.tasks.Task");
    }

    @KeepForSdk
    @Nullable
    public synchronized FirebaseRemoteModel getNonBaseRemoteModel(@NonNull String str) {
        return this.zzbco.get(str);
    }

    @KeepForSdk
    @Nullable
    public synchronized FirebaseLocalModel getLocalModel(@NonNull String str) {
        return this.zzbcq.get(str);
    }

    @KeepForSdk
    protected static synchronized void registerPlugin(@NonNull Object obj, @NonNull ModelManagerPluginForRemoteModels modelManagerPluginForRemoteModels) {
        synchronized (FirebaseModelManager.class) {
            if (zzbcr.put(obj, modelManagerPluginForRemoteModels) != null) {
                GmsLogger gmsLogger = zzayb;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Delegate for plugin identifier ");
                sb.append(valueOf);
                sb.append(" already registered");
                gmsLogger.w("FirebaseModelManager", sb.toString());
            }
        }
    }

    @Nullable
    private static synchronized ModelManagerPluginForRemoteModels zzj(@NonNull FirebaseRemoteModel firebaseRemoteModel) {
        synchronized (FirebaseModelManager.class) {
            Object pluginIdentifier = firebaseRemoteModel.getPluginIdentifier();
            if (pluginIdentifier == null) {
                return null;
            }
            ModelManagerPluginForRemoteModels modelManagerPluginForRemoteModels = zzbcr.get(pluginIdentifier);
            return modelManagerPluginForRemoteModels;
        }
    }
}
