package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.cj;
import java.io.File;

final class bt {

    /* renamed from: a  reason: collision with root package name */
    private static final af f10874a = new af("ExtractChunkTaskHandler");
    private final byte[] b = new byte[8192];
    private final bb c;
    private final cj<w> d;
    private final cj<aw> e;
    private final bz f;

    bt(bb bbVar, cj<w> cjVar, cj<aw> cjVar2, bz bzVar) {
        this.c = bbVar;
        this.d = cjVar;
        this.e = cjVar2;
        this.f = bzVar;
    }

    private final File b(bs bsVar) {
        File a2 = this.c.a(bsVar.k, bsVar.f10873a, bsVar.b, bsVar.c);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017f A[Catch:{ all -> 0x032e, all -> 0x0334, IOException -> 0x033a }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a4 A[Catch:{ all -> 0x032e, all -> 0x0334, IOException -> 0x033a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d8 A[Catch:{ all -> 0x032e, all -> 0x0334, IOException -> 0x033a }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0293 A[SYNTHETIC, Splitter:B:93:0x0293] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.play.core.assetpacks.bs r23) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            com.google.android.play.core.assetpacks.dr r0 = new com.google.android.play.core.assetpacks.dr
            com.google.android.play.core.assetpacks.bb r4 = r1.c
            java.lang.String r5 = r2.k
            int r6 = r2.f10873a
            long r7 = r2.b
            java.lang.String r9 = r2.c
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r9)
            com.google.android.play.core.assetpacks.bb r10 = r1.c
            java.lang.String r11 = r2.k
            int r12 = r2.f10873a
            long r13 = r2.b
            java.lang.String r15 = r2.c
            java.io.File r3 = r10.f(r11, r12, r13, r15)
            boolean r4 = r3.exists()
            if (r4 != 0) goto L_0x002b
            r3.mkdirs()
        L_0x002b:
            r11 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            java.io.InputStream r3 = r2.i     // Catch:{ IOException -> 0x033a }
            int r4 = r2.d     // Catch:{ IOException -> 0x033a }
            if (r4 == r13) goto L_0x0037
            r15 = r3
            goto L_0x0040
        L_0x0037:
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x033a }
            byte[] r5 = r1.b     // Catch:{ IOException -> 0x033a }
            int r5 = r5.length     // Catch:{ IOException -> 0x033a }
            r4.<init>(r3, r5)     // Catch:{ IOException -> 0x033a }
            r15 = r4
        L_0x0040:
            int r3 = r2.e     // Catch:{ all -> 0x032e }
            r16 = 0
            if (r3 <= 0) goto L_0x017c
            com.google.android.play.core.assetpacks.dq r3 = r0.a()     // Catch:{ all -> 0x032e }
            int r4 = r3.e()     // Catch:{ all -> 0x032e }
            int r5 = r2.e     // Catch:{ all -> 0x032e }
            int r6 = r5 + -1
            if (r4 != r6) goto L_0x015c
            int r4 = r3.a()     // Catch:{ all -> 0x032e }
            if (r4 == r13) goto L_0x00d9
            if (r4 == r12) goto L_0x009c
            if (r4 != r11) goto L_0x0082
            com.google.android.play.core.internal.af r4 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r5 = "Resuming central directory from last chunk."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r4.a(r5, r6)     // Catch:{ all -> 0x032e }
            long r3 = r3.c()     // Catch:{ all -> 0x032e }
            r0.a((java.io.InputStream) r15, (long) r3)     // Catch:{ all -> 0x032e }
            boolean r3 = r23.a()     // Catch:{ all -> 0x032e }
            if (r3 == 0) goto L_0x0078
        L_0x0074:
            r4 = r16
            goto L_0x017d
        L_0x0078:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
            int r4 = r2.j     // Catch:{ all -> 0x032e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x0082:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.Object[] r4 = new java.lang.Object[r13]     // Catch:{ all -> 0x032e }
            int r3 = r3.a()     // Catch:{ all -> 0x032e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032e }
            r4[r14] = r3     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x032e }
            int r4 = r2.j     // Catch:{ all -> 0x032e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x009c:
            com.google.android.play.core.internal.af r3 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "Resuming zip entry from last chunk during local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r3.a(r4, r5)     // Catch:{ all -> 0x032e }
            com.google.android.play.core.assetpacks.bb r3 = r1.c     // Catch:{ all -> 0x032e }
            java.lang.String r4 = r2.k     // Catch:{ all -> 0x032e }
            int r5 = r2.f10873a     // Catch:{ all -> 0x032e }
            long r6 = r2.b     // Catch:{ all -> 0x032e }
            java.lang.String r8 = r2.c     // Catch:{ all -> 0x032e }
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r21 = r8
            java.io.File r3 = r16.d(r17, r18, r19, r21)     // Catch:{ all -> 0x032e }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x032e }
            if (r4 == 0) goto L_0x00cf
            java.io.SequenceInputStream r4 = new java.io.SequenceInputStream     // Catch:{ all -> 0x032e }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x032e }
            r5.<init>(r3)     // Catch:{ all -> 0x032e }
            r4.<init>(r5, r15)     // Catch:{ all -> 0x032e }
            goto L_0x017d
        L_0x00cf:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "Checkpoint extension file not found."
            int r4 = r2.j     // Catch:{ all -> 0x032e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x00d9:
            com.google.android.play.core.internal.af r4 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x032e }
            java.lang.String r6 = r3.b()     // Catch:{ all -> 0x032e }
            r5[r14] = r6     // Catch:{ all -> 0x032e }
            java.lang.String r6 = "Resuming zip entry from last chunk during file %s."
            r4.a(r6, r5)     // Catch:{ all -> 0x032e }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032e }
            java.lang.String r5 = r3.b()     // Catch:{ all -> 0x032e }
            r4.<init>(r5)     // Catch:{ all -> 0x032e }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x032e }
            if (r5 == 0) goto L_0x0152
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x032e }
            java.lang.String r6 = "rw"
            r5.<init>(r4, r6)     // Catch:{ all -> 0x032e }
            long r6 = r3.c()     // Catch:{ all -> 0x032e }
            r5.seek(r6)     // Catch:{ all -> 0x032e }
            long r6 = r3.d()     // Catch:{ all -> 0x032e }
        L_0x0109:
            byte[] r3 = r1.b     // Catch:{ all -> 0x032e }
            int r3 = r3.length     // Catch:{ all -> 0x032e }
            long r8 = (long) r3     // Catch:{ all -> 0x032e }
            long r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x032e }
            int r3 = (int) r8     // Catch:{ all -> 0x032e }
            byte[] r8 = r1.b     // Catch:{ all -> 0x032e }
            int r8 = r15.read(r8, r14, r3)     // Catch:{ all -> 0x032e }
            int r8 = java.lang.Math.max(r8, r14)     // Catch:{ all -> 0x032e }
            if (r8 <= 0) goto L_0x0123
            byte[] r9 = r1.b     // Catch:{ all -> 0x032e }
            r5.write(r9, r14, r8)     // Catch:{ all -> 0x032e }
        L_0x0123:
            long r10 = (long) r8     // Catch:{ all -> 0x032e }
            long r10 = r6 - r10
            r6 = 0
            int r9 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0132
            if (r8 > 0) goto L_0x012f
            goto L_0x0132
        L_0x012f:
            r6 = r10
            r11 = 3
            goto L_0x0109
        L_0x0132:
            long r6 = r5.length()     // Catch:{ all -> 0x032e }
            r5.close()     // Catch:{ all -> 0x032e }
            if (r8 == r3) goto L_0x017c
            com.google.android.play.core.internal.af r3 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r5 = "Chunk has ended while resuming the previous chunks file content."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r3.a(r5, r8)     // Catch:{ all -> 0x032e }
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032e }
            int r9 = r2.e     // Catch:{ all -> 0x032e }
            r3 = r0
            r5 = r6
            r7 = r10
            r3.a((java.lang.String) r4, (long) r5, (long) r7, (int) r9)     // Catch:{ all -> 0x032e }
            goto L_0x0074
        L_0x0152:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "Partial file specified in checkpoint does not exist. Corrupt directory."
            int r4 = r2.j     // Catch:{ all -> 0x032e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x015c:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "Trying to resume with chunk number %s when previously processed chunk was number %s."
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch:{ all -> 0x032e }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x032e }
            r6[r14] = r5     // Catch:{ all -> 0x032e }
            int r3 = r3.e()     // Catch:{ all -> 0x032e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x032e }
            r6[r13] = r3     // Catch:{ all -> 0x032e }
            java.lang.String r3 = java.lang.String.format(r4, r6)     // Catch:{ all -> 0x032e }
            int r4 = r2.j     // Catch:{ all -> 0x032e }
            r0.<init>((java.lang.String) r3, (int) r4)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x017c:
            r4 = r15
        L_0x017d:
            if (r4 == 0) goto L_0x028a
            com.google.android.play.core.assetpacks.bm r3 = new com.google.android.play.core.assetpacks.bm     // Catch:{ all -> 0x032e }
            r3.<init>(r4)     // Catch:{ all -> 0x032e }
            java.io.File r5 = r22.b(r23)     // Catch:{ all -> 0x032e }
        L_0x0188:
            com.google.android.play.core.assetpacks.dx r6 = r3.a()     // Catch:{ all -> 0x032e }
            boolean r7 = r6.f()     // Catch:{ all -> 0x032e }
            if (r7 != 0) goto L_0x01df
            boolean r7 = r3.c()     // Catch:{ all -> 0x032e }
            if (r7 != 0) goto L_0x01df
            boolean r7 = r6.b()     // Catch:{ all -> 0x032e }
            if (r7 == 0) goto L_0x01d8
            boolean r7 = r6.a()     // Catch:{ all -> 0x032e }
            if (r7 != 0) goto L_0x01d8
            byte[] r7 = r6.h()     // Catch:{ all -> 0x032e }
            r0.a((byte[]) r7)     // Catch:{ all -> 0x032e }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x032e }
            java.lang.String r8 = r6.c()     // Catch:{ all -> 0x032e }
            r7.<init>(r5, r8)     // Catch:{ all -> 0x032e }
            java.io.File r8 = r7.getParentFile()     // Catch:{ all -> 0x032e }
            r8.mkdirs()     // Catch:{ all -> 0x032e }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ all -> 0x032e }
            r8.<init>(r7)     // Catch:{ all -> 0x032e }
            byte[] r7 = r1.b     // Catch:{ all -> 0x032e }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032e }
        L_0x01c6:
            if (r7 <= 0) goto L_0x01d4
            byte[] r9 = r1.b     // Catch:{ all -> 0x032e }
            r8.write(r9, r14, r7)     // Catch:{ all -> 0x032e }
            byte[] r7 = r1.b     // Catch:{ all -> 0x032e }
            int r7 = r3.read(r7)     // Catch:{ all -> 0x032e }
            goto L_0x01c6
        L_0x01d4:
            r8.close()     // Catch:{ all -> 0x032e }
            goto L_0x01df
        L_0x01d8:
            byte[] r7 = r6.h()     // Catch:{ all -> 0x032e }
            r0.a((byte[]) r7, (java.io.InputStream) r3)     // Catch:{ all -> 0x032e }
        L_0x01df:
            boolean r7 = r3.b()     // Catch:{ all -> 0x032e }
            if (r7 != 0) goto L_0x01eb
            boolean r7 = r3.c()     // Catch:{ all -> 0x032e }
            if (r7 == 0) goto L_0x0188
        L_0x01eb:
            boolean r5 = r3.c()     // Catch:{ all -> 0x032e }
            if (r5 == 0) goto L_0x0201
            com.google.android.play.core.internal.af r5 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r7 = "Writing central directory metadata."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r5.a(r7, r8)     // Catch:{ all -> 0x032e }
            byte[] r5 = r6.h()     // Catch:{ all -> 0x032e }
            r0.a((byte[]) r5, (java.io.InputStream) r4)     // Catch:{ all -> 0x032e }
        L_0x0201:
            boolean r4 = r23.a()     // Catch:{ all -> 0x032e }
            if (r4 != 0) goto L_0x028a
            boolean r4 = r6.f()     // Catch:{ all -> 0x032e }
            if (r4 == 0) goto L_0x0220
            com.google.android.play.core.internal.af r3 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "Writing slice checkpoint for partial local file header."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r3.a(r4, r5)     // Catch:{ all -> 0x032e }
            byte[] r3 = r6.h()     // Catch:{ all -> 0x032e }
            int r4 = r2.e     // Catch:{ all -> 0x032e }
            r0.a((byte[]) r3, (int) r4)     // Catch:{ all -> 0x032e }
            goto L_0x028a
        L_0x0220:
            boolean r4 = r3.c()     // Catch:{ all -> 0x032e }
            if (r4 == 0) goto L_0x0235
            com.google.android.play.core.internal.af r3 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r4 = "Writing slice checkpoint for central directory."
            java.lang.Object[] r5 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r3.a(r4, r5)     // Catch:{ all -> 0x032e }
            int r3 = r2.e     // Catch:{ all -> 0x032e }
            r0.a((int) r3)     // Catch:{ all -> 0x032e }
            goto L_0x028a
        L_0x0235:
            int r4 = r6.e()     // Catch:{ all -> 0x032e }
            if (r4 != 0) goto L_0x026b
            com.google.android.play.core.internal.af r4 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r5 = "Writing slice checkpoint for partial file."
            java.lang.Object[] r7 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r4.a(r5, r7)     // Catch:{ all -> 0x032e }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x032e }
            java.io.File r5 = r22.b(r23)     // Catch:{ all -> 0x032e }
            java.lang.String r7 = r6.c()     // Catch:{ all -> 0x032e }
            r4.<init>(r5, r7)     // Catch:{ all -> 0x032e }
            long r5 = r6.d()     // Catch:{ all -> 0x032e }
            long r7 = r3.d()     // Catch:{ all -> 0x032e }
            long r5 = r5 - r7
            long r7 = r4.length()     // Catch:{ all -> 0x032e }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0263
            goto L_0x027c
        L_0x0263:
            com.google.android.play.core.assetpacks.bv r0 = new com.google.android.play.core.assetpacks.bv     // Catch:{ all -> 0x032e }
            java.lang.String r3 = "Partial file is of unexpected size."
            r0.<init>(r3)     // Catch:{ all -> 0x032e }
            throw r0     // Catch:{ all -> 0x032e }
        L_0x026b:
            com.google.android.play.core.internal.af r4 = f10874a     // Catch:{ all -> 0x032e }
            java.lang.String r5 = "Writing slice checkpoint for partial unextractable file."
            java.lang.Object[] r6 = new java.lang.Object[r14]     // Catch:{ all -> 0x032e }
            r4.a(r5, r6)     // Catch:{ all -> 0x032e }
            java.io.File r4 = r0.b()     // Catch:{ all -> 0x032e }
            long r5 = r4.length()     // Catch:{ all -> 0x032e }
        L_0x027c:
            java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ all -> 0x032e }
            long r7 = r3.d()     // Catch:{ all -> 0x032e }
            int r9 = r2.e     // Catch:{ all -> 0x032e }
            r3 = r0
            r3.a((java.lang.String) r4, (long) r5, (long) r7, (int) r9)     // Catch:{ all -> 0x032e }
        L_0x028a:
            r15.close()     // Catch:{ IOException -> 0x033a }
            boolean r3 = r23.a()
            if (r3 == 0) goto L_0x02b3
            int r3 = r2.e     // Catch:{ IOException -> 0x0299 }
            r0.b(r3)     // Catch:{ IOException -> 0x0299 }
            goto L_0x02b3
        L_0x0299:
            r0 = move-exception
            com.google.android.play.core.internal.af r3 = f10874a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "Writing extraction finished checkpoint failed with %s."
            r3.b(r5, r4)
            com.google.android.play.core.assetpacks.bv r3 = new com.google.android.play.core.assetpacks.bv
            int r2 = r2.j
            java.lang.String r4 = "Writing extraction finished checkpoint failed."
            r3.<init>(r4, r0, r2)
            throw r3
        L_0x02b3:
            com.google.android.play.core.internal.af r0 = f10874a
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            int r4 = r2.e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r14] = r4
            java.lang.String r4 = r2.c
            r3[r13] = r4
            java.lang.String r4 = r2.k
            r3[r12] = r4
            int r4 = r2.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            r3[r5] = r4
            java.lang.String r4 = "Extraction finished for chunk %s of slice %s of pack %s of session %s."
            r0.c(r4, r3)
            com.google.android.play.core.internal.cj<com.google.android.play.core.assetpacks.w> r0 = r1.d
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.assetpacks.w r0 = (com.google.android.play.core.assetpacks.w) r0
            int r3 = r2.j
            java.lang.String r4 = r2.k
            java.lang.String r5 = r2.c
            int r6 = r2.e
            r0.a(r3, r4, r5, r6)
            java.io.InputStream r0 = r2.i     // Catch:{ IOException -> 0x02ef }
            r0.close()     // Catch:{ IOException -> 0x02ef }
            goto L_0x0309
        L_0x02ef:
            com.google.android.play.core.internal.af r0 = f10874a
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r3 = r2.e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4[r14] = r3
            java.lang.String r3 = r2.c
            r4[r13] = r3
            java.lang.String r3 = r2.k
            r4[r12] = r3
            java.lang.String r3 = "Could not close file for chunk %s of slice %s of pack %s."
            r0.d(r3, r4)
        L_0x0309:
            int r0 = r2.h
            r3 = 3
            if (r0 != r3) goto L_0x032d
            com.google.android.play.core.internal.cj<com.google.android.play.core.assetpacks.aw> r0 = r1.e
            java.lang.Object r0 = r0.a()
            com.google.android.play.core.assetpacks.aw r0 = (com.google.android.play.core.assetpacks.aw) r0
            java.lang.String r3 = r2.k
            long r7 = r2.g
            r4 = 3
            r5 = 0
            com.google.android.play.core.assetpacks.bz r6 = r1.f
            double r9 = r6.a(r3, r2)
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r7
            com.google.android.play.core.assetpacks.AssetPackState r2 = com.google.android.play.core.assetpacks.AssetPackState.a(r2, r3, r4, r5, r7, r9)
            r0.a((com.google.android.play.core.assetpacks.AssetPackState) r2)
        L_0x032d:
            return
        L_0x032e:
            r0 = move-exception
            r3 = r0
            r15.close()     // Catch:{ all -> 0x0334 }
            goto L_0x0339
        L_0x0334:
            r0 = move-exception
            r4 = r0
            com.google.android.play.core.internal.ci.a(r3, r4)     // Catch:{ IOException -> 0x033a }
        L_0x0339:
            throw r3     // Catch:{ IOException -> 0x033a }
        L_0x033a:
            r0 = move-exception
            com.google.android.play.core.internal.af r3 = f10874a
            java.lang.Object[] r4 = new java.lang.Object[r13]
            java.lang.String r5 = r0.getMessage()
            r4[r14] = r5
            java.lang.String r5 = "IOException during extraction %s."
            r3.b(r5, r4)
            com.google.android.play.core.assetpacks.bv r3 = new com.google.android.play.core.assetpacks.bv
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r2.e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r14] = r5
            java.lang.String r5 = r2.c
            r4[r13] = r5
            java.lang.String r5 = r2.k
            r4[r12] = r5
            int r5 = r2.j
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            java.lang.String r5 = "Error extracting chunk %s of slice %s of pack %s of session %s."
            java.lang.String r4 = java.lang.String.format(r5, r4)
            int r2 = r2.j
            r3.<init>(r4, r0, r2)
            goto L_0x0375
        L_0x0374:
            throw r3
        L_0x0375:
            goto L_0x0374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.bt.a(com.google.android.play.core.assetpacks.bs):void");
    }
}
