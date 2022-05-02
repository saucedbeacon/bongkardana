package com.google.android.gms.internal.firebase_ml;

final class zzyd extends zzye {
    zzyd() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] > -65) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
        if (r13[r14] > -65) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] > -65) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -1
            r7 = -65
            if (r12 == 0) goto L_0x0085
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0023
            if (r8 < r1) goto L_0x0022
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            r14 = r12
            goto L_0x0085
        L_0x0022:
            return r6
        L_0x0023:
            if (r8 >= r2) goto L_0x004a
            int r12 = r12 >> 8
            r12 = r12 ^ r6
            byte r12 = (byte) r12
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 < r15) goto L_0x0036
            int r12 = com.google.android.gms.internal.firebase_ml.zzyc.zzw(r8, r14)
            return r12
        L_0x0036:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x0039:
            if (r12 > r7) goto L_0x0049
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x0049
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x0049
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
        L_0x0049:
            return r6
        L_0x004a:
            int r9 = r12 >> 8
            r9 = r9 ^ r6
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005e
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 < r15) goto L_0x005b
            int r12 = com.google.android.gms.internal.firebase_ml.zzyc.zzw(r8, r9)
            return r12
        L_0x005b:
            r14 = r12
            r12 = 0
            goto L_0x0061
        L_0x005e:
            int r12 = r12 >> 16
            byte r12 = (byte) r12
        L_0x0061:
            if (r12 != 0) goto L_0x0071
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 < r15) goto L_0x006e
            int r12 = com.google.android.gms.internal.firebase_ml.zzyc.zze(r8, r9, r14)
            return r12
        L_0x006e:
            r10 = r14
            r14 = r12
            r12 = r10
        L_0x0071:
            if (r9 > r7) goto L_0x0084
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L_0x0084
            if (r12 > r7) goto L_0x0084
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 <= r7) goto L_0x001f
        L_0x0084:
            return r6
        L_0x0085:
            if (r14 >= r15) goto L_0x008e
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x008e
            int r14 = r14 + 1
            goto L_0x0085
        L_0x008e:
            if (r14 < r15) goto L_0x0091
            return r3
        L_0x0091:
            if (r14 < r15) goto L_0x0094
            return r3
        L_0x0094:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00ed
            if (r14 >= r5) goto L_0x00a8
            if (r12 < r15) goto L_0x009f
            return r14
        L_0x009f:
            if (r14 < r1) goto L_0x00a7
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r7) goto L_0x0091
        L_0x00a7:
            return r6
        L_0x00a8:
            if (r14 >= r2) goto L_0x00c8
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b3
            int r12 = com.google.android.gms.internal.firebase_ml.zzyc.zzg(r13, r12, r15)
            return r12
        L_0x00b3:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r7) goto L_0x00c7
            if (r14 != r5) goto L_0x00bd
            if (r12 < r4) goto L_0x00c7
        L_0x00bd:
            if (r14 != r0) goto L_0x00c1
            if (r12 >= r4) goto L_0x00c7
        L_0x00c1:
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 <= r7) goto L_0x00ed
        L_0x00c7:
            return r6
        L_0x00c8:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d1
            int r12 = com.google.android.gms.internal.firebase_ml.zzyc.zzg(r13, r12, r15)
            return r12
        L_0x00d1:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r7) goto L_0x00ec
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r14 = r14 + r12
            int r12 = r14 >> 30
            if (r12 != 0) goto L_0x00ec
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r7) goto L_0x00ec
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r7) goto L_0x0091
        L_0x00ec:
            return r6
        L_0x00ed:
            r14 = r12
            goto L_0x0091
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzyd.zzb(int, byte[], int, int):int");
    }

    /* access modifiers changed from: package-private */
    public final String zzh(byte[] bArr, int i, int i2) throws zzvi {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte b = bArr[r13];
                if (!zzyb.zze(b)) {
                    break;
                }
                i = r13 + 1;
                zzyb.zza(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (r13 < i3) {
                int i6 = r13 + 1;
                byte b2 = bArr[r13];
                if (zzyb.zze(b2)) {
                    int i7 = i5 + 1;
                    zzyb.zza(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!zzyb.zze(b3)) {
                            break;
                        }
                        i6++;
                        zzyb.zza(b3, cArr, i7);
                        i7++;
                    }
                    r13 = i6;
                    i5 = i7;
                } else if (zzyb.zzf(b2)) {
                    if (i6 < i3) {
                        zzyb.zza(b2, bArr[i6], cArr, i5);
                        r13 = i6 + 1;
                        i5++;
                    } else {
                        throw zzvi.zztu();
                    }
                } else if (zzyb.zzg(b2)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        zzyb.zza(b2, bArr[i6], bArr[i8], cArr, i5);
                        r13 = i8 + 1;
                        i5++;
                    } else {
                        throw zzvi.zztu();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    byte b4 = bArr[i6];
                    int i10 = i9 + 1;
                    zzyb.zza(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                    r13 = i10 + 1;
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
    public final int zzb(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new zzyg(i7 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(i8);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            } else {
                throw new zzyg(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }
}
