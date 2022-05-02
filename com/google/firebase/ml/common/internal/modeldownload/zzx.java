package com.google.firebase.ml.common.internal.modeldownload;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.util.LongSparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zzmy;
import com.google.android.gms.internal.firebase_ml.zzon;
import com.google.android.gms.internal.firebase_ml.zzph;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import java.util.HashMap;
import java.util.Map;

public final class zzx {
    /* access modifiers changed from: private */
    public static final GmsLogger zzayb = new GmsLogger("ModelDownloadManager", "");
    @GuardedBy("RemoteModelDownloadManager.class")
    private static final Map<String, zzx> zzbbi = new HashMap();
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    private final zzph zzazb;
    private final FirebaseRemoteModel zzbbh;
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public final LongSparseArray<zzz> zzbbj = new LongSparseArray<>();
    /* access modifiers changed from: private */
    @GuardedBy("this")
    public final LongSparseArray<TaskCompletionSource<Void>> zzbbk = new LongSparseArray<>();
    private final DownloadManager zzbbl;
    /* access modifiers changed from: private */
    public final zzu zzbbm;
    private final zzg zzbbn;

    public static synchronized zzx zza(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzg zzg, @NonNull zzu zzu) {
        zzx zzx;
        synchronized (zzx.class) {
            String uniqueModelNameForPersist = firebaseRemoteModel.getUniqueModelNameForPersist();
            if (!zzbbi.containsKey(uniqueModelNameForPersist)) {
                zzbbi.put(uniqueModelNameForPersist, new zzx(firebaseApp2, firebaseRemoteModel, zzg, zzu));
            }
            zzx = zzbbi.get(uniqueModelNameForPersist);
        }
        return zzx;
    }

