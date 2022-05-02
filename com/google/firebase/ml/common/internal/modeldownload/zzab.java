package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmj;
import com.google.android.gms.internal.firebase_ml.zzph;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class zzab {
    /* access modifiers changed from: private */
    public static final GmsLogger zzayb = new GmsLogger("RemoteModelFileManager", "");
    private final FirebaseApp firebaseApp;
    private final zzph zzazb;
    private final String zzazz;
    private final zzh zzbaa;
    private final FirebaseRemoteModel zzbbh;
    private final zzp zzbbr;
    private final zzai zzbbv;
    private final zzi zzbbw;

    public zzab(@NonNull FirebaseApp firebaseApp2, @NonNull FirebaseRemoteModel firebaseRemoteModel, @NonNull zzr zzr, @NonNull zzp zzp) {
        String str;
        this.firebaseApp = firebaseApp2;
        this.zzbbh = firebaseRemoteModel;
        if (zzp == zzp.TRANSLATE) {
            str = firebaseRemoteModel.getModelNameForBackend();
        } else {
            str = firebaseRemoteModel.getUniqueModelNameForPersist();
        }
        this.zzazz = str;
        this.zzbbr = zzp;
        this.zzbbv = new zzai(zzr);
        this.zzazb = zzph.zzc(firebaseApp2);
        this.zzbaa = new zzh(firebaseApp2);
        int i = zzaa.zzbak[zzp.ordinal()];
        if (i == 1) {
            this.zzbbw = new zza(firebaseApp2, this.zzazz);
        } else if (i == 2) {
            this.zzbbw = new zzac(firebaseApp2, this.zzazz);
        } else if (i == 3 || i == 4) {
            this.zzbbw = new zzad(firebaseApp2, this.zzazz);
        } else {
            throw new IllegalArgumentException("Unexpected model type");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0120, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        zza(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0124, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0127, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        zza(r9, (java.io.FileInputStream) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012b, code lost:
        throw r10;
     */
    @androidx.annotation.WorkerThread
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File zza(@androidx.annotation.NonNull android.os.ParcelFileDescriptor r9, @androidx.annotation.NonNull java.lang.String r10, @androidx.annotation.NonNull com.google.firebase.ml.common.internal.modeldownload.zzu r11) throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r8 = this;
            monitor-enter(r8)
            com.google.android.gms.internal.firebase_ml.zzph r0 = r8.zzazb     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzp r0 = r0.zzbt(r10)     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzp r1 = r8.zzbbr     // Catch:{ all -> 0x019e }
            r2 = 0
            if (r1 != r0) goto L_0x0155
            com.google.firebase.ml.common.internal.modeldownload.zzh r0 = r8.zzbaa     // Catch:{ all -> 0x019e }
            java.lang.String r1 = r8.zzazz     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzp r3 = r8.zzbbr     // Catch:{ all -> 0x019e }
            java.io.File r0 = r0.zzd(r1, r3)     // Catch:{ all -> 0x019e }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x019e }
            java.lang.String r3 = "to_be_validated_model.tmp"
            r1.<init>(r0, r3)     // Catch:{ all -> 0x019e }
            r0 = 0
            android.os.ParcelFileDescriptor$AutoCloseInputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseInputStream     // Catch:{ IOException -> 0x012c }
            r3.<init>(r9)     // Catch:{ IOException -> 0x012c }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0125 }
            r9.<init>(r1)     // Catch:{ all -> 0x0125 }
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x011e }
        L_0x002c:
            int r5 = r3.read(r4)     // Catch:{ all -> 0x011e }
            r6 = -1
            if (r5 == r6) goto L_0x0037
            r9.write(r4, r2, r5)     // Catch:{ all -> 0x011e }
            goto L_0x002c
        L_0x0037:
            java.io.FileDescriptor r4 = r9.getFD()     // Catch:{ all -> 0x011e }
            r4.sync()     // Catch:{ all -> 0x011e }
            zza((java.lang.Throwable) r0, (java.io.FileOutputStream) r9)     // Catch:{ all -> 0x0125 }
            zza((java.lang.Throwable) r0, (java.io.FileInputStream) r3)     // Catch:{ IOException -> 0x012c }
            boolean r9 = com.google.firebase.ml.common.internal.modeldownload.zzai.zza(r1, r10)     // Catch:{ all -> 0x019e }
            if (r9 == 0) goto L_0x00ac
            com.google.firebase.ml.common.internal.modeldownload.zzai r0 = r8.zzbbv     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzq r0 = r0.zzb(r1, r11)     // Catch:{ all -> 0x019e }
            boolean r2 = r0.isValid()     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzt r0 = r0.zznp()     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzt r3 = com.google.firebase.ml.common.internal.modeldownload.zzt.TFLITE_VERSION_INCOMPATIBLE     // Catch:{ all -> 0x019e }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x00ac
            com.google.firebase.FirebaseApp r0 = r8.firebaseApp     // Catch:{ all -> 0x019e }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = com.google.android.gms.internal.firebase_ml.zzoj.zza((android.content.Context) r0)     // Catch:{ all -> 0x019e }
            com.google.android.gms.internal.firebase_ml.zzph r3 = r8.zzazb     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel r4 = r8.zzbbh     // Catch:{ all -> 0x019e }
            r3.zza((com.google.firebase.ml.common.modeldownload.FirebaseRemoteModel) r4, (java.lang.String) r10, (java.lang.String) r0)     // Catch:{ all -> 0x019e }
            com.google.android.gms.common.internal.GmsLogger r3 = zzayb     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "RemoteModelFileManager"
            java.lang.String r5 = "Model is not compatible. Model hash: "
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x019e }
            int r7 = r6.length()     // Catch:{ all -> 0x019e }
            if (r7 == 0) goto L_0x0086
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x019e }
            goto L_0x008c
        L_0x0086:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x019e }
            r6.<init>(r5)     // Catch:{ all -> 0x019e }
            r5 = r6
        L_0x008c:
            r3.d(r4, r5)     // Catch:{ all -> 0x019e }
            com.google.android.gms.common.internal.GmsLogger r3 = zzayb     // Catch:{ all -> 0x019e }
            java.lang.String r4 = "RemoteModelFileManager"
            java.lang.String r5 = "The current app version is: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x019e }
            int r6 = r0.length()     // Catch:{ all -> 0x019e }
            if (r6 == 0) goto L_0x00a4
            java.lang.String r0 = r5.concat(r0)     // Catch:{ all -> 0x019e }
            goto L_0x00a9
        L_0x00a4:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x019e }
            r0.<init>(r5)     // Catch:{ all -> 0x019e }
        L_0x00a9:
            r3.d(r4, r0)     // Catch:{ all -> 0x019e }
        L_0x00ac:
            if (r9 == 0) goto L_0x00b9
            if (r2 != 0) goto L_0x00b1
            goto L_0x00b9
        L_0x00b1:
            com.google.firebase.ml.common.internal.modeldownload.zzi r9 = r8.zzbbw     // Catch:{ all -> 0x019e }
            java.io.File r9 = r9.zza(r1)     // Catch:{ all -> 0x019e }
            monitor-exit(r8)
            return r9
        L_0x00b9:
            if (r9 != 0) goto L_0x00ec
            com.google.android.gms.common.internal.GmsLogger r9 = zzayb     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "RemoteModelFileManager"
            java.lang.String r2 = "Hash does not match with expected: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x019e }
            int r3 = r10.length()     // Catch:{ all -> 0x019e }
            if (r3 == 0) goto L_0x00d0
            java.lang.String r10 = r2.concat(r10)     // Catch:{ all -> 0x019e }
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x019e }
            r10.<init>(r2)     // Catch:{ all -> 0x019e }
        L_0x00d5:
            r9.d(r0, r10)     // Catch:{ all -> 0x019e }
            com.google.android.gms.internal.firebase_ml.zzmy r9 = com.google.android.gms.internal.firebase_ml.zzmy.MODEL_HASH_MISMATCH     // Catch:{ all -> 0x019e }
            r10 = 1
            com.google.firebase.ml.common.internal.modeldownload.zzp r0 = r8.zzbbr     // Catch:{ all -> 0x019e }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r2 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.SUCCEEDED     // Catch:{ all -> 0x019e }
            r11.zza((com.google.android.gms.internal.firebase_ml.zzmy) r9, (boolean) r10, (com.google.firebase.ml.common.internal.modeldownload.zzp) r0, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r2)     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x019e }
            java.lang.String r10 = "Hash does not match with expected"
            r11 = 102(0x66, float:1.43E-43)
            r9.<init>(r10, r11)     // Catch:{ all -> 0x019e }
            goto L_0x00f5
        L_0x00ec:
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x019e }
            java.lang.String r10 = "Model is not compatible with TFLite run time"
            r11 = 100
            r9.<init>(r10, r11)     // Catch:{ all -> 0x019e }
        L_0x00f5:
            boolean r10 = r1.delete()     // Catch:{ all -> 0x019e }
            if (r10 != 0) goto L_0x011d
            com.google.android.gms.common.internal.GmsLogger r10 = zzayb     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "RemoteModelFileManager"
            java.lang.String r0 = "Failed to delete the temp file: "
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x019e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x019e }
            int r2 = r1.length()     // Catch:{ all -> 0x019e }
            if (r2 == 0) goto L_0x0114
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x019e }
            goto L_0x011a
        L_0x0114:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x019e }
            r1.<init>(r0)     // Catch:{ all -> 0x019e }
            r0 = r1
        L_0x011a:
            r10.d(r11, r0)     // Catch:{ all -> 0x019e }
        L_0x011d:
            throw r9     // Catch:{ all -> 0x019e }
        L_0x011e:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r11 = move-exception
            zza((java.lang.Throwable) r10, (java.io.FileOutputStream) r9)     // Catch:{ all -> 0x0125 }
            throw r11     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x0127 }
        L_0x0127:
            r10 = move-exception
            zza((java.lang.Throwable) r9, (java.io.FileInputStream) r3)     // Catch:{ IOException -> 0x012c }
            throw r10     // Catch:{ IOException -> 0x012c }
        L_0x012c:
            r9 = move-exception
            com.google.android.gms.common.internal.GmsLogger r10 = zzayb     // Catch:{ all -> 0x019e }
            java.lang.String r11 = "RemoteModelFileManager"
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019e }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x019e }
            int r1 = r1.length()     // Catch:{ all -> 0x019e }
            int r1 = r1 + 56
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r2.<init>(r1)     // Catch:{ all -> 0x019e }
            java.lang.String r1 = "Failed to copy downloaded model file to private folder: "
            r2.append(r1)     // Catch:{ all -> 0x019e }
            r2.append(r9)     // Catch:{ all -> 0x019e }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x019e }
            r10.e(r11, r9)     // Catch:{ all -> 0x019e }
            monitor-exit(r8)
            return r0
        L_0x0155:
            com.google.android.gms.internal.firebase_ml.zzmy r9 = com.google.android.gms.internal.firebase_ml.zzmy.MODEL_TYPE_MISUSE     // Catch:{ all -> 0x019e }
            com.google.android.gms.internal.firebase_ml.zzmn$zzae$zzb r10 = com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb.DOWNLOADED     // Catch:{ all -> 0x019e }
            r11.zza((com.google.android.gms.internal.firebase_ml.zzmy) r9, (boolean) r2, (com.google.firebase.ml.common.internal.modeldownload.zzp) r0, (com.google.android.gms.internal.firebase_ml.zzmn.zzae.zzb) r10)     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.FirebaseMLException r9 = new com.google.firebase.ml.common.FirebaseMLException     // Catch:{ all -> 0x019e }
            java.lang.String r10 = r0.name()     // Catch:{ all -> 0x019e }
            com.google.firebase.ml.common.internal.modeldownload.zzp r11 = r8.zzbbr     // Catch:{ all -> 0x019e }
            java.lang.String r11 = r11.name()     // Catch:{ all -> 0x019e }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x019e }
            int r0 = r0.length()     // Catch:{ all -> 0x019e }
            int r0 = r0 + 93
            java.lang.String r1 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x019e }
            int r1 = r1.length()     // Catch:{ all -> 0x019e }
            int r0 = r0 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r1.<init>(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "You are trying to use a "
            r1.append(r0)     // Catch:{ all -> 0x019e }
            r1.append(r10)     // Catch:{ all -> 0x019e }
            java.lang.String r10 = " model as a "
            r1.append(r10)     // Catch:{ all -> 0x019e }
            r1.append(r11)     // Catch:{ all -> 0x019e }
            java.lang.String r10 = " model. Please make sure you specified the correct model."
            r1.append(r10)     // Catch:{ all -> 0x019e }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x019e }
            r11 = 3
            r9.<init>(r10, r11)     // Catch:{ all -> 0x019e }
            throw r9     // Catch:{ all -> 0x019e }
        L_0x019e:
            r9 = move-exception
            monitor-exit(r8)
            goto L_0x01a2
        L_0x01a1:
            throw r9
        L_0x01a2:
            goto L_0x01a1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzab.zza(android.os.ParcelFileDescriptor, java.lang.String, com.google.firebase.ml.common.internal.modeldownload.zzu):java.io.File");
    }

    @WorkerThread
    public final synchronized boolean zzd(@NonNull File file) throws FirebaseMLException {
        File zzc = this.zzbaa.zzc(this.zzazz, this.zzbbr);
        if (!zzc.exists()) {
            return false;
        }
        boolean z = true;
        for (File file2 : zzc.listFiles()) {
            if (!file2.equals(file) && !this.zzbaa.zzc(file2)) {
                z = false;
            }
        }
        return z;
    }

    @WorkerThread
    public final synchronized void zze(@NonNull File file) {
        File zzb = this.zzbaa.zzb(this.zzazz, this.zzbbr, false);
        if (zzb.exists()) {
            for (File equals : zzb.listFiles()) {
                if (equals.equals(file)) {
                    this.zzbaa.zzc(file);
                    return;
                }
            }
        }
    }

    @WorkerThread
    public final synchronized File zzf(@NonNull File file) throws FirebaseMLException {
        File file2 = new File(String.valueOf(this.zzbaa.zzc(this.zzazz, this.zzbbr).getAbsolutePath()).concat("/0"));
        if (file2.exists()) {
            return file;
        }
        if (file.renameTo(file2)) {
            return file2;
        }
        return file;
    }

    @WorkerThread
    @Nullable
    public final synchronized String zzod() throws FirebaseMLException {
        File zzc = this.zzbaa.zzc(this.zzazz, this.zzbbr);
        int zzb = zzh.zzb(zzc);
        if (zzb < 0) {
            return null;
        }
        String absolutePath = zzc.getAbsolutePath();
        StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 12);
        sb.append(absolutePath);
        sb.append("/");
        sb.append(zzb);
        return sb.toString();
    }

    private static /* synthetic */ void zza(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                zzmj.zza(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    private static /* synthetic */ void zza(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                zzmj.zza(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
