package com.google.firebase.ml.common.internal.modeldownload;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmj;
import com.google.firebase.ml.common.modeldownload.FirebaseLocalModel;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;

public class zzf {
    private MappedByteBuffer zzbad;
    private final Context zzbae;
    private final FirebaseLocalModel zzbaf;

    public zzf(@NonNull Context context, @NonNull FirebaseLocalModel firebaseLocalModel) {
        this.zzbae = context;
        this.zzbaf = firebaseLocalModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        zza(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        if (r3 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        zza(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        throw r4;
     */
    @androidx.annotation.WorkerThread
    @androidx.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.nio.MappedByteBuffer load() throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r12 = this;
            android.content.Context r0 = r12.zzbae
            java.lang.String r1 = "Context can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r12.zzbaf
            java.lang.String r1 = "Model source can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            java.nio.MappedByteBuffer r0 = r12.zzbad
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r12.zzbaf
            java.lang.String r0 = r0.getFilePath()
            r1 = 0
            r2 = 14
            if (r0 == 0) goto L_0x006e
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x004a }
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r3 = r12.zzbaf     // Catch:{ IOException -> 0x004a }
            java.lang.String r3 = r3.getFilePath()     // Catch:{ IOException -> 0x004a }
            java.lang.String r4 = "r"
            r0.<init>(r3, r4)     // Catch:{ IOException -> 0x004a }
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch:{ all -> 0x0043 }
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0043 }
            r7 = 0
            long r9 = r5.size()     // Catch:{ all -> 0x0043 }
            java.nio.MappedByteBuffer r3 = r5.map(r6, r7, r9)     // Catch:{ all -> 0x0043 }
            r12.zzbad = r3     // Catch:{ all -> 0x0043 }
            zza((java.lang.Throwable) r1, (java.io.RandomAccessFile) r0)     // Catch:{ IOException -> 0x004a }
            java.nio.MappedByteBuffer r0 = r12.zzbad
            return r0
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r3 = move-exception
            zza((java.lang.Throwable) r1, (java.io.RandomAccessFile) r0)     // Catch:{ IOException -> 0x004a }
            throw r3     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r0 = move-exception
            com.google.firebase.ml.common.FirebaseMLException r1 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r3 = "Can not open the local file: "
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r4 = r12.zzbaf
            java.lang.String r4 = r4.getFilePath()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x0064
            java.lang.String r3 = r3.concat(r4)
            goto L_0x006a
        L_0x0064:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r3)
            r3 = r4
        L_0x006a:
            r1.<init>(r3, r2, r0)
            throw r1
        L_0x006e:
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r12.zzbaf
            java.lang.String r0 = r0.getAssetFilePath()
            if (r0 == 0) goto L_0x00db
            com.google.firebase.ml.common.modeldownload.FirebaseLocalModel r0 = r12.zzbaf
            java.lang.String r0 = r0.getAssetFilePath()
            android.content.Context r3 = r12.zzbae     // Catch:{ IOException -> 0x00b4 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x00b4 }
            android.content.res.AssetFileDescriptor r3 = r3.openFd(r0)     // Catch:{ IOException -> 0x00b4 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x00ab }
            java.io.FileDescriptor r5 = r3.getFileDescriptor()     // Catch:{ all -> 0x00ab }
            r4.<init>(r5)     // Catch:{ all -> 0x00ab }
            java.nio.channels.FileChannel r6 = r4.getChannel()     // Catch:{ all -> 0x00ab }
            long r8 = r3.getStartOffset()     // Catch:{ all -> 0x00ab }
            long r10 = r3.getDeclaredLength()     // Catch:{ all -> 0x00ab }
            java.nio.channels.FileChannel$MapMode r7 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x00ab }
            java.nio.MappedByteBuffer r4 = r6.map(r7, r8, r10)     // Catch:{ all -> 0x00ab }
            r12.zzbad = r4     // Catch:{ all -> 0x00ab }
            if (r3 == 0) goto L_0x00a8
            zza((java.lang.Throwable) r1, (android.content.res.AssetFileDescriptor) r3)     // Catch:{ IOException -> 0x00b4 }
        L_0x00a8:
            java.nio.MappedByteBuffer r0 = r12.zzbad
            return r0
        L_0x00ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r4 = move-exception
            if (r3 == 0) goto L_0x00b3
            zza((java.lang.Throwable) r1, (android.content.res.AssetFileDescriptor) r3)     // Catch:{ IOException -> 0x00b4 }
        L_0x00b3:
            throw r4     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            com.google.firebase.ml.common.FirebaseMLException r3 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 186
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Can not load the file from asset: "
            r5.append(r4)
            r5.append(r0)
            java.lang.String r0 = ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>(r0, r2, r1)
            throw r3
        L_0x00db:
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r1 = "Can not load the model. Either filePath or assetFilePath must be set for the model."
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzf.load():java.nio.MappedByteBuffer");
    }

    public final FirebaseLocalModel zznk() {
        return this.zzbaf;
    }

    private static /* synthetic */ void zza(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                zzmj.zza(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    private static /* synthetic */ void zza(Throwable th, AssetFileDescriptor assetFileDescriptor) {
        if (th != null) {
            try {
                assetFileDescriptor.close();
            } catch (Throwable th2) {
                zzmj.zza(th, th2);
            }
        } else {
            assetFileDescriptor.close();
        }
    }
}
