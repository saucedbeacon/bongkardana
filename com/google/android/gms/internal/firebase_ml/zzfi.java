package com.google.android.gms.internal.firebase_ml;

public final class zzfi extends zzgi {
    private final transient zzfg zzvi;

    private zzfi(zzgl zzgl, zzfg zzfg) {
        super(zzgl);
        this.zzvi = zzfg;
    }

    public final zzfg zzes() {
        return this.zzvi;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.google.android.gms.internal.firebase_ml.zzfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.firebase_ml.zzfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.google.android.gms.internal.firebase_ml.zzfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: com.google.android.gms.internal.firebase_ml.zzfg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.google.android.gms.internal.firebase_ml.zzfg} */
    /* JADX WARNING: type inference failed for: r2v28, types: [com.google.android.gms.internal.firebase_ml.zzha, com.google.android.gms.internal.firebase_ml.zzfg] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c A[SYNTHETIC, Splitter:B:30:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[Catch:{ IOException -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x009a A[SYNTHETIC, Splitter:B:47:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009e A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00aa A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0 A[Catch:{ IOException -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.firebase_ml.zzfi zza(com.google.android.gms.internal.firebase_ml.zzhd r5, com.google.android.gms.internal.firebase_ml.zzgj r6) {
        /*
            com.google.android.gms.internal.firebase_ml.zzgl r0 = new com.google.android.gms.internal.firebase_ml.zzgl
            int r1 = r6.getStatusCode()
            java.lang.String r2 = r6.getStatusMessage()
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r6.zzfm()
            r0.<init>(r1, r2, r3)
            com.google.android.gms.internal.firebase_ml.zzlp.checkNotNull(r5)
            r1 = 0
            boolean r2 = r6.zzft()     // Catch:{ IOException -> 0x00bf }
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = "application/json; charset=UTF-8"
            java.lang.String r3 = r6.getContentType()     // Catch:{ IOException -> 0x00bf }
            boolean r2 = com.google.android.gms.internal.firebase_ml.zzgf.zzb(r2, r3)     // Catch:{ IOException -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            java.io.InputStream r2 = r6.getContent()     // Catch:{ IOException -> 0x00bf }
            if (r2 == 0) goto L_0x00b8
            java.io.InputStream r2 = r6.getContent()     // Catch:{ IOException -> 0x0092, all -> 0x008e }
            com.google.android.gms.internal.firebase_ml.zzhh r5 = r5.zza(r2)     // Catch:{ IOException -> 0x0092, all -> 0x008e }
            com.google.android.gms.internal.firebase_ml.zzhj r2 = r5.zzgr()     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            if (r2 != 0) goto L_0x003f
            com.google.android.gms.internal.firebase_ml.zzhj r2 = r5.zzgq()     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
        L_0x003f:
            if (r2 == 0) goto L_0x0079
            java.lang.String r2 = "error"
            java.util.Set r2 = java.util.Collections.singleton(r2)     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            r5.zza(r2)     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzhj r2 = r5.zzgr()     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzhj r3 = com.google.android.gms.internal.firebase_ml.zzhj.VALUE_STRING     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            if (r2 != r3) goto L_0x0057
            java.lang.String r2 = r5.getText()     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            goto L_0x007a
        L_0x0057:
            com.google.android.gms.internal.firebase_ml.zzhj r2 = r5.zzgr()     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzhj r3 = com.google.android.gms.internal.firebase_ml.zzhj.START_OBJECT     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            if (r2 != r3) goto L_0x0079
            java.lang.Class<com.google.android.gms.internal.firebase_ml.zzfg> r2 = com.google.android.gms.internal.firebase_ml.zzfg.class
            java.lang.Object r2 = r5.zza(r2, r1)     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            com.google.android.gms.internal.firebase_ml.zzfg r2 = (com.google.android.gms.internal.firebase_ml.zzfg) r2     // Catch:{ IOException -> 0x008b, all -> 0x0088 }
            java.lang.String r1 = r2.zzgg()     // Catch:{ IOException -> 0x0074, all -> 0x006f }
            r4 = r2
            r2 = r1
            r1 = r4
            goto L_0x007a
        L_0x006f:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x00a8
        L_0x0074:
            r3 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0095
        L_0x0079:
            r2 = r1
        L_0x007a:
            if (r5 != 0) goto L_0x0082
            r6.ignore()     // Catch:{ IOException -> 0x0080 }
            goto L_0x00c4
        L_0x0080:
            r5 = move-exception
            goto L_0x00c1
        L_0x0082:
            if (r1 != 0) goto L_0x00c4
            r5.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x00c4
        L_0x0088:
            r2 = move-exception
            r3 = r1
            goto L_0x00a8
        L_0x008b:
            r2 = move-exception
            r3 = r1
            goto L_0x0095
        L_0x008e:
            r2 = move-exception
            r5 = r1
            r3 = r5
            goto L_0x00a8
        L_0x0092:
            r2 = move-exception
            r5 = r1
            r3 = r5
        L_0x0095:
            com.google.android.gms.internal.firebase_ml.zzmj.zzb(r2)     // Catch:{ all -> 0x00a7 }
            if (r5 != 0) goto L_0x009e
            r6.ignore()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c6
        L_0x009e:
            if (r3 != 0) goto L_0x00a4
            r5.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00c6
        L_0x00a4:
            r2 = r1
            r1 = r3
            goto L_0x00c4
        L_0x00a7:
            r2 = move-exception
        L_0x00a8:
            if (r5 == 0) goto L_0x00b0
            if (r3 != 0) goto L_0x00b3
            r5.close()     // Catch:{ IOException -> 0x00b4 }
            goto L_0x00b3
        L_0x00b0:
            r6.ignore()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b3:
            throw r2     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            r5 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x00c1
        L_0x00b8:
            java.lang.String r5 = r6.zzfu()     // Catch:{ IOException -> 0x00bf }
            r3 = r1
            r1 = r5
            goto L_0x00c6
        L_0x00bf:
            r5 = move-exception
            r2 = r1
        L_0x00c1:
            com.google.android.gms.internal.firebase_ml.zzmj.zzb(r5)
        L_0x00c4:
            r3 = r1
            r1 = r2
        L_0x00c6:
            java.lang.StringBuilder r5 = com.google.android.gms.internal.firebase_ml.zzgi.zzc(r6)
            boolean r6 = com.google.android.gms.internal.firebase_ml.zzlx.zzaz(r1)
            if (r6 != 0) goto L_0x00db
            java.lang.String r6 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r5.append(r6)
            r5.append(r1)
            r0.zzaf(r1)
        L_0x00db:
            java.lang.String r5 = r5.toString()
            r0.zzae(r5)
            com.google.android.gms.internal.firebase_ml.zzfi r5 = new com.google.android.gms.internal.firebase_ml.zzfi
            r5.<init>(r0, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzfi.zza(com.google.android.gms.internal.firebase_ml.zzhd, com.google.android.gms.internal.firebase_ml.zzgj):com.google.android.gms.internal.firebase_ml.zzfi");
    }
}
