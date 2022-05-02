package com.google.android.gms.internal.firebase_ml;

import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.google.common.base.Ascii;

public final class zzhs extends zzhr {
    private static final byte[] zzaal = {13, 10};
    private static final byte[] zzaam = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] zzaan = {65, 66, 67, 68, 69, 70, ImageFileType.HEAD_GIF_0, ImageFileType.HEAD_HEVC_0, 73, 74, 75, 76, 77, 78, 79, 80, 81, ImageFileType.HEAD_WEBP_0, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, Framer.EXIT_FRAME_PREFIX, 121, 122, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, Framer.STDIN_FRAME_PREFIX, Framer.STDIN_REQUEST_FRAME_PREFIX};
    private static final byte[] zzaao = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, 13, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, 22, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, 63, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, 32, Framer.ENTER_FRAME_PREFIX, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, Framer.STDIN_FRAME_PREFIX, 46, 47, 48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51};
    private final byte[] zzaap;
    private final byte[] zzaaq;
    private final byte[] zzaar;
    private final int zzaas;
    private final int zzaat;

    public zzhs() {
        this(0);
    }

    private zzhs(int i) {
        this(0, zzaal);
    }

    private zzhs(int i, byte[] bArr) {
        this(0, bArr, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzhs(int r9, byte[] r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0005
            r1 = 0
            goto L_0x0006
        L_0x0005:
            int r1 = r10.length
        L_0x0006:
            r2 = 4
            r3 = 3
            r8.<init>(r3, r2, r9, r1)
            byte[] r1 = zzaao
            r8.zzaaq = r1
            r1 = 0
            r3 = 1
            if (r10 == 0) goto L_0x0060
            if (r10 == 0) goto L_0x002b
            int r4 = r10.length
            r5 = 0
        L_0x0017:
            if (r5 >= r4) goto L_0x002b
            byte r6 = r10[r5]
            byte r7 = r8.zzaag
            if (r7 == r6) goto L_0x0029
            boolean r6 = r8.zza(r6)
            if (r6 == 0) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x0029:
            r4 = 1
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0043
            if (r9 <= 0) goto L_0x003e
            int r9 = r10.length
            int r9 = r9 + r2
            r8.zzaat = r9
            int r9 = r10.length
            byte[] r9 = new byte[r9]
            r8.zzaar = r9
            int r1 = r10.length
            java.lang.System.arraycopy(r10, r0, r9, r0, r1)
            goto L_0x0064
        L_0x003e:
            r8.zzaat = r2
            r8.zzaar = r1
            goto L_0x0064
        L_0x0043:
            java.lang.String r9 = com.google.android.gms.internal.firebase_ml.zzht.zzd(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "lineSeparator must not contain base64 characters: ["
            r11.<init>(r0)
            r11.append(r9)
            java.lang.String r9 = "]"
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0060:
            r8.zzaat = r2
            r8.zzaar = r1
        L_0x0064:
            int r9 = r8.zzaat
            int r9 = r9 - r3
            r8.zzaas = r9
            if (r11 == 0) goto L_0x006e
            byte[] r9 = zzaan
            goto L_0x0070
        L_0x006e:
            byte[] r9 = zzaam
        L_0x0070:
            r8.zzaap = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzhs.<init>(int, byte[], boolean):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v27, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(byte[] r8, int r9, int r10, com.google.android.gms.internal.firebase_ml.zzhu r11) {
        /*
            r7 = this;
            boolean r0 = r11.eof
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto L_0x00e3
            r11.eof = r1
            int r8 = r11.zzaax
            if (r8 != 0) goto L_0x0014
            int r8 = r7.zzaaj
            if (r8 != 0) goto L_0x0014
            return
        L_0x0014:
            int r8 = r7.zzaat
            byte[] r8 = r7.zza(r8, r11)
            int r9 = r11.pos
            int r10 = r11.zzaax
            if (r10 == 0) goto L_0x00c0
            r2 = 2
            if (r10 == r1) goto L_0x0082
            if (r10 != r2) goto L_0x006c
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzaap
            int r3 = r11.zzaau
            int r3 = r3 >> 10
            r3 = r3 & 63
            byte r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzaap
            int r3 = r11.zzaau
            int r3 = r3 >> 4
            r3 = r3 & 63
            byte r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzaap
            int r3 = r11.zzaau
            int r2 = r3 << 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.zzaap
            byte[] r1 = zzaam
            if (r10 != r1) goto L_0x00c0
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzaag
            r8[r10] = r1
            goto L_0x00c0
        L_0x006c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Impossible modulus "
            r9.<init>(r10)
            int r10 = r11.zzaax
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0082:
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzaap
            int r3 = r11.zzaau
            int r2 = r3 >> 2
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.zzaap
            int r2 = r11.zzaau
            int r2 = r2 << 4
            r2 = r2 & 63
            byte r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.zzaap
            byte[] r1 = zzaam
            if (r10 != r1) goto L_0x00c0
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzaag
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.zzaag
            r8[r10] = r1
        L_0x00c0:
            int r10 = r11.zzaaw
            int r1 = r11.pos
            int r1 = r1 - r9
            int r10 = r10 + r1
            r11.zzaaw = r10
            int r9 = r7.zzaaj
            if (r9 <= 0) goto L_0x00e2
            int r9 = r11.zzaaw
            if (r9 <= 0) goto L_0x00e2
            byte[] r9 = r7.zzaar
            int r10 = r11.pos
            byte[] r1 = r7.zzaar
            int r1 = r1.length
            java.lang.System.arraycopy(r9, r0, r8, r10, r1)
            int r8 = r11.pos
            byte[] r9 = r7.zzaar
            int r9 = r9.length
            int r8 = r8 + r9
            r11.pos = r8
        L_0x00e2:
            return
        L_0x00e3:
            r2 = 0
        L_0x00e4:
            if (r2 >= r10) goto L_0x0175
            int r3 = r7.zzaat
            byte[] r3 = r7.zza(r3, r11)
            int r4 = r11.zzaax
            int r4 = r4 + r1
            int r4 = r4 % 3
            r11.zzaax = r4
            int r4 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x00fb
            int r9 = r9 + 256
        L_0x00fb:
            int r5 = r11.zzaau
            int r5 = r5 << 8
            int r5 = r5 + r9
            r11.zzaau = r5
            int r9 = r11.zzaax
            if (r9 != 0) goto L_0x0170
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.zzaap
            int r6 = r11.zzaau
            int r6 = r6 >> 18
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.zzaap
            int r6 = r11.zzaau
            int r6 = r6 >> 12
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.zzaap
            int r6 = r11.zzaau
            int r6 = r6 >> 6
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.zzaap
            int r6 = r11.zzaau
            r6 = r6 & 63
            byte r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.zzaaw
            int r9 = r9 + 4
            r11.zzaaw = r9
            int r9 = r7.zzaaj
            if (r9 <= 0) goto L_0x0170
            int r9 = r7.zzaaj
            int r5 = r11.zzaaw
            if (r9 > r5) goto L_0x0170
            byte[] r9 = r7.zzaar
            int r5 = r11.pos
            byte[] r6 = r7.zzaar
            int r6 = r6.length
            java.lang.System.arraycopy(r9, r0, r3, r5, r6)
            int r9 = r11.pos
            byte[] r3 = r7.zzaar
            int r3 = r3.length
            int r9 = r9 + r3
            r11.pos = r9
            r11.zzaaw = r0
        L_0x0170:
            int r2 = r2 + 1
            r9 = r4
            goto L_0x00e4
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzhs.zza(byte[], int, int, com.google.android.gms.internal.firebase_ml.zzhu):void");
    }

    public static String zzc(byte[] bArr) {
        if (!(bArr == null || bArr.length == 0)) {
            zzhs zzhs = new zzhs(0, zzaal, true);
            long zzb = zzhs.zzb(bArr);
            if (zzb > 2147483647L) {
                throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + zzb + ") than the specified maximum size of 2147483647");
            } else if (!(bArr == null || bArr.length == 0)) {
                zzhu zzhu = new zzhu();
                zzhs.zza(bArr, 0, bArr.length, zzhu);
                zzhs.zza(bArr, 0, -1, zzhu);
                int i = zzhu.pos - zzhu.zzaav;
                byte[] bArr2 = new byte[i];
                if (zzhu.buffer != null) {
                    int min = Math.min(zzhu.buffer != null ? zzhu.pos - zzhu.zzaav : 0, i);
                    System.arraycopy(zzhu.buffer, zzhu.zzaav, bArr2, 0, min);
                    zzhu.zzaav += min;
                    if (zzhu.zzaav >= zzhu.pos) {
                        zzhu.buffer = null;
                    }
                } else {
                    boolean z = zzhu.eof;
                }
                bArr = bArr2;
            }
        }
        return zzht.zzd(bArr);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(byte b) {
        if (b < 0) {
            return false;
        }
        byte[] bArr = this.zzaaq;
        return b < bArr.length && bArr[b] != -1;
    }
}