    private zzx(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzg zzg, @NonNull zzu zzu) {
        this.firebaseApp = firebaseApp2;
        this.zzbbh = firebaseRemoteModel;
        DownloadManager downloadManager = (DownloadManager) firebaseApp2.getApplicationContext().getSystemService(H5ActionJSApi.DOWNLOAD);
        this.zzbbl = downloadManager;
        if (downloadManager == null) {
            zzayb.d("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.zzbbn = zzg;
        this.zzbbm = zzu;
        this.zzazb = zzph.zzc(firebaseApp2);
    }

    /* access modifiers changed from: package-private */
    @WorkerThread
    @Nullable
    public final synchronized Long zznq() throws FirebaseMLException {
        zzy zznw = zznw();
        if (zznw == null) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(this.zzbbh.getUniqueModelNameForPersist());
            gmsLogger.d("ModelDownloadManager", valueOf.length() != 0 ? "No model updates for model: ".concat(valueOf) : new String("No model updates for model: "));
            return null;
        }
        return zzb(zznw);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final synchronized Long zznr() {
        return this.zzazb.zza(this.zzbbh);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public final synchronized String zzns() {
        return this.zzazb.zzb(this.zzbbh);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0063, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zznt() throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.Long r0 = r6.zznr()     // Catch:{ all -> 0x0064 }
            android.app.DownloadManager r1 = r6.zzbbl     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0062
            if (r0 != 0) goto L_0x000c
            goto L_0x0062
        L_0x000c:
            com.google.android.gms.common.internal.GmsLogger r1 = zzayb     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0064 }
            int r4 = r4.length()     // Catch:{ all -> 0x0064 }
            int r4 = r4 + 44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
            r5.<init>(r4)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = "Cancel or remove existing downloading task: "
            r5.append(r4)     // Catch:{ all -> 0x0064 }
            r5.append(r3)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0064 }
            r1.d(r2, r3)     // Catch:{ all -> 0x0064 }
            android.app.DownloadManager r1 = r6.zzbbl     // Catch:{ all -> 0x0064 }
            r2 = 1
            long[] r2 = new long[r2]     // Catch:{ all -> 0x0064 }
            r3 = 0
            long r4 = r0.longValue()     // Catch:{ all -> 0x0064 }
            r2[r3] = r4     // Catch:{ all -> 0x0064 }
            int r0 = r1.remove(r2)     // Catch:{ all -> 0x0064 }
            if (r0 > 0) goto L_0x004a
            java.lang.Integer r0 = r6.zznu()     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0060
        L_0x004a:
            com.google.firebase.ml.common.internal.modeldownload.zzg r0 = r6.zzbbn     // Catch:{ all -> 0x0064 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r6.zzbbh     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = r1.getUniqueModelNameForPersist()     // Catch:{ all -> 0x0064 }
            com.google.firebase.ml.common.internal.modeldownload.zzp r2 = r6.zznz()     // Catch:{ all -> 0x0064 }
            r0.zza(r1, r2)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.internal.firebase_ml.zzph r0 = r6.zzazb     // Catch:{ all -> 0x0064 }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r6.zzbbh     // Catch:{ all -> 0x0064 }
            r0.zzh(r1)     // Catch:{ all -> 0x0064 }
        L_0x0060:
            monitor-exit(r6)
            return
        L_0x0062:
            monitor-exit(r6)
            return
        L_0x0064:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzx.zznt():void");
    }

    private final synchronized Long zza(@NonNull DownloadManager.Request request, @NonNull zzy zzy) {
        if (this.zzbbl == null) {
            return null;
        }
        long enqueue = this.zzbbl.enqueue(request);
        GmsLogger gmsLogger = zzayb;
        StringBuilder sb = new StringBuilder(53);
        sb.append("Schedule a new downloading task: ");
        sb.append(enqueue);
        gmsLogger.d("ModelDownloadManager", sb.toString());
        this.zzazb.zza(enqueue, zzy);
        this.zzbbm.zza(zzmy.NO_ERROR, false, zzy.zzoc(), zzmn.zzae.zzb.SCHEDULED);
        return Long.valueOf(enqueue);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0078, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0079, code lost:
        if (r0 != null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.google.android.gms.internal.firebase_ml.zzmj.zza(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0083, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0085, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a A[SYNTHETIC, Splitter:B:20:0x004a] */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Integer zznu() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.Long r0 = r9.zznr()     // Catch:{ all -> 0x0086 }
            android.app.DownloadManager r1 = r9.zzbbl     // Catch:{ all -> 0x0086 }
            r2 = 0
            if (r1 == 0) goto L_0x0084
            if (r0 != 0) goto L_0x000e
            goto L_0x0084
        L_0x000e:
            android.app.DownloadManager r1 = r9.zzbbl     // Catch:{ all -> 0x0086 }
            android.app.DownloadManager$Query r3 = new android.app.DownloadManager$Query     // Catch:{ all -> 0x0086 }
            r3.<init>()     // Catch:{ all -> 0x0086 }
            r4 = 1
            long[] r5 = new long[r4]     // Catch:{ all -> 0x0086 }
            r6 = 0
            long r7 = r0.longValue()     // Catch:{ all -> 0x0086 }
            r5[r6] = r7     // Catch:{ all -> 0x0086 }
            android.app.DownloadManager$Query r0 = r3.setFilterById(r5)     // Catch:{ all -> 0x0086 }
            android.database.Cursor r0 = r1.query(r0)     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0040
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0040
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndex(r1)     // Catch:{ all -> 0x003e }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x003e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x003e }
            goto L_0x0041
        L_0x003e:
            r1 = move-exception
            goto L_0x0077
        L_0x0040:
            r1 = r2
        L_0x0041:
            if (r1 != 0) goto L_0x004a
            if (r0 == 0) goto L_0x0048
            r0.close()     // Catch:{ all -> 0x0086 }
        L_0x0048:
            monitor-exit(r9)
            return r2
        L_0x004a:
            int r3 = r1.intValue()     // Catch:{ all -> 0x003e }
            r5 = 2
            if (r3 == r5) goto L_0x006f
            int r3 = r1.intValue()     // Catch:{ all -> 0x003e }
            r5 = 4
            if (r3 == r5) goto L_0x006f
            int r3 = r1.intValue()     // Catch:{ all -> 0x003e }
            if (r3 == r4) goto L_0x006f
            int r3 = r1.intValue()     // Catch:{ all -> 0x003e }
            r4 = 8
            if (r3 == r4) goto L_0x006f
            int r3 = r1.intValue()     // Catch:{ all -> 0x003e }
            r4 = 16
            if (r3 == r4) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r1
        L_0x0070:
            if (r0 == 0) goto L_0x0075
            r0.close()     // Catch:{ all -> 0x0086 }
        L_0x0075:
            monitor-exit(r9)
            return r2
        L_0x0077:
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r2 = move-exception
            if (r0 == 0) goto L_0x0083
            r0.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r0 = move-exception
            com.google.android.gms.internal.firebase_ml.zzmj.zza(r1, r0)     // Catch:{ all -> 0x0086 }
        L_0x0083:
            throw r2     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r9)
            return r2
        L_0x0086:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzx.zznu():java.lang.Integer");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        zzayb.e("ModelDownloadManager", "Downloaded file is not found");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0018 */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.os.ParcelFileDescriptor zznv() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Long r0 = r5.zznr()     // Catch:{ all -> 0x0025 }
            android.app.DownloadManager r1 = r5.zzbbl     // Catch:{ all -> 0x0025 }
            r2 = 0
            if (r1 == 0) goto L_0x0023
            if (r0 != 0) goto L_0x000d
            goto L_0x0023
        L_0x000d:
            android.app.DownloadManager r1 = r5.zzbbl     // Catch:{ FileNotFoundException -> 0x0018 }
            long r3 = r0.longValue()     // Catch:{ FileNotFoundException -> 0x0018 }
            android.os.ParcelFileDescriptor r2 = r1.openDownloadedFile(r3)     // Catch:{ FileNotFoundException -> 0x0018 }
            goto L_0x0021
        L_0x0018:
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "ModelDownloadManager"
            java.lang.String r3 = "Downloaded file is not found"
            r0.e(r1, r3)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r5)
            return r2
        L_0x0023:
            monitor-exit(r5)
            return r2
        L_0x0025:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzx.zznv():android.os.ParcelFileDescriptor");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(@NonNull String str, @NonNull zzp zzp) throws FirebaseMLException {
        this.zzazb.zza(this.zzbbh, str, zzp);
        zznt();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        return r2;
     */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized com.google.firebase.ml.common.internal.modeldownload.zzy zznw() throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzny()     // Catch:{ all -> 0x00bd }
            r1 = 0
            if (r0 == 0) goto L_0x0019
            com.google.firebase.ml.common.internal.modeldownload.zzu r2 = r8.zzbbm     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.firebase_ml.zzmy r3 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.firebase_ml.zzph r4 = r8.zzazb     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r5 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.internal.modeldownload.zzp r4 = r4.zzd(r5)     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r5 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.LIVE     // Catch:{ all -> 0x00bd }
            r2.zza((com.google.android.gms.internal.firebase_ml.zzmy) r3, (boolean) r1, (com.google.firebase.ml.common.internal.modeldownload.zzp) r4, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r5)     // Catch:{ all -> 0x00bd }
        L_0x0019:
            com.google.firebase.FirebaseApp r2 = r8.firebaseApp     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r3 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.internal.modeldownload.zzu r4 = r8.zzbbm     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.internal.modeldownload.zzy r2 = com.google.firebase.ml.common.internal.modeldownload.zzaf.zzb(r2, r3, r4)     // Catch:{ all -> 0x00bd }
            r3 = 0
            if (r2 != 0) goto L_0x0028
            monitor-exit(r8)
            return r3
        L_0x0028:
            com.google.firebase.FirebaseApp r4 = r8.firebaseApp     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r5 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            java.lang.String r6 = r2.zzbbq     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.firebase_ml.zzph r7 = com.google.android.gms.internal.firebase_ml.zzph.zzc((com.google.firebase.FirebaseApp) r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = r7.zze(r5)     // Catch:{ all -> 0x00bd }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x00bd }
            r6 = 1
            if (r5 == 0) goto L_0x0053
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = com.google.android.gms.internal.firebase_ml.zzoj.zza((android.content.Context) r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = r7.zzni()     // Catch:{ all -> 0x00bd }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0053
            r4 = 1
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            if (r4 == 0) goto L_0x0060
            com.google.android.gms.common.internal.GmsLogger r4 = zzayb     // Catch:{ all -> 0x00bd }
            java.lang.String r5 = "ModelDownloadManager"
            java.lang.String r7 = "The model is incompatible with TFLite and the app is not upgraded, do not download"
            r4.e(r5, r7)     // Catch:{ all -> 0x00bd }
            goto L_0x0061
        L_0x0060:
            r1 = 1
        L_0x0061:
            if (r0 != 0) goto L_0x006a
            com.google.android.gms.internal.firebase_ml.zzph r4 = r8.zzazb     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r5 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            r4.zzi(r5)     // Catch:{ all -> 0x00bd }
        L_0x006a:
            com.google.firebase.FirebaseApp r4 = r8.firebaseApp     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r5 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            java.lang.String r7 = r2.zzbbq     // Catch:{ all -> 0x00bd }
            com.google.android.gms.internal.firebase_ml.zzph r4 = com.google.android.gms.internal.firebase_ml.zzph.zzc((com.google.firebase.FirebaseApp) r4)     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r4.zzc((com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel) r5)     // Catch:{ all -> 0x00bd }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00bd }
            r4 = r4 ^ r6
            if (r1 == 0) goto L_0x0087
            if (r0 == 0) goto L_0x0085
            if (r4 == 0) goto L_0x0087
        L_0x0085:
            monitor-exit(r8)
            return r2
        L_0x0087:
            if (r0 == 0) goto L_0x008f
            r0 = r4 ^ r1
            if (r0 == 0) goto L_0x008f
            monitor-exit(r8)
            return r3
        L_0x008f:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x00bd }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r1 = r8.zzbbh     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.getModelName()     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00bd }
            int r2 = r2.length()     // Catch:{ all -> 0x00bd }
            int r2 = r2 + 46
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            r3.<init>(r2)     // Catch:{ all -> 0x00bd }
            java.lang.String r2 = "The model "
            r3.append(r2)     // Catch:{ all -> 0x00bd }
            r3.append(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = " is incompatible with TFLite runtime"
            r3.append(r1)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00bd }
            r2 = 100
            r0.<init>(r1, r2)     // Catch:{ all -> 0x00bd }
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzx.zznw():com.google.firebase.ml.common.internal.modeldownload.zzy");
    }

    @WorkerThread
    @Nullable
    private final synchronized Long zzb(@NonNull zzy zzy) throws FirebaseMLException {
        String zzb = this.zzazb.zzb(this.zzbbh);
        Integer zznu = zznu();
        if (zzb == null || !zzb.equals(zzy.zzbbq) || zznu == null) {
            zzayb.d("ModelDownloadManager", "Need to download a new model.");
            zznt();
            DownloadManager.Request request = new DownloadManager.Request(zzy.zzbbp);
            request.setDestinationUri((Uri) null);
            FirebaseModelDownloadConditions initialDownloadConditions = this.zzbbh.getInitialDownloadConditions();
            if (this.zzbbn.zza(zzy)) {
                if (!this.zzbbh.isModelUpdatesEnabled()) {
                    zzayb.d("ModelDownloadManager", "Model update is disabled and have a previous downloaded model, skip downloading");
                    return null;
                }
                zzayb.d("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.zzbbm.zza(zzmy.NO_ERROR, false, zzy.zzoc(), zzmn.zzae.zzb.UPDATE_AVAILABLE);
                initialDownloadConditions = this.zzbbh.getUpdatesDownloadConditions();
            }
            zzayb.d("ModelDownloadManager", "Use initial download conditions.");
            if (Build.VERSION.SDK_INT >= 24) {
                request.setRequiresCharging(initialDownloadConditions.isChargingRequired());
                request.setRequiresDeviceIdle(initialDownloadConditions.isDeviceIdleRequired());
            }
            if (initialDownloadConditions.isWifiRequired()) {
                request.setAllowedNetworkTypes(2);
            }
            return zza(request, zzy);
        }
        if (!zzb(zznu())) {
            this.zzbbm.zza(zzmy.NO_ERROR, false, zznz(), zzmn.zzae.zzb.DOWNLOADING);
        }
        zzayb.d("ModelDownloadManager", "New model is already in downloading, do nothing.");
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068 A[Catch:{ FirebaseMLException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0069 A[Catch:{ FirebaseMLException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006f A[Catch:{ FirebaseMLException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b A[Catch:{ FirebaseMLException -> 0x00b9 }] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task<java.lang.Void> zznx() {
        /*
            r10 = this;
            com.google.firebase.ml.common.internal.modeldownload.zzu r0 = r10.zzbbm
            com.google.android.gms.internal.firebase_ml.zzmy r1 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR
            com.google.firebase.ml.common.internal.modeldownload.zzp r2 = com.google.firebase.ml.common.internal.modeldownload.zzp.UNKNOWN
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r3 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.EXPLICITLY_REQUESTED
            r4 = 0
            r0.zza((com.google.android.gms.internal.firebase_ml.zzmy) r1, (boolean) r4, (com.google.firebase.ml.common.internal.modeldownload.zzp) r2, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r3)
            r0 = 0
            com.google.firebase.ml.common.internal.modeldownload.zzy r1 = r10.zznw()     // Catch:{ FirebaseMLException -> 0x0013 }
            r2 = r0
            goto L_0x0016
        L_0x0013:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L_0x0016:
            r3 = 13
            java.lang.Integer r5 = r10.zznu()     // Catch:{ FirebaseMLException -> 0x00b9 }
            java.lang.Long r6 = r10.zznr()     // Catch:{ FirebaseMLException -> 0x00b9 }
            boolean r7 = r10.zzny()     // Catch:{ FirebaseMLException -> 0x00b9 }
            if (r7 != 0) goto L_0x0084
            boolean r7 = zzb((java.lang.Integer) r5)     // Catch:{ FirebaseMLException -> 0x00b9 }
            if (r7 == 0) goto L_0x002d
            goto L_0x0084
        L_0x002d:
            r7 = 1
            if (r5 == 0) goto L_0x0045
            int r8 = r5.intValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            r9 = 4
            if (r8 == r9) goto L_0x0046
            int r8 = r5.intValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            r9 = 2
            if (r8 == r9) goto L_0x0046
            int r5 = r5.intValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            if (r5 != r7) goto L_0x0045
            goto L_0x0046
        L_0x0045:
            r7 = 0
        L_0x0046:
            if (r7 == 0) goto L_0x0066
            if (r6 == 0) goto L_0x0066
            java.lang.String r5 = r10.zzns()     // Catch:{ FirebaseMLException -> 0x00b9 }
            if (r5 == 0) goto L_0x0066
            com.google.firebase.ml.common.internal.modeldownload.zzu r0 = r10.zzbbm     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.internal.firebase_ml.zzmy r1 = com.google.android.gms.internal.firebase_ml.zzmy.NO_ERROR     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.firebase.ml.common.internal.modeldownload.zzp r2 = r10.zznz()     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r5 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.DOWNLOADING     // Catch:{ FirebaseMLException -> 0x00b9 }
            r0.zza((com.google.android.gms.internal.firebase_ml.zzmy) r1, (boolean) r4, (com.google.firebase.ml.common.internal.modeldownload.zzp) r2, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r5)     // Catch:{ FirebaseMLException -> 0x00b9 }
            long r0 = r6.longValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.tasks.Task r0 = r10.zzt(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x0066:
            if (r1 != 0) goto L_0x0069
            goto L_0x006d
        L_0x0069:
            java.lang.Long r0 = r10.zzb((com.google.firebase.ml.common.internal.modeldownload.zzy) r1)     // Catch:{ FirebaseMLException -> 0x00b9 }
        L_0x006d:
            if (r0 != 0) goto L_0x007b
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ FirebaseMLException -> 0x00b9 }
            java.lang.String r1 = "Failed to schedule the download task"
            r0.<init>(r1, r3, r2)     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x007b:
            long r0 = r0.longValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.tasks.Task r0 = r10.zzt(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x0084:
            if (r1 == 0) goto L_0x009e
            java.lang.Long r1 = r10.zzb((com.google.firebase.ml.common.internal.modeldownload.zzy) r1)     // Catch:{ FirebaseMLException -> 0x00b9 }
            if (r1 == 0) goto L_0x0095
            long r0 = r1.longValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.tasks.Task r0 = r10.zzt(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x0095:
            com.google.android.gms.common.internal.GmsLogger r1 = zzayb     // Catch:{ FirebaseMLException -> 0x00b9 }
            java.lang.String r2 = "ModelDownloadManager"
            java.lang.String r4 = "Didn't schedule download for the updated model"
            r1.i(r2, r4)     // Catch:{ FirebaseMLException -> 0x00b9 }
        L_0x009e:
            if (r5 == 0) goto L_0x00b4
            int r1 = r5.intValue()     // Catch:{ FirebaseMLException -> 0x00b9 }
            r2 = 16
            if (r1 != r2) goto L_0x00b4
            com.google.firebase.ml.common.FirebaseMLException r0 = r10.zzb((java.lang.Long) r6)     // Catch:{ FirebaseMLException -> 0x00b9 }
            r10.zznt()     // Catch:{ FirebaseMLException -> 0x00b9 }
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x00b4:
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r0)     // Catch:{ FirebaseMLException -> 0x00b9 }
            return r0
        L_0x00b9:
            r0 = move-exception
            com.google.firebase.ml.common.FirebaseMLException r1 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r2 = "Failed to ensure the model is downloaded."
            r1.<init>(r2, r3, r0)
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forException(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzx.zznx():com.google.android.gms.tasks.Task");
    }

    /* access modifiers changed from: package-private */
    public final int zza(Long l) {
        Cursor cursor;
        int columnIndex;
        DownloadManager downloadManager = this.zzbbl;
        if (downloadManager == null || l == null) {
            cursor = null;
        } else {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        if (cursor == null || !cursor.moveToFirst() || (columnIndex = cursor.getColumnIndex(ZdocRecordService.REASON)) == -1) {
            return 0;
        }
        return cursor.getInt(columnIndex);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzny() throws FirebaseMLException {
        return this.zzbbn.zzb(this.zzbbh.getUniqueModelNameForPersist(), this.zzazb.zzd(this.zzbbh));
    }

    /* access modifiers changed from: private */
    public final zzp zznz() {
        String zzb = this.zzazb.zzb(this.zzbbh);
        if (zzb == null) {
            return zzp.UNKNOWN;
        }
        return this.zzazb.zzbt(zzb);
    }

    private final synchronized zzz zzr(long j) {
        zzz zzz;
        zzz = this.zzbbj.get(j);
        if (zzz == null) {
            zzz = new zzz(this, j, zzs(j));
            this.zzbbj.put(j, zzz);
        }
        return zzz;
    }

    private final synchronized TaskCompletionSource<Void> zzs(long j) {
        TaskCompletionSource<Void> taskCompletionSource;
        taskCompletionSource = this.zzbbk.get(j);
        if (taskCompletionSource == null) {
            taskCompletionSource = new TaskCompletionSource<>();
            this.zzbbk.put(j, taskCompletionSource);
        }
        return taskCompletionSource;
    }

    /* access modifiers changed from: private */
    public final FirebaseMLException zzb(Long l) {
        Cursor cursor;
        String str;
        DownloadManager downloadManager = this.zzbbl;
        if (downloadManager == null || l == null) {
            cursor = null;
        } else {
            cursor = downloadManager.query(new DownloadManager.Query().setFilterById(new long[]{l.longValue()}));
        }
        int i = 13;
        if (cursor == null || !cursor.moveToFirst()) {
            str = "Model downloading failed";
        } else {
            int i2 = cursor.getInt(cursor.getColumnIndex(ZdocRecordService.REASON));
            if (i2 == 1006) {
                i = 101;
                str = "Model downloading failed due to insufficient space on the device.";
            } else {
                StringBuilder sb = new StringBuilder(84);
                sb.append("Model downloading failed due to error code: ");
                sb.append(i2);
                sb.append(" from Android DownloadManager");
                str = sb.toString();
            }
        }
        return new FirebaseMLException(str, i);
    }

    private static boolean zzb(Integer num) {
        if (num != null) {
            return num.intValue() == 8 || num.intValue() == 16;
        }
        return false;
    }

    private final Task<Void> zzt(long j) {
        this.firebaseApp.getApplicationContext().registerReceiver(zzr(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), (String) null, zzon.zzmy().getHandler());
        return zzs(j).getTask();
    }
}
