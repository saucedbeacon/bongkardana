package com.google.android.gms.internal.firebase_ml;

public final class zzge {
    private final zzgn zzvj;
    private zzis zzvm;
    private String zzvy;
    private zzfy zzws;
    private zzga zzwx;
    private zzgd zzwy = new zzgd();
    private zzgd zzwz = new zzgd();
    private int zzxa = 10;
    private int zzxb = 16384;
    private boolean zzxc = true;
    private boolean zzxd = true;
    private zzfz zzxe;
    private zzfw zzxf;
    private int zzxg = 20000;
    private int zzxh = 20000;
    private zzgk zzxi;
    private boolean zzxj = true;
    private boolean zzxk = true;
    @Deprecated
    private boolean zzxl = false;
    private zziu zzxm = zziu.zzadc;

    zzge(zzgn zzgn, String str) {
        this.zzvj = zzgn;
        zzac((String) null);
    }

    public final zzgn zzfh() {
        return this.zzvj;
    }

    public final String getRequestMethod() {
        return this.zzvy;
    }

    public final zzge zzac(String str) {
        zzlp.checkArgument(str == null || zzgf.zzad(str));
        this.zzvy = str;
        return this;
    }

    public final zzfw zzfi() {
        return this.zzxf;
    }

    public final zzge zza(zzfw zzfw) {
        this.zzxf = (zzfw) zzlp.checkNotNull(zzfw);
        return this;
    }

    public final zzfz zzfj() {
        return this.zzxe;
    }

    public final zzge zza(zzfz zzfz) {
        this.zzxe = zzfz;
        return this;
    }

    public final zzge zza(zzfy zzfy) {
        this.zzws = zzfy;
        return this;
    }

    public final int zzfk() {
        return this.zzxb;
    }

    public final boolean zzfl() {
        return this.zzxc;
    }

    public final zzge zzab(int i) {
        zzlp.checkArgument(true);
        this.zzxg = 5000;
        return this;
    }

    public final zzge zzac(int i) {
        zzlp.checkArgument(true);
        this.zzxh = 10000;
        return this;
    }

    public final zzgd zzfm() {
        return this.zzwy;
    }

    public final zzgd zzfn() {
        return this.zzwz;
    }

    public final zzge zza(zzga zzga) {
        this.zzwx = zzga;
        return this;
    }

    public final zzgk zzfo() {
        return this.zzxi;
    }

    public final zzge zza(zzgk zzgk) {
        this.zzxi = zzgk;
        return this;
    }

    public final zzge zza(zzis zzis) {
        this.zzvm = zzis;
        return this;
    }

    public final zzis zzfp() {
        return this.zzvm;
    }

    public final boolean zzfq() {
        return this.zzxk;
    }

