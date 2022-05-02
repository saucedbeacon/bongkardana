package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

@KeepForSdk
public class LibraryVersion {
    private static final GmsLogger zza = new GmsLogger("LibraryVersion", "");
    private static LibraryVersion zzb = new LibraryVersion();
    private ConcurrentHashMap<String, String> zzc = new ConcurrentHashMap<>();

    @KeepForSdk
    public static LibraryVersion getInstance() {
        return zzb;
    }

    @VisibleForTesting
    protected LibraryVersion() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c8  */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getVersion(@androidx.annotation.NonNull java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r9.zzc
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L_0x001a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.zzc
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L_0x001a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0093 }
            r6 = 0
            r5[r6] = r10     // Catch:{ IOException -> 0x0093 }
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch:{ IOException -> 0x0093 }
            java.lang.Class<com.google.android.gms.common.internal.LibraryVersion> r5 = com.google.android.gms.common.internal.LibraryVersion.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch:{ IOException -> 0x0093 }
            if (r4 == 0) goto L_0x006a
            r2.load(r4)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            com.google.android.gms.common.internal.GmsLogger r2 = zza     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            int r5 = r5.length()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            int r5 = r5 + 12
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            int r6 = r6.length()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r6.append(r10)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = " version is "
            r6.append(r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r6.append(r3)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = r6.toString()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r2.v(r1, r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            goto L_0x0083
        L_0x006a:
            com.google.android.gms.common.internal.GmsLogger r2 = zza     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            int r6 = r5.length()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            if (r6 == 0) goto L_0x007b
            java.lang.String r5 = r0.concat(r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            goto L_0x0080
        L_0x007b:
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
        L_0x0080:
            r2.w(r1, r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
        L_0x0083:
            if (r4 == 0) goto L_0x00b5
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r4)
            goto L_0x00b5
        L_0x0089:
            r10 = move-exception
            r3 = r4
            goto L_0x00c6
        L_0x008c:
            r2 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0095
        L_0x0091:
            r10 = move-exception
            goto L_0x00c6
        L_0x0093:
            r2 = move-exception
            r4 = r3
        L_0x0095:
            com.google.android.gms.common.internal.GmsLogger r5 = zza     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0091 }
            int r7 = r6.length()     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x00a6
            java.lang.String r0 = r0.concat(r6)     // Catch:{ all -> 0x0091 }
            goto L_0x00ac
        L_0x00a6:
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0091 }
            r6.<init>(r0)     // Catch:{ all -> 0x0091 }
            r0 = r6
        L_0x00ac:
            r5.e(r1, r0, r2)     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x00b4
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3)
        L_0x00b4:
            r3 = r4
        L_0x00b5:
            if (r3 != 0) goto L_0x00c0
            com.google.android.gms.common.internal.GmsLogger r0 = zza
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.d(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        L_0x00c0:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.zzc
            r0.put(r10, r3)
            return r3
        L_0x00c6:
            if (r3 == 0) goto L_0x00cb
            com.google.android.gms.common.util.IOUtils.closeQuietly((java.io.Closeable) r3)
        L_0x00cb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.LibraryVersion.getVersion(java.lang.String):java.lang.String");
    }
}
