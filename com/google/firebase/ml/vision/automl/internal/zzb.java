package com.google.firebase.ml.vision.automl.internal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.internal.modeldownload.LocalModelManagerInterface;
import com.google.firebase.ml.common.internal.modeldownload.RemoteModelManagerInterface;
import com.google.firebase.ml.vision.automl.FirebaseAutoMLLocalModel;
import com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel;
import java.util.HashMap;
import java.util.Map;

public class zzb implements LocalModelManagerInterface<FirebaseAutoMLLocalModel>, RemoteModelManagerInterface<FirebaseAutoMLRemoteModel> {
    private static final GmsLogger zzayb = new GmsLogger("AutoMLModelManager", "");
    private final FirebaseApp firebaseApp;
    @GuardedBy("this")
    private final Map<String, FirebaseAutoMLRemoteModel> zzbco = new HashMap();
    @GuardedBy("this")
    private final Map<String, FirebaseAutoMLRemoteModel> zzbcp = new HashMap();
    @GuardedBy("this")
    private final Map<String, FirebaseAutoMLLocalModel> zzbcq = new HashMap();

    public zzb(FirebaseApp firebaseApp2) {
        this.firebaseApp = firebaseApp2;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized boolean registerRemoteModel(@NonNull FirebaseAutoMLRemoteModel firebaseAutoMLRemoteModel) {
        Preconditions.checkNotNull(firebaseAutoMLRemoteModel, "FirebaseAutoMLRemoteModel can not be null");
        if (firebaseAutoMLRemoteModel.isBaseModel()) {
            if (this.zzbcp.containsKey(firebaseAutoMLRemoteModel.getModelNameForBackend())) {
                GmsLogger gmsLogger = zzayb;
                String valueOf = String.valueOf(firebaseAutoMLRemoteModel.getModelNameForBackend());
                gmsLogger.w("AutoMLModelManager", valueOf.length() != 0 ? "The base model is already registered: ".concat(valueOf) : new String("The base model is already registered: "));
                return false;
            }
            this.zzbcp.put(firebaseAutoMLRemoteModel.getModelNameForBackend(), firebaseAutoMLRemoteModel);
        } else if (this.zzbco.containsKey(firebaseAutoMLRemoteModel.getModelNameForBackend())) {
            GmsLogger gmsLogger2 = zzayb;
            String valueOf2 = String.valueOf(firebaseAutoMLRemoteModel.getModelNameForBackend());
            gmsLogger2.w("AutoMLModelManager", valueOf2.length() != 0 ? "The remote model name is already registered: ".concat(valueOf2) : new String("The remote model name is already registered: "));
            return false;
        } else {
            this.zzbco.put(firebaseAutoMLRemoteModel.getModelNameForBackend(), firebaseAutoMLRemoteModel);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final synchronized boolean registerLocalModel(@NonNull FirebaseAutoMLLocalModel firebaseAutoMLLocalModel) {
        Preconditions.checkNotNull(firebaseAutoMLLocalModel, "FirebaseAutoMLLocalModel can not be null");
        if (this.zzbcq.containsKey(firebaseAutoMLLocalModel.getModelName())) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(firebaseAutoMLLocalModel.getModelName());
            gmsLogger.w("AutoMLModelManager", valueOf.length() != 0 ? "The local model name is already registered: ".concat(valueOf) : new String("The local model name is already registered: "));
            return false;
        }
        this.zzbcq.put(firebaseAutoMLLocalModel.getModelName(), firebaseAutoMLLocalModel);
        return true;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0079, code lost:
        r6 = r5.firebaseApp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009d, code lost:
        return com.google.android.gms.tasks.Tasks.forResult(null).onSuccessTask(com.google.android.gms.internal.firebase_ml.zzon.zzmx(), new com.google.firebase.ml.vision.automl.internal.zza(com.google.firebase.ml.common.internal.modeldownload.zzx.zza(r6, r0, new com.google.firebase.ml.common.internal.modeldownload.zzg(r6), new com.google.firebase.ml.common.internal.modeldownload.zzu(r5.firebaseApp, r0))));
     */
    /* renamed from: zzb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task<java.lang.Void> downloadRemoteModelIfNeeded(@androidx.annotation.NonNull com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseAutoMLRemoteModel can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            monitor-enter(r5)
            boolean r0 = r6.isBaseModel()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0019
            java.util.Map<java.lang.String, com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel> r0 = r5.zzbcp     // Catch:{ all -> 0x009e }
            java.lang.String r1 = r6.getModelNameForBackend()     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x009e }
            com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel r0 = (com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel) r0     // Catch:{ all -> 0x009e }
            goto L_0x0025
        L_0x0019:
            java.util.Map<java.lang.String, com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel> r0 = r5.zzbco     // Catch:{ all -> 0x009e }
            java.lang.String r1 = r6.getModelNameForBackend()     // Catch:{ all -> 0x009e }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x009e }
            com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel r0 = (com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel) r0     // Catch:{ all -> 0x009e }
        L_0x0025:
            if (r0 != 0) goto L_0x0069
            com.google.firebase.ml.common.internal.modeldownload.zzu r0 = new com.google.firebase.ml.common.internal.modeldownload.zzu     // Catch:{ all -> 0x009e }
            com.google.firebase.FirebaseApp r1 = r5.firebaseApp     // Catch:{ all -> 0x009e }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x009e }
            com.google.android.gms.internal.firebase_ml.zzmy r1 = com.google.android.gms.internal.firebase_ml.zzmy.MODEL_NOT_REGISTERED     // Catch:{ all -> 0x009e }
            r2 = 0
            com.google.firebase.ml.common.internal.modeldownload.zzp r3 = com.google.firebase.ml.common.internal.modeldownload.zzp.UNKNOWN     // Catch:{ all -> 0x009e }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r4 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.EXPLICITLY_REQUESTED     // Catch:{ all -> 0x009e }
            r0.zza((com.google.android.gms.internal.firebase_ml.zzmy) r1, (boolean) r2, (com.google.firebase.ml.common.internal.modeldownload.zzp) r3, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r4)     // Catch:{ all -> 0x009e }
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x009e }
            java.lang.String r6 = r6.getModelName()     // Catch:{ all -> 0x009e }
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x009e }
            int r1 = r1.length()     // Catch:{ all -> 0x009e }
            int r1 = r1 + 62
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009e }
            r2.<init>(r1)     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "Remote model "
            r2.append(r1)     // Catch:{ all -> 0x009e }
            r2.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r6 = " must be registered before requesting a download."
            r2.append(r6)     // Catch:{ all -> 0x009e }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x009e }
            r1 = 9
            r0.<init>(r6, r1)     // Catch:{ all -> 0x009e }
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch:{ all -> 0x009e }
            monitor-exit(r5)     // Catch:{ all -> 0x009e }
            return r6
        L_0x0069:
            boolean r6 = r6.equals(r0)     // Catch:{ all -> 0x009e }
            if (r6 != 0) goto L_0x0078
            com.google.android.gms.common.internal.GmsLogger r6 = zzayb     // Catch:{ all -> 0x009e }
            java.lang.String r1 = "AutoMLModelManager"
            java.lang.String r2 = "Attempted to download the model with different download conditions than registered.\n The new download conditions will be ignored and the registered download conditions will be used."
            r6.w(r1, r2)     // Catch:{ all -> 0x009e }
        L_0x0078:
            monitor-exit(r5)     // Catch:{ all -> 0x009e }
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
            com.google.firebase.ml.vision.automl.internal.zza r2 = new com.google.firebase.ml.vision.automl.internal.zza
            r2.<init>(r6)
            com.google.android.gms.tasks.Task r6 = r0.onSuccessTask(r1, r2)
            return r6
        L_0x009e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.vision.automl.internal.zzb.downloadRemoteModelIfNeeded(com.google.firebase.ml.vision.automl.FirebaseAutoMLRemoteModel):com.google.android.gms.tasks.Task");
    }
}