    /* JADX WARNING: type inference failed for: r3v16, types: [com.google.android.gms.internal.firebase_ml.zziw, com.google.android.gms.internal.firebase_ml.zzgb] */
    /* JADX WARNING: type inference failed for: r15v1, types: [com.google.android.gms.internal.firebase_ml.zziq] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0280 A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02a8 A[LOOP:0: B:5:0x0019->B:122:0x02a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x028a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0221 A[Catch:{ all -> 0x02ab }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.firebase_ml.zzgj zzfr() throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.zzxa
            if (r0 < 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            com.google.android.gms.internal.firebase_ml.zzlp.checkArgument(r0)
            int r0 = r1.zzxa
            java.lang.String r4 = r1.zzvy
            com.google.android.gms.internal.firebase_ml.zzlp.checkNotNull(r4)
            com.google.android.gms.internal.firebase_ml.zzfw r4 = r1.zzxf
            com.google.android.gms.internal.firebase_ml.zzlp.checkNotNull(r4)
            r5 = 0
        L_0x0019:
            if (r5 == 0) goto L_0x001e
            r5.ignore()
        L_0x001e:
            com.google.android.gms.internal.firebase_ml.zzga r5 = r1.zzwx
            if (r5 == 0) goto L_0x0025
            r5.zzb(r1)
        L_0x0025:
            com.google.android.gms.internal.firebase_ml.zzfw r5 = r1.zzxf
            java.lang.String r5 = r5.zzfg()
            com.google.android.gms.internal.firebase_ml.zzgn r6 = r1.zzvj
            java.lang.String r7 = r1.zzvy
            com.google.android.gms.internal.firebase_ml.zzgm r6 = r6.zzc(r7, r5)
            java.util.logging.Logger r7 = com.google.android.gms.internal.firebase_ml.zzgn.zzye
            boolean r8 = r1.zzxc
            if (r8 == 0) goto L_0x0043
            java.util.logging.Level r8 = java.util.logging.Level.CONFIG
            boolean r8 = r7.isLoggable(r8)
            if (r8 == 0) goto L_0x0043
            r8 = 1
            goto L_0x0044
        L_0x0043:
            r8 = 0
        L_0x0044:
            java.lang.String r9 = "GET"
            if (r8 == 0) goto L_0x0087
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "-------------- REQUEST  --------------"
            r10.append(r11)
            java.lang.String r11 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r10.append(r11)
            java.lang.String r11 = r1.zzvy
            r10.append(r11)
            r11 = 32
            r10.append(r11)
            r10.append(r5)
            java.lang.String r11 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r10.append(r11)
            boolean r11 = r1.zzxd
            if (r11 == 0) goto L_0x0088
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "curl -v --compressed"
            r11.<init>(r12)
            java.lang.String r12 = r1.zzvy
            boolean r12 = r12.equals(r9)
            if (r12 != 0) goto L_0x0089
            java.lang.String r12 = " -X "
            r11.append(r12)
            java.lang.String r12 = r1.zzvy
            r11.append(r12)
            goto L_0x0089
        L_0x0087:
            r10 = 0
        L_0x0088:
            r11 = 0
        L_0x0089:
            com.google.android.gms.internal.firebase_ml.zzgd r12 = r1.zzwy
            java.lang.String r12 = r12.getUserAgent()
            if (r12 != 0) goto L_0x0099
            com.google.android.gms.internal.firebase_ml.zzgd r13 = r1.zzwy
            java.lang.String r14 = "Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)"
            r13.zzab(r14)
            goto L_0x00b9
        L_0x0099:
            com.google.android.gms.internal.firebase_ml.zzgd r13 = r1.zzwy
            java.lang.String r14 = java.lang.String.valueOf(r12)
            int r14 = r14.length()
            int r14 = r14 + 47
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r14)
            r15.append(r12)
            java.lang.String r14 = " Google-HTTP-Java-Client/1.26.0-SNAPSHOT (gzip)"
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            r13.zzab(r14)
        L_0x00b9:
            com.google.android.gms.internal.firebase_ml.zzgd r13 = r1.zzwy
            com.google.android.gms.internal.firebase_ml.zzgd.zza(r13, r10, r11, r7, r6)
            com.google.android.gms.internal.firebase_ml.zzgd r13 = r1.zzwy
            r13.zzab(r12)
            com.google.android.gms.internal.firebase_ml.zzfz r12 = r1.zzxe
            if (r12 == 0) goto L_0x00ca
            r12.zzff()
        L_0x00ca:
            java.lang.String r13 = "'"
            if (r12 == 0) goto L_0x01ce
            com.google.android.gms.internal.firebase_ml.zzfz r14 = r1.zzxe
            java.lang.String r14 = r14.getType()
            if (r8 == 0) goto L_0x00e2
            com.google.android.gms.internal.firebase_ml.zziq r15 = new com.google.android.gms.internal.firebase_ml.zziq
            java.util.logging.Logger r2 = com.google.android.gms.internal.firebase_ml.zzgn.zzye
            java.util.logging.Level r3 = java.util.logging.Level.CONFIG
            int r4 = r1.zzxb
            r15.<init>(r12, r2, r3, r4)
            r12 = r15
        L_0x00e2:
            com.google.android.gms.internal.firebase_ml.zzfy r2 = r1.zzws
            if (r2 != 0) goto L_0x00ee
            com.google.android.gms.internal.firebase_ml.zzfz r2 = r1.zzxe
            long r2 = r2.getLength()
            r4 = 0
            goto L_0x0101
        L_0x00ee:
            java.lang.String r2 = r2.getName()
            com.google.android.gms.internal.firebase_ml.zzgb r3 = new com.google.android.gms.internal.firebase_ml.zzgb
            com.google.android.gms.internal.firebase_ml.zzfy r4 = r1.zzws
            r3.<init>(r12, r4)
            long r16 = com.google.android.gms.internal.firebase_ml.zzik.zzb(r3)
            r4 = r2
            r12 = r3
            r2 = r16
        L_0x0101:
            if (r8 == 0) goto L_0x01b6
            java.lang.String r15 = " -H '"
            if (r14 == 0) goto L_0x014e
            r16 = r9
            java.lang.String r9 = "Content-Type: "
            java.lang.String r1 = java.lang.String.valueOf(r14)
            int r17 = r1.length()
            if (r17 == 0) goto L_0x011a
            java.lang.String r1 = r9.concat(r1)
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r9)
        L_0x011f:
            r10.append(r1)
            java.lang.String r9 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r10.append(r9)
            if (r11 == 0) goto L_0x014b
            java.lang.String r9 = java.lang.String.valueOf(r1)
            int r9 = r9.length()
            int r9 = r9 + 6
            r17 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r15)
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
            goto L_0x0152
        L_0x014b:
            r17 = r0
            goto L_0x0152
        L_0x014e:
            r17 = r0
            r16 = r9
        L_0x0152:
            if (r4 == 0) goto L_0x0194
            java.lang.String r0 = "Content-Encoding: "
            java.lang.String r1 = java.lang.String.valueOf(r4)
            int r9 = r1.length()
            if (r9 == 0) goto L_0x0165
            java.lang.String r0 = r0.concat(r1)
            goto L_0x016b
        L_0x0165:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x016b:
            r10.append(r0)
            java.lang.String r1 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r10.append(r1)
            if (r11 == 0) goto L_0x0194
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r1)
            r9.append(r15)
            r9.append(r0)
            r9.append(r13)
            java.lang.String r0 = r9.toString()
            r11.append(r0)
        L_0x0194:
            r0 = 0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x01ba
            r0 = 36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Content-Length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r10.append(r0)
            java.lang.String r0 = com.google.android.gms.internal.firebase_ml.zziv.zzadd
            r10.append(r0)
            goto L_0x01ba
        L_0x01b6:
            r17 = r0
            r16 = r9
        L_0x01ba:
            if (r11 == 0) goto L_0x01c1
            java.lang.String r0 = " -d '@-'"
            r11.append(r0)
        L_0x01c1:
            r6.setContentType(r14)
            r6.setContentEncoding(r4)
            r6.setContentLength(r2)
            r6.zza(r12)
            goto L_0x01d2
        L_0x01ce:
            r17 = r0
            r16 = r9
        L_0x01d2:
            if (r8 == 0) goto L_0x0204
            java.util.logging.Level r0 = java.util.logging.Level.CONFIG
            java.lang.String r1 = r10.toString()
            java.lang.String r2 = "execute"
            java.lang.String r3 = "com.google.api.client.http.HttpRequest"
            r7.logp(r0, r3, r2, r1)
            if (r11 == 0) goto L_0x0204
            java.lang.String r0 = " -- '"
            r11.append(r0)
            java.lang.String r0 = "'\"'\"'"
            java.lang.String r0 = r5.replaceAll(r13, r0)
            r11.append(r0)
            r11.append(r13)
            if (r12 == 0) goto L_0x01fb
            java.lang.String r0 = " << $$$"
            r11.append(r0)
        L_0x01fb:
            java.util.logging.Level r0 = java.util.logging.Level.CONFIG
            java.lang.String r1 = r11.toString()
            r7.logp(r0, r3, r2, r1)
        L_0x0204:
            if (r17 <= 0) goto L_0x0208
            r0 = 1
            goto L_0x0209
        L_0x0208:
            r0 = 0
        L_0x0209:
            r1 = r18
            int r2 = r1.zzxg
            int r3 = r1.zzxh
            r6.zza(r2, r3)
            com.google.android.gms.internal.firebase_ml.zzgp r2 = r6.zzfx()     // Catch:{ IOException -> 0x02bb }
            com.google.android.gms.internal.firebase_ml.zzgj r5 = new com.google.android.gms.internal.firebase_ml.zzgj     // Catch:{ all -> 0x02b0 }
            r5.<init>(r1, r2)     // Catch:{ all -> 0x02b0 }
            boolean r2 = r5.zzft()     // Catch:{ all -> 0x02ab }
            if (r2 != 0) goto L_0x0284
            int r2 = r5.getStatusCode()     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r5.zzfm()     // Catch:{ all -> 0x02ab }
            java.lang.String r3 = r3.getLocation()     // Catch:{ all -> 0x02ab }
            boolean r4 = r1.zzxj     // Catch:{ all -> 0x02ab }
            if (r4 == 0) goto L_0x027b
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x023a
            switch(r2) {
                case 301: goto L_0x023a;
                case 302: goto L_0x023a;
                case 303: goto L_0x023a;
                default: goto L_0x0238;
            }     // Catch:{ all -> 0x02ab }
        L_0x0238:
            r4 = 0
            goto L_0x023b
        L_0x023a:
            r4 = 1
        L_0x023b:
            if (r4 == 0) goto L_0x027b
            if (r3 == 0) goto L_0x027b
            com.google.android.gms.internal.firebase_ml.zzfw r4 = new com.google.android.gms.internal.firebase_ml.zzfw     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzfw r6 = r1.zzxf     // Catch:{ all -> 0x02ab }
            java.net.URL r3 = r6.zzr(r3)     // Catch:{ all -> 0x02ab }
            r4.<init>((java.net.URL) r3)     // Catch:{ all -> 0x02ab }
            r1.zza((com.google.android.gms.internal.firebase_ml.zzfw) r4)     // Catch:{ all -> 0x02ab }
            r3 = 303(0x12f, float:4.25E-43)
            if (r2 != r3) goto L_0x025a
            r2 = r16
            r1.zzac((java.lang.String) r2)     // Catch:{ all -> 0x02ab }
            r2 = 0
            r1.zzxe = r2     // Catch:{ all -> 0x02ab }
            goto L_0x025b
        L_0x025a:
            r2 = 0
        L_0x025b:
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzv(r2)     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzx(r2)     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzy(r2)     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzw(r2)     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzz(r2)     // Catch:{ all -> 0x02ab }
            com.google.android.gms.internal.firebase_ml.zzgd r3 = r1.zzwy     // Catch:{ all -> 0x02ab }
            r3.zzaa(r2)     // Catch:{ all -> 0x02ab }
            r3 = 1
            goto L_0x027d
        L_0x027b:
            r2 = 0
            r3 = 0
        L_0x027d:
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0286
            r5.ignore()     // Catch:{ all -> 0x02ab }
            goto L_0x0286
        L_0x0284:
            r2 = 0
            r0 = 0
        L_0x0286:
            int r3 = r17 + -1
            if (r0 != 0) goto L_0x02a8
            com.google.android.gms.internal.firebase_ml.zzgk r0 = r1.zzxi
            if (r0 == 0) goto L_0x0291
            r0.zza(r5)
        L_0x0291:
            boolean r0 = r1.zzxk
            if (r0 == 0) goto L_0x02a7
            boolean r0 = r5.zzft()
            if (r0 == 0) goto L_0x029c
            goto L_0x02a7
        L_0x029c:
            com.google.android.gms.internal.firebase_ml.zzgi r0 = new com.google.android.gms.internal.firebase_ml.zzgi     // Catch:{ all -> 0x02a2 }
            r0.<init>((com.google.android.gms.internal.firebase_ml.zzgj) r5)     // Catch:{ all -> 0x02a2 }
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x02a2:
            r0 = move-exception
            r5.disconnect()
            throw r0
        L_0x02a7:
            return r5
        L_0x02a8:
            r0 = r3
            goto L_0x0019
        L_0x02ab:
            r0 = move-exception
            r5.disconnect()
            throw r0
        L_0x02b0:
            r0 = move-exception
            java.io.InputStream r2 = r2.getContent()     // Catch:{ IOException -> 0x02bb }
            if (r2 == 0) goto L_0x02ba
            r2.close()     // Catch:{ IOException -> 0x02bb }
        L_0x02ba:
            throw r0     // Catch:{ IOException -> 0x02bb }
        L_0x02bb:
            r0 = move-exception
            goto L_0x02be
        L_0x02bd:
            throw r0
        L_0x02be:
            goto L_0x02bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzge.zzfr():com.google.android.gms.internal.firebase_ml.zzgj");
    }
}
