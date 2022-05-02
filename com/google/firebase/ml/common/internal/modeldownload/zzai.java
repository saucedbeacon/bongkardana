package com.google.firebase.ml.common.internal.modeldownload;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import java.io.File;
import java.io.IOException;

public final class zzai {
    private static final GmsLogger zzayb = new GmsLogger("RemoteModelUtils", "");
    private final zzr zzbcb;

    zzai(@NonNull zzr zzr) {
        Preconditions.checkNotNull(zzr);
        this.zzbcb = zzr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        zzayb.e("RemoteModelUtils", "Cannot read the temp file for SHA-256 check");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r3 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        zzayb.e("RemoteModelUtils", "Temp file is not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        if (r3 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        zzayb.e("RemoteModelUtils", "Do not have SHA-256 algorithm");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        if (r3 != null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0079, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
        r1.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:22:0x004f, B:28:0x005d, B:34:0x006b] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x006b=Splitter:B:34:0x006b, B:28:0x005d=Splitter:B:28:0x005d, B:22:0x004f=Splitter:B:22:0x004f} */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzh(java.io.File r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "RemoteModelUtils"
            r1 = 0
            java.lang.String r2 = "SHA-256"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x005c, IOException -> 0x004e, all -> 0x004c }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x005c, IOException -> 0x004e, all -> 0x004c }
            r3.<init>(r8)     // Catch:{ NoSuchAlgorithmException -> 0x006a, FileNotFoundException -> 0x005c, IOException -> 0x004e, all -> 0x004c }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
        L_0x0012:
            int r4 = r3.read(r8)     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x001e
            r2.update(r8, r6, r4)     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            goto L_0x0012
        L_0x001e:
            byte[] r8 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r2.<init>()     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
        L_0x0027:
            int r4 = r8.length     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            if (r6 >= r4) goto L_0x0044
            byte r4 = r8[r6]     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            int r5 = r4.length()     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r7 = 1
            if (r5 != r7) goto L_0x003e
            r5 = 48
            r2.append(r5)     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
        L_0x003e:
            r2.append(r4)     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0044:
            java.lang.String r8 = r2.toString()     // Catch:{ NoSuchAlgorithmException -> 0x006b, FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r3.close()
            return r8
        L_0x004c:
            r8 = move-exception
            goto L_0x007a
        L_0x004e:
            r3 = r1
        L_0x004f:
            com.google.android.gms.common.internal.GmsLogger r8 = zzayb     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "Cannot read the temp file for SHA-256 check"
            r8.e(r0, r2)     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0077
            r3.close()
            goto L_0x0077
        L_0x005c:
            r3 = r1
        L_0x005d:
            com.google.android.gms.common.internal.GmsLogger r8 = zzayb     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "Temp file is not found"
            r8.e(r0, r2)     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0077
            r3.close()
            goto L_0x0077
        L_0x006a:
            r3 = r1
        L_0x006b:
            com.google.android.gms.common.internal.GmsLogger r8 = zzayb     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = "Do not have SHA-256 algorithm"
            r8.e(r0, r2)     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0077
            r3.close()
        L_0x0077:
            return r1
        L_0x0078:
            r8 = move-exception
            r1 = r3
        L_0x007a:
            if (r1 == 0) goto L_0x007f
            r1.close()
        L_0x007f:
            goto L_0x0081
        L_0x0080:
            throw r8
        L_0x0081:
            goto L_0x0080
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.ml.common.internal.modeldownload.zzai.zzh(java.io.File):java.lang.String");
    }

    static boolean zza(@NonNull File file, @NonNull String str) {
        String str2;
        try {
            str2 = zzh(file);
        } catch (IOException unused) {
            GmsLogger gmsLogger = zzayb;
            String valueOf = String.valueOf(file.getAbsolutePath());
            gmsLogger.d("RemoteModelUtils", valueOf.length() != 0 ? "Failed to close the tmp FileInputStream: ".concat(valueOf) : new String("Failed to close the tmp FileInputStream: "));
            str2 = "";
        }
        GmsLogger gmsLogger2 = zzayb;
        String valueOf2 = String.valueOf(str2);
        gmsLogger2.d("RemoteModelUtils", valueOf2.length() != 0 ? "Calculated hash value is: ".concat(valueOf2) : new String("Calculated hash value is: "));
        return str.equals(str2);
    }

    /* access modifiers changed from: package-private */
    public final zzq zzb(File file, zzu zzu) {
        return this.zzbcb.zza(file, zzu);
    }
}
