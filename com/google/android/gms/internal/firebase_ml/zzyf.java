package com.google.android.gms.internal.firebase_ml;

final class zzyf extends zzye {
    zzyf() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8) > -65) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8) > -65) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fa, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0121, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r22, byte[] r23, int r24, int r25) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r2 | r3
            int r5 = r1.length
            int r5 = r5 - r3
            r4 = r4 | r5
            r7 = 0
            if (r4 < 0) goto L_0x0154
            long r8 = (long) r2
            long r2 = (long) r3
            r4 = -19
            r10 = -62
            r11 = -16
            r12 = 16
            r13 = -96
            r14 = -32
            r15 = -1
            r6 = -65
            r16 = 1
            if (r0 == 0) goto L_0x00b1
            int r18 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r18 < 0) goto L_0x002a
            return r0
        L_0x002a:
            byte r5 = (byte) r0
            if (r5 >= r14) goto L_0x003d
            if (r5 < r10) goto L_0x003c
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r0 <= r6) goto L_0x0038
            goto L_0x003c
        L_0x0038:
            r8 = r19
            goto L_0x00b1
        L_0x003c:
            return r15
        L_0x003d:
            if (r5 >= r11) goto L_0x0069
            int r0 = r0 >> 8
            r0 = r0 ^ r15
            byte r0 = (byte) r0
            if (r0 != 0) goto L_0x0056
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0054
            int r0 = com.google.android.gms.internal.firebase_ml.zzyc.zzw(r5, r0)
            return r0
        L_0x0054:
            r8 = r19
        L_0x0056:
            if (r0 > r6) goto L_0x0068
            if (r5 != r14) goto L_0x005c
            if (r0 < r13) goto L_0x0068
        L_0x005c:
            if (r5 != r4) goto L_0x0060
            if (r0 >= r13) goto L_0x0068
        L_0x0060:
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r0 <= r6) goto L_0x0038
        L_0x0068:
            return r15
        L_0x0069:
            int r19 = r0 >> 8
            r4 = r19 ^ -1
            byte r4 = (byte) r4
            if (r4 != 0) goto L_0x0083
            long r19 = r8 + r16
            byte r4 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            int r0 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x007f
            int r0 = com.google.android.gms.internal.firebase_ml.zzyc.zzw(r5, r4)
            return r0
        L_0x007f:
            r8 = r19
            r0 = 0
            goto L_0x0085
        L_0x0083:
            int r0 = r0 >> r12
            byte r0 = (byte) r0
        L_0x0085:
            if (r0 != 0) goto L_0x0098
            long r19 = r8 + r16
            byte r0 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            int r8 = (r19 > r2 ? 1 : (r19 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0096
            int r0 = com.google.android.gms.internal.firebase_ml.zzyc.zze(r5, r4, r0)
            return r0
        L_0x0096:
            r8 = r19
        L_0x0098:
            if (r4 > r6) goto L_0x00b0
            int r5 = r5 << 28
            int r4 = r4 + 112
            int r5 = r5 + r4
            int r4 = r5 >> 30
            if (r4 != 0) goto L_0x00b0
            if (r0 > r6) goto L_0x00b0
            long r4 = r8 + r16
            byte r0 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r0 <= r6) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r8 = r4
            goto L_0x00b1
        L_0x00b0:
            return r15
        L_0x00b1:
            long r2 = r2 - r8
            int r0 = (int) r2
            if (r0 >= r12) goto L_0x00b7
            r2 = 0
            goto L_0x00ca
        L_0x00b7:
            r3 = r8
            r2 = 0
        L_0x00b9:
            if (r2 >= r0) goto L_0x00c9
            long r19 = r3 + r16
            byte r3 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r3)
            if (r3 >= 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            int r2 = r2 + 1
            r3 = r19
            goto L_0x00b9
        L_0x00c9:
            r2 = r0
        L_0x00ca:
            int r0 = r0 - r2
            long r2 = (long) r2
            long r8 = r8 + r2
        L_0x00cd:
            r2 = 0
        L_0x00ce:
            if (r0 <= 0) goto L_0x00df
            long r2 = r8 + r16
            byte r4 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r4 < 0) goto L_0x00dd
            int r0 = r0 + -1
            r8 = r2
            r2 = r4
            goto L_0x00ce
        L_0x00dd:
            r8 = r2
            r2 = r4
        L_0x00df:
            if (r0 != 0) goto L_0x00e2
            return r7
        L_0x00e2:
            int r0 = r0 + -1
            if (r2 >= r14) goto L_0x00fb
            if (r0 != 0) goto L_0x00e9
            return r2
        L_0x00e9:
            int r0 = r0 + -1
            if (r2 < r10) goto L_0x00fa
            long r2 = r8 + r16
            byte r4 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r4 <= r6) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            r8 = r2
            r12 = -19
            goto L_0x00cd
        L_0x00fa:
            return r15
        L_0x00fb:
            if (r2 >= r11) goto L_0x0122
            r3 = 2
            if (r0 >= r3) goto L_0x0105
            int r0 = zza(r1, r2, r8, r0)
            return r0
        L_0x0105:
            int r0 = r0 + -2
            long r3 = r8 + r16
            byte r5 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r5 > r6) goto L_0x0121
            if (r2 != r14) goto L_0x0113
            if (r5 < r13) goto L_0x0121
        L_0x0113:
            r12 = -19
            if (r2 != r12) goto L_0x0119
            if (r5 >= r13) goto L_0x0121
        L_0x0119:
            long r8 = r3 + r16
            byte r2 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r3)
            if (r2 <= r6) goto L_0x00cd
        L_0x0121:
            return r15
        L_0x0122:
            r3 = 3
            r12 = -19
            if (r0 >= r3) goto L_0x012c
            int r0 = zza(r1, r2, r8, r0)
            return r0
        L_0x012c:
            int r0 = r0 + -3
            long r3 = r8 + r16
            byte r5 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r5 > r6) goto L_0x0153
            int r2 = r2 << 28
            int r5 = r5 + 112
            int r2 = r2 + r5
            int r2 = r2 >> 30
            if (r2 != 0) goto L_0x0153
            long r8 = r3 + r16
            byte r2 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r3)
            if (r2 > r6) goto L_0x0153
            long r2 = r8 + r16
            byte r4 = com.google.android.gms.internal.firebase_ml.zzya.zza(r1, r8)
            if (r4 <= r6) goto L_0x0150
            goto L_0x0153
        L_0x0150:
            r8 = r2
            goto L_0x00cd
        L_0x0153:
            return r15
        L_0x0154:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r7] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r2 = 1
            r4[r2] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            r2 = 2
            r4[r2] = r1
            java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r1, r4)
            r0.<init>(r1)
            goto L_0x0179
        L_0x0178:
            throw r0
        L_0x0179:
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzyf.zzb(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzh(byte[] bArr, int i, int i2) throws zzvi {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte zza = zzya.zza(bArr, (long) r13);
                if (!zzyb.zze(zza)) {
                    break;
                }
                i = r13 + 1;
                zzyb.zza(zza, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (r13 < i3) {
                int i6 = r13 + 1;
                byte zza2 = zzya.zza(bArr, (long) r13);
                if (zzyb.zze(zza2)) {
                    int i7 = i5 + 1;
                    zzyb.zza(zza2, cArr, i5);
                    while (i6 < i3) {
                        byte zza3 = zzya.zza(bArr, (long) i6);
                        if (!zzyb.zze(zza3)) {
                            break;
                        }
                        i6++;
                        zzyb.zza(zza3, cArr, i7);
                        i7++;
                    }
                    r13 = i6;
                    i5 = i7;
                } else if (zzyb.zzf(zza2)) {
                    if (i6 < i3) {
                        int i8 = i6 + 1;
                        zzyb.zza(zza2, zzya.zza(bArr, (long) i6), cArr, i5);
                        r13 = i8;
                        i5++;
                    } else {
                        throw zzvi.zztu();
                    }
                } else if (zzyb.zzg(zza2)) {
                    if (i6 < i3 - 1) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        zzyb.zza(zza2, zzya.zza(bArr, (long) i6), zzya.zza(bArr, (long) i9), cArr, i5);
                        r13 = i10;
                        i5++;
                    } else {
                        throw zzvi.zztu();
                    }
                } else if (i6 < i3 - 2) {
                    int i11 = i6 + 1;
                    byte zza4 = zzya.zza(bArr, (long) i6);
                    int i12 = i11 + 1;
                    zzyb.zza(zza2, zza4, zzya.zza(bArr, (long) i11), zzya.zza(bArr, (long) i12), cArr, i5);
                    r13 = i12 + 1;
                    i5 = i5 + 1 + 1;
                } else {
                    throw zzvi.zztu();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00fb, LOOP_START, PHI: r2 r3 r4 r11 
      PHI: (r2v4 int) = (r2v3 int), (r2v6 int) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v3 char) = (r3v2 char), (r3v4 char) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
            r22 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            long r4 = (long) r2
            long r6 = (long) r3
            long r6 = r6 + r4
            int r8 = r23.length()
            java.lang.String r9 = " at index "
            java.lang.String r10 = "Failed writing "
            if (r8 > r3) goto L_0x0146
            int r11 = r1.length
            int r11 = r11 - r3
            if (r11 < r2) goto L_0x0146
            r2 = 0
        L_0x001a:
            r3 = 128(0x80, float:1.794E-43)
            r11 = 1
            if (r2 >= r8) goto L_0x002f
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x002f
            long r11 = r11 + r4
            byte r3 = (byte) r13
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r3)
            int r2 = r2 + 1
            r4 = r11
            goto L_0x001a
        L_0x002f:
            if (r2 != r8) goto L_0x0033
            int r0 = (int) r4
            return r0
        L_0x0033:
            if (r2 >= r8) goto L_0x0144
            char r13 = r0.charAt(r2)
            if (r13 >= r3) goto L_0x004b
            int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x004b
            long r14 = r4 + r11
            byte r13 = (byte) r13
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r13)
            r4 = r11
            r12 = r14
        L_0x0047:
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00fb
        L_0x004b:
            r14 = 2048(0x800, float:2.87E-42)
            if (r13 >= r14) goto L_0x0075
            r14 = 2
            long r14 = r6 - r14
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 > 0) goto L_0x0075
            long r14 = r4 + r11
            int r3 = r13 >>> 6
            r3 = r3 | 960(0x3c0, float:1.345E-42)
            byte r3 = (byte) r3
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            r5 = r13 & 63
            r13 = 128(0x80, float:1.794E-43)
            r5 = r5 | r13
            byte r5 = (byte) r5
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r14, (byte) r5)
            r20 = r11
            r11 = 128(0x80, float:1.794E-43)
            r12 = r3
            r4 = r20
            goto L_0x00fb
        L_0x0075:
            r3 = 57343(0xdfff, float:8.0355E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r14) goto L_0x007f
            if (r3 >= r13) goto L_0x00ae
        L_0x007f:
            r15 = 3
            long r15 = r6 - r15
            int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r17 > 0) goto L_0x00ae
            long r14 = r4 + r11
            int r3 = r13 >>> 12
            r3 = r3 | 480(0x1e0, float:6.73E-43)
            byte r3 = (byte) r3
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r3)
            long r3 = r14 + r11
            int r5 = r13 >>> 6
            r5 = r5 & 63
            r11 = 128(0x80, float:1.794E-43)
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r14, (byte) r5)
            r14 = 1
            long r18 = r3 + r14
            r5 = r13 & 63
            r5 = r5 | r11
            byte r5 = (byte) r5
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r3, (byte) r5)
            r12 = r18
            r4 = 1
            goto L_0x0047
        L_0x00ae:
            r11 = 4
            long r11 = r6 - r11
            int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x010f
            int r3 = r2 + 1
            if (r3 == r8) goto L_0x0107
            char r2 = r0.charAt(r3)
            boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
            if (r11 == 0) goto L_0x0106
            int r2 = java.lang.Character.toCodePoint(r13, r2)
            r11 = 1
            long r13 = r4 + r11
            int r15 = r2 >>> 18
            r15 = r15 | 240(0xf0, float:3.36E-43)
            byte r15 = (byte) r15
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r15)
            long r4 = r13 + r11
            int r15 = r2 >>> 12
            r15 = r15 & 63
            r11 = 128(0x80, float:1.794E-43)
            r12 = r15 | 128(0x80, float:1.794E-43)
            byte r12 = (byte) r12
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r13, (byte) r12)
            r12 = 1
            long r14 = r4 + r12
            int r16 = r2 >>> 6
            r12 = r16 & 63
            r12 = r12 | r11
            byte r12 = (byte) r12
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r4, (byte) r12)
            r4 = 1
            long r12 = r14 + r4
            r2 = r2 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            com.google.android.gms.internal.firebase_ml.zzya.zza((byte[]) r1, (long) r14, (byte) r2)
            r2 = r3
        L_0x00fb:
            int r2 = r2 + 1
            r3 = 128(0x80, float:1.794E-43)
            r20 = r4
            r4 = r12
            r11 = r20
            goto L_0x0033
        L_0x0106:
            r2 = r3
        L_0x0107:
            com.google.android.gms.internal.firebase_ml.zzyg r0 = new com.google.android.gms.internal.firebase_ml.zzyg
            int r2 = r2 + -1
            r0.<init>(r2, r8)
            throw r0
        L_0x010f:
            if (r14 > r13) goto L_0x0127
            if (r13 > r3) goto L_0x0127
            int r1 = r2 + 1
            if (r1 == r8) goto L_0x0121
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0127
        L_0x0121:
            com.google.android.gms.internal.firebase_ml.zzyg r0 = new com.google.android.gms.internal.firebase_ml.zzyg
            r0.<init>(r2, r8)
            throw r0
        L_0x0127:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r1 = 46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r10)
            r2.append(r13)
            r2.append(r9)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0144:
            int r0 = (int) r4
            return r0
        L_0x0146:
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            int r8 = r8 + -1
            char r0 = r0.charAt(r8)
            int r2 = r2 + r3
            r3 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r10)
            r4.append(r0)
            r4.append(r9)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            r1.<init>(r0)
            goto L_0x016b
        L_0x016a:
            throw r1
        L_0x016b:
            goto L_0x016a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzyf.zzb(java.lang.CharSequence, byte[], int, int):int");
    }

    private static int zza(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return zzyc.zzdx(i);
        }
        if (i2 == 1) {
            return zzyc.zzw(i, zzya.zza(bArr, j));
        }
        if (i2 == 2) {
            return zzyc.zze(i, zzya.zza(bArr, j), zzya.zza(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
