package kotlin.reflect.jvm.internal.impl.protobuf;

import com.google.common.base.Ascii;

final class Utf8 {
    private static int incompleteStateFor(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    private static int incompleteStateFor(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    private static int incompleteStateFor(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i, int i2) {
        return partialIsValidUtf8(bArr, i, i2) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        if (r7[r8] > -65) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007f, code lost:
        if (r7[r8] > -65) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r7[r8] > -65) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L_0x0082
            if (r8 < r9) goto L_0x0005
            return r6
        L_0x0005:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L_0x001c
            r6 = -62
            if (r0 < r6) goto L_0x001b
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            r8 = r6
            goto L_0x0082
        L_0x001b:
            return r2
        L_0x001c:
            r4 = -16
            if (r0 >= r4) goto L_0x0049
            int r6 = r6 >> 8
            r6 = r6 ^ r2
            byte r6 = (byte) r6
            if (r6 != 0) goto L_0x0034
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r6 < r9) goto L_0x0031
            int r6 = incompleteStateFor(r0, r8)
            return r6
        L_0x0031:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x0034:
            if (r6 > r3) goto L_0x0048
            r4 = -96
            if (r0 != r1) goto L_0x003c
            if (r6 < r4) goto L_0x0048
        L_0x003c:
            r1 = -19
            if (r0 != r1) goto L_0x0042
            if (r6 >= r4) goto L_0x0048
        L_0x0042:
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
        L_0x0048:
            return r2
        L_0x0049:
            int r1 = r6 >> 8
            r1 = r1 ^ r2
            byte r1 = (byte) r1
            r4 = 0
            if (r1 != 0) goto L_0x005d
            int r6 = r8 + 1
            byte r1 = r7[r8]
            if (r6 < r9) goto L_0x005b
            int r6 = incompleteStateFor(r0, r1)
            return r6
        L_0x005b:
            r8 = r6
            goto L_0x0060
        L_0x005d:
            int r6 = r6 >> 16
            byte r4 = (byte) r6
        L_0x0060:
            if (r4 != 0) goto L_0x006e
            int r6 = r8 + 1
            byte r4 = r7[r8]
            if (r6 < r9) goto L_0x006d
            int r6 = incompleteStateFor((int) r0, (int) r1, (int) r4)
            return r6
        L_0x006d:
            r8 = r6
        L_0x006e:
            if (r1 > r3) goto L_0x0081
            int r6 = r0 << 28
            int r1 = r1 + 112
            int r6 = r6 + r1
            int r6 = r6 >> 30
            if (r6 != 0) goto L_0x0081
            if (r4 > r3) goto L_0x0081
            int r6 = r8 + 1
            byte r8 = r7[r8]
            if (r8 <= r3) goto L_0x0018
        L_0x0081:
            return r2
        L_0x0082:
            int r6 = partialIsValidUtf8(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.Utf8.partialIsValidUtf8(int, byte[], int, int):int");
    }

    public static int partialIsValidUtf8(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i, i2);
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return incompleteStateFor(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return incompleteStateFor(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }

    private static int incompleteStateFor(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return incompleteStateFor(b);
        }
        if (i3 == 1) {
            return incompleteStateFor(b, bArr[i]);
        }
        if (i3 == 2) {
            return incompleteStateFor((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }
}
