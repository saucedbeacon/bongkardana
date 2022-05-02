package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ml.common.FirebaseMLException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;

public final class zza implements zzi {
    private static char[] getMin = null;
    private static int length = 0;
    private static int setMax = 1;
    private static final GmsLogger zzayb;
    private final FirebaseApp firebaseApp;
    private final String zzazz;
    private final zzh zzbaa;

    zza(@NonNull FirebaseApp firebaseApp2, @NonNull String str) {
        this.firebaseApp = firebaseApp2;
        this.zzazz = str;
        this.zzbaa = new zzh(firebaseApp2);
    }

    static void getMax() {
        getMin = new char[]{'-', 'Y', 'R', Typography.greater, '7'};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010b, code lost:
        if (r12.length() != 0) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0122, code lost:
        if ((r12.length() == 0) != true) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0129, code lost:
        r12 = new java.lang.String("Failed to delete the temp model file: ");
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File zza(java.io.File r12) throws com.google.firebase.ml.common.FirebaseMLException {
        /*
            r11 = this;
            com.google.firebase.ml.common.internal.modeldownload.zzh r0 = r11.zzbaa
            java.lang.String r1 = r11.zzazz
            com.google.firebase.ml.common.internal.modeldownload.zzp r2 = com.google.firebase.ml.common.internal.modeldownload.zzp.AUTOML
            java.io.File r0 = r0.zzc(r1, r2)
            int r1 = com.google.firebase.ml.common.internal.modeldownload.zzh.zzb(r0)
            java.io.File r2 = new java.io.File
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2.<init>(r0, r1)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "model.tflite"
            r0.<init>(r2, r1)
            java.io.File r2 = r0.getParentFile()
            boolean r4 = r2.exists()
            r5 = 0
            if (r4 != 0) goto L_0x002d
            r4 = 0
            goto L_0x002e
        L_0x002d:
            r4 = 1
        L_0x002e:
            r6 = 2
            if (r4 == 0) goto L_0x0032
            goto L_0x0052
        L_0x0032:
            int r4 = setMax
            int r4 = r4 + 93
            int r7 = r4 % 128
            length = r7
            int r4 = r4 % r6
            if (r4 == 0) goto L_0x0046
            r2.mkdirs()
            r4 = 17
            int r4 = r4 / r5
            goto L_0x0049
        L_0x0044:
            r12 = move-exception
            throw r12
        L_0x0046:
            r2.mkdirs()
        L_0x0049:
            int r4 = length     // Catch:{ Exception -> 0x0173 }
            int r4 = r4 + 63
            int r7 = r4 % 128
            setMax = r7     // Catch:{ Exception -> 0x0173 }
            int r4 = r4 % r6
        L_0x0052:
            com.google.firebase.FirebaseApp r4 = r11.firebaseApp
            java.lang.String r7 = r11.zzazz
            java.io.File r4 = zza((com.google.firebase.FirebaseApp) r4, (java.lang.String) r7)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "labels.txt"
            r7.<init>(r2, r8)
            boolean r9 = r12.renameTo(r0)
            java.lang.String r10 = "AutoMLModelFileManager"
            if (r9 == 0) goto L_0x00d2
            boolean r9 = r4.renameTo(r7)
            if (r9 == 0) goto L_0x00d2
            com.google.android.gms.common.internal.GmsLogger r12 = zzayb
            java.lang.String r4 = "Rename to serving model successfully"
            r12.d(r10, r4)
            r0.setExecutable(r5)
            r0.setWritable(r5)
            r7.setExecutable(r5)
            r7.setWritable(r5)
            java.io.File r12 = new java.io.File
            java.lang.String r4 = "manifest.json"
            r12.<init>(r2, r4)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "IMAGE_LABELING"
            r2[r5] = r4
            r2[r3] = r1
            r2[r6] = r8
            java.lang.String r1 = "{\n\t\"modelType\": \"%s\",\n\t\"modelFile\": \"%s\",\n\t\"labelsFile\": \"%s\"\n}"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            com.google.firebase.ml.common.internal.modeldownload.zzc r2 = new com.google.firebase.ml.common.internal.modeldownload.zzc     // Catch:{ IOException -> 0x00b0 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00b0 }
            zza((java.io.File) r12, (com.google.firebase.ml.common.internal.modeldownload.zze) r2)     // Catch:{ IOException -> 0x00b0 }
            int r12 = length
            int r12 = r12 + 117
            int r1 = r12 % 128
            setMax = r1
            int r12 = r12 % r6
            java.io.File r12 = r0.getParentFile()
            return r12
        L_0x00b0:
            r12 = move-exception
            com.google.firebase.ml.common.FirebaseMLException r0 = new com.google.firebase.ml.common.FirebaseMLException
            java.lang.String r1 = "Failed to write manifest json for the AutoML model: "
            java.lang.String r2 = r11.zzazz
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r3 = r2.length()
            if (r3 == 0) goto L_0x00c6
            java.lang.String r1 = r1.concat(r2)
            goto L_0x00cc
        L_0x00c6:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r1 = r2
        L_0x00cc:
            r2 = 13
            r0.<init>(r1, r2, r12)
            throw r0
        L_0x00d2:
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb
            java.lang.String r1 = "Rename to serving model failed, remove the temp file."
            r0.d(r10, r1)
            boolean r0 = r12.delete()
            if (r0 != 0) goto L_0x00e1
            r0 = 0
            goto L_0x00e2
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            if (r0 == 0) goto L_0x00e5
            goto L_0x0131
        L_0x00e5:
            int r0 = setMax
            int r0 = r0 + 5
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % r6
            r1 = 32
            r2 = 84
            if (r0 == 0) goto L_0x00f7
            r0 = 32
            goto L_0x00f9
        L_0x00f7:
            r0 = 84
        L_0x00f9:
            java.lang.String r7 = "Failed to delete the temp model file: "
            if (r0 == r1) goto L_0x010e
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r1 = r12.length()
            if (r1 == 0) goto L_0x0129
            goto L_0x0124
        L_0x010e:
            com.google.android.gms.common.internal.GmsLogger r0 = zzayb
            java.lang.String r12 = r12.getAbsolutePath()
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r1 = r12.length()
            int r2 = r2 / r5
            if (r1 == 0) goto L_0x0121
            r1 = 0
            goto L_0x0122
        L_0x0121:
            r1 = 1
        L_0x0122:
            if (r1 == r3) goto L_0x0129
        L_0x0124:
            java.lang.String r12 = r7.concat(r12)
            goto L_0x012e
        L_0x0129:
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7)
        L_0x012e:
            r0.d(r10, r12)
        L_0x0131:
            boolean r12 = r4.delete()     // Catch:{ Exception -> 0x016f }
            if (r12 != 0) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r5 = 1
        L_0x0139:
            if (r5 == r3) goto L_0x016d
            int r12 = setMax     // Catch:{ Exception -> 0x016f }
            int r12 = r12 + 49
            int r0 = r12 % 128
            length = r0     // Catch:{ Exception -> 0x016f }
            int r12 = r12 % r6
            com.google.android.gms.common.internal.GmsLogger r12 = zzayb
            java.lang.String r0 = "Failed to delete the temp labels file: "
            java.lang.String r1 = r4.getAbsolutePath()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r1.length()
            if (r2 == 0) goto L_0x0164
            int r2 = length
            int r2 = r2 + 77
            int r3 = r2 % 128
            setMax = r3
            int r2 = r2 % r6
            java.lang.String r0 = r0.concat(r1)
            goto L_0x016a
        L_0x0164:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x016a:
            r12.d(r10, r0)
        L_0x016d:
            r12 = 0
            return r12
        L_0x016f:
            r12 = move-exception
            throw r12
        L_0x0171:
            r12 = move-exception
            throw r12
        L_0x0173:
            r12 = move-exception
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zza.zza(java.io.File):java.io.File");
    }

    @VisibleForTesting
    public static void zza(@NonNull FirebaseApp firebaseApp2, @NonNull String str, @NonNull List<String> list) throws FirebaseMLException {
        String str2;
        try {
            zza(zza(firebaseApp2, str), (zze) new zzb(list));
            int i = length + 123;
            setMax = i % 128;
            int i2 = i % 2;
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Failed to write labels file for the AutoML model: ".concat(valueOf);
                int i3 = length + 31;
                setMax = i3 % 128;
                int i4 = i3 % 2;
            } else {
                str2 = new String("Failed to write labels file for the AutoML model: ");
            }
            throw new FirebaseMLException(str2, 13, e);
        }
    }

    @VisibleForTesting
    public static File zza(@NonNull FirebaseApp firebaseApp2, @NonNull String str) throws FirebaseMLException {
        String str2;
        String str3;
        try {
            File zzd = new zzh(firebaseApp2).zzd(str, zzp.AUTOML);
            if ((zzd.exists() ? ';' : 12) == ';') {
                if (!(!zzd.isFile()) && !zzd.delete()) {
                    String valueOf = String.valueOf(zzd.getAbsolutePath());
                    if (valueOf.length() != 0) {
                        str3 = "Failed to delete the temp labels file: ".concat(valueOf);
                        int i = setMax + 27;
                        length = i % 128;
                        int i2 = i % 2;
                    } else {
                        str3 = new String("Failed to delete the temp labels file: ");
                    }
                    throw new FirebaseMLException(str3, 13);
                }
            }
            try {
                if (!zzd.exists()) {
                    GmsLogger gmsLogger = zzayb;
                    String valueOf2 = String.valueOf(zzd.getAbsolutePath());
                    if (valueOf2.length() != 0) {
                        str2 = "Temp labels folder does not exist, creating one: ".concat(valueOf2);
                        int i3 = length + 87;
                        setMax = i3 % 128;
                        int i4 = i3 % 2;
                    } else {
                        str2 = new String("Temp labels folder does not exist, creating one: ");
                    }
                    gmsLogger.d("AutoMLModelFileManager", str2);
                    if (!zzd.mkdirs()) {
                        throw new FirebaseMLException("Failed to create a directory to hold the AutoML model's labels file.", 13);
                    }
                }
                return new File(zzd, "labels.txt");
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r5 = length + 79;
        setMax = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        com.google.android.gms.internal.firebase_ml.zzmj.zza(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(java.io.File r5, com.google.firebase.ml.common.internal.modeldownload.zze r6) throws java.io.IOException {
        /*
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r5)
            r5 = 4
            int[] r5 = new int[r5]
            r5 = {0, 5, 5, 0} // fill-array
            r3 = 5
            byte[] r3 = new byte[r3]
            r3 = {0, 1, 0, 1, 1} // fill-array
            r4 = 0
            boolean r4 = android.mtp.MtpConstants.isAbstractObject(r4)
            java.lang.String r5 = setMax(r5, r3, r4)
            java.lang.String r5 = r5.intern()
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)
            r1.<init>(r2, r5)
            r0.<init>(r1)
            r6.zza(r0)     // Catch:{ all -> 0x004c }
            r0.close()
            int r5 = length
            int r5 = r5 + 51
            int r6 = r5 % 128
            setMax = r6
            int r5 = r5 % 2
            r6 = 15
            if (r5 != 0) goto L_0x0042
            r5 = 3
            goto L_0x0044
        L_0x0042:
            r5 = 15
        L_0x0044:
            if (r5 == r6) goto L_0x004b
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r5 = move-exception
            throw r5
        L_0x004b:
            return
        L_0x004c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r6 = move-exception
            r0.close()     // Catch:{ all -> 0x005d }
            int r5 = length
            int r5 = r5 + 79
            int r0 = r5 % 128
            setMax = r0
            int r5 = r5 % 2
            goto L_0x0061
        L_0x005d:
            r0 = move-exception
            com.google.android.gms.internal.firebase_ml.zzmj.zza(r5, r0)
        L_0x0061:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zza.zza(java.io.File, com.google.firebase.ml.common.internal.modeldownload.zze):void");
    }

    static final /* synthetic */ void zza(List list, BufferedWriter bufferedWriter) throws IOException {
        int i = setMax + 3;
        length = i % 128;
        int i2 = i % 2;
        try {
            Iterator it = list.iterator();
            int i3 = length + 115;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            while (true) {
                if (it.hasNext()) {
                    try {
                        bufferedWriter.write((String) it.next());
                        bufferedWriter.newLine();
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    return;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static final /* synthetic */ void zza(String str, BufferedWriter bufferedWriter) throws IOException {
        int i = setMax + 3;
        length = i % 128;
        boolean z = false;
        Object[] objArr = null;
        if (!(i % 2 != 0)) {
            try {
                bufferedWriter.write(str);
            } catch (Exception e) {
                throw e;
            }
        } else {
            bufferedWriter.write(str);
            int length2 = objArr.length;
        }
        int i2 = setMax + 45;
        length = i2 % 128;
        if (i2 % 2 == 0) {
            z = true;
        }
        if (!z) {
            super.hashCode();
        }
    }

    static {
        try {
            getMax();
            zzayb = new GmsLogger("AutoMLModelFileManager", "");
            int i = setMax + 111;
            length = i % 128;
            int i2 = i % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String setMax(int[] iArr, byte[] bArr, boolean z) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(getMin, i, cArr, 0, i2);
        if (!(bArr == null)) {
            try {
                int i5 = setMax + 9;
                length = i5 % 128;
                int i6 = i5 % 2;
                char[] cArr2 = new char[i2];
                int i7 = 0;
                char c = 0;
                while (i7 < i2) {
                    try {
                        int i8 = length + 61;
                        setMax = i8 % 128;
                        if (i8 % 2 != 0 ? bArr[i7] != 1 : bArr[i7] != 0) {
                            cArr2[i7] = (char) ((cArr[i7] << 1) - c);
                        } else {
                            cArr2[i7] = (char) (((cArr[i7] << 1) + 1) - c);
                        }
                        c = cArr2[i7];
                        i7++;
                    } catch (Exception e) {
                        throw e;
                    }
                }
                int i9 = setMax + 53;
                length = i9 % 128;
                int i10 = i9 % 2;
                cArr = cArr2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        if ((i4 > 0 ? '4' : 9) == '4') {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i11 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i11, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i11);
        }
        if ((z ? 18 : 'a') != 'a') {
            char[] cArr4 = new char[i2];
            for (int i12 = 0; i12 < i2; i12++) {
                int i13 = setMax + 9;
                length = i13 % 128;
                int i14 = i13 % 2;
                cArr4[i12] = cArr[(i2 - i12) - 1];
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            for (int i15 = 0; i15 < i2; i15++) {
                cArr[i15] = (char) (cArr[i15] - iArr[2]);
            }
        }
        String str = new String(cArr);
        int i16 = length + 57;
        setMax = i16 % 128;
        if (i16 % 2 != 0) {
            return str;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return str;
    }
}
